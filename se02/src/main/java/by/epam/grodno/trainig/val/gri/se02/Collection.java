package by.epam.grodno.trainig.val.gri.se02;
import java.util.TreeSet;
import java.util.Comparator;


import by.epam.grodno.trainig.val.gri.se02.Stationery;
public class Collection implements Comparator <Stationery> {
	public int compare(Stationery o1, Stationery o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}
	
	public static void main(String[] args) {
		Collection sortcol =new Collection();
		TreeSet<Stationery> users = new TreeSet<Stationery>(sortcol);
		
		 users.add(new Stationery(100, "Письменные", 6));
		 users.add(new Paper(5, "Офисная",6, 7));
		 users.add(new Paperclip(75,"Большая", 7,8,100));
		 for(Stationery  p : users){
	         
			    System.out.println(p.getPrice());
			}
	
	 
	}

	

	

	
	 }
	 
	 

