public class Q034_•¶Žš—ñ‚ð”äŠr‚·‚é{
  public static void main(String args[]){
    String s1 = "abc";
    String s2 = "abc";
    
    String s3 = new String("abc");
    String s4 = s3;
    String s5 = s3;
    
    String s6 = new String("abc");
    String s7= new String("abc");
    
    System.out.println(s1==s2);
    System.out.println(s4==s5);
    System.out.println(s6==s7);
    System.out.println(s1.equals(s2));
    System.out.println(s4.equals(s4));
    System.out.println(s6.equals(s7));
  }
}