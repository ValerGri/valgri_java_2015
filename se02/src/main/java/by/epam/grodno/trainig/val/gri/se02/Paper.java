package by.epam.grodno.trainig.val.gri.se02;

public class Paper extends Stationery {
	private int quantityOfPaper;
	private int totalPriceOfPaper;
	public Paper(int price,String type, int weigh, int quantityOfPaper )
	{
		super(price,type, weigh );
		this.quantityOfPaper=quantityOfPaper;
	
	}
	public int getQuantityOfPaper() {
		return quantityOfPaper;
	}
	public void setQuantityOfPaper(int quantityOfPaper) {
		this.quantityOfPaper = quantityOfPaper;
	}
	public int getTotalPriceOfPaper() {
		totalPriceOfPaper=quantityOfPaper*super.getPrice();
		return totalPriceOfPaper;
	}
	
	
	
	}