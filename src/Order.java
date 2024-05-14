class Order{

    private String fullname;
    private String phonenumber;
    private String date;
    private String ardate;
    private int price;
    private Product product;
    private int ordercode;
    private String condition;
       
    public Order (String fn, String pn, String dt, String adt, int pr, Product pro)  {
        fullname = fn;
        phonenumber = pn;
        date = dt;
        ardate = adt;
        price = pr;
        product = pro;
        ordercode = 0;
        condition = "None";
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

    String getArDate() {
        return ardate;
    }

    int getPrice() {
        return price;
    }

    int getOrderCode() {
        return ordercode;
    }

    String getCondition(){
        return condition;
    }

    public Product getProduct() {
        return product;
    }

    public void ModifyCondition(String theCond){
        condition = theCond;
    }

    public void ModifyOrderCode(int theCode){
        ordercode = theCode;
    }

    public String OrderDetails() {
        return "Order Code: "+ getOrderCode() + "\nOrder Condition: " + getCondition() + "\nFull Name: " + getFullName() + "\nPhone Number: " + getPhoneNumber() + "\nDate: " + getDate() + "\nArrival Date: " + getArDate() + "\nPrice: " + getPrice() + "\n"; 
    }
    	
    public String ProductDetails() {
        return OrderDetails() + getProduct().ProductDetails(); 
    }

}