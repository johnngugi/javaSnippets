import java.util.InputMismatchException;
import java.util.Scanner;
        
public class JaneK {
    
    static int a = 0;
    
    public static int questions() {
        
        System.out.println("Please answer the following questions? Answer either true or false");
        
        Scanner one = new Scanner(System.in);
        
        boolean validInput = false;
        boolean counter = false;
        
        while(!validInput) {
            System.out.println("Are you above 26 years old?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a += 10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you have a job?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you exercise?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Can you code?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Are you christian");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you live alone?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you love pets?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        validInput = false;
        counter = false;
        
        while(!validInput) {
             System.out.println("Do you have a car?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you have a carpet in your house?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you have brown shoes?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=10;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you play sports?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=6;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you read books?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=6;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        validInput = false;
        counter = false;
        
        while(!validInput) {
             System.out.println("Do you shower twice a day?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=6;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        validInput = false;
        counter = false;
        
        while(!validInput) {
            System.out.println("Do you love dogs?");
            try {
                counter = one.nextBoolean();
                validInput = true;
                a+=6;
            } catch(InputMismatchException e) {
                validInput = false;
                System.out.println("Not a valid input, answer either true or false");
                one.nextLine();
            }
            
        }
        
        return a;
    }
    
        

    
    public static void main(String[] args) {
        
        questions();
        
        if (a >= 75) {
            System.out.println("You can go out on a date with jane");
        } else if (a >= 85) {
            System.out.println("You have a high probability of dating Jane.");
        } else if (a >= 95) {
            System.out.println("You have a high probability of getting married to Jane.");
        } else {
            System.out.println("You do not match Jane's standards.");
        }
        
    }

}
