public class ValidAnagram {
    
    public static void main(String[] args) {
        
    }

    public boolean isAnagram(String s, String t) {
        
        char [] inp1 = s.toCharArray();
        char [] inp2 = t.toCharArray();

        

        if (inp1 == inp2){
            return true;
        }
        else{
            return false;
        }
    }
}
