package com.google.android.exoplayer2.source.dash;

import t6.u1;
import t6.v1;
import t8.r0;
import v7.v0;
import w6.g;
import z7.f;

/* loaded from: classes.dex */
final class d implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final u1 f8192a;

    /* renamed from: c, reason: collision with root package name */
    private long[] f8194c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8195d;

    /* renamed from: e, reason: collision with root package name */
    private f f8196e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8197f;

    /* renamed from: r, reason: collision with root package name */
    private int f8198r;

    /* renamed from: b, reason: collision with root package name */
    private final n7.c f8193b = new n7.c();

    /* renamed from: s, reason: collision with root package name */
    private long f8199s = -9223372036854775807L;

    public d(f fVar, u1 u1Var, boolean z10) {
        this.f8192a = u1Var;
        this.f8196e = fVar;
        this.f8194c = fVar.f32390b;
        e(fVar, z10);
    }

    @Override // v7.v0
    public void a() {
    }

    public String b() {
        return this.f8196e.a();
    }

    public void c(long j10) {
        int e10 = r0.e(this.f8194c, j10, true, false);
        this.f8198r = e10;
        if (!(this.f8195d && e10 == this.f8194c.length)) {
            j10 = -9223372036854775807L;
        }
        this.f8199s = j10;
    }

    @Override // v7.v0
    public boolean d() {
        return true;
    }

    public void e(f fVar, boolean z10) {
        int i10 = this.f8198r;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f8194c[i10 - 1];
        this.f8195d = z10;
        this.f8196e = fVar;
        long[] jArr = fVar.f32390b;
        this.f8194c = jArr;
        long j11 = this.f8199s;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f8198r = r0.e(jArr, j10, false, false);
        }
    }

    @Override // v7.v0
    public int p(long j10) {
        int max = Math.max(this.f8198r, r0.e(this.f8194c, j10, true, false));
        int i10 = max - this.f8198r;
        this.f8198r = max;
        return i10;
    }

    @Override // v7.v0
    public int q(v1 v1Var, g gVar, int i10) {
        int i11 = this.f8198r;
        boolean z10 = i11 == this.f8194c.length;
        if (z10 && !this.f8195d) {
            gVar.w(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f8197f) {
            v1Var.f26567b = this.f8192a;
            this.f8197f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f8198r = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] a10 = this.f8193b.a(this.f8196e.f32389a[i11]);
            gVar.y(a10.length);
            gVar.f29679c.put(a10);
        }
        gVar.f29681e = this.f8194c[i11];
        gVar.w(1);
        return -4;
    }
}
