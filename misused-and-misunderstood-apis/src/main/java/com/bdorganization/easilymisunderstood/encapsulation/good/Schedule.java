package com.bdorganization.easilymisunderstood.encapsulation.good;

import java.util.Date;
import java.util.Set;

import com.bdorganization.easilymisunderstood.encapsulation.common.DayOfWeek;
import com.bdorganization.easilymisunderstood.encapsulation.common.MonthOfYear;

@SuppressWarnings("javadoc")
public class Schedule
{
    private final Date beginTime;
    private final Date endTime;
    private final Set<DayOfWeek> weeklyRecurrence;
    private final Set<MonthOfYear> monthlyRecurrence;

    public Schedule(Date beginTime, Date endTime, Set<DayOfWeek> weeklyRecurrence, Set<MonthOfYear> monthlyRecurrence)
    {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.weeklyRecurrence = weeklyRecurrence;
        this.monthlyRecurrence = monthlyRecurrence;
    }

    public Date getBeginTime()
    {
        return beginTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }

    public Set<DayOfWeek> getWeeklyRecurrence()
    {
        return weeklyRecurrence;
    }

    public Set<MonthOfYear> getMonthlyRecurrence()
    {
        return monthlyRecurrence;
    }
}
