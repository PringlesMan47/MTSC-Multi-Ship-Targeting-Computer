package MSTC;

import java.util.Scanner;

public class MSTC {

	public static void main(String[] args) {
		//Main distance variables
			double targetdistanceAmount;
			double targetdistanceMin = .5; //= 5 cords
		//	double targetdistanceMax = 6.7; //nautical miles
				
		//	T1 Torpedo variables
			double t1longdistanceAmount;
			double t1longdistanceMin = 4.1; //nautical miles
			double t1longdistanceMax = 6.7; //nautical miles
			double t1mediumdistanceAmount;
			double t1mediumdistanceMin = 2.8; //nautical miles
			int t1mediumdistanceMax = 4; //nautical miles
		//	double t1shortdistanceAmount;
		//	double t1shortdistanceMin = .5; //= 5 cords
		//	double t1shortdistanceMax = 2.7; //nautical miles
				
			int t1longspeedAmount = 30; //knots
			int t1mediumspeedAmount = 40; //knots			SPEED
			int t1shortspeedAmount = 44; //knots
			
			int t1longmileTime = 120; 
			int t1mediummileTime = 90; //					TIME/MILE
			int t1shortmileTime = 82; 
				
		//	int t1longcordTime = 12;
		//	int t1mediumcordTime = 9; //					TIME/CORD
		//	int t1shortcordTime = 8;
				
		//	T2 Torpedo variables
			double t2distanceAmount;
			double t2distanceMin = .5; //= 5 cords
			double t2distanceMax = 1.6; //nautical miles	DISTANCE
				
			int t2mileTime = 120; //						TIME/MILE
				
			int t2cordTime = 12; //							TIME/CORD
				
		//	T3 Torpedo variables
			double t3distanceAmount;
			double t3distanceMin = .5; //= 5 cords			DISTANCE
			double t3distanceMax = 2.7; //nautical miles
				
			int t3mileTime = 120; //						TIME/MILE
				
		//	int t3cordTime = 12; //							TIME/CORD
				
			//
		//	String A = "For target A,";
		//	String B = "For target B,";
		//	String C = "For target C,";
		//	String D = "For target D,";
				
			//
			double ttt2;
			double ttt3;
			double ttt1S;
			double ttt1M;
			double ttt1L;

			//
			double shipATime = 0;
		//	double shipAt1shortTime = 0;
			
			double shipAt2Time = 0;
			double shipAt3Time = 0;
			double shipAt1Time = 0;
			
			double shipBTime = 0;
		//	double shipBt1shortTime = 0;
			
			double shipBt2Time = 0;
			double shipBt3Time = 0;
			double shipBt1Time = 0;
			
			double shipCTime = 0;
		//	double shipCt1shortTime = 0;
			
			double shipCt2Time = 0;
			double shipCt3Time = 0;
			double shipCt1Time = 0;
			
			double shipDTime = 0;
		//	double shipDt1shortTime = 0;
			
			double shipDt2Time = 0;
			double shipDt3Time = 0;
			double shipDt1Time = 0;
			
			//
			int s1t2; //ship 1, torpedo 2
			int s2t2; //ship 2, torpedo 2
			int s3t2; //ship 3, torpedo 2
			int s4t2; //ship 4, torpedo 2
			
			//
			String pts1; //preferred torpedo, ship 1
			String pts2; //preferred torpedo, ship 2
			String pts3; //preferred torpedo, ship 3
			String pts4; //preferred torpedo, ship 4
			
			//greeting
			System.out.println("Welecome, mein Kapitän!"); //opening phrase
			
			//asks number of ships
			int shipAmount;
			System.out.println("How many ships do you see? (Maximum of four.)");
			
			Scanner userInput;
			userInput = new Scanner(System.in); //determines number of targets
			shipAmount = userInput.nextInt();
			if (shipAmount > 4) {
				System.out.println("That's too many ships! Please choose four of them.");
			}else if (shipAmount > 1) {
				System.out.println("Please input ships farthest to closest in the next section.");
			}else if (shipAmount < 1) {
				System.out.println("Stop wasting my time and go find some ships.");
			}
		
		
				switch (shipAmount) {
				case 1: //does the following once if there is one target

					//asks distance
					System.out.println("What distance do you have?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms or denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
				
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					System.out.println("--------------------");
					System.out.println(" ");
					break;
	
				case 2: //does the following twice if there are two targets
					
					//asks distance
					System.out.println("What distance do you have for target A?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s1t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipATime = ttt2;
						//shipAt1shortTime = ttt1S;
						
						shipAt2Time = ttt2;
						shipAt3Time = ttt2;
						shipAt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3 to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s1t2 = 2;
						 ttt3 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipATime = ttt3;
						//shipAt1shortTime = ttt1S;
						
						shipAt2Time = ttt3;
						shipAt3Time = ttt3;
						shipAt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipAt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipAt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else {
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					}
					
					//Preferred Torpedo Ship 1
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts1 = userInput.next();
					switch (pts1) { //Preferred Torpedo, Ship 1
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 1");
							shipATime = shipAt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 1");
							shipATime = shipAt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 1");
							shipATime = shipAt3Time;
							break;
					}

					System.out.println("--------------------");
					
					//calculations for second target (case 2)
					//asks distance
					System.out.println("What distance do you have for target B?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s2t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						//shipBTime = ttt2;
						//shipBt1shortTime = ttt1S;
						
						shipBt2Time = ttt2;
						shipBt3Time = ttt2;
						shipBt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s2t2 = 2;
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipBTime = ttt3;
						//shipBt1shortTime = ttt1S;
						
						shipBt2Time = ttt3;
						shipBt3Time = ttt3;
						shipBt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipBt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipBt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					//Preferred Torpedo Ship 2
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts2 = userInput.next();
					switch (pts2) { //Preferred Torpedo, Ship 2
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 2");
							shipBTime = shipBt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 2");
							shipBTime = shipBt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 2");
							shipBTime = shipBt3Time;
							break;
					}
					
					System.out.println("--------------------");
					//System.out.println(" ");
					
					//final multi-launch calculations
					//for first set recommendation
					
					double ttl = shipATime - shipBTime; //ttl = Time To Launch
					int ttlMinutes = (int)ttl / 60;
					int ttlSeconds = (int)ttl % 60;
					if (ttlMinutes >= 0 && ttlSeconds >= 0) {
						System.out.print("You should wait "); System.out.printf("%d:%02d", ttlMinutes, ttlSeconds); System.out.println(" between launching torpedoes at Target 1 and Target 2.");
					}else if (ttlMinutes < 0 || ttlSeconds < 0) {
						int cttlMinutes = ttlMinutes * -1; //cttl = Corrected Time To Launch
						int cttlSeconds = ttlSeconds * -1;
						System.out.print("Change of plans! Fire first at target B, then target A! You should wait "); System.out.printf("%d:%02d", cttlMinutes, cttlSeconds); System.out.println(" between launching torpedoes at Target 1 and Target 2.");
					}else
						System.out.println("Something broke");
					break;
					
				case 3: //does the following thrice if there are three targets
					
					//asks distance
					System.out.println("What distance do you have for target A?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s1t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipATime = ttt2;
						//shipAt1shortTime = ttt1S;
						
						shipAt2Time = ttt2;
						shipAt3Time = ttt2;
						shipAt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3 to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s1t2 = 2;
						 ttt3 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipATime = ttt3;
						//shipAt1shortTime = ttt1S;
						
						shipAt2Time = ttt3;
						shipAt3Time = ttt3;
						shipAt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipAt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipAt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else {
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					}
					
					//Preferred Torpedo Ship 1
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts1 = userInput.next();
					switch (pts1) { //Preferred Torpedo, Ship 1
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 1");
							shipATime = shipAt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 1");
							shipATime = shipAt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 1");
							shipATime = shipAt3Time;
							break;
					}

					System.out.println("--------------------");
					
					//calculations for second target (case 3)
					//asks distance
					System.out.println("What distance do you have for target B?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s2t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						//shipBTime = ttt2;
						//shipBt1shortTime = ttt1S;
						
						shipBt2Time = ttt2;
						shipBt3Time = ttt2;
						shipBt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s2t2 = 2;
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipBTime = ttt3;
						//shipBt1shortTime = ttt1S;
						
						shipBt2Time = ttt3;
						shipBt3Time = ttt3;
						shipBt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipBt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipBt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					//Preferred Torpedo Ship 2
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts2 = userInput.next();
					switch (pts2) { //Preferred Torpedo, Ship 2
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 2");
							shipBTime = shipBt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 2");
							shipBTime = shipBt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 2");
							shipBTime = shipBt3Time;
							break;
					}
					
					System.out.println("--------------------");
					
					//calculations for third target (case 3)
					//asks distance
					System.out.println("What distance do you have for target C?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s2t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						//shipBTime = ttt2;
						//shipBt1shortTime = ttt1S;
						
						shipCt2Time = ttt2;
						shipCt3Time = ttt2;
						shipCt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s2t2 = 2;
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipBTime = ttt3;
						//shipBt1shortTime = ttt1S;
						
						shipCt2Time = ttt3;
						shipCt3Time = ttt3;
						shipCt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipCt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipCt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					//Preferred Torpedo Ship 3
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts3 = userInput.next();
					switch (pts3) { //Preferred Torpedo, Ship 2
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 3");
							shipCTime = shipCt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 3");
							shipCTime = shipCt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 3");
							shipCTime = shipCt3Time;
							break;
					}
					
					System.out.println("--------------------");
					//System.out.println(" ");
					
					//final multi-launch calculations
					{
					//for first set recommendation
					ttl = shipATime - shipBTime; //ttl = Time To Launch
				//	System.out.print(shipATime + " "); System.out.print(shipBTime + " "); System.out.println(ttl);
					ttlMinutes = (int)ttl / 60;
					ttlSeconds = (int)ttl % 60;
				//	System.out.print(ttlMinutes + " "); System.out.println(ttlSeconds);
					if (ttlMinutes >= 0 && ttlSeconds >= 0) {
						System.out.print("You should wait "); System.out.printf("%d:%02d", ttlMinutes, ttlSeconds); System.out.println(" between launching torpedoes at Target 1 and Target 2.");
					}else if (ttlMinutes < 0 || ttlSeconds < 0) {
						int cttlMinutes = ttlMinutes * -1; //cttl = Corrected Time To Launch
						int cttlSeconds = ttlSeconds * -1;
						System.out.print("Change of plans! Fire first at target B, then target A! You should wait "); System.out.printf("%d:%02d", cttlMinutes, cttlSeconds); System.out.println(" between launching torpedoes at Target 1 and Target 2.");
					}else
						System.out.println("Something broke");
					}{
					//for second set recommendation
					ttl = shipBTime - shipCTime; //ttl = Time To Launch
				//	System.out.print(shipBTime + " "); System.out.print(shipCTime + " "); System.out.println(ttl);
					ttlMinutes = (int)ttl / 60;
					ttlSeconds = (int)ttl % 60;
				//	System.out.print(ttlMinutes + " "); System.out.println(ttlSeconds);
					if (ttlMinutes >= 0 && ttlSeconds >= 0) {
						System.out.print("You should wait "); System.out.printf("%d:%02d", ttlMinutes, ttlSeconds); System.out.println(" between launching torpedoes at Target 2 and Target 3.");
					}else if (ttlMinutes < 0 || ttlSeconds < 0) {
						int cttlMinutes = ttlMinutes * -1; //cttl = Corrected Time To Launch
						int cttlSeconds = ttlSeconds * -1;
						System.out.print("Change of plans! Fire first at target B, then target A! You should wait "); System.out.printf("%d:%02d", cttlMinutes, cttlSeconds); System.out.println(" between launching torpedoes at Target 2 and Target 3.");
					}else
						System.out.println("Something broke");
					}
					break;
					
				case 4:
					
					//asks distance
					System.out.println("What distance do you have for target A?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s1t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipATime = ttt2;
						//shipAt1shortTime = ttt1S;
						
						shipAt2Time = ttt2;
						shipAt3Time = ttt2;
						shipAt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3 to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s1t2 = 2;
						 ttt3 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipATime = ttt3;
						//shipAt1shortTime = ttt1S;
						
						shipAt2Time = ttt3;
						shipAt3Time = ttt3;
						shipAt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipAt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipAt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else {
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					}
					
					//Preferred Torpedo Ship 1
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts1 = userInput.next();
					switch (pts1) { //Preferred Torpedo, Ship 1
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 1");
							shipATime = shipAt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 1");
							shipATime = shipAt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 1");
							shipATime = shipAt3Time;
							break;
					}

					System.out.println("--------------------");
					
					//calculations for second target (case 4)
					//asks distance
					System.out.println("What distance do you have for target B?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s2t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						//shipBTime = ttt2;
						//shipBt1shortTime = ttt1S;
						
						shipBt2Time = ttt2;
						shipBt3Time = ttt2;
						shipBt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s2t2 = 2;
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipBTime = ttt3;
						//shipBt1shortTime = ttt1S;
						
						shipBt2Time = ttt3;
						shipBt3Time = ttt3;
						shipBt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipBt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipBt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					//Preferred Torpedo Ship 2
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts2 = userInput.next();
					switch (pts2) { //Preferred Torpedo, Ship 2
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 2");
							shipBTime = shipBt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 2");
							shipBTime = shipBt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 2");
							shipBTime = shipBt3Time;
							break;
					}
					
					System.out.println("--------------------");
					
					//calculations for third target (case 4)
					//asks distance
					System.out.println("What distance do you have for target C?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s2t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						//shipBTime = ttt2;
						//shipBt1shortTime = ttt1S;
						
						shipCt2Time = ttt2;
						shipCt3Time = ttt2;
						shipCt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s2t2 = 2;
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipBTime = ttt3;
						//shipBt1shortTime = ttt1S;
						
						shipCt2Time = ttt3;
						shipCt3Time = ttt3;
						shipCt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipCt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipCt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					//Preferred Torpedo Ship 3
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts3 = userInput.next();
					switch (pts3) { //Preferred Torpedo, Ship 2
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 3");
							shipCTime = shipCt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 3");
							shipCTime = shipCt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 3");
							shipCTime = shipCt3Time;
							break;
					}
					
					System.out.println("--------------------");
					
					//calculations for fourth target (case 4)
					//asks distance
					System.out.println("What distance do you have for target D?");
					
					//determines torpedo type
					userInput = new Scanner(System.in);
					targetdistanceAmount = userInput.nextDouble();
					
					System.out.println(" ");
				
					if (targetdistanceAmount <= targetdistanceMin) { //decides if I'm far enough away
						double upconverteddistanceAmount = targetdistanceAmount * 10; //converts to cords
						System.out.println("Your target distance is " + upconverteddistanceAmount + " cords.");
						System.out.println("You're too close to the target, mein Kapitän!");
					
					//now decides what type of torpedo is available
					//confirms or denies use of T2 torpedo
					}else if (targetdistanceAmount <= t2distanceMax) { //decides if T2 is available
						System.out.println("You should use a T2 torpedo, mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots or a T3.");
						s2t2 = 1;
						 ttt2 = targetdistanceAmount * t2mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t2Minutes = (int)ttt2 / 60; //this is the time to target
						int t2Seconds = (int)ttt2 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int) ttt1S % 60;
						//shipBTime = ttt2;
						//shipBt1shortTime = ttt1S;
						
						shipDt2Time = ttt2;
						shipDt3Time = ttt2;
						shipDt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t2Minutes, t2Seconds); System.out.println(" with either a T2 or T3  to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
				
					//confirms or denies use of T3 torpedo
					}else if (targetdistanceAmount <= t3distanceMax) { //decides if T3 is available
						System.out.println("You should use a T3 torpedo,  mein Kapitän. Though you can also use a T1 at " + t1shortspeedAmount + " knots.");
						s2t2 = 2;
						 ttt3 = targetdistanceAmount * t3mileTime;
						 ttt1S = targetdistanceAmount * t1shortmileTime;
						int t3Minutes = (int)ttt3 / 60;
						int t3Seconds = (int)ttt3 % 60;
						int t1SMinutes = (int)ttt1S / 60;
						int t1SSeconds = (int)ttt1S % 60;
						//shipBTime = ttt3;
						//shipBt1shortTime = ttt1S;
						
						shipDt2Time = ttt3;
						shipDt3Time = ttt3;
						shipDt1Time = ttt1S;
						System.out.print("It will take "); System.out.printf("%d:%02d", t3Minutes, t3Seconds); System.out.println(" to reach the target.");
						System.out.print("If using a T1, it will take "); System.out.printf("%d:%02d", t1SMinutes, t1SSeconds); System.out.println(" to reach the target.");
						
					//confirms of denies use of T1 torpedo, also determining optimal speed
					}else if (targetdistanceAmount <= t1mediumdistanceMax) { //decides if speed should be 40 knots
						System.out.println("You should use a T1 torpedo at " + t1mediumspeedAmount + " knots.");
						 ttt1M = targetdistanceAmount * t1mediummileTime;
						int t1MMinutes = (int)ttt1M / 60;
						int t1MSeconds = (int)ttt1M % 60;
						shipDt1Time = ttt1M;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1MMinutes, t1MSeconds); System.out.println(" to reach the target.");
				
					}else if (targetdistanceAmount <= t1longdistanceMax) { //decides if speed should be 30 knots, or if the ship is out of range
						System.out.println("You should use a T1 torpedo at " + t1longspeedAmount + " knots.");
						 ttt1L = targetdistanceAmount * t1longmileTime;
						int t1LMinutes = (int)ttt1L / 60;
						int t1LSeconds = (int)ttt1L % 60;
						shipDt1Time = ttt1L;
						System.out.print("It will take "); System.out.printf("%d:%02d", t1LMinutes, t1LSeconds); System.out.println(" to reach the target.");
						
					}else
						System.out.println("You're too far from the target, mein Kapitän! You need to get closer to your target. Re-heat your T1 torpedoes.");
					
					//Preferred Torpedo Ship 4
					System.out.println("--------------------");
					System.out.println("Which torpedo do you prefer?");
					userInput = new Scanner(System.in);
					pts4 = userInput.next();
					switch (pts4) { //Preferred Torpedo, Ship 2
						case "T1", "t1", "1": 
							System.out.println("You've chosen the T1 for ship 3");
							shipDTime = shipDt1Time;
							break;
						case "T2", "t2", "2":
							System.out.println("You've chosen the T2 for ship 3");
							shipDTime = shipDt2Time;
							break;
						case "T3", "t3", "3":
							System.out.println("You've chosen the T3 for ship 3");
							shipDTime = shipDt3Time;
							break;
					}
					
					System.out.println("--------------------");
					//System.out.println(" ");
					
					//final multi-launch calculations
					{
					//for first set recommendation
					ttl = shipATime - shipBTime; //ttl = Time To Launch
				//	System.out.print(shipATime + " "); System.out.print(shipBTime + " "); System.out.println(ttl);
					ttlMinutes = (int)ttl / 60;
					ttlSeconds = (int)ttl % 60;
				//	System.out.print(ttlMinutes + " "); System.out.println(ttlSeconds);
					if (ttlMinutes >= 0 && ttlSeconds >= 0) {
						System.out.print("You should wait "); System.out.printf("%d:%02d", ttlMinutes, ttlSeconds); System.out.println(" between launching torpedoes at Target 1 and Target 2.");
					}else if (ttlMinutes < 0 || ttlSeconds < 0) {
						int cttlMinutes = ttlMinutes * -1; //cttl = Corrected Time To Launch
						int cttlSeconds = ttlSeconds * -1;
						System.out.print("Change of plans! Fire first at target B, then target A! You should wait "); System.out.printf("%d:%02d", cttlMinutes, cttlSeconds); System.out.println(" between launching torpedoes at Target 1 and Target 2.");
					}else
						System.out.println("Something broke");
					}{
					//for second set recommendation
					ttl = shipBTime - shipCTime; //ttl = Time To Launch
				//	System.out.print(shipBTime + " "); System.out.print(shipCTime + " "); System.out.println(ttl);
					ttlMinutes = (int)ttl / 60;
					ttlSeconds = (int)ttl % 60;
				//	System.out.print(ttlMinutes + " "); System.out.println(ttlSeconds);
					if (ttlMinutes >= 0 && ttlSeconds >= 0) {
						System.out.print("You should wait "); System.out.printf("%d:%02d", ttlMinutes, ttlSeconds); System.out.println(" between launching torpedoes at Target 2 and Target 3.");
					}else if (ttlMinutes < 0 || ttlSeconds < 0) {
						int cttlMinutes = ttlMinutes * -1; //cttl = Corrected Time To Launch
						int cttlSeconds = ttlSeconds * -1;
						System.out.print("Change of plans! Fire first at target B, then target A! You should wait "); System.out.printf("%d:%02d", cttlMinutes, cttlSeconds); System.out.println(" between launching torpedoes at Target 2 and Target 3.");
					}else
						System.out.println("Something broke");
					}{
					//for third set recommendation
					ttl = shipCTime - shipDTime; //ttl = Time To Launch
				//	System.out.print(shipBTime + " "); System.out.print(shipCTime + " "); System.out.println(ttl);
					ttlMinutes = (int)ttl / 60;
					ttlSeconds = (int)ttl % 60;
				//	System.out.print(ttlMinutes + " "); System.out.println(ttlSeconds);
					if (ttlMinutes >= 0 && ttlSeconds >= 0) {
						System.out.print("You should wait "); System.out.printf("%d:%02d", ttlMinutes, ttlSeconds); System.out.println(" between launching torpedoes at Target 3 and Target 4.");
					}else if (ttlMinutes < 0 || ttlSeconds < 0) {
						int cttlMinutes = ttlMinutes * -1; //cttl = Corrected Time To Launch
						int cttlSeconds = ttlSeconds * -1;
						System.out.print("Change of plans! Fire first at target B, then target A! You should wait "); System.out.printf("%d:%02d", cttlMinutes, cttlSeconds); System.out.println(" between launching torpedoes at Target 3 and Target 4.");
					}else
						System.out.println("Something broke");
					}
					break;
				}
	}
}
