import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


public class BasicJava {

    public void print1To255(){
        for(int i=1; i<=255; i++){
            System.out.println(i);
        }
    }
    public void printOddNum1To255(){
        for(int i=1; i<=255;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printSum(){
        int sum = 0;
        int i = 0;
        while(i<256){
            sum+=i;
            System.out.println("New number: "+i+" Sum: "+sum);
            i++;
        }
    }
    public void interateArray(int[] arr){
        for(int num : arr){
            System.out.println(num);
        }
    }
    public void findMax(int[] arr){
        int max= arr[0];
        for(int num: arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);;
    }
    public void getAvg(int[] arr){
        int sum= 0;
        for(int num: arr){
            sum+= num;
        }
        System.out.println(sum/arr.length);
    }
    public void arrayOddNum(){
        ArrayList<Integer> y= new ArrayList<Integer>();
        for(int i=1; i<=255; i++){
            if(i % 2 !=0){
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public void greaterThanY(int[] arr, int y){
        ArrayList<Integer> greater = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] > y){
                greater.add(arr[i]);
            }
        }
        System.out.println(greater);
    }
    public void squareValues(int[] x) {
        ArrayList<Integer> square = new ArrayList<Integer>();
        for(int i=0; i<x.length; i++){
            x[i] = (int) Math.pow(x[i], 2);
            square.add(x[i]);
        }
            System.out.println(square);
    }
    
    public void eliminateNegNums(int[] x) {
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i=0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
                neg.add(x[i]);
            }
        
            System.out.println(neg);
        }
    
    public void maxMinAvg(int[] arr){
        ArrayList<Integer> x = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i=1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum/arr.length;
        x.add(max);
        x.add(min);
        x.add(avg);
        System.out.println(x);
    }
    public void shiftArray(int[] arr){
        int temp= 0;
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr [i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}




