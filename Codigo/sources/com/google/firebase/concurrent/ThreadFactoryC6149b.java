package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.concurrent.b */
/* loaded from: classes.dex */
public class ThreadFactoryC6149b implements ThreadFactory {

    /* renamed from: e */
    private static final ThreadFactory f13028e = Executors.defaultThreadFactory();

    /* renamed from: a */
    private final AtomicLong f13029a = new AtomicLong();

    /* renamed from: b */
    private final String f13030b;

    /* renamed from: c */
    private final int f13031c;

    /* renamed from: d */
    private final StrictMode.ThreadPolicy f13032d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC6149b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f13030b = str;
        this.f13031c = i10;
        this.f13032d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m16661b(Runnable runnable) {
        Process.setThreadPriority(this.f13031c);
        StrictMode.ThreadPolicy threadPolicy = this.f13032d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f13028e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC6149b.this.m16661b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f13030b, Long.valueOf(this.f13029a.getAndIncrement())));
        return newThread;
    }
}
