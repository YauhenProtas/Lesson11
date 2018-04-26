package by.jb24.less11hw.view;

import java.util.List;

import by.jb24.less11hw.entity.PrintedEdition;

public class ViewAction {
	public static void print(Printable printObj, List<PrintedEdition> lists) {
		printObj.print(lists);
	}
}
