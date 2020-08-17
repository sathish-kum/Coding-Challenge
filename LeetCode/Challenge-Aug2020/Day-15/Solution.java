class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int c = 0;
        if(intervals.length==0)
            return 0;
        else
        {
        	//for sortig the entire column
            for(int i = 0;i < intervals.length; i++)
            {
                for(int j = i+1; j< intervals.length; j++)
                {
                    if(intervals[i][1]>intervals[j][1])
                    {
                        int temp = intervals[i][1];
                        intervals[i][1] = intervals[j][1];
                        intervals[j][1] = temp;
                        int temp1 = intervals[i][0];
                        intervals[i][0] = intervals[j][0];
                        intervals[j][0] = temp1;
                    }
                }
            }
            int overlapInterval = 0;
		int endTime = intervals[0][1];
		
		for (int i = 1; i < intervals.length; i++) {
			if (endTime > intervals[i][0]) {
				++overlapInterval;
				endTime = Math.min (endTime, intervals[i][1]);
			}
			else {
				endTime = intervals[i][1];
			}
		}
		
		return overlapInterval;
          
        }
    }
}
