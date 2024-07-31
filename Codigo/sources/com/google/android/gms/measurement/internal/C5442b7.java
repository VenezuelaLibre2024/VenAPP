package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.C0731a;
import ck.C2037v;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.C5442b7;
import com.google.android.gms.measurement.internal.C5601na;
import com.google.android.gms.measurement.internal.C5737y6;
import com.google.common.util.concurrent.C5918d;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import java.util.function.Function;
import la.C9462g;
import la.C9475t;
import la.InterfaceC9461f;
import p244n1.AbstractC9630a;
import p418wa.C12108h0;
import p418wa.C12118p;
import p418wa.C12119q;
import p418wa.C12120r;
import p418wa.C12121s;
import p418wa.InterfaceC12123u;
import p418wa.InterfaceC12124v;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes2.dex */
public final class C5442b7 extends AbstractC5733y2 {

    /* renamed from: c */
    protected C5495f8 f11105c;

    /* renamed from: d */
    private InterfaceC12124v f11106d;

    /* renamed from: e */
    private final Set<InterfaceC12123u> f11107e;

    /* renamed from: f */
    private boolean f11108f;

    /* renamed from: g */
    private final AtomicReference<String> f11109g;

    /* renamed from: h */
    private final Object f11110h;

    /* renamed from: i */
    private boolean f11111i;

    /* renamed from: j */
    private PriorityQueue<C5601na> f11112j;

    /* renamed from: k */
    private C5737y6 f11113k;

    /* renamed from: l */
    private final AtomicLong f11114l;

    /* renamed from: m */
    private long f11115m;

    /* renamed from: n */
    final C5641qb f11116n;

    /* renamed from: o */
    private boolean f11117o;

    /* renamed from: p */
    private AbstractC5681u f11118p;

    /* renamed from: q */
    private final InterfaceC5563kb f11119q;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5442b7(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11107e = new CopyOnWriteArraySet();
        this.f11110h = new Object();
        this.f11111i = false;
        this.f11117o = true;
        this.f11119q = new C5726x7(this);
        this.f11109g = new AtomicReference<>();
        this.f11113k = C5737y6.f12076c;
        this.f11115m = -1L;
        this.f11114l = new AtomicLong(0L);
        this.f11116n = new C5641qb(c5712w5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m13641G(C5442b7 c5442b7, C5737y6 c5737y6, long j10, boolean z10, boolean z11) {
        c5442b7.mo13687i();
        c5442b7.m14545q();
        C5737y6 m14553E = c5442b7.mo13679e().m14553E();
        if (j10 <= c5442b7.f11115m && C5737y6.m14580k(m14553E.m14583b(), c5737y6.m14583b())) {
            c5442b7.zzj().m14185E().m14219b("Dropped out-of-date consent setting, proposed settings", c5737y6);
            return;
        }
        if (!c5442b7.mo13679e().m14567v(c5737y6)) {
            c5442b7.zzj().m14185E().m14219b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c5737y6.m14583b()));
            return;
        }
        c5442b7.f11115m = j10;
        c5442b7.mo13698o().m14399P(z10);
        if (z11) {
            c5442b7.mo13698o().m14393J(new AtomicReference<>());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m13642H(C5442b7 c5442b7, C5737y6 c5737y6, C5737y6 c5737y62) {
        C5737y6.a aVar = C5737y6.a.ANALYTICS_STORAGE;
        C5737y6.a aVar2 = C5737y6.a.AD_STORAGE;
        boolean m14586m = c5737y6.m14586m(c5737y62, aVar, aVar2);
        boolean m14589r = c5737y6.m14589r(c5737y62, aVar, aVar2);
        if (m14586m || m14589r) {
            c5442b7.mo13691k().m13926D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m13645L(Boolean bool, boolean z10) {
        mo13687i();
        m14545q();
        zzj().m14181A().m14219b("Setting app measurement enabled (FE)", bool);
        mo13679e().m14562q(bool);
        if (z10) {
            mo13679e().m14569x(bool);
        }
        if (this.f11899a.m14513l() || !(bool == null || bool.booleanValue())) {
            m13648o0();
        }
    }

    /* renamed from: P */
    private final void m13646P(String str, String str2, long j10, Object obj) {
        zzl().m14248y(new RunnableC5611o7(this, str, str2, obj, j10));
    }

    /* renamed from: n0 */
    private final PriorityQueue<C5601na> m13647n0() {
        Comparator comparing;
        if (this.f11112j == null) {
            comparing = Comparator.comparing(new Function() { // from class: wa.w
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((C5601na) obj).f11635b);
                }
            }, new Comparator() { // from class: wa.y
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
                }
            });
            this.f11112j = new PriorityQueue<>(comparing);
        }
        return this.f11112j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final void m13648o0() {
        mo13687i();
        String m13877a = mo13679e().f12062m.m13877a();
        if (m13877a != null) {
            if ("unset".equals(m13877a)) {
                m13665T("app", "_npa", null, zzb().mo28130a());
            } else {
                m13665T("app", "_npa", Long.valueOf("true".equals(m13877a) ? 1L : 0L), zzb().mo28130a());
            }
        }
        if (!this.f11899a.m14512k() || !this.f11117o) {
            zzj().m14181A().m14218a("Updating Scion state (FE)");
            mo13698o().m14406W();
            return;
        }
        zzj().m14181A().m14218a("Recording app launch after enabling measurement for the first time (FE)");
        m13688i0();
        if (zzoh.zza() && mo13672a().m13900n(C5474e0.f11294q0)) {
            mo13699p().f11203e.m14084a();
        }
        zzl().m14248y(new RunnableC5598n7(this));
    }

    /* renamed from: r0 */
    private final void m13650r0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        zzl().m14248y(new RunnableC5624p7(this, str, str2, j10, C5537ib.m14005y(bundle), z10, z11, z12, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ void m13652A(Bundle bundle) {
        if (bundle == null) {
            mo13679e().f12074y.m13594b(new Bundle());
            return;
        }
        Bundle m13593a = mo13679e().f12074y.m13593a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                mo13681f();
                if (C5537ib.m13991b0(obj)) {
                    mo13681f();
                    C5537ib.m13983S(this.f11119q, 27, null, null, 0);
                }
                zzj().m14188H().m14220c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C5537ib.m13972C0(str)) {
                zzj().m14188H().m14219b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m13593a.remove(str);
            } else if (mo13681f().m14035f0("param", str, mo13672a().m13901o(this.f11899a.m14523w().m13923A()), obj)) {
                mo13681f().m14015I(m13593a, str, obj);
            }
        }
        mo13681f();
        if (C5537ib.m13990a0(m13593a, mo13672a().m13912z())) {
            mo13681f();
            C5537ib.m13983S(this.f11119q, 26, null, null, 0);
            zzj().m14188H().m14218a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        mo13679e().f12074y.m13594b(m13593a);
        mo13698o().m14410x(m13593a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final void m13653B(Bundle bundle, int i10, long j10) {
        m14545q();
        String m14578i = C5737y6.m14578i(bundle);
        if (m14578i != null) {
            zzj().m14188H().m14219b("Ignoring invalid consent setting", m14578i);
            zzj().m14188H().m14218a("Valid consent values are 'granted', 'denied'");
        }
        C5737y6 m14573c = C5737y6.m14573c(bundle, i10);
        if (!zznp.zza() || !mo13672a().m13900n(C5474e0.f11244S0)) {
            m13657F(m14573c, j10);
            return;
        }
        if (m14573c.m14597z()) {
            m13657F(m14573c, j10);
        }
        C5694v m14364b = C5694v.m14364b(bundle, i10);
        if (m14364b.m14374j()) {
            m13655D(m14364b);
        }
        Boolean m14366d = C5694v.m14366d(bundle);
        if (m14366d != null) {
            m13666U("app", "allow_personalized_ads", m14366d.toString(), false);
        }
    }

    /* renamed from: C */
    public final void m13654C(Bundle bundle, long j10) {
        C5276s.m13324j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().m14187G().m14218a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C5276s.m13324j(bundle2);
        C12119q.m38854a(bundle2, "app_id", String.class, null);
        C12119q.m38854a(bundle2, "origin", String.class, null);
        C12119q.m38854a(bundle2, "name", String.class, null);
        C12119q.m38854a(bundle2, "value", Object.class, null);
        C12119q.m38854a(bundle2, "trigger_event_name", String.class, null);
        C12119q.m38854a(bundle2, "trigger_timeout", Long.class, 0L);
        C12119q.m38854a(bundle2, "timed_out_event_name", String.class, null);
        C12119q.m38854a(bundle2, "timed_out_event_params", Bundle.class, null);
        C12119q.m38854a(bundle2, "triggered_event_name", String.class, null);
        C12119q.m38854a(bundle2, "triggered_event_params", Bundle.class, null);
        C12119q.m38854a(bundle2, "time_to_live", Long.class, 0L);
        C12119q.m38854a(bundle2, "expired_event_name", String.class, null);
        C12119q.m38854a(bundle2, "expired_event_params", Bundle.class, null);
        C5276s.m13320f(bundle2.getString("name"));
        C5276s.m13320f(bundle2.getString("origin"));
        C5276s.m13324j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (mo13681f().m14038l0(string) != 0) {
            zzj().m14182B().m14219b("Invalid conditional user property name", mo13677d().m14169g(string));
            return;
        }
        if (mo13681f().m14045r(string, obj) != 0) {
            zzj().m14182B().m14220c("Invalid conditional user property value", mo13677d().m14169g(string), obj);
            return;
        }
        Object m14049v0 = mo13681f().m14049v0(string, obj);
        if (m14049v0 == null) {
            zzj().m14182B().m14220c("Unable to normalize conditional user property value", mo13677d().m14169g(string), obj);
            return;
        }
        C12119q.m38855b(bundle2, m14049v0);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            zzj().m14182B().m14220c("Invalid conditional user property timeout", mo13677d().m14169g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            zzj().m14182B().m14220c("Invalid conditional user property time to live", mo13677d().m14169g(string), Long.valueOf(j12));
        } else {
            zzl().m14248y(new RunnableC5689u7(this, bundle2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final void m13655D(C5694v c5694v) {
        zzl().m14248y(new RunnableC5482e8(this, c5694v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final void m13656E(C5737y6 c5737y6) {
        mo13687i();
        boolean z10 = (c5737y6.m14596y() && c5737y6.m14595x()) || mo13698o().m14409Z();
        if (z10 != this.f11899a.m14513l()) {
            this.f11899a.m14518r(z10);
            Boolean m14555G = mo13679e().m14555G();
            if (!z10 || m14555G == null || m14555G.booleanValue()) {
                m13645L(Boolean.valueOf(z10), false);
            }
        }
    }

    /* renamed from: F */
    public final void m13657F(C5737y6 c5737y6, long j10) {
        C5737y6 c5737y62;
        boolean z10;
        C5737y6 c5737y63;
        boolean z11;
        boolean z12;
        m14545q();
        int m14583b = c5737y6.m14583b();
        if (m14583b != -10 && c5737y6.m14590s() == null && c5737y6.m14592u() == null) {
            zzj().m14188H().m14218a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f11110h) {
            c5737y62 = this.f11113k;
            z10 = false;
            if (C5737y6.m14580k(m14583b, c5737y62.m14583b())) {
                z12 = c5737y6.m14591t(this.f11113k);
                if (c5737y6.m14596y() && !this.f11113k.m14596y()) {
                    z10 = true;
                }
                C5737y6 m14588p = c5737y6.m14588p(this.f11113k);
                this.f11113k = m14588p;
                c5737y63 = m14588p;
                z11 = z10;
                z10 = true;
            } else {
                c5737y63 = c5737y6;
                z11 = false;
                z12 = false;
            }
        }
        if (!z10) {
            zzj().m14185E().m14219b("Ignoring lower-priority consent settings, proposed settings", c5737y63);
            return;
        }
        long andIncrement = this.f11114l.getAndIncrement();
        if (z12) {
            m13659M(null);
            zzl().m14242B(new RunnableC5469d8(this, c5737y63, j10, andIncrement, z11, c5737y62));
            return;
        }
        RunnableC5508g8 runnableC5508g8 = new RunnableC5508g8(this, c5737y63, andIncrement, z11, c5737y62);
        if (m14583b == 30 || m14583b == -10) {
            zzl().m14242B(runnableC5508g8);
        } else {
            zzl().m14248y(runnableC5508g8);
        }
    }

    /* renamed from: K */
    public final void m13658K(Boolean bool) {
        m14545q();
        zzl().m14248y(new RunnableC5443b8(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final void m13659M(String str) {
        this.f11109g.set(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m13660N(String str, String str2, long j10, Bundle bundle) {
        mo13687i();
        m13661O(str, str2, j10, bundle, true, this.f11106d == null || C5537ib.m13972C0(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m13661O(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        long j11;
        String str4;
        C5442b7 c5442b7;
        String str5;
        String str6;
        boolean z13;
        int length;
        C5276s.m13320f(str);
        C5276s.m13324j(bundle);
        mo13687i();
        m14545q();
        if (!this.f11899a.m14512k()) {
            zzj().m14181A().m14218a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> m13925C = mo13691k().m13925C();
        if (m13925C != null && !m13925C.contains(str2)) {
            zzj().m14181A().m14220c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        boolean z14 = true;
        if (!this.f11108f) {
            this.f11108f = true;
            try {
                try {
                    (!this.f11899a.m14516o() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e10) {
                    zzj().m14187G().m14219b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                zzj().m14185E().m14218a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                m13665T("auto", "_lgclid", bundle.getString("gclid"), zzb().mo28130a());
            }
            if (zzoi.zza() && mo13672a().m13900n(C5474e0.f11258Z0) && bundle.containsKey("gbraid")) {
                m13665T("auto", "_gbraid", bundle.getString("gbraid"), zzb().mo28130a());
            }
        }
        if (z10 && C5537ib.m13976G0(str2)) {
            mo13681f().m14014H(bundle, mo13679e().f12074y.m13593a());
        }
        if (!z12 && !"_iap".equals(str2)) {
            C5537ib m14500G = this.f11899a.m14500G();
            int i10 = 2;
            if (m14500G.m14051x0("event", str2)) {
                if (!m14500G.m14037j0("event", C12120r.f32210a, C12120r.f32211b, str2)) {
                    i10 = 13;
                } else if (m14500G.m14033d0("event", 40, str2)) {
                    i10 = 0;
                }
            }
            if (i10 != 0) {
                zzj().m14183C().m14219b("Invalid public event name. Event will not be logged (FE)", mo13677d().m14167c(str2));
                this.f11899a.m14500G();
                String m13973D = C5537ib.m13973D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f11899a.m14500G();
                C5537ib.m13983S(this.f11119q, i10, "_ev", m13973D, length);
                return;
            }
        }
        C5625p8 m14213x = mo13697n().m14213x(false);
        if (m14213x != null && !bundle.containsKey("_sc")) {
            m14213x.f11699d = true;
        }
        C5537ib.m13982R(m14213x, bundle, z10 && !z12);
        boolean equals = "am".equals(str);
        boolean m13972C0 = C5537ib.m13972C0(str2);
        if (z10 && this.f11106d != null && !m13972C0 && !equals) {
            zzj().m14181A().m14220c("Passing event to registered event handler (FE)", mo13677d().m14167c(str2), mo13677d().m14165a(bundle));
            C5276s.m13324j(this.f11106d);
            this.f11106d.mo13587a(str, str2, bundle, j10);
            return;
        }
        if (this.f11899a.m14515n()) {
            int m14044q = mo13681f().m14044q(str2);
            if (m14044q != 0) {
                zzj().m14183C().m14219b("Invalid event name. Event will not be logged (FE)", mo13677d().m14167c(str2));
                mo13681f();
                String m13973D2 = C5537ib.m13973D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f11899a.m14500G();
                C5537ib.m13985T(this.f11119q, str3, m14044q, "_ev", m13973D2, length);
                return;
            }
            Bundle m14052z = mo13681f().m14052z(str3, str2, bundle, C9462g.m28134b("_o", "_sn", "_sc", "_si"), z12);
            C5276s.m13324j(m14052z);
            if (mo13697n().m14213x(false) != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                C5549ja c5549ja = mo13699p().f11204f;
                long mo28131b = c5549ja.f11489d.zzb().mo28131b();
                long j12 = mo28131b - c5549ja.f11487b;
                c5549ja.f11487b = mo28131b;
                if (j12 > 0) {
                    mo13681f().m14013G(m14052z, j12);
                }
            }
            if (zznv.zza() && mo13672a().m13900n(C5474e0.f11292p0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    C5537ib mo13681f = mo13681f();
                    String string = m14052z.getString("_ffr");
                    String trim = C9475t.m28180b(string) ? null : string != null ? string.trim() : string;
                    if (C12108h0.m38849a(trim, mo13681f.mo13679e().f12071v.m13877a())) {
                        mo13681f.zzj().m14181A().m14218a("Not logging duplicate session_start_with_rollout event");
                        z13 = false;
                    } else {
                        mo13681f.mo13679e().f12071v.m13878b(trim);
                        z13 = true;
                    }
                    if (!z13) {
                        return;
                    }
                } else if (Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                    String m13877a = mo13681f().mo13679e().f12071v.m13877a();
                    if (!TextUtils.isEmpty(m13877a)) {
                        m14052z.putString("_ffr", m13877a);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m14052z);
            boolean m13727A = mo13672a().m13900n(C5474e0.f11240Q0) ? mo13699p().m13727A() : mo13679e().f12068s.m13640b();
            if (mo13679e().f12065p.m13720a() > 0 && mo13679e().m14565t(j10) && m13727A) {
                zzj().m14186F().m14218a("Current session is expired, remove the session number, ID, and engagement time");
                long mo28130a = zzb().mo28130a();
                j11 = 0;
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
                m13665T("auto", "_sid", null, mo28130a);
                m13665T("auto", "_sno", null, zzb().mo28130a());
                m13665T("auto", "_se", null, zzb().mo28130a());
                mo13679e().f12066q.m13721b(0L);
            } else {
                j11 = 0;
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
            }
            if (m14052z.getLong("extend_session", j11) == 1) {
                zzj().m14186F().m14218a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c5442b7 = this;
                c5442b7.f11899a.m14499F().f11203e.m14085b(j10, true);
            } else {
                c5442b7 = this;
            }
            ArrayList arrayList2 = new ArrayList(m14052z.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                String str7 = (String) obj;
                if (str7 != null) {
                    mo13681f();
                    Bundle[] m13999s0 = C5537ib.m13999s0(m14052z.get(str7));
                    if (m13999s0 != null) {
                        m14052z.putParcelableArray(str7, m13999s0);
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
                    bundle2 = mo13681f().m14039m0(bundle2);
                }
                Bundle bundle3 = bundle2;
                mo13698o().m14390D(new C5461d0(str6, new C5742z(bundle3), str, j10), str3);
                if (!equals) {
                    Iterator<InterfaceC12123u> it = c5442b7.f11107e.iterator();
                    while (it.hasNext()) {
                        it.next().mo13588a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
                z14 = true;
            }
            if (mo13697n().m14213x(false) == null || !str4.equals(str2)) {
                return;
            }
            mo13699p().m13729z(true, true, zzb().mo28131b());
        }
    }

    /* renamed from: Q */
    public final void m13662Q(String str, String str2, Bundle bundle) {
        long mo28130a = zzb().mo28130a();
        C5276s.m13320f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo28130a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().m14248y(new RunnableC5676t7(this, bundle2));
    }

    /* renamed from: R */
    public final void m13663R(String str, String str2, Bundle bundle, String str3) {
        mo13685h();
        m13650r0(str, str2, zzb().mo28130a(), bundle, false, true, true, str3);
    }

    /* renamed from: S */
    public final void m13664S(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            mo13697n().m14208D(bundle2, j10);
        } else {
            m13650r0(str3, str2, j10, bundle2, z11, !z11 || this.f11106d == null || C5537ib.m13972C0(str2), z10, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13665T(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C5276s.m13320f(r9)
            com.google.android.gms.common.internal.C5276s.m13320f(r10)
            r8.mo13687i()
            r8.m14545q()
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
            com.google.android.gms.measurement.internal.y4 r0 = r8.mo13679e()
            com.google.android.gms.measurement.internal.e5 r0 = r0.f12062m
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.m13878b(r11)
            r6 = r10
            goto L5e
        L50:
            if (r11 != 0) goto L60
            com.google.android.gms.measurement.internal.y4 r10 = r8.mo13679e()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f12062m
            java.lang.String r0 = "unset"
            r10.m13878b(r0)
            r6 = r11
        L5e:
            r3 = r1
            goto L62
        L60:
            r3 = r10
            r6 = r11
        L62:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f11899a
            boolean r10 = r10.m14512k()
            if (r10 != 0) goto L78
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.m14186F()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m14218a(r10)
            return
        L78:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f11899a
            boolean r10 = r10.m14515n()
            if (r10 != 0) goto L81
            return
        L81:
            com.google.android.gms.measurement.internal.hb r10 = new com.google.android.gms.measurement.internal.hb
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.v8 r9 = r8.mo13698o()
            r9.m14392H(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5442b7.m13665T(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: U */
    public final void m13666U(String str, String str2, Object obj, boolean z10) {
        m13667V(str, str2, obj, z10, zzb().mo28130a());
    }

    /* renamed from: V */
    public final void m13667V(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z10) {
            i10 = mo13681f().m14038l0(str2);
        } else {
            C5537ib mo13681f = mo13681f();
            if (mo13681f.m14051x0("user property", str2)) {
                if (!mo13681f.m14036i0("user property", C12121s.f32214a, str2)) {
                    i10 = 15;
                } else if (mo13681f.m14033d0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            mo13681f();
            String m13973D = C5537ib.m13973D(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f11899a.m14500G();
            C5537ib.m13983S(this.f11119q, i10, "_ev", m13973D, length);
            return;
        }
        if (obj == null) {
            m13646P(str3, str2, j10, null);
            return;
        }
        int m14045r = mo13681f().m14045r(str2, obj);
        if (m14045r == 0) {
            Object m14049v0 = mo13681f().m14049v0(str2, obj);
            if (m14049v0 != null) {
                m13646P(str3, str2, j10, m14049v0);
                return;
            }
            return;
        }
        mo13681f();
        String m13973D2 = C5537ib.m13973D(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f11899a.m14500G();
        C5537ib.m13983S(this.f11119q, m14045r, "_ev", m13973D2, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public final /* synthetic */ void m13668W(List list) {
        boolean contains;
        mo13687i();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> m14551C = mo13679e().m14551C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5601na c5601na = (C5601na) it.next();
                contains = m14551C.contains(c5601na.f11636c);
                if (!contains || m14551C.get(c5601na.f11636c).longValue() < c5601na.f11635b) {
                    m13647n0().add(c5601na);
                }
            }
            m13696m0();
        }
    }

    /* renamed from: X */
    public final void m13669X(InterfaceC12123u interfaceC12123u) {
        m14545q();
        C5276s.m13324j(interfaceC12123u);
        if (this.f11107e.add(interfaceC12123u)) {
            return;
        }
        zzj().m14187G().m14218a("OnEventListener already registered");
    }

    /* renamed from: Y */
    public final void m13670Y(InterfaceC12124v interfaceC12124v) {
        InterfaceC12124v interfaceC12124v2;
        mo13687i();
        m14545q();
        if (interfaceC12124v != null && interfaceC12124v != (interfaceC12124v2 = this.f11106d)) {
            C5276s.m13329o(interfaceC12124v2 == null, "EventInterceptor already set.");
        }
        this.f11106d = interfaceC12124v;
    }

    /* renamed from: Z */
    public final Boolean m13671Z() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().m14244q(atomicReference, 15000L, "boolean test flag value", new RunnableC5546j7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    /* renamed from: a0 */
    public final Double m13673a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().m14244q(atomicReference, 15000L, "double test flag value", new RunnableC5456c8(this, atomicReference));
    }

    /* renamed from: b0 */
    public final Integer m13674b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().m14244q(atomicReference, 15000L, "int test flag value", new RunnableC5750z7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    /* renamed from: c0 */
    public final Long m13676c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().m14244q(atomicReference, 15000L, "long test flag value", new RunnableC5430a8(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    /* renamed from: d0 */
    public final String m13678d0() {
        return this.f11109g.get();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    /* renamed from: e0 */
    public final String m13680e0() {
        C5625p8 m14209K = this.f11899a.m14497D().m14209K();
        if (m14209K != null) {
            return m14209K.f11697b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    /* renamed from: f0 */
    public final String m13682f0() {
        C5625p8 m14209K = this.f11899a.m14497D().m14209K();
        if (m14209K != null) {
            return m14209K.f11696a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    /* renamed from: g0 */
    public final String m13684g0() {
        if (this.f11899a.m14501H() != null) {
            return this.f11899a.m14501H();
        }
        try {
            return new C12118p(zza(), this.f11899a.m14504K()).m38853b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f11899a.zzj().m14182B().m14219b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    /* renamed from: h0 */
    public final String m13686h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().m14244q(atomicReference, 15000L, "String test flag value", new RunnableC5650r7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    /* renamed from: i0 */
    public final void m13688i0() {
        mo13687i();
        m14545q();
        if (this.f11899a.m14515n()) {
            if (mo13672a().m13900n(C5474e0.f11282k0)) {
                Boolean m13883A = mo13672a().m13883A("google_analytics_deferred_deep_link_enabled");
                if (m13883A != null && m13883A.booleanValue()) {
                    zzj().m14181A().m14218a("Deferred Deep Link feature enabled.");
                    zzl().m14248y(new Runnable() { // from class: wa.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5442b7.this.m13694l0();
                        }
                    });
                }
            }
            mo13698o().m14402S();
            this.f11117o = false;
            String m14557I = mo13679e().m14557I();
            if (TextUtils.isEmpty(m14557I)) {
                return;
            }
            mo13675c().m14356j();
            if (m14557I.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", m14557I);
            m13703u0("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5718x mo13689j() {
        return super.mo13689j();
    }

    /* renamed from: j0 */
    public final void m13690j0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f11105c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f11105c);
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5530i4 mo13691k() {
        return super.mo13691k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final void m13692k0() {
        if (zzpg.zza() && mo13672a().m13900n(C5474e0.f11232M0)) {
            if (zzl().m14243E()) {
                zzj().m14182B().m14218a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C5473e.m13775a()) {
                zzj().m14182B().m14218a("Cannot get trigger URIs from main thread");
                return;
            }
            m14545q();
            zzj().m14186F().m14218a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().m14244q(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.c7
                @Override // java.lang.Runnable
                public final void run() {
                    C5442b7 c5442b7 = C5442b7.this;
                    AtomicReference<List<C5601na>> atomicReference2 = atomicReference;
                    Bundle m13593a = c5442b7.mo13679e().f12063n.m13593a();
                    C5703v8 mo13698o = c5442b7.mo13698o();
                    if (m13593a == null) {
                        m13593a = new Bundle();
                    }
                    mo13698o.m14394K(atomicReference2, m13593a);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().m14182B().m14218a("Timed out waiting for get trigger URIs");
            } else {
                zzl().m14248y(new Runnable() { // from class: com.google.android.gms.measurement.internal.e7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5442b7.this.m13668W(list);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5569l4 mo13693l() {
        return super.mo13693l();
    }

    /* renamed from: l0 */
    public final void m13694l0() {
        mo13687i();
        if (mo13679e().f12069t.m13640b()) {
            zzj().m14181A().m14218a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long m13720a = mo13679e().f12070u.m13720a();
        mo13679e().f12070u.m13721b(1 + m13720a);
        if (m13720a >= 5) {
            zzj().m14187G().m14218a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            mo13679e().f12069t.m13639a(true);
        } else {
            if (!zznp.zza() || !mo13672a().m13900n(C5474e0.f11248U0)) {
                this.f11899a.m14517p();
                return;
            }
            if (this.f11118p == null) {
                this.f11118p = new C5637q7(this, this.f11899a);
            }
            this.f11118p.m14351b(0L);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5442b7 mo13695m() {
        return super.mo13695m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final void m13696m0() {
        C5601na poll;
        AbstractC9630a m14020L0;
        mo13687i();
        if (m13647n0().isEmpty() || this.f11111i || (poll = m13647n0().poll()) == null || (m14020L0 = mo13681f().m14020L0()) == null) {
            return;
        }
        this.f11111i = true;
        zzj().m14186F().m14219b("Registering trigger URI", poll.f11634a);
        InterfaceFutureC5920f<C2037v> mo28832d = m14020L0.mo28832d(Uri.parse(poll.f11634a));
        if (mo28832d == null) {
            this.f11111i = false;
            m13647n0().add(poll);
            return;
        }
        SparseArray<Long> m14551C = mo13679e().m14551C();
        m14551C.put(poll.f11636c, Long.valueOf(poll.f11635b));
        C5735y4 mo13679e = mo13679e();
        int[] iArr = new int[m14551C.size()];
        long[] jArr = new long[m14551C.size()];
        for (int i10 = 0; i10 < m14551C.size(); i10++) {
            iArr[i10] = m14551C.keyAt(i10);
            jArr[i10] = m14551C.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        mo13679e.f12063n.m13594b(bundle);
        C5918d.m15176a(mo28832d, new C5572l7(this, poll), new ExecutorC5520h7(this));
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

    /* renamed from: p0 */
    public final void m13700p0(Bundle bundle) {
        m13654C(bundle, zzb().mo28130a());
    }

    /* renamed from: s0 */
    public final void m13701s0(String str, String str2, Bundle bundle) {
        m13664S(str, str2, bundle, true, true, zzb().mo28130a());
    }

    /* renamed from: t0 */
    public final void m13702t0(InterfaceC12123u interfaceC12123u) {
        m14545q();
        C5276s.m13324j(interfaceC12123u);
        if (this.f11107e.remove(interfaceC12123u)) {
            return;
        }
        zzj().m14187G().m14218a("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final void m13703u0(String str, String str2, Bundle bundle) {
        mo13687i();
        m13660N(str, str2, zzb().mo28130a(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: v */
    protected final boolean mo13704v() {
        return false;
    }

    /* renamed from: x */
    public final ArrayList<Bundle> m13705x(String str, String str2) {
        if (zzl().m14243E()) {
            zzj().m14182B().m14218a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (C5473e.m13775a()) {
            zzj().m14182B().m14218a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f11899a.zzl().m14244q(atomicReference, 5000L, "get conditional user properties", new RunnableC5714w7(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C5537ib.m13995o0(list);
        }
        zzj().m14182B().m14219b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    /* renamed from: y */
    public final Map<String, Object> m13706y(String str, String str2, boolean z10) {
        C5621p4 m14182B;
        String str3;
        if (zzl().m14243E()) {
            m14182B = zzj().m14182B();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!C5473e.m13775a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f11899a.zzl().m14244q(atomicReference, 5000L, "get user properties", new RunnableC5702v7(this, atomicReference, null, str, str2, z10));
                List<C5524hb> list = (List) atomicReference.get();
                if (list == null) {
                    zzj().m14182B().m14219b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                C0731a c0731a = new C0731a(list.size());
                for (C5524hb c5524hb : list) {
                    Object m13921u1 = c5524hb.m13921u1();
                    if (m13921u1 != null) {
                        c0731a.put(c5524hb.f11409b, m13921u1);
                    }
                }
                return c0731a;
            }
            m14182B = zzj().m14182B();
            str3 = "Cannot get user properties from main thread";
        }
        m14182B.m14218a(str3);
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m13707z(long j10, boolean z10) {
        mo13687i();
        m14545q();
        zzj().m14181A().m14218a("Resetting analytics data (FE)");
        C5471da mo13699p = mo13699p();
        mo13699p.mo13687i();
        mo13699p.f11204f.m14059b();
        if (zzps.zza() && mo13672a().m13900n(C5474e0.f11308x0)) {
            mo13691k().m13926D();
        }
        boolean m14512k = this.f11899a.m14512k();
        C5735y4 mo13679e = mo13679e();
        mo13679e.f12054e.m13721b(j10);
        if (!TextUtils.isEmpty(mo13679e.mo13679e().f12071v.m13877a())) {
            mo13679e.f12071v.m13878b(null);
        }
        if (zzoh.zza() && mo13679e.mo13672a().m13900n(C5474e0.f11294q0)) {
            mo13679e.f12065p.m13721b(0L);
        }
        mo13679e.f12066q.m13721b(0L);
        if (!mo13679e.mo13672a().m13893M()) {
            mo13679e.m14571z(!m14512k);
        }
        mo13679e.f12072w.m13878b(null);
        mo13679e.f12073x.m13721b(0L);
        mo13679e.f12074y.m13594b(null);
        if (z10) {
            mo13698o().m14405V();
        }
        if (zzoh.zza() && mo13672a().m13900n(C5474e0.f11294q0)) {
            mo13699p().f11203e.m14084a();
        }
        this.f11117o = !m14512k;
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
