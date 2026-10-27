
import java.util.Arrays;

/**
 * Problem: Boats to Save People
 * Pattern: Greedy + Two Pointers
 *
 * Approach:
 * Sort people by weight. Always consider the lightest and
 * heaviest remaining people. If they fit together, pair them.
 * Otherwise, the heaviest person goes alone.
 *
 * The heaviest person is accounted for in every iteration.
 *
 * Time Complexity: O(n log n)
 * Auxiliary Space: O(log n) worst case, accounting for sorting.
 */
class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }
}
