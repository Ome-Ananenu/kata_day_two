public class Solution{
  public static String doubleChar(String s){
    //enter your code here 
    String db = "";
    
    for(int i=0; i<s.length(); i++){
      db += s.charAt(i);
      db += s.charAt(i);
    }
    return db;
  }
}