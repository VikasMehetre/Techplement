
import java.util.HashMap;
import java.util.Scanner;


public class firstweek {
   
public static void main(String[] args) {
    HashMap<Integer,String[]> PhyOptions=new HashMap<>();
    HashMap<Integer,String[]> Chemoptions=new HashMap<>();
    HashMap<Integer,String[]> Mathoptions=new HashMap<>();
    
    HashMap<Integer,String> PhyQ=new HashMap<>();
    HashMap<Integer,String> ChemQ=new HashMap<>();
    HashMap<Integer,String> MathQ=new HashMap<>();
     int score=0;
     int keyInt=3;
    
    HashMap<Integer,Integer> PhyS=new HashMap<>();
    HashMap<Integer,Integer> ChemS=new HashMap<>();
    HashMap<Integer,Integer> MathS=new HashMap<>();
    PhyOptions.put(1, new String[]{ "300,000", "186,282", "1,079,255", "300,00"});
    PhyQ.put(1, "What is the speed of light in m/s?");
    PhyS.put(1, 1);
    int x=0;
    PhyOptions.put(2, new String[]{"Newton", "Einstein", "Galileo", "Tesla"});
    PhyQ.put(2, "Who formulated the theory of relativity?");
    PhyS.put(2, 2);
    Chemoptions.put(1, new String[]{"H2O", "CO2", "O2", "N2"});
ChemQ.put(1, "What is the chemical formula for water?");
ChemS.put(1, 1);


Chemoptions.put(2, new String[]{"Helium", "Neon", "Argon", "Krypton"});
ChemQ.put(2, "Which element is used in balloons to make them float?");
ChemS.put(2, 1);
Mathoptions.put(1, new String[]{"2", "4", "6", "8"});
MathQ.put(1, "What is the square root of 16?");
MathS.put(1, 2);

// Question 2
Mathoptions.put(2, new String[]{"5", "10", "15", "20"});
MathQ.put(2, "What is 5 multiplied by 3?");
MathS.put(2, 3);

    

    
    Scanner sc=new Scanner(System.in);
    // System.out.println("Welcome to the quiz game!");
    // System.out.println("Please enter your name:");
    // String name=sc.nextLine();
    // System.out.println("Hello "+name+"!");
    do { 
        x=0;
        System.err.println("""
            Option 
            Select 1 for Phy
            Select 2 for Chem
            Select 3 for Math
            Select 4 for Exit
            Select 5 to create an Quiz
            """);
            int choice=sc.nextInt();
            if(choice==4){
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Physics Quiz");
                    for(Integer key:PhyQ.keySet()){
                        System.out.println(key+" "+PhyQ.get(key));
                        System.out.println("""
                                                               Select Option 1,2,3,4
                                                               """);
                        for(int i=0;i<PhyOptions.get(key).length;i++){
                            System.out.println((i+1)+") "+PhyOptions.get(key)[i]);
                        }
                        int userChoice=sc.nextInt();
                        if(userChoice==PhyS.get(key)){
                            score+=10;
                            System.out.println("Correct Answer!");
                        }
                        else{
                            score-=5;
                            System.out.println("Wrong Answer!");
                        }
                        System.out.println("Your Score is: "+score);

                    }
                    break;
            }
            case 2->{
                System.out.println("Chemistry Quiz");
                    for(Integer key:ChemQ.keySet()){
                        System.out.println(key+" "+ChemQ.get(key));
                        System.out.println("""
                                                               Select Option 1,2,3,4
                                                               """);
                        for(int i=0;i<Chemoptions.get(key).length;i++){
                            System.out.println((i+1)+") "+Chemoptions.get(key)[i]);
                        }
                        int userChoice=sc.nextInt();
                        if(userChoice==ChemS.get(key)){
                            score+=10;
                            System.out.println("Correct Answer!");
                        }
                        else{
                            score-=5;
                            System.out.println("Wrong Answer!");
                        }
                        System.out.println("Your Score is: "+score);

                    }
                    break;
            }
            case 3->{
                System.out.println("Mathematics Quiz");
                for(Integer key :PhyOptions.keySet()){
                    System.out.println(key+" "+MathQ.get(key));
                    System.out.println("""
                                                               Select Option 1,2,3,4
                                                               """);
                    for(int i=0;i<Mathoptions.get(key).length;i++){
                        System.out.println((i+1)+") "+Mathoptions.get(key)[i]);
                    }
                    int userChoice=sc.nextInt();
                    if(userChoice==MathS.get(key)){
                        score+=10;
                        System.out.println("Correct Answer!");
                    }
                    else{
                        score-=5;
                        System.out.println("Wrong Answer!");
                    }
                    System.out.println("Your Score is: "+score);

                }
                break;
            }
            case 5->{
               System.out.println("Lets Create an Quiz");
               do { 
                
                   System.out.println("""
                    Select The Option for Creating an Question in
                    Select 1 for Physics
                    Select 2 for Chemistry
                    Select 3 for Maths
                    Select 4 for Break
                    """);
                    int createChoice=sc.nextInt();
                    sc.nextLine();
                    if(createChoice==4){
                        x=4;
                    }
                    switch (createChoice) {
                        case 1 ->{
                            System.out.println("Enter the Question");
                            String questionsString=sc.nextLine();
                            sc.nextLine(); 
                            System.out.println("How Many options are required");
                            int options =sc.nextInt();
                            sc.nextLine(); 
                            String [] OptioStrings=new  String[options];
                            for(int i=0;i<options;i++){
                                System.out.println("Enter Option "+(i+1));
                                OptioStrings[i]=sc.nextLine();
                            }
                            System.out.println("Enter The Correct Answer");
                            int correctAnswer=sc.nextInt();
                            sc.nextLine(); 
                            PhyOptions.put(keyInt, OptioStrings);
                            PhyQ.put(keyInt, questionsString);
                            PhyS.put(keyInt, correctAnswer);
                            keyInt++;
                            
                            break;
                        }
                        case  2->{
                            System.out.println("Enter the Question");
                            String questionsString=sc.nextLine();
                            sc.nextLine(); 
                            System.out.println("How Many options are required");
                            int options =sc.nextInt();
                            sc.nextLine(); 
                            String [] OptioStrings=new  String[options];
                            for(int i=0;i<options;i++){
                                System.out.println("Enter Option "+(i+1));
                                OptioStrings[i]=sc.nextLine();
                            }
                            System.out.println("Enter The Correct Answer");
                            int correctAnswer=sc.nextInt();
                            sc.nextLine(); 
                            Chemoptions.put(keyInt, OptioStrings);
                            ChemQ.put(keyInt, questionsString);
                            ChemS.put(keyInt, correctAnswer);
                            keyInt++;
                            break;
                        }
                        case 3->{
                            System.out.println("Enter the Question");
                            String questionsString=sc.nextLine();
                            sc.nextLine(); 
                            System.out.println("How Many options are required");
                            int options =sc.nextInt();
                            sc.nextLine(); 
                            String [] OptioStrings=new  String[options];
                            for(int i=0;i<options;i++){
                                System.out.println("Enter Option "+(i+1));
                                OptioStrings[i]=sc.nextLine();
                            }
                            System.out.println("Enter The Correct Answer");
                            int correctAnswer=sc.nextInt();
                            sc.nextLine(); 
                            Mathoptions.put(keyInt, OptioStrings);
                            MathQ.put(keyInt, questionsString);
                            MathS.put(keyInt, correctAnswer);
                            keyInt++;
                            break;
                        }

                    }
               } while (x!=4);


            }
                default -> throw new AssertionError();
            }
            System.out.println("Your Score is: "+score);

    } while (true);
    System.out.println("Thank You !");

}}


