class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end


def insert(intervals, newInterval):
    results = []
    # write your code here

    index = 0;
    for interval in intervals:
        if interval.end < newInterval.start:
            results.append(interval)
            index += 1
        elif interval.start > newInterval.end:
            results.append(interval)
        else:
            newInterval.start = min(interval.start, newInterval.start)
            newInterval.end = max(interval.end, newInterval.end)
    results.insert(index, newInterval)
    return results

print insert([Interval(1,2),Interval(5,9)], Interval(2,5))