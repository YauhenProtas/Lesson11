package by.jb24.less11hw.service.find;

import java.util.ArrayList;
import java.util.List;

import by.jb24.less11hw.entity.Book;
import by.jb24.less11hw.entity.PrintedEdition;

public class FindByAuthor implements Findable {
	private String author;

	public FindByAuthor(String author) {
		this.author = author;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> units) {
		List<PrintedEdition> resultUnits = new ArrayList<PrintedEdition>();

		for (int i = 0; i < units.size(); i++) {
			if (units.get(i) instanceof Book) {
				Book obj = (Book) units.get(i);
				if (author == obj.getAuthor()) {
					resultUnits.add(obj);
				}
			}
		}

		return resultUnits;
	}

}
