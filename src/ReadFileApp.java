
import java.util.*;
import java.io.*;

class ReadFileApp {

    private String TYPEITEM;
    private String ITEMCATEGORY = "NONE";
    private String NAMEMODEL;
    private int MODELYEAR = -1;
    private String MANUFACTURER = "NONE";
    private int PRICE;
    private int STOCK = -1; 
    private int A = 0; 
    private String PROCCESORTYPE = "NONE";
    private int RAMMEMORY = -1;
    private int SATAPORTSNUMBER = -1;
    private String DRIVETYPE = "NONE";
    private double SIZE = -1;
    private int CAPACITY = -1;
    private String TYPEMEMORY = "NONE";
    private int MEMORYSIZE = -1;
    private int FREQUENCY = -1;
    private double SPEED = -1;
    private int NUMBEROFCORES = -1;
    private String GRAPHICS = "NONE";
    private String MOUSETECHNOLOGY = "NONE";
    private String MOUSECONNECTION = "NONE";
    private String PRINTERTYPE = "NONE";
    private String COLORTYPE = "NONE";
    private String CHIPSET = "NONE";
    private int CARDMEMORY = -1;
    private String KIND = "NONE";
    private int DIMENSION = -1;
    private String RESOLUTION = "NONE";
    private String PORT = "NONE";
    private String KEYBCONNECTION = "NONE";
    

