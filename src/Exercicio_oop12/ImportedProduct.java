package Exercicio_oop12;

public class ImportedProduct extends Product{
    private Double customsFee;


    public ImportedProduct() {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String PriceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }
}
