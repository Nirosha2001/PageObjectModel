package atm;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestCurrency {

	public static void main(String[] args) {
		Locale locale = new Locale("en","IN");
		double payment = 12500.00;
	    DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
	    DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
	    dfs.setCurrencySymbol("\u20B9");
	    decimalFormat.setDecimalFormatSymbols(dfs);
	    System.out.println(decimalFormat.format(payment));

	}

}




