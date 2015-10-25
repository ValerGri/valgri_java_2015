package by.epam.grodno.trainig.val.gri.se02;

public class Paperclip extends Stationery {
	private int quantityOfPaperclip;
	private int sizeOfPaperclip;
	private int totalpriceOfPaperclip;
	public Paperclip(int price,String type, int weigh,  int sizeOfPaperclip, int quantityOfPaperclip )
	{
		super(price,type, weigh );
		this.quantityOfPaperclip=quantityOfPaperclip;
		this.sizeOfPaperclip=sizeOfPaperclip;
		
	}
	public int getQuantityOfPaperclip() {
		return quantityOfPaperclip;
	}
	
	
	public int getTotalpriceOfPaperclip() {
		totalpriceOfPaperclip=quantityOfPaperclip*super.getPrice();
		return totalpriceOfPaperclip;
	}
	
	
	public void setQuantityOfPaperclip(int quantityOfPaperclip) {
		this.quantityOfPaperclip = quantityOfPaperclip;
	}
	public int getSizeOfPaperclip() {
		return sizeOfPaperclip;
	}
	public void setSizeOfPaperclip(int sizeOfPaperclip) {
		this.sizeOfPaperclip = sizeOfPaperclip;
	}
	
}
