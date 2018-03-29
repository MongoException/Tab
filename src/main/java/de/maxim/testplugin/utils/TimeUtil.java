package de.maxim.testplugin.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Erstellt von Boss
 */
public class TimeUtil {

    public String getTimeString() {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("HH:mm:ss");
        String s = simpledateformat.format(new Date());

        return s;
    }
}
