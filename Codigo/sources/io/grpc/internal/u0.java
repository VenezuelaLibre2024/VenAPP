package io.grpc.internal;

import io.grpc.internal.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class u0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f19165g = Logger.getLogger(u0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final long f19166a;

    /* renamed from: b, reason: collision with root package name */
    private final eb.t f19167b;

    /* renamed from: c, reason: collision with root package name */
    private Map<s.a, Executor> f19168c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f19169d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f19170e;

    /* renamed from: f, reason: collision with root package name */
    private long f19171f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.a f19172a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f19173b;

        a(s.a aVar, long j10) {
            this.f19172a = aVar;
            this.f19173b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19172a.b(this.f19173b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.a f19174a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f19175b;

        b(s.a aVar, Throwable th2) {
            this.f19174a = aVar;
            this.f19175b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19174a.a(this.f19175b);
        }
    }

    public u0(long j10, eb.t tVar) {
        this.f19166a = j10;
        this.f19167b = tVar;
    }

    private static Runnable b(s.a aVar, long j10) {
        return new a(aVar, j10);
    }

    private static Runnable c(s.a aVar, Throwable th2) {
        return new b(aVar, th2);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th2) {
            f19165g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
        }
    }

    public static void g(s.a aVar, Executor executor, Throwable th2) {
        e(executor, c(aVar, th2));
    }

    public void a(s.a aVar, Executor executor) {
        synchronized (this) {
            if (!this.f19169d) {
                this.f19168c.put(aVar, executor);
            } else {
                Throwable th2 = this.f19170e;
                e(executor, th2 != null ? c(aVar, th2) : b(aVar, this.f19171f));
            }
        }
    }

    public boolean d() {
        synchronized (this) {
            if (this.f19169d) {
                return false;
            }
            this.f19169d = true;
            long d10 = this.f19167b.d(TimeUnit.NANOSECONDS);
            this.f19171f = d10;
            Map<s.a, Executor> map = this.f19168c;
            this.f19168c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                e(entry.getValue(), b(entry.getKey(), d10));
            }
            return true;
        }
    }

    public void f(Throwable th2) {
        synchronized (this) {
            if (this.f19169d) {
                return;
            }
            this.f19169d = true;
            this.f19170e = th2;
            Map<s.a, Executor> map = this.f19168c;
            this.f19168c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                g(entry.getKey(), entry.getValue(), th2);
            }
        }
    }

    public long h() {
        return this.f19166a;
    }
}
