package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.b;
import f8.a;
import java.util.ArrayList;
import q8.r;
import s8.d0;
import s8.f0;
import s8.m0;
import t6.u1;
import t6.u3;
import v7.d1;
import v7.f1;
import v7.h0;
import v7.v0;
import v7.w0;
import v7.y;
import x6.u;
import x6.v;
import x7.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements y, w0.a<i<b>> {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f8497a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f8498b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f8499c;

    /* renamed from: d, reason: collision with root package name */
    private final v f8500d;

    /* renamed from: e, reason: collision with root package name */
    private final u.a f8501e;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f8502f;

    /* renamed from: r, reason: collision with root package name */
    private final h0.a f8503r;

    /* renamed from: s, reason: collision with root package name */
    private final s8.b f8504s;

    /* renamed from: t, reason: collision with root package name */
    private final f1 f8505t;

    /* renamed from: u, reason: collision with root package name */
    private final v7.i f8506u;

    /* renamed from: v, reason: collision with root package name */
    private y.a f8507v;

    /* renamed from: w, reason: collision with root package name */
    private f8.a f8508w;

    /* renamed from: x, reason: collision with root package name */
    private i<b>[] f8509x;

    /* renamed from: y, reason: collision with root package name */
    private w0 f8510y;

    public c(f8.a aVar, b.a aVar2, m0 m0Var, v7.i iVar, v vVar, u.a aVar3, d0 d0Var, h0.a aVar4, f0 f0Var, s8.b bVar) {
        this.f8508w = aVar;
        this.f8497a = aVar2;
        this.f8498b = m0Var;
        this.f8499c = f0Var;
        this.f8500d = vVar;
        this.f8501e = aVar3;
        this.f8502f = d0Var;
        this.f8503r = aVar4;
        this.f8504s = bVar;
        this.f8506u = iVar;
        this.f8505t = m(aVar, vVar);
        i<b>[] n10 = n(0);
        this.f8509x = n10;
        this.f8510y = iVar.a(n10);
    }

    private i<b> d(r rVar, long j10) {
        int d10 = this.f8505t.d(rVar.d());
        return new i<>(this.f8508w.f15002f[d10].f15008a, null, null, this.f8497a.a(this.f8499c, this.f8508w, d10, rVar, this.f8498b), this, this.f8504s, j10, this.f8500d, this.f8501e, this.f8502f, this.f8503r);
    }

    private static f1 m(f8.a aVar, v vVar) {
        d1[] d1VarArr = new d1[aVar.f15002f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f15002f;
            if (i10 >= bVarArr.length) {
                return new f1(d1VarArr);
            }
            u1[] u1VarArr = bVarArr[i10].f15017j;
            u1[] u1VarArr2 = new u1[u1VarArr.length];
            for (int i11 = 0; i11 < u1VarArr.length; i11++) {
                u1 u1Var = u1VarArr[i11];
                u1VarArr2[i11] = u1Var.d(vVar.d(u1Var));
            }
            d1VarArr[i10] = new d1(Integer.toString(i10), u1VarArr2);
            i10++;
        }
    }

    private static i<b>[] n(int i10) {
        return new i[i10];
    }

    @Override // v7.y, v7.w0
    public long b() {
        return this.f8510y.b();
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        for (i<b> iVar : this.f8509x) {
            if (iVar.f30612a == 2) {
                return iVar.c(j10, u3Var);
            }
        }
        return j10;
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        return this.f8510y.e(j10);
    }

    @Override // v7.y, v7.w0
    public long f() {
        return this.f8510y.f();
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
        this.f8510y.g(j10);
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.f8510y.isLoading();
    }

    @Override // v7.y
    public long j(long j10) {
        for (i<b> iVar : this.f8509x) {
            iVar.R(j10);
        }
        return j10;
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.f8507v = aVar;
        aVar.h(this);
    }

    @Override // v7.y
    public long l() {
        return -9223372036854775807L;
    }

    @Override // v7.y
    public void o() {
        this.f8499c.a();
    }

    @Override // v7.w0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void a(i<b> iVar) {
        this.f8507v.a(this);
    }

    public void q() {
        for (i<b> iVar : this.f8509x) {
            iVar.O();
        }
        this.f8507v = null;
    }

    @Override // v7.y
    public f1 r() {
        return this.f8505t;
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        for (i<b> iVar : this.f8509x) {
            iVar.s(j10, z10);
        }
    }

    @Override // v7.y
    public long t(r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        r rVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            v0 v0Var = v0VarArr[i10];
            if (v0Var != null) {
                i iVar = (i) v0Var;
                if (rVarArr[i10] == null || !zArr[i10]) {
                    iVar.O();
                    v0VarArr[i10] = null;
                } else {
                    ((b) iVar.D()).b(rVarArr[i10]);
                    arrayList.add(iVar);
                }
            }
            if (v0VarArr[i10] == null && (rVar = rVarArr[i10]) != null) {
                i<b> d10 = d(rVar, j10);
                arrayList.add(d10);
                v0VarArr[i10] = d10;
                zArr2[i10] = true;
            }
        }
        i<b>[] n10 = n(arrayList.size());
        this.f8509x = n10;
        arrayList.toArray(n10);
        this.f8510y = this.f8506u.a(this.f8509x);
        return j10;
    }

    public void u(f8.a aVar) {
        this.f8508w = aVar;
        for (i<b> iVar : this.f8509x) {
            iVar.D().f(aVar);
        }
        this.f8507v.a(this);
    }
}
