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

    }


