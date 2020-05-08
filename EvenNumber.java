public class EvenNumber {
    public static void main(String[] args){
        System.out.println(isEvenNumber ( 4 ));
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int countEven = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber ( number )){
                countEven = countEven + number;
                System.out.println ("counteven = " + countEven);
                if (count == 5) {
                    System.out.println ("five even "+ countEven);
                    break;
                }
                count++;
                continue;
            }
            System.out.println ("Even number - " + number);
        }
    }
    public static boolean isEvenNumber(int number){
        if ((number%2) == 0) { return true;}
        return false;
    }

}
