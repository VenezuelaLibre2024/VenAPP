package com.google.android.exoplayer2.source.dash;

import p250n7.C9674c;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p363t8.C11172r0;
import p397v7.InterfaceC11734v0;
import p414w6.C12082g;
import p482z7.C12814f;

/* renamed from: com.google.android.exoplayer2.source.dash.d */
/* loaded from: classes.dex */
final class C4718d implements InterfaceC11734v0 {

    /* renamed from: a */
    private final C11108u1 f9228a;

    /* renamed from: c */
    private long[] f9230c;

    /* renamed from: d */
    private boolean f9231d;

    /* renamed from: e */
    private C12814f f9232e;

    /* renamed from: f */
    private boolean f9233f;

    /* renamed from: r */
    private int f9234r;

    /* renamed from: b */
    private final C9674c f9229b = new C9674c();

    /* renamed from: s */
    private long f9235s = -9223372036854775807L;

    public C4718d(C12814f c12814f, C11108u1 c11108u1, boolean z10) {
        this.f9228a = c11108u1;
        this.f9232e = c12814f;
        this.f9230c = c12814f.f34941b;
        m11933e(c12814f, z10);
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: a */
    public void mo262a() {
    }

    /* renamed from: b */
    public String m11931b() {
        return this.f9232e.m42537a();
    }

    /* renamed from: c */
    public void m11932c(long j10) {
        int m34918e = C11172r0.m34918e(this.f9230c, j10, true, false);
        this.f9234r = m34918e;
        if (!(this.f9231d && m34918e == this.f9230c.length)) {
            j10 = -9223372036854775807L;
        }
        this.f9235s = j10;
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: d */
    public boolean mo264d() {
        return true;
    }

    /* renamed from: e */
    public void m11933e(C12814f c12814f, boolean z10) {
        int i10 = this.f9234r;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f9230c[i10 - 1];
        this.f9231d = z10;
        this.f9232e = c12814f;
        long[] jArr = c12814f.f34941b;
        this.f9230c = jArr;
        long j11 = this.f9235s;
        if (j11 != -9223372036854775807L) {
            m11932c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f9234r = C11172r0.m34918e(jArr, j10, false, false);
        }
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: p */
    public int mo266p(long j10) {
        int max = Math.max(this.f9234r, C11172r0.m34918e(this.f9230c, j10, true, false));
        int i10 = max - this.f9234r;
        this.f9234r = max;
        return i10;
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: q */
    public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
        int i11 = this.f9234r;
        boolean z10 = i11 == this.f9230c.length;
        if (z10 && !this.f9231d) {
            c12082g.m38798w(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f9233f) {
            c11113v1.f28853b = this.f9228a;
            this.f9233f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f9234r = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] m28985a = this.f9229b.m28985a(this.f9232e.f34940a[i11]);
            c12082g.m38811y(m28985a.length);
            c12082g.f32142c.put(m28985a);
        }
        c12082g.f32144e = this.f9230c[i11];
        c12082g.m38798w(1);
        return -4;
    }
}
