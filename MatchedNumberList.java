import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
class User{
	private long id;
	private String name;
	private String gender;
	private String mobile;
	private final int[] userGameNumberList = new int[5];
	private int totalMatchedNumber=0;
	private static int[] pickedNumberList= new int[5];
	static int[]commonGameNumberList = new int[20];
		
		public void getId(){
			this .id = IdGenerator.getId();
		}
		public void getDetails(Scanner sc){
			
			System.out.println("Enter name");
			this.name = sc.nextLine();
			System.out.println("Enter gender");
			this.gender = sc.nextLine();
			System.out.println("Enter mobile");
			this.mobile = sc.nextLine();
		}
		void commonPoolRandomNumber(){
			Random rand = new Random();
			int count = 0;
			while(count<20){
				boolean duplicateNumber = false;
				for(int i =0;i<commonGameNumberList.length;i++){

				int num =rand.nextInt(100)+1;
				if(commonGameNumberList[i]== num){
					duplicateNumber = true;
					break;
				}
				if(!duplicateNumber){
					commonGameNumberList[count]=num;
				}
				}
				    System.out.println("Common Pool: " + Arrays.toString(commonGameNumberList));

			}
		}
	   ////methods used to take ramdom values from user........
	    void generateSystemNumberList(){
			Random rand =new Random();
			int randomIndex = 0;
			while(randomIndex<5){
				int index = rand.nextInt(commonGameNumberList.length);
				boolean exists = false;
			for(int i = 0; i < randomIndex; i++){
				if(userGameNumberList[i] == commonGameNumberList[index]){
					exists = true;
					break;
				}
			}
			if(!exists){
				userGameNumberList[randomIndex] = commonGameNumberList[index];
				randomIndex++;
			}
		}
		 
		}
	    
		////method used to take random values from system.......
	    void generateUserNumberList(Scanner sc){
			System.out.println("Enter 5 numbers from the common pool: ");

		int i = 0;
		while (i < 5) {
			System.out.print("Enter number " + (i + 1) + ": ");
			int num = sc.nextInt();

			boolean inPool = false;
			for (int k = 0; k < commonGameNumberList.length; k++) {
				if (commonGameNumberList[k] == num) {
					inPool = true;
					break;
				}
			}

			boolean alreadyEntered = false;
			for (int j = 0; j < i; j++) {
				if (userGameNumberList[j] == num) {
					alreadyEntered = true;
					break;
				}
			}

			if (inPool && !alreadyEntered) {
				userGameNumberList[i] = num;
				i++;
			} else {
				System.out.println("Invalid input. Must be from pool and not repeated.");
			}
		}
		System.out.println("User Number List: " + Arrays.toString(userGameNumberList));
		}
			
		
	//////method used to matched number in both list on basis of index like.....
	    void matchedNumbersLogic(){
		  totalMatchedNumber = 0;
			for(int i =0;i<5;i++){
				for(int j=0;j<5;j++){
					if(userGameNumberList[i] == pickedNumberList[j]){
						totalMatchedNumber++;
					}
				}
			}		 
		}
		public void showDetails() {
			System.out.println(" ID: " + id + " | Name: " + name + " | Gender: " + gender + " | Mobile: " + mobile);
			System.out.println(" User Numbers: " + Arrays.toString(userGameNumberList));
			System.out.println(" Random Numbers are: " + Arrays.toString(pickedNumberList));
			System.out.println("Matched Numbers: " + totalMatchedNumber);
			 if (totalMatchedNumber == 5) {
              System.out.println(" You won the Lottery");
            } else {
                System.out.println("Sorry bro..Try next time");
             }
		}
	}
 class IdGenerator {
	private static long sno=1001;
	public static long getId() {
		return sno++;
	}
}
public class MatchedNumberList{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
            User user = new User();
			user.getId();
			user.getDetails(scan);
			user.commonPoolRandomNumber();
			user.generateUserNumberList(scan);
			user.generateSystemNumberList();
			user.matchedNumbersLogic();
			user.showDetails();
           
	}
}