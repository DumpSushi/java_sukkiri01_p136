package p136;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements Comparable<Book> {
	private String title;
	private Date publishDate;
	private String comment;

	public Book()
	{
		setTitle("notitle");
		setPublishDate(new Date());
		setComment("nocomment");
	}

	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		return "Title:" + this.getTitle() +
				", Date:" + f.format(this.getPublishDate()) +
				", Comment:" + this.getComment();
	}
	public boolean equals(Object o)
	{
		if(o == this)
			return true;
		if(o == null)
			return false;
		if(!(o instanceof Book))
			return false;
		Book r = (Book)o;
		if(this.getTitle().equals(r.getTitle()) &&
				this.getPublishDate().equals(r.getPublishDate()))
			return true;
		return false;
	}
	public int hashCode() {
		int result = 37;
		result = result * 31 * this.getTitle().hashCode();
		result = result * 31 * this.getPublishDate().hashCode();
		result = result * 31 * this.getComment().hashCode();
		return result;
	}
	public int compareTo(Book o) {
		return this.getPublishDate().compareTo(o.getPublishDate());
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
