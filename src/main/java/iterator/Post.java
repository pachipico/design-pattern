package iterator;

import java.util.Date;

public class Post {
	private String title;
	private Date createdDateTime;
	
	
	public Post(String title, Date createdDateTime) {
		this.title = title;
		this.createdDateTime = createdDateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	
}
