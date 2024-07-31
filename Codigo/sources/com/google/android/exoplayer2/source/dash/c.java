package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import q8.r;
import s8.a0;
import s8.d0;
import s8.f0;
import s8.j;
import s8.m0;
import t6.u1;
import t6.u3;
import t8.r0;
import u6.m3;
import x7.g;
import x7.k;
import x7.m;
import x7.n;
import x7.o;
import x7.p;
import y7.f;
import y7.h;
import z7.i;

/* loaded from: classes.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a */
    private final f0 f8167a;

    /* renamed from: b */
    private final y7.b f8168b;

    /* renamed from: c */
    private final int[] f8169c;

    /* renamed from: d */
    private final int f8170d;

    /* renamed from: e */
    private final j f8171e;

    /* renamed from: f */
    private final long f8172f;

    /* renamed from: g */
    private final int f8173g;

    /* renamed from: h */
    private final e.c f8174h;

    /* renamed from: i */
    protected final b[] f8175i;

    /* renamed from: j */
    private r f8176j;

    /* renamed from: k */
    private z7.c f8177k;

    /* renamed from: l */
    private int f8178l;

    /* renamed from: m */
    private IOException f8179m;

    /* renamed from: n */
    private boolean f8180n;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0140a {

        /* renamed from: a */
        private final j.a f8181a;

        /* renamed from: b */
        private final int f8182b;

        /* renamed from: c */
        private final g.a f8183c;

        public a(j.a aVar) {
            this(aVar, 1);
        }

        public a(j.a aVar, int i10) {
            this(x7.e.f30583u, aVar, i10);
        }

        public a(g.a aVar, j.a aVar2, int i10) {
            this.f8183c = aVar;
            this.f8181a = aVar2;
            this.f8182b = i10;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0140a
        public com.google.android.exoplayer2.source.dash.a a(f0 f0Var, z7.c cVar, y7.b bVar, int i10, int[] iArr, r rVar, int i11, long j10, boolean z10, List<u1> list, e.c cVar2, m0 m0Var, m3 m3Var) {
            j a10 = this.f8181a.a();
            if (m0Var != null) {
                a10.l(m0Var);
            }
            return new c(this.f8183c, f0Var, cVar, bVar, i10, iArr, rVar, i11, a10, j10, this.f8182b, z10, list, cVar2, m3Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final g f8184a;

        /* renamed from: b */
        public final z7.j f8185b;

        /* renamed from: c */
        public final z7.b f8186c;

        /* renamed from: d */
        public final f f8187d;

        /* renamed from: e */
        private final long f8188e;

        /* renamed from: f */
        private final long f8189f;

        b(long j10, z7.j jVar, z7.b bVar, g gVar, long j11, f fVar) {
            this.f8188e = j10;
            this.f8185b = jVar;
            this.f8186c = bVar;
            this.f8189f = j11;
            this.f8184a = gVar;
            this.f8187d = fVar;
        }

        b b(long j10, z7.j jVar) {
            long f10;
            long f11;
            f l10 = this.f8185b.l();
            f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f8186c, this.f8184a, this.f8189f, l10);
            }
            if (!l10.h()) {
                return new b(j10, jVar, this.f8186c, this.f8184a, this.f8189f, l11);
            }
            long g10 = l10.g(j10);
            if (g10 == 0) {
                return new b(j10, jVar, this.f8186c, this.f8184a, this.f8189f, l11);
            }
            long i10 = l10.i();
            long c10 = l10.c(i10);
            long j11 = (g10 + i10) - 1;
            long c11 = l10.c(j11) + l10.a(j11, j10);
            long i11 = l11.i();
            long c12 = l11.c(i11);
            long j12 = this.f8189f;
            if (c11 == c12) {
                f10 = j11 + 1;
            } else {
                if (c11 < c12) {
                    throw new v7.b();
                }
                if (c12 < c10) {
                    f11 = j12 - (l11.f(c10, j10) - i10);
                    return new b(j10, jVar, this.f8186c, this.f8184a, f11, l11);
                }
                f10 = l10.f(c12, j10);
            }
            f11 = j12 + (f10 - i11);
            return new b(j10, jVar, this.f8186c, this.f8184a, f11, l11);
        }

        b c(f fVar) {
            return new b(this.f8188e, this.f8185b, this.f8186c, this.f8184a, this.f8189f, fVar);
        }

        b d(z7.b bVar) {
            return new b(this.f8188e, this.f8185b, bVar, this.f8184a, this.f8189f, this.f8187d);
        }

        public long e(long j10) {
            return this.f8187d.b(this.f8188e, j10) + this.f8189f;
        }

        public long f() {
            return this.f8187d.i() + this.f8189f;
        }

        public long g(long j10) {
            return (e(j10) + this.f8187d.j(this.f8188e, j10)) - 1;
        }

        public long h() {
            return this.f8187d.g(this.f8188e);
        }

        public long i(long j10) {
            return k(j10) + this.f8187d.a(j10 - this.f8189f, this.f8188e);
        }

        public long j(long j10) {
            return this.f8187d.f(j10, this.f8188e) + this.f8189f;
        }

        public long k(long j10) {
            return this.f8187d.c(j10 - this.f8189f);
        }

        public i l(long j10) {
            return this.f8187d.e(j10 - this.f8189f);
        }

        public boolean m(long j10, long j11) {
            return this.f8187d.h() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c */
    /* loaded from: classes.dex */
    protected static final class C0141c extends x7.b {

        /* renamed from: e */
        private final b f8190e;

        /* renamed from: f */
        private final long f8191f;

        public C0141c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f8190e = bVar;
            this.f8191f = j12;
        }

        @Override // x7.o
        public long a() {
            c();
            return this.f8190e.k(d());
        }

        @Override // x7.o
        public long b() {
            c();
            return this.f8190e.i(d());
        }
    }

    public c(g.a aVar, f0 f0Var, z7.c cVar, y7.b bVar, int i10, int[] iArr, r rVar, int i11, j jVar, long j10, int i12, boolean z10, List<u1> list, e.c cVar2, m3 m3Var) {
        this.f8167a = f0Var;
        this.f8177k = cVar;
        this.f8168b = bVar;
        this.f8169c = iArr;
        this.f8176j = rVar;
        this.f8170d = i11;
        this.f8171e = jVar;
        this.f8178l = i10;
        this.f8172f = j10;
        this.f8173g = i12;
        this.f8174h = cVar2;
        long g10 = cVar.g(i10);
        ArrayList<z7.j> n10 = n();
        this.f8175i = new b[rVar.length()];
        int i13 = 0;
        while (i13 < this.f8175i.length) {
            z7.j jVar2 = n10.get(rVar.b(i13));
            z7.b j11 = bVar.j(jVar2.f32410c);
            b[] bVarArr = this.f8175i;
            if (j11 == null) {
                j11 = jVar2.f32410c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(g10, jVar2, j11, aVar.a(i11, jVar2.f32409b, z10, list, cVar2, m3Var), 0L, jVar2.l());
            i13 = i14 + 1;
        }
    }

    private d0.a k(r rVar, List<z7.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.j(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = y7.b.f(list);
        return new d0.a(f10, f10 - this.f8168b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (!this.f8177k.f32362d || this.f8175i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j10), this.f8175i[0].i(this.f8175i[0].g(j10))) - j11);
    }

    private long m(long j10) {
        z7.c cVar = this.f8177k;
        long j11 = cVar.f32359a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - r0.C0(j11 + cVar.d(this.f8178l).f32395b);
    }

    private ArrayList<z7.j> n() {
        List<z7.a> list = this.f8177k.d(this.f8178l).f32396c;
        ArrayList<z7.j> arrayList = new ArrayList<>();
        for (int i10 : this.f8169c) {
            arrayList.addAll(list.get(i10).f32351c);
        }
        return arrayList;
    }

    private long o(b bVar, n nVar, long j10, long j11, long j12) {
        return nVar != null ? nVar.g() : r0.r(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f8175i[i10];
        z7.b j10 = this.f8168b.j(bVar.f8185b.f32410c);
        if (j10 == null || j10.equals(bVar.f8186c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f8175i[i10] = d10;
        return d10;
    }

    @Override // x7.j
    public void a() {
        IOException iOException = this.f8179m;
        if (iOException != null) {
            throw iOException;
        }
        this.f8167a.a();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(r rVar) {
        this.f8176j = rVar;
    }

    @Override // x7.j
    public long c(long j10, u3 u3Var) {
        for (b bVar : this.f8175i) {
            if (bVar.f8187d != null) {
                long h10 = bVar.h();
                if (h10 != 0) {
                    long j11 = bVar.j(j10);
                    long k10 = bVar.k(j11);
                    return u3Var.a(j10, k10, (k10 >= j10 || (h10 != -1 && j11 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j11 + 1));
                }
            }
        }
        return j10;
    }

    @Override // x7.j
    public boolean d(long j10, x7.f fVar, List<? extends n> list) {
        if (this.f8179m != null) {
            return false;
        }
        return this.f8176j.k(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void e(z7.c cVar, int i10) {
        try {
            this.f8177k = cVar;
            this.f8178l = i10;
            long g10 = cVar.g(i10);
            ArrayList<z7.j> n10 = n();
            for (int i11 = 0; i11 < this.f8175i.length; i11++) {
                z7.j jVar = n10.get(this.f8176j.b(i11));
                b[] bVarArr = this.f8175i;
                bVarArr[i11] = bVarArr[i11].b(g10, jVar);
            }
        } catch (v7.b e10) {
            this.f8179m = e10;
        }
    }

    @Override // x7.j
    public boolean g(x7.f fVar, boolean z10, d0.c cVar, d0 d0Var) {
        d0.b b10;
        if (!z10) {
            return false;
        }
        e.c cVar2 = this.f8174h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f8177k.f32362d && (fVar instanceof n)) {
            IOException iOException = cVar.f25212c;
            if ((iOException instanceof a0) && ((a0) iOException).f25187d == 404) {
                b bVar = this.f8175i[this.f8176j.e(fVar.f30604d)];
                long h10 = bVar.h();
                if (h10 != -1 && h10 != 0) {
                    if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                        this.f8180n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f8175i[this.f8176j.e(fVar.f30604d)];
        z7.b j10 = this.f8168b.j(bVar2.f8185b.f32410c);
        if (j10 != null && !bVar2.f8186c.equals(j10)) {
            return true;
        }
        d0.a k10 = k(this.f8176j, bVar2.f8185b.f32410c);
        if ((!k10.a(2) && !k10.a(1)) || (b10 = d0Var.b(k10, cVar)) == null || !k10.a(b10.f25208a)) {
            return false;
        }
        int i10 = b10.f25208a;
        if (i10 == 2) {
            r rVar = this.f8176j;
            return rVar.i(rVar.e(fVar.f30604d), b10.f25209b);
        }
        if (i10 != 1) {
            return false;
        }
        this.f8168b.e(bVar2.f8186c, b10.f25209b);
        return true;
    }

    @Override // x7.j
    public int h(long j10, List<? extends n> list) {
        return (this.f8179m != null || this.f8176j.length() < 2) ? list.size() : this.f8176j.q(j10, list);
    }

    @Override // x7.j
    public void i(x7.f fVar) {
        y6.c b10;
        if (fVar instanceof m) {
            int e10 = this.f8176j.e(((m) fVar).f30604d);
            b bVar = this.f8175i[e10];
            if (bVar.f8187d == null && (b10 = bVar.f8184a.b()) != null) {
                this.f8175i[e10] = bVar.c(new h(b10, bVar.f8185b.f32411d));
            }
        }
        e.c cVar = this.f8174h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // x7.j
    public void j(long j10, long j11, List<? extends n> list, x7.h hVar) {
        int i10;
        int i11;
        o[] oVarArr;
        long j12;
        long j13;
        if (this.f8179m != null) {
            return;
        }
        long j14 = j11 - j10;
        long C0 = r0.C0(this.f8177k.f32359a) + r0.C0(this.f8177k.d(this.f8178l).f32395b) + j11;
        e.c cVar = this.f8174h;
        if (cVar == null || !cVar.h(C0)) {
            long C02 = r0.C0(r0.b0(this.f8172f));
            long m10 = m(C02);
            n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f8176j.length();
            o[] oVarArr2 = new o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f8175i[i12];
                if (bVar.f8187d == null) {
                    oVarArr2[i12] = o.f30645a;
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = C02;
                } else {
                    long e10 = bVar.e(C02);
                    long g10 = bVar.g(C02);
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = C02;
                    long o10 = o(bVar, nVar, j11, e10, g10);
                    if (o10 < e10) {
                        oVarArr[i10] = o.f30645a;
                    } else {
                        oVarArr[i10] = new C0141c(r(i10), o10, g10, m10);
                    }
                }
                i12 = i10 + 1;
                C02 = j13;
                oVarArr2 = oVarArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = C02;
            this.f8176j.g(j10, j15, l(j16, j10), list, oVarArr2);
            b r10 = r(this.f8176j.h());
            g gVar = r10.f8184a;
            if (gVar != null) {
                z7.j jVar = r10.f8185b;
                i n10 = gVar.e() == null ? jVar.n() : null;
                i m11 = r10.f8187d == null ? jVar.m() : null;
                if (n10 != null || m11 != null) {
                    hVar.f30610a = p(r10, this.f8171e, this.f8176j.s(), this.f8176j.t(), this.f8176j.m(), n10, m11);
                    return;
                }
            }
            long j17 = r10.f8188e;
            boolean z10 = j17 != -9223372036854775807L;
            if (r10.h() == 0) {
                hVar.f30611b = z10;
                return;
            }
            long e11 = r10.e(j16);
            long g11 = r10.g(j16);
            long o11 = o(r10, nVar, j11, e11, g11);
            if (o11 < e11) {
                this.f8179m = new v7.b();
                return;
            }
            if (o11 > g11 || (this.f8180n && o11 >= g11)) {
                hVar.f30611b = z10;
                return;
            }
            if (z10 && r10.k(o11) >= j17) {
                hVar.f30611b = true;
                return;
            }
            int min = (int) Math.min(this.f8173g, (g11 - o11) + 1);
            if (j17 != -9223372036854775807L) {
                while (min > 1 && r10.k((min + o11) - 1) >= j17) {
                    min--;
                }
            }
            hVar.f30610a = q(r10, this.f8171e, this.f8170d, this.f8176j.s(), this.f8176j.t(), this.f8176j.m(), o11, min, list.isEmpty() ? j11 : -9223372036854775807L, m10);
        }
    }

    protected x7.f p(b bVar, j jVar, u1 u1Var, int i10, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        z7.j jVar2 = bVar.f8185b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar.f8186c.f32355a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(jVar, y7.g.a(jVar2, bVar.f8186c.f32355a, iVar3, 0), u1Var, i10, obj, bVar.f8184a);
    }

    protected x7.f q(b bVar, j jVar, int i10, u1 u1Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        z7.j jVar2 = bVar.f8185b;
        long k10 = bVar.k(j10);
        i l10 = bVar.l(j10);
        if (bVar.f8184a == null) {
            return new p(jVar, y7.g.a(jVar2, bVar.f8186c.f32355a, l10, bVar.m(j10, j12) ? 0 : 8), u1Var, i11, obj, k10, bVar.i(j10), j10, i10, u1Var);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i a10 = l10.a(bVar.l(i13 + j10), bVar.f8186c.f32355a);
            if (a10 == null) {
                break;
            }
            i14++;
            i13++;
            l10 = a10;
        }
        long j13 = (i14 + j10) - 1;
        long i15 = bVar.i(j13);
        long j14 = bVar.f8188e;
        return new k(jVar, y7.g.a(jVar2, bVar.f8186c.f32355a, l10, bVar.m(j13, j12) ? 0 : 8), u1Var, i11, obj, k10, i15, j11, (j14 == -9223372036854775807L || j14 > i15) ? -9223372036854775807L : j14, j10, i14, -jVar2.f32411d, bVar.f8184a);
    }

    @Override // x7.j
    public void release() {
        for (b bVar : this.f8175i) {
            g gVar = bVar.f8184a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
