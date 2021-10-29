import java.text.DecimalFormat;

public class ShopItem {
  String name;
  double price;
  int quantity;
  double totalPrice;

  public static String moneyFormat(double n) { // formats a string as a dollar amount
    DecimalFormat nf = new DecimalFormat("$##0.00");
    return nf.format(n);
  }

  public ShopItem(String inName, double inPrice, int inQuantity) { // constructor for shop items
    this.name = inName;
    this.price = inPrice;
    this.quantity = inQuantity;
    this.totalPrice = price * quantity;
  } 

  public String toString() { // prints the entry for the item
    String name = this.name;
    double price = this.price;
    int quantity = this.quantity;

    int nameLength = name.length(); // calculate the amount of tabs needed for it to align
    double a = Math.ceil(nameLength / 4);
    int b = 4 - (int)a;

    StringBuilder sb = new StringBuilder(name);

    for (int i = 0; i < b; i++) {
      sb.append("\t");
    }

    sb.append(quantity); // adding other properties
    sb.append("\t\t\t");
    sb.append(moneyFormat(price));
    sb.append("\t\t\t");
    sb.append(moneyFormat(totalPrice));

    String str = sb.toString();

    return str;
  }
}