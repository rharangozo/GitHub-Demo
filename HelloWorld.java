
public class HelloWorld {

  public HelloWorld() {
	//később
  }

  public String message;

  public void printMessage() {
    System.out.println(message);
  }

  public static void main(String[] args) {
    HelloWorld hw = new HelloWorld();
    hw.message = "Hello World!";
    hw.printMessage();
  }
 
} 
