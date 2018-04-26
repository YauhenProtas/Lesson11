package by.jb24.less11hw.view;

import java.util.List;

import by.jb24.less11hw.entity.PrintedEdition;

public class PrintAsList implements Printable {

	@Override
	public void print(List<PrintedEdition> units) {
		System.out
				.println("--------------Print found editions as list--------------");
		System.out.println("");
		for (int i = 0; i < units.size(); i++) {
			System.out.println(units.get(i));
		}
		System.out.println("");

	}

}
