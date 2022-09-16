
public class firstNonRepeat {

	public static void main(String[] args) {
	String inputStr ="Anvitha";
	  inputStr=inputStr.toLowerCase();

      for(char i :inputStr.toCharArray()){
      if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
          System.out.println("First non-repeating character is: "+i);
          break;
      }
      }
	}
}
