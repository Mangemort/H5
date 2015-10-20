  public class W5 {
	public static void main(String[] args) {
	
      String x;
	  int score, n;
	  boolean bool;
	  x = args[0];
	  bool = true;

	  for (int i = 0; i < x.length(); i++) {
	  score = 0;
	  for (int j = 0; j < x.length(); j++) {
	  if(x.charAt(i) == x.charAt(j)){
      score++;
	  if(score >= 2){
	  j = x.length();
	 }
	 }
	}
	
      if(score < 2){
	  bool = false;
	  break;
	 } 
    }

      if(bool == true){
	  int result = (int) Math.round(Math.random() * (x.length() - 1));
	  System.out.println(x.charAt(result));
		}
	 }
  }