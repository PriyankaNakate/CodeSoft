import java.util.*;
class RandomNumberGame
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNum;

		for( ; ;)
		{
			System.out.println("***Number Game***");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.println("Does the user want to play game? Choose one option : ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1 : {
					System.out.println();
					System.out.println("***Welcome to play***");
					Random r = new Random();
					randomNum = r.nextInt(100);
					for(int i=1;i<=5;i++)
					{
						System.out.println("Enter number for guessing : ");
						int userNum = sc.nextInt();
						if(userNum==randomNum)
						{
							System.out.println("User guess is correct so user won the match");
							System.exit(0);
						}
						else if(userNum>(randomNum+20)){
							System.out.println("user guess is  too high");
						}
						else if(userNum<(randomNum-20))
						{
							System.out.println("user guess is too low");
						}
						else{
							System.out.println("The number entered by the user is close to the random number");
						}
					}
					System.out.println("user scores are 0 bcz all five chances are failed bcz user random number is  : "+randomNum);
					break;
				}
				case 2 : {
					System.exit(0);
				}
				default : System.out.print("User entered wrong option ");
			}
		}
	}
}