package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class usedProduct extends Product{
    Date manufactoringData;

    public usedProduct(String name, Double price, Date manufactoringData) {
        super(name, price);
        this.manufactoringData = manufactoringData;
    }

    public Date getManufactoringData() {
        return manufactoringData;
    }

    public void setManufactoringData(Date manufactoringData) {
        this.manufactoringData = manufactoringData;
    }


@Override
public  String priceTag(){


    return "(USED - )" + super.name + " " + super.price.toString()+ " " + manufactoringData.toString();
}
}
