package by.jb24.less11hw.service;

import java.util.List;

import by.jb24.less11hw.entity.Library;
import by.jb24.less11hw.entity.PrintedEdition;
import by.jb24.less11hw.service.find.Findable;

public class LibraryService {
	
	public List<PrintedEdition> find(Library library, Findable findMatcher){
		List<PrintedEdition> units = library.getUnits();
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}
}
