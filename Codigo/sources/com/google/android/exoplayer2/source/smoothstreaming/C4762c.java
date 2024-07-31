package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4761b;
import java.util.ArrayList;
import p100f8.C7314a;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10820f0;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11707i;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11736w0;
import p397v7.InterfaceC11739y;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;
import p437x7.C12343i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* loaded from: classes.dex */
public final class C4762c implements InterfaceC11739y, InterfaceC11736w0.a<C12343i<InterfaceC4761b>> {

    /* renamed from: a */
    private final InterfaceC4761b.a f9564a;

    /* renamed from: b */
    private final InterfaceC10834m0 f9565b;

    /* renamed from: c */
    private final InterfaceC10820f0 f9566c;

    /* renamed from: d */
    private final InterfaceC12330v f9567d;

    /* renamed from: e */
    private final InterfaceC12329u.a f9568e;

    /* renamed from: f */
    private final InterfaceC10816d0 f9569f;

    /* renamed from: r */
    private final InterfaceC11705h0.a f9570r;

    /* renamed from: s */
    private final InterfaceC10811b f9571s;

    /* renamed from: t */
    private final C11700f1 f9572t;

    /* renamed from: u */
    private final InterfaceC11707i f9573u;

    /* renamed from: v */
    private InterfaceC11739y.a f9574v;

    /* renamed from: w */
    private C7314a f9575w;

    /* renamed from: x */
    private C12343i<InterfaceC4761b>[] f9576x;

    /* renamed from: y */
    private InterfaceC11736w0 f9577y;

    public C4762c(C7314a c7314a, InterfaceC4761b.a aVar, InterfaceC10834m0 interfaceC10834m0, InterfaceC11707i interfaceC11707i, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar2, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar3, InterfaceC10820f0 interfaceC10820f0, InterfaceC10811b interfaceC10811b) {
        this.f9575w = c7314a;
        this.f9564a = aVar;
        this.f9565b = interfaceC10834m0;
        this.f9566c = interfaceC10820f0;
        this.f9567d = interfaceC12330v;
        this.f9568e = aVar2;
        this.f9569f = interfaceC10816d0;
        this.f9570r = aVar3;
        this.f9571s = interfaceC10811b;
        this.f9573u = interfaceC11707i;
        this.f9572t = m12268m(c7314a, interfaceC12330v);
        C12343i<InterfaceC4761b>[] m12269n = m12269n(0);
        this.f9576x = m12269n;
        this.f9577y = interfaceC11707i.mo36909a(m12269n);
    }

    /* renamed from: d */
    private C12343i<InterfaceC4761b> m12267d(InterfaceC10312r interfaceC10312r, long j10) {
        int m36858d = this.f9572t.m36858d(interfaceC10312r.mo30884d());
        return new C12343i<>(this.f9575w.f16425f[m36858d].f16431a, null, null, this.f9564a.mo12266a(this.f9566c, this.f9575w, m36858d, interfaceC10312r, this.f9565b), this, this.f9571s, j10, this.f9567d, this.f9568e, this.f9569f, this.f9570r);
    }

    /* renamed from: m */
    private static C11700f1 m12268m(C7314a c7314a, InterfaceC12330v interfaceC12330v) {
        C11694d1[] c11694d1Arr = new C11694d1[c7314a.f16425f.length];
        int i10 = 0;
        while (true) {
            C7314a.b[] bVarArr = c7314a.f16425f;
            if (i10 >= bVarArr.length) {
                return new C11700f1(c11694d1Arr);
            }
            C11108u1[] c11108u1Arr = bVarArr[i10].f16440j;
            C11108u1[] c11108u1Arr2 = new C11108u1[c11108u1Arr.length];
            for (int i11 = 0; i11 < c11108u1Arr.length; i11++) {
                C11108u1 c11108u1 = c11108u1Arr[i11];
                c11108u1Arr2[i11] = c11108u1.m34489d(interfaceC12330v.mo39795d(c11108u1));
            }
            c11694d1Arr[i10] = new C11694d1(Integer.toString(i10), c11108u1Arr2);
            i10++;
        }
    }

    /* renamed from: n */
    private static C12343i<InterfaceC4761b>[] m12269n(int i10) {
        return new C12343i[i10];
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return this.f9577y.mo245b();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        for (C12343i<InterfaceC4761b> c12343i : this.f9576x) {
            if (c12343i.f33132a == 2) {
                return c12343i.m39931c(j10, c11110u3);
            }
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        return this.f9577y.mo248e(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        return this.f9577y.mo249f();
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        this.f9577y.mo250g(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f9577y.isLoading();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        for (C12343i<InterfaceC4761b> c12343i : this.f9576x) {
            c12343i.m39929R(j10);
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f9574v = aVar;
        aVar.mo34427h(this);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        return -9223372036854775807L;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        this.f9566c.mo11869a();
    }

    @Override // p397v7.InterfaceC11736w0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo258a(C12343i<InterfaceC4761b> c12343i) {
        this.f9574v.mo258a(this);
    }

    /* renamed from: q */
    public void m12271q() {
        for (C12343i<InterfaceC4761b> c12343i : this.f9576x) {
            c12343i.m39927O();
        }
        this.f9574v = null;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return this.f9572t;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        for (C12343i<InterfaceC4761b> c12343i : this.f9576x) {
            c12343i.m39932s(j10, z10);
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        InterfaceC10312r interfaceC10312r;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr[i10];
            if (interfaceC11734v0 != null) {
                C12343i c12343i = (C12343i) interfaceC11734v0;
                if (interfaceC10312rArr[i10] == null || !zArr[i10]) {
                    c12343i.m39927O();
                    interfaceC11734v0Arr[i10] = null;
                } else {
                    ((InterfaceC4761b) c12343i.m39922D()).mo12264b(interfaceC10312rArr[i10]);
                    arrayList.add(c12343i);
                }
            }
            if (interfaceC11734v0Arr[i10] == null && (interfaceC10312r = interfaceC10312rArr[i10]) != null) {
                C12343i<InterfaceC4761b> m12267d = m12267d(interfaceC10312r, j10);
                arrayList.add(m12267d);
                interfaceC11734v0Arr[i10] = m12267d;
                zArr2[i10] = true;
            }
        }
        C12343i<InterfaceC4761b>[] m12269n = m12269n(arrayList.size());
        this.f9576x = m12269n;
        arrayList.toArray(m12269n);
        this.f9577y = this.f9573u.mo36909a(this.f9576x);
        return j10;
    }

    /* renamed from: u */
    public void m12272u(C7314a c7314a) {
        this.f9575w = c7314a;
        for (C12343i<InterfaceC4761b> c12343i : this.f9576x) {
            c12343i.m39922D().mo12265f(c7314a);
        }
        this.f9574v.mo258a(this);
    }
}
