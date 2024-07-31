package p026b8;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.C5101a;
import com.google.common.collect.C5867e0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p010a8.InterfaceC0049g;
import p026b8.C1673c;
import p026b8.C1677g;
import p026b8.C1678h;
import p026b8.C1680j;
import p026b8.InterfaceC1682l;
import p351s8.C10810a0;
import p351s8.C10818e0;
import p351s8.C10822g0;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10827j;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11731u;
import p397v7.C11737x;
import p397v7.InterfaceC11705h0;

/* renamed from: b8.c */
/* loaded from: classes.dex */
public final class C1673c implements InterfaceC1682l, C10818e0.b<C10822g0<AbstractC1679i>> {

    /* renamed from: A */
    public static final InterfaceC1682l.a f7080A = new InterfaceC1682l.a() { // from class: b8.b
        @Override // p026b8.InterfaceC1682l.a
        /* renamed from: a */
        public final InterfaceC1682l mo9167a(InterfaceC0049g interfaceC0049g, InterfaceC10816d0 interfaceC10816d0, InterfaceC1681k interfaceC1681k) {
            return new C1673c(interfaceC0049g, interfaceC10816d0, interfaceC1681k);
        }
    };

    /* renamed from: a */
    private final InterfaceC0049g f7081a;

    /* renamed from: b */
    private final InterfaceC1681k f7082b;

    /* renamed from: c */
    private final InterfaceC10816d0 f7083c;

    /* renamed from: d */
    private final HashMap<Uri, c> f7084d;

    /* renamed from: e */
    private final CopyOnWriteArrayList<InterfaceC1682l.b> f7085e;

    /* renamed from: f */
    private final double f7086f;

    /* renamed from: r */
    private InterfaceC11705h0.a f7087r;

    /* renamed from: s */
    private C10818e0 f7088s;

    /* renamed from: t */
    private Handler f7089t;

    /* renamed from: u */
    private InterfaceC1682l.e f7090u;

    /* renamed from: v */
    private C1678h f7091v;

    /* renamed from: w */
    private Uri f7092w;

    /* renamed from: x */
    private C1677g f7093x;

    /* renamed from: y */
    private boolean f7094y;

    /* renamed from: z */
    private long f7095z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b8.c$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC1682l.b {
        private b() {
        }

        @Override // p026b8.InterfaceC1682l.b
        /* renamed from: a */
        public boolean mo244a(Uri uri, InterfaceC10816d0.c cVar, boolean z10) {
            c cVar2;
            if (C1673c.this.f7093x == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<C1678h.b> list = ((C1678h) C11172r0.m34928j(C1673c.this.f7091v)).f7156e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c cVar3 = (c) C1673c.this.f7084d.get(list.get(i11).f7169a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f7104s) {
                        i10++;
                    }
                }
                InterfaceC10816d0.b mo32953b = C1673c.this.f7083c.mo32953b(new InterfaceC10816d0.a(1, 0, C1673c.this.f7091v.f7156e.size(), i10), cVar);
                if (mo32953b != null && mo32953b.f27327a == 2 && (cVar2 = (c) C1673c.this.f7084d.get(uri)) != null) {
                    cVar2.m9216j(mo32953b.f27328b);
                }
            }
            return false;
        }

