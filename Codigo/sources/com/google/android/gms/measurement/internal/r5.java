package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r5 {
    private long A;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private String H;
    private boolean I;
    private long J;
    private long K;

    /* renamed from: a, reason: collision with root package name */
    private final w5 f10573a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10574b;

    /* renamed from: c, reason: collision with root package name */
    private String f10575c;

    /* renamed from: d, reason: collision with root package name */
    private String f10576d;

    /* renamed from: e, reason: collision with root package name */
    private String f10577e;

    /* renamed from: f, reason: collision with root package name */
    private String f10578f;

    /* renamed from: g, reason: collision with root package name */
    private long f10579g;

    /* renamed from: h, reason: collision with root package name */
    private long f10580h;

    /* renamed from: i, reason: collision with root package name */
    private long f10581i;

    /* renamed from: j, reason: collision with root package name */
    private String f10582j;

    /* renamed from: k, reason: collision with root package name */
    private long f10583k;

    /* renamed from: l, reason: collision with root package name */
    private String f10584l;

    /* renamed from: m, reason: collision with root package name */
    private long f10585m;

    /* renamed from: n, reason: collision with root package name */
    private long f10586n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10587o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10588p;

    /* renamed from: q, reason: collision with root package name */
    private String f10589q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f10590r;

    /* renamed from: s, reason: collision with root package name */
    private long f10591s;

    /* renamed from: t, reason: collision with root package name */
    private List<String> f10592t;

    /* renamed from: u, reason: collision with root package name */
    private String f10593u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10594v;

    /* renamed from: w, reason: collision with root package name */
    private long f10595w;

    /* renamed from: x, reason: collision with root package name */
    private long f10596x;

    /* renamed from: y, reason: collision with root package name */
    private int f10597y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10598z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r5(w5 w5Var, String str) {
        com.google.android.gms.common.internal.s.j(w5Var);
        com.google.android.gms.common.internal.s.f(str);
        this.f10573a = w5Var;
        this.f10574b = str;
        w5Var.zzl().i();
    }

    public final void A(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.J != j10;
        this.J = j10;
    }

    public final void B(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10584l, str);
        this.f10584l = str;
    }

    public final void C(boolean z10) {
        this.f10573a.zzl().i();
        this.I |= this.f10594v != z10;
        this.f10594v = z10;
    }

    public final long D() {
        this.f10573a.zzl().i();
        return this.A;
    }

    public final void E(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.E != j10;
        this.E = j10;
    }

    public final void F(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10582j, str);
        this.f10582j = str;
    }

    public final void G(boolean z10) {
        this.f10573a.zzl().i();
        this.I |= this.f10598z != z10;
        this.f10598z = z10;
    }

    public final long H() {
        this.f10573a.zzl().i();
        return this.J;
    }

    public final void I(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.F != j10;
        this.F = j10;
    }

    public final void J(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10578f, str);
        this.f10578f = str;
    }

    public final long K() {
        this.f10573a.zzl().i();
        return this.E;
    }

    public final void L(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.D != j10;
        this.D = j10;
    }

    public final void M(String str) {
        this.f10573a.zzl().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !wa.l.a(this.f10576d, str);
        this.f10576d = str;
    }

    public final long N() {
        this.f10573a.zzl().i();
        return this.F;
    }

    public final void O(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.C != j10;
        this.C = j10;
    }

    public final void P(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.H, str);
        this.H = str;
    }

    public final long Q() {
        this.f10573a.zzl().i();
        return this.D;
    }

    public final void R(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.G != j10;
        this.G = j10;
    }

    public final void S(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10577e, str);
        this.f10577e = str;
    }

    public final long T() {
        this.f10573a.zzl().i();
        return this.C;
    }

    public final void U(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.B != j10;
        this.B = j10;
    }

    public final void V(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10593u, str);
        this.f10593u = str;
    }

    public final long W() {
        this.f10573a.zzl().i();
        return this.G;
    }

    public final void X(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10586n != j10;
        this.f10586n = j10;
    }

    public final long Y() {
        this.f10573a.zzl().i();
        return this.B;
    }

    public final void Z(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10591s != j10;
        this.f10591s = j10;
    }

    public final int a() {
        this.f10573a.zzl().i();
        return this.f10597y;
    }

    public final long a0() {
        this.f10573a.zzl().i();
        return this.f10586n;
    }

    public final void b(int i10) {
        this.f10573a.zzl().i();
        this.I |= this.f10597y != i10;
        this.f10597y = i10;
    }

    public final void b0(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.K != j10;
        this.K = j10;
    }

    public final void c(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10583k != j10;
        this.f10583k = j10;
    }

    public final long c0() {
        this.f10573a.zzl().i();
        return this.f10591s;
    }

    public final void d(Boolean bool) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10590r, bool);
        this.f10590r = bool;
    }

    public final void d0(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10585m != j10;
        this.f10585m = j10;
    }

    public final void e(String str) {
        this.f10573a.zzl().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !wa.l.a(this.f10589q, str);
        this.f10589q = str;
    }

    public final long e0() {
        this.f10573a.zzl().i();
        return this.K;
    }

    public final void f(List<String> list) {
        this.f10573a.zzl().i();
        if (wa.l.a(this.f10592t, list)) {
            return;
        }
        this.I = true;
        this.f10592t = list != null ? new ArrayList(list) : null;
    }

    public final void f0(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10581i != j10;
        this.f10581i = j10;
    }

    public final void g(boolean z10) {
        this.f10573a.zzl().i();
        this.I |= this.f10588p != z10;
        this.f10588p = z10;
    }

    public final long g0() {
        this.f10573a.zzl().i();
        return this.f10585m;
    }

    public final String h() {
        this.f10573a.zzl().i();
        return this.f10582j;
    }

    public final void h0(long j10) {
        com.google.android.gms.common.internal.s.a(j10 >= 0);
        this.f10573a.zzl().i();
        this.I |= this.f10579g != j10;
        this.f10579g = j10;
    }

    public final String i() {
        this.f10573a.zzl().i();
        return this.f10578f;
    }

    public final long i0() {
        this.f10573a.zzl().i();
        return this.f10581i;
    }

    public final String j() {
        this.f10573a.zzl().i();
        return this.f10576d;
    }

    public final void j0(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10580h != j10;
        this.f10580h = j10;
    }

    public final String k() {
        this.f10573a.zzl().i();
        return this.H;
    }

    public final long k0() {
        this.f10573a.zzl().i();
        return this.f10579g;
    }

    public final String l() {
        this.f10573a.zzl().i();
        return this.f10577e;
    }

    public final void l0(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10596x != j10;
        this.f10596x = j10;
    }

    public final String m() {
        this.f10573a.zzl().i();
        return this.f10593u;
    }

    public final long m0() {
        this.f10573a.zzl().i();
        return this.f10580h;
    }

    public final List<String> n() {
        this.f10573a.zzl().i();
        return this.f10592t;
    }

    public final void n0(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.f10595w != j10;
        this.f10595w = j10;
    }

    public final void o() {
        this.f10573a.zzl().i();
        this.I = false;
    }

    public final long o0() {
        this.f10573a.zzl().i();
        return this.f10596x;
    }

    public final void p() {
        this.f10573a.zzl().i();
        long j10 = this.f10579g + 1;
        if (j10 > 2147483647L) {
            this.f10573a.zzj().G().b("Bundle index overflow. appId", n4.q(this.f10574b));
            j10 = 0;
        }
        this.I = true;
        this.f10579g = j10;
    }

    public final long p0() {
        this.f10573a.zzl().i();
        return this.f10595w;
    }

    public final boolean q() {
        this.f10573a.zzl().i();
        return this.f10588p;
    }

    public final Boolean q0() {
        this.f10573a.zzl().i();
        return this.f10590r;
    }

    public final boolean r() {
        this.f10573a.zzl().i();
        return this.f10587o;
    }

    public final String r0() {
        this.f10573a.zzl().i();
        return this.f10589q;
    }

    public final boolean s() {
        this.f10573a.zzl().i();
        return this.I;
    }

    public final String s0() {
        this.f10573a.zzl().i();
        String str = this.H;
        P(null);
        return str;
    }

    public final boolean t() {
        this.f10573a.zzl().i();
        return this.f10594v;
    }

    public final String t0() {
        this.f10573a.zzl().i();
        return this.f10574b;
    }

    public final boolean u() {
        this.f10573a.zzl().i();
        return this.f10598z;
    }

    public final String u0() {
        this.f10573a.zzl().i();
        return this.f10575c;
    }

    public final long v() {
        this.f10573a.zzl().i();
        return 0L;
    }

    public final String v0() {
        this.f10573a.zzl().i();
        return this.f10584l;
    }

    public final void w(long j10) {
        this.f10573a.zzl().i();
        this.I |= this.A != j10;
        this.A = j10;
    }

    public final void x(String str) {
        this.f10573a.zzl().i();
        this.I |= !wa.l.a(this.f10575c, str);
        this.f10575c = str;
    }

    public final void y(boolean z10) {
        this.f10573a.zzl().i();
        this.I |= this.f10587o != z10;
        this.f10587o = z10;
    }

    public final long z() {
        this.f10573a.zzl().i();
        return this.f10583k;
    }
}
