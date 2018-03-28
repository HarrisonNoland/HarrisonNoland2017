package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	private Cell[][] boxes;
	public Spreadsheet() {
	 boxes = new Cell[20][12];
	}


		@Override
		public String processCommand (String command)
		{
			// TODO Auto-generated method stub
			return "";
		}

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
		public Cell getCell(Location place )
		{
			return boxes[place.getRow()][place.getCol()];
			// TODO Auto-generated method stub
			
		}

		@Override
		
		public String getGridText (){
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