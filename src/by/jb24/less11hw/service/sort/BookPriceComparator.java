package by.jb24.less11hw.service.sort;

import java.util.Comparator;

import by.jb24.less11hw.entity.PrintedEdition;

public class BookPriceComparator implements Comparator<PrintedEdition> {

	@Override
	public int compare(PrintedEdition obj1, PrintedEdition obj2) {
		double price1 = obj1.getPrice();
		double price2 = obj2.getPrice();

		if (price1 <= price2) {
			return -1;
		} else {
			return 1;
		}
	}
}
