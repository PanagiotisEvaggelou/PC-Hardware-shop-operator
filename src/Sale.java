class Sale{

    private String fullname;
    private String phonenumber;
    private String date;
    private int price;
    private Product product;
    private int salescode;
       
    public Sale (String fn, String pn, String dt, int pr, Product pro)  {
        fullname = fn;
        phonenumber = pn;
        date = dt;
        price = pr;
        product = pro;
        salescode = 0;
    }
    
    String getFullName()  {
        return fullname;
    }
    
    String getPhoneNumber()  {
        return phonenumber;
    }
    
    String getDate() {
        return date;
    }

    int getPrice() {
        return price;
    }

    int getSalesCode() {
        return salescode;
    }

    public Product getProduct() {
        return product;
    }

    public void ModifySalesCode(int theCode){
        salescode = theCode;
    }
    	
    public String SaleDetails() {
        return "Sales Code: "+ getSalesCode() + "\nFull Name: " + getFullName() + "\nPhone Number: " + getPhoneNumber() + "\nDate: " + getDate() + "\nPrice: " + getPrice() + "\n";
    }    

    public String ProductDetails() {
        return SaleDetails() + getProduct().ProductDetails(); 
    }

 

}