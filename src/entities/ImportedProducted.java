package entities;

public class ImportedProducted extends Product{
   public  Double customsFee;


public ImportedProducted(String name, Double price, Double customsFee) {
    super(name, price);
    this.customsFee = customsFee;
}


public Double getCustomsFee() {
    return customsFee;
}


public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
}


@Override
public  String priceTag(){


    return "(Imported- )" + super.name + " " + super.price.toString()+ " " + customsFee.toString();
}

public Double totalPrice(){
    return customsFee;
}
}
