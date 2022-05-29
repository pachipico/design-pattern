package designpatterns.iterator;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Post {
	private String title;
	
	private LocalDateTime createdDateTimeDate;

	public String getTitle() {
		return title;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTimeDate;
	}

	
	public Post(String content) {
		Date now = new Date();
		this.title = content;
		this.createdDateTimeDate = LocalDateTime.now();
	}
	
}
