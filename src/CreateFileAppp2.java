

import java.util.*;
import java.io.*;

public class CreateFileAppp2 {
	
	
	public void CreateFile (ArrayList<Sale> SalesProd) {
		
		System.out.println("\n>>>>>>> Writing data from SALES to FILE : products4.txt");
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("products4.txt"));


			writer.write ("SALESLIST"+"\n"+"{"+"\n");
			for (Sale sale:SalesProd){

				writer.write ("\t"+"SALE"+"\n"+"\t"+"{"+"\n"+"\t"+"\t"+"Sales Code: "+ sale.getSalesCode()
								+ "\n"+"\t"+"\t"+"Full Name: "	+ sale.getFullName()
								+ "\n"+"\t"+"\t"+"Phone Number: "	+ sale.getPhoneNumber()
								+ "\n"+"\t"+"\t"+"Date: " + sale.getDate()
                                + "\n"+"\t"+"\t"+"Price: " + sale.getPrice()
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
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("products4.txt")));
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