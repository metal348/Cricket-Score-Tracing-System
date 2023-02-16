import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int runs=0,wickets=0;
        Team team1 = new Team();
        Team team2 = new Team();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name for team one");
        String team1Name = sc.nextLine();
        System.out.println("Enter team name for team two");
        String team2Name = sc.nextLine();
        System.out.println("Enter number of player for team "+team1Name);
        int size1 = sc.nextInt();
        System.out.println("Enter number of player for team "+team2Name);
        int size2 = sc.nextInt();
        Team arr_t1[] = new Team[size1];
        Team arr_t2[] = new Team[size2];
        for(int i = 0; i<arr_t1.length;i++){
            System.out.println("Enter name of player"+(i+1));
            sc.next();
            String tempName = sc.nextLine();
            arr_t1[i] = new Team();
            arr_t1[i].playerName = tempName;
        }
        for(int i = 0; i<arr_t2.length;i++){
            System.out.println("Enter name of player"+(i+1));
            sc.next();
            String tempName = sc.nextLine();
            arr_t2[i] = new Team();
            arr_t2[i].playerName = tempName;
        }
        System.out.println("Enter Number of Overs");
        int overs = sc.nextInt();
        Scorecard team1Battingarr[] = new Scorecard[overs];
        Scorecard team2Battingarr[] = new Scorecard[overs];
        Scorecard team1Bowlingarr[] = new Scorecard[overs];
        Scorecard team2Bowlingarr[] = new Scorecard[overs];
        for(int i =0;i<overs;i++ ){
             team1Battingarr[i] = new Scorecard();
             team2Battingarr[i] = new Scorecard();
             team1Bowlingarr[i] = new Scorecard();
             team2Bowlingarr[i] = new Scorecard(); 
        }
        Scorecard s1 = new Scorecard();
        int tossRes = s1.toss();
        String innings;
        if(tossRes==0){
        System.out.println("Team "+team1Name+" won the toss");
        int electing = s1.electing();
        if(electing==0){
            System.out.println(team1Name+" has elected to bat first.");
            innings = team1Name+" batting";
            for(int i = 0;i<overs;i++){
                team1Battingarr[i].gettingScore(runs,wickets);
            }
        }else{
            System.out.println(team1Name+ "has elected to bowl.");
            innings = team1Name+" bowling";
        }
        }
        else{
        System.out.println("Team "+team2Name+" won the toss");
        int electing = s1.electing();
        if(electing==0){
            System.out.println(team2Name+" has elected to bat first.");
            innings = team2Name+" batting";
            for(int i = 0;i<overs;i++){
                team1Battingarr[i].gettingScore(runs,wickets);
            }
        }else{
            System.out.println(team2Name+" has elected to bowl.");
            innings = team2Name+" batting";
        }
        }
        

        
       
      
    }
}