	public void ReadFile(ArrayList<Product> Stock){
		
		BufferedReader reader = null;
		Product product = null;
        String line;
		System.out.println("\n>>>>>>> Reading data from FILE : products2.txt");
        try {
			reader = new BufferedReader(new FileReader(new File("products2.txt")));
            line = reader.readLine();
                if (line.trim().equals("ITEMLIST")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        while (line.trim().equals("ITEM")) {
                                TYPEITEM = "NONE";
                                ITEMCATEGORY = "NONE";
                                NAMEMODEL = "NONE";
                                MODELYEAR = -1;
                                MANUFACTURER = "NONE";
                                PRICE = -1;
                                STOCK = -1; 
                                A = 0; 
                                PROCCESORTYPE = "NONE";
                                RAMMEMORY = -1;
                                SATAPORTSNUMBER = -1;
                                DRIVETYPE = "NONE";
                                SIZE = -1;
                                CAPACITY = -1;
                                TYPEMEMORY = "NONE";
                                MEMORYSIZE = -1;
                                FREQUENCY = -1;
                                SPEED = -1;
                                NUMBEROFCORES = -1;
                                GRAPHICS = "NONE";
                                MOUSETECHNOLOGY = "NONE";
                                MOUSECONNECTION = "NONE";
                                PRINTERTYPE = "NONE";
                                COLORTYPE = "NONE";
                                CHIPSET = "NONE";
                                CARDMEMORY = -1;
                                KIND = "NONE";
                                DIMENSION = -1;
                                RESOLUTION = "NONE";
                                PORT = "NONE";
                                KEYBCONNECTION = "NONE";
                                line = reader.readLine();
                                if (line.trim().equals("{")) {

                                    while (line.trim().equals("}") == false) {
                                        line = reader.readLine();

                                        if (line.trim().startsWith("TYPEITEM")) {
                                            TYPEITEM = line.trim().substring(9).trim();
                                            A=A+20;
                                        }
                                        if (line.trim().startsWith("ITEMCATEGORY")) {
                                            ITEMCATEGORY = line.trim().substring(13).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("NAMEMODEL")) {
                                            NAMEMODEL = line.trim().substring(10).trim();
                                            A=A+20;
                                        }
                                        if (line.trim().startsWith("MODELYEAR")) {
                                            MODELYEAR = Integer.parseInt(line.trim().substring(10).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("STOCK")) {
                                            STOCK = Integer.parseInt(line.trim().substring(6).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("PRICE")) {
                                            PRICE = Integer.parseInt(line.trim().substring(6).trim());
                                            A=A+20;
                                        }
                                        if (line.trim().startsWith("MANUFACTURER")) {
                                            MANUFACTURER = line.trim().substring(13).trim();
                                            A++;
                                        }


                                        if (line.trim().startsWith("PROCCESORTYPE")) {
                                            PROCCESORTYPE = line.trim().substring(14).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("RAMMEMORY")) {
                                            RAMMEMORY = Integer.parseInt(line.trim().substring(10).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("DRIVETYPE")) {
                                            DRIVETYPE = line.trim().substring(10).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("SATAPORTSNUMBER")) {
                                            SATAPORTSNUMBER = Integer.parseInt(line.trim().substring(16).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("SIZE")) {
                                            SIZE = Double.parseDouble(line.trim().substring(5).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("CAPACITY")) {
                                            CAPACITY = Integer.parseInt(line.trim().substring(9).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("TYPEMEMORY")) {
                                            TYPEMEMORY = line.trim().substring(11).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("MEMORYSIZE")) {
                                            MEMORYSIZE = Integer.parseInt(line.trim().substring(11).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("FREQUENCY")) {
                                            FREQUENCY = Integer.parseInt(line.trim().substring(10).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("SPEED")) {
                                            SPEED = Double.parseDouble(line.trim().substring(5).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("NUMBEROFCORES")) {
                                            NUMBEROFCORES = Integer.parseInt(line.trim().substring(14).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("GRAPHICS")) {
                                            GRAPHICS = line.trim().substring(9).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("MOUSETECHNOLOGY")) {
                                            MOUSETECHNOLOGY = line.trim().substring(16).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("MOUSECONNECTION")) {
                                            MOUSECONNECTION = line.trim().substring(16).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("PRINTERTYPE")) {
                                            PRINTERTYPE = line.trim().substring(12).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("COLORTYPE")) {
                                            COLORTYPE = line.trim().substring(10).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("CHIPSET")) {
                                            CHIPSET = line.trim().substring(8).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("CARDMEMORY")) {
                                            CARDMEMORY = Integer.parseInt(line.trim().substring(11).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("KIND")) {
                                            KIND = line.trim().substring(5).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("DIMENSION")) {
                                            DIMENSION = Integer.parseInt(line.trim().substring(10).trim());
                                            A++;
                                        }
                                        if (line.trim().startsWith("RESOLUTION")) {
                                            RESOLUTION = line.trim().substring(11).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("PORT")) {
                                            PORT = line.trim().substring(5).trim();
                                            A++;
                                        }
                                        if (line.trim().startsWith("KEYBCONNECTION")) {
                                            KEYBCONNECTION = line.trim().substring(15).trim();
                                            A++;
                                        }
                                    }
                                    
                                    if (A<60){
                                        System.out.println("\nThere are important product tags missing, a product didn't got added to the list");
                                    }
                                    else{
                                        if (TYPEITEM.equals("Motherboard")) {
                                            product = new Motherboard(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,PROCCESORTYPE,RAMMEMORY,SATAPORTSNUMBER);
                                        } 
                                        if (TYPEITEM.equals("HardDrive")) {
                                            product = new HardDrive(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,DRIVETYPE,SIZE,CAPACITY);
                                        }    
                                        if (TYPEITEM.equals("MemoryRam")) {
                                            product = new MemoryRam(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,TYPEMEMORY,MEMORYSIZE,FREQUENCY);
                                        }                  
                                        if (TYPEITEM.equals("Processor")) {
                                            product = new Processor(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,SPEED,NUMBEROFCORES,GRAPHICS);
                                        }
                                        if (TYPEITEM.equals("Mouse")) {
                                            product = new Mouse(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,MOUSETECHNOLOGY,MOUSECONNECTION);
                                        }
                                        if (TYPEITEM.equals("Printer")) {
                                            product = new Printer(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,PRINTERTYPE,COLORTYPE);
                                        }
                                        if (TYPEITEM.equals("GraphicsCard")) {
                                            product = new GraphicsCard(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,CHIPSET,CARDMEMORY);
                                        }
                                        if (TYPEITEM.equals("Screen")) {
                                            product = new Screen(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,KIND,DIMENSION,RESOLUTION,PORT);
                                        }
                                        if (TYPEITEM.equals("Keyboard")) {
                                            product = new Keyboard(NAMEMODEL ,MODELYEAR,MANUFACTURER,PRICE,ITEMCATEGORY,TYPEITEM,STOCK,KEYBCONNECTION);
                                        }
                                        Stock.add(product);
                                    }
                                        
                                }
                        
                        line = reader.readLine();
                        }//while
			            reader.close();
                    }
                } //Product
			
		} //try

		catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
	
	} // ReadFile
	
	public void PrintList (ArrayList<Product> Stock){
		System.out.println("\n >>>>>>> Printing List... \n");
		for (Product product:Stock)
			System.out.println(product.ProductDetails());
	} // PrintList
	

}