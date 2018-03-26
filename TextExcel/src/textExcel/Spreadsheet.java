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
		public String getGridText ()
		{
			// TODO Auto-generated method stub
			return null;
		}

	}
