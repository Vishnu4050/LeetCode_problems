class Solution {
    public double angleClock(int h, int m) {
        if (h == 12)
            h = 0;

        double hourAngle = 30 * h + 0.5 * m;

        double minuteAngle = 6 * m;

        double angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, 360 - angle);

        return  angle;
    }
}