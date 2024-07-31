package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o8 extends y2 {

    /* renamed from: c */
    private volatile p8 f10468c;

    /* renamed from: d */
    private volatile p8 f10469d;

    /* renamed from: e */
    protected p8 f10470e;

    /* renamed from: f */
    private final Map<Activity, p8> f10471f;

    /* renamed from: g */
    private Activity f10472g;

    /* renamed from: h */
    private volatile boolean f10473h;

    /* renamed from: i */
    private volatile p8 f10474i;

    /* renamed from: j */
    private p8 f10475j;

    /* renamed from: k */
    private boolean f10476k;

    /* renamed from: l */
    private final Object f10477l;

    public o8(w5 w5Var) {
        super(w5Var);
        this.f10477l = new Object();
        this.f10471f = new ConcurrentHashMap();
    }

    private final void B(Activity activity, p8 p8Var, boolean z10) {
        p8 p8Var2;
        p8 p8Var3 = this.f10468c == null ? this.f10469d : this.f10468c;
        if (p8Var.f10510b == null) {
            p8Var2 = new p8(p8Var.f10509a, activity != null ? y(activity.getClass(), "Activity") : null, p8Var.f10511c, p8Var.f10513e, p8Var.f10514f);
        } else {
            p8Var2 = p8Var;
        }
        this.f10469d = this.f10468c;
        this.f10468c = p8Var2;
        zzl().y(new s8(this, p8Var2, p8Var3, zzb().b(), z10));
    }

    public static /* synthetic */ void E(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        o8Var.I(p8Var, p8Var2, j10, true, o8Var.f().z(null, "screen_view", bundle, null, false));
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.BaseBundle, long] */
    public final void I(p8 p8Var, p8 p8Var2, long j10, boolean z10, Bundle bundle) {
        long j11;
        i();
        boolean z11 = false;
        boolean z12 = (p8Var2 != null && p8Var2.f10511c == p8Var.f10511c && wa.d0.a(p8Var2.f10510b, p8Var.f10510b) && wa.d0.a(p8Var2.f10509a, p8Var.f10509a)) ? false : true;
        if (z10 && this.f10470e != null) {
            z11 = true;
        }
        if (z12) {
            ib.R(p8Var, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (p8Var2 != null) {
                String str = p8Var2.f10509a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = p8Var2.f10510b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r82 = p8Var2.f10511c;
                r82.putLong("_pi", r82);
            }
            ?? r83 = 0;
            if (z11) {
                long a10 = p().f10084f.a(j10);
                if (a10 > 0) {
                    f().G(null, a10);
                }
            }
            if (!a().L()) {
                r83.putLong("_mst", 1L);
            }
            String str3 = p8Var.f10513e ? "app" : "auto";
            long a11 = zzb().a();
            if (p8Var.f10513e) {
                a11 = p8Var.f10514f;
                if (a11 != 0) {
                    j11 = a11;
                    m().N(str3, "_vs", j11, null);
                }
            }
            j11 = a11;
            m().N(str3, "_vs", j11, null);
        }
        if (z11) {
            J(this.f10470e, true, j10);
        }
        this.f10470e = p8Var;
        if (p8Var.f10513e) {
            this.f10475j = p8Var;
        }
        o().E(p8Var);
    }

    public final void J(p8 p8Var, boolean z10, long j10) {
        j().q(zzb().b());
        if (!p().z(p8Var != null && p8Var.f10512d, z10, j10) || p8Var == null) {
            return;
        }
        p8Var.f10512d = false;
    }

    private final p8 O(Activity activity) {
        com.google.android.gms.common.internal.s.j(activity);
        p8 p8Var = this.f10471f.get(activity);
        if (p8Var == null) {
            p8 p8Var2 = new p8(null, y(activity.getClass(), "Activity"), f().K0());
            this.f10471f.put(activity, p8Var2);
            p8Var = p8Var2;
        }
        return this.f10474i != null ? this.f10474i : p8Var;
    }

    private final String y(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > a().o(null) ? str2.substring(0, a().o(null)) : str2;
    }

    public final void A(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!a().L() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f10471f.put(activity, new p8(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(FacebookMediationAdapter.KEY_ID)));
    }

    @Deprecated
    public final void C(Activity activity, String str, String str2) {
        if (!a().L()) {
            zzj().H().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        p8 p8Var = this.f10468c;
        if (p8Var == null) {
            zzj().H().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f10471f.get(activity) == null) {
            zzj().H().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = y(activity.getClass(), "Activity");
        }
        boolean a10 = wa.d0.a(p8Var.f10510b, str2);
        boolean a11 = wa.d0.a(p8Var.f10509a, str);
        if (a10 && a11) {
            zzj().H().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > a().o(null))) {
            zzj().H().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > a().o(null))) {
            zzj().H().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().F().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        p8 p8Var2 = new p8(str, str2, f().K0());
        this.f10471f.put(activity, p8Var2);
        B(activity, p8Var2, true);
    }

    public final void D(Bundle bundle, long j10) {
        String str;
        synchronized (this.f10477l) {
            if (!this.f10476k) {
                zzj().H().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > a().o(null))) {
                    zzj().H().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > a().o(null))) {
                    zzj().H().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str2 = string2;
                    str = string;
                }
            } else {
                str = null;
            }
            if (str2 == null) {
                Activity activity = this.f10472g;
                str2 = activity != null ? y(activity.getClass(), "Activity") : "Activity";
            }
            String str3 = str2;
            p8 p8Var = this.f10468c;
            if (this.f10473h && p8Var != null) {
                this.f10473h = false;
                boolean a10 = wa.d0.a(p8Var.f10510b, str3);
                boolean a11 = wa.d0.a(p8Var.f10509a, str);
                if (a10 && a11) {
                    zzj().H().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzj().F().c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            p8 p8Var2 = this.f10468c == null ? this.f10469d : this.f10468c;
            p8 p8Var3 = new p8(str, str3, f().K0(), true, j10);
            this.f10468c = p8Var3;
            this.f10469d = p8Var2;
            this.f10474i = p8Var3;
            zzl().y(new q8(this, bundle, p8Var3, p8Var2, zzb().b()));
        }
    }

    public final p8 K() {
        return this.f10468c;
    }

    public final void L(Activity activity) {
        synchronized (this.f10477l) {
            this.f10476k = false;
            this.f10473h = true;
        }
        long b10 = zzb().b();
        if (!a().L()) {
            this.f10468c = null;
            zzl().y(new u8(this, b10));
        } else {
            p8 O = O(activity);
            this.f10469d = this.f10468c;
            this.f10468c = null;
            zzl().y(new t8(this, O, b10));
        }
    }

    public final void M(Activity activity, Bundle bundle) {
        p8 p8Var;
        if (!a().L() || bundle == null || (p8Var = this.f10471f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(FacebookMediationAdapter.KEY_ID, p8Var.f10511c);
        bundle2.putString("name", p8Var.f10509a);
        bundle2.putString("referrer_name", p8Var.f10510b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void N(Activity activity) {
        synchronized (this.f10477l) {
            this.f10476k = true;
            if (activity != this.f10472g) {
                synchronized (this.f10477l) {
                    this.f10472g = activity;
                    this.f10473h = false;
                }
                if (a().L()) {
                    this.f10474i = null;
                    zzl().y(new w8(this));
                }
            }
        }
        if (!a().L()) {
            this.f10468c = this.f10474i;
            zzl().y(new r8(this));
        } else {
            B(activity, O(activity), false);
            x j10 = j();
            j10.zzl().y(new w0(j10, j10.zzb().b()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean v() {
        return false;
    }

    public final p8 x(boolean z10) {
        q();
        i();
        if (!z10) {
            return this.f10470e;
        }
        p8 p8Var = this.f10470e;
        return p8Var != null ? p8Var : this.f10475j;
    }

    public final void z(Activity activity) {
        synchronized (this.f10477l) {
            if (activity == this.f10472g) {
                this.f10472g = null;
            }
        }
        if (a().L()) {
            this.f10471f.remove(activity);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
