package cs176L_project7;

public class writtenWork {
	
//project 8
private int pageSize=0;
 public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
//

private String title;
private String author;
private int year;

public writtenWork(String title, String author, int year) {

setTitle(title);
setAuthor(author);
setYear(year);
}

public writtenWork() {
}

public String getTitle() {
	 return title;
}

public String getAuthor() {
	 return author;
}

public int getyear() {
	 return year;
}

public void setTitle(String title) {
	 this.title = title;
}

public void setAuthor(String author) {
	 this.author = author;
}
public int getYear(){
	 return year;
}
public void setYear(int year){
	 this.year = year;
}
public String toString(){
return "title: " + title + "\nauthor: " + author + "\nyear:" + year;


}}
