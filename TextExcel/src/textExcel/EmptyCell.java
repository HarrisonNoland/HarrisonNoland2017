//Harrison Noland
//4/12/18
package textExcel;

public class EmptyCell implements Cell {
	private String text;
	public EmptyCell() {
		this.text="";
	}
	public String abbreviatedCellText() {
		return "";
	}
	public String fullCellText() {
	return "";
}
}
