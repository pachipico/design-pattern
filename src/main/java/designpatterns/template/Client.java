package designpatterns.template;

public class Client {
	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor("number.txt");
		int result = fileProcessor.process((res, number) -> res += number);
		System.out.println(result);
	}
}
