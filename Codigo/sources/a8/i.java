package a8;

import a8.f;
import android.net.Uri;
import b8.g;
import com.google.common.collect.w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l7.a;
import s8.n;
import t6.u1;
import t8.e0;
import t8.n0;
import t8.p0;
import u6.m3;

/* loaded from: classes.dex */
public final class i extends x7.n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final m3 C;
    private j D;
    private p E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private w<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k */
    public final int f160k;

    /* renamed from: l */
    public final int f161l;

    /* renamed from: m */
    public final Uri f162m;

    /* renamed from: n */
    public final boolean f163n;

    /* renamed from: o */
    public final int f164o;

    /* renamed from: p */
    private final s8.j f165p;

    /* renamed from: q */
    private final s8.n f166q;

    /* renamed from: r */
    private final j f167r;

    /* renamed from: s */
    private final boolean f168s;

    /* renamed from: t */
    private final boolean f169t;

    /* renamed from: u */
    private final n0 f170u;

    /* renamed from: v */
    private final h f171v;

    /* renamed from: w */
    private final List<u1> f172w;

    /* renamed from: x */
    private final x6.m f173x;

    /* renamed from: y */
    private final q7.h f174y;

    /* renamed from: z */
    private final e0 f175z;

    private i(h hVar, s8.j jVar, s8.n nVar, u1 u1Var, boolean z10, s8.j jVar2, s8.n nVar2, boolean z11, Uri uri, List<u1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, n0 n0Var, x6.m mVar, j jVar3, q7.h hVar2, e0 e0Var, boolean z15, m3 m3Var) {
        super(jVar, nVar, u1Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f164o = i11;
        this.L = z12;
        this.f161l = i12;
        this.f166q = nVar2;
        this.f165p = jVar2;
        this.G = nVar2 != null;
        this.B = z11;
        this.f162m = uri;
        this.f168s = z14;
        this.f170u = n0Var;
        this.f169t = z13;
        this.f171v = hVar;
        this.f172w = list;
        this.f173x = mVar;
        this.f167r = jVar3;
        this.f174y = hVar2;
        this.f175z = e0Var;
        this.f163n = z15;
        this.C = m3Var;
        this.J = w.v();
        this.f160k = M.getAndIncrement();
    }

    private static s8.j i(s8.j jVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return jVar;
        }
        t8.a.e(bArr2);
        return new a(jVar, bArr, bArr2);
    }

    public static i j(h hVar, s8.j jVar, u1 u1Var, long j10, b8.g gVar, f.e eVar, Uri uri, List<u1> list, int i10, Object obj, boolean z10, s sVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11, m3 m3Var) {
        boolean z12;
        s8.j jVar2;
        s8.n nVar;
        boolean z13;
        q7.h hVar2;
        e0 e0Var;
        j jVar3;
        g.e eVar2 = eVar.f155a;
        s8.n a10 = new n.b().i(p0.e(gVar.f6279a, eVar2.f6242a)).h(eVar2.f6250t).g(eVar2.f6251u).b(eVar.f158d ? 8 : 0).a();
        boolean z14 = bArr != null;
        s8.j i11 = i(jVar, bArr, z14 ? l((String) t8.a.e(eVar2.f6249s)) : null);
        g.d dVar = eVar2.f6243b;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] l10 = z15 ? l((String) t8.a.e(dVar.f6249s)) : null;
            z12 = z14;
            nVar = new s8.n(p0.e(gVar.f6279a, dVar.f6242a), dVar.f6250t, dVar.f6251u);
            jVar2 = i(jVar, bArr2, l10);
            z13 = z15;
        } else {
            z12 = z14;
            jVar2 = null;
            nVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f6246e;
        long j12 = j11 + eVar2.f6244c;
        int i12 = gVar.f6222j + eVar2.f6245d;
        if (iVar != null) {
            s8.n nVar2 = iVar.f166q;
            boolean z16 = nVar == nVar2 || (nVar != null && nVar2 != null && nVar.f25288a.equals(nVar2.f25288a) && nVar.f25294g == iVar.f166q.f25294g);
            boolean z17 = uri.equals(iVar.f162m) && iVar.I;
            hVar2 = iVar.f174y;
            e0Var = iVar.f175z;
            jVar3 = (z16 && z17 && !iVar.K && iVar.f161l == i12) ? iVar.D : null;
        } else {
            hVar2 = new q7.h();
            e0Var = new e0(10);
            jVar3 = null;
        }
        return new i(hVar, i11, a10, u1Var, z12, jVar2, nVar, z13, uri, list, i10, obj, j11, j12, eVar.f156b, eVar.f157c, !eVar.f158d, i12, eVar2.f6252v, z10, sVar.a(i12), eVar2.f6247f, jVar3, hVar2, e0Var, z11, m3Var);
    }

    private void k(s8.j jVar, s8.n nVar, boolean z10, boolean z11) {
        s8.n e10;
        long position;
        long j10;
        if (z10) {
            r0 = this.F != 0;
            e10 = nVar;
        } else {
            e10 = nVar.e(this.F);
        }
        try {
            y6.e u10 = u(jVar, e10, z11);
            if (r0) {
                u10.n(this.F);
            }
            do {
                try {
                    try {
                        if (this.H) {
                            break;
                        }
                    } catch (EOFException e11) {
                        if ((this.f30604d.f26510e & 16384) == 0) {
                            throw e11;
                        }
                        this.D.c();
                        position = u10.getPosition();
                        j10 = nVar.f25294g;
                    }
                } catch (Throwable th2) {
                    this.F = (int) (u10.getPosition() - nVar.f25294g);
                    throw th2;
                }
            } while (this.D.a(u10));
            position = u10.getPosition();
            j10 = nVar.f25294g;
            this.F = (int) (position - j10);
        } finally {
            s8.m.a(jVar);
        }
    }

    private static byte[] l(String str) {
        if (eb.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, b8.g gVar) {
        g.e eVar2 = eVar.f155a;
        return eVar2 instanceof g.b ? ((g.b) eVar2).f6235w || (eVar.f157c == 0 && gVar.f6281c) : gVar.f6281c;
    }

    private void r() {
        k(this.f30609i, this.f30602b, this.A, true);
    }

    private void s() {
        if (this.G) {
            t8.a.e(this.f165p);
            t8.a.e(this.f166q);
            k(this.f165p, this.f166q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long t(y6.l lVar) {
        lVar.f();
        try {
            this.f175z.Q(10);
            lVar.q(this.f175z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f175z.K() != 4801587) {
            return -9223372036854775807L;
        }
        this.f175z.V(3);
        int G = this.f175z.G();
        int i10 = G + 10;
        if (i10 > this.f175z.b()) {
            byte[] e10 = this.f175z.e();
            this.f175z.Q(i10);
            System.arraycopy(e10, 0, this.f175z.e(), 0, 10);
        }
        lVar.q(this.f175z.e(), 10, G);
        l7.a e11 = this.f174y.e(this.f175z.e(), G);
        if (e11 == null) {
            return -9223372036854775807L;
        }
        int e12 = e11.e();
        for (int i11 = 0; i11 < e12; i11++) {
            a.b d10 = e11.d(i11);
            if (d10 instanceof q7.l) {
                q7.l lVar2 = (q7.l) d10;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar2.f23592b)) {
                    System.arraycopy(lVar2.f23593c, 0, this.f175z.e(), 0, 8);
                    this.f175z.U(0);
                    this.f175z.T(8);
                    return this.f175z.A() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private y6.e u(s8.j jVar, s8.n nVar, boolean z10) {
        p pVar;
        long j10;
        long o10 = jVar.o(nVar);
        if (z10) {
            try {
                this.f170u.h(this.f168s, this.f30607g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        y6.e eVar = new y6.e(jVar, nVar.f25294g, o10);
        if (this.D == null) {
            long t10 = t(eVar);
            eVar.f();
            j jVar2 = this.f167r;
            j f10 = jVar2 != null ? jVar2.f() : this.f171v.a(nVar.f25288a, this.f30604d, this.f172w, this.f170u, jVar.e(), eVar, this.C);
            this.D = f10;
            if (f10.e()) {
                pVar = this.E;
                j10 = t10 != -9223372036854775807L ? this.f170u.b(t10) : this.f30607g;
            } else {
                pVar = this.E;
                j10 = 0;
            }
            pVar.m0(j10);
            this.E.Y();
            this.D.b(this.E);
        }
        this.E.j0(this.f173x);
        return eVar;
    }

    public static boolean w(i iVar, Uri uri, b8.g gVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f162m) && iVar.I) {
            return false;
        }
        return !p(eVar, gVar) || j10 + eVar.f155a.f6246e < iVar.f30608h;
    }

    @Override // s8.e0.e
    public void b() {
        j jVar;
        t8.a.e(this.E);
        if (this.D == null && (jVar = this.f167r) != null && jVar.d()) {
            this.D = this.f167r;
            this.G = false;
        }
        s();
        if (this.H) {
            return;
        }
        if (!this.f169t) {
            r();
        }
        this.I = !this.H;
    }

    @Override // s8.e0.e
    public void c() {
        this.H = true;
    }

    @Override // x7.n
    public boolean h() {
        return this.I;
    }

    public int m(int i10) {
        t8.a.g(!this.f163n);
        if (i10 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i10).intValue();
    }

    public void n(p pVar, w<Integer> wVar) {
        this.E = pVar;
        this.J = wVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    public void v() {
        this.L = true;
    }
}
