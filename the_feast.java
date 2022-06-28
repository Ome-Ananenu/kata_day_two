public class Kata {

  public static boolean feast(String beast, String dish) {
    int beasL = beast.length() -1;
    int dishL = dish.length() - 1;
  
   
return  beast.charAt(0)==dish.charAt(0) && beast.charAt(beasL) == dish.charAt(dishL)? true: false;
  
  
}
  }