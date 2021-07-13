public class Patterns {
    public static void main(String[] args) {

        // triangle

        for (int i = 1; i <= 5; i++){      
            for (int j = 1 ; j <= i; j++){
                // System.out.print("*");
            }
            // System.out.println();
        }

        
        // reactangle

        for (int i = 1; i <= 6; i++){       
            for (int j = 1; j <= 6; j++){
                // System.out.print("*");
            }
            // System.out.println();
        }


        // horizontal triangle (pointing right)

        for (int i = 1; i <= 5; i++){       
            for (int j = 1; j <= i; j++){
                // System.out.print("*");
            }
            // System.out.println();
        }
        for (int i = 1; i <= 5; i++){       
            for (int j = 4; j >= i; j--){
                // System.out.print("*");
            }
            // System.out.println();
        }


        // triangle mirror

        for (int i = 1; i <= 5; i++){       
            for (int j = 5; j >= i; j--){
                // System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++){
                // System.out.print("*");  
            }
            // System.out.println();
        }


        // mirror-inverse triangle

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++){
                // System.out.print(" ");
            }
            for (int k = 4; k >= i; k--){
                // System.out.print("*");
            }
            // System.out.println();
        }


        // horizontal triangle (pointing left)

        for (int i = 1; i <= 5; i++){       
            for (int j = 4; j >= i; j--){
                // System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                // System.out.print("*");
            }
            // System.out.println(); 
        }

        for (int i = 1; i <= 5; i++){       
            for (int j = 1; j <= i; j++){
                // System.out.print(" ");
            }
            for (int k = 4; k >= i; k--){
                // System.out.print("*");
            }
            // System.out.println();
        }


        // pyramid pattern

        for (int i = 1; i <= 5; i++){       
            for (int j = 5; j >= i; j--){
                // System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++){
               //  // System.out.print(" *");  
            }
            // System.out.println();
        }
    }
}
 