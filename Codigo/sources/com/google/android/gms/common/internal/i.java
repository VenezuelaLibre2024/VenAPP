package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    private static final Object f9584a = new Object();

    /* renamed from: b */
    private static v1 f9585b = null;

    /* renamed from: c */
    static HandlerThread f9586c = null;

    /* renamed from: d */
    private static Executor f9587d = null;

    /* renamed from: e */
    private static boolean f9588e = false;

    public static int b() {
        return 4225;
    }

    public static i c(Context context) {
        synchronized (f9584a) {
            if (f9585b == null) {
                f9585b = new v1(context.getApplicationContext(), f9588e ? d().getLooper() : context.getMainLooper(), f9587d);
            }
        }
        return f9585b;
    }

    public static HandlerThread d() {
        synchronized (f9584a) {
            HandlerThread handlerThread = f9586c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f9586c = handlerThread2;
            handlerThread2.start();
            return f9586c;
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return h(new q1(componentName, 4225), serviceConnection, str, null);
    }

    public void e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        f(new q1(componentName, 4225), serviceConnection, str);
    }

    protected abstract void f(q1 q1Var, ServiceConnection serviceConnection, String str);

    public final void g(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        f(new q1(str, str2, 4225, z10), serviceConnection, str3);
    }

    public abstract boolean h(q1 q1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
