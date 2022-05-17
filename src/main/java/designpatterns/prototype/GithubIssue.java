package designpatterns.prototype;

public class GithubIssue implements Cloneable {

	private int id;
	private String title;
	private GithubRepository repository;
	
	public GithubIssue(GithubRepository githubRepository) {
		this.repository = githubRepository;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GithubRepository getRepository() {
		return repository;
	}

	public void setRepository(GithubRepository repository) {
		this.repository = repository;
	}
	
	public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		GithubRepository githubRepository = new GithubRepository();
		githubRepository.setUser(this.repository.getUser());
		githubRepository.setName(this.repository.getName());
		
		GithubIssue issue = new GithubIssue(githubRepository);
		issue.setTitle(this.title);
		issue.setId(this.id);
		
		return issue;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	
}
