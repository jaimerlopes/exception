import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
    
    List<Product> listProdcut=new ArrayList<>();
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
    
    System.out.print("Insert how many products you want insert");
    
    Integer numberOfProducts=sc.nextInt();
    sc.nextLine();

    for(int i=0; i<numberOfProducts;i++){


        System.out.print("Name of the product - ");
        String nameOfProduct = sc.nextLine();
        System.out.print("Price of product ");
        Double priceOfProduct =sc.nextDouble();
        System.out.print("Insert Type of Product( C- new / U - used / I - Imported )");
        char typeProduct=sc.next().charAt(0);
        sc.nextLine();

        if(typeProduct=='I'){

            System.out.print("Insert customs Fee");
            Double customsFee=sc.nextDouble(); 
            listProdcut.add(new ImportedProducted(nameOfProduct,priceOfProduct,customsFee));

        }else if (typeProduct=='U'){
            System.out.print("Manufactorin Data - ");
            Date manufactoringData=sdf.parse(sc.nextLine());
            listProdcut.add(new usedProduct(nameOfProduct,priceOfProduct,manufactoringData));
        }
      //

    }

    for(Product temp:listProdcut){

        System.out.println(temp.priceTag());
    }

    
    
    }
}
