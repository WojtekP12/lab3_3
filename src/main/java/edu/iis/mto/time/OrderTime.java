package edu.iis.mto.time;

import org.joda.time.DateTime;

/**
 * Created by wojciech.pelka on 2016-04-21.
 */
public class OrderTime
{
    DateTime dateTime = new DateTime();;

    public OrderTime()
    {
        dateTime = DateTime.now();
    }

    public DateTime getDateTime()
    {
        return dateTime;
    }
}
