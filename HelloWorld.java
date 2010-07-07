
public class HelloWorld {

  public HelloWorld() {
	//később
  }

  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String m) {
    this.message = m;
  }

  public void printMessage() {
    System.out.println(message);
  }

  public static void main(String[] args) {
    HelloWorld hw = new HelloWorld();
    hw.setMessage("Hello World!");
    hw.printMessage();
  }
 
} 
