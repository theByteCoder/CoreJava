/*the intent of this code is to reverse a string in half time.
this is easy in javascript or python since negative indexing is allowed.
this is a java based implementation of same*/
package core;

public class ReverseStringHalfTime {
    public static void main(String[] args) {
        String statement = "Hello world this is Subhasish Ghosh"; // string to be reversed in half time
        String[] statementArr = statement.split(" "); // split string to array
        int arrLen = statementArr.length; // calculate length of array
        int midIndex = (int) Math.floor(arrLen / 2); // find the middle index to array
        int lastIndex = arrLen - 1; // calculate last index of array
        // loop over array with limit till mid index of array
        for (int count = 0; count < midIndex; count++) {
            String temp = statementArr[count]; // capture left index item in temp
            statementArr[count] = statementArr[lastIndex - count]; // capture right index item in left position
            statementArr[lastIndex - count] = temp; // capture left index item in right position
        }
        System.out.println(String.join(" ", statementArr)); // array to string
    }
}
