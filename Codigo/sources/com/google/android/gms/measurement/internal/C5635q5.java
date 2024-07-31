package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C5276s;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
/* loaded from: classes2.dex */
public final class C5635q5 extends AbstractC5688u6 {

    /* renamed from: l */
    private static final AtomicLong f11727l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C5674t5 f11728c;

    /* renamed from: d */
    private C5674t5 f11729d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C5687u5<?>> f11730e;

    /* renamed from: f */
    private final BlockingQueue<C5687u5<?>> f11731f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f11732g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f11733h;

    /* renamed from: i */
    private final Object f11734i;

    /* renamed from: j */
    private final Semaphore f11735j;

    /* renamed from: k */
    private volatile boolean f11736k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5635q5(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11734i = new Object();
        this.f11735j = new Semaphore(2);
        this.f11730e = new PriorityBlockingQueue<>();
        this.f11731f = new LinkedBlockingQueue();
        this.f11732g = new C5661s5(this, "Thread death: Uncaught exception on worker thread");
        this.f11733h = new C5661s5(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: t */
    private final void m14238t(C5687u5<?> c5687u5) {
        synchronized (this.f11734i) {
            this.f11730e.add(c5687u5);
            C5674t5 c5674t5 = this.f11728c;
            if (c5674t5 == null) {
                C5674t5 c5674t52 = new C5674t5(this, "Measurement Worker", this.f11730e);
                this.f11728c = c5674t52;
                c5674t52.setUncaughtExceptionHandler(this.f11732g);
                this.f11728c.start();
            } else {
                c5674t5.m14344a();
            }
        }
    }

    /* renamed from: B */
    public final void m14242B(Runnable runnable) {
        m14356j();
        C5276s.m13324j(runnable);
        m14238t(new C5687u5<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: E */
    public final boolean m14243E() {
        return Thread.currentThread() == this.f11728c;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final void mo13683g() {
        if (Thread.currentThread() != this.f11729d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final void mo13687i() {
        if (Thread.currentThread() != this.f11728c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: n */
    protected final boolean mo14040n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final <T> T m14244q(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().m14248y(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzj().m14187G().m14218a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            zzj().m14187G().m14218a("Timed out waiting for " + str);
        }
        return t10;
    }

    /* renamed from: r */
    public final <V> Future<V> m14245r(Callable<V> callable) {
        m14356j();
        C5276s.m13324j(callable);
        C5687u5<?> c5687u5 = new C5687u5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11728c) {
            if (!this.f11730e.isEmpty()) {
                zzj().m14187G().m14218a("Callable skipped the worker queue.");
            }
            c5687u5.run();
        } else {
            m14238t(c5687u5);
        }
        return c5687u5;
    }

    /* renamed from: u */
    public final void m14246u(Runnable runnable) {
        m14356j();
        C5276s.m13324j(runnable);
        C5687u5<?> c5687u5 = new C5687u5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11734i) {
            this.f11731f.add(c5687u5);
            C5674t5 c5674t5 = this.f11729d;
            if (c5674t5 == null) {
                C5674t5 c5674t52 = new C5674t5(this, "Measurement Network", this.f11731f);
                this.f11729d = c5674t52;
                c5674t52.setUncaughtExceptionHandler(this.f11733h);
                this.f11729d.start();
            } else {
                c5674t5.m14344a();
            }
        }
    }

    /* renamed from: w */
    public final <V> Future<V> m14247w(Callable<V> callable) {
        m14356j();
        C5276s.m13324j(callable);
        C5687u5<?> c5687u5 = new C5687u5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11728c) {
            c5687u5.run();
        } else {
            m14238t(c5687u5);
        }
        return c5687u5;
    }

    /* renamed from: y */
    public final void m14248y(Runnable runnable) {
        m14356j();
        C5276s.m13324j(runnable);
        m14238t(new C5687u5<>(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
