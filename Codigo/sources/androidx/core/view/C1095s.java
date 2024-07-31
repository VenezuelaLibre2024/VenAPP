package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.s */
/* loaded from: classes.dex */
public class C1095s {

    /* renamed from: a */
    private static boolean f4683a = false;

    /* renamed from: b */
    private static Method f4684b = null;

    /* renamed from: c */
    private static boolean f4685c = false;

    /* renamed from: d */
    private static Field f4686d;

    /* renamed from: androidx.core.view.s$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m5194a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f4683a) {
            try {
                f4684b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f4683a = true;
        }
        Method method = f4684b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m5195b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m5194a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1116x0.m5272f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m5196c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m5199f = m5199f(dialog);
        if (m5199f != null && m5199f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1116x0.m5272f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m5197d(View view, KeyEvent keyEvent) {
        return C1116x0.m5274g(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m5198e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? m5195b((Activity) callback, keyEvent) : callback instanceof Dialog ? m5196c((Dialog) callback, keyEvent) : (view != null && C1116x0.m5272f(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m5199f(Dialog dialog) {
        if (!f4685c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f4686d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4685c = true;
        }
        Field field = f4686d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
