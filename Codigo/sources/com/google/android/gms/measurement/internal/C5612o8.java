package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.C5276s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import la.InterfaceC9461f;
import p418wa.C12100d0;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* loaded from: classes2.dex */
public final class C5612o8 extends AbstractC5733y2 {

    /* renamed from: c */
    private volatile C5625p8 f11655c;

    /* renamed from: d */
    private volatile C5625p8 f11656d;

    /* renamed from: e */
    protected C5625p8 f11657e;

    /* renamed from: f */
    private final Map<Activity, C5625p8> f11658f;

    /* renamed from: g */
    private Activity f11659g;

    /* renamed from: h */
    private volatile boolean f11660h;

    /* renamed from: i */
    private volatile C5625p8 f11661i;

    /* renamed from: j */
    private C5625p8 f11662j;

    /* renamed from: k */
    private boolean f11663k;

    /* renamed from: l */
    private final Object f11664l;

    public C5612o8(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11664l = new Object();
        this.f11658f = new ConcurrentHashMap();
    }

    /* renamed from: B */
    private final void m14196B(Activity activity, C5625p8 c5625p8, boolean z10) {
        C5625p8 c5625p82;
        C5625p8 c5625p83 = this.f11655c == null ? this.f11656d : this.f11655c;
        if (c5625p8.f11697b == null) {
            c5625p82 = new C5625p8(c5625p8.f11696a, activity != null ? m14205y(activity.getClass(), "Activity") : null, c5625p8.f11698c, c5625p8.f11700e, c5625p8.f11701f);
        } else {
            c5625p82 = c5625p8;
        }
        this.f11656d = this.f11655c;
        this.f11655c = c5625p82;
        zzl().m14248y(new RunnableC5664s8(this, c5625p82, c5625p83, zzb().mo28131b(), z10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m14197E(C5612o8 c5612o8, Bundle bundle, C5625p8 c5625p8, C5625p8 c5625p82, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c5612o8.m14201I(c5625p8, c5625p82, j10, true, c5612o8.mo13681f().m14052z(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.BaseBundle, long] */
    /* renamed from: I */
    public final void m14201I(C5625p8 c5625p8, C5625p8 c5625p82, long j10, boolean z10, Bundle bundle) {
        long j11;
        mo13687i();
        boolean z11 = false;
        boolean z12 = (c5625p82 != null && c5625p82.f11698c == c5625p8.f11698c && C12100d0.m38848a(c5625p82.f11697b, c5625p8.f11697b) && C12100d0.m38848a(c5625p82.f11696a, c5625p8.f11696a)) ? false : true;
        if (z10 && this.f11657e != null) {
            z11 = true;
        }
        if (z12) {
            C5537ib.m13982R(c5625p8, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (c5625p82 != null) {
                String str = c5625p82.f11696a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = c5625p82.f11697b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r82 = c5625p82.f11698c;
                r82.putLong("_pi", r82);
            }
            ?? r83 = 0;
            if (z11) {
                long m14058a = mo13699p().f11204f.m14058a(j10);
                if (m14058a > 0) {
                    mo13681f().m14013G(null, m14058a);
                }
            }
            if (!mo13672a().m13892L()) {
                r83.putLong("_mst", 1L);
            }
            String str3 = c5625p8.f11700e ? "app" : "auto";
            long mo28130a = zzb().mo28130a();
            if (c5625p8.f11700e) {
                mo28130a = c5625p8.f11701f;
                if (mo28130a != 0) {
                    j11 = mo28130a;
                    mo13695m().m13660N(str3, "_vs", j11, null);
                }
            }
            j11 = mo28130a;
            mo13695m().m13660N(str3, "_vs", j11, null);
        }
        if (z11) {
            m14202J(this.f11657e, true, j10);
        }
        this.f11657e = c5625p8;
        if (c5625p8.f11700e) {
            this.f11662j = c5625p8;
        }
        mo13698o().m14391E(c5625p8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m14202J(C5625p8 c5625p8, boolean z10, long j10) {
        mo13689j().m14535q(zzb().mo28131b());
        if (!mo13699p().m13729z(c5625p8 != null && c5625p8.f11699d, z10, j10) || c5625p8 == null) {
            return;
        }
        c5625p8.f11699d = false;
    }

    /* renamed from: O */
    private final C5625p8 m14203O(Activity activity) {
        C5276s.m13324j(activity);
        C5625p8 c5625p8 = this.f11658f.get(activity);
        if (c5625p8 == null) {
            C5625p8 c5625p82 = new C5625p8(null, m14205y(activity.getClass(), "Activity"), mo13681f().m14018K0());
            this.f11658f.put(activity, c5625p82);
            c5625p8 = c5625p82;
        }
        return this.f11661i != null ? this.f11661i : c5625p8;
    }

    /* renamed from: y */
    private final String m14205y(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > mo13672a().m13901o(null) ? str2.substring(0, mo13672a().m13901o(null)) : str2;
    }

    /* renamed from: A */
    public final void m14206A(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!mo13672a().m13892L() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f11658f.put(activity, new C5625p8(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(FacebookMediationAdapter.KEY_ID)));
    }

    @Deprecated
    /* renamed from: C */
    public final void m14207C(Activity activity, String str, String str2) {
        if (!mo13672a().m13892L()) {
            zzj().m14188H().m14218a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C5625p8 c5625p8 = this.f11655c;
        if (c5625p8 == null) {
            zzj().m14188H().m14218a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f11658f.get(activity) == null) {
            zzj().m14188H().m14218a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m14205y(activity.getClass(), "Activity");
        }
        boolean m38848a = C12100d0.m38848a(c5625p8.f11697b, str2);
        boolean m38848a2 = C12100d0.m38848a(c5625p8.f11696a, str);
        if (m38848a && m38848a2) {
            zzj().m14188H().m14218a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > mo13672a().m13901o(null))) {
            zzj().m14188H().m14219b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > mo13672a().m13901o(null))) {
            zzj().m14188H().m14219b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().m14186F().m14220c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C5625p8 c5625p82 = new C5625p8(str, str2, mo13681f().m14018K0());
        this.f11658f.put(activity, c5625p82);
        m14196B(activity, c5625p82, true);
    }

    /* renamed from: D */
    public final void m14208D(Bundle bundle, long j10) {
        String str;
        synchronized (this.f11664l) {
            if (!this.f11663k) {
                zzj().m14188H().m14218a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > mo13672a().m13901o(null))) {
                    zzj().m14188H().m14219b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > mo13672a().m13901o(null))) {
                    zzj().m14188H().m14219b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str2 = string2;
                    str = string;
                }
            } else {
                str = null;
            }
            if (str2 == null) {
                Activity activity = this.f11659g;
                str2 = activity != null ? m14205y(activity.getClass(), "Activity") : "Activity";
            }
            String str3 = str2;
            C5625p8 c5625p8 = this.f11655c;
            if (this.f11660h && c5625p8 != null) {
                this.f11660h = false;
                boolean m38848a = C12100d0.m38848a(c5625p8.f11697b, str3);
                boolean m38848a2 = C12100d0.m38848a(c5625p8.f11696a, str);
                if (m38848a && m38848a2) {
                    zzj().m14188H().m14218a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzj().m14186F().m14220c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            C5625p8 c5625p82 = this.f11655c == null ? this.f11656d : this.f11655c;
            C5625p8 c5625p83 = new C5625p8(str, str3, mo13681f().m14018K0(), true, j10);
            this.f11655c = c5625p83;
            this.f11656d = c5625p82;
            this.f11661i = c5625p83;
            zzl().m14248y(new RunnableC5638q8(this, bundle, c5625p83, c5625p82, zzb().mo28131b()));
        }
    }

    /* renamed from: K */
    public final C5625p8 m14209K() {
        return this.f11655c;
    }

    /* renamed from: L */
    public final void m14210L(Activity activity) {
        synchronized (this.f11664l) {
            this.f11663k = false;
            this.f11660h = true;
        }
        long mo28131b = zzb().mo28131b();
        if (!mo13672a().m13892L()) {
            this.f11655c = null;
            zzl().m14248y(new RunnableC5690u8(this, mo28131b));
        } else {
            C5625p8 m14203O = m14203O(activity);
            this.f11656d = this.f11655c;
            this.f11655c = null;
            zzl().m14248y(new RunnableC5677t8(this, m14203O, mo28131b));
        }
    }

    /* renamed from: M */
    public final void m14211M(Activity activity, Bundle bundle) {
        C5625p8 c5625p8;
        if (!mo13672a().m13892L() || bundle == null || (c5625p8 = this.f11658f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(FacebookMediationAdapter.KEY_ID, c5625p8.f11698c);
        bundle2.putString("name", c5625p8.f11696a);
        bundle2.putString("referrer_name", c5625p8.f11697b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: N */
    public final void m14212N(Activity activity) {
        synchronized (this.f11664l) {
            this.f11663k = true;
            if (activity != this.f11659g) {
                synchronized (this.f11664l) {
                    this.f11659g = activity;
                    this.f11660h = false;
                }
                if (mo13672a().m13892L()) {
                    this.f11661i = null;
                    zzl().m14248y(new RunnableC5715w8(this));
                }
            }
        }
        if (!mo13672a().m13892L()) {
            this.f11655c = this.f11661i;
            zzl().m14248y(new RunnableC5651r8(this));
        } else {
            m14196B(activity, m14203O(activity), false);
            C5718x mo13689j = mo13689j();
            mo13689j.zzl().m14248y(new RunnableC5707w0(mo13689j, mo13689j.zzb().mo28131b()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5718x mo13689j() {
        return super.mo13689j();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5530i4 mo13691k() {
        return super.mo13691k();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5569l4 mo13693l() {
        return super.mo13693l();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5442b7 mo13695m() {
        return super.mo13695m();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5612o8 mo13697n() {
        return super.mo13697n();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5703v8 mo13698o() {
        return super.mo13698o();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5471da mo13699p() {
        return super.mo13699p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: v */
    protected final boolean mo13704v() {
        return false;
    }

    /* renamed from: x */
    public final C5625p8 m14213x(boolean z10) {
        m14545q();
        mo13687i();
        if (!z10) {
            return this.f11657e;
        }
        C5625p8 c5625p8 = this.f11657e;
        return c5625p8 != null ? c5625p8 : this.f11662j;
    }

    /* renamed from: z */
    public final void m14214z(Activity activity) {
        synchronized (this.f11664l) {
            if (activity == this.f11659g) {
                this.f11659g = null;
            }
        }
        if (mo13672a().m13892L()) {
            this.f11658f.remove(activity);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
