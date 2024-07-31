package io.grpc.internal;

import io.grpc.internal.InterfaceC8895s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7164t;

/* renamed from: io.grpc.internal.u0 */
/* loaded from: classes3.dex */
public class C8902u0 {

    /* renamed from: g */
    private static final Logger f20912g = Logger.getLogger(C8902u0.class.getName());

    /* renamed from: a */
    private final long f20913a;

    /* renamed from: b */
    private final C7164t f20914b;

    /* renamed from: c */
    private Map<InterfaceC8895s.a, Executor> f20915c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f20916d;

    /* renamed from: e */
    private Throwable f20917e;

    /* renamed from: f */
    private long f20918f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.u0$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8895s.a f20919a;

        /* renamed from: b */
        final /* synthetic */ long f20920b;

        a(InterfaceC8895s.a aVar, long j10) {
            this.f20919a = aVar;
            this.f20920b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20919a.mo25315b(this.f20920b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.u0$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8895s.a f20921a;

        /* renamed from: b */
        final /* synthetic */ Throwable f20922b;

        b(InterfaceC8895s.a aVar, Throwable th2) {
            this.f20921a = aVar;
            this.f20922b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20921a.mo25314a(this.f20922b);
        }
    }

    public C8902u0(long j10, C7164t c7164t) {
        this.f20913a = j10;
        this.f20914b = c7164t;
    }

    /* renamed from: b */
    private static Runnable m25855b(InterfaceC8895s.a aVar, long j10) {
        return new a(aVar, j10);
    }

    /* renamed from: c */
    private static Runnable m25856c(InterfaceC8895s.a aVar, Throwable th2) {
        return new b(aVar, th2);
    }

    /* renamed from: e */
    private static void m25857e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th2) {
            f20912g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
        }
    }

    /* renamed from: g */
    public static void m25858g(InterfaceC8895s.a aVar, Executor executor, Throwable th2) {
        m25857e(executor, m25856c(aVar, th2));
    }

    /* renamed from: a */
    public void m25859a(InterfaceC8895s.a aVar, Executor executor) {
        synchronized (this) {
            if (!this.f20916d) {
                this.f20915c.put(aVar, executor);
            } else {
                Throwable th2 = this.f20917e;
                m25857e(executor, th2 != null ? m25856c(aVar, th2) : m25855b(aVar, this.f20918f));
            }
        }
    }

    /* renamed from: d */
    public boolean m25860d() {
        synchronized (this) {
            if (this.f20916d) {
                return false;
            }
            this.f20916d = true;
            long m21345d = this.f20914b.m21345d(TimeUnit.NANOSECONDS);
            this.f20918f = m21345d;
            Map<InterfaceC8895s.a, Executor> map = this.f20915c;
            this.f20915c = null;
            for (Map.Entry<InterfaceC8895s.a, Executor> entry : map.entrySet()) {
                m25857e(entry.getValue(), m25855b(entry.getKey(), m21345d));
            }
            return true;
        }
    }

    /* renamed from: f */
    public void m25861f(Throwable th2) {
        synchronized (this) {
            if (this.f20916d) {
                return;
            }
            this.f20916d = true;
            this.f20917e = th2;
            Map<InterfaceC8895s.a, Executor> map = this.f20915c;
            this.f20915c = null;
            for (Map.Entry<InterfaceC8895s.a, Executor> entry : map.entrySet()) {
                m25858g(entry.getKey(), entry.getValue(), th2);
            }
        }
    }

    /* renamed from: h */
    public long m25862h() {
        return this.f20913a;
    }
}
