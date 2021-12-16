package cs176L_project7;

import java.util.ArrayList;
import java.util.Collections;

public class testWrittenWork {

	public static void main(String[] args) {

novel novel1 = new novel("title", "name", 2000, "genre1", 1);
novel novel2 = new novel("title2", "name2", 2001, "genre2", 2);
novel novel3 = new novel("title3", "name3", 2021, "genre3",3);
shortStory story1 = new shortStory("title1", "name1", 2002, "genre1", 2, true);
shortStory story2 = new shortStory("title2", "name2", 2010, "genre2", 1, true);

ArrayList<writtenWork> type = new ArrayList<>();
type.add(novel1);
type.add(novel2);
type.add(novel3);
type.add(story1);
type.add(story2);


System.out.println(type);
Collections.sort(type, new CompareByPageSize());

System.out.println("Sort");
System.out.println(type);

}
	}
