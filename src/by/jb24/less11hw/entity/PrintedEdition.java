package by.jb24.less11hw.entity;

import java.util.Calendar;
import java.util.Date;

public class PrintedEdition {
	private String title;
	private Date publishedYear;
	private double price;

	public PrintedEdition(String title, double price, Date publishedYear) {
		this.title = title;
		this.price = price;
		this.publishedYear = publishedYear;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return title + ", price = " + price + "$" + " published in " + publishedYear.getYear() + " year";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrintedEdition other = (PrintedEdition) obj;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Date publishedYear) {
		this.publishedYear = publishedYear;
	}

}
