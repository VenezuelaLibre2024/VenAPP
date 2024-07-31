package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.util.concurrent.k */
/* loaded from: classes2.dex */
public final class C5925k {

    /* renamed from: a */
    private String f12475a = null;

    /* renamed from: b */
    private Boolean f12476b = null;

    /* renamed from: c */
    private Integer f12477c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f12478d = null;

    /* renamed from: e */
    private ThreadFactory f12479e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.util.concurrent.k$a */
    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ ThreadFactory f12480a;

        /* renamed from: b */
        final /* synthetic */ String f12481b;

        /* renamed from: c */
        final /* synthetic */ AtomicLong f12482c;

        /* renamed from: d */
        final /* synthetic */ Boolean f12483d;

        /* renamed from: e */
        final /* synthetic */ Integer f12484e;

        /* renamed from: f */
        final /* synthetic */ Thread.UncaughtExceptionHandler f12485f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f12480a = threadFactory;
            this.f12481b = str;
            this.f12482c = atomicLong;
            this.f12483d = bool;
            this.f12484e = num;
            this.f12485f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f12480a.newThread(runnable);
            Objects.requireNonNull(newThread);
            String str = this.f12481b;
            if (str != null) {
                AtomicLong atomicLong = this.f12482c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(C5925k.m15184d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f12483d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f12484e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12485f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: c */
    private static ThreadFactory m15183c(C5925k c5925k) {
        String str = c5925k.f12475a;
        Boolean bool = c5925k.f12476b;
        Integer num = c5925k.f12477c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c5925k.f12478d;
        ThreadFactory threadFactory = c5925k.f12479e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m15184d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory m15185b() {
        return m15183c(this);
    }

    /* renamed from: e */
    public C5925k m15186e(boolean z10) {
        this.f12476b = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: f */
    public C5925k m15187f(String str) {
        m15184d(str, 0);
        this.f12475a = str;
        return this;
    }
}
