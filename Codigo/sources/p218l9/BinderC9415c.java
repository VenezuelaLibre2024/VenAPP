package p218l9;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.C0392b;
import androidx.browser.customtabs.C0393c;
import androidx.browser.customtabs.C0399i;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4917u4;
import com.google.android.gms.ads.internal.client.C4923v4;
import com.google.android.gms.ads.internal.client.C4947z4;
import com.google.android.gms.ads.internal.util.C4972b1;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
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
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import p438x8.C12367i;
import p438x8.EnumC12355c;

/* renamed from: l9.c */
/* loaded from: classes.dex */
public final class BinderC9415c extends zzccs {

    /* renamed from: S */
    protected static final List f22872S = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: T */
    protected static final List f22873T = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: U */
    protected static final List f22874U = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: V */
    protected static final List f22875V = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: H */
    private final zzcei f22883H;

    /* renamed from: I */
    private String f22884I;

    /* renamed from: K */
    private final List f22886K;

    /* renamed from: L */
    private final List f22887L;

    /* renamed from: M */
    private final List f22888M;

    /* renamed from: N */
    private final List f22889N;

    /* renamed from: R */
    private final zzbhh f22893R;

    /* renamed from: a */
    private final zzclg f22894a;

    /* renamed from: b */
    private Context f22895b;

    /* renamed from: c */
    private final zzavi f22896c;

    /* renamed from: d */
    private final zzfhl f22897d;

    /* renamed from: e */
    private final zzfig f22898e;

    /* renamed from: r */
    private final zzgey f22900r;

    /* renamed from: s */
    private final ScheduledExecutorService f22901s;

    /* renamed from: t */
    private zzbxr f22902t;

    /* renamed from: x */
    private final C9451v f22906x;

    /* renamed from: y */
    private final zzdwk f22907y;

    /* renamed from: z */
    private final zzfny f22908z;

    /* renamed from: f */
    private zzdwa f22899f = null;

    /* renamed from: u */
    private Point f22903u = new Point();

    /* renamed from: v */
    private Point f22904v = new Point();

    /* renamed from: w */
    private final Set f22905w = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: G */
    private final AtomicInteger f22882G = new AtomicInteger(0);

    /* renamed from: O */
    private final AtomicBoolean f22890O = new AtomicBoolean(false);

    /* renamed from: P */
    private final AtomicBoolean f22891P = new AtomicBoolean(false);

    /* renamed from: Q */
    private final AtomicInteger f22892Q = new AtomicInteger(0);

    /* renamed from: A */
    private final boolean f22876A = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhl)).booleanValue();

    /* renamed from: B */
    private final boolean f22877B = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhk)).booleanValue();

    /* renamed from: C */
    private final boolean f22878C = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhn)).booleanValue();

    /* renamed from: D */
    private final boolean f22879D = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhp)).booleanValue();

    /* renamed from: E */
    private final String f22880E = (String) C4784a0.m12365c().zza(zzbgc.zzho);

    /* renamed from: F */
    private final String f22881F = (String) C4784a0.m12365c().zza(zzbgc.zzhq);

    /* renamed from: J */
    private final String f22885J = (String) C4784a0.m12365c().zza(zzbgc.zzhr);

    public BinderC9415c(zzclg zzclgVar, Context context, zzavi zzaviVar, zzfig zzfigVar, zzgey zzgeyVar, ScheduledExecutorService scheduledExecutorService, zzdwk zzdwkVar, zzfny zzfnyVar, zzcei zzceiVar, zzbhh zzbhhVar, zzfhl zzfhlVar) {
        List list;
        this.f22894a = zzclgVar;
        this.f22895b = context;
        this.f22896c = zzaviVar;
        this.f22897d = zzfhlVar;
        this.f22898e = zzfigVar;
        this.f22900r = zzgeyVar;
        this.f22901s = scheduledExecutorService;
        this.f22906x = zzclgVar.zzn();
        this.f22907y = zzdwkVar;
        this.f22908z = zzfnyVar;
        this.f22883H = zzceiVar;
        this.f22893R = zzbhhVar;
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhs)).booleanValue()) {
            this.f22886K = m28053H2((String) C4784a0.m12365c().zza(zzbgc.zzht));
            this.f22887L = m28053H2((String) C4784a0.m12365c().zza(zzbgc.zzhu));
            this.f22888M = m28053H2((String) C4784a0.m12365c().zza(zzbgc.zzhv));
            list = m28053H2((String) C4784a0.m12365c().zza(zzbgc.zzhw));
        } else {
            this.f22886K = f22872S;
            this.f22887L = f22873T;
            this.f22888M = f22874U;
            list = f22875V;
        }
        this.f22889N = list;
    }

    /* renamed from: A2 */
    private final InterfaceFutureC5920f m28046A2(final String str) {
        final zzdrz[] zzdrzVarArr = new zzdrz[1];
        InterfaceFutureC5920f zzn = zzgen.zzn(this.f22898e.zza(), new zzgdu() { // from class: l9.e0
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final InterfaceFutureC5920f zza(Object obj) {
                return BinderC9415c.this.m28082T2(zzdrzVarArr, str, (zzdrz) obj);
            }
        }, this.f22900r);
        zzn.addListener(new Runnable() { // from class: l9.f0
            @Override // java.lang.Runnable
            public final void run() {
                BinderC9415c.this.m28086q2(zzdrzVarArr);
            }
        }, this.f22900r);
        return zzgen.zze(zzgen.zzm((zzgee) zzgen.zzo(zzgee.zzu(zzn), ((Integer) C4784a0.m12365c().zza(zzbgc.zzhE)).intValue(), TimeUnit.MILLISECONDS, this.f22901s), new zzfws() { // from class: l9.l0
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                List list = BinderC9415c.f22872S;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f22900r), Exception.class, new zzfws() { // from class: l9.m0
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                List list = BinderC9415c.f22872S;
                zzcec.zzh("", (Exception) obj);
                return null;
            }
        }, this.f22900r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B2 */
    public final void m28047B2() {
        zzgen.zzr(((Boolean) C4784a0.m12365c().zza(zzbgc.zzkB)).booleanValue() ? zzgen.zzk(new zzgdt() { // from class: l9.b0
            @Override // com.google.android.gms.internal.ads.zzgdt
            public final InterfaceFutureC5920f zza() {
                return BinderC9415c.this.m28081S2();
            }
        }, zzcep.zza) : m28078z2(this.f22895b, null, EnumC12355c.BANNER.name(), null, null).zzc(), new C9448s0(this), this.f22894a.zzB());
    }

    /* renamed from: C2 */
    private final void m28048C2(List list, final InterfaceC5312b interfaceC5312b, zzbxi zzbxiVar, boolean z10) {
        InterfaceFutureC5920f zzb;
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzhD)).booleanValue()) {
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
            if (m28088w2((Uri) it.next())) {
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
            if (m28088w2(uri)) {
                zzb = this.f22900r.zzb(new Callable() { // from class: l9.g0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return BinderC9415c.this.m28079K2(uri, interfaceC5312b);
                    }
                });
                if (m28051F2()) {
                    zzb = zzgen.zzn(zzb, new zzgdu() { // from class: l9.h0
                        @Override // com.google.android.gms.internal.ads.zzgdu
                        public final InterfaceFutureC5920f zza(Object obj) {
                            InterfaceFutureC5920f zzm;
                            zzm = zzgen.zzm(r0.m28046A2("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfws() { // from class: l9.i0
                                @Override // com.google.android.gms.internal.ads.zzfws
                                public final Object apply(Object obj2) {
                                    return BinderC9415c.m28077y2(r2, (String) obj2);
                                }
                            }, BinderC9415c.this.f22900r);
                            return zzm;
                        }
                    }, this.f22900r);
                } else {
                    zzcec.zzi("Asset view map is empty.");
                }
            } else {
                zzcec.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb = zzgen.zzh(uri);
            }
            arrayList.add(zzb);
        }
        zzgen.zzr(zzgen.zzd(arrayList), new C9446r0(this, zzbxiVar, z10), this.f22894a.zzB());
    }

    /* renamed from: D2 */
    private final void m28049D2(final List list, final InterfaceC5312b interfaceC5312b, zzbxi zzbxiVar, boolean z10) {
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzhD)).booleanValue()) {
            try {
                zzbxiVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcec.zzh("", e10);
                return;
            }
        }
        InterfaceFutureC5920f zzb = this.f22900r.zzb(new Callable() { // from class: l9.n0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BinderC9415c.this.m28085i2(list, interfaceC5312b);
            }
        });
        if (m28051F2()) {
            zzb = zzgen.zzn(zzb, new zzgdu() { // from class: l9.o0
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final InterfaceFutureC5920f zza(Object obj) {
                    return BinderC9415c.this.m28083U2((ArrayList) obj);
                }
            }, this.f22900r);
        } else {
            zzcec.zzi("Asset view map is empty.");
        }
        zzgen.zzr(zzb, new C9444q0(this, zzbxiVar, z10), this.f22894a.zzB());
    }

    /* renamed from: E2 */
    private static boolean m28050E2(Uri uri, List list, List list2) {
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

    /* renamed from: F2 */
    private final boolean m28051F2() {
        Map map;
        zzbxr zzbxrVar = this.f22902t;
        return (zzbxrVar == null || (map = zzbxrVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G2 */
    public static final Uri m28052G2(Uri uri, String str, String str2) {
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

    /* renamed from: H2 */
    private static final List m28053H2(String str) {
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
    /* renamed from: P2 */
    public static /* bridge */ /* synthetic */ zzfmz m28059P2(InterfaceFutureC5920f interfaceFutureC5920f, zzccx zzccxVar) {
        if (!zzfnc.zza() || !((Boolean) zzbht.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfmz zzb = ((AbstractC9412a0) zzgen.zzp(interfaceFutureC5920f)).zzb();
            zzb.zzd(new ArrayList(Collections.singletonList(zzccxVar.zzb)));
            C4917u4 c4917u4 = zzccxVar.zzd;
            zzb.zzb(c4917u4 == null ? "" : c4917u4.f9826A);
            return zzb;
        } catch (ExecutionException e10) {
            C4965t.m12580q().zzw(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2 */
    public static /* bridge */ /* synthetic */ void m28070n2(BinderC9415c binderC9415c, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (binderC9415c.m28088w2((Uri) it.next())) {
                binderC9415c.f22882G.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2 */
    public static /* bridge */ /* synthetic */ void m28072p2(final BinderC9415c binderC9415c, final String str, final String str2, final zzdwa zzdwaVar) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzgX)).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhd)).booleanValue()) {
                zzcep.zza.execute(new Runnable() { // from class: l9.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BinderC9415c.this.m28087r2(str, str2, zzdwaVar);
                    }
                });
            } else {
                binderC9415c.f22906x.m28104d(str, str2, zzdwaVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y2 */
    public static final /* synthetic */ Uri m28077y2(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m28052G2(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: z2 */
    private final AbstractC9412a0 m28078z2(Context context, String str, String str2, C4947z4 c4947z4, C4917u4 c4917u4) {
        char c10;
        zzfhf zzfhfVar = new zzfhf();
        if ("REWARDED".equals(str2)) {
            zzfhfVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfhfVar.zzo().zza(3);
        }
        InterfaceC9455z zzo = this.f22894a.zzo();
        zzdaf zzdafVar = new zzdaf();
        zzdafVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfhfVar.zzs(str);
        if (c4917u4 == null) {
            c4917u4 = new C4923v4().m12461a();
        }
        zzfhfVar.zzE(c4917u4);
        if (c4947z4 == null) {
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
            c4947z4 = c10 != 0 ? (c10 == 1 || c10 == 2) ? C4947z4.m12529x1() : c10 != 3 ? c10 != 4 ? new C4947z4() : C4947z4.m12527v1() : C4947z4.m12528w1() : new C4947z4(context, C12367i.f33198i);
        }
        zzfhfVar.zzr(c4947z4);
        zzfhfVar.zzx(true);
        zzdafVar.zzi(zzfhfVar.zzG());
        zzo.zza(zzdafVar.zzj());
        C9419e c9419e = new C9419e();
        c9419e.m28091a(str2);
        zzo.zzb(new C9423g(c9419e, null));
        new zzdgm();
        AbstractC9412a0 zzc = zzo.zzc();
        this.f22899f = zzc.zza();
        return zzc;
    }

    private final void zzX() {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjp)).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjs)).booleanValue()) {
                return;
            }
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjw)).booleanValue() && this.f22890O.getAndSet(true)) {
                return;
            }
            m28047B2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K2 */
    public final /* synthetic */ Uri m28079K2(Uri uri, InterfaceC5312b interfaceC5312b) {
        zzfhl zzfhlVar;
        try {
            uri = (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzlr)).booleanValue() || (zzfhlVar = this.f22897d) == null) ? this.f22896c.zza(uri, this.f22895b, (View) BinderC5314d.m13411g2(interfaceC5312b), null) : zzfhlVar.zza(uri, this.f22895b, (View) BinderC5314d.m13411g2(interfaceC5312b), null);
        } catch (zzavj e10) {
            zzcec.zzk("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O2 */
    public final /* synthetic */ AbstractC9412a0 m28080O2(zzccx zzccxVar) {
        return m28078z2(this.f22895b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S2 */
    public final /* synthetic */ InterfaceFutureC5920f m28081S2() {
        return m28078z2(this.f22895b, null, EnumC12355c.BANNER.name(), null, null).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T2 */
    public final /* synthetic */ InterfaceFutureC5920f m28082T2(zzdrz[] zzdrzVarArr, String str, zzdrz zzdrzVar) {
        zzdrzVarArr[0] = zzdrzVar;
        Context context = this.f22895b;
        zzbxr zzbxrVar = this.f22902t;
        Map map = zzbxrVar.zzb;
        JSONObject m12596d = C4972b1.m12596d(context, map, map, zzbxrVar.zza, null);
        JSONObject m12599g = C4972b1.m12599g(this.f22895b, this.f22902t.zza);
        JSONObject m12598f = C4972b1.m12598f(this.f22902t.zza);
        JSONObject m12597e = C4972b1.m12597e(this.f22895b, this.f22902t.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", m12596d);
        jSONObject.put("ad_view_signal", m12599g);
        jSONObject.put("scroll_view_signal", m12598f);
        jSONObject.put("lock_screen_signal", m12597e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", C4972b1.m12595c(null, this.f22895b, this.f22904v, this.f22903u));
        }
        return zzdrzVar.zzd(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U2 */
    public final /* synthetic */ InterfaceFutureC5920f m28083U2(final ArrayList arrayList) {
        return zzgen.zzm(m28046A2("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfws() { // from class: l9.c0
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return BinderC9415c.this.m28084h2(arrayList, (String) obj);
            }
        }, this.f22900r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2 */
    public final /* synthetic */ ArrayList m28084h2(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m28089x2(uri) && !TextUtils.isEmpty(str)) {
                uri = m28052G2(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i2 */
    public final /* synthetic */ ArrayList m28085i2(List list, InterfaceC5312b interfaceC5312b) {
        this.f22896c.zzc();
        String zzh = this.f22896c.zzc().zzh(this.f22895b, (View) BinderC5314d.m13411g2(interfaceC5312b), null);
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m28089x2(uri)) {
                uri = m28052G2(uri, "ms", zzh);
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
    /* renamed from: q2 */
    public final /* synthetic */ void m28086q2(zzdrz[] zzdrzVarArr) {
        zzdrz zzdrzVar = zzdrzVarArr[0];
        if (zzdrzVar != null) {
            this.f22898e.zzb(zzgen.zzh(zzdrzVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2 */
    public final /* synthetic */ void m28087r2(String str, String str2, zzdwa zzdwaVar) {
        this.f22906x.m28104d(str, str2, zzdwaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w2 */
    public final boolean m28088w2(Uri uri) {
        return m28050E2(uri, this.f22886K, this.f22887L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x2 */
    public final boolean m28089x2(Uri uri) {
        return m28050E2(uri, this.f22888M, this.f22889N);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final InterfaceC5312b zze(InterfaceC5312b interfaceC5312b, InterfaceC5312b interfaceC5312b2, String str, InterfaceC5312b interfaceC5312b3) {
        C0399i zzb;
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjz)).booleanValue()) {
            this.f22893R.zzg((Context) BinderC5314d.m13411g2(interfaceC5312b), (C0393c) BinderC5314d.m13411g2(interfaceC5312b2), str, (C0392b) BinderC5314d.m13411g2(interfaceC5312b3));
            zzb = this.f22893R.zzb();
        } else {
            zzb = null;
        }
        return BinderC5314d.m13412h2(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzf(InterfaceC5312b interfaceC5312b, final zzccx zzccxVar, zzccq zzccqVar) {
        InterfaceFutureC5920f zzh;
        InterfaceFutureC5920f zzc;
        InterfaceFutureC5920f interfaceFutureC5920f;
        InterfaceFutureC5920f interfaceFutureC5920f2;
        Context context = (Context) BinderC5314d.m13411g2(interfaceC5312b);
        this.f22895b = context;
        zzfmo zza = zzfmn.zza(context, 22);
        zza.zzh();
        if ("UNKNOWN".equals(zzccxVar.zzb)) {
            List arrayList = new ArrayList();
            zzbfu zzbfuVar = zzbgc.zzhC;
            if (!((String) C4784a0.m12365c().zza(zzbfuVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) C4784a0.m12365c().zza(zzbfuVar)).split(","));
            }
            if (arrayList.contains(C9454y.m28108b(zzccxVar.zzd))) {
                InterfaceFutureC5920f zzg = zzgen.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                interfaceFutureC5920f2 = zzg;
                interfaceFutureC5920f = zzgen.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgen.zzr(interfaceFutureC5920f, new C9442p0(this, interfaceFutureC5920f2, zzccxVar, zzccqVar, zza, C4965t.m12565b().mo28130a()), this.f22894a.zzB());
            }
        }
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkB)).booleanValue()) {
            zzgey zzgeyVar = zzcep.zza;
            zzh = zzgeyVar.zzb(new Callable() { // from class: l9.j0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BinderC9415c.this.m28080O2(zzccxVar);
                }
            });
            zzc = zzgen.zzn(zzh, new zzgdu() { // from class: l9.k0
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final InterfaceFutureC5920f zza(Object obj) {
                    return ((AbstractC9412a0) obj).zzc();
                }
            }, zzgeyVar);
        } else {
            AbstractC9412a0 m28078z2 = m28078z2(this.f22895b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
            zzh = zzgen.zzh(m28078z2);
            zzc = m28078z2.zzc();
        }
        interfaceFutureC5920f = zzc;
        interfaceFutureC5920f2 = zzh;
        zzgen.zzr(interfaceFutureC5920f, new C9442p0(this, interfaceFutureC5920f2, zzccxVar, zzccqVar, zza, C4965t.m12565b().mo28130a()), this.f22894a.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzg(zzbxr zzbxrVar) {
        this.f22902t = zzbxrVar;
        this.f22898e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzh(List list, InterfaceC5312b interfaceC5312b, zzbxi zzbxiVar) {
        m28048C2(list, interfaceC5312b, zzbxiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzi(List list, InterfaceC5312b interfaceC5312b, zzbxi zzbxiVar) {
        m28049D2(list, interfaceC5312b, zzbxiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzj(InterfaceC5312b interfaceC5312b) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjo)).booleanValue()) {
            zzbfu zzbfuVar = zzbgc.zzhB;
            if (!((Boolean) C4784a0.m12365c().zza(zzbfuVar)).booleanValue()) {
                zzX();
            }
            WebView webView = (WebView) BinderC5314d.m13411g2(interfaceC5312b);
            if (webView == null) {
                zzcec.zzg("The webView cannot be null.");
                return;
            }
            if (this.f22905w.contains(webView)) {
                zzcec.zzi("This webview has already been registered.");
                return;
            }
            this.f22905w.add(webView);
            webView.addJavascriptInterface(new C9411a(webView, this.f22896c, this.f22907y, this.f22908z, this.f22897d), "gmaSdk");
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjy)).booleanValue()) {
                C4965t.m12580q().zzs();
            }
            if (((Boolean) C4784a0.m12365c().zza(zzbfuVar)).booleanValue()) {
                zzX();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzk(InterfaceC5312b interfaceC5312b) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhD)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) BinderC5314d.m13411g2(interfaceC5312b);
            zzbxr zzbxrVar = this.f22902t;
            this.f22903u = C4972b1.m12593a(motionEvent, zzbxrVar == null ? null : zzbxrVar.zza);
            if (motionEvent.getAction() == 0) {
                this.f22904v = this.f22903u;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f22903u;
            obtain.setLocation(point.x, point.y);
            this.f22896c.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzl(List list, InterfaceC5312b interfaceC5312b, zzbxi zzbxiVar) {
        m28048C2(list, interfaceC5312b, zzbxiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzm(List list, InterfaceC5312b interfaceC5312b, zzbxi zzbxiVar) {
        m28049D2(list, interfaceC5312b, zzbxiVar, false);
    }
}
