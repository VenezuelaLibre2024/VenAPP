package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzftt;

/* renamed from: com.google.android.gms.ads.internal.util.z0 */
/* loaded from: classes.dex */
public final class C5061z0 {

    /* renamed from: a */
    private HandlerThread f10190a = null;

    /* renamed from: b */
    private Handler f10191b = null;

    /* renamed from: c */
    private int f10192c = 0;

    /* renamed from: d */
    private final Object f10193d = new Object();

    /* renamed from: a */
    public final Handler m12796a() {
        return this.f10191b;
    }

    /* renamed from: b */
    public final Looper m12797b() {
        Looper looper;
        synchronized (this.f10193d) {
            if (this.f10192c != 0) {
                C5276s.m13325k(this.f10190a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.f10190a == null) {
                C5047u1.m12726a("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f10190a = handlerThread;
                handlerThread.start();
                this.f10191b = new zzftt(this.f10190a.getLooper());
                C5047u1.m12726a("Looper thread started.");
            } else {
                C5047u1.m12726a("Resuming the looper thread");
                this.f10193d.notifyAll();
            }
            this.f10192c++;
            looper = this.f10190a.getLooper();
        }
        return looper;
    }
}
