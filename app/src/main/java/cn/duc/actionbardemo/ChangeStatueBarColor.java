package cn.duc.actionbardemo;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;


/**
 * Created by Administrator on 2016/1/3.
 */
public class ChangeStatueBarColor {
    private static SystemBarTintManager tintManager;
    /**
     * 为statusbar设置颜色
     * @param context
     */
    public static void setColor(Activity context,int color){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
             setTranslucentStatus(true,context);
            tintManager = new SystemBarTintManager(context);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(color);
        }
    }
    /**
     * 将statusbar设置为透明
     * @param on
     * @param context
     */
    private static void setTranslucentStatus(boolean on, Activity context) {
        Window win = context.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}
