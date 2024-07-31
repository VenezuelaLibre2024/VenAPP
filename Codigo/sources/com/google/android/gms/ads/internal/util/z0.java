package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzftt;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f9091a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f9092b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f9093c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9094d = new Object();

    public final Handler a() {
        return this.f9092b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f9094d) {
            if (this.f9093c != 0) {
                com.google.android.gms.common.internal.s.k(this.f9091a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.f9091a == null) {
                u1.a("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f9091a = handlerThread;
                handlerThread.start();
                this.f9092b = new zzftt(this.f9091a.getLooper());
                u1.a("Looper thread started.");
            } else {
                u1.a("Resuming the looper thread");
                this.f9094d.notifyAll();
            }
            this.f9093c++;
            looper = this.f9091a.getLooper();
        }
        return looper;
    }
}
