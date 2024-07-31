package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes.dex */
public abstract class AbstractC5246i {

    /* renamed from: a */
    private static final Object f10699a = new Object();

    /* renamed from: b */
    private static C5287v1 f10700b = null;

    /* renamed from: c */
    static HandlerThread f10701c = null;

    /* renamed from: d */
    private static Executor f10702d = null;

    /* renamed from: e */
    private static boolean f10703e = false;

    /* renamed from: b */
    public static int m13270b() {
        return 4225;
    }

    /* renamed from: c */
    public static AbstractC5246i m13271c(Context context) {
        synchronized (f10699a) {
            if (f10700b == null) {
                f10700b = new C5287v1(context.getApplicationContext(), f10703e ? m13272d().getLooper() : context.getMainLooper(), f10702d);
            }
        }
        return f10700b;
    }

    /* renamed from: d */
    public static HandlerThread m13272d() {
        synchronized (f10699a) {
            HandlerThread handlerThread = f10701c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f10701c = handlerThread2;
            handlerThread2.start();
            return f10701c;
        }
    }

    /* renamed from: a */
    public boolean m13273a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return mo13277h(new C5272q1(componentName, 4225), serviceConnection, str, null);
    }

    /* renamed from: e */
    public void m13274e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo13275f(new C5272q1(componentName, 4225), serviceConnection, str);
    }

    /* renamed from: f */
    protected abstract void mo13275f(C5272q1 c5272q1, ServiceConnection serviceConnection, String str);

    /* renamed from: g */
    public final void m13276g(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        mo13275f(new C5272q1(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo13277h(C5272q1 c5272q1, ServiceConnection serviceConnection, String str, Executor executor);
}
