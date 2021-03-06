package me.blog.eyeballss.android_api.Utils;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.util.Log;

/**
 * Created by david on 18. 3. 7.
 */

public class MyLogger {
    private boolean logSwitch = true;
    private static final MyLogger ourInstance = new MyLogger();

    public static MyLogger getInstance() {
        return ourInstance;
    }

    private MyLogger() {
    }

    public void setLogSwitch(boolean logSwitch){
        this.logSwitch = logSwitch;
    }

    public boolean isLogSwitch() {
        return logSwitch;
    }

    public void d(Service service, String msg) {
        if (logSwitch) Log.d(getTag(service), buildLogMsg(msg));
    }

     public void d(Activity activity, String msg) {
        if (logSwitch) Log.d(getTag(activity), buildLogMsg(msg));
    }

     public void d(Object object, String msg) {
        if (logSwitch) Log.d(getTag(object), buildLogMsg(msg));
    }

     public void d(Context context, String msg) {
        if (logSwitch) Log.d(getTag(context), buildLogMsg(msg));
    }

     public void d(Service service, String msg, Throwable e) {
        if (logSwitch) Log.d(getTag(service), buildLogMsg(msg), e);
    }

     public void d(Activity activity, String msg, Throwable e) {
        if (logSwitch) Log.d(getTag(activity), buildLogMsg(msg), e);
    }

     public void d(Context context, String msg, Throwable e) {
        if (logSwitch) Log.d(getTag(context), buildLogMsg(msg), e);
    }

     public void d(Object object, String msg, Throwable e) {
        if (logSwitch) Log.d(getTag(object), buildLogMsg(msg), e);
    }

     public void i(Service service, String msg) {
        if (logSwitch) Log.i(getTag(service), buildLogMsg(msg));
    }

     public void i(Activity activity, String msg) {
        if (logSwitch) Log.i(getTag(activity), buildLogMsg(msg));
    }

     public void i(Object object, String msg) {
        if (logSwitch) Log.i(getTag(object), buildLogMsg(msg));
    }

     public void i(Context context, String msg) {
        if (logSwitch) Log.i(getTag(context), buildLogMsg(msg));
    }

     public void i(Service service, String msg, Throwable e) {
        if (logSwitch) Log.i(getTag(service), buildLogMsg(msg), e);
    }

     public void i(Activity activity, String msg, Throwable e) {
        if (logSwitch) Log.i(getTag(activity), buildLogMsg(msg), e);
    }

     public void i(Object object, String msg, Throwable e) {
        if (logSwitch) Log.i(getTag(object), buildLogMsg(msg), e);
    }

     public void i(Context context, String msg, Throwable e) {
        if (logSwitch) Log.i(getTag(context), buildLogMsg(msg), e);
    }

     public void e(Service service, String msg) {
        if (logSwitch) Log.e(getTag(service), buildLogMsg(msg));
    }

     public void e(Activity activity, String msg) {
        if (logSwitch) Log.e(getTag(activity), buildLogMsg(msg));
    }

     public void e(Object object, String msg) {
        if (logSwitch) Log.e(getTag(object), buildLogMsg(msg));
    }

     public void e(Context context, String msg) {
        if (logSwitch) Log.e(getTag(context), buildLogMsg(msg));
    }

     public void e(Activity activity, String msg, Throwable e) {
        if (logSwitch) Log.e(getTag(activity), buildLogMsg(msg), e);
    }

     public void e(Service service, String msg, Throwable e) {
        if (logSwitch) Log.e(getTag(service), buildLogMsg(msg), e);
    }

     public void e(Object object, String msg, Throwable e) {
        if (logSwitch) Log.e(getTag(object), buildLogMsg(msg), e);
    }

     public void e(Context context, String msg, Throwable e) {
        if (logSwitch) Log.e(getTag(context), buildLogMsg(msg), e);
    }

     public String getTag(Activity activity) {
        if(activity!=null) return activity.getClass().getSimpleName();
        else return "";
    }

     public String getTag(Service service) {
        if(service!=null) return service.getClass().getSimpleName();
        else return "";
    }

     public String getTag(Object object) {
        if(object!=null) return object.getClass().getSimpleName();
        else return "";
    }

     public String getTag(Context context){
        if(context!=null) return context.getClass().getSimpleName();
        else return "";
    }

    private  String buildLogMsg(String message) {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[4];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(ste.getMethodName());
        sb.append("]  ");
        sb.append(message);
        return sb.toString();
    }
}
