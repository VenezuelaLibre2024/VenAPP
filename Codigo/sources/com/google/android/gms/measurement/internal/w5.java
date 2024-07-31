package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzoi;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class w5 implements w6 {
    private static volatile w5 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    final long H;

    /* renamed from: a */
    private final Context f10763a;

    /* renamed from: b */
    private final String f10764b;

    /* renamed from: c */
    private final String f10765c;

    /* renamed from: d */
    private final String f10766d;

    /* renamed from: e */
    private final boolean f10767e;

    /* renamed from: f */
    private final e f10768f;

    /* renamed from: g */
    private final f f10769g;

    /* renamed from: h */
    private final y4 f10770h;

    /* renamed from: i */
    private final n4 f10771i;

    /* renamed from: j */
    private final q5 f10772j;

    /* renamed from: k */
    private final da f10773k;

    /* renamed from: l */
    private final ib f10774l;

    /* renamed from: m */
    private final m4 f10775m;

    /* renamed from: n */
    private final la.f f10776n;

    /* renamed from: o */
    private final o8 f10777o;

    /* renamed from: p */
    private final b7 f10778p;

    /* renamed from: q */
    private final x f10779q;

    /* renamed from: r */
    private final k8 f10780r;

    /* renamed from: s */
    private final String f10781s;

    /* renamed from: t */
    private l4 f10782t;

    /* renamed from: u */
    private v8 f10783u;

    /* renamed from: v */
    private y f10784v;

    /* renamed from: w */
    private i4 f10785w;

    /* renamed from: y */
    private Boolean f10787y;

    /* renamed from: z */
    private long f10788z;

    /* renamed from: x */
    private boolean f10786x = false;
    private AtomicInteger G = new AtomicInteger(0);

    private w5(a7 a7Var) {
        p4 G;
        String str;
        Bundle bundle;
        boolean z10 = false;
        com.google.android.gms.common.internal.s.j(a7Var);
        e eVar = new e(a7Var.f9956a);
        this.f10768f = eVar;
        f4.f10172a = eVar;
        Context context = a7Var.f9956a;
        this.f10763a = context;
        this.f10764b = a7Var.f9957b;
        this.f10765c = a7Var.f9958c;
        this.f10766d = a7Var.f9959d;
        this.f10767e = a7Var.f9963h;
        this.A = a7Var.f9960e;
        this.f10781s = a7Var.f9965j;
        this.D = true;
        zzdd zzddVar = a7Var.f9962g;
        if (zzddVar != null && (bundle = zzddVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzddVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzgn.zzb(context);
        la.f d10 = la.i.d();
        this.f10776n = d10;
        Long l10 = a7Var.f9964i;
        this.H = l10 != null ? l10.longValue() : d10.a();
        this.f10769g = new f(this);
        y4 y4Var = new y4(this);
        y4Var.k();
        this.f10770h = y4Var;
        n4 n4Var = new n4(this);
        n4Var.k();
        this.f10771i = n4Var;
        ib ibVar = new ib(this);
        ibVar.k();
        this.f10774l = ibVar;
        this.f10775m = new m4(new z6(a7Var, this));
        this.f10779q = new x(this);
        o8 o8Var = new o8(this);
        o8Var.r();
        this.f10777o = o8Var;
        b7 b7Var = new b7(this);
        b7Var.r();
        this.f10778p = b7Var;
        da daVar = new da(this);
        daVar.r();
        this.f10773k = daVar;
        k8 k8Var = new k8(this);
        k8Var.k();
        this.f10780r = k8Var;
        q5 q5Var = new q5(this);
        q5Var.k();
        this.f10772j = q5Var;
        zzdd zzddVar2 = a7Var.f9962g;
        if (zzddVar2 != null && zzddVar2.zzb != 0) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            b7 C = C();
            if (C.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) C.zza().getApplicationContext();
                if (C.f9985c == null) {
                    C.f9985c = new f8(C);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(C.f9985c);
                    application.registerActivityLifecycleCallbacks(C.f9985c);
                    G = C.zzj().F();
                    str = "Registered activity lifecycle callback";
                }
            }
            q5Var.y(new x5(this, a7Var));
        }
        G = zzj().G();
        str = "Application context is not an Application";
        G.a(str);
        q5Var.y(new x5(this, a7Var));
    }

    public static w5 a(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.zze == null || zzddVar.zzf == null)) {
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, zzddVar.zzd, null, null, zzddVar.zzg, null);
        }
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.j(context.getApplicationContext());
        if (I == null) {
            synchronized (w5.class) {
                if (I == null) {
                    I = new w5(new a7(context, zzddVar, l10));
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.s.j(I);
            I.h(zzddVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.s.j(I);
        return I;
    }

    private static void c(y2 y2Var) {
        if (y2Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (y2Var.u()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(y2Var.getClass()));
    }

    public static /* synthetic */ void d(w5 w5Var, a7 a7Var) {
        w5Var.zzl().i();
        y yVar = new y(w5Var);
        yVar.k();
        w5Var.f10784v = yVar;
        i4 i4Var = new i4(w5Var, a7Var.f9961f);
        i4Var.r();
        w5Var.f10785w = i4Var;
        l4 l4Var = new l4(w5Var);
        l4Var.r();
        w5Var.f10782t = l4Var;
        v8 v8Var = new v8(w5Var);
        v8Var.r();
        w5Var.f10783u = v8Var;
        w5Var.f10774l.l();
        w5Var.f10770h.l();
        w5Var.f10785w.s();
        w5Var.zzj().E().b("App measurement initialized, version", 82001L);
        w5Var.zzj().E().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String A = i4Var.A();
        if (TextUtils.isEmpty(w5Var.f10764b)) {
            if (w5Var.G().A0(A)) {
                w5Var.zzj().E().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                w5Var.zzj().E().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + A);
            }
        }
        w5Var.zzj().A().a("Debug-level message logging enabled");
        if (w5Var.E != w5Var.G.get()) {
            w5Var.zzj().B().c("Not all components initialized", Integer.valueOf(w5Var.E), Integer.valueOf(w5Var.G.get()));
        }
        w5Var.f10786x = true;
    }

    private static void e(u6 u6Var) {
        if (u6Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (u6Var.m()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(u6Var.getClass()));
    }

    private static void f(v6 v6Var) {
        if (v6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final k8 q() {
        e(this.f10780r);
        return this.f10780r;
    }

    public final y4 A() {
        f(this.f10770h);
        return this.f10770h;
    }

    public final q5 B() {
        return this.f10772j;
    }

    public final b7 C() {
        c(this.f10778p);
        return this.f10778p;
    }

    public final o8 D() {
        c(this.f10777o);
        return this.f10777o;
    }

    public final v8 E() {
        c(this.f10783u);
        return this.f10783u;
    }

    public final da F() {
        c(this.f10773k);
        return this.f10773k;
    }

    public final ib G() {
        f(this.f10774l);
        return this.f10774l;
    }

    public final String H() {
        return this.f10764b;
    }

    public final String I() {
        return this.f10765c;
    }

    public final String J() {
        return this.f10766d;
    }

    public final String K() {
        return this.f10781s;
    }

    public final void L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void M() {
        this.G.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d8, code lost:
    
        if (r1.z() != false) goto L176;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.google.android.gms.internal.measurement.zzdd r10) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w5.b(com.google.android.gms.internal.measurement.zzdd):void");
    }

    public final /* synthetic */ void g(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        if (!((i10 == 200 || i10 == 204 || i10 == 304) && th2 == null)) {
            zzj().G().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
            return;
        }
        A().f10854t.a(true);
        if (bArr == null || bArr.length == 0) {
            zzj().A().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble(Constants.TIMESTAMP, 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzj().A().a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (zzoi.zza() && this.f10769g.n(e0.Z0)) {
                if (!G().F0(optString)) {
                    zzj().G().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                bundle.putString("gbraid", optString3);
            } else if (!G().F0(optString)) {
                zzj().G().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f10778p.u0("auto", "_cmp", bundle);
            ib G = G();
            if (TextUtils.isEmpty(optString) || !G.c0(optString, optDouble)) {
                return;
            }
            G.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            zzj().B().b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    public final void h(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    public final void i() {
        this.E++;
    }

    public final boolean j() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean k() {
        return s() == 0;
    }

    public final boolean l() {
        zzl().i();
        return this.D;
    }

    public final boolean m() {
        return TextUtils.isEmpty(this.f10764b);
    }

    public final boolean n() {
        if (!this.f10786x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().i();
        Boolean bool = this.f10787y;
        if (bool == null || this.f10788z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f10776n.b() - this.f10788z) > 1000)) {
            this.f10788z = this.f10776n.b();
            boolean z10 = true;
            Boolean valueOf = Boolean.valueOf(G().z0("android.permission.INTERNET") && G().z0("android.permission.ACCESS_NETWORK_STATE") && (na.e.a(this.f10763a).g() || this.f10769g.N() || (ib.X(this.f10763a) && ib.Y(this.f10763a, false))));
            this.f10787y = valueOf;
            if (valueOf.booleanValue()) {
                if (!G().e0(w().B(), w().z()) && TextUtils.isEmpty(w().z())) {
                    z10 = false;
                }
                this.f10787y = Boolean.valueOf(z10);
            }
        }
        return this.f10787y.booleanValue();
    }

    public final boolean o() {
        return this.f10767e;
    }

    public final boolean p() {
        zzl().i();
        e(q());
        String A = w().A();
        Pair<String, Boolean> p10 = A().p(A);
        if (!this.f10769g.K() || ((Boolean) p10.second).booleanValue() || TextUtils.isEmpty((CharSequence) p10.first)) {
            zzj().A().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!q().r()) {
            zzj().G().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (zznp.zza() && this.f10769g.n(e0.U0)) {
            b7 C = C();
            C.i();
            wa.c Q = C.o().Q();
            Bundle bundle = Q != null ? Q.f29737a : null;
            if (bundle == null) {
                int i10 = this.F;
                this.F = i10 + 1;
                boolean z10 = i10 < 10;
                zzj().A().b("Failed to retrieve DMA consent from the service, " + (z10 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.F));
                return z10;
            }
            y6 c10 = y6.c(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(c10.w());
            v b10 = v.b(bundle, 100);
            sb2.append("&dma=");
            sb2.append(b10.g() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(b10.h())) {
                sb2.append("&dma_cps=");
                sb2.append(b10.h());
            }
            int i11 = v.d(bundle) == Boolean.TRUE ? 0 : 1;
            sb2.append("&npa=");
            sb2.append(i11);
            zzj().F().b("Consent query parameters to Bow", sb2);
        }
        ib G = G();
        w();
        URL E = G.E(82001L, A, (String) p10.first, A().f10855u.a() - 1, sb2.toString());
        if (E != null) {
            k8 q10 = q();
            y5 y5Var = new j8() { // from class: com.google.android.gms.measurement.internal.y5
                public /* synthetic */ y5() {
                }

                @Override // com.google.android.gms.measurement.internal.j8
                public final void a(String str, int i12, Throwable th2, byte[] bArr, Map map) {
                    w5.this.g(str, i12, th2, bArr, map);
                }
            };
            q10.i();
            q10.j();
            com.google.android.gms.common.internal.s.j(E);
            com.google.android.gms.common.internal.s.j(y5Var);
            q10.zzl().u(new m8(q10, A, E, null, null, y5Var));
        }
        return false;
    }

    public final void r(boolean z10) {
        zzl().i();
        this.D = z10;
    }

    public final int s() {
        zzl().i();
        if (this.f10769g.M()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!l()) {
            return 8;
        }
        Boolean H = A().H();
        if (H != null) {
            return H.booleanValue() ? 0 : 3;
        }
        Boolean A = this.f10769g.A("firebase_analytics_collection_enabled");
        if (A != null) {
            return A.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final x t() {
        x xVar = this.f10779q;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final f u() {
        return this.f10769g;
    }

    public final y v() {
        e(this.f10784v);
        return this.f10784v;
    }

    public final i4 w() {
        c(this.f10785w);
        return this.f10785w;
    }

    public final l4 x() {
        c(this.f10782t);
        return this.f10782t;
    }

    public final m4 y() {
        return this.f10775m;
    }

    public final n4 z() {
        n4 n4Var = this.f10771i;
        if (n4Var == null || !n4Var.m()) {
            return null;
        }
        return this.f10771i;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final Context zza() {
        return this.f10763a;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final la.f zzb() {
        return this.f10776n;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final e zzd() {
        return this.f10768f;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final n4 zzj() {
        e(this.f10771i);
        return this.f10771i;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final q5 zzl() {
        e(this.f10772j);
        return this.f10772j;
    }
}
