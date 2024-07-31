package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.x0;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g9.u;
import g9.v;
import g9.w;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import la.q;

/* loaded from: classes2.dex */
public class zzcjs extends WebViewClient implements zzcky {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzehs zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzcbs zza;
    private final zzcjk zzc;
    private final zzbbp zzd;
    private com.google.android.gms.ads.internal.client.a zzg;
    private w zzh;
    private zzckw zzi;
    private zzckx zzj;
    private zzblw zzk;
    private zzbly zzl;
    private zzdiu zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private g9.b zzv;
    private zzbvv zzw;
    private com.google.android.gms.ads.internal.b zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbvq zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) a0.c().zza(zzbgc.zzfE)).split(",")));

    public zzcjs(zzcjk zzcjkVar, zzbbp zzbbpVar, boolean z10, zzbvv zzbvvVar, zzbvq zzbvqVar, zzehs zzehsVar) {
        this.zzd = zzbbpVar;
        this.zzc = zzcjkVar;
        this.zzs = z10;
        this.zzw = zzbvvVar;
        this.zzE = zzehsVar;
    }

    private static WebResourceResponse zzO() {
        if (((Boolean) a0.c().zza(zzbgc.zzaJ)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        r5 = zzO();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zzP(java.lang.String r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjs.zzP(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzQ(Map map, List list, String str) {
        if (u1.c()) {
            u1.a("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                u1.a("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbng) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzR() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void zzS(View view, zzcbs zzcbsVar, int i10) {
        if (!zzcbsVar.zzi() || i10 <= 0) {
            return;
        }
        zzcbsVar.zzg(view);
        if (zzcbsVar.zzi()) {
            j2.f8993l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjl
                public final /* synthetic */ View zzb;
                public final /* synthetic */ zzcbs zzc;
                public final /* synthetic */ int zzd;

                public /* synthetic */ zzcjl(View view2, zzcbs zzcbsVar2, int i102) {
                    r2 = view2;
                    r3 = zzcbsVar2;
                    r4 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcjs.this.zzp(r2, r3, r4);
                }
            }, 100L);
        }
    }

    private static final boolean zzT(zzcjk zzcjkVar) {
        if (zzcjkVar.zzD() != null) {
            return zzcjkVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzU(boolean z10, zzcjk zzcjkVar) {
        return (!z10 || zzcjkVar.zzO().zzi() || zzcjkVar.zzT().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcky, com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.a aVar = this.zzg;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        u1.a("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaB()) {
                u1.a("Blank page loaded, 1...");
                this.zzc.zzV();
                return;
            }
            this.zzz = true;
            zzckx zzckxVar = this.zzj;
            if (zzckxVar != null) {
                zzckxVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) a0.c().zza(zzbgc.zzlm)).booleanValue()) {
                    this.zzc.zzL().i2(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcjk zzcjkVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcjkVar.zzaA(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case RecognitionOptions.ITF /* 128 */:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        u1.a("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.a aVar = this.zzg;
                    if (aVar != null) {
                        aVar.onAdClicked();
                        zzcbs zzcbsVar = this.zza;
                        if (zzcbsVar != null) {
                            zzcbsVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdiu zzdiuVar = this.zzm;
                    if (zzdiuVar != null) {
                        zzdiuVar.zzs();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                zzcec.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzavi zzI = this.zzc.zzI();
                    zzfhl zzQ = this.zzc.zzQ();
                    if (!((Boolean) a0.c().zza(zzbgc.zzlr)).booleanValue() || zzQ == null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzcjk zzcjkVar = this.zzc;
                            parse = zzI.zza(parse, context, (View) zzcjkVar, zzcjkVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzcjk zzcjkVar2 = this.zzc;
                        parse = zzQ.zza(parse, context2, (View) zzcjkVar2, zzcjkVar2.zzi());
                    }
                } catch (zzavj unused) {
                    zzcec.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.b bVar = this.zzx;
                if (bVar == null || bVar.c()) {
                    zzu(new g9.j("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, zzbng zzbngVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbngVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzB(zzckw zzckwVar) {
        this.zzi = zzckwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzC(int i10, int i11) {
        zzbvq zzbvqVar = this.zzy;
        if (zzbvqVar != null) {
            zzbvqVar.zze(i10, i11);
        }
    }

    public final void zzD(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzE(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjm
                public /* synthetic */ zzcjm() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcjs.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzG(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzH(zzckx zzckxVar) {
        this.zzj = zzckxVar;
    }

    public final void zzI(String str, zzbng zzbngVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbngVar);
        }
    }

    public final void zzJ(String str, q qVar) {
        synchronized (this.zzf) {
            List<zzbng> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbng zzbngVar : list) {
                if (qVar.apply(zzbngVar)) {
                    arrayList.add(zzbngVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzK() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final boolean zzL() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzM() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzN(com.google.android.gms.ads.internal.client.a aVar, zzblw zzblwVar, w wVar, zzbly zzblyVar, g9.b bVar, boolean z10, zzbni zzbniVar, com.google.android.gms.ads.internal.b bVar2, zzbvx zzbvxVar, zzcbs zzcbsVar, zzehh zzehhVar, zzfny zzfnyVar, zzdwf zzdwfVar, zzflw zzflwVar, zzbnz zzbnzVar, zzdiu zzdiuVar, zzbny zzbnyVar, zzbns zzbnsVar, zzcse zzcseVar) {
        zzbng zzbngVar;
        com.google.android.gms.ads.internal.b bVar3 = bVar2 == null ? new com.google.android.gms.ads.internal.b(this.zzc.getContext(), zzcbsVar, null) : bVar2;
        this.zzy = new zzbvq(this.zzc, zzbvxVar);
        this.zza = zzcbsVar;
        if (((Boolean) a0.c().zza(zzbgc.zzaR)).booleanValue()) {
            zzA("/adMetadata", new zzblv(zzblwVar));
        }
        if (zzblyVar != null) {
            zzA("/appEvent", new zzblx(zzblyVar));
        }
        zzA("/backButton", zzbnf.zzj);
        zzA("/refresh", zzbnf.zzk);
        zzA("/canOpenApp", zzbnf.zzb);
        zzA("/canOpenURLs", zzbnf.zza);
        zzA("/canOpenIntents", zzbnf.zzc);
        zzA("/close", zzbnf.zzd);
        zzA("/customClose", zzbnf.zze);
        zzA("/instrument", zzbnf.zzn);
        zzA("/delayPageLoaded", zzbnf.zzp);
        zzA("/delayPageClosed", zzbnf.zzq);
        zzA("/getLocationInfo", zzbnf.zzr);
        zzA("/log", zzbnf.zzg);
        zzA("/mraid", new zzbnm(bVar3, this.zzy, zzbvxVar));
        zzbvv zzbvvVar = this.zzw;
        if (zzbvvVar != null) {
            zzA("/mraidLoaded", zzbvvVar);
        }
        com.google.android.gms.ads.internal.b bVar4 = bVar3;
        zzA("/open", new zzbnr(bVar3, this.zzy, zzehhVar, zzdwfVar, zzflwVar, zzcseVar));
        zzA("/precache", new zzchx());
        zzA("/touch", zzbnf.zzi);
        zzA("/video", zzbnf.zzl);
        zzA("/videoMeta", zzbnf.zzm);
        if (zzehhVar == null || zzfnyVar == null) {
            zzA("/click", new zzbme(zzdiuVar, zzcseVar));
            zzbngVar = zzbnf.zzf;
        } else {
            zzA("/click", new zzbng() { // from class: com.google.android.gms.internal.ads.zzfhp
                public final /* synthetic */ zzcse zzb;
                public final /* synthetic */ zzfny zzc;
                public final /* synthetic */ zzehh zzd;

                public /* synthetic */ zzfhp(zzcse zzcseVar2, zzfny zzfnyVar2, zzehh zzehhVar2) {
                    r2 = zzcseVar2;
                    r3 = zzfnyVar2;
                    r4 = zzehhVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzbng
                public final void zza(Object obj, Map map) {
                    zzcjk zzcjkVar = (zzcjk) obj;
                    zzbnf.zzc(map, zzdiu.this);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcec.zzj("URL missing from click GMSG.");
                        return;
                    }
                    zzehh zzehhVar2 = r4;
                    zzfny zzfnyVar2 = r3;
                    zzgen.zzr(zzbnf.zza(zzcjkVar, str), new zzfhr(zzcjkVar, r2, zzfnyVar2, zzehhVar2), zzcep.zza);
                }
            });
            zzbngVar = new zzbng() { // from class: com.google.android.gms.internal.ads.zzfhq
                public final /* synthetic */ zzehh zzb;

                public /* synthetic */ zzfhq(zzehh zzehhVar2) {
                    r2 = zzehhVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzbng
                public final void zza(Object obj, Map map) {
                    zzcjb zzcjbVar = (zzcjb) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcec.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcjbVar.zzD().zzaj) {
                        r2.zzd(new zzehj(t.b().a(), ((zzckj) zzcjbVar).zzP().zzb, str, 2));
                    } else {
                        zzfny.this.zzc(str, null);
                    }
                }
            };
        }
        zzA("/httpTrack", zzbngVar);
        if (t.p().zzp(this.zzc.getContext())) {
            zzA("/logScionEvent", new zzbnl(this.zzc.getContext()));
        }
        if (zzbniVar != null) {
            zzA("/setInterstitialProperties", new zzbnh(zzbniVar));
        }
        if (zzbnzVar != null) {
            if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzbnzVar);
            }
        }
        if (((Boolean) a0.c().zza(zzbgc.zzjg)).booleanValue() && zzbnyVar != null) {
            zzA("/shareSheet", zzbnyVar);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue() && zzbnsVar != null) {
            zzA("/inspectorOutOfContextTest", zzbnsVar);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzkT)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbnf.zzu);
            zzA("/presentPlayStoreOverlay", zzbnf.zzv);
            zzA("/expandPlayStoreOverlay", zzbnf.zzw);
            zzA("/collapsePlayStoreOverlay", zzbnf.zzx);
            zzA("/closePlayStoreOverlay", zzbnf.zzy);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzda)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbnf.zzA);
            zzA("/resetPAID", zzbnf.zzz);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzll)).booleanValue()) {
            zzcjk zzcjkVar = this.zzc;
            if (zzcjkVar.zzD() != null && zzcjkVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbnf.zzB);
                zzA("/clearLocalStorageKeys", zzbnf.zzC);
            }
        }
        this.zzg = aVar;
        this.zzh = wVar;
        this.zzk = zzblwVar;
        this.zzl = zzblyVar;
        this.zzv = bVar;
        this.zzx = bVar4;
        this.zzm = zzdiuVar;
        this.zzn = z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
        zzdiu zzdiuVar = this.zzm;
        if (zzdiuVar != null) {
            zzdiuVar.zzbo();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzcjo.<init>(com.google.android.gms.internal.ads.zzcjs, boolean, long):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c A[Catch: NoClassDefFoundError -> 0x026b, Exception | NoClassDefFoundError -> 0x026d, TRY_ENTER, TryCatch #9 {Exception | NoClassDefFoundError -> 0x026d, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0023, B:10:0x002f, B:12:0x004c, B:14:0x0065, B:16:0x007c, B:17:0x007f, B:18:0x0082, B:21:0x009c, B:23:0x00b4, B:24:0x00be, B:26:0x00cc, B:39:0x016d, B:41:0x0193, B:44:0x0241, B:55:0x01c9, B:56:0x01f2, B:50:0x019f, B:51:0x0129, B:65:0x00c1, B:66:0x01f3, B:68:0x01fd, B:70:0x0203, B:72:0x0235, B:76:0x0250, B:78:0x0256, B:80:0x0264), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0241 A[Catch: NoClassDefFoundError -> 0x026b, Exception | NoClassDefFoundError -> 0x026d, TryCatch #9 {Exception | NoClassDefFoundError -> 0x026d, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0023, B:10:0x002f, B:12:0x004c, B:14:0x0065, B:16:0x007c, B:17:0x007f, B:18:0x0082, B:21:0x009c, B:23:0x00b4, B:24:0x00be, B:26:0x00cc, B:39:0x016d, B:41:0x0193, B:44:0x0241, B:55:0x01c9, B:56:0x01f2, B:50:0x019f, B:51:0x0129, B:65:0x00c1, B:66:0x01f3, B:68:0x01fd, B:70:0x0203, B:72:0x0235, B:76:0x0250, B:78:0x0256, B:80:0x0264), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3 A[Catch: NoClassDefFoundError -> 0x026b, Exception | NoClassDefFoundError -> 0x026d, TryCatch #9 {Exception | NoClassDefFoundError -> 0x026d, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0023, B:10:0x002f, B:12:0x004c, B:14:0x0065, B:16:0x007c, B:17:0x007f, B:18:0x0082, B:21:0x009c, B:23:0x00b4, B:24:0x00be, B:26:0x00cc, B:39:0x016d, B:41:0x0193, B:44:0x0241, B:55:0x01c9, B:56:0x01f2, B:50:0x019f, B:51:0x0129, B:65:0x00c1, B:66:0x01f3, B:68:0x01fd, B:70:0x0203, B:72:0x0235, B:76:0x0250, B:78:0x0256, B:80:0x0264), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0256 A[Catch: NoClassDefFoundError -> 0x026b, Exception | NoClassDefFoundError -> 0x026d, TryCatch #9 {Exception | NoClassDefFoundError -> 0x026d, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0023, B:10:0x002f, B:12:0x004c, B:14:0x0065, B:16:0x007c, B:17:0x007f, B:18:0x0082, B:21:0x009c, B:23:0x00b4, B:24:0x00be, B:26:0x00cc, B:39:0x016d, B:41:0x0193, B:44:0x0241, B:55:0x01c9, B:56:0x01f2, B:50:0x019f, B:51:0x0129, B:65:0x00c1, B:66:0x01f3, B:68:0x01fd, B:70:0x0203, B:72:0x0235, B:76:0x0250, B:78:0x0256, B:80:0x0264), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0269 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjs.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final com.google.android.gms.ads.internal.b zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() && this.zzc.zzm() != null) {
                zzbgm.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzckw zzckwVar = this.zzi;
            boolean z10 = false;
            if (!this.zzA && !this.zzo) {
                z10 = true;
            }
            zzckwVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzad();
    }

    public final void zzh() {
        zzcbs zzcbsVar = this.zza;
        if (zzcbsVar != null) {
            zzcbsVar.zze();
            this.zza = null;
        }
        zzR();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbvq zzbvqVar = this.zzy;
            if (zzbvqVar != null) {
                zzbvqVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z10) {
        this.zzC = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzj(Uri uri) {
        u1.a("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            u1.a("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) a0.c().zza(zzbgc.zzgM)).booleanValue() || t.q().zzg() == null) {
                return;
            }
            zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjn
                public final /* synthetic */ String zza;

                public /* synthetic */ zzcjn(String str) {
                    r1 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = zzcjs.zzb;
                    t.q().zzg().zze(r1);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) a0.c().zza(zzbgc.zzfD)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) a0.c().zza(zzbgc.zzfF)).intValue()) {
                u1.a("Parsing gmsg query params on BG thread: ".concat(path));
                zzgen.zzr(t.r().D(uri), new zzcjq(this, list, path, uri), zzcep.zze);
                return;
            }
        }
        t.r();
        zzQ(j2.o(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzk() {
        zzbbp zzbbpVar = this.zzd;
        if (zzbbpVar != null) {
            zzbbpVar.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzab();
        u zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    public final /* synthetic */ void zzo(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    public final /* synthetic */ void zzp(View view, zzcbs zzcbsVar, int i10) {
        zzS(view, zzcbsVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzq(int i10, int i11, boolean z10) {
        zzbvv zzbvvVar = this.zzw;
        if (zzbvvVar != null) {
            zzbvvVar.zzb(i10, i11);
        }
        zzbvq zzbvqVar = this.zzy;
        if (zzbvqVar != null) {
            zzbvqVar.zzd(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zzr() {
        zzcbs zzcbsVar = this.zza;
        if (zzcbsVar != null) {
            WebView zzG = this.zzc.zzG();
            if (x0.G(zzG)) {
                zzS(zzG, zzcbsVar, 10);
                return;
            }
            zzR();
            zzcjp zzcjpVar = new zzcjp(this, zzcbsVar);
            this.zzF = zzcjpVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcjpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        zzdiu zzdiuVar = this.zzm;
        if (zzdiuVar != null) {
            zzdiuVar.zzs();
        }
    }

    public final void zzu(g9.j jVar, boolean z10) {
        zzcjk zzcjkVar = this.zzc;
        boolean zzaC = zzcjkVar.zzaC();
        boolean zzU = zzU(zzaC, zzcjkVar);
        boolean z11 = true;
        if (!zzU && z10) {
            z11 = false;
        }
        com.google.android.gms.ads.internal.client.a aVar = zzU ? null : this.zzg;
        w wVar = zzaC ? null : this.zzh;
        g9.b bVar = this.zzv;
        zzcjk zzcjkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(jVar, aVar, wVar, bVar, zzcjkVar2.zzn(), zzcjkVar2, z11 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i10) {
        zzehs zzehsVar = this.zzE;
        zzcjk zzcjkVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcjkVar, zzcjkVar.zzn(), str, str2, 14, zzehsVar));
    }

    public final void zzw(boolean z10, int i10, boolean z11) {
        zzcjk zzcjkVar = this.zzc;
        boolean zzU = zzU(zzcjkVar.zzaC(), zzcjkVar);
        boolean z12 = true;
        if (!zzU && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.a aVar = zzU ? null : this.zzg;
        w wVar = this.zzh;
        g9.b bVar = this.zzv;
        zzcjk zzcjkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(aVar, wVar, bVar, zzcjkVar2, z10, i10, zzcjkVar2.zzn(), z12 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        g9.j jVar;
        zzbvq zzbvqVar = this.zzy;
        boolean zzf = zzbvqVar != null ? zzbvqVar.zzf() : false;
        t.k();
        v.a(this.zzc.getContext(), adOverlayInfoParcel, !zzf);
        zzcbs zzcbsVar = this.zza;
        if (zzcbsVar != null) {
            String str = adOverlayInfoParcel.f8893w;
            if (str == null && (jVar = adOverlayInfoParcel.f8882a) != null) {
                str = jVar.f16123b;
            }
            zzcbsVar.zzh(str);
        }
    }

    public final void zzy(boolean z10, int i10, String str, String str2, boolean z11) {
        zzcjk zzcjkVar = this.zzc;
        boolean zzaC = zzcjkVar.zzaC();
        boolean zzU = zzU(zzaC, zzcjkVar);
        boolean z12 = true;
        if (!zzU && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.a aVar = zzU ? null : this.zzg;
        zzcjr zzcjrVar = zzaC ? null : new zzcjr(this.zzc, this.zzh);
        zzblw zzblwVar = this.zzk;
        zzbly zzblyVar = this.zzl;
        g9.b bVar = this.zzv;
        zzcjk zzcjkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(aVar, zzcjrVar, zzblwVar, zzblyVar, bVar, zzcjkVar2, z10, i10, str, str2, zzcjkVar2.zzn(), z12 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z10, int i10, String str, boolean z11, boolean z12) {
        zzcjk zzcjkVar = this.zzc;
        boolean zzaC = zzcjkVar.zzaC();
        boolean zzU = zzU(zzaC, zzcjkVar);
        boolean z13 = true;
        if (!zzU && z11) {
            z13 = false;
        }
        com.google.android.gms.ads.internal.client.a aVar = zzU ? null : this.zzg;
        zzcjr zzcjrVar = zzaC ? null : new zzcjr(this.zzc, this.zzh);
        zzblw zzblwVar = this.zzk;
        zzbly zzblyVar = this.zzl;
        g9.b bVar = this.zzv;
        zzcjk zzcjkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(aVar, zzcjrVar, zzblwVar, zzblyVar, bVar, zzcjkVar2, z10, i10, str, zzcjkVar2.zzn(), z13 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null, z12));
    }
}
