package cs176L_project7;
public class novel extends writtenWork {

private String genre;
private int chapters;

public novel(String title, String author, int year, String genre, int chapters) {
	super(title,author,year);	      
	this.genre = genre;
	this.chapters = chapters;    	
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public int getChapters() {
	return chapters;
}

public void setChapters(int chapters) {
	this.chapters = chapters;
}
public String toString()
{
return super.toString() + "\ngenre: "+ getGenre() + "\nchapter: "+ getChapters();

}}

