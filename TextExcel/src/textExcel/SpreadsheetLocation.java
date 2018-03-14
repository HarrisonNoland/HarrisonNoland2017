package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location{
      
    	private char col; 
        private String row;  
    
        @Override
        public int getRow() {
        return Integer.parseInt(row)-1;

        // TODO Auto-generated method stub
        
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return (Character.toLowerCase(col)-'a');
    }
    
    public SpreadsheetLocation(String cellName)
    { // TODO: Fill this out with your own code
    	col = cellName.charAt(0);
    	row = cellName.substring(1, cellName.length());
    }

}