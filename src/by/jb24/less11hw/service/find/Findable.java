package by.jb24.less11hw.service.find;

import java.util.List;

import by.jb24.less11hw.entity.PrintedEdition;

public interface Findable {
	List<PrintedEdition> find(List<PrintedEdition> units);
}
