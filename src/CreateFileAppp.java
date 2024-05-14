
import java.util.*;
import java.io.*;

public class CreateFileAppp {
	
	
	public void CreateFile (ArrayList<Order> OrdersProd) {
		
		System.out.println("\n>>>>>>> Writing data from ORDERS to FILE : products3.txt");
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("products3.txt"));


			writer.write ("ORDERLIST"+"\n"+"{"+"\n");
			for (Order order:OrdersProd){

				writer.write ("\t"+"ORDER"+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"Order Code: "+ order.getOrderCode()
								+ "\n"+"\t"+"\t"+"Order Condition: "+ order.getCondition()
								+ "\n"+"\t"+"\t"+"Full Name: "	+ order.getFullName()
								+ "\n"+"\t"+"\t"+"Phone Number: "	+ order.getPhoneNumber()
								+ "\n"+"\t"+"\t"+"Date: " + order.getDate()
                                + "\n"+"\t"+"\t"+"Arrival Date: " + order.getArDate()
                                + "\n"+"\t"+"\t"+"Price: " + order.getPrice()
								+ "\n"+"\t"+"}"+"\n");
								
            }
			writer.write("}"+"\n");
			writer.close();
				
		}//try
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}
	}
	
	public void PrintFile(){
		
		System.out.println("\n---- Printing File... ----\n");
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("products3.txt")));
			String line = reader.readLine();
			while (line!=null){
				System.out.println(line);
				line = reader.readLine();
			}//dvd
			reader.close();
				
		}//try
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}	
	} // PrintFile			
	
}