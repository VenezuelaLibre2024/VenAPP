package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private String f11260a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f11261b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f11262c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f11263d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f11264e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f11265a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11266b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f11267c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f11268d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f11269e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f11270f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f11265a = threadFactory;
            this.f11266b = str;
            this.f11267c = atomicLong;
            this.f11268d = bool;
            this.f11269e = num;
            this.f11270f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f11265a.newThread(runnable);
            Objects.requireNonNull(newThread);
            String str = this.f11266b;
            if (str != null) {
                AtomicLong atomicLong = this.f11267c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(k.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f11268d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f11269e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11270f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(k kVar) {
        String str = kVar.f11260a;
        Boolean bool = kVar.f11261b;
        Integer num = kVar.f11262c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = kVar.f11263d;
        ThreadFactory threadFactory = kVar.f11264e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public k e(boolean z10) {
        this.f11261b = Boolean.valueOf(z10);
        return this;
    }

    public k f(String str) {
        d(str, 0);
        this.f11260a = str;
        return this;
    }
}
