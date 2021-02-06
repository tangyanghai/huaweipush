package com.push.tyh;

import android.util.Log;

/**
 * <p>@author : tangyanghai</p>
 * <p>@time : 2021/2/6</p>
 * <p>@for : </p>
 * <p></p>
 */
public class LogUtil {
    public static void log(String tag,String content){
        Log.e(tag,content);
    }

    public static void log(String content){
        log("===",content);
    }

}
