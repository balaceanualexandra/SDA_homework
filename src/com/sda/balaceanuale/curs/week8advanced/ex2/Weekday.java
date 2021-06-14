package com.sda.balaceanuale.curs.week8advanced.ex2;

public enum Weekday
{
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    private boolean isHoliday;

    Weekday(boolean isHoliday)
    {
        this.isHoliday = isHoliday;
    }

    public boolean isHoliday()
    {
        return isHoliday;
    }

    public boolean isWeekDay()
    {
        return !isHoliday;
    }


}
