package iterator;

import java.util.Collections;
import java.util.List;



public class Client {

	public static void main(String[] args) {
		Board board = new Board();	
		board.addPost("디자인 패턴 게임");
		board.addPost("디자인 패턴 1");
		board.addPost("디자인 패턴 2");
		
		List<Post> posts = board.getPosts();
		for(int i = 0; i < posts.size(); i++) {
			Post post = posts.get(i);
			System.out.println(post.getTitle());
		}

		// TODO 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
	}

}
