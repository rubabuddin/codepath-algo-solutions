//Merge Intervals

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution1{
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> result = new ArrayList<Interval>();

        for(Interval interval : intervals){
            if(interval.end < newInterval.start){
                 result.add(interval);
            } else if (interval.start > newInterval.end){
                result.add(newInterval);
                newInterval = interval;
            } else if (interval.end >= newInterval.start || interval.start <= newInterval.end){
                int newStart = Math.min(interval.start, newInterval.start);
                int newEnd = Math.max(interval.end, newInterval.end);
                newInterval = new Interval(newStart, newEnd);
            }
        }
        result.add(newInterval);

        return result;
    }
}
