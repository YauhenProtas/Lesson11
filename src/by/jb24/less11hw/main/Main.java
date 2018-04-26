package by.jb24.less11hw.main;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import by.jb24.less11hw.entity.Book;
import by.jb24.less11hw.entity.Library;
import by.jb24.less11hw.entity.Journal;
import by.jb24.less11hw.entity.PrintedEdition;
import by.jb24.less11hw.service.LibraryService;
import by.jb24.less11hw.service.find.FindByAuthor;
import by.jb24.less11hw.service.find.FindByPrice;
import by.jb24.less11hw.service.find.Findable;
import by.jb24.less11hw.service.sort.BookPriceComparator;
import by.jb24.less11hw.service.sort.BookYearComparator;
import by.jb24.less11hw.view.PrintAsList;
import by.jb24.less11hw.view.PrintAsTable;
//import by.jb24.less11hw.view.Printable;
import by.jb24.less11hw.view.ViewAction;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("КНИГА 1", 300,"Автор 1", new Date(2014,05,02)));
		myLibrary.add(new Book("КНИГА 2", 300,"Автор 2", new Date(2014,05,02)));
		myLibrary.add(new Book("КНИГА 3", 300,"Автор 3", new Date(2014,05,02)));
		myLibrary.add(new Book("КНИГА 4", 300,"Автор 4", new Date(2014,05,02)));
		myLibrary.add(new Book("КНИГА 5", 300,"Автор 5", new Date(2014,05,02)));
		myLibrary.add(new Book("КНИГА 6", 300,"Автор 6", new Date(2014,05,02)));
		myLibrary.add(new Journal("Журнал 1", 40, new Date(2018,04,02), 50));
		myLibrary.add(new Journal("Журнал 2", 300, new Date(2017,04,02), 50));
		
		myLibrary.remove(new Book("КНИГА 5", 300,"Автор 5", new Date(2014,05,02)));
		
		Findable matcher = new FindByPrice(300);
		LibraryService libService = new LibraryService();
		List<PrintedEdition> lists = libService.find(myLibrary, matcher);

		ViewAction.print(new PrintAsList(), lists);
		ViewAction.print(new PrintAsTable(), lists);

		Findable matcher2 = new FindByAuthor("Автор 3");

		List<PrintedEdition> lists2 = libService.find(myLibrary, matcher2);
		System.out.println("\n");

		//Sort found books by price
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Books by price:");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Comparator<PrintedEdition> comparatorByPrice = new BookPriceComparator();

		Set<PrintedEdition> bookSortedByPrice = new TreeSet<PrintedEdition>(comparatorByPrice);
		for (int i = 0; i < lists2.size(); i++) {
			bookSortedByPrice.add(lists2.get(i));
		}
		for (PrintedEdition elements : bookSortedByPrice) {
			System.out.print(elements.toString() + "\n");
		}
		
		//Sort found books by year
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Books by year:");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		Comparator<PrintedEdition> comparatorByYear = new BookYearComparator();

		Set<PrintedEdition> bookSortedByYear = new TreeSet<PrintedEdition>(comparatorByYear);
		for (int i = 0; i < lists2.size(); i++) {
			bookSortedByYear.add(lists2.get(i));
		}
		for (PrintedEdition elements : bookSortedByYear) {
			System.out.print(elements.toString() + "\n");
		}
	}

}
