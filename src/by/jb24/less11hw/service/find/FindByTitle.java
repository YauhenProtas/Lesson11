package by.jb24.less11hw.service.find;

import java.util.List;

import by.jb24.less11hw.entity.PrintedEdition;

public class FindByTitle implements Findable{
	private String title;
	
	public FindByTitle(String title) {
		this.title = title;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> units) {

		return null;
	}

}
