import java.util.Scanner;
import java.lang.Math;


class Scorecard{
    String input;
    int runs;
    int wickets;
    String over[] = new String[6];
    Scanner sc = new Scanner(System.in);
    public int toss(){
        if(Math.random()>0.5)
        return 0;
        else
        return 1;
    }
    public int electing(){
        System.out.println("Enter Batting or Bowling.");
        String choice = sc.nextLine();
        if(choice.toLowerCase().equals("batting"))
        return 0;
        else
        return 1;
    }
    public void gettingScore(int a,int b){
        for(int i = 0;i<6;i++){
            System.out.println("Enter number of runs taken. runout,Bold,catchout,stumping for wicket, Wide and no ball also to be mentioned.");
        input = sc.nextLine();

        switch(input.toLowerCase()){
            case "1":
            a+=1;
            break;
            case "2":
            a+=2;
            break;
            case "3":
            a+=3;
            break;
            case "4":
            a+=4;
            break;
            case "6":
            a+=6;
            break;
            case "out":
            b+=1;
            break;
            case "wide":
            a+=1;
            break;
            default:
            System.out.println("Invalid Input");
            break;
        }
            System.out.println(a+"/"+b);
            if(input.equalsIgnoreCase("wide")|| input.equalsIgnoreCase("noball")){
                i--;
                continue;
            }
            
        }
    }
 
        
    
}