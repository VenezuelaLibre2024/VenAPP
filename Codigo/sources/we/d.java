package we;

import android.content.Context;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.o;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f29939a;

    /* renamed from: b, reason: collision with root package name */
    private final double f29940b;

    /* renamed from: c, reason: collision with root package name */
    private final double f29941c;

    /* renamed from: d, reason: collision with root package name */
    private a f29942d;

    /* renamed from: e, reason: collision with root package name */
    private a f29943e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29944f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        private static final re.a f29945k = re.a.e();

        /* renamed from: l, reason: collision with root package name */
        private static final long f29946l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a, reason: collision with root package name */
        private final com.google.firebase.perf.util.a f29947a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29948b;

        /* renamed from: c, reason: collision with root package name */
        private l f29949c;

        /* renamed from: d, reason: collision with root package name */
        private com.google.firebase.perf.util.i f29950d;

        /* renamed from: e, reason: collision with root package name */
        private long f29951e;

        /* renamed from: f, reason: collision with root package name */
        private double f29952f;

        /* renamed from: g, reason: collision with root package name */
        private com.google.firebase.perf.util.i f29953g;

        /* renamed from: h, reason: collision with root package name */
        private com.google.firebase.perf.util.i f29954h;

        /* renamed from: i, reason: collision with root package name */
        private long f29955i;

        /* renamed from: j, reason: collision with root package name */
        private long f29956j;

        a(com.google.firebase.perf.util.i iVar, long j10, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z10) {
            this.f29947a = aVar;
            this.f29951e = j10;
            this.f29950d = iVar;
            this.f29952f = j10;
            this.f29949c = aVar.a();
            g(aVar2, str, z10);
            this.f29948b = z10;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            long f10 = f(aVar, str);
            long e10 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.google.firebase.perf.util.i iVar = new com.google.firebase.perf.util.i(e10, f10, timeUnit);
            this.f29953g = iVar;
            this.f29955i = e10;
            if (z10) {
                f29945k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(e10));
            }
            long d10 = d(aVar, str);
            long c10 = c(aVar, str);
            com.google.firebase.perf.util.i iVar2 = new com.google.firebase.perf.util.i(c10, d10, timeUnit);
            this.f29954h = iVar2;
            this.f29956j = c10;
            if (z10) {
                f29945k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(c10));
            }
        }

        synchronized void a(boolean z10) {
            this.f29950d = z10 ? this.f29953g : this.f29954h;
            this.f29951e = z10 ? this.f29955i : this.f29956j;
        }

        synchronized boolean b(xe.i iVar) {
            l a10 = this.f29947a.a();
            double d10 = (this.f29949c.d(a10) * this.f29950d.a()) / f29946l;
            if (d10 > 0.0d) {
                this.f29952f = Math.min(this.f29952f + d10, this.f29951e);
                this.f29949c = a10;
            }
            double d11 = this.f29952f;
            if (d11 >= 1.0d) {
                this.f29952f = d11 - 1.0d;
                return true;
            }
            if (this.f29948b) {
                f29945k.j("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public d(Context context, com.google.firebase.perf.util.i iVar, long j10) {
        this(iVar, j10, new com.google.firebase.perf.util.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f29944f = o.b(context);
    }

    d(com.google.firebase.perf.util.i iVar, long j10, com.google.firebase.perf.util.a aVar, double d10, double d11, com.google.firebase.perf.config.a aVar2) {
        this.f29942d = null;
        this.f29943e = null;
        boolean z10 = false;
        this.f29944f = false;
        o.a(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f29940b = d10;
        this.f29941c = d11;
        this.f29939a = aVar2;
        this.f29942d = new a(iVar, j10, aVar, aVar2, "Trace", this.f29944f);
        this.f29943e = new a(iVar, j10, aVar, aVar2, "Network", this.f29944f);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean c(List<xe.k> list) {
        return list.size() > 0 && list.get(0).h0() > 0 && list.get(0).g0(0) == xe.l.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean d() {
        return this.f29941c < this.f29939a.f();
    }

    private boolean e() {
        return this.f29940b < this.f29939a.s();
    }

    private boolean f() {
        return this.f29940b < this.f29939a.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f29942d.a(z10);
        this.f29943e.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(xe.i iVar) {
        if (!j(iVar)) {
            return false;
        }
        if (iVar.j()) {
            return !this.f29943e.b(iVar);
        }
        if (iVar.m()) {
            return !this.f29942d.b(iVar);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(xe.i iVar) {
        if (iVar.m() && !f() && !c(iVar.p().A0())) {
            return false;
        }
        if (!i(iVar) || d() || c(iVar.p().A0())) {
            return !iVar.j() || e() || c(iVar.k().y0());
        }
        return false;
    }

    protected boolean i(xe.i iVar) {
        return iVar.m() && iVar.p().z0().startsWith("_st_") && iVar.p().p0("Hosting_activity");
    }

    boolean j(xe.i iVar) {
        return (!iVar.m() || (!(iVar.p().z0().equals(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString()) || iVar.p().z0().equals(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString())) || iVar.p().s0() <= 0)) && !iVar.i();
    }
}
