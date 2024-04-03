// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class roomT {
    public static void main(String[] args) {
        
 //  -20+5 super warm; 5-15 warm, 15-30normal,30 cooling
       
    double roomT = -10.607; //var
    
    if (roomT <=5) {
      System.out.println("wear super clothing");
      // if the first if/else if true computer not check the next
    } else if (roomT<=15) {//not necessary to write >5
      System.out.println("wear warm clothing");
    } else if (roomT<=30 ) {
      System.out.println("wear normal clothing");
    } else if (roomT >30) {
      System.out.println("wear cooling clothing");
    }  
      else {
      System.out.println("please, enter only numbers");
      }


    }
}
