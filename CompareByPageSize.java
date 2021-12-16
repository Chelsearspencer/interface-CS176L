package cs176L_project7;

import java.util.Comparator;

public class CompareByPageSize implements Comparator<writtenWork> {
int difference;

	public int compare(writtenWork w1, writtenWork w2)
	{
		if(w1.getPageSize()>w2.getPageSize())
		{
			return 1;
		}
		else if(w1.getPageSize()<w2.getPageSize())
		{
			return -1;
		}
		return 0;
		
	}

}

