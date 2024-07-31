package p422we;

import android.content.Context;
import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.util.C6327a;
import com.google.firebase.perf.util.C6335i;
import com.google.firebase.perf.util.C6338l;
import com.google.firebase.perf.util.C6341o;
import com.google.firebase.perf.util.EnumC6329c;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p444xe.C12476i;
import p444xe.C12478k;
import p444xe.EnumC12479l;
import re.C10696a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: we.d */
/* loaded from: classes.dex */
public final class C12171d {

    /* renamed from: a */
    private final C6277a f32404a;

    /* renamed from: b */
    private final double f32405b;

    /* renamed from: c */
    private final double f32406c;

    /* renamed from: d */
    private a f32407d;

    /* renamed from: e */
    private a f32408e;

    /* renamed from: f */
    private boolean f32409f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: we.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k */
        private static final C10696a f32410k = C10696a.m32565e();

        /* renamed from: l */
        private static final long f32411l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        private final C6327a f32412a;

        /* renamed from: b */
        private final boolean f32413b;

        /* renamed from: c */
        private C6338l f32414c;

        /* renamed from: d */
        private C6335i f32415d;

        /* renamed from: e */
        private long f32416e;

        /* renamed from: f */
        private double f32417f;

        /* renamed from: g */
        private C6335i f32418g;

        /* renamed from: h */
        private C6335i f32419h;

        /* renamed from: i */
        private long f32420i;

        /* renamed from: j */
        private long f32421j;

        a(C6335i c6335i, long j10, C6327a c6327a, C6277a c6277a, String str, boolean z10) {
            this.f32412a = c6327a;
            this.f32416e = j10;
            this.f32415d = c6335i;
            this.f32417f = j10;
            this.f32414c = c6327a.m17508a();
            m39060g(c6277a, str, z10);
            this.f32413b = z10;
        }

        /* renamed from: c */
        private static long m39056c(C6277a c6277a, String str) {
            return str == "Trace" ? c6277a.m17279E() : c6277a.m17292q();
        }

        /* renamed from: d */
        private static long m39057d(C6277a c6277a, String str) {
            return str == "Trace" ? c6277a.m17295t() : c6277a.m17295t();
        }

        /* renamed from: e */
        private static long m39058e(C6277a c6277a, String str) {
            return str == "Trace" ? c6277a.m17280F() : c6277a.m17293r();
        }

        /* renamed from: f */
        private static long m39059f(C6277a c6277a, String str) {
            return str == "Trace" ? c6277a.m17295t() : c6277a.m17295t();
        }

        /* renamed from: g */
        private void m39060g(C6277a c6277a, String str, boolean z10) {
            long m39059f = m39059f(c6277a, str);
            long m39058e = m39058e(c6277a, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C6335i c6335i = new C6335i(m39058e, m39059f, timeUnit);
            this.f32418g = c6335i;
            this.f32420i = m39058e;
            if (z10) {
                f32410k.m32567b("Foreground %s logging rate:%f, burst capacity:%d", str, c6335i, Long.valueOf(m39058e));
            }
            long m39057d = m39057d(c6277a, str);
            long m39056c = m39056c(c6277a, str);
            C6335i c6335i2 = new C6335i(m39056c, m39057d, timeUnit);
            this.f32419h = c6335i2;
            this.f32421j = m39056c;
            if (z10) {
                f32410k.m32567b("Background %s logging rate:%f, capacity:%d", str, c6335i2, Long.valueOf(m39056c));
            }
        }

        /* renamed from: a */
        synchronized void m39061a(boolean z10) {
            this.f32415d = z10 ? this.f32418g : this.f32419h;
            this.f32416e = z10 ? this.f32420i : this.f32421j;
        }

        /* renamed from: b */
        synchronized boolean m39062b(C12476i c12476i) {
            C6338l m17508a = this.f32412a.m17508a();
            double m17533d = (this.f32414c.m17533d(m17508a) * this.f32415d.m17525a()) / f32411l;
            if (m17533d > 0.0d) {
                this.f32417f = Math.min(this.f32417f + m17533d, this.f32416e);
                this.f32414c = m17508a;
            }
            double d10 = this.f32417f;
            if (d10 >= 1.0d) {
                this.f32417f = d10 - 1.0d;
                return true;
            }
            if (this.f32413b) {
                f32410k.m32574j("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public C12171d(Context context, C6335i c6335i, long j10) {
        this(c6335i, j10, new C6327a(), m39046b(), m39046b(), C6277a.m17265g());
        this.f32409f = C6341o.m17541b(context);
    }

    C12171d(C6335i c6335i, long j10, C6327a c6327a, double d10, double d11, C6277a c6277a) {
        this.f32407d = null;
        this.f32408e = null;
        boolean z10 = false;
        this.f32409f = false;
        C6341o.m17540a(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        C6341o.m17540a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f32405b = d10;
        this.f32406c = d11;
        this.f32404a = c6277a;
        this.f32407d = new a(c6335i, j10, c6327a, c6277a, "Trace", this.f32409f);
        this.f32408e = new a(c6335i, j10, c6327a, c6277a, "Network", this.f32409f);
    }

    /* renamed from: b */
    static double m39046b() {
        return new Random().nextDouble();
    }

    /* renamed from: c */
    private boolean m39047c(List<C12478k> list) {
        return list.size() > 0 && list.get(0).m40692h0() > 0 && list.get(0).m40691g0(0) == EnumC12479l.GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: d */
    private boolean m39048d() {
        return this.f32406c < this.f32404a.m17287f();
    }

    /* renamed from: e */
    private boolean m39049e() {
        return this.f32405b < this.f32404a.m17294s();
    }

    /* renamed from: f */
    private boolean m39050f() {
        return this.f32405b < this.f32404a.m17281G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39051a(boolean z10) {
        this.f32407d.m39061a(z10);
        this.f32408e.m39061a(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m39052g(C12476i c12476i) {
        if (!m39055j(c12476i)) {
            return false;
        }
        if (c12476i.mo40675j()) {
            return !this.f32408e.m39062b(c12476i);
        }
        if (c12476i.mo40677m()) {
            return !this.f32407d.m39062b(c12476i);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m39053h(C12476i c12476i) {
        if (c12476i.mo40677m() && !m39050f() && !m39047c(c12476i.mo40678p().m40725A0())) {
            return false;
        }
        if (!m39054i(c12476i) || m39048d() || m39047c(c12476i.mo40678p().m40725A0())) {
            return !c12476i.mo40675j() || m39049e() || m39047c(c12476i.mo40676k().m40634y0());
        }
        return false;
    }

    /* renamed from: i */
    protected boolean m39054i(C12476i c12476i) {
        return c12476i.mo40677m() && c12476i.mo40678p().m40733z0().startsWith("_st_") && c12476i.mo40678p().m40728p0("Hosting_activity");
    }

    /* renamed from: j */
    boolean m39055j(C12476i c12476i) {
        return (!c12476i.mo40677m() || (!(c12476i.mo40678p().m40733z0().equals(EnumC6329c.FOREGROUND_TRACE_NAME.toString()) || c12476i.mo40678p().m40733z0().equals(EnumC6329c.BACKGROUND_TRACE_NAME.toString())) || c12476i.mo40678p().m40729s0() <= 0)) && !c12476i.mo40674i();
    }
}
