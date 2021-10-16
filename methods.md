# Methods
A couple of useful methods for me to use so I don't have to rewrite them every time.

## DecimalFormat
A couple of methods that use DecimalFormat. [Link about DecimalFormat syntax.](https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html)

***MUST IMPORT DECIMALFORMAT***

```java
import java.text.DecimalFormat;
```

### moneyFormat()
Changes double input to a string formatted as money.

```java
public static String moneyFormat(double n) {
  DecimalFormat nf = new DecimalFormat("$##0.00");
  return nf.format(n);
}
```

### percentFormat()
Changes double input to a string formatted as a percent.

```java
public static String percentFormat(double n) {
  DecimalFormat nf = new DecimalFormat("00.##%");
  return nf.format(n);
}
```