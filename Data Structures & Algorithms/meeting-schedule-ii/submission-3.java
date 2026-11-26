/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        PriorityQueue<Integer> rooms=new PriorityQueue<>();
        for(Interval interval:intervals){
            if(!rooms.isEmpty() && rooms.peek()<=interval.start){
                rooms.poll();
            }
            rooms.offer(interval.end);
        }
        return rooms.size();
    }
}
