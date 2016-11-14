import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Next second \n2.Next minute \n3.Next hour \n4.precious second \n5.Previous minute \n6.previous Hour");
		int choice=Integer.parseInt(bf.readLine());
		Time timeObj=new Time();
		System.out.println("\n ENTER THE TIME\n");
		
		String currentTime=bf.readLine();
		String time[]=currentTime.split(":");
		int currentHour=Integer.parseInt(time[0]);
		int currentMinute=Integer.parseInt(time[1]);
		int currentSecond=Integer.parseInt(time[2]);
		timeObj=new Time(currentHour,currentMinute,currentSecond);

		switch(choice){
			case 1:
			System.out.println("\nNext second is");
			timeObj.nextSecond();
			break;
			case 2:
			System.out.println("\nNext minute is");
			timeObj.nextMinute();
			break;
			case 3:
			System.out.println("\nNext Hour is");
			timeObj.nextHour();
			break;
			case 4:
			System.out.println("\nPrevious second is");
			timeObj.previousSecond();
			break;
			case 5:
			System.out.println("\nPrevious minute is");
			timeObj.previousMinute();
			break;
			case 6:
			System.out.println("\nPrevious Hour is");
			timeObj.previousHour();
			break;
			default:
			System.out.println("\nInvalid");
			break;

		}
	}
	}