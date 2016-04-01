/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * @param intervals: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) { 
        // write your code here
        Interval interval;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < airplanes.size(); i++) {
            interval = airplanes.get(i);
            if (interval.start < min) {
                min = interval.start;
            }
            if (interval.end > max) {
                max = interval.end;
            }
        }
        // System.out.println(min+" " + max);
        int maxCount = 0;
        for (float index = min; index <= max; index += 0.5) {
            int count = 0;
            for (int i = 0; i < airplanes.size(); i++) {
                interval = airplanes.get(i);
                if (interval.start < index && interval.end > index) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }
        // System.out.println(maxCount);
        return maxCount;
    }
}
