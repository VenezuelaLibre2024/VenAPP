package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayList;
import java.util.List;
import p418wa.C12114l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* loaded from: classes2.dex */
public final class C5648r5 {

    /* renamed from: A */
    private long f11760A;

    /* renamed from: B */
    private long f11761B;

    /* renamed from: C */
    private long f11762C;

    /* renamed from: D */
    private long f11763D;

    /* renamed from: E */
    private long f11764E;

    /* renamed from: F */
    private long f11765F;

    /* renamed from: G */
    private long f11766G;

    /* renamed from: H */
    private String f11767H;

    /* renamed from: I */
    private boolean f11768I;

    /* renamed from: J */
    private long f11769J;

    /* renamed from: K */
    private long f11770K;

    /* renamed from: a */
    private final C5712w5 f11771a;

    /* renamed from: b */
    private final String f11772b;

    /* renamed from: c */
    private String f11773c;

    /* renamed from: d */
    private String f11774d;

    /* renamed from: e */
    private String f11775e;

    /* renamed from: f */
    private String f11776f;

    /* renamed from: g */
    private long f11777g;

    /* renamed from: h */
    private long f11778h;

    /* renamed from: i */
    private long f11779i;

    /* renamed from: j */
    private String f11780j;

    /* renamed from: k */
    private long f11781k;

    /* renamed from: l */
    private String f11782l;

    /* renamed from: m */
    private long f11783m;

    /* renamed from: n */
    private long f11784n;

    /* renamed from: o */
    private boolean f11785o;

    /* renamed from: p */
    private boolean f11786p;

    /* renamed from: q */
    private String f11787q;

    /* renamed from: r */
    private Boolean f11788r;

    /* renamed from: s */
    private long f11789s;

    /* renamed from: t */
    private List<String> f11790t;

    /* renamed from: u */
    private String f11791u;

    /* renamed from: v */
    private boolean f11792v;

    /* renamed from: w */
    private long f11793w;

    /* renamed from: x */
    private long f11794x;

    /* renamed from: y */
    private int f11795y;

    /* renamed from: z */
    private boolean f11796z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5648r5(C5712w5 c5712w5, String str) {
        C5276s.m13324j(c5712w5);
        C5276s.m13320f(str);
        this.f11771a = c5712w5;
        this.f11772b = str;
        c5712w5.zzl().mo13687i();
    }

    /* renamed from: A */
    public final void m14260A(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11769J != j10;
        this.f11769J = j10;
    }

