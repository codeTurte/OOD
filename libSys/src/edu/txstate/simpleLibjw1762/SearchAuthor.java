package edu.txstate.simpleLibjw1762;

public class SearchAuthor extends Search 
{

	static LibrarySys libSys = LibrarySys.getInstance();
	
	protected SearchAuthor()
	{
		
	}
	
	protected doSearch(String search)
	{
		
		for(Book book : libSys.getBooks())
		{
			int i = 1;
			if (book.author.contains(search))
			{
				
			}
		}
		
		for (Journal journal : libSys.getJournals())
		{
			if(journal.author.contains(search))
			{
				
			}
		}
		
		for (Video video : libSys.getVideos())
		{
			if(video.author.contains(search))
			{
				
			}
		}
		
	}
	
}
