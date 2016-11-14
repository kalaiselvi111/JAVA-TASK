//package task;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hospital {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int year = 2016;
        int counters[][][];
        int k = 0,sum=0;
        float average;
        counters = new int[12][][];
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (year % 4 == 0) {
            monthDays[1] = 29;
        } else {
            monthDays[1] = 28;
        }
        for (int i = 0; i < monthDays.length; i++) {
            counters[i] = new int[monthDays[i]][24];

        }
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < monthDays[i]; j++) {
                String str = bf.readLine();
                String day[] = str.split(" ");
                for (k = 0; k < 24; k++) {
                    counters[i][j][k] = Integer.parseInt(day[k]);
                    }
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < monthDays[i]; j++) {
                
                for (k = 0; k < 24; k++) {
                    System.out.println(counters[i][j][k]);
                }
            }
        }
        for(int j=0;j<monthDays[0];j++)
            for(k=0;k<24;k++)
                sum=sum+counters[0][j][k];
                average=sum/(monthDays[0]*24);
                System.out.println("Average no.of customer on January month:"+average);

                

        sum=0; 
        int i=11;
        int j=20;
        for(k=0;k<24;k++)
                sum=sum+counters[i][j][k];
                average=sum/24;
                System.out.println("Average no.of customer on December:"+average);

        sum=0;
        j=6;
        for(i=0;i<12;i++)
        {
            for(k=0;k<24;k++)
            {
                sum=sum+counters[i][j][k];
            }

        }
            average=sum/(12*24);
            System.out.println("Average no.of customer on every month of day 7:"+average);
        

        sum=0;
        for(i=0;i<12;i++){
            for(j=0;j<monthDays[i];j++){
                for(k=9;k<18;k++){
                    sum=sum+counters[i][j][k];
            }

        }
    }
            average=sum/(365*9);
            System.out.println("Average no.of customer on every day of hour 10 to 18:"+average);


j=28;
sum=0;
int leap=0;
for(i=0;i<12;i++){
    if(leap==0){
        if(i!=1){
            for(k=0;k<24;k++)
                sum=sum+counters[i][j][k];
        }
    }
    else{
        for(k=0;k<24;k++)
            sum=sum+counters[i][j][k];
    }
}

if(leap==0)
average=sum/(11*24);
else
average=sum/(12*24);
 System.out.println("Average no.of customer on every month day 29:"+average);
}