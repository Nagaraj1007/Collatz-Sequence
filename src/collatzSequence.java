public class collatzSequence {
    public String sequence(int number){
        String result = "" ;
        while(number > 1){
            result += number + " ";
            number = (number % 2 == 0) ? number/2 : 3 * (number) + 1 ;
        }
        result += 1;
        return result;
    }
}
