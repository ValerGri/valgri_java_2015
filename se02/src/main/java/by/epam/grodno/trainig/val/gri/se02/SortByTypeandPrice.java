package by.epam.grodno.trainig.val.gri.se02;
import java.util.TreeSet;
import java.util.Comparator;


import by.epam.grodno.trainig.val.gri.se02.Stationery;
public class SortByTypeandPrice implements Comparator <Stationery> {
	public int compare(Stationery o1, Stationery o2) {
		// TODO Auto-generated method stub
		if (o1.getPrice()-o2.getPrice()!=0)
				{
			return o1.getPrice()-o2.getPrice();
			
				}
		else
		{
			return o1.getType().compareTo(o2.getType());
		}
	}
	
	public static void main(String[] args) {
		Collection sortcol =new Collection();
		TreeSet<Stationery> users = new TreeSet<Stationery>(sortcol);
		
		 users.add(new Stationery(100, "For write", 6));
		 users.add(new Paper(100, "Ofice",6, 7));
		 users.add(new Paperclip(5,"Big", 7,8,100));
		 for(Stationery  p : users){
	         
			    System.out.println(p.getPrice()+ "  "+ p.getType());
			}
	
	 
	}

	

	

	
	 }
	 
	 

