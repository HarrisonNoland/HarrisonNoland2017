package textExcel;

// Update this file with your own code.

public class Spreadsheet implements textExcel.Grid {
	private Cell[][] boxes;
	public Spreadsheet() {
		boxes = new Cell[20][12];
	}


	@Override
	public String processCommand (String command)
	{
		// TODO Auto-generated method stub
		if(command.equalsIgnoreCase("clear")) { //for loop to create spreadsheet 20x12
			for(int i = 0;i<boxes.length;i++) {
				for(int k = 0; k<boxes[i].length;k++) {
					boxes[i][k]= new EmptyCell();
				}
			}
			return getGridText();
		}else if(command.contains("=")) {
			assignCell(command);
			return getGridText();
		}else if(command.length()==2||command.length()==3) {
			Location position = new SpreadsheetLocation(command);
			return inspectCell(position);
			//clear cell
		}else if (command.toLowerCase().contains("clear")&& command.length()>5){
			Location position=new SpreadsheetLocation(command.substring(6));
			clearCell(position);
			return getGridText();
		}else {
			return "";
		}
	}
	public String inspectCell(Location loc) {
		return getCell(loc).fullCellText();
	}
	public String assignCell(String input) {
		String[] assignment=input.split("=", 2);
		Location loc=new SpreadsheetLocation(assignment[0].substring(0,assignment[0].indexOf(" ")));
		if(assignment[1].contains("\"")) {
			boxes[loc.getRow()][loc.getCol()]=new textExcel.TextCell(assignment[1].substring(1));
		}else if(assignment[1].contains("(")&&assignment[1].contains(")")){

		}else {
			boxes[loc.getRow()][loc.getCol()]=new textExcel.ValueCell(assignment[1].substring(1));
		}

		return getGridText();

	}
	public String clear() {
		for (int i=0;i<boxes.length;i++) {
			for (int j=0; j<boxes[i].length;j++) {
				boxes[i][j]=new EmptyCell();
			}
		}
		return getGridText();
	}
	public String clearCell(Location) {
		boxes[loc.getRow()][loc.getCol()]=new EmptyCell();
		return getGridText();
		@Override
		public int getRows ()
		{
			// TODO Auto-generated method stub
			return 20;
		}

		@Override
		public int getCols ()
		{
			// TODO Auto-generated method stub
			return 12;
		}

		@Override
		public Cell getCell(Location )
		{
			return boxes[place.getRow()][place.getCol()];
			// TODO Auto-generated method stub

		}

		@Override

		public String getGridText() {
			String product = "";
			product += "   |";
			for(int i = 65; i<=76; i++) {
				product +=(char)i;
				for (int j=0;j<9;j++) {
					product += "";
				}
				product += "|";
			}// TODO Auto-generated method stub
			product +="/n";

			for(int d=1;d<20;d++) {
				if (d <10) {
					product += d+"  ";
				}else {
					product += d+" ";
				}
				product +="|";
			}
			for(int l=0;l<12;l++) {
				product+=boxes [d-1][l].abbreviatedCellText();
				product+="|";
			}
			product+="/n";

			return product;
		}
	}
