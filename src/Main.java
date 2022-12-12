public class Main {
    public static void main(String[] args){
        try{
            String str1 = null;
            System.out.println( str1.length());
    
        }catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました") ;
            System.out.println(  e.getMessage());
    
    
        }
    }
}
