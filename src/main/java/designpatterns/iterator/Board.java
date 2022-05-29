package designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
	private List<Post> posts = new ArrayList<>();
	
	public List<Post> getPosts()	{
		return posts;
	}
	
	public void addPost(String content) {
		
		posts.add(new Post(content));
	}
	
	public Iterator<Post> getDefaultIterator()	{
		return new RecentPostIterator(this);
	}

}
