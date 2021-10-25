import java.text.DecimalFormat;
import java.util.ArrayList;


/*
Karl von Weyhe
2021-10-15
*/


public class A0{

  String name;
  double price;

  public static String moneyFormat(double n) { // formats a string as a dollar amount
    DecimalFormat nf = new DecimalFormat("$##0.00");
    return nf.format(n);
  }

  public static String percentFormat(double n) { // formats a double as a percent
    DecimalFormat nf = new DecimalFormat("00.##%");
    return nf.format(n);
  }

  public static double circleArea(double radius) { // calcuate area using Math.PI
    //double a = radius * radius;
    return Math.PI * (radius * radius);
  }


/* To do what you are thinking of, you need to make another java class named ShopItem. This is what I teach in the grade 12 course,it is beyond the learning goals for this assignment.-RU
*/

  public static void questionSix() {
    StringBuilder sb1 = new StringBuilder(); // generate the line of dashes (easily changed)
    int dashes = 60;
    for (int i = 0; i < dashes; i++) {
      sb1.append("-");
    }
    String lineBreak = sb1.toString();

    double taxPercent = 0.13; // variables
    double cash = 20.0;
    double subtotal = 0;
    double change = 0;
    ArrayList<ShopItem> products = new ArrayList<ShopItem>(); // arraylist of products

    ShopItem shopShirt = new ShopItem("Shirt", 12.49, 1); // create product objects
    ShopItem shopPants = new ShopItem("Pants", 15.0, 2);
    ShopItem shopLego = new ShopItem("Lego", 61.52, 1);
    ShopItem shopBook = new ShopItem("Thesaurus", 21.39, 1);

    products.add(shopShirt); // add products to arraylist
    products.add(shopPants);
    products.add(shopLego);
    products.add(shopBook);

    for (ShopItem item : products) { // calculate subtotal
      subtotal += item.totalPrice;
    }

    double tax = taxPercent * subtotal; // calculate tax and total
    double total = tax + subtotal;
    
    change = cash - total; // calcuate tax

    StringBuilder sb = new StringBuilder(); // generate store name that centers itself based on number of dashes
    String storeName = "Generic Store";
    int spaces = (dashes / 2) - (storeName.length() / 2);
    for (int i = 0; i < spaces; i++) {
      sb.append(" ");
    }
    sb.append(storeName);
    System.out.println(sb.toString());
    //System.out.println("Generic Store");

    System.out.println(lineBreak);

    System.out.println("Description:\tQuantity:\tUnit Price:\t\tTotal Price:"); // print headers
    System.out.println(lineBreak);

    for (ShopItem item : products) { // print products
      System.out.println(item.toString());
    }

    //System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15"); // special line for me to count tabs
    System.out.println(lineBreak);

    System.out.println("Subtotal: \t\t\t\t\t\t\t\t\t" + moneyFormat(subtotal)); // print other fields
    System.out.println("Tax:\t\t\t(" + percentFormat(taxPercent) + ")\t\t\t\t\t\t" + moneyFormat(tax));
    System.out.println("Total: \t\t\t\t\t\t\t\t\t\t" + moneyFormat(total));
    System.out.println("\nCash: \t\t\t\t\t\t\t\t\t\t" + moneyFormat(cash));
    System.out.println("Change: \t\t\t\t\t\t\t\t\t" + moneyFormat(change));
    System.out.println(lineBreak);
  }

public static void main(String[] args){

  System.out.println("\n");
  //Q1
  System.out.println("**Question 1**");
  double radius = 15.0;
  DecimalFormat twoDecimalFormat = new DecimalFormat("0.00");
  double areaCircle = circleArea(radius);
  System.out.println("The area of the circle is " + twoDecimalFormat.format(areaCircle) + "cm².");
  System.out.println("Full answer: " + areaCircle);

  System.out.println("\n\n\n");
  //Q2
  System.out.println("**Question 2**");
  String name = "Wayne Gretzky";
  int number = 99;
  System.out.println(name + " is number " + number + ".");

  System.out.println("\n\n\n");
  //Q3
  System.out.println("**Question 3**");
  double length = 5.7;
  double width = 4.8;
  double area = length * width;
  
  System.out.println("The length of the rectangle is " + length + "cm.");
  System.out.println("The width of the rectangle is " + width + "cm.");
  System.out.println("The area of the rectangle is " + area + "cm².");


  System.out.println("\n\n\n");
  //Q4
  System.out.println("**Question 4**");
  int hours = 40;
  double hourlyWage = 13.00;
  double deducted = 4.00;
  double tax = 0.22;

  double netPay = (hours * hourlyWage - deducted) - tax * (hours * hourlyWage - deducted);

  System.out.println(moneyFormat(netPay) + " = (" + hours + " * " + moneyFormat(hourlyWage) + " - " + moneyFormat(deducted) + ") - " + percentFormat(tax) + " * (" + hours + " * " + moneyFormat(hourlyWage) + " - " + moneyFormat(deducted) + ")");


  System.out.println("\n\n\n");
  //Q5
  System.out.println("**Question 5**");
  int num1 = 53;
  int num2 = 3;
  int num3 = 53 / 3; // 17
  System.out.println(num1 + "/" + num2 + " = " + num3);


  System.out.println("\n\n\n");
  //Q6
  System.out.println("**Question 6**");
  questionSix();

  System.out.println("\n");
 }// close main
}// close class