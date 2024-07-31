package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import f8.a;
import g7.o;
import g7.p;
import java.io.IOException;
import java.util.List;
import q8.r;
import q8.z;
import s8.d0;
import s8.f0;
import s8.j;
import s8.m0;
import t6.u1;
import t6.u3;
import x7.e;
import x7.f;
import x7.g;
import x7.h;
import x7.k;
import x7.n;

/* loaded from: classes.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a */
    private final f0 f8486a;

    /* renamed from: b */
    private final int f8487b;

    /* renamed from: c */
    private final g[] f8488c;

    /* renamed from: d */
    private final j f8489d;

    /* renamed from: e */
    private r f8490e;

    /* renamed from: f */
    private f8.a f8491f;

    /* renamed from: g */
    private int f8492g;

    /* renamed from: h */
    private IOException f8493h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    /* loaded from: classes.dex */
    public static final class C0143a implements b.a {

        /* renamed from: a */
        private final j.a f8494a;

        public C0143a(j.a aVar) {
            this.f8494a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(f0 f0Var, f8.a aVar, int i10, r rVar, m0 m0Var) {
            j a10 = this.f8494a.a();
            if (m0Var != null) {
                a10.l(m0Var);
            }
            return new a(f0Var, aVar, i10, rVar, a10);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends x7.b {

        /* renamed from: e */
        private final a.b f8495e;

        /* renamed from: f */
        private final int f8496f;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f15018k - 1);
            this.f8495e = bVar;
            this.f8496f = i10;
        }

        @Override // x7.o
        public long a() {
            c();
            return this.f8495e.e((int) d());
        }

        @Override // x7.o
        public long b() {
            return a() + this.f8495e.c((int) d());
        }
    }

    public a(f0 f0Var, f8.a aVar, int i10, r rVar, j jVar) {
        this.f8486a = f0Var;
        this.f8491f = aVar;
        this.f8487b = i10;
        this.f8490e = rVar;
        this.f8489d = jVar;
        a.b bVar = aVar.f15002f[i10];
        this.f8488c = new g[rVar.length()];
        int i11 = 0;
        while (i11 < this.f8488c.length) {
            int b10 = rVar.b(i11);
            u1 u1Var = bVar.f15017j[b10];
            p[] pVarArr = u1Var.f26520z != null ? ((a.C0240a) t8.a.e(aVar.f15001e)).f15007c : null;
            int i12 = bVar.f15008a;
            int i13 = i11;
            this.f8488c[i13] = new e(new g7.g(3, null, new o(b10, i12, bVar.f15010c, -9223372036854775807L, aVar.f15003g, u1Var, 0, pVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f15008a, u1Var);
            i11 = i13 + 1;
        }
    }

    private static n k(u1 u1Var, j jVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        return new k(jVar, new s8.n(uri), u1Var, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, gVar);
    }

    private long l(long j10) {
        f8.a aVar = this.f8491f;
        if (!aVar.f15000d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f15002f[this.f8487b];
        int i10 = bVar.f15018k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // x7.j
    public void a() {
        IOException iOException = this.f8493h;
        if (iOException != null) {
            throw iOException;
        }
        this.f8486a.a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(r rVar) {
        this.f8490e = rVar;
    }

    @Override // x7.j
    public long c(long j10, u3 u3Var) {
        a.b bVar = this.f8491f.f15002f[this.f8487b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        return u3Var.a(j10, e10, (e10 >= j10 || d10 >= bVar.f15018k + (-1)) ? e10 : bVar.e(d10 + 1));
    }

    @Override // x7.j
    public boolean d(long j10, f fVar, List<? extends n> list) {
        if (this.f8493h != null) {
            return false;
        }
        return this.f8490e.k(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void f(f8.a aVar) {
        a.b[] bVarArr = this.f8491f.f15002f;
        int i10 = this.f8487b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f15018k;
        a.b bVar2 = aVar.f15002f[i10];
        if (i11 != 0 && bVar2.f15018k != 0) {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 > e11) {
                this.f8492g += bVar.d(e11);
                this.f8491f = aVar;
            }
        }
        this.f8492g += i11;
        this.f8491f = aVar;
    }

    @Override // x7.j
    public boolean g(f fVar, boolean z10, d0.c cVar, d0 d0Var) {
        d0.b b10 = d0Var.b(z.c(this.f8490e), cVar);
        if (z10 && b10 != null && b10.f25208a == 2) {
            r rVar = this.f8490e;
            if (rVar.i(rVar.e(fVar.f30604d), b10.f25209b)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.j
    public int h(long j10, List<? extends n> list) {
        return (this.f8493h != null || this.f8490e.length() < 2) ? list.size() : this.f8490e.q(j10, list);
    }

    @Override // x7.j
    public void i(f fVar) {
    }

    @Override // x7.j
    public final void j(long j10, long j11, List<? extends n> list, h hVar) {
        int g10;
        long j12 = j11;
        if (this.f8493h != null) {
            return;
        }
        a.b bVar = this.f8491f.f15002f[this.f8487b];
        if (bVar.f15018k == 0) {
            hVar.f30611b = !r4.f15000d;
            return;
        }
        if (list.isEmpty()) {
            g10 = bVar.d(j12);
        } else {
            g10 = (int) (list.get(list.size() - 1).g() - this.f8492g);
            if (g10 < 0) {
                this.f8493h = new v7.b();
                return;
            }
        }
        if (g10 >= bVar.f15018k) {
            hVar.f30611b = !this.f8491f.f15000d;
            return;
        }
        long j13 = j12 - j10;
        long l10 = l(j10);
        int length = this.f8490e.length();
        x7.o[] oVarArr = new x7.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = new b(bVar, this.f8490e.b(i10), g10);
        }
        this.f8490e.g(j10, j13, l10, list, oVarArr);
        long e10 = bVar.e(g10);
        long c10 = e10 + bVar.c(g10);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = g10 + this.f8492g;
        int h10 = this.f8490e.h();
        hVar.f30610a = k(this.f8490e.s(), this.f8489d, bVar.a(this.f8490e.b(h10), g10), i11, e10, c10, j14, this.f8490e.t(), this.f8490e.m(), this.f8488c[h10]);
    }

    @Override // x7.j
    public void release() {
        for (g gVar : this.f8488c) {
            gVar.release();
        }
    }
}
