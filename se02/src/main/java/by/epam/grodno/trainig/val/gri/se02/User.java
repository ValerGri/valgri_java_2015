package by.epam.grodno.trainig.val.gri.se02;


import by.epam.grodno.trainig.val.gri.se02.Stationery;
public class User  {
private static 	int quantityPaper=10;
private	static int quantityPen;
private static	int quantityPaperclip;
public static void main(String[] args) {


// цена, тип, вес, количество
	Paper p1 = new Paper(10, " Ofice", 8, quantityPaper);
	
	System.out.println(" Цена бумаги у работника " + p1.getTotalPriceOfPaper());
	
	//цена, тип, вес, размер, количество
	
	Paperclip clip =new Paperclip(7, "Крупная", 1, 10, 150);
	
	System.out.println(" Цена скрепок у работника " + clip.getTotalpriceOfPaperclip());
	//цена, тип, вес, работоспособность, количество
	SE02Pen pen=new SE02Pen(4, "Мягкий", 1, true, 50  );
	System.out.println(" Цена карандашей у работника " + pen.getTotalpriceOfpen());
	
	
}




}
