import java.text.DecimalFormat;


/*
Karl von Weyhe
2021-10-15
*/


public class A0{

  public static double circleArea(double radius) { // calcuate area using Math.PI
    double a = radius * radius;
    return Math.PI * a;
  }

  public static double rectArea(double length, double width) { // calcuate area (why did i bother making this a method)
    return length * width;
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
  double area = rectArea(length, width);
  
  System.out.println("The length of the rectangle is " + length + "cm.");
  System.out.println("The width of the rectangle is " + width + "cm.");
  System.out.println("The area of the rectangle is " + area + "cm.");


  System.out.println("\n\n\n");
  //Q4
  DecimalFormat moneyFormat = new DecimalFormat("$##0.00");
  DecimalFormat percentFormat = new DecimalFormat("00%");
  int hours = 40;
  double hourlyWage = 13.00;
  double deducted = 4.00;
  double tax = 0.22;

  double netPay = (hours * hourlyWage - deducted) - tax * (hours * hourlyWage - deducted);

  System.out.println(moneyFormat.format(netPay) + " = (" + hours + " * " + moneyFormat.format(hourlyWage) + " - " + moneyFormat.format(deducted) + ") - " + percentFormat.format(tax) + " * (" + hours + " * " + moneyFormat.format(hourlyWage) + " - " + moneyFormat.format(deducted) + ")");


  System.out.println("\n\n\n");
  //Q5
  //im figuring this out in the morning


 }// close main
}// close class