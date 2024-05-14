
/* Omada xrhstvn 077
   Arithmoi mhtrvou:
   p3210266
   p3210048
   p3210266

*/
import java.util.*;

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  

class mainApp {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 

        CatalogStock Stock = new CatalogStock();
        CatalogSales Sales = new CatalogSales();
        CatalogOrders Orders = new CatalogOrders();

        String answer, answer2, name, fullname, phonenumber, Condition;
        String ardate = " ";
        String space = " ";
        String type = " ";
        String categ = " ";
        boolean bool, done = false;
        int Index, price, Salescode, Orderscode, num, num2, days1, months1, years1, days2, months2, years2;
        int b = 0;

        Salescode = 0;
        Orderscode = 0;

        ReadFileApp app3 = new ReadFileApp ();
		app3.ReadFile(Stock.ReturnInStProd());

        while ( ! done)	{

            System.out.println("\n1. Products Overview");
   	 	    System.out.println("2. Orders Overview");
   	 	    System.out.println("3. Sales Overview");
   	 	    System.out.println("0. Exit\n");
            System.out.println("Choose action(0-3): ");
            System.out.print("> ");
   	 	    answer = in.nextLine();

            if (answer.equals("1")){
                System.out.println("\nChoose category(1-2): ");
                System.out.println("\n1.Component");
                System.out.println("\n2.Periphereal");

                b = 0;

                while (b==0){
                    System.out.print("\n> ");
                    categ = in.nextLine();
                    if (categ.equals("1")){
                        categ = "Component";
                        System.out.println("\nChoose type(1-5): ");
                        System.out.println("\n1.Motherboard");
                        System.out.println("\n2.HardDrive");
                        System.out.println("\n3.MemoryRam");
                        System.out.println("\n4.GraphicsCard");
                        System.out.println("\n5.Processor");
                        b = 1;
                    }
                    else if (categ.equals("2")){
                        categ = "Periphereal";
                        System.out.println("\nChoose type(1-4): ");
                        System.out.println("\n1.Keyboard");
                        System.out.println("\n2.Screen");
                        System.out.println("\n3.Mouse");
                        System.out.println("\n4.Printer");                        
                        b = 1;
                    }
                    else{
                        System.out.println("\nWrong category, choose again: ");
                    }                    
                }

                b = 0;

                while (b==0){
                    System.out.print("\n> ");
                    type = in.nextLine();
                    if (categ.equals("Component")){
                        if (type.equals("1")) {
                            type = "Motherboard";
                            b = 1;
                        }
                        else if (type.equals("2")){
                            type = "HardDrive";
                            b = 1;
                        }
                        else if (type.equals("3")){
                            type = "MemoryRam";
                            b = 1;
                        }
                        else if (type.equals("4")){
                            type = "GraphicsCard";
                            b = 1;
                        } 
                        else if (type.equals("5")){
                            type = "Processor";
                            b = 1;
                        }
                        else{
                            System.out.println("\nWrong type, choose again: ");
                        }
                    }
                    else if(categ.equals("Periphereal")){
                        if (type.equals("1")){
                            type = "Keyboard";
                            b = 1;
                        }
                        else if (type.equals("2")){
                            type = "Screen";
                            b = 1;
                        }
                        else if (type.equals("3")){
                            type = "Mouse";
                            b = 1;
                        }
                        else if (type.equals("4")){
                            type = "Printer";
                            b = 1;
                        }
                        else{
                            System.out.println("\nWrong type, choose again: ");
                        }
                    }                   
                }                

                Stock.lookUp1(type,categ);
                System.out.println("Choose Product: ");
                System.out.print("> ");
                name = in.nextLine();

                name = Stock.ReturnName(name);
                System.out.println(name);

                Index = Stock.lookUp2(name);
                if (Stock.ReturnStock(Index) > 0){
                    System.out.println("Do you want to sell this product?(Y/N): ");
                    System.out.println("\n1.Yes");
                    System.out.println("\n2.No");
                    System.out.print("\n> ");
                    answer2 = in.nextLine();

                    if (answer2.equals("1")){
                        System.out.println("\nEnter client's full name: ");
                        System.out.print("> ");
                        fullname = in.nextLine();
                        System.out.println("\nEnter client's phone number: ");
                        System.out.print("> ");
                        phonenumber = in.nextLine(); 
                        price = Stock.ReturnPrice(Index);
                        System.out.println("\n>> Price without discount: " + price);
                        price = price - price*25/100;
                        System.out.println("\n>> Price with discount 25%: " + price);
                        Date strDate = new Date();  
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                        String date = formatter.format(strDate);
                        Stock.ModifyStock(Index);
                        Sale Sold = new Sale(fullname,phonenumber,date,price,Stock.ReturnProduct(Index));
                        Sales.addProduct(Sold);
                        Index = Sales.lookUp2(name);
                        Salescode++;
                        Sales.ModifySalesCode(Index,Salescode);
                        Sales.SaleDetails(Index);
                    }
                }
                else{
                    System.out.println("Do you want to order this product?(Y/N): ");
                    System.out.println("\n1.Yes");
                    System.out.println("\n2.No");
                    System.out.print("\n> ");
                    answer2 = in.nextLine();
                    if (answer2.equals("1")){
                        System.out.println("\nEnter client's full name: ");
                        System.out.print("> ");
                        fullname = in.nextLine();
                        System.out.println("\nEnter client's phone number: ");
                        System.out.print("> ");
                        phonenumber = in.nextLine();
                        Date strDate = new Date();  
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                        String date = formatter.format(strDate);

                        days2 = Integer.parseInt(date.substring(0,2));
                        months2 = Integer.parseInt(date.substring(3,5));
                        years2 = Integer.parseInt(date.substring(6,10));
                        
                        //System.out.println("\n" + days + "  " + months + "  " + years + "\n");
                        bool = false;
                        while( ! bool){
                            System.out.println("\nEnter" + space + "order arrival date(dd/mm/yyyy): ");
                            System.out.print("> ");

                            ardate = in.nextLine();
                            space = " correct ";
                            days1 = Integer.parseInt(ardate.substring(0,2));
                            months1 = Integer.parseInt(ardate.substring(3,5));
                            years1 = Integer.parseInt(ardate.substring(6,10));
                            if (years1 >= years2){
                                if (months1 >= months2){
                                    if (days1 >= days2){
                                        bool = true;
                                    }
                                }
                            }
                        }
                        price = Stock.ReturnPrice(Index);
                        System.out.println("\n>> Price without discount: " + price);
                        price = price - price*25/100;
                        System.out.println("\n>> Price with discount 25%: " + price);
                        Order Ordered = new Order(fullname,phonenumber,date,ardate,price,Stock.ReturnProduct(Index));
                        Orders.addProduct(Ordered);
                        Index = Orders.lookUp2(name);
                        Orderscode++;
                        Orders.ModifyOrderCode(Index,Orderscode);
                        Condition = "Due";
                        Orders.ModifyCondition(Index,Condition);
                        Orders.OrderDetails(Index);
                    }
                }

            }
            else if (answer.equals("2")){
                num = Orders.OrdersOverview();
                if (num>0){
                    System.out.println("Do you want to choose order's code to see details?(Y/N)");
                    System.out.println("\n1.Yes");
                    System.out.println("\n2.No");
                    System.out.print("\n> ");
                    answer2 = in.nextLine();

                    if (answer2.equals("1")){
                        System.out.println("\nEnter order's code: ");
                        System.out.print("> ");
                        answer2 = in.nextLine();
                        num2 = Integer.parseInt(answer2)-1;

                        System.out.println(" ");

                        System.out.println(Orders.ReturnDetails(num2));

                        System.out.println("\nDo you want for the order to arrive and complete the sale?(Y/N)");
                        System.out.println("\n1.Yes");
                        System.out.println("\n2.No");
                        System.out.print("\n> ");
                        answer2 = in.nextLine();

                        if (answer2.equals("1")){

                            Condition = "Completed";
                            Orders.ModifyCondition(num2,Condition);

                            Sale Sold = new Sale(Orders.ReturnOrder(num2).getFullName(),Orders.ReturnOrder(num2).getPhoneNumber(),Orders.ReturnOrder(num2).getDate(),Orders.ReturnOrder(num2).getPrice(),Orders.ReturnOrder(num2).getProduct());
                            Sales.addProduct(Sold);
                            Index = Sales.lookUp2(Orders.ReturnOrderProduct(num2).getName());
                            Salescode++;
                            Sales.ModifySalesCode(Index,Salescode);

                            Sales.SaleDetails(Index);

                        }
                    }
                }
            }
            else if (answer.equals("3")){
                Sales.SalesOverview();    
            }        
            else if (answer.equals("0")){
                CreateFileAppp app = new CreateFileAppp ();
                app.CreateFile(Orders.ReturnOrdersProd());

                CreateFileAppp2 app2 = new CreateFileAppp2 ();
                app2.CreateFile(Sales.ReturnSalesProd());
                done = true;
            }
            
        
        }
        

    }
		
}