/import java.util.Scanner;
public class Market {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    products milk=new products();
    products chocolate=new products();
    products cheese=new products();
    milk.price=18;
    milk.code=012345;
    milk.producer="juhayna";
    chocolate.price=10;
    chocolate.code=45678;
    chocolate.producer="Galaxy";
    cheese.price=15;
    cheese.code=789456;
    cheese.producer="Domty";
    
    int option;
    System.out.println("for milk press 1");
    System.out.println("for chocolate press 2");
    System.out.println("for cheese press 3");
    option=input.nextInt();
    switch(option)
    {
    case 1:System.out.println("milk price:"+milk.price+"\nproducer:"+milk.producer+"\ncode:"+milk.code);
        break;
    case 2:System.out.println("chocolate price:"+chocolate.price+"\nproducer:"+chocolate.producer+"\ncode:"+chocolate.code);
        break;
    case 3:System.out.println("cheese price:"+cheese.price+"\nproducer:"+cheese.producer+"\ncode:"+cheese.code);
        break;
    default:System.out.println("wrong number");
       
    }
    }
    
}

    
    

