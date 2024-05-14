
import java.util.*;

public class CatalogSales {

    public ArrayList <Sale> SalesProd = new ArrayList <Sale>();

    int a;

	public void addProduct(Sale p){
		SalesProd.add (p);
	}    

    public void SaleDetails (int theIndex) {
        System.out.println ("\n>------------Sale Details--------------<\n");
	    System.out.println(SalesProd.get(theIndex).ProductDetails());                                   
        System.out.println ("\n>--------------------------------------<\n");		
    }

    public void SalesOverview () {
        System.out.println ("\n>------------Sales Overview--------------<\n");
	    for (Sale p:SalesProd){
	    	System.out.println (p.SaleDetails());	
        }		
	    System.out.println (">>Number of Sales : " + SalesProd.size());
        System.out.println ("\n>----------------------------------------<\n");
    }

    public int lookUp2 (String theName) {

		for (Sale p:SalesProd){
			if (p.getProduct().getName().equals(theName)){

                a = SalesProd.indexOf(p);

            }
        }
        return a;
	}

    public void ModifySalesCode (int theIndex, int theCode){
        SalesProd.get(theIndex).ModifySalesCode(theCode);
    }

    public ArrayList<Sale> ReturnSalesProd(){
        return SalesProd;
    }

} // class phoneBook