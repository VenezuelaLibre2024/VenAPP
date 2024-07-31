package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import pc.e0;
import pc.w;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final w<ScheduledExecutorService> f11807a = new w<>(new ee.b() { // from class: qc.b
        @Override // ee.b
        public final Object get() {
            ScheduledExecutorService p10;
            p10 = ExecutorsRegistrar.p();
            return p10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final w<ScheduledExecutorService> f11808b = new w<>(new ee.b() { // from class: qc.c
        @Override // ee.b
        public final Object get() {
            ScheduledExecutorService q10;
            q10 = ExecutorsRegistrar.q();
            return q10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final w<ScheduledExecutorService> f11809c = new w<>(new ee.b() { // from class: qc.d
        @Override // ee.b
        public final Object get() {
            ScheduledExecutorService r10;
            r10 = ExecutorsRegistrar.r();
            return r10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final w<ScheduledExecutorService> f11810d = new w<>(new ee.b() { // from class: qc.e
        @Override // ee.b
        public final Object get() {
            ScheduledExecutorService s10;
            s10 = ExecutorsRegistrar.s();
            return s10;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(pc.d dVar) {
        return f11807a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(pc.d dVar) {
        return f11809c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(pc.d dVar) {
        return f11808b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(pc.d dVar) {
        return qc.n.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f11810d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.f(e0.a(dc.a.class, ScheduledExecutorService.class), e0.a(dc.a.class, ExecutorService.class), e0.a(dc.a.class, Executor.class)).f(new pc.g() { // from class: qc.f
            @Override // pc.g
            public final Object a(pc.d dVar) {
                ScheduledExecutorService l10;
                l10 = ExecutorsRegistrar.l(dVar);
                return l10;
            }
        }).d(), pc.c.f(e0.a(dc.b.class, ScheduledExecutorService.class), e0.a(dc.b.class, ExecutorService.class), e0.a(dc.b.class, Executor.class)).f(new pc.g() { // from class: qc.g
            @Override // pc.g
            public final Object a(pc.d dVar) {
                ScheduledExecutorService m10;
                m10 = ExecutorsRegistrar.m(dVar);
                return m10;
            }
        }).d(), pc.c.f(e0.a(dc.c.class, ScheduledExecutorService.class), e0.a(dc.c.class, ExecutorService.class), e0.a(dc.c.class, Executor.class)).f(new pc.g() { // from class: qc.h
            @Override // pc.g
            public final Object a(pc.d dVar) {
                ScheduledExecutorService n10;
                n10 = ExecutorsRegistrar.n(dVar);
                return n10;
            }
        }).d(), pc.c.e(e0.a(dc.d.class, Executor.class)).f(new pc.g() { // from class: qc.i
            @Override // pc.g
            public final Object a(pc.d dVar) {
                Executor o10;
                o10 = ExecutorsRegistrar.o(dVar);
                return o10;
            }
        }).d());
    }
}
