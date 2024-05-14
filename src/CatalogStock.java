
import java.util.*;

public class CatalogStock {
	
	public ArrayList <Product> InStProd = new ArrayList <Product>();    
    public ArrayList <String> Num = new ArrayList <String>(); 

    Scanner in = new Scanner(System.in);

    int a;

    int c = 0;

    String d = "";
    String str;
			
	public void addProduct(Product p){
		InStProd.add (p);
	}

    public void lookUp1 (String theType, String theCateg) {
        Num.clear();
        c = 0;
        System.out.println ("\n>------------List of Products--------------<\n");
		for (Product p:InStProd){
			if ((p.getProductType().equals(theType)) && (p.getProductCateg().equals(theCateg))){
                c++;
                Num.add(Integer.toString(c) + "." + " " + p.getName());
                System.out.println (Num.get(c-1));
                System.out.println("");
            }
        }
        System.out.println   (">------------------------------------------<\n");
	}

    public int lookUp2 (String theName) {

        System.out.println ("\n>------------Product Details--------------<");
		for (Product p:InStProd){
			if (p.getName().equals(theName)){
				System.out.println (p.ProductDetails());
                System.out.println("");

                a = InStProd.indexOf(p);

            }
        }
        System.out.println (">-----------------------------------------<\n");
        return a;
	}

    public int ReturnStock (int theIndex){
        return InStProd.get(theIndex).getStockNumber();
    }

    public void ModifyStock (int theIndex){
        InStProd.get(theIndex).ModifyStock();
    }

    public void ModifyOrderStock (int theIndex){
        InStProd.get(theIndex).ModifyOrderStock();
    }

    public int ReturnPrice (int theIndex){
        return InStProd.get(theIndex).getPrice();
    }

    public Product ReturnProduct(int theIndex){
        return InStProd.get(theIndex);
    }

    public String ReturnName(String theName){
        for (String s:Num){
            if(s.substring(0,1).equals(theName)){
                str = s.substring(s.indexOf(" ") + 1);
            }
        }
        return str;
    }

    public ArrayList<Product> ReturnInStProd(){
        return InStProd;
    }

} // class phoneBook
