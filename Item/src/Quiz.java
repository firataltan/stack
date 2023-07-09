
public class Quiz {

      
    public static void main(String[] args) {
        
        Stack stack= new Stack();
        
        stack.push("Fırat  ", 10) ;
        stack.push("Ahmet  ", 5) ;
        stack.push("Yunus  ", 2) ;
        stack.push("Hüseyin  ", 9) ;
        
        
        
        while (!stack.isEmpty()){
            String s= stack.pop();
            System.out.println(s.toString());
            
    }
        
        
    }
    
}
