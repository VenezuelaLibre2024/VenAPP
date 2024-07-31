package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzoi;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import la.C9464i;
import la.InterfaceC9461f;
import na.C9696e;
import org.json.JSONException;
import org.json.JSONObject;
import p418wa.C12097c;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* loaded from: classes2.dex */
public class C5712w5 implements InterfaceC5713w6 {

    /* renamed from: I */
    private static volatile C5712w5 f11969I;

    /* renamed from: A */
    private volatile Boolean f11970A;

    /* renamed from: B */
    private Boolean f11971B;

    /* renamed from: C */
    private Boolean f11972C;

    /* renamed from: D */
    private volatile boolean f11973D;

    /* renamed from: E */
    private int f11974E;

    /* renamed from: F */
    private int f11975F;

    /* renamed from: H */
    final long f11977H;

    /* renamed from: a */
    private final Context f11978a;

    /* renamed from: b */
    private final String f11979b;

    /* renamed from: c */
    private final String f11980c;

    /* renamed from: d */
    private final String f11981d;

    /* renamed from: e */
    private final boolean f11982e;

    /* renamed from: f */
    private final C5473e f11983f;

    /* renamed from: g */
    private final C5486f f11984g;

    /* renamed from: h */
    private final C5735y4 f11985h;

    /* renamed from: i */
    private final C5595n4 f11986i;

    /* renamed from: j */
    private final C5635q5 f11987j;

    /* renamed from: k */
    private final C5471da f11988k;

    /* renamed from: l */
    private final C5537ib f11989l;

    /* renamed from: m */
    private final C5582m4 f11990m;

    /* renamed from: n */
    private final InterfaceC9461f f11991n;

    /* renamed from: o */
    private final C5612o8 f11992o;

    /* renamed from: p */
    private final C5442b7 f11993p;

    /* renamed from: q */
    private final C5718x f11994q;

    /* renamed from: r */
    private final C5560k8 f11995r;

    /* renamed from: s */
    private final String f11996s;

    /* renamed from: t */
    private C5569l4 f11997t;

    /* renamed from: u */
    private C5703v8 f11998u;

    /* renamed from: v */
    private C5730y f11999v;

    /* renamed from: w */
    private C5530i4 f12000w;

    /* renamed from: y */
    private Boolean f12002y;

    /* renamed from: z */
    private long f12003z;

    /* renamed from: x */
    private boolean f12001x = false;

    /* renamed from: G */
    private AtomicInteger f11976G = new AtomicInteger(0);

    private C5712w5(C5429a7 c5429a7) {
        C5621p4 m14187G;
        String str;
        Bundle bundle;
        boolean z10 = false;
        C5276s.m13324j(c5429a7);
        C5473e c5473e = new C5473e(c5429a7.f11076a);
        this.f11983f = c5473e;
        C5491f4.f11344a = c5473e;
        Context context = c5429a7.f11076a;
        this.f11978a = context;
        this.f11979b = c5429a7.f11077b;
        this.f11980c = c5429a7.f11078c;
        this.f11981d = c5429a7.f11079d;
        this.f11982e = c5429a7.f11083h;
        this.f11970A = c5429a7.f11080e;
        this.f11996s = c5429a7.f11085j;
        this.f11973D = true;
        zzdd zzddVar = c5429a7.f11082g;
        if (zzddVar != null && (bundle = zzddVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f11971B = (Boolean) obj;
            }
            Object obj2 = zzddVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f11972C = (Boolean) obj2;
            }
        }
        zzgn.zzb(context);
        InterfaceC9461f m28142d = C9464i.m28142d();
        this.f11991n = m28142d;
        Long l10 = c5429a7.f11084i;
        this.f11977H = l10 != null ? l10.longValue() : m28142d.mo28130a();
        this.f11984g = new C5486f(this);
        C5735y4 c5735y4 = new C5735y4(this);
        c5735y4.m14357k();
        this.f11985h = c5735y4;
        C5595n4 c5595n4 = new C5595n4(this);
        c5595n4.m14357k();
        this.f11986i = c5595n4;
        C5537ib c5537ib = new C5537ib(this);
        c5537ib.m14357k();
        this.f11989l = c5537ib;
        this.f11990m = new C5582m4(new C5749z6(c5429a7, this));
        this.f11994q = new C5718x(this);
        C5612o8 c5612o8 = new C5612o8(this);
        c5612o8.m14546r();
        this.f11992o = c5612o8;
        C5442b7 c5442b7 = new C5442b7(this);
        c5442b7.m14546r();
        this.f11993p = c5442b7;
        C5471da c5471da = new C5471da(this);
        c5471da.m14546r();
        this.f11988k = c5471da;
        C5560k8 c5560k8 = new C5560k8(this);
        c5560k8.m14357k();
        this.f11995r = c5560k8;
        C5635q5 c5635q5 = new C5635q5(this);
        c5635q5.m14357k();
        this.f11987j = c5635q5;
        zzdd zzddVar2 = c5429a7.f11082g;
        if (zzddVar2 != null && zzddVar2.zzb != 0) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            C5442b7 m14496C = m14496C();
            if (m14496C.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) m14496C.zza().getApplicationContext();
                if (m14496C.f11105c == null) {
                    m14496C.f11105c = new C5495f8(m14496C);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(m14496C.f11105c);
                    application.registerActivityLifecycleCallbacks(m14496C.f11105c);
                    m14187G = m14496C.zzj().m14186F();
                    str = "Registered activity lifecycle callback";
                }
            }
            c5635q5.m14248y(new RunnableC5724x5(this, c5429a7));
        }
        m14187G = zzj().m14187G();
        str = "Application context is not an Application";
        m14187G.m14218a(str);
        c5635q5.m14248y(new RunnableC5724x5(this, c5429a7));
    }

    /* renamed from: a */
    public static C5712w5 m14488a(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.zze == null || zzddVar.zzf == null)) {
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, zzddVar.zzd, null, null, zzddVar.zzg, null);
        }
        C5276s.m13324j(context);
        C5276s.m13324j(context.getApplicationContext());
        if (f11969I == null) {
            synchronized (C5712w5.class) {
                if (f11969I == null) {
                    f11969I = new C5712w5(new C5429a7(context, zzddVar, l10));
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C5276s.m13324j(f11969I);
            f11969I.m14509h(zzddVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        C5276s.m13324j(f11969I);
        return f11969I;
    }

    /* renamed from: c */
    private static void m14489c(AbstractC5733y2 abstractC5733y2) {
        if (abstractC5733y2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC5733y2.m14548u()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC5733y2.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m14490d(C5712w5 c5712w5, C5429a7 c5429a7) {
        c5712w5.zzl().mo13687i();
        C5730y c5730y = new C5730y(c5712w5);
        c5730y.m14357k();
        c5712w5.f11999v = c5730y;
        C5530i4 c5530i4 = new C5530i4(c5712w5, c5429a7.f11081f);
        c5530i4.m14546r();
        c5712w5.f12000w = c5530i4;
        C5569l4 c5569l4 = new C5569l4(c5712w5);
        c5569l4.m14546r();
        c5712w5.f11997t = c5569l4;
        C5703v8 c5703v8 = new C5703v8(c5712w5);
        c5703v8.m14546r();
        c5712w5.f11998u = c5703v8;
        c5712w5.f11989l.m14358l();
        c5712w5.f11985h.m14358l();
        c5712w5.f12000w.m14547s();
        c5712w5.zzj().m14185E().m14219b("App measurement initialized, version", 82001L);
        c5712w5.zzj().m14185E().m14218a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m13923A = c5530i4.m13923A();
        if (TextUtils.isEmpty(c5712w5.f11979b)) {
            if (c5712w5.m14500G().m14007A0(m13923A)) {
                c5712w5.zzj().m14185E().m14218a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c5712w5.zzj().m14185E().m14218a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + m13923A);
            }
        }
        c5712w5.zzj().m14181A().m14218a("Debug-level message logging enabled");
        if (c5712w5.f11974E != c5712w5.f11976G.get()) {
            c5712w5.zzj().m14182B().m14220c("Not all components initialized", Integer.valueOf(c5712w5.f11974E), Integer.valueOf(c5712w5.f11976G.get()));
        }
        c5712w5.f12001x = true;
    }

    /* renamed from: e */
    private static void m14491e(AbstractC5688u6 abstractC5688u6) {
        if (abstractC5688u6 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC5688u6.m14359m()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC5688u6.getClass()));
    }

    /* renamed from: f */
    private static void m14492f(C5701v6 c5701v6) {
        if (c5701v6 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: q */
    private final C5560k8 m14493q() {
        m14491e(this.f11995r);
        return this.f11995r;
    }

    /* renamed from: A */
    public final C5735y4 m14494A() {
        m14492f(this.f11985h);
        return this.f11985h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final C5635q5 m14495B() {
        return this.f11987j;
    }

    /* renamed from: C */
    public final C5442b7 m14496C() {
        m14489c(this.f11993p);
        return this.f11993p;
    }

    /* renamed from: D */
    public final C5612o8 m14497D() {
        m14489c(this.f11992o);
        return this.f11992o;
    }

    /* renamed from: E */
    public final C5703v8 m14498E() {
        m14489c(this.f11998u);
        return this.f11998u;
    }

    /* renamed from: F */
    public final C5471da m14499F() {
        m14489c(this.f11988k);
        return this.f11988k;
    }

    /* renamed from: G */
    public final C5537ib m14500G() {
        m14492f(this.f11989l);
        return this.f11989l;
    }

    /* renamed from: H */
    public final String m14501H() {
        return this.f11979b;
    }

    /* renamed from: I */
    public final String m14502I() {
        return this.f11980c;
    }

    /* renamed from: J */
    public final String m14503J() {
        return this.f11981d;
    }

    /* renamed from: K */
    public final String m14504K() {
        return this.f11996s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final void m14505L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final void m14506M() {
        this.f11976G.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d8, code lost:
    
        if (r1.m14597z() != false) goto L37;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14507b(com.google.android.gms.internal.measurement.zzdd r10) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5712w5.m14507b(com.google.android.gms.internal.measurement.zzdd):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m14508g(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        if (!((i10 == 200 || i10 == 204 || i10 == 304) && th2 == null)) {
            zzj().m14187G().m14220c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
            return;
        }
        m14494A().f12069t.m13639a(true);
        if (bArr == null || bArr.length == 0) {
            zzj().m14181A().m14218a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble(Constants.TIMESTAMP, 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzj().m14181A().m14218a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (zzoi.zza() && this.f11984g.m13900n(C5474e0.f11258Z0)) {
                if (!m14500G().m14012F0(optString)) {
                    zzj().m14187G().m14221d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                bundle.putString("gbraid", optString3);
            } else if (!m14500G().m14012F0(optString)) {
                zzj().m14187G().m14220c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f11993p.m13703u0("auto", "_cmp", bundle);
            C5537ib m14500G = m14500G();
            if (TextUtils.isEmpty(optString) || !m14500G.m14032c0(optString, optDouble)) {
                return;
            }
            m14500G.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            zzj().m14182B().m14219b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m14509h(boolean z10) {
        this.f11970A = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m14510i() {
        this.f11974E++;
    }

    /* renamed from: j */
    public final boolean m14511j() {
        return this.f11970A != null && this.f11970A.booleanValue();
    }

    /* renamed from: k */
    public final boolean m14512k() {
        return m14519s() == 0;
    }

    /* renamed from: l */
    public final boolean m14513l() {
        zzl().mo13687i();
        return this.f11973D;
    }

    /* renamed from: m */
    public final boolean m14514m() {
        return TextUtils.isEmpty(this.f11979b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean m14515n() {
        if (!this.f12001x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().mo13687i();
        Boolean bool = this.f12002y;
        if (bool == null || this.f12003z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f11991n.mo28131b() - this.f12003z) > 1000)) {
            this.f12003z = this.f11991n.mo28131b();
            boolean z10 = true;
            Boolean valueOf = Boolean.valueOf(m14500G().m14053z0("android.permission.INTERNET") && m14500G().m14053z0("android.permission.ACCESS_NETWORK_STATE") && (C9696e.m29080a(this.f11978a).m29078g() || this.f11984g.m13894N() || (C5537ib.m13987X(this.f11978a) && C5537ib.m13988Y(this.f11978a, false))));
            this.f12002y = valueOf;
            if (valueOf.booleanValue()) {
                if (!m14500G().m14034e0(m14523w().m13924B(), m14523w().m13932z()) && TextUtils.isEmpty(m14523w().m13932z())) {
                    z10 = false;
                }
                this.f12002y = Boolean.valueOf(z10);
            }
        }
        return this.f12002y.booleanValue();
    }

    /* renamed from: o */
    public final boolean m14516o() {
        return this.f11982e;
    }

    /* renamed from: p */
    public final boolean m14517p() {
        zzl().mo13687i();
        m14491e(m14493q());
        String m13923A = m14523w().m13923A();
        Pair<String, Boolean> m14561p = m14494A().m14561p(m13923A);
        if (!this.f11984g.m13891K() || ((Boolean) m14561p.second).booleanValue() || TextUtils.isEmpty((CharSequence) m14561p.first)) {
            zzj().m14181A().m14218a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!m14493q().m14069r()) {
            zzj().m14187G().m14218a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (zznp.zza() && this.f11984g.m13900n(C5474e0.f11248U0)) {
            C5442b7 m14496C = m14496C();
            m14496C.mo13687i();
            C12097c m14400Q = m14496C.mo13698o().m14400Q();
            Bundle bundle = m14400Q != null ? m14400Q.f32202a : null;
            if (bundle == null) {
                int i10 = this.f11975F;
                this.f11975F = i10 + 1;
                boolean z10 = i10 < 10;
                zzj().m14181A().m14219b("Failed to retrieve DMA consent from the service, " + (z10 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f11975F));
                return z10;
            }
            C5737y6 m14573c = C5737y6.m14573c(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(m14573c.m14594w());
            C5694v m14364b = C5694v.m14364b(bundle, 100);
            sb2.append("&dma=");
            sb2.append(m14364b.m14371g() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(m14364b.m14372h())) {
                sb2.append("&dma_cps=");
                sb2.append(m14364b.m14372h());
            }
            int i11 = C5694v.m14366d(bundle) == Boolean.TRUE ? 0 : 1;
            sb2.append("&npa=");
            sb2.append(i11);
            zzj().m14186F().m14219b("Consent query parameters to Bow", sb2);
        }
        C5537ib m14500G = m14500G();
        m14523w();
        URL m14011E = m14500G.m14011E(82001L, m13923A, (String) m14561p.first, m14494A().f12070u.m13720a() - 1, sb2.toString());
        if (m14011E != null) {
            C5560k8 m14493q = m14493q();
            InterfaceC5547j8 interfaceC5547j8 = new InterfaceC5547j8() { // from class: com.google.android.gms.measurement.internal.y5
                @Override // com.google.android.gms.measurement.internal.InterfaceC5547j8
                /* renamed from: a */
                public final void mo14056a(String str, int i12, Throwable th2, byte[] bArr, Map map) {
                    C5712w5.this.m14508g(str, i12, th2, bArr, map);
                }
            };
            m14493q.mo13687i();
            m14493q.m14356j();
            C5276s.m13324j(m14011E);
            C5276s.m13324j(interfaceC5547j8);
            m14493q.zzl().m14246u(new RunnableC5586m8(m14493q, m13923A, m14011E, null, null, interfaceC5547j8));
        }
        return false;
    }

    /* renamed from: r */
    public final void m14518r(boolean z10) {
        zzl().mo13687i();
        this.f11973D = z10;
    }

    /* renamed from: s */
    public final int m14519s() {
        zzl().mo13687i();
        if (this.f11984g.m13893M()) {
            return 1;
        }
        Boolean bool = this.f11972C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!m14513l()) {
            return 8;
        }
        Boolean m14556H = m14494A().m14556H();
        if (m14556H != null) {
            return m14556H.booleanValue() ? 0 : 3;
        }
        Boolean m13883A = this.f11984g.m13883A("firebase_analytics_collection_enabled");
        if (m13883A != null) {
            return m13883A.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f11971B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f11970A == null || this.f11970A.booleanValue()) ? 0 : 7;
    }

    /* renamed from: t */
    public final C5718x m14520t() {
        C5718x c5718x = this.f11994q;
        if (c5718x != null) {
            return c5718x;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: u */
    public final C5486f m14521u() {
        return this.f11984g;
    }

    /* renamed from: v */
    public final C5730y m14522v() {
        m14491e(this.f11999v);
        return this.f11999v;
    }

    /* renamed from: w */
    public final C5530i4 m14523w() {
        m14489c(this.f12000w);
        return this.f12000w;
    }

    /* renamed from: x */
    public final C5569l4 m14524x() {
        m14489c(this.f11997t);
        return this.f11997t;
    }

    /* renamed from: y */
    public final C5582m4 m14525y() {
        return this.f11990m;
    }

    /* renamed from: z */
    public final C5595n4 m14526z() {
        C5595n4 c5595n4 = this.f11986i;
        if (c5595n4 == null || !c5595n4.m14359m()) {
            return null;
        }
        return this.f11986i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final Context zza() {
        return this.f11978a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final InterfaceC9461f zzb() {
        return this.f11991n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final C5473e zzd() {
        return this.f11983f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final C5595n4 zzj() {
        m14491e(this.f11986i);
        return this.f11986i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final C5635q5 zzl() {
        m14491e(this.f11987j);
        return this.f11987j;
    }
}
