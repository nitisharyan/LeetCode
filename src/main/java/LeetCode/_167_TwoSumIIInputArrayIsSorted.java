package LeetCode;

/*
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Easy. Array, Two Pointers, Binary Search.

Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that
they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution
and you may not use the same element twice

Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/

class _167_TwoSumIIInputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return new int[0];

        int lo = 0, hi = numbers.length - 1;
        while (lo < hi) {
            if (numbers[lo] + numbers[hi] < target) {
                hi--;
            } else if (numbers[lo] + numbers[hi] > target) {
                lo++;
            } else {
                return new int[]{lo + 1, hi + 1};
            }
        }
        return new int[0];
    }
}
