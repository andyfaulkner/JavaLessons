package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class arrayExercise {

    public static void main(String[]args){

        int [] test1 = {1, 2, 3};
        int [] test2 = {1, 2, 3, 1};
        int [] test3 = {1, 2, 1};

        System.out.println(sameFirstLast(test1));
        System.out.println(sameFirstLast(test2));
        System.out.println(sameFirstLast(test3));

        int[][] test4 = {{1, 2, 3},{7, 3}};
        int[][] test5 = {{1, 2, 3},{7, 3, 2}};
        int[][] test6 = {{1, 2, 3},{1, 3}};

        System.out.println(commonEnd(test4));
        System.out.println(commonEnd(test5));
        System.out.println(commonEnd(test6));

        int [] test7 = {1, 2, 3};
        int [] test8 = {11, 5, 9};
        int [] test9 = {2, 11, 3};

        maxEnd3(test7);
        maxEnd3(test8);
        maxEnd3(test9);

        int [] test10 = {2, 5};
        int [] test11 = {4, 3};
        int [] test12 = {4, 5};

        System.out.println(has23(test10));
        System.out.println(has23(test11));
        System.out.println(has23(test12));

        int [] test13 = {2, 1, 2, 3, 4};
        int [] test14 = {2, 2, 0};
        int [] test15 = {1, 3, 5};

        System.out.println(intCount(test13));
        System.out.println(intCount(test14));
        System.out.println(intCount(test15));

        int [] test16 = {10, 3, 5, 6};
        int [] test17 = {7, 2, 10, 9};
        int [] test18 = {2, 10, 7, 2};

        System.out.println(bigDiff(test16));
        System.out.println(bigDiff(test17));
        System.out.println(bigDiff(test18));

        int [] test19 = {1, 2, 2, 1};
        int [] test20 = {1, 1};
        int [] test21 = {1, 2, 2, 1, 13};

        System.out.println(sum13(test19));
        System.out.println(sum13(test20));
        System.out.println(sum13(test21));


    }

    static boolean sameFirstLast(int[] nums){
        return nums[0] == nums[nums.length - 1];
    }

    static boolean commonEnd(int[][] nums){
        return (nums[0][0] == nums[1][0]) || (nums[0][nums[0].length - 1] == nums[1][nums[1].length - 1]);
    }

    static void maxEnd3(int[] nums){
        int max;

        if (nums[0] > nums.length - 1) {
            max = nums[0];
        } else {
                max = nums[nums.length -1];
            }

            nums[0] = max;
            nums[1] = max;
            nums[2] = max;

            for(int i = 0; i < nums.length-1; i++) {
                System.out.println(nums[i]);
            }

        }

    static boolean has23(int[]nums){
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }

    static int intCount (int[] nums){
        int numberOfInts = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0 || nums[i] == 0){
                numberOfInts++;
            }
        }
        return numberOfInts;
    }

    static int bigDiff(int[] nums){
        int minNumber = 100;
        int maxNumber = 0;
        for (int i = 0; i < nums.length; i++){
            minNumber = Math.min(minNumber, nums[i]);
            maxNumber = Math.max(maxNumber, nums[i]);
        }
        int difference = maxNumber - minNumber;
        return difference;
    }

    static int sum13(int[] nums){
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 13) {
                total += nums[i];
            } else {
                break;
            }
        }
        return total;
    }

    }