    /* renamed from: B */
    public final void m14261B(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11782l, str);
        this.f11782l = str;
    }

    /* renamed from: C */
    public final void m14262C(boolean z10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11792v != z10;
        this.f11792v = z10;
    }

    /* renamed from: D */
    public final long m14263D() {
        this.f11771a.zzl().mo13687i();
        return this.f11760A;
    }

    /* renamed from: E */
    public final void m14264E(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11764E != j10;
        this.f11764E = j10;
    }

    /* renamed from: F */
    public final void m14265F(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11780j, str);
        this.f11780j = str;
    }

    /* renamed from: G */
    public final void m14266G(boolean z10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11796z != z10;
        this.f11796z = z10;
    }

    /* renamed from: H */
    public final long m14267H() {
        this.f11771a.zzl().mo13687i();
        return this.f11769J;
    }

    /* renamed from: I */
    public final void m14268I(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11765F != j10;
        this.f11765F = j10;
    }

    /* renamed from: J */
    public final void m14269J(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11776f, str);
        this.f11776f = str;
    }

    /* renamed from: K */
    public final long m14270K() {
        this.f11771a.zzl().mo13687i();
        return this.f11764E;
    }

    /* renamed from: L */
    public final void m14271L(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11763D != j10;
        this.f11763D = j10;
    }

    /* renamed from: M */
    public final void m14272M(String str) {
        this.f11771a.zzl().mo13687i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f11768I |= !C12114l.m38850a(this.f11774d, str);
        this.f11774d = str;
    }

    /* renamed from: N */
    public final long m14273N() {
        this.f11771a.zzl().mo13687i();
        return this.f11765F;
    }

    /* renamed from: O */
    public final void m14274O(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11762C != j10;
        this.f11762C = j10;
    }

    /* renamed from: P */
    public final void m14275P(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11767H, str);
        this.f11767H = str;
    }

    /* renamed from: Q */
    public final long m14276Q() {
        this.f11771a.zzl().mo13687i();
        return this.f11763D;
    }

    /* renamed from: R */
    public final void m14277R(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11766G != j10;
        this.f11766G = j10;
    }

    /* renamed from: S */
    public final void m14278S(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11775e, str);
        this.f11775e = str;
    }

    /* renamed from: T */
    public final long m14279T() {
        this.f11771a.zzl().mo13687i();
        return this.f11762C;
    }

    /* renamed from: U */
    public final void m14280U(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11761B != j10;
        this.f11761B = j10;
    }

    /* renamed from: V */
    public final void m14281V(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11791u, str);
        this.f11791u = str;
    }

    /* renamed from: W */
    public final long m14282W() {
        this.f11771a.zzl().mo13687i();
        return this.f11766G;
    }

    /* renamed from: X */
    public final void m14283X(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11784n != j10;
        this.f11784n = j10;
    }

    /* renamed from: Y */
    public final long m14284Y() {
        this.f11771a.zzl().mo13687i();
        return this.f11761B;
    }

    /* renamed from: Z */
    public final void m14285Z(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11789s != j10;
        this.f11789s = j10;
    }

    /* renamed from: a */
    public final int m14286a() {
        this.f11771a.zzl().mo13687i();
        return this.f11795y;
    }

    /* renamed from: a0 */
    public final long m14287a0() {
        this.f11771a.zzl().mo13687i();
        return this.f11784n;
    }

    /* renamed from: b */
    public final void m14288b(int i10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11795y != i10;
        this.f11795y = i10;
    }

    /* renamed from: b0 */
    public final void m14289b0(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11770K != j10;
        this.f11770K = j10;
    }

    /* renamed from: c */
    public final void m14290c(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11781k != j10;
        this.f11781k = j10;
    }

    /* renamed from: c0 */
    public final long m14291c0() {
        this.f11771a.zzl().mo13687i();
        return this.f11789s;
    }

    /* renamed from: d */
    public final void m14292d(Boolean bool) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11788r, bool);
        this.f11788r = bool;
    }

    /* renamed from: d0 */
    public final void m14293d0(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11783m != j10;
        this.f11783m = j10;
    }

    /* renamed from: e */
    public final void m14294e(String str) {
        this.f11771a.zzl().mo13687i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f11768I |= !C12114l.m38850a(this.f11787q, str);
        this.f11787q = str;
    }

    /* renamed from: e0 */
    public final long m14295e0() {
        this.f11771a.zzl().mo13687i();
        return this.f11770K;
    }

    /* renamed from: f */
    public final void m14296f(List<String> list) {
        this.f11771a.zzl().mo13687i();
        if (C12114l.m38850a(this.f11790t, list)) {
            return;
        }
        this.f11768I = true;
        this.f11790t = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: f0 */
    public final void m14297f0(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11779i != j10;
        this.f11779i = j10;
    }

    /* renamed from: g */
    public final void m14298g(boolean z10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11786p != z10;
        this.f11786p = z10;
    }

    /* renamed from: g0 */
    public final long m14299g0() {
        this.f11771a.zzl().mo13687i();
        return this.f11783m;
    }

    /* renamed from: h */
    public final String m14300h() {
        this.f11771a.zzl().mo13687i();
        return this.f11780j;
    }

    /* renamed from: h0 */
    public final void m14301h0(long j10) {
        C5276s.m13315a(j10 >= 0);
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11777g != j10;
        this.f11777g = j10;
    }

    /* renamed from: i */
    public final String m14302i() {
        this.f11771a.zzl().mo13687i();
        return this.f11776f;
    }

    /* renamed from: i0 */
    public final long m14303i0() {
        this.f11771a.zzl().mo13687i();
        return this.f11779i;
    }

    /* renamed from: j */
    public final String m14304j() {
        this.f11771a.zzl().mo13687i();
        return this.f11774d;
    }

    /* renamed from: j0 */
    public final void m14305j0(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11778h != j10;
        this.f11778h = j10;
    }

    /* renamed from: k */
    public final String m14306k() {
        this.f11771a.zzl().mo13687i();
        return this.f11767H;
    }

    /* renamed from: k0 */
    public final long m14307k0() {
        this.f11771a.zzl().mo13687i();
        return this.f11777g;
    }

    /* renamed from: l */
    public final String m14308l() {
        this.f11771a.zzl().mo13687i();
        return this.f11775e;
    }

    /* renamed from: l0 */
    public final void m14309l0(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11794x != j10;
        this.f11794x = j10;
    }

    /* renamed from: m */
    public final String m14310m() {
        this.f11771a.zzl().mo13687i();
        return this.f11791u;
    }

    /* renamed from: m0 */
    public final long m14311m0() {
        this.f11771a.zzl().mo13687i();
        return this.f11778h;
    }

    /* renamed from: n */
    public final List<String> m14312n() {
        this.f11771a.zzl().mo13687i();
        return this.f11790t;
    }

    /* renamed from: n0 */
    public final void m14313n0(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11793w != j10;
        this.f11793w = j10;
    }

    /* renamed from: o */
    public final void m14314o() {
        this.f11771a.zzl().mo13687i();
        this.f11768I = false;
    }

    /* renamed from: o0 */
    public final long m14315o0() {
        this.f11771a.zzl().mo13687i();
        return this.f11794x;
    }

    /* renamed from: p */
    public final void m14316p() {
        this.f11771a.zzl().mo13687i();
        long j10 = this.f11777g + 1;
        if (j10 > 2147483647L) {
            this.f11771a.zzj().m14187G().m14219b("Bundle index overflow. appId", C5595n4.m14174q(this.f11772b));
            j10 = 0;
        }
        this.f11768I = true;
        this.f11777g = j10;
    }

    /* renamed from: p0 */
    public final long m14317p0() {
        this.f11771a.zzl().mo13687i();
        return this.f11793w;
    }

    /* renamed from: q */
    public final boolean m14318q() {
        this.f11771a.zzl().mo13687i();
        return this.f11786p;
    }

    /* renamed from: q0 */
    public final Boolean m14319q0() {
        this.f11771a.zzl().mo13687i();
        return this.f11788r;
    }

    /* renamed from: r */
    public final boolean m14320r() {
        this.f11771a.zzl().mo13687i();
        return this.f11785o;
    }

    /* renamed from: r0 */
    public final String m14321r0() {
        this.f11771a.zzl().mo13687i();
        return this.f11787q;
    }

    /* renamed from: s */
    public final boolean m14322s() {
        this.f11771a.zzl().mo13687i();
        return this.f11768I;
    }

    /* renamed from: s0 */
    public final String m14323s0() {
        this.f11771a.zzl().mo13687i();
        String str = this.f11767H;
        m14275P(null);
        return str;
    }

    /* renamed from: t */
    public final boolean m14324t() {
        this.f11771a.zzl().mo13687i();
        return this.f11792v;
    }

    /* renamed from: t0 */
    public final String m14325t0() {
        this.f11771a.zzl().mo13687i();
        return this.f11772b;
    }

    /* renamed from: u */
    public final boolean m14326u() {
        this.f11771a.zzl().mo13687i();
        return this.f11796z;
    }

    /* renamed from: u0 */
    public final String m14327u0() {
        this.f11771a.zzl().mo13687i();
        return this.f11773c;
    }

    /* renamed from: v */
    public final long m14328v() {
        this.f11771a.zzl().mo13687i();
        return 0L;
    }

    /* renamed from: v0 */
    public final String m14329v0() {
        this.f11771a.zzl().mo13687i();
        return this.f11782l;
    }

    /* renamed from: w */
    public final void m14330w(long j10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11760A != j10;
        this.f11760A = j10;
    }

    /* renamed from: x */
    public final void m14331x(String str) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= !C12114l.m38850a(this.f11773c, str);
        this.f11773c = str;
    }

    /* renamed from: y */
    public final void m14332y(boolean z10) {
        this.f11771a.zzl().mo13687i();
        this.f11768I |= this.f11785o != z10;
        this.f11785o = z10;
    }

    /* renamed from: z */
    public final long m14333z() {
        this.f11771a.zzl().mo13687i();
        return this.f11781k;
    }
}
