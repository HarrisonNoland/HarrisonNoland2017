package textExcel;

public class TextCell implements Cell{
	private String text;
	public TextCell(String input) {
		this.text= input;
	}
	public fullCellText(String text) {
		return text;
	}
	public String abbreviatedCellText() {
			if(text.contains("/"")){
					if(text.length()<12) {
						String print = text.substring(1,text.length()-1);//goes from 1st index to last-1
						for(int i=0;i<(12-text.length();i++){
							print= print +" ";
						}
						return print;
		}else { 
						return text.substring(1, 11);
						
	}else {
		return text.substring(0,10);
			}
				}
}
		