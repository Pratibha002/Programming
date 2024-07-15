package Array;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int [] a = {111, 222, 333, 121, 151 , 232};
        class GfG{
            //method to check if each element in the array is a palindrome
            public static int palinArray(int[] a, int n){
                int count=0;
                //iterating over each element in the array
                for(int i = 0; i < n ; i++)
                {
                    //calling the check method to check if the element is a palindrome
                    if(check(a[i])==1)
                        //if the element is a palindrome, increment the count
                        count++;
                }
                //if count is equal to the length of the array, return 1 indicating all elements are palindromes
                if(count==n)
                    return 1;
                //otherwise, return 0 indicating not all elements are palindromes
                return 0;
            }

            //method to check if a number is a palindrome
            public static int check(int a){
                int m=a;
                int rev=0;
                //reversing the number
                while(a!=0){
                    rev=(rev*10)+(a%10);
                    a/=10;
                }
                //if the reversed number is equal to the original number, return 1 indicating it is a palindrome
                if(m==rev)
                    return 1;
                //otherwise, return 0 indicating it is not a palindrome
                return 0;
            }
        }

    }
}
