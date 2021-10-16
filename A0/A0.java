import java.text.DecimalFormat;
import java.util.ArrayList;


/*
Karl von Weyhe
2021-10-15
*/


public class A0{

  String name;
  double price;

  public static String moneyFormat(double n) {
    DecimalFormat nf = new DecimalFormat("$##0.00");
    return nf.format(n);
  }

  public static String percentFormat(double n) {
    DecimalFormat nf = new DecimalFormat("00.##%");
    return nf.format(n);
  }

  public static double circleArea(double radius) { // calcuate area using Math.PI
    double a = radius * radius;
    return Math.PI * a;
  }

  /* public ShopItem(String inName, double inPrice) {
    this.name = inName;
    this.price = inPrice;
  } */

  public String toString() {
    String str = this.name + "\t\t" + this.price;
    return str;
  }

  public static void questionSix() {
    double tax = 0.13;
    double cash = 20.0;
    double subtotal = 0;
    //ArrayList<ShopItem> products = new ArrayList<String>();

    // use products.add() to add all products to arraylist
    // cycle through products and add to subtotal
    // calcuate tax
    // calcuate total
    // calcuate change
    // print stuff and make it pretty
    System.out.println("Tax (" + percentFormat(tax) + ")");

    /* ShopItem shirt = new ShopItem("Shirt", 12.49);
    System.out.println(ShopItem.toString()); */
  }

public static void main(String[] args){

  //Q1
  double radius = 15.0;
  DecimalFormat twoDecimalFormat = new DecimalFormat("0.00");
  double areaCircle = circleArea(radius);
  System.out.println("Full result: " + areaCircle + "\nResult with 2 decimals: " + twoDecimalFormat.format(areaCircle));
  //System.out.println(twoDecimalFormat.format(areaCircle));


  System.out.println("\n\n\n");
  //Q2
  String name = "Wayne Gretzky";
  int number = 99;
  System.out.println(name + " is number " + number);

  System.out.println("\n\n\n");
  //Q3
  double length = 5.7;
  double width = 4.8;
  double area = length * width;
  
  System.out.println("The length of the rectangle is " + length + "cm.");
  System.out.println("The width of the rectangle is " + width + "cm.");
  System.out.println("The area of the rectangle is " + area + "cm.");


  System.out.println("\n\n\n");
  //Q4
  int hours = 40;
  double hourlyWage = 13.00;
  double deducted = 4.00;
  double tax = 0.22;

  double netPay = (hours * hourlyWage - deducted) - tax * (hours * hourlyWage - deducted);

  System.out.println(moneyFormat(netPay) + " = (" + hours + " * " + moneyFormat(hourlyWage) + " - " + moneyFormat(deducted) + ") - " + percentFormat(tax) + " * (" + hours + " * " + moneyFormat(hourlyWage) + " - " + moneyFormat(deducted) + ")");


  System.out.println("\n\n\n");
  //Q5
  //im figuring this out in the morning


  System.out.println("\n\n\n");
  //Q6
  questionSix();


 }// close main
}// close class