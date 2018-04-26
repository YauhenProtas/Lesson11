package by.jb24.less11hw.entity;

import java.util.Date;

public class Journal extends PrintedEdition{
	private int pageCount;
	
	public Journal(String title,double price,Date publishedYear, int pageCount) {
		super(title, price, publishedYear);
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pageCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Journal other = (Journal) obj;
		if (pageCount != other.pageCount)
			return false;
		return true;
	}
	
	

}
