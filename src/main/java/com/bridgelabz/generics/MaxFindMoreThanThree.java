package com.bridgelabz.generics;

public class MaxFindMoreThanThree <T extends Comparable<T>> {  
	private T[] inputArray;

	MaxFindMoreThanThree(T[] inputArray){
            this.inputArray = inputArray;
        }

        public void  testMaximum() {
            for(int i=0; i<inputArray.length-1; i++) {
                if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
                    inputArray[i+1] = inputArray[i];
                }
            }

        }
    private void toPrint() {
        System.out.println(inputArray[inputArray.length - 1]);
    }
	public static void main(String[] args) {
		Integer[] integer = {15,32,45};
        String[] string = {"Peach","Banana","Apple"};
        Float[] floats = {15.1f,32.2f,45.3f};
        new MaxFindMoreThanThree(integer).testMaximum();
        new MaxFindMoreThanThree(string).testMaximum();
        new MaxFindMoreThanThree(floats).testMaximum();
        new MaxFindMoreThanThree(integer).toPrint();
        new MaxFindMoreThanThree(string).toPrint();
        new MaxFindMoreThanThree(floats).toPrint();
	}

}
