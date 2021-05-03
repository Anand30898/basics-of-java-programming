/*there is a game of picking up stones by two players Alice and Bob . Each has the power
of picking up either 1 or 4 stones and the condition they chose are OPTIMAL(it means that 
if there are 4 stones then the person has to pick up 4 there is no chance he can pick 1 )
means they have to end up the game in very less number of moves. find the winner Alice is always 
goes first
A5-->9 Alice is winner
-->14 Bob is winner */
public static void main(String[] args){
    int total =0;	
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of test cases");
    int t =sc.nextInt();
    for(int i=0;i<t;i++) {
    System.out.println("number of stones");
    int n= sc.nextInt();
    int  four_move=n/4;
    int one_move=n%4;
    total =four_move + one_move;
    if(total%2==1) {
    System.out.println("Alice wins");
    }
    else
    System.out.println("Bob wins");
    }
}
