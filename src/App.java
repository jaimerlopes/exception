import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.ImportedProducted;
import entities.Individual;
import entities.Product;
import entities.TaxPayer;
import entities.usedProduct;

public class App {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
    
    List<TaxPayer> taxPayersL=new ArrayList<>();
    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
    
    System.out.print("How many persons do you want to insert");
    
    Integer numberOfPersons=sc.nextInt();


    for(int i=0; i<numberOfPersons;i++){
sc.nextLine();

        System.out.println("Name of person - ");
        String nameOfPerson = sc.nextLine();
        System.out.println("Anual Income");
        Double annualIncome =sc.nextDouble();
        System.out.println("Insert Type of Person( C- Company /  I - Individual )");
        char typePerson=sc.next().charAt(0);

        if(typePerson=='I'){

            System.out.println("Insert Health Expenditures");
            Double healthExpenditures=sc.nextDouble(); 
            taxPayersL.add(new Individual(nameOfPerson,annualIncome,healthExpenditures));

        }else if (typePerson=='C'){
            System.out.println("Numbers os persons in the company");
            Integer numberofPersonsInComapny=sc.nextInt();
            taxPayersL.add(new Company(nameOfPerson,annualIncome,numberofPersonsInComapny));
        }else{

            System.out.println("Error");
        }

    }

    for(TaxPayer temp:taxPayersL){

        System.out.printf("Taxes PaiD = %.3f",temp.tax());
    }

    
    
    }
}
