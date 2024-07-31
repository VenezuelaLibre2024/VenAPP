package b8;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b8.c;
import b8.g;
import b8.h;
import b8.j;
import b8.l;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s8.a0;
import s8.d0;
import s8.e0;
import s8.g0;
import t6.b3;
import t8.r0;
import v7.h0;
import v7.u;
import v7.x;

/* loaded from: classes.dex */
public final class c implements l, e0.b<g0<i>> {
    public static final l.a A = new l.a() { // from class: b8.b
        @Override // b8.l.a
        public final l a(a8.g gVar, d0 d0Var, k kVar) {
            return new c(gVar, d0Var, kVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a8.g f6185a;

    /* renamed from: b, reason: collision with root package name */
    private final k f6186b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f6187c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<Uri, C0107c> f6188d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<l.b> f6189e;

    /* renamed from: f, reason: collision with root package name */
    private final double f6190f;

    /* renamed from: r, reason: collision with root package name */
    private h0.a f6191r;

    /* renamed from: s, reason: collision with root package name */
    private e0 f6192s;

    /* renamed from: t, reason: collision with root package name */
    private Handler f6193t;

    /* renamed from: u, reason: collision with root package name */
    private l.e f6194u;

    /* renamed from: v, reason: collision with root package name */
    private h f6195v;

    /* renamed from: w, reason: collision with root package name */
    private Uri f6196w;

    /* renamed from: x, reason: collision with root package name */
    private g f6197x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6198y;

    /* renamed from: z, reason: collision with root package name */
    private long f6199z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements l.b {
        private b() {
        }

        @Override // b8.l.b
        public boolean a(Uri uri, d0.c cVar, boolean z10) {
            C0107c c0107c;
            if (c.this.f6197x == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) r0.j(c.this.f6195v)).f6260e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0107c c0107c2 = (C0107c) c.this.f6188d.get(list.get(i11).f6273a);
                    if (c0107c2 != null && elapsedRealtime < c0107c2.f6208s) {
                        i10++;
                    }
                }
                d0.b b10 = c.this.f6187c.b(new d0.a(1, 0, c.this.f6195v.f6260e.size(), i10), cVar);
                if (b10 != null && b10.f25208a == 2 && (c0107c = (C0107c) c.this.f6188d.get(uri)) != null) {
                    c0107c.j(b10.f25209b);
                }
            }
            return false;
        }

        @Override // b8.l.b
        public void d() {
            c.this.f6189e.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b8.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0107c implements e0.b<g0<i>> {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f6201a;

        /* renamed from: b, reason: collision with root package name */
        private final e0 f6202b = new e0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c, reason: collision with root package name */
        private final s8.j f6203c;

        /* renamed from: d, reason: collision with root package name */
        private g f6204d;

        /* renamed from: e, reason: collision with root package name */
        private long f6205e;

        /* renamed from: f, reason: collision with root package name */
        private long f6206f;

        /* renamed from: r, reason: collision with root package name */
        private long f6207r;

        /* renamed from: s, reason: collision with root package name */
        private long f6208s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f6209t;

        /* renamed from: u, reason: collision with root package name */
        private IOException f6210u;

        public C0107c(Uri uri) {
            this.f6201a = uri;
            this.f6203c = c.this.f6185a.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(long j10) {
            this.f6208s = SystemClock.elapsedRealtime() + j10;
            return this.f6201a.equals(c.this.f6196w) && !c.this.L();
        }

        private Uri k() {
            g gVar = this.f6204d;
            if (gVar != null) {
                g.f fVar = gVar.f6234v;
                if (fVar.f6253a != -9223372036854775807L || fVar.f6257e) {
                    Uri.Builder buildUpon = this.f6201a.buildUpon();
                    g gVar2 = this.f6204d;
                    if (gVar2.f6234v.f6257e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f6223k + gVar2.f6230r.size()));
                        g gVar3 = this.f6204d;
                        if (gVar3.f6226n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f6231s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) com.google.common.collect.e0.d(list)).f6236x) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f6204d.f6234v;
                    if (fVar2.f6253a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f6254b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f6201a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(Uri uri) {
            this.f6209t = false;
            q(uri);
        }

        private void q(Uri uri) {
            g0 g0Var = new g0(this.f6203c, uri, 4, c.this.f6186b.a(c.this.f6195v, this.f6204d));
            c.this.f6191r.z(new u(g0Var.f25248a, g0Var.f25249b, this.f6202b.n(g0Var, this, c.this.f6187c.a(g0Var.f25250c))), g0Var.f25250c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(final Uri uri) {
            this.f6208s = 0L;
            if (this.f6209t || this.f6202b.j() || this.f6202b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f6207r) {
                q(uri);
            } else {
                this.f6209t = true;
                c.this.f6193t.postDelayed(new Runnable() { // from class: b8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0107c.this.o(uri);
                    }
                }, this.f6207r - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(g gVar, u uVar) {
            IOException dVar;
            boolean z10;
            g gVar2 = this.f6204d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f6205e = elapsedRealtime;
            g G = c.this.G(gVar2, gVar);
            this.f6204d = G;
            if (G != gVar2) {
                this.f6210u = null;
                this.f6206f = elapsedRealtime;
                c.this.R(this.f6201a, G);
            } else if (!G.f6227o) {
                long size = gVar.f6223k + gVar.f6230r.size();
                g gVar3 = this.f6204d;
                if (size < gVar3.f6223k) {
                    dVar = new l.c(this.f6201a);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f6206f)) > ((double) r0.a1(gVar3.f6225m)) * c.this.f6190f ? new l.d(this.f6201a) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f6210u = dVar;
                    c.this.N(this.f6201a, new d0.c(uVar, new x(4), dVar, 1), z10);
                }
            }
            g gVar4 = this.f6204d;
            this.f6207r = elapsedRealtime + r0.a1(!gVar4.f6234v.f6257e ? gVar4 != gVar2 ? gVar4.f6225m : gVar4.f6225m / 2 : 0L);
            if (!(this.f6204d.f6226n != -9223372036854775807L || this.f6201a.equals(c.this.f6196w)) || this.f6204d.f6227o) {
                return;
            }
            r(k());
        }

        public g l() {
            return this.f6204d;
        }

        public boolean n() {
            int i10;
            if (this.f6204d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, r0.a1(this.f6204d.f6233u));
            g gVar = this.f6204d;
            return gVar.f6227o || (i10 = gVar.f6216d) == 2 || i10 == 1 || this.f6205e + max > elapsedRealtime;
        }

        public void p() {
            r(this.f6201a);
        }

        public void s() {
            this.f6202b.a();
            IOException iOException = this.f6210u;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // s8.e0.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(g0<i> g0Var, long j10, long j11, boolean z10) {
            u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
            c.this.f6187c.c(g0Var.f25248a);
            c.this.f6191r.q(uVar, 4);
        }

        @Override // s8.e0.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void m(g0<i> g0Var, long j10, long j11) {
            i e10 = g0Var.e();
            u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
            if (e10 instanceof g) {
                w((g) e10, uVar);
                c.this.f6191r.t(uVar, 4);
            } else {
                this.f6210u = b3.c("Loaded playlist has unexpected type.", null);
                c.this.f6191r.x(uVar, 4, this.f6210u, true);
            }
            c.this.f6187c.c(g0Var.f25248a);
        }

        @Override // s8.e0.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public e0.c h(g0<i> g0Var, long j10, long j11, IOException iOException, int i10) {
            e0.c cVar;
            u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
            boolean z10 = iOException instanceof j.a;
            if ((g0Var.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof a0 ? ((a0) iOException).f25187d : a.e.API_PRIORITY_OTHER;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f6207r = SystemClock.elapsedRealtime();
                    p();
                    ((h0.a) r0.j(c.this.f6191r)).x(uVar, g0Var.f25250c, iOException, true);
                    return e0.f25220f;
                }
            }
            d0.c cVar2 = new d0.c(uVar, new x(g0Var.f25250c), iOException, i10);
            if (c.this.N(this.f6201a, cVar2, false)) {
                long d10 = c.this.f6187c.d(cVar2);
                cVar = d10 != -9223372036854775807L ? e0.h(false, d10) : e0.f25221g;
            } else {
                cVar = e0.f25220f;
            }
            boolean c10 = true ^ cVar.c();
            c.this.f6191r.x(uVar, g0Var.f25250c, iOException, c10);
            if (c10) {
                c.this.f6187c.c(g0Var.f25248a);
            }
            return cVar;
        }

        public void x() {
            this.f6202b.l();
        }
    }

    public c(a8.g gVar, d0 d0Var, k kVar) {
        this(gVar, d0Var, kVar, 3.5d);
    }

    public c(a8.g gVar, d0 d0Var, k kVar, double d10) {
        this.f6185a = gVar;
        this.f6186b = kVar;
        this.f6187c = d0Var;
        this.f6190f = d10;
        this.f6189e = new CopyOnWriteArrayList<>();
        this.f6188d = new HashMap<>();
        this.f6199z = -9223372036854775807L;
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f6188d.put(uri, new C0107c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f6223k - gVar.f6223k);
        List<g.d> list = gVar.f6230r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g G(g gVar, g gVar2) {
        return !gVar2.f(gVar) ? gVar2.f6227o ? gVar.d() : gVar : gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
    }

    private int H(g gVar, g gVar2) {
        g.d F;
        if (gVar2.f6221i) {
            return gVar2.f6222j;
        }
        g gVar3 = this.f6197x;
        int i10 = gVar3 != null ? gVar3.f6222j : 0;
        return (gVar == null || (F = F(gVar, gVar2)) == null) ? i10 : (gVar.f6222j + F.f6245d) - gVar2.f6230r.get(0).f6245d;
    }

    private long I(g gVar, g gVar2) {
        if (gVar2.f6228p) {
            return gVar2.f6220h;
        }
        g gVar3 = this.f6197x;
        long j10 = gVar3 != null ? gVar3.f6220h : 0L;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f6230r.size();
        g.d F = F(gVar, gVar2);
        return F != null ? gVar.f6220h + F.f6246e : ((long) size) == gVar2.f6223k - gVar.f6223k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f6197x;
        if (gVar == null || !gVar.f6234v.f6257e || (cVar = gVar.f6232t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f6238b));
        int i10 = cVar.f6239c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<h.b> list = this.f6195v.f6260e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f6273a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        List<h.b> list = this.f6195v.f6260e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0107c c0107c = (C0107c) t8.a.e(this.f6188d.get(list.get(i10).f6273a));
            if (elapsedRealtime > c0107c.f6208s) {
                Uri uri = c0107c.f6201a;
                this.f6196w = uri;
                c0107c.r(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f6196w) || !K(uri)) {
            return;
        }
        g gVar = this.f6197x;
        if (gVar == null || !gVar.f6227o) {
            this.f6196w = uri;
            C0107c c0107c = this.f6188d.get(uri);
            g gVar2 = c0107c.f6204d;
            if (gVar2 == null || !gVar2.f6227o) {
                c0107c.r(J(uri));
            } else {
                this.f6197x = gVar2;
                this.f6194u.r(gVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(Uri uri, d0.c cVar, boolean z10) {
        Iterator<l.b> it = this.f6189e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().a(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f6196w)) {
            if (this.f6197x == null) {
                this.f6198y = !gVar.f6227o;
                this.f6199z = gVar.f6220h;
            }
            this.f6197x = gVar;
            this.f6194u.r(gVar);
        }
        Iterator<l.b> it = this.f6189e.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // s8.e0.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void i(g0<i> g0Var, long j10, long j11, boolean z10) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        this.f6187c.c(g0Var.f25248a);
        this.f6191r.q(uVar, 4);
    }

    @Override // s8.e0.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m(g0<i> g0Var, long j10, long j11) {
        i e10 = g0Var.e();
        boolean z10 = e10 instanceof g;
        h e11 = z10 ? h.e(e10.f6279a) : (h) e10;
        this.f6195v = e11;
        this.f6196w = e11.f6260e.get(0).f6273a;
        this.f6189e.add(new b());
        E(e11.f6259d);
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        C0107c c0107c = this.f6188d.get(this.f6196w);
        if (z10) {
            c0107c.w((g) e10, uVar);
        } else {
            c0107c.p();
        }
        this.f6187c.c(g0Var.f25248a);
        this.f6191r.t(uVar, 4);
    }

    @Override // s8.e0.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public e0.c h(g0<i> g0Var, long j10, long j11, IOException iOException, int i10) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        long d10 = this.f6187c.d(new d0.c(uVar, new x(g0Var.f25250c), iOException, i10));
        boolean z10 = d10 == -9223372036854775807L;
        this.f6191r.x(uVar, g0Var.f25250c, iOException, z10);
        if (z10) {
            this.f6187c.c(g0Var.f25248a);
        }
        return z10 ? e0.f25221g : e0.h(false, d10);
    }

    @Override // b8.l
    public void a(l.b bVar) {
        t8.a.e(bVar);
        this.f6189e.add(bVar);
    }

    @Override // b8.l
    public void b(Uri uri) {
        this.f6188d.get(uri).s();
    }

    @Override // b8.l
    public long c() {
        return this.f6199z;
    }

    @Override // b8.l
    public void d(Uri uri, h0.a aVar, l.e eVar) {
        this.f6193t = r0.w();
        this.f6191r = aVar;
        this.f6194u = eVar;
        g0 g0Var = new g0(this.f6185a.a(4), uri, 4, this.f6186b.b());
        t8.a.g(this.f6192s == null);
        e0 e0Var = new e0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f6192s = e0Var;
        aVar.z(new u(g0Var.f25248a, g0Var.f25249b, e0Var.n(g0Var, this, this.f6187c.a(g0Var.f25250c))), g0Var.f25250c);
    }

    @Override // b8.l
    public h e() {
        return this.f6195v;
    }

    @Override // b8.l
    public void f(Uri uri) {
        this.f6188d.get(uri).p();
    }

    @Override // b8.l
    public boolean g(Uri uri) {
        return this.f6188d.get(uri).n();
    }

    @Override // b8.l
    public boolean j() {
        return this.f6198y;
    }

    @Override // b8.l
    public boolean k(Uri uri, long j10) {
        if (this.f6188d.get(uri) != null) {
            return !r2.j(j10);
        }
        return false;
    }

    @Override // b8.l
    public void l() {
        e0 e0Var = this.f6192s;
        if (e0Var != null) {
            e0Var.a();
        }
        Uri uri = this.f6196w;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // b8.l
    public void n(l.b bVar) {
        this.f6189e.remove(bVar);
    }

    @Override // b8.l
    public g o(Uri uri, boolean z10) {
        g l10 = this.f6188d.get(uri).l();
        if (l10 != null && z10) {
            M(uri);
        }
        return l10;
    }

    @Override // b8.l
    public void stop() {
        this.f6196w = null;
        this.f6197x = null;
        this.f6195v = null;
        this.f6199z = -9223372036854775807L;
        this.f6192s.l();
        this.f6192s = null;
        Iterator<C0107c> it = this.f6188d.values().iterator();
        while (it.hasNext()) {
            it.next().x();
        }
        this.f6193t.removeCallbacksAndMessages(null);
        this.f6193t = null;
        this.f6188d.clear();
    }
}
