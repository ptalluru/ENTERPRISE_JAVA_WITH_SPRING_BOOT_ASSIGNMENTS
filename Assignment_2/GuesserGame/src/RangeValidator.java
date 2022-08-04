public class RangeValidator {
    public int rangeFrom = 1;
    public int rangeTo = 10;

    public boolean validateRange(int number){
        if(number>=rangeFrom && number<=rangeTo){
            return true;
        }else {
            return false;
        }
    }
}
