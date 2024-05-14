class Product {
	
    private String modelname;
    private int modelyear;
    private String constructor;
    private int price;
    private String producttype;
    private int stocknumber;
    private String productcateg;

    Product(){

    }
       
    public Product (String mn, int my, String c, int p, String pc, String pt, int sn)  {
        modelname = mn;
        modelyear = my;
        constructor = c;
        price = p;
        productcateg = pc;
        producttype = pt;
        stocknumber = sn;
    }
    
    String getName()  {
        return modelname;
    }

    public void setITEMCATEGORY(String CATEG){
        this.productcateg = CATEG;
    }

    public void setITEMTYPE(String TYPE){
        this.producttype = TYPE;
    }

    public void setMODEL(String MODEL){
        this.modelname = MODEL;
    }
    
    public void setMODELYEAR(int MODELYEAR){
        this.modelyear = MODELYEAR;
    }

    public void setMANUFACTURER(String MANUFACTURER){
        this.constructor = MANUFACTURER;
    }

    public void setPRICE(int PRICE){
        this.price = PRICE;
    }

    public void setSTOCK(int STOCK){
        this.stocknumber = STOCK;
    }

    int getYear()  {
        return modelyear;
    }
    
    String getConctructor() {
        return constructor;
    }

    int getPrice() {
        return price;
    }

    String getProductType() {
        return producttype;
    }

    String getProductCateg() {
        return productcateg;
    }

    int getStockNumber() {
        return stocknumber;
    }

    public void ModifyStock(){
        stocknumber = stocknumber - 1;
    }

    public void ModifyOrderStock(){
        stocknumber = stocknumber + 1;
    }    
    	
    public String ProductDetails() {
        return "\nModel Name: "+getName() + "\nModel Year: " + getYear() + "\nConstructor: " + getConctructor() + "\nPrice: "+ getPrice() + "\nProduct Type: " + getProductType() + "\nStock Number: " + getStockNumber();
    }  
	
} 


class Motherboard extends Product {

    private String proccesortype;
    private int memory;
    private int sataportsnumber;

    public Motherboard(String mn, int my, String c, int p, String pc, String pt, int sn, String pst, int m, int spn){
        super(mn ,my ,c , p, pc, pt ,sn);
        proccesortype = pst;
        memory = m;
        sataportsnumber = spn;
    }

    String getProccesorType() {
        return proccesortype;
    }

    int getMemory() {
        return memory;
    }

    int getSataPortsNum() {
        return sataportsnumber;
    }

    public String ProductDetails() {
        return super.ProductDetails() + "\nProccesor Type: "+ getProccesorType() + "\nMemory: " + getMemory() + "\nSata Ports Number: " + getSataPortsNum();
    }
    
}

class HardDrive extends Product{

    private String drivetype;
    private double size;
    private int capacity;

    public HardDrive(String mn, int my, String c, int p, String pc, String pt, int sn, String dt, double s, int ca){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        drivetype = dt;
        size = s;
        capacity = ca;
    }

    String getDriveType() {
        return drivetype;
    }

    double getSize() {
        return size;
    }

    int getCapacity() {
        return capacity;
    }

    public String ProductDetails() {
        return super.ProductDetails() + "\nDrive Type: "+ getDriveType() + "\nSize: " + getSize() + "\nCapacity: " + getCapacity();
    }

}

class MemoryRam extends Product {
     private String Memorytype;
     private int size;
     private int frequency;

    MemoryRam(){
        
    }

     public MemoryRam(String mn, int my, String c, int p, String pc, String pt, int sn,String ty,int si,int fr){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        Memorytype=ty;
        size=si;
        frequency=fr;
     }

    public void setMEMORYTYPE(String MEMORYTYPE){
        this.Memorytype = MEMORYTYPE;
    }

    public void setSIZE(int SIZE){
        this.size = SIZE;
    }

    public void setFREQUENCY(int FREQUENCY){
        this.frequency = FREQUENCY;
    }

    String getType() {
        return Memorytype;
    }

    int getSize() {
        return size;
    }

    int getFrequency() {
        return frequency;
    }
    public String ProductDetails() {
        return super.ProductDetails() + "\nType: "+ getType() + "\nSize: " + getSize() + "\nFrequency: " + getFrequency();
    }

 }
class Processor extends Product{
     private double speed;
     private int numberofcores;
     private String graphics;

     public Processor(String mn, int my, String c, int p, String pc, String pt, int sn,double sp,int co,String gr ){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        speed=sp;
        numberofcores=co;
        graphics=gr;

        
    }

    double getSpeed() {
        return speed;
     }

    int getNumberOfCores() {
        return numberofcores;
    }

    String getGraphics() {
        return graphics;
    }

    public String ProductDetails() {
        return super.ProductDetails() + "\nSpeed: "+ getSpeed() + "\nNumber of cores: " + getNumberOfCores() + "\nGraphics: " + getGraphics();
    }
 }
class Mouse extends Product{
    private String technology;
    private String connection;

    public Mouse(String mn, int my, String c, int p, String pc, String pt, int sn,String te,String con ){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        technology=te;
        connection=con;

    }
    String getTechnology() {
        return technology;
     }

    String getConnection() {
        return connection;
    }


    public String ProductDetails() {
        return super.ProductDetails() + "\nTechnology: "+ getTechnology() + "\nConnection: " + getConnection();
    }

        
}
class Printer extends Product{

    private String Printertype;
    private String Colortype;

    public Printer(String mn, int my, String c, int p, String pc, String pt, int sn, String ct, String Prt){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        Printertype = Prt;
        Colortype=ct;
    }

    String getPrinterType() {
        return Printertype;
    }

    String getColortype() {
        return Colortype;
    }
    public String ProductDetails() {
        return super.ProductDetails() + "\nPrinter Type: "+ getPrinterType() + "\nPrint Type: " + getColortype();
    }

}
class GraphicsCard extends Product{

    private String chipset;
    private int memory;


    public GraphicsCard(String mn, int my, String c, int p, String pc, String pt, int sn, String cp, int m){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        chipset=cp;
        memory=m;
    }

    String getCardType() {
        return chipset;
    }

    int getMemory() {
        return memory;
    }


    public String ProductDetails() {
        return super.ProductDetails() + "\nGgraphics Type: "+ getCardType() + "\nMemory: " + getMemory();
    }

}
class Screen extends Product{

    private String kind;
    private int dimension;
    private String resolution;
    private String port;


    public Screen(String mn, int my, String c, int p, String pc, String pt, int sn, String kd, int dm,String rs,String prt ){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        kind=kd;
        dimension=dm;
        resolution=rs;
        port=prt;
    }

    String getScreenKind() {
        return kind;
    }

    int getDimension() {
        return dimension;
    }

    String getResolution() {
        return resolution;
    }

    String getPort() {
        return port;
    }

    public String ProductDetails() {
        return super.ProductDetails() + "\nScreen Kind: "+ getScreenKind() + "\nDimension: " + getDimension()+ "\nResolution: "+getResolution()+ "\nPort: "+getPort();
    }

}
class Keyboard extends Product{

    private String connection;



    public Keyboard(String mn, int my, String c, int p, String pc, String pt, int sn, String cn){
        super(mn ,my ,c ,p ,pc ,pt ,sn);
        connection=cn;
    }

    String getConnectionType() {
        return connection;
    }

    public String ProductDetails() {
        return super.ProductDetails() + "\nConnection Type: "+ getConnectionType();
    }

}