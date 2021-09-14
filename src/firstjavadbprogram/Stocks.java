package firstjavadbprogram;

/**
 *
 * @author archanbhattarai
 */
public class Stocks {
    private final String stock;
    private double unitPrice;

    public Stocks(String stock,double unitPrice) {
        this.stock = stock;
        this.unitPrice= unitPrice;
    }
    
    public double getunitPrice(){
        return this.unitPrice;
    }
    
    public String getstockName(){
        return this.stock;
    }
    
    public void setunitPrice(double newPrice) {
        this.unitPrice = newPrice;
    }
}
