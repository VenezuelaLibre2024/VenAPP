package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f11813e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f11814a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f11815b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11816c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f11817d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f11815b = str;
        this.f11816c = i10;
        this.f11817d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f11816c);
        StrictMode.ThreadPolicy threadPolicy = this.f11817d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f11813e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f11815b, Long.valueOf(this.f11814a.getAndIncrement())));
        return newThread;
    }
}
