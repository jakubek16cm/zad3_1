// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int n= 5; 
   
    for(int i= n; i > 0; i--){
      
  
      for(int j=0; j < n-i; j++)
      {
        System.out.print(" ");
      }
      for(int k=0; k < i; k++)
      {
        System.out.print("*");
      }
      System.out.println();
  }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}