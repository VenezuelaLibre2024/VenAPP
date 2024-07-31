package l9;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.v4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzclg;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdgm;
import com.google.android.gms.internal.ads.zzdrz;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhl;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmo;
import com.google.android.gms.internal.ads.zzfmz;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfxt;
import com.google.android.gms.internal.ads.zzgdt;
import com.google.android.gms.internal.ads.zzgdu;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends zzccs {
    protected static final List S = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List T = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List U = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List V = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private final zzcei H;
    private String I;
    private final List K;
    private final List L;
    private final List M;
    private final List N;
    private final zzbhh R;

    /* renamed from: a, reason: collision with root package name */
    private final zzclg f21041a;

    /* renamed from: b, reason: collision with root package name */
    private Context f21042b;

    /* renamed from: c, reason: collision with root package name */
    private final zzavi f21043c;

    /* renamed from: d, reason: collision with root package name */
    private final zzfhl f21044d;

    /* renamed from: e, reason: collision with root package name */
    private final zzfig f21045e;

    /* renamed from: r, reason: collision with root package name */
    private final zzgey f21047r;

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f21048s;

    /* renamed from: t, reason: collision with root package name */
    private zzbxr f21049t;

    /* renamed from: x, reason: collision with root package name */
    private final v f21053x;

    /* renamed from: y, reason: collision with root package name */
    private final zzdwk f21054y;

    /* renamed from: z, reason: collision with root package name */
    private final zzfny f21055z;

    /* renamed from: f, reason: collision with root package name */
    private zzdwa f21046f = null;

    /* renamed from: u, reason: collision with root package name */
    private Point f21050u = new Point();

    /* renamed from: v, reason: collision with root package name */
    private Point f21051v = new Point();

    /* renamed from: w, reason: collision with root package name */
    private final Set f21052w = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger G = new AtomicInteger(0);
    private final AtomicBoolean O = new AtomicBoolean(false);
    private final AtomicBoolean P = new AtomicBoolean(false);
    private final AtomicInteger Q = new AtomicInteger(0);
    private final boolean A = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhl)).booleanValue();
    private final boolean B = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhk)).booleanValue();
    private final boolean C = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhn)).booleanValue();
    private final boolean D = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhp)).booleanValue();
    private final String E = (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzho);
    private final String F = (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhq);
    private final String J = (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhr);

    public c(zzclg zzclgVar, Context context, zzavi zzaviVar, zzfig zzfigVar, zzgey zzgeyVar, ScheduledExecutorService scheduledExecutorService, zzdwk zzdwkVar, zzfny zzfnyVar, zzcei zzceiVar, zzbhh zzbhhVar, zzfhl zzfhlVar) {
        List list;
        this.f21041a = zzclgVar;
        this.f21042b = context;
        this.f21043c = zzaviVar;
        this.f21044d = zzfhlVar;
        this.f21045e = zzfigVar;
        this.f21047r = zzgeyVar;
        this.f21048s = scheduledExecutorService;
        this.f21053x = zzclgVar.zzn();
        this.f21054y = zzdwkVar;
        this.f21055z = zzfnyVar;
        this.H = zzceiVar;
        this.R = zzbhhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhs)).booleanValue()) {
            this.K = H2((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzht));
            this.L = H2((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhu));
            this.M = H2((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhv));
            list = H2((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhw));
        } else {
            this.K = S;
            this.L = T;
            this.M = U;
            list = V;
        }
        this.N = list;
    }

    private final com.google.common.util.concurrent.f A2(final String str) {
        final zzdrz[] zzdrzVarArr = new zzdrz[1];
        com.google.common.util.concurrent.f zzn = zzgen.zzn(this.f21045e.zza(), new zzgdu() { // from class: l9.e0
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return c.this.T2(zzdrzVarArr, str, (zzdrz) obj);
            }
        }, this.f21047r);
        zzn.addListener(new Runnable() { // from class: l9.f0
            @Override // java.lang.Runnable
            public final void run() {
                c.this.q2(zzdrzVarArr);
            }
        }, this.f21047r);
        return zzgen.zze(zzgen.zzm((zzgee) zzgen.zzo(zzgee.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhE)).intValue(), TimeUnit.MILLISECONDS, this.f21048s), new zzfws() { // from class: l9.l0
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                List list = c.S;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f21047r), Exception.class, new zzfws() { // from class: l9.m0
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                List list = c.S;
                zzcec.zzh("", (Exception) obj);
                return null;
            }
        }, this.f21047r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2() {
        zzgen.zzr(((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkB)).booleanValue() ? zzgen.zzk(new zzgdt() { // from class: l9.b0
            @Override // com.google.android.gms.internal.ads.zzgdt
            public final com.google.common.util.concurrent.f zza() {
                return c.this.S2();
            }
        }, zzcep.zza) : z2(this.f21042b, null, x8.c.BANNER.name(), null, null).zzc(), new s0(this), this.f21041a.zzB());
    }

    private final void C2(List list, final com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar, boolean z10) {
        com.google.common.util.concurrent.f zzb;
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhD)).booleanValue()) {
            zzcec.zzj("The updating URL feature is not enabled.");
            try {
                zzbxiVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcec.zzh("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (w2((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            zzcec.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (w2(uri)) {
                zzb = this.f21047r.zzb(new Callable() { // from class: l9.g0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c.this.K2(uri, bVar);
                    }
                });
                if (F2()) {
                    zzb = zzgen.zzn(zzb, new zzgdu() { // from class: l9.h0
                        @Override // com.google.android.gms.internal.ads.zzgdu
                        public final com.google.common.util.concurrent.f zza(Object obj) {
                            com.google.common.util.concurrent.f zzm;
                            zzm = zzgen.zzm(r0.A2("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfws() { // from class: l9.i0
                                @Override // com.google.android.gms.internal.ads.zzfws
                                public final Object apply(Object obj2) {
                                    return c.y2(r2, (String) obj2);
                                }
                            }, c.this.f21047r);
                            return zzm;
                        }
                    }, this.f21047r);
                } else {
                    zzcec.zzi("Asset view map is empty.");
                }
            } else {
                zzcec.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb = zzgen.zzh(uri);
            }
            arrayList.add(zzb);
        }
        zzgen.zzr(zzgen.zzd(arrayList), new r0(this, zzbxiVar, z10), this.f21041a.zzB());
    }

    private final void D2(final List list, final com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhD)).booleanValue()) {
            try {
                zzbxiVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcec.zzh("", e10);
                return;
            }
        }
        com.google.common.util.concurrent.f zzb = this.f21047r.zzb(new Callable() { // from class: l9.n0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c.this.i2(list, bVar);
            }
        });
        if (F2()) {
            zzb = zzgen.zzn(zzb, new zzgdu() { // from class: l9.o0
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return c.this.U2((ArrayList) obj);
                }
            }, this.f21047r);
        } else {
            zzcec.zzi("Asset view map is empty.");
        }
        zzgen.zzr(zzb, new q0(this, zzbxiVar, z10), this.f21041a.zzB());
    }

    private static boolean E2(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean F2() {
        Map map;
        zzbxr zzbxrVar = this.f21049t;
        return (zzbxrVar == null || (map = zzbxrVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri G2(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
    }

    private static final List H2(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfxt.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfmz P2(com.google.common.util.concurrent.f fVar, zzccx zzccxVar) {
        if (!zzfnc.zza() || !((Boolean) zzbht.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfmz zzb = ((a0) zzgen.zzp(fVar)).zzb();
            zzb.zzd(new ArrayList(Collections.singletonList(zzccxVar.zzb)));
            u4 u4Var = zzccxVar.zzd;
            zzb.zzb(u4Var == null ? "" : u4Var.A);
            return zzb;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.t.q().zzw(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void n2(c cVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar.w2((Uri) it.next())) {
                cVar.G.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void p2(final c cVar, final String str, final String str2, final zzdwa zzdwaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzgX)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhd)).booleanValue()) {
                zzcep.zza.execute(new Runnable() { // from class: l9.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.r2(str, str2, zzdwaVar);
                    }
                });
            } else {
                cVar.f21053x.d(str, str2, zzdwaVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Uri y2(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? G2(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final a0 z2(Context context, String str, String str2, z4 z4Var, u4 u4Var) {
        char c10;
        zzfhf zzfhfVar = new zzfhf();
        if ("REWARDED".equals(str2)) {
            zzfhfVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfhfVar.zzo().zza(3);
        }
        z zzo = this.f21041a.zzo();
        zzdaf zzdafVar = new zzdaf();
        zzdafVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfhfVar.zzs(str);
        if (u4Var == null) {
            u4Var = new v4().a();
        }
        zzfhfVar.zzE(u4Var);
        if (z4Var == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            z4Var = c10 != 0 ? (c10 == 1 || c10 == 2) ? z4.x1() : c10 != 3 ? c10 != 4 ? new z4() : z4.v1() : z4.w1() : new z4(context, x8.i.f30678i);
        }
        zzfhfVar.zzr(z4Var);
        zzfhfVar.zzx(true);
        zzdafVar.zzi(zzfhfVar.zzG());
        zzo.zza(zzdafVar.zzj());
        e eVar = new e();
        eVar.a(str2);
        zzo.zzb(new g(eVar, null));
        new zzdgm();
        a0 zzc = zzo.zzc();
        this.f21046f = zzc.zza();
        return zzc;
    }

    private final void zzX() {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjp)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjs)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjw)).booleanValue() && this.O.getAndSet(true)) {
                return;
            }
            B2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Uri K2(Uri uri, com.google.android.gms.dynamic.b bVar) {
        zzfhl zzfhlVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzlr)).booleanValue() || (zzfhlVar = this.f21044d) == null) ? this.f21043c.zza(uri, this.f21042b, (View) com.google.android.gms.dynamic.d.g2(bVar), null) : zzfhlVar.zza(uri, this.f21042b, (View) com.google.android.gms.dynamic.d.g2(bVar), null);
        } catch (zzavj e10) {
            zzcec.zzk("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ a0 O2(zzccx zzccxVar) {
        return z2(this.f21042b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f S2() {
        return z2(this.f21042b, null, x8.c.BANNER.name(), null, null).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f T2(zzdrz[] zzdrzVarArr, String str, zzdrz zzdrzVar) {
        zzdrzVarArr[0] = zzdrzVar;
        Context context = this.f21042b;
        zzbxr zzbxrVar = this.f21049t;
        Map map = zzbxrVar.zzb;
        JSONObject d10 = b1.d(context, map, map, zzbxrVar.zza, null);
        JSONObject g10 = b1.g(this.f21042b, this.f21049t.zza);
        JSONObject f10 = b1.f(this.f21049t.zza);
        JSONObject e10 = b1.e(this.f21042b, this.f21049t.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d10);
        jSONObject.put("ad_view_signal", g10);
        jSONObject.put("scroll_view_signal", f10);
        jSONObject.put("lock_screen_signal", e10);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", b1.c(null, this.f21042b, this.f21051v, this.f21050u));
        }
        return zzdrzVar.zzd(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f U2(final ArrayList arrayList) {
        return zzgen.zzm(A2("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfws() { // from class: l9.c0
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return c.this.h2(arrayList, (String) obj);
            }
        }, this.f21047r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList h2(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (x2(uri) && !TextUtils.isEmpty(str)) {
                uri = G2(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList i2(List list, com.google.android.gms.dynamic.b bVar) {
        this.f21043c.zzc();
        String zzh = this.f21043c.zzc().zzh(this.f21042b, (View) com.google.android.gms.dynamic.d.g2(bVar), null);
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (x2(uri)) {
                uri = G2(uri, "ms", zzh);
            } else {
                zzcec.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
            }
            arrayList.add(uri);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void q2(zzdrz[] zzdrzVarArr) {
        zzdrz zzdrzVar = zzdrzVarArr[0];
        if (zzdrzVar != null) {
            this.f21045e.zzb(zzgen.zzh(zzdrzVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void r2(String str, String str2, zzdwa zzdwaVar) {
        this.f21053x.d(str, str2, zzdwaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w2(Uri uri) {
        return E2(uri, this.K, this.L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x2(Uri uri) {
        return E2(uri, this.M, this.N);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final com.google.android.gms.dynamic.b zze(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, String str, com.google.android.gms.dynamic.b bVar3) {
        androidx.browser.customtabs.i zzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjz)).booleanValue()) {
            this.R.zzg((Context) com.google.android.gms.dynamic.d.g2(bVar), (androidx.browser.customtabs.c) com.google.android.gms.dynamic.d.g2(bVar2), str, (androidx.browser.customtabs.b) com.google.android.gms.dynamic.d.g2(bVar3));
            zzb = this.R.zzb();
        } else {
            zzb = null;
        }
        return com.google.android.gms.dynamic.d.h2(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzf(com.google.android.gms.dynamic.b bVar, final zzccx zzccxVar, zzccq zzccqVar) {
        com.google.common.util.concurrent.f zzh;
        com.google.common.util.concurrent.f zzc;
        com.google.common.util.concurrent.f fVar;
        com.google.common.util.concurrent.f fVar2;
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        this.f21042b = context;
        zzfmo zza = zzfmn.zza(context, 22);
        zza.zzh();
        if ("UNKNOWN".equals(zzccxVar.zzb)) {
            List arrayList = new ArrayList();
            zzbfu zzbfuVar = zzbgc.zzhC;
            if (!((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar)).split(","));
            }
            if (arrayList.contains(y.b(zzccxVar.zzd))) {
                com.google.common.util.concurrent.f zzg = zzgen.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                fVar2 = zzg;
                fVar = zzgen.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgen.zzr(fVar, new p0(this, fVar2, zzccxVar, zzccqVar, zza, com.google.android.gms.ads.internal.t.b().a()), this.f21041a.zzB());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkB)).booleanValue()) {
            zzgey zzgeyVar = zzcep.zza;
            zzh = zzgeyVar.zzb(new Callable() { // from class: l9.j0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.O2(zzccxVar);
                }
            });
            zzc = zzgen.zzn(zzh, new zzgdu() { // from class: l9.k0
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return ((a0) obj).zzc();
                }
            }, zzgeyVar);
        } else {
            a0 z22 = z2(this.f21042b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
            zzh = zzgen.zzh(z22);
            zzc = z22.zzc();
        }
        fVar = zzc;
        fVar2 = zzh;
        zzgen.zzr(fVar, new p0(this, fVar2, zzccxVar, zzccqVar, zza, com.google.android.gms.ads.internal.t.b().a()), this.f21041a.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzg(zzbxr zzbxrVar) {
        this.f21049t = zzbxrVar;
        this.f21045e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzh(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        C2(list, bVar, zzbxiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzi(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        D2(list, bVar, zzbxiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzj(com.google.android.gms.dynamic.b bVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjo)).booleanValue()) {
            zzbfu zzbfuVar = zzbgc.zzhB;
            if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar)).booleanValue()) {
                zzX();
            }
            WebView webView = (WebView) com.google.android.gms.dynamic.d.g2(bVar);
            if (webView == null) {
                zzcec.zzg("The webView cannot be null.");
                return;
            }
            if (this.f21052w.contains(webView)) {
                zzcec.zzi("This webview has already been registered.");
                return;
            }
            this.f21052w.add(webView);
            webView.addJavascriptInterface(new a(webView, this.f21043c, this.f21054y, this.f21055z, this.f21044d), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjy)).booleanValue()) {
                com.google.android.gms.ads.internal.t.q().zzs();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar)).booleanValue()) {
                zzX();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzk(com.google.android.gms.dynamic.b bVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhD)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) com.google.android.gms.dynamic.d.g2(bVar);
            zzbxr zzbxrVar = this.f21049t;
            this.f21050u = b1.a(motionEvent, zzbxrVar == null ? null : zzbxrVar.zza);
            if (motionEvent.getAction() == 0) {
                this.f21051v = this.f21050u;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f21050u;
            obtain.setLocation(point.x, point.y);
            this.f21043c.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzl(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        C2(list, bVar, zzbxiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzm(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        D2(list, bVar, zzbxiVar, false);
    }
}
