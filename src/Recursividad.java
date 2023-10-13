
public class Recursividad {
    
    
    public int suma(int n){
        int i=1;
        int sum=0;
        if(n>=1){
          
            while(i<=n){
                sum+=i;
                i++;
            }
            return sum;
        }
        
        return 0;
    }
    
    
    public static void main(String[] args) {
        
        
    }
    
    
    
    
}//Fin clase
