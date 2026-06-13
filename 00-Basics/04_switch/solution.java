class Solution {
    public void whichWeekDay(int day) {
        switch(day){
            case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday"); // This block will execute
        break;
    case 4:
        System.out.println("Thursday"); // This block will execute
        break;
    case 5:
        System.out.println("Friday"); // This block will execute
        break;
    case 6:
        System.out.println("Saturday"); // This block will execute
        break;
    case 7:
        System.out.println("Sunday"); // This block will execute
        break;
    default:
        System.out.println("Invalid"); 
        }
    }
}