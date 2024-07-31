package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.b7;
import com.google.android.gms.measurement.internal.y6;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b7 extends y2 {

    /* renamed from: c */
    protected f8 f9985c;

    /* renamed from: d */
    private wa.v f9986d;

    /* renamed from: e */
    private final Set<wa.u> f9987e;

    /* renamed from: f */
    private boolean f9988f;

    /* renamed from: g */
    private final AtomicReference<String> f9989g;

    /* renamed from: h */
    private final Object f9990h;

    /* renamed from: i */
    private boolean f9991i;

    /* renamed from: j */
    private PriorityQueue<na> f9992j;

    /* renamed from: k */
    private y6 f9993k;

    /* renamed from: l */
    private final AtomicLong f9994l;

    /* renamed from: m */
    private long f9995m;

    /* renamed from: n */
    final qb f9996n;

    /* renamed from: o */
    private boolean f9997o;

    /* renamed from: p */
    private u f9998p;

    /* renamed from: q */
    private final kb f9999q;

    public b7(w5 w5Var) {
        super(w5Var);
        this.f9987e = new CopyOnWriteArraySet();
        this.f9990h = new Object();
        this.f9991i = false;
        this.f9997o = true;
        this.f9999q = new x7(this);
        this.f9989g = new AtomicReference<>();
        this.f9993k = y6.f10861c;
        this.f9995m = -1L;
        this.f9994l = new AtomicLong(0L);
        this.f9996n = new qb(w5Var);
    }

    public static /* synthetic */ void G(b7 b7Var, y6 y6Var, long j10, boolean z10, boolean z11) {
        b7Var.i();
        b7Var.q();
        y6 E = b7Var.e().E();
        if (j10 <= b7Var.f9995m && y6.k(E.b(), y6Var.b())) {
            b7Var.zzj().E().b("Dropped out-of-date consent setting, proposed settings", y6Var);
            return;
        }
        if (!b7Var.e().v(y6Var)) {
            b7Var.zzj().E().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(y6Var.b()));
            return;
        }
        b7Var.f9995m = j10;
        b7Var.o().P(z10);
        if (z11) {
            b7Var.o().J(new AtomicReference<>());
        }
    }

    public static /* synthetic */ void H(b7 b7Var, y6 y6Var, y6 y6Var2) {
        y6.a aVar = y6.a.ANALYTICS_STORAGE;
        y6.a aVar2 = y6.a.AD_STORAGE;
        boolean m10 = y6Var.m(y6Var2, aVar, aVar2);
        boolean r10 = y6Var.r(y6Var2, aVar, aVar2);
        if (m10 || r10) {
            b7Var.k().D();
        }
    }

    public final void L(Boolean bool, boolean z10) {
        i();
        q();
        zzj().A().b("Setting app measurement enabled (FE)", bool);
        e().q(bool);
        if (z10) {
            e().x(bool);
        }
        if (this.f10701a.l() || !(bool == null || bool.booleanValue())) {
            o0();
        }
    }

    private final void P(String str, String str2, long j10, Object obj) {
        zzl().y(new o7(this, str, str2, obj, j10));
    }

    private final PriorityQueue<na> n0() {
        Comparator comparing;
        if (this.f9992j == null) {
            comparing = Comparator.comparing(wa.w.f29755a, wa.y.f29756a);
            this.f9992j = new PriorityQueue<>(comparing);
        }
        return this.f9992j;
    }

    public final void o0() {
        i();
        String a10 = e().f10847m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                T("app", "_npa", null, zzb().a());
            } else {
                T("app", "_npa", Long.valueOf("true".equals(a10) ? 1L : 0L), zzb().a());
            }
        }
        if (!this.f10701a.k() || !this.f9997o) {
            zzj().A().a("Updating Scion state (FE)");
            o().W();
            return;
        }
        zzj().A().a("Recording app launch after enabling measurement for the first time (FE)");
        i0();
        if (zzoh.zza() && a().n(e0.f10122q0)) {
            p().f10083e.a();
        }
        zzl().y(new n7(this));
    }

    private final void r0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        zzl().y(new p7(this, str, str2, j10, ib.y(bundle), z10, z11, z12, str3));
    }

    public final /* synthetic */ void A(Bundle bundle) {
        if (bundle == null) {
            e().f10859y.b(new Bundle());
            return;
        }
        Bundle a10 = e().f10859y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                f();
                if (ib.b0(obj)) {
                    f();
                    ib.S(this.f9999q, 27, null, null, 0);
                }
                zzj().H().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (ib.C0(str)) {
                zzj().H().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a10.remove(str);
            } else if (f().f0("param", str, a().o(this.f10701a.w().A()), obj)) {
                f().I(a10, str, obj);
            }
        }
        f();
        if (ib.a0(a10, a().z())) {
            f();
            ib.S(this.f9999q, 26, null, null, 0);
            zzj().H().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        e().f10859y.b(a10);
        o().x(a10);
    }

    public final void B(Bundle bundle, int i10, long j10) {
        q();
        String i11 = y6.i(bundle);
        if (i11 != null) {
            zzj().H().b("Ignoring invalid consent setting", i11);
            zzj().H().a("Valid consent values are 'granted', 'denied'");
        }
        y6 c10 = y6.c(bundle, i10);
        if (!zznp.zza() || !a().n(e0.S0)) {
            F(c10, j10);
            return;
        }
        if (c10.z()) {
            F(c10, j10);
        }
        v b10 = v.b(bundle, i10);
        if (b10.j()) {
            D(b10);
        }
        Boolean d10 = v.d(bundle);
        if (d10 != null) {
            U("app", "allow_personalized_ads", d10.toString(), false);
        }
    }

    public final void C(Bundle bundle, long j10) {
        com.google.android.gms.common.internal.s.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().G().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.s.j(bundle2);
        wa.q.a(bundle2, "app_id", String.class, null);
        wa.q.a(bundle2, "origin", String.class, null);
        wa.q.a(bundle2, "name", String.class, null);
        wa.q.a(bundle2, "value", Object.class, null);
        wa.q.a(bundle2, "trigger_event_name", String.class, null);
        wa.q.a(bundle2, "trigger_timeout", Long.class, 0L);
        wa.q.a(bundle2, "timed_out_event_name", String.class, null);
        wa.q.a(bundle2, "timed_out_event_params", Bundle.class, null);
        wa.q.a(bundle2, "triggered_event_name", String.class, null);
        wa.q.a(bundle2, "triggered_event_params", Bundle.class, null);
        wa.q.a(bundle2, "time_to_live", Long.class, 0L);
        wa.q.a(bundle2, "expired_event_name", String.class, null);
        wa.q.a(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.s.f(bundle2.getString("name"));
        com.google.android.gms.common.internal.s.f(bundle2.getString("origin"));
        com.google.android.gms.common.internal.s.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (f().l0(string) != 0) {
            zzj().B().b("Invalid conditional user property name", d().g(string));
            return;
        }
        if (f().r(string, obj) != 0) {
            zzj().B().c("Invalid conditional user property value", d().g(string), obj);
            return;
        }
        Object v02 = f().v0(string, obj);
        if (v02 == null) {
            zzj().B().c("Unable to normalize conditional user property value", d().g(string), obj);
            return;
        }
        wa.q.b(bundle2, v02);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            zzj().B().c("Invalid conditional user property timeout", d().g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            zzj().B().c("Invalid conditional user property time to live", d().g(string), Long.valueOf(j12));
        } else {
            zzl().y(new u7(this, bundle2));
        }
    }

    public final void D(v vVar) {
        zzl().y(new e8(this, vVar));
    }

    public final void E(y6 y6Var) {
        i();
        boolean z10 = (y6Var.y() && y6Var.x()) || o().Z();
        if (z10 != this.f10701a.l()) {
            this.f10701a.r(z10);
            Boolean G = e().G();
            if (!z10 || G == null || G.booleanValue()) {
                L(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void F(y6 y6Var, long j10) {
        y6 y6Var2;
        boolean z10;
        y6 y6Var3;
        boolean z11;
        boolean z12;
        q();
        int b10 = y6Var.b();
        if (b10 != -10 && y6Var.s() == null && y6Var.u() == null) {
            zzj().H().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f9990h) {
            y6Var2 = this.f9993k;
            z10 = false;
            if (y6.k(b10, y6Var2.b())) {
                z12 = y6Var.t(this.f9993k);
                if (y6Var.y() && !this.f9993k.y()) {
                    z10 = true;
                }
                y6 p10 = y6Var.p(this.f9993k);
                this.f9993k = p10;
                y6Var3 = p10;
                z11 = z10;
                z10 = true;
            } else {
                y6Var3 = y6Var;
                z11 = false;
                z12 = false;
            }
        }
        if (!z10) {
            zzj().E().b("Ignoring lower-priority consent settings, proposed settings", y6Var3);
            return;
        }
        long andIncrement = this.f9994l.getAndIncrement();
        if (z12) {
            M(null);
            zzl().B(new d8(this, y6Var3, j10, andIncrement, z11, y6Var2));
            return;
        }
        g8 g8Var = new g8(this, y6Var3, andIncrement, z11, y6Var2);
        if (b10 == 30 || b10 == -10) {
            zzl().B(g8Var);
        } else {
            zzl().y(g8Var);
        }
    }

    public final void K(Boolean bool) {
        q();
        zzl().y(new b8(this, bool));
    }

    public final void M(String str) {
        this.f9989g.set(str);
    }

    public final void N(String str, String str2, long j10, Bundle bundle) {
        i();
        O(str, str2, j10, bundle, true, this.f9986d == null || ib.C0(str2), true, null);
    }

    public final void O(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        long j11;
        String str4;
        b7 b7Var;
        String str5;
        String str6;
        boolean z13;
        int length;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(bundle);
        i();
        q();
        if (!this.f10701a.k()) {
            zzj().A().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> C = k().C();
        if (C != null && !C.contains(str2)) {
            zzj().A().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        boolean z14 = true;
        if (!this.f9988f) {
            this.f9988f = true;
            try {
                try {
                    (!this.f10701a.o() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e10) {
                    zzj().G().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                zzj().E().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                T("auto", "_lgclid", bundle.getString("gclid"), zzb().a());
            }
            if (zzoi.zza() && a().n(e0.Z0) && bundle.containsKey("gbraid")) {
                T("auto", "_gbraid", bundle.getString("gbraid"), zzb().a());
            }
        }
        if (z10 && ib.G0(str2)) {
            f().H(bundle, e().f10859y.a());
        }
        if (!z12 && !"_iap".equals(str2)) {
            ib G = this.f10701a.G();
            int i10 = 2;
            if (G.x0("event", str2)) {
                if (!G.j0("event", wa.r.f29745a, wa.r.f29746b, str2)) {
                    i10 = 13;
                } else if (G.d0("event", 40, str2)) {
                    i10 = 0;
                }
            }
            if (i10 != 0) {
                zzj().C().b("Invalid public event name. Event will not be logged (FE)", d().c(str2));
                this.f10701a.G();
                String D = ib.D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f10701a.G();
                ib.S(this.f9999q, i10, "_ev", D, length);
                return;
            }
        }
        p8 x10 = n().x(false);
        if (x10 != null && !bundle.containsKey("_sc")) {
            x10.f10512d = true;
        }
        ib.R(x10, bundle, z10 && !z12);
        boolean equals = "am".equals(str);
        boolean C0 = ib.C0(str2);
        if (z10 && this.f9986d != null && !C0 && !equals) {
            zzj().A().c("Passing event to registered event handler (FE)", d().c(str2), d().a(bundle));
            com.google.android.gms.common.internal.s.j(this.f9986d);
            this.f9986d.a(str, str2, bundle, j10);
            return;
        }
        if (this.f10701a.n()) {
            int q10 = f().q(str2);
            if (q10 != 0) {
                zzj().C().b("Invalid event name. Event will not be logged (FE)", d().c(str2));
                f();
                String D2 = ib.D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f10701a.G();
                ib.T(this.f9999q, str3, q10, "_ev", D2, length);
                return;
            }
            Bundle z15 = f().z(str3, str2, bundle, la.g.b("_o", "_sn", "_sc", "_si"), z12);
            com.google.android.gms.common.internal.s.j(z15);
            if (n().x(false) != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                ja jaVar = p().f10084f;
                long b10 = jaVar.f10317d.zzb().b();
                long j12 = b10 - jaVar.f10315b;
                jaVar.f10315b = b10;
                if (j12 > 0) {
                    f().G(z15, j12);
                }
            }
            if (zznv.zza() && a().n(e0.f10120p0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    ib f10 = f();
                    String string = z15.getString("_ffr");
                    String trim = la.t.b(string) ? null : string != null ? string.trim() : string;
                    if (wa.h0.a(trim, f10.e().f10856v.a())) {
                        f10.zzj().A().a("Not logging duplicate session_start_with_rollout event");
                        z13 = false;
                    } else {
                        f10.e().f10856v.b(trim);
                        z13 = true;
                    }
                    if (!z13) {
                        return;
                    }
                } else if (Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                    String a10 = f().e().f10856v.a();
                    if (!TextUtils.isEmpty(a10)) {
                        z15.putString("_ffr", a10);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(z15);
            boolean A = a().n(e0.Q0) ? p().A() : e().f10853s.b();
            if (e().f10850p.a() > 0 && e().t(j10) && A) {
                zzj().F().a("Current session is expired, remove the session number, ID, and engagement time");
                long a11 = zzb().a();
                j11 = 0;
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
                T("auto", "_sid", null, a11);
                T("auto", "_sno", null, zzb().a());
                T("auto", "_se", null, zzb().a());
                e().f10851q.b(0L);
            } else {
                j11 = 0;
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
            }
            if (z15.getLong("extend_session", j11) == 1) {
                zzj().F().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                b7Var = this;
                b7Var.f10701a.F().f10083e.b(j10, true);
            } else {
                b7Var = this;
            }
            ArrayList arrayList2 = new ArrayList(z15.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                String str7 = (String) obj;
                if (str7 != null) {
                    f();
                    Bundle[] s02 = ib.s0(z15.get(str7));
                    if (s02 != null) {
                        z15.putParcelableArray(str7, s02);
                    }
                }
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i12);
                if (i12 != 0 ? z14 : false) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z11) {
                    bundle2 = f().m0(bundle2);
                }
                Bundle bundle3 = bundle2;
                o().D(new d0(str6, new z(bundle3), str, j10), str3);
                if (!equals) {
                    Iterator<wa.u> it = b7Var.f9987e.iterator();
                    while (it.hasNext()) {
                        it.next().a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
                z14 = true;
            }
            if (n().x(false) == null || !str4.equals(str2)) {
                return;
            }
            p().z(true, true, zzb().b());
        }
    }

    public final void Q(String str, String str2, Bundle bundle) {
        long a10 = zzb().a();
        com.google.android.gms.common.internal.s.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().y(new t7(this, bundle2));
    }

    public final void R(String str, String str2, Bundle bundle, String str3) {
        h();
        r0(str, str2, zzb().a(), bundle, false, true, true, str3);
    }

    public final void S(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            n().D(bundle2, j10);
        } else {
            r0(str3, str2, j10, bundle2, z11, !z11 || this.f9986d == null || ib.C0(str2), z10, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.s.f(r9)
            com.google.android.gms.common.internal.s.f(r10)
            r8.i()
            r8.q()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.y4 r0 = r8.e()
            com.google.android.gms.measurement.internal.e5 r0 = r0.f10847m
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
            goto L5e
        L50:
            if (r11 != 0) goto L60
            com.google.android.gms.measurement.internal.y4 r10 = r8.e()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f10847m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L5e:
            r3 = r1
            goto L62
        L60:
            r3 = r10
            r6 = r11
        L62:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f10701a
            boolean r10 = r10.k()
            if (r10 != 0) goto L78
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f10701a
            boolean r10 = r10.n()
            if (r10 != 0) goto L81
            return
        L81:
            com.google.android.gms.measurement.internal.hb r10 = new com.google.android.gms.measurement.internal.hb
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.v8 r9 = r8.o()
            r9.H(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b7.T(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void U(String str, String str2, Object obj, boolean z10) {
        V(str, str2, obj, z10, zzb().a());
    }

    public final void V(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z10) {
            i10 = f().l0(str2);
        } else {
            ib f10 = f();
            if (f10.x0("user property", str2)) {
                if (!f10.i0("user property", wa.s.f29749a, str2)) {
                    i10 = 15;
                } else if (f10.d0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            f();
            String D = ib.D(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f10701a.G();
            ib.S(this.f9999q, i10, "_ev", D, length);
            return;
        }
        if (obj == null) {
            P(str3, str2, j10, null);
            return;
        }
        int r10 = f().r(str2, obj);
        if (r10 == 0) {
            Object v02 = f().v0(str2, obj);
            if (v02 != null) {
                P(str3, str2, j10, v02);
                return;
            }
            return;
        }
        f();
        String D2 = ib.D(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f10701a.G();
        ib.S(this.f9999q, r10, "_ev", D2, length);
    }

    public final /* synthetic */ void W(List list) {
        boolean contains;
        i();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> C = e().C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                na naVar = (na) it.next();
                contains = C.contains(naVar.f10449c);
                if (!contains || C.get(naVar.f10449c).longValue() < naVar.f10448b) {
                    n0().add(naVar);
                }
            }
            m0();
        }
    }

    public final void X(wa.u uVar) {
        q();
        com.google.android.gms.common.internal.s.j(uVar);
        if (this.f9987e.add(uVar)) {
            return;
        }
        zzj().G().a("OnEventListener already registered");
    }

    public final void Y(wa.v vVar) {
        wa.v vVar2;
        i();
        q();
        if (vVar != null && vVar != (vVar2 = this.f9986d)) {
            com.google.android.gms.common.internal.s.o(vVar2 == null, "EventInterceptor already set.");
        }
        this.f9986d = vVar;
    }

    public final Boolean Z() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().q(atomicReference, 15000L, "boolean test flag value", new j7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final Double a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().q(atomicReference, 15000L, "double test flag value", new c8(this, atomicReference));
    }

    public final Integer b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().q(atomicReference, 15000L, "int test flag value", new z7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final Long c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().q(atomicReference, 15000L, "long test flag value", new a8(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final String d0() {
        return this.f9989g.get();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final String e0() {
        p8 K = this.f10701a.D().K();
        if (K != null) {
            return K.f10510b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final String f0() {
        p8 K = this.f10701a.D().K();
        if (K != null) {
            return K.f10509a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final String g0() {
        if (this.f10701a.H() != null) {
            return this.f10701a.H();
        }
        try {
            return new wa.p(zza(), this.f10701a.K()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f10701a.zzj().B().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final String h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().q(atomicReference, 15000L, "String test flag value", new r7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final void i0() {
        i();
        q();
        if (this.f10701a.n()) {
            if (a().n(e0.f10110k0)) {
                Boolean A = a().A("google_analytics_deferred_deep_link_enabled");
                if (A != null && A.booleanValue()) {
                    zzj().A().a("Deferred Deep Link feature enabled.");
                    zzl().y(new Runnable() { // from class: wa.z
                        public /* synthetic */ z() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            b7.this.l0();
                        }
                    });
                }
            }
            o().S();
            this.f9997o = false;
            String I = e().I();
            if (TextUtils.isEmpty(I)) {
                return;
            }
            c().j();
            if (I.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", I);
            u0("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    public final void j0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f9985c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f9985c);
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    public final void k0() {
        if (zzpg.zza() && a().n(e0.M0)) {
            if (zzl().E()) {
                zzj().B().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (e.a()) {
                zzj().B().a("Cannot get trigger URIs from main thread");
                return;
            }
            q();
            zzj().F().a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzl().q(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.c7

                /* renamed from: b */
                private /* synthetic */ AtomicReference f10032b;

                public /* synthetic */ c7(AtomicReference atomicReference2) {
                    r2 = atomicReference2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b7 b7Var = b7.this;
                    AtomicReference<List<na>> atomicReference2 = r2;
                    Bundle a10 = b7Var.e().f10848n.a();
                    v8 o10 = b7Var.o();
                    if (a10 == null) {
                        a10 = new Bundle();
                    }
                    o10.K(atomicReference2, a10);
                }
            });
            List list = (List) atomicReference2.get();
            if (list == null) {
                zzj().B().a("Timed out waiting for get trigger URIs");
            } else {
                zzl().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.e7

                    /* renamed from: b */
                    private /* synthetic */ List f10156b;

                    public /* synthetic */ e7(List list2) {
                        r2 = list2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b7.this.W(r2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    public final void l0() {
        i();
        if (e().f10854t.b()) {
            zzj().A().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = e().f10855u.a();
        e().f10855u.b(1 + a10);
        if (a10 >= 5) {
            zzj().G().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f10854t.a(true);
        } else {
            if (!zznp.zza() || !a().n(e0.U0)) {
                this.f10701a.p();
                return;
            }
            if (this.f9998p == null) {
                this.f9998p = new q7(this, this.f10701a);
            }
            this.f9998p.b(0L);
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    public final void m0() {
        na poll;
        n1.a L0;
        i();
        if (n0().isEmpty() || this.f9991i || (poll = n0().poll()) == null || (L0 = f().L0()) == null) {
            return;
        }
        this.f9991i = true;
        zzj().F().b("Registering trigger URI", poll.f10447a);
        com.google.common.util.concurrent.f<ck.v> d10 = L0.d(Uri.parse(poll.f10447a));
        if (d10 == null) {
            this.f9991i = false;
            n0().add(poll);
            return;
        }
        SparseArray<Long> C = e().C();
        C.put(poll.f10449c, Long.valueOf(poll.f10448b));
        y4 e10 = e();
        int[] iArr = new int[C.size()];
        long[] jArr = new long[C.size()];
        for (int i10 = 0; i10 < C.size(); i10++) {
            iArr[i10] = C.keyAt(i10);
            jArr[i10] = C.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        e10.f10848n.b(bundle);
        com.google.common.util.concurrent.d.a(d10, new l7(this, poll), new h7(this));
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

    public final void p0(Bundle bundle) {
        C(bundle, zzb().a());
    }

    public final void s0(String str, String str2, Bundle bundle) {
        S(str, str2, bundle, true, true, zzb().a());
    }

    public final void t0(wa.u uVar) {
        q();
        com.google.android.gms.common.internal.s.j(uVar);
        if (this.f9987e.remove(uVar)) {
            return;
        }
        zzj().G().a("OnEventListener had not been registered");
    }

    public final void u0(String str, String str2, Bundle bundle) {
        i();
        N(str, str2, zzb().a(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean v() {
        return false;
    }

    public final ArrayList<Bundle> x(String str, String str2) {
        if (zzl().E()) {
            zzj().B().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (e.a()) {
            zzj().B().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f10701a.zzl().q(atomicReference, 5000L, "get conditional user properties", new w7(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ib.o0(list);
        }
        zzj().B().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> y(String str, String str2, boolean z10) {
        p4 B;
        String str3;
        if (zzl().E()) {
            B = zzj().B();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!e.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f10701a.zzl().q(atomicReference, 5000L, "get user properties", new v7(this, atomicReference, null, str, str2, z10));
                List<hb> list = (List) atomicReference.get();
                if (list == null) {
                    zzj().B().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                androidx.collection.a aVar = new androidx.collection.a(list.size());
                for (hb hbVar : list) {
                    Object u12 = hbVar.u1();
                    if (u12 != null) {
                        aVar.put(hbVar.f10237b, u12);
                    }
                }
                return aVar;
            }
            B = zzj().B();
            str3 = "Cannot get user properties from main thread";
        }
        B.a(str3);
        return Collections.emptyMap();
    }

    public final void z(long j10, boolean z10) {
        i();
        q();
        zzj().A().a("Resetting analytics data (FE)");
        da p10 = p();
        p10.i();
        p10.f10084f.b();
        if (zzps.zza() && a().n(e0.f10136x0)) {
            k().D();
        }
        boolean k10 = this.f10701a.k();
        y4 e10 = e();
        e10.f10839e.b(j10);
        if (!TextUtils.isEmpty(e10.e().f10856v.a())) {
            e10.f10856v.b(null);
        }
        if (zzoh.zza() && e10.a().n(e0.f10122q0)) {
            e10.f10850p.b(0L);
        }
        e10.f10851q.b(0L);
        if (!e10.a().M()) {
            e10.z(!k10);
        }
        e10.f10857w.b(null);
        e10.f10858x.b(0L);
        e10.f10859y.b(null);
        if (z10) {
            o().V();
        }
        if (zzoh.zza() && a().n(e0.f10122q0)) {
            p().f10083e.a();
        }
        this.f9997o = !k10;
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
