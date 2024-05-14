
import java.util.*;

public class CatalogOrders {

    public ArrayList <Order> OrdersProd = new ArrayList <Order>();

    int a;

	public void addProduct(Order p){
		OrdersProd.add (p);
	}    

    public void OrderDetails (int theIndex) {
        System.out.println ("\n>------------Order Details--------------<\n");
        System.out.println(OrdersProd.get(theIndex).ProductDetails());  
        System.out.println ("\n>---------------------------------------<\n");
    }

    public int OrdersOverview () {
        System.out.println ("\n>------------Orders Overview--------------<\n");
	    for (Order p:OrdersProd){
	    	System.out.println (p.OrderDetails());	
        }		
	    System.out.println (">>Number of Orders : " + OrdersProd.size());
        System.out.println ("\n>-----------------------------------------<\n");
        return OrdersProd.size();
    }

    public int lookUp2 (String theName) {

		for (Order p:OrdersProd){
			if (p.getProduct().getName().equals(theName)){

                a = OrdersProd.indexOf(p);

            }
        }
        return a;
	}

    public void ModifyOrderCode (int theIndex, int theCode){
        OrdersProd.get(theIndex).ModifyOrderCode(theCode);
    }

    public void ModifyCondition (int theIndex, String theCond){
        OrdersProd.get(theIndex).ModifyCondition(theCond);
    } 

    public String ReturnDetails(int theIndex){
        return OrdersProd.get(theIndex).ProductDetails();
    }

    public Product ReturnOrderProduct(int theIndex){
        return OrdersProd.get(theIndex).getProduct();
    }

    public Order ReturnOrder(int theIndex){
        return OrdersProd.get(theIndex);
    }

    public ArrayList<Order> ReturnOrdersProd(){
        return OrdersProd;
    }

} // class phoneBook