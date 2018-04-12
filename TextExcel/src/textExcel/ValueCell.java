package textExcel;

public class ValueCell extends RealCell{
	
	private String value;
	
	public ValueCell(String num){	// num set to value and in RealCell
		this.value = num;
		setRealCell(num);

	}
	
	public double getDoubleValue(){
		return Double.parseDouble(getRealCell());
	}

}
