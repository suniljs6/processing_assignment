public class Factorial {
    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int fact() {
        if(number<0){
            throw new IllegalArgumentException();
        }
        if (number == 0 || number == 1){
            return 1;
        } else {
            int result = 1;
            for(int iterator=2; iterator<=number;iterator++){
                result*=iterator;
            }
            return result;
        }
    }
}
