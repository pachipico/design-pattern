package designpatterns.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post>{

	private Iterator<Post> internalIterator;
	
	
	
	
	
	public RecentPostIterator(Board board) {
		List<Post> list = board.getPosts();
		Collections.sort(list, (p1,p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
		internalIterator = list.iterator();
	}

	@Override
	public boolean hasNext() {
		
		return this.internalIterator.hasNext();
	}

	@Override
	public Post next() {
		
		return this.internalIterator.next();
	}

}
