

public class BasicJavaTest {
    public static void main(String[] arg){
        BasicJava iD = new BasicJava();
        iD.print1To255();
        iD.printOddNum1To255();
        iD.printSum();
        iD.interateArray(new int[] { 1, 3, 5, 7, 9, 13 });
        iD.findMax(new int[] {-3, -5,-7});
        iD.getAvg(new int[] {2, 10, 3});
        iD.arrayOddNum();
        iD.greaterThanY(new int[] {1,3,5,7}, 3);
        iD.squareValues(new int[] {1, 5, 10, -2});
        iD.eliminateNegNums(new int[] { 1, 5, 10, -2 });
        iD.maxMinAvg(new int[] {1, 5, 10, -2});
        iD.shiftArray(new int[] { 1, 5, 10, 7, -2 });
    
    }
}