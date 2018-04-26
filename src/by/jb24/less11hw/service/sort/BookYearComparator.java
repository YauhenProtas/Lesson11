package by.jb24.less11hw.service.sort;

import java.util.Comparator;
import java.util.Date;

import by.jb24.less11hw.entity.PrintedEdition;

public class BookYearComparator implements Comparator<PrintedEdition> {

	@Override
	public int compare(PrintedEdition obj1, PrintedEdition obj2) {
		int year1 = obj1.getPublishedYear().getYear();
		int year2 = obj2.getPublishedYear().getYear();

		if (year1 <= year2) {
			return -1;
		} else {
			return 1;
		}
	}
}