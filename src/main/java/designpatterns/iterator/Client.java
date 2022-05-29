package designpatterns.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Board board = new Board();
		board.addPost("post1");
		board.addPost("post2");
		board.addPost("post3");

		List<Post> posts = board.getPosts();
		Iterator<Post> iterator = posts.iterator();
		while(iterator.hasNext()) {
			Post post = iterator.next();
			System.out.println(post.getTitle());
		}
		
		
		iterator = new RecentPostIterator(board);
		
		for (int i = 0; i < posts.size(); i++) {
			Post post = posts.get(i);
			System.out.println(post.getTitle());
		}
	}

}
