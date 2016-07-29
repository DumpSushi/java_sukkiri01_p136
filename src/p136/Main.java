package p136;

import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Book> list = new LinkedList<Book>();
		Book b1 = new Book();
		b1.setTitle("title00");
		Calendar day1 = Calendar.getInstance();
		day1.set(2015, 1, 1);
		b1.setPublishDate(day1.getTime());
		list.add(b1);

		Book b2 = new Book();
		b2.setTitle("title01");
		Calendar day2 = Calendar.getInstance();
		day2.set(2010, 7, 15);
		b2.setPublishDate(day2.getTime());
		list.add(b2);

		// hashCodeでの削除実験。
		{
//			b1 = new Book();
//			b1.setTitle("title00");
//			b1.setPublishDate(day1.getTime());
//			list.remove(b1);
		}

		Collections.sort(list);
		Iterator<Book> it = list.iterator();
		while(it.hasNext())
		{
			Book b = it.next();
			System.out.println(b);
		}
	}

}
