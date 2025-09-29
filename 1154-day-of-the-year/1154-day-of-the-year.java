class Solution {
    public int dayOfYear(String date) {
        String[] part=date.split("-");
        int year=Integer.parseInt(part[0]);
        int month=Integer.parseInt(part[1]);
        int date=Integer.parseInt(part[2]);

        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

        if(isLeap(year)){
            days[1]=29;
        }

    }
}