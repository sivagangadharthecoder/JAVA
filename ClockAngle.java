import java.util.*;

class ClockAngle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter The Time: ");
        String time = obj.next();
        String[] input = time.split(":");
        
        int hours = Integer.parseInt(input[0]);
        int minutes = Integer.parseInt(input[1]);
        
        //System.out.println(hours + ":" + minutes);
        
        
        double hoursAngle = hours * 30 + (minutes / 5) * 2.5;
        int minutesAngle = minutes * 6;
        
        double angle = Math.abs(hoursAngle - minutesAngle);
        double minAngle = Math.min(angle , 360-angle);
        
        System.out.println(minAngle);
    }
}