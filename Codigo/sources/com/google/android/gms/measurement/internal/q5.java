package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q5 extends u6 {

    /* renamed from: l */
    private static final AtomicLong f10540l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private t5 f10541c;

    /* renamed from: d */
    private t5 f10542d;

    /* renamed from: e */
    private final PriorityBlockingQueue<u5<?>> f10543e;

    /* renamed from: f */
    private final BlockingQueue<u5<?>> f10544f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f10545g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f10546h;

    /* renamed from: i */
    private final Object f10547i;

    /* renamed from: j */
    private final Semaphore f10548j;

    /* renamed from: k */
    private volatile boolean f10549k;

    public q5(w5 w5Var) {
        super(w5Var);
        this.f10547i = new Object();
        this.f10548j = new Semaphore(2);
        this.f10543e = new PriorityBlockingQueue<>();
        this.f10544f = new LinkedBlockingQueue();
        this.f10545g = new s5(this, "Thread death: Uncaught exception on worker thread");
        this.f10546h = new s5(this, "Thread death: Uncaught exception on network thread");
    }

    private final void t(u5<?> u5Var) {
        synchronized (this.f10547i) {
            this.f10543e.add(u5Var);
            t5 t5Var = this.f10541c;
            if (t5Var == null) {
                t5 t5Var2 = new t5(this, "Measurement Worker", this.f10543e);
                this.f10541c = t5Var2;
                t5Var2.setUncaughtExceptionHandler(this.f10545g);
                this.f10541c.start();
            } else {
                t5Var.a();
            }
        }
    }

    public final void B(Runnable runnable) {
        j();
        com.google.android.gms.common.internal.s.j(runnable);
        t(new u5<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean E() {
        return Thread.currentThread() == this.f10541c;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final void g() {
        if (Thread.currentThread() != this.f10542d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final void i() {
        if (Thread.currentThread() != this.f10541c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean n() {
        return false;
    }

    public final <T> T q(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().y(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzj().G().a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            zzj().G().a("Timed out waiting for " + str);
        }
        return t10;
    }

    public final <V> Future<V> r(Callable<V> callable) {
        j();
        com.google.android.gms.common.internal.s.j(callable);
        u5<?> u5Var = new u5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10541c) {
            if (!this.f10543e.isEmpty()) {
                zzj().G().a("Callable skipped the worker queue.");
            }
            u5Var.run();
        } else {
            t(u5Var);
        }
        return u5Var;
    }

    public final void u(Runnable runnable) {
        j();
        com.google.android.gms.common.internal.s.j(runnable);
        u5<?> u5Var = new u5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f10547i) {
            this.f10544f.add(u5Var);
            t5 t5Var = this.f10542d;
            if (t5Var == null) {
                t5 t5Var2 = new t5(this, "Measurement Network", this.f10544f);
                this.f10542d = t5Var2;
                t5Var2.setUncaughtExceptionHandler(this.f10546h);
                this.f10542d.start();
            } else {
                t5Var.a();
            }
        }
    }

    public final <V> Future<V> w(Callable<V> callable) {
        j();
        com.google.android.gms.common.internal.s.j(callable);
        u5<?> u5Var = new u5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10541c) {
            u5Var.run();
        } else {
            t(u5Var);
        }
        return u5Var;
    }

    public final void y(Runnable runnable) {
        j();
        com.google.android.gms.common.internal.s.j(runnable);
        t(new u5<>(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
