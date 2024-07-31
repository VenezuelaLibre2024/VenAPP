package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.source.rtsp.d;
import com.google.android.exoplayer2.source.rtsp.j;
import com.google.android.exoplayer2.source.rtsp.n;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.common.collect.w;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import s8.e0;
import t6.u1;
import t6.u3;
import t6.v1;
import t8.r0;
import v7.d1;
import v7.f1;
import v7.u0;
import v7.v0;
import v7.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements v7.y {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;

    /* renamed from: a, reason: collision with root package name */
    private final s8.b f8388a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8389b = r0.w();

    /* renamed from: c, reason: collision with root package name */
    private final b f8390c;

    /* renamed from: d, reason: collision with root package name */
    private final j f8391d;

    /* renamed from: e, reason: collision with root package name */
    private final List<e> f8392e;

    /* renamed from: f, reason: collision with root package name */
    private final List<d> f8393f;

    /* renamed from: r, reason: collision with root package name */
    private final c f8394r;

    /* renamed from: s, reason: collision with root package name */
    private final b.a f8395s;

    /* renamed from: t, reason: collision with root package name */
    private y.a f8396t;

    /* renamed from: u, reason: collision with root package name */
    private com.google.common.collect.w<d1> f8397u;

    /* renamed from: v, reason: collision with root package name */
    private IOException f8398v;

    /* renamed from: w, reason: collision with root package name */
    private RtspMediaSource.c f8399w;

    /* renamed from: x, reason: collision with root package name */
    private long f8400x;

    /* renamed from: y, reason: collision with root package name */
    private long f8401y;

    /* renamed from: z, reason: collision with root package name */
    private long f8402z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements y6.m, e0.b<com.google.android.exoplayer2.source.rtsp.d>, u0.d, j.f, j.e {
        private b() {
        }

        @Override // v7.u0.d
        public void a(u1 u1Var) {
            Handler handler = n.this.f8389b;
            final n nVar = n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.o
                @Override // java.lang.Runnable
                public final void run() {
                    n.C(n.this);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.f
        public void b(String str, Throwable th2) {
            n.this.f8398v = th2 == null ? new IOException(str) : new IOException(str, th2);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void c(RtspMediaSource.c cVar) {
            n.this.f8399w = cVar;
        }

        @Override // y6.m
        public y6.b0 d(int i10, int i11) {
            return ((e) t8.a.e((e) n.this.f8392e.get(i10))).f8410c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void e() {
            n.this.f8391d.a1(0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void f(long j10, com.google.common.collect.w<b0> wVar) {
            ArrayList arrayList = new ArrayList(wVar.size());
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                arrayList.add((String) t8.a.e(wVar.get(i10).f8281c.getPath()));
            }
            for (int i11 = 0; i11 < n.this.f8393f.size(); i11++) {
                if (!arrayList.contains(((d) n.this.f8393f.get(i11)).c().getPath())) {
                    n.this.f8394r.a();
                    if (n.this.R()) {
                        n.this.B = true;
                        n.this.f8401y = -9223372036854775807L;
                        n.this.f8400x = -9223372036854775807L;
                        n.this.f8402z = -9223372036854775807L;
                    }
                }
            }
            for (int i12 = 0; i12 < wVar.size(); i12++) {
                b0 b0Var = wVar.get(i12);
                com.google.android.exoplayer2.source.rtsp.d P = n.this.P(b0Var.f8281c);
                if (P != null) {
                    P.h(b0Var.f8279a);
                    P.g(b0Var.f8280b);
                    if (n.this.R() && n.this.f8401y == n.this.f8400x) {
                        P.f(j10, b0Var.f8279a);
                    }
                }
            }
            if (!n.this.R()) {
                if (n.this.f8402z != -9223372036854775807L) {
                    n nVar = n.this;
                    nVar.j(nVar.f8402z);
                    n.this.f8402z = -9223372036854775807L;
                    return;
                }
                return;
            }
            if (n.this.f8401y == n.this.f8400x) {
                n.this.f8401y = -9223372036854775807L;
                n.this.f8400x = -9223372036854775807L;
            } else {
                n.this.f8401y = -9223372036854775807L;
                n nVar2 = n.this;
                nVar2.j(nVar2.f8400x);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.f
        public void g(z zVar, com.google.common.collect.w<r> wVar) {
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                r rVar = wVar.get(i10);
                n nVar = n.this;
                e eVar = new e(rVar, i10, nVar.f8395s);
                n.this.f8392e.add(eVar);
                eVar.j();
            }
            n.this.f8394r.b(zVar);
        }

        @Override // s8.e0.b
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void i(com.google.android.exoplayer2.source.rtsp.d dVar, long j10, long j11, boolean z10) {
        }

        @Override // y6.m
        public void p(y6.z zVar) {
        }

        @Override // y6.m
        public void q() {
            Handler handler = n.this.f8389b;
            final n nVar = n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.p
                @Override // java.lang.Runnable
                public final void run() {
                    n.C(n.this);
                }
            });
        }

        @Override // s8.e0.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(com.google.android.exoplayer2.source.rtsp.d dVar, long j10, long j11) {
            if (n.this.f() == 0) {
                if (n.this.G) {
                    return;
                }
                n.this.W();
                n.this.G = true;
                return;
            }
            for (int i10 = 0; i10 < n.this.f8392e.size(); i10++) {
                e eVar = (e) n.this.f8392e.get(i10);
                if (eVar.f8408a.f8405b == dVar) {
                    eVar.c();
                    return;
                }
            }
        }

        @Override // s8.e0.b
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public e0.c h(com.google.android.exoplayer2.source.rtsp.d dVar, long j10, long j11, IOException iOException, int i10) {
            if (!n.this.D) {
                n.this.f8398v = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                n.this.f8399w = new RtspMediaSource.c(dVar.f8310b.f8420b.toString(), iOException);
            } else if (n.a(n.this) < 3) {
                return s8.e0.f25218d;
            }
            return s8.e0.f25220f;
        }
    }

    /* loaded from: classes.dex */
    interface c {
        default void a() {
        }

        void b(z zVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final r f8404a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.rtsp.d f8405b;

        /* renamed from: c, reason: collision with root package name */
        private String f8406c;

        public d(r rVar, int i10, b.a aVar) {
            this.f8404a = rVar;
            this.f8405b = new com.google.android.exoplayer2.source.rtsp.d(i10, rVar, new d.a() { // from class: com.google.android.exoplayer2.source.rtsp.q
                @Override // com.google.android.exoplayer2.source.rtsp.d.a
                public final void a(String str, b bVar) {
                    n.d.this.f(str, bVar);
                }
            }, n.this.f8390c, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, com.google.android.exoplayer2.source.rtsp.b bVar) {
            this.f8406c = str;
            s.b j10 = bVar.j();
            if (j10 != null) {
                n.this.f8391d.J0(bVar.c(), j10);
                n.this.G = true;
            }
            n.this.T();
        }

        public Uri c() {
            return this.f8405b.f8310b.f8420b;
        }

        public String d() {
            t8.a.i(this.f8406c);
            return this.f8406c;
        }

        public boolean e() {
            return this.f8406c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final d f8408a;

        /* renamed from: b, reason: collision with root package name */
        private final s8.e0 f8409b;

        /* renamed from: c, reason: collision with root package name */
        private final u0 f8410c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8411d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8412e;

        public e(r rVar, int i10, b.a aVar) {
            this.f8408a = new d(rVar, i10, aVar);
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb2.append(i10);
            this.f8409b = new s8.e0(sb2.toString());
            u0 l10 = u0.l(n.this.f8388a);
            this.f8410c = l10;
            l10.d0(n.this.f8390c);
        }

        public void c() {
            if (this.f8411d) {
                return;
            }
            this.f8408a.f8405b.c();
            this.f8411d = true;
            n.this.a0();
        }

        public long d() {
            return this.f8410c.z();
        }

        public boolean e() {
            return this.f8410c.K(this.f8411d);
        }

        public int f(v1 v1Var, w6.g gVar, int i10) {
            return this.f8410c.S(v1Var, gVar, i10, this.f8411d);
        }

        public void g() {
            if (this.f8412e) {
                return;
            }
            this.f8409b.l();
            this.f8410c.T();
            this.f8412e = true;
        }

        public void h(long j10) {
            if (this.f8411d) {
                return;
            }
            this.f8408a.f8405b.e();
            this.f8410c.V();
            this.f8410c.b0(j10);
        }

        public int i(long j10) {
            int E = this.f8410c.E(j10, this.f8411d);
            this.f8410c.e0(E);
            return E;
        }

        public void j() {
            this.f8409b.n(this.f8408a.f8405b, n.this.f8390c, 0);
        }
    }

    /* loaded from: classes.dex */
    private final class f implements v0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8414a;

        public f(int i10) {
            this.f8414a = i10;
        }

        @Override // v7.v0
        public void a() {
            if (n.this.f8399w != null) {
                throw n.this.f8399w;
            }
        }

        @Override // v7.v0
        public boolean d() {
            return n.this.Q(this.f8414a);
        }

        @Override // v7.v0
        public int p(long j10) {
            return n.this.Y(this.f8414a, j10);
        }

        @Override // v7.v0
        public int q(v1 v1Var, w6.g gVar, int i10) {
            return n.this.U(this.f8414a, v1Var, gVar, i10);
        }
    }

    public n(s8.b bVar, b.a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f8388a = bVar;
        this.f8395s = aVar;
        this.f8394r = cVar;
        b bVar2 = new b();
        this.f8390c = bVar2;
        this.f8391d = new j(bVar2, bVar2, str, uri, socketFactory, z10);
        this.f8392e = new ArrayList();
        this.f8393f = new ArrayList();
        this.f8401y = -9223372036854775807L;
        this.f8400x = -9223372036854775807L;
        this.f8402z = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void C(n nVar) {
        nVar.S();
    }

    private static com.google.common.collect.w<d1> O(com.google.common.collect.w<e> wVar) {
        w.a aVar = new w.a();
        for (int i10 = 0; i10 < wVar.size(); i10++) {
            aVar.a(new d1(Integer.toString(i10), (u1) t8.a.e(wVar.get(i10).f8410c.F())));
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.source.rtsp.d P(Uri uri) {
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            if (!this.f8392e.get(i10).f8411d) {
                d dVar = this.f8392e.get(i10).f8408a;
                if (dVar.c().equals(uri)) {
                    return dVar.f8405b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R() {
        return this.f8401y != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (this.C || this.D) {
            return;
        }
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            if (this.f8392e.get(i10).f8410c.F() == null) {
                return;
            }
        }
        this.D = true;
        this.f8397u = O(com.google.common.collect.w.r(this.f8392e));
        ((y.a) t8.a.e(this.f8396t)).h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f8393f.size(); i10++) {
            z10 &= this.f8393f.get(i10).e();
        }
        if (z10 && this.E) {
            this.f8391d.W0(this.f8393f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void W() {
        this.f8391d.L0();
        b.a b10 = this.f8395s.b();
        if (b10 == null) {
            this.f8399w = new RtspMediaSource.c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8392e.size());
        ArrayList arrayList2 = new ArrayList(this.f8393f.size());
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            e eVar = this.f8392e.get(i10);
            if (eVar.f8411d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f8408a.f8404a, i10, b10);
                arrayList.add(eVar2);
                eVar2.j();
                if (this.f8393f.contains(eVar.f8408a)) {
                    arrayList2.add(eVar2.f8408a);
                }
            }
        }
        com.google.common.collect.w r10 = com.google.common.collect.w.r(this.f8392e);
        this.f8392e.clear();
        this.f8392e.addAll(arrayList);
        this.f8393f.clear();
        this.f8393f.addAll(arrayList2);
        for (int i11 = 0; i11 < r10.size(); i11++) {
            ((e) r10.get(i11)).c();
        }
    }

    private boolean X(long j10) {
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            if (!this.f8392e.get(i10).f8410c.Z(j10, false)) {
                return false;
            }
        }
        return true;
    }

    private boolean Z() {
        return this.B;
    }

    static /* synthetic */ int a(n nVar) {
        int i10 = nVar.F;
        nVar.F = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        this.A = true;
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            this.A &= this.f8392e.get(i10).f8411d;
        }
    }

    boolean Q(int i10) {
        return !Z() && this.f8392e.get(i10).e();
    }

    int U(int i10, v1 v1Var, w6.g gVar, int i11) {
        if (Z()) {
            return -3;
        }
        return this.f8392e.get(i10).f(v1Var, gVar, i11);
    }

    public void V() {
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            this.f8392e.get(i10).g();
        }
        r0.n(this.f8391d);
        this.C = true;
    }

    int Y(int i10, long j10) {
        if (Z()) {
            return -3;
        }
        return this.f8392e.get(i10).i(j10);
    }

    @Override // v7.y, v7.w0
    public long b() {
        return f();
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        return j10;
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        return isLoading();
    }

    @Override // v7.y, v7.w0
    public long f() {
        if (this.A || this.f8392e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f8400x;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        boolean z10 = true;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            e eVar = this.f8392e.get(i10);
            if (!eVar.f8411d) {
                j11 = Math.min(j11, eVar.d());
                z10 = false;
            }
        }
        if (z10 || j11 == Long.MIN_VALUE) {
            return 0L;
        }
        return j11;
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return !this.A;
    }

    @Override // v7.y
    public long j(long j10) {
        if (f() == 0 && !this.G) {
            this.f8402z = j10;
            return j10;
        }
        s(j10, false);
        this.f8400x = j10;
        if (R()) {
            int H0 = this.f8391d.H0();
            if (H0 == 1) {
                return j10;
            }
            if (H0 != 2) {
                throw new IllegalStateException();
            }
            this.f8401y = j10;
            this.f8391d.R0(j10);
            return j10;
        }
        if (X(j10)) {
            return j10;
        }
        this.f8401y = j10;
        this.f8391d.R0(j10);
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            this.f8392e.get(i10).h(j10);
        }
        return j10;
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.f8396t = aVar;
        try {
            this.f8391d.Y0();
        } catch (IOException e10) {
            this.f8398v = e10;
            r0.n(this.f8391d);
        }
    }

    @Override // v7.y
    public long l() {
        if (!this.B) {
            return -9223372036854775807L;
        }
        this.B = false;
        return 0L;
    }

    @Override // v7.y
    public void o() {
        IOException iOException = this.f8398v;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // v7.y
    public f1 r() {
        t8.a.g(this.D);
        return new f1((d1[]) ((com.google.common.collect.w) t8.a.e(this.f8397u)).toArray(new d1[0]));
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        if (R()) {
            return;
        }
        for (int i10 = 0; i10 < this.f8392e.size(); i10++) {
            e eVar = this.f8392e.get(i10);
            if (!eVar.f8411d) {
                eVar.f8410c.q(j10, z10, true);
            }
        }
    }

    @Override // v7.y
    public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (v0VarArr[i10] != null && (rVarArr[i10] == null || !zArr[i10])) {
                v0VarArr[i10] = null;
            }
        }
        this.f8393f.clear();
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            q8.r rVar = rVarArr[i11];
            if (rVar != null) {
                d1 d10 = rVar.d();
                int indexOf = ((com.google.common.collect.w) t8.a.e(this.f8397u)).indexOf(d10);
                this.f8393f.add(((e) t8.a.e(this.f8392e.get(indexOf))).f8408a);
                if (this.f8397u.contains(d10) && v0VarArr[i11] == null) {
                    v0VarArr[i11] = new f(indexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.f8392e.size(); i12++) {
            e eVar = this.f8392e.get(i12);
            if (!this.f8393f.contains(eVar.f8408a)) {
                eVar.c();
            }
        }
        this.E = true;
        T();
        return j10;
    }
}