        @Override // p026b8.InterfaceC1682l.b
        /* renamed from: d */
        public void mo247d() {
            C1673c.this.f7085e.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b8.c$c */
    /* loaded from: classes.dex */
    public final class c implements C10818e0.b<C10822g0<AbstractC1679i>> {

        /* renamed from: a */
        private final Uri f7097a;

        /* renamed from: b */
        private final C10818e0 f7098b = new C10818e0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        private final InterfaceC10827j f7099c;

        /* renamed from: d */
        private C1677g f7100d;

        /* renamed from: e */
        private long f7101e;

        /* renamed from: f */
        private long f7102f;

        /* renamed from: r */
        private long f7103r;

        /* renamed from: s */
        private long f7104s;

        /* renamed from: t */
        private boolean f7105t;

        /* renamed from: u */
        private IOException f7106u;

        public c(Uri uri) {
            this.f7097a = uri;
            this.f7099c = C1673c.this.f7081a.mo169a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public boolean m9216j(long j10) {
            this.f7104s = SystemClock.elapsedRealtime() + j10;
            return this.f7097a.equals(C1673c.this.f7092w) && !C1673c.this.m9179L();
        }

        /* renamed from: k */
        private Uri m9217k() {
            C1677g c1677g = this.f7100d;
            if (c1677g != null) {
                C1677g.f fVar = c1677g.f7130v;
                if (fVar.f7149a != -9223372036854775807L || fVar.f7153e) {
                    Uri.Builder buildUpon = this.f7097a.buildUpon();
                    C1677g c1677g2 = this.f7100d;
                    if (c1677g2.f7130v.f7153e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1677g2.f7119k + c1677g2.f7126r.size()));
                        C1677g c1677g3 = this.f7100d;
                        if (c1677g3.f7122n != -9223372036854775807L) {
                            List<C1677g.b> list = c1677g3.f7127s;
                            int size = list.size();
                            if (!list.isEmpty() && ((C1677g.b) C5867e0.m14838d(list)).f7132x) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C1677g.f fVar2 = this.f7100d.f7130v;
                    if (fVar2.f7149a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f7150b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f7097a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m9218o(Uri uri) {
            this.f7105t = false;
            m9219q(uri);
        }

        /* renamed from: q */
        private void m9219q(Uri uri) {
            C10822g0 c10822g0 = new C10822g0(this.f7099c, uri, 4, C1673c.this.f7082b.mo9165a(C1673c.this.f7091v, this.f7100d));
            C1673c.this.f7087r.m36899z(new C11731u(c10822g0.f27367a, c10822g0.f27368b, this.f7098b.m32984n(c10822g0, this, C1673c.this.f7083c.mo32952a(c10822g0.f27369c))), c10822g0.f27369c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public void m9220r(final Uri uri) {
            this.f7104s = 0L;
            if (this.f7105t || this.f7098b.m32980j() || this.f7098b.m32979i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f7103r) {
                m9219q(uri);
            } else {
                this.f7105t = true;
                C1673c.this.f7089t.postDelayed(new Runnable() { // from class: b8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1673c.c.this.m9218o(uri);
                    }
                }, this.f7103r - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public void m9221w(C1677g c1677g, C11731u c11731u) {
            IOException dVar;
            boolean z10;
            C1677g c1677g2 = this.f7100d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f7101e = elapsedRealtime;
            C1677g m9174G = C1673c.this.m9174G(c1677g2, c1677g);
            this.f7100d = m9174G;
            if (m9174G != c1677g2) {
                this.f7106u = null;
                this.f7102f = elapsedRealtime;
                C1673c.this.m9182R(this.f7097a, m9174G);
            } else if (!m9174G.f7123o) {
                long size = c1677g.f7119k + c1677g.f7126r.size();
                C1677g c1677g3 = this.f7100d;
                if (size < c1677g3.f7119k) {
                    dVar = new InterfaceC1682l.c(this.f7097a);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f7102f)) > ((double) C11172r0.m34910a1(c1677g3.f7121m)) * C1673c.this.f7086f ? new InterfaceC1682l.d(this.f7097a) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f7106u = dVar;
                    C1673c.this.m9181N(this.f7097a, new InterfaceC10816d0.c(c11731u, new C11737x(4), dVar, 1), z10);
                }
            }
            C1677g c1677g4 = this.f7100d;
            this.f7103r = elapsedRealtime + C11172r0.m34910a1(!c1677g4.f7130v.f7153e ? c1677g4 != c1677g2 ? c1677g4.f7121m : c1677g4.f7121m / 2 : 0L);
            if (!(this.f7100d.f7122n != -9223372036854775807L || this.f7097a.equals(C1673c.this.f7092w)) || this.f7100d.f7123o) {
                return;
            }
            m9220r(m9217k());
        }

        /* renamed from: l */
        public C1677g m9222l() {
            return this.f7100d;
        }

        /* renamed from: n */
        public boolean m9223n() {
            int i10;
            if (this.f7100d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C11172r0.m34910a1(this.f7100d.f7129u));
            C1677g c1677g = this.f7100d;
            return c1677g.f7123o || (i10 = c1677g.f7112d) == 2 || i10 == 1 || this.f7101e + max > elapsedRealtime;
        }

        /* renamed from: p */
        public void m9224p() {
            m9220r(this.f7097a);
        }

        /* renamed from: s */
        public void m9225s() {
            this.f7098b.mo11869a();
            IOException iOException = this.f7106u;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo313i(C10822g0<AbstractC1679i> c10822g0, long j10, long j11, boolean z10) {
            C11731u c11731u = new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10822g0.m33001f(), c10822g0.m32999d(), j10, j11, c10822g0.m32998a());
            C1673c.this.f7083c.m32954c(c10822g0.f27367a);
            C1673c.this.f7087r.m36890q(c11731u, 4);
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo317m(C10822g0<AbstractC1679i> c10822g0, long j10, long j11) {
            AbstractC1679i m33000e = c10822g0.m33000e();
            C11731u c11731u = new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10822g0.m33001f(), c10822g0.m32999d(), j10, j11, c10822g0.m32998a());
            if (m33000e instanceof C1677g) {
                m9221w((C1677g) m33000e, c11731u);
                C1673c.this.f7087r.m36893t(c11731u, 4);
            } else {
                this.f7106u = C11005b3.m33717c("Loaded playlist has unexpected type.", null);
                C1673c.this.f7087r.m36897x(c11731u, 4, this.f7106u, true);
            }
            C1673c.this.f7083c.m32954c(c10822g0.f27367a);
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C10818e0.c mo311h(C10822g0<AbstractC1679i> c10822g0, long j10, long j11, IOException iOException, int i10) {
            C10818e0.c cVar;
            C11731u c11731u = new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10822g0.m33001f(), c10822g0.m32999d(), j10, j11, c10822g0.m32998a());
            boolean z10 = iOException instanceof C1680j.a;
            if ((c10822g0.m33001f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof C10810a0 ? ((C10810a0) iOException).f27306d : C5101a.e.API_PRIORITY_OTHER;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f7103r = SystemClock.elapsedRealtime();
                    m9224p();
                    ((InterfaceC11705h0.a) C11172r0.m34928j(C1673c.this.f7087r)).m36897x(c11731u, c10822g0.f27369c, iOException, true);
                    return C10818e0.f27339f;
                }
            }
            InterfaceC10816d0.c cVar2 = new InterfaceC10816d0.c(c11731u, new C11737x(c10822g0.f27369c), iOException, i10);
            if (C1673c.this.m9181N(this.f7097a, cVar2, false)) {
                long mo32955d = C1673c.this.f7083c.mo32955d(cVar2);
                cVar = mo32955d != -9223372036854775807L ? C10818e0.m32976h(false, mo32955d) : C10818e0.f27340g;
            } else {
                cVar = C10818e0.f27339f;
            }
            boolean m32987c = true ^ cVar.m32987c();
            C1673c.this.f7087r.m36897x(c11731u, c10822g0.f27369c, iOException, m32987c);
            if (m32987c) {
                C1673c.this.f7083c.m32954c(c10822g0.f27367a);
            }
            return cVar;
        }

        /* renamed from: x */
        public void m9229x() {
            this.f7098b.m32982l();
        }
    }

    public C1673c(InterfaceC0049g interfaceC0049g, InterfaceC10816d0 interfaceC10816d0, InterfaceC1681k interfaceC1681k) {
        this(interfaceC0049g, interfaceC10816d0, interfaceC1681k, 3.5d);
    }

    public C1673c(InterfaceC0049g interfaceC0049g, InterfaceC10816d0 interfaceC10816d0, InterfaceC1681k interfaceC1681k, double d10) {
        this.f7081a = interfaceC0049g;
        this.f7082b = interfaceC1681k;
        this.f7083c = interfaceC10816d0;
        this.f7086f = d10;
        this.f7085e = new CopyOnWriteArrayList<>();
        this.f7084d = new HashMap<>();
        this.f7095z = -9223372036854775807L;
    }

    /* renamed from: E */
    private void m9172E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f7084d.put(uri, new c(uri));
        }
    }

    /* renamed from: F */
    private static C1677g.d m9173F(C1677g c1677g, C1677g c1677g2) {
        int i10 = (int) (c1677g2.f7119k - c1677g.f7119k);
        List<C1677g.d> list = c1677g.f7126r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public C1677g m9174G(C1677g c1677g, C1677g c1677g2) {
        return !c1677g2.m9235f(c1677g) ? c1677g2.f7123o ? c1677g.m9233d() : c1677g : c1677g2.m9232c(m9176I(c1677g, c1677g2), m9175H(c1677g, c1677g2));
    }

    /* renamed from: H */
    private int m9175H(C1677g c1677g, C1677g c1677g2) {
        C1677g.d m9173F;
        if (c1677g2.f7117i) {
            return c1677g2.f7118j;
        }
        C1677g c1677g3 = this.f7093x;
        int i10 = c1677g3 != null ? c1677g3.f7118j : 0;
        return (c1677g == null || (m9173F = m9173F(c1677g, c1677g2)) == null) ? i10 : (c1677g.f7118j + m9173F.f7141d) - c1677g2.f7126r.get(0).f7141d;
    }

    /* renamed from: I */
    private long m9176I(C1677g c1677g, C1677g c1677g2) {
        if (c1677g2.f7124p) {
            return c1677g2.f7116h;
        }
        C1677g c1677g3 = this.f7093x;
        long j10 = c1677g3 != null ? c1677g3.f7116h : 0L;
        if (c1677g == null) {
            return j10;
        }
        int size = c1677g.f7126r.size();
        C1677g.d m9173F = m9173F(c1677g, c1677g2);
        return m9173F != null ? c1677g.f7116h + m9173F.f7142e : ((long) size) == c1677g2.f7119k - c1677g.f7119k ? c1677g.m9234e() : j10;
    }

    /* renamed from: J */
    private Uri m9177J(Uri uri) {
        C1677g.c cVar;
        C1677g c1677g = this.f7093x;
        if (c1677g == null || !c1677g.f7130v.f7153e || (cVar = c1677g.f7128t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f7134b));
        int i10 = cVar.f7135c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    /* renamed from: K */
    private boolean m9178K(Uri uri) {
        List<C1678h.b> list = this.f7091v.f7156e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f7169a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public boolean m9179L() {
        List<C1678h.b> list = this.f7091v.f7156e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) C11137a.m34603e(this.f7084d.get(list.get(i10).f7169a));
            if (elapsedRealtime > cVar.f7104s) {
                Uri uri = cVar.f7097a;
                this.f7092w = uri;
                cVar.m9220r(m9177J(uri));
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    private void m9180M(Uri uri) {
        if (uri.equals(this.f7092w) || !m9178K(uri)) {
            return;
        }
        C1677g c1677g = this.f7093x;
        if (c1677g == null || !c1677g.f7123o) {
            this.f7092w = uri;
            c cVar = this.f7084d.get(uri);
            C1677g c1677g2 = cVar.f7100d;
            if (c1677g2 == null || !c1677g2.f7123o) {
                cVar.m9220r(m9177J(uri));
            } else {
                this.f7093x = c1677g2;
                this.f7090u.mo9277r(c1677g2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public boolean m9181N(Uri uri, InterfaceC10816d0.c cVar, boolean z10) {
        Iterator<InterfaceC1682l.b> it = this.f7085e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().mo244a(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m9182R(Uri uri, C1677g c1677g) {
        if (uri.equals(this.f7092w)) {
            if (this.f7093x == null) {
                this.f7094y = !c1677g.f7123o;
                this.f7095z = c1677g.f7116h;
            }
            this.f7093x = c1677g;
            this.f7090u.mo9277r(c1677g);
        }
        Iterator<InterfaceC1682l.b> it = this.f7085e.iterator();
        while (it.hasNext()) {
            it.next().mo247d();
        }
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo313i(C10822g0<AbstractC1679i> c10822g0, long j10, long j11, boolean z10) {
        C11731u c11731u = new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10822g0.m33001f(), c10822g0.m32999d(), j10, j11, c10822g0.m32998a());
        this.f7083c.m32954c(c10822g0.f27367a);
        this.f7087r.m36890q(c11731u, 4);
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo317m(C10822g0<AbstractC1679i> c10822g0, long j10, long j11) {
        AbstractC1679i m33000e = c10822g0.m33000e();
        boolean z10 = m33000e instanceof C1677g;
        C1678h m9241e = z10 ? C1678h.m9241e(m33000e.f7175a) : (C1678h) m33000e;
        this.f7091v = m9241e;
        this.f7092w = m9241e.f7156e.get(0).f7169a;
        this.f7085e.add(new b());
        m9172E(m9241e.f7155d);
        C11731u c11731u = new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10822g0.m33001f(), c10822g0.m32999d(), j10, j11, c10822g0.m32998a());
        c cVar = this.f7084d.get(this.f7092w);
        if (z10) {
            cVar.m9221w((C1677g) m33000e, c11731u);
        } else {
            cVar.m9224p();
        }
        this.f7083c.m32954c(c10822g0.f27367a);
        this.f7087r.m36893t(c11731u, 4);
    }

    @Override // p351s8.C10818e0.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C10818e0.c mo311h(C10822g0<AbstractC1679i> c10822g0, long j10, long j11, IOException iOException, int i10) {
        C11731u c11731u = new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10822g0.m33001f(), c10822g0.m32999d(), j10, j11, c10822g0.m32998a());
        long mo32955d = this.f7083c.mo32955d(new InterfaceC10816d0.c(c11731u, new C11737x(c10822g0.f27369c), iOException, i10));
        boolean z10 = mo32955d == -9223372036854775807L;
        this.f7087r.m36897x(c11731u, c10822g0.f27369c, iOException, z10);
        if (z10) {
            this.f7083c.m32954c(c10822g0.f27367a);
        }
        return z10 ? C10818e0.f27340g : C10818e0.m32976h(false, mo32955d);
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: a */
    public void mo9197a(InterfaceC1682l.b bVar) {
        C11137a.m34603e(bVar);
        this.f7085e.add(bVar);
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: b */
    public void mo9198b(Uri uri) {
        this.f7084d.get(uri).m9225s();
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: c */
    public long mo9199c() {
        return this.f7095z;
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: d */
    public void mo9200d(Uri uri, InterfaceC11705h0.a aVar, InterfaceC1682l.e eVar) {
        this.f7089t = C11172r0.m34954w();
        this.f7087r = aVar;
        this.f7090u = eVar;
        C10822g0 c10822g0 = new C10822g0(this.f7081a.mo169a(4), uri, 4, this.f7082b.mo9166b());
        C11137a.m34605g(this.f7088s == null);
        C10818e0 c10818e0 = new C10818e0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f7088s = c10818e0;
        aVar.m36899z(new C11731u(c10822g0.f27367a, c10822g0.f27368b, c10818e0.m32984n(c10822g0, this, this.f7083c.mo32952a(c10822g0.f27369c))), c10822g0.f27369c);
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: e */
    public C1678h mo9201e() {
        return this.f7091v;
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: f */
    public void mo9202f(Uri uri) {
        this.f7084d.get(uri).m9224p();
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: g */
    public boolean mo9203g(Uri uri) {
        return this.f7084d.get(uri).m9223n();
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: j */
    public boolean mo9204j() {
        return this.f7094y;
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: k */
    public boolean mo9205k(Uri uri, long j10) {
        if (this.f7084d.get(uri) != null) {
            return !r2.m9216j(j10);
        }
        return false;
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: l */
    public void mo9206l() {
        C10818e0 c10818e0 = this.f7088s;
        if (c10818e0 != null) {
            c10818e0.mo11869a();
        }
        Uri uri = this.f7092w;
        if (uri != null) {
            mo9198b(uri);
        }
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: n */
    public void mo9207n(InterfaceC1682l.b bVar) {
        this.f7085e.remove(bVar);
    }

    @Override // p026b8.InterfaceC1682l
    /* renamed from: o */
    public C1677g mo9208o(Uri uri, boolean z10) {
        C1677g m9222l = this.f7084d.get(uri).m9222l();
        if (m9222l != null && z10) {
            m9180M(uri);
        }
        return m9222l;
    }

    @Override // p026b8.InterfaceC1682l
    public void stop() {
        this.f7092w = null;
        this.f7093x = null;
        this.f7091v = null;
        this.f7095z = -9223372036854775807L;
        this.f7088s.m32982l();
        this.f7088s = null;
        Iterator<c> it = this.f7084d.values().iterator();
        while (it.hasNext()) {
            it.next().m9229x();
        }
        this.f7089t.removeCallbacksAndMessages(null);
        this.f7089t = null;
        this.f7084d.clear();
    }
}
