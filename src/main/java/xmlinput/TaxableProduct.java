package xmlinput;

public class TaxableProduct extends Product{

    // From previous assignment
    public TaxableProduct(String productName, String ISBN, double unitPrice){

    }


    // Implement values() method
    @override
    public abstract value(){
        double preTax = super.getPrice();
        return pretax + this.getSalesTax(preTax);
    }

}
