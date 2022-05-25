package iterator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Board {
	private List<Post> posts;

	public void addPost(String title) {
		if(posts == null) {
			posts = new ArrayList<>();
		}
		posts.add(new Post(title, new Date()));
		
	}

	public List<Post> getPosts() {

		return posts;
	}
	
	
	
}
