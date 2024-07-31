package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.k1;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.s1;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzftt;
import g9.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import la.p;
import la.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzckf extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcjk {
    public static final /* synthetic */ int zza = 0;
    private zzcki zzA;
    private boolean zzB;
    private boolean zzC;
    private zzbja zzD;
    private zzbiy zzE;
    private zzbad zzF;
    private int zzG;
    private int zzH;
    private zzbgr zzI;
    private final zzbgr zzJ;
    private zzbgr zzK;
    private final zzbgs zzL;
    private int zzM;
    private u zzN;
    private boolean zzO;
    private final s1 zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private Map zzU;
    private final WindowManager zzV;
    private final zzbbp zzW;
    private boolean zzX;
    private final zzckz zzb;
    private final zzavi zzc;
    private final zzfhl zzd;
    private final zzbhj zze;
    private final zzcei zzf;
    private l zzg;
    private final com.google.android.gms.ads.internal.a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfgm zzk;
    private zzfgp zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjs zzo;
    private u zzp;
    private zzfod zzq;
    private zzcla zzr;
    private final String zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private Boolean zzx;
    private boolean zzy;
    private final String zzz;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzckf(zzckz zzckzVar, zzcla zzclaVar, String str, boolean z10, boolean z11, zzavi zzaviVar, zzbhj zzbhjVar, zzcei zzceiVar, zzbgu zzbguVar, l lVar, com.google.android.gms.ads.internal.a aVar, zzbbp zzbbpVar, zzfgm zzfgmVar, zzfgp zzfgpVar, zzfhl zzfhlVar) {
        super(zzckzVar);
        zzfgp zzfgpVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzy = true;
        this.zzz = "";
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzb = zzckzVar;
        this.zzr = zzclaVar;
        this.zzs = str;
        this.zzv = z10;
        this.zzc = zzaviVar;
        this.zzd = zzfhlVar;
        this.zze = zzbhjVar;
        this.zzf = zzceiVar;
        this.zzg = lVar;
        this.zzh = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzV = windowManager;
        t.r();
        DisplayMetrics U = j2.U(windowManager);
        this.zzi = U;
        this.zzj = U.density;
        this.zzW = zzbbpVar;
        this.zzk = zzfgmVar;
        this.zzl = zzfgpVar;
        this.zzP = new s1(zzckzVar.zza(), this, this, null);
        this.zzX = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            zzcec.zzh("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) a0.c().zza(zzbgc.zzkZ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(t.r().E(zzckzVar, zzceiVar.zza));
        t.r();
        final Context context = getContext();
        k1.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzftt zzfttVar = j2.f8993l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzaK)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaV();
        addJavascriptInterface(new zzckm(this, new zzckl(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbd();
        zzbgs zzbgsVar = new zzbgs(new zzbgu(true, "make_wv", this.zzs));
        this.zzL = zzbgsVar;
        zzbgsVar.zza().zzc(null);
        if (((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() && (zzfgpVar2 = this.zzl) != null && zzfgpVar2.zzb != null) {
            zzbgsVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbgsVar.zza();
        zzbgr zzf = zzbgu.zzf();
        this.zzJ = zzf;
        zzbgsVar.zzb("native:view_create", zzf);
        this.zzK = null;
        this.zzI = null;
        n1.a().b(zzckzVar);
        t.q().zzt();
    }

    private final synchronized void zzaV() {
        zzfgm zzfgmVar = this.zzk;
        if (zzfgmVar != null && zzfgmVar.zzan) {
            zzcec.zze("Disabling hardware acceleration on an overlay.");
            zzaX();
            return;
        }
        if (!this.zzv && !this.zzr.zzi()) {
            zzcec.zze("Enabling hardware acceleration on an AdView.");
            zzaZ();
            return;
        }
        zzcec.zze("Enabling hardware acceleration on an overlay.");
        zzaZ();
    }

    private final synchronized void zzaW() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        t.q().zzr();
    }

    private final synchronized void zzaX() {
        if (!this.zzw) {
            setLayerType(1, null);
        }
        this.zzw = true;
    }

    private final void zzaY(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z10 ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaZ() {
        if (this.zzw) {
            setLayerType(0, null);
        }
        this.zzw = false;
    }

    private final synchronized void zzba(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th2) {
            t.q().zzw(th2, "AdWebViewImpl.loadUrlUnsafe");
            zzcec.zzk("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final void zzbb() {
        zzbgm.zza(this.zzL.zza(), this.zzJ, "aeh2");
    }

    private final synchronized void zzbc() {
        Map map = this.zzU;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzchw) it.next()).release();
            }
        }
        this.zzU = null;
    }

    private final void zzbd() {
        zzbgs zzbgsVar = this.zzL;
        if (zzbgsVar == null) {
            return;
        }
        zzbgu zza2 = zzbgsVar.zza();
        zzbgk zzg = t.q().zzg();
        if (zzg != null) {
            zzg.zzf(zza2);
        }
    }

    private final synchronized void zzbe() {
        Boolean zzl = t.q().zzl();
        this.zzx = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaT(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaT(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final synchronized void destroy() {
        zzbd();
        this.zzP.a();
        u uVar = this.zzp;
        if (uVar != null) {
            uVar.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzo.zzh();
        this.zzF = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzu) {
            return;
        }
        t.A().zzd(this);
        zzbc();
        this.zzu = true;
        if (!((Boolean) a0.c().zza(zzbgc.zzkn)).booleanValue()) {
            u1.a("Destroying the WebView immediately...");
            zzV();
        } else {
            u1.a("Initiating WebView self destruct sequence in 3...");
            u1.a("Loading blank page in WebView, 2...");
            zzba("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaB()) {
            zzcec.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) a0.c().zza(zzbgc.zzko)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcep.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckb
                @Override // java.lang.Runnable
                public final void run() {
                    zzckf.this.zzaR(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                if (!this.zzu) {
                    this.zzo.zzh();
                    t.A().zzd(this);
                    zzbc();
                    zzaW();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaB()) {
            zzcec.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaB()) {
            zzcec.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final synchronized void loadUrl(String str) {
        if (zzaB()) {
            zzcec.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th2) {
            t.q().zzw(th2, "AdWebViewImpl.loadUrl");
            zzcec.zzk("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null) {
            zzcjsVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzP.c();
        }
        if (this.zzX) {
            onResume();
            this.zzX = false;
        }
        boolean z10 = this.zzB;
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null && zzcjsVar.zzM()) {
            if (!this.zzC) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzC = true;
            }
            zzaU();
            z10 = true;
        }
        zzaY(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcjs zzcjsVar;
        synchronized (this) {
            if (!zzaB()) {
                this.zzP.d();
            }
            super.onDetachedFromWindow();
            if (this.zzC && (zzcjsVar = this.zzo) != null && zzcjsVar.zzM() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzC = false;
            }
        }
        zzaY(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) a0.c().zza(zzbgc.zzkz)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            t.r();
            j2.s(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            zzcec.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            t.q().zzw(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaB()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaU = zzaU();
        u zzL = zzL();
        if (zzL == null || !zzaU) {
            return;
        }
        zzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba A[Catch: all -> 0x01e0, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:40:0x008a, B:44:0x007b, B:47:0x0080, B:51:0x0097, B:53:0x009f, B:55:0x00b1, B:58:0x00b6, B:60:0x00d2, B:61:0x00da, B:64:0x00d6, B:65:0x00df, B:67:0x00e7, B:70:0x00f2, B:77:0x0116, B:79:0x011d, B:83:0x0125, B:85:0x0137, B:87:0x0145, B:90:0x0152, B:94:0x0157, B:96:0x01a2, B:97:0x01a6, B:99:0x01ad, B:104:0x01ba, B:106:0x01c0, B:107:0x01c3, B:109:0x01c7, B:110:0x01d0, B:116:0x01db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137 A[Catch: all -> 0x01e0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:40:0x008a, B:44:0x007b, B:47:0x0080, B:51:0x0097, B:53:0x009f, B:55:0x00b1, B:58:0x00b6, B:60:0x00d2, B:61:0x00da, B:64:0x00d6, B:65:0x00df, B:67:0x00e7, B:70:0x00f2, B:77:0x0116, B:79:0x011d, B:83:0x0125, B:85:0x0137, B:87:0x0145, B:90:0x0152, B:94:0x0157, B:96:0x01a2, B:97:0x01a6, B:99:0x01ad, B:104:0x01ba, B:106:0x01c0, B:107:0x01c3, B:109:0x01c7, B:110:0x01d0, B:116:0x01db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157 A[Catch: all -> 0x01e0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:40:0x008a, B:44:0x007b, B:47:0x0080, B:51:0x0097, B:53:0x009f, B:55:0x00b1, B:58:0x00b6, B:60:0x00d2, B:61:0x00da, B:64:0x00d6, B:65:0x00df, B:67:0x00e7, B:70:0x00f2, B:77:0x0116, B:79:0x011d, B:83:0x0125, B:85:0x0137, B:87:0x0145, B:90:0x0152, B:94:0x0157, B:96:0x01a2, B:97:0x01a6, B:99:0x01ad, B:104:0x01ba, B:106:0x01c0, B:107:0x01c3, B:109:0x01c7, B:110:0x01d0, B:116:0x01db), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckf.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final void onPause() {
        if (zzaB()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            zzcec.zzh("Could not pause webview.", e10);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final void onResume() {
        if (zzaB()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            zzcec.zzh("Could not resume webview.", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzo.zzM() || this.zzo.zzK()) {
            zzavi zzaviVar = this.zzc;
            if (zzaviVar != null) {
                zzaviVar.zzd(motionEvent);
            }
            zzbhj zzbhjVar = this.zze;
            if (zzbhjVar != null) {
                zzbhjVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbja zzbjaVar = this.zzD;
                if (zzbjaVar != null) {
                    zzbjaVar.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjk
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjs) {
            this.zzo = (zzcjs) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            zzcec.zzh("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final synchronized void zzA(int i10) {
        this.zzM = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcgl
    public final synchronized void zzC(zzcki zzckiVar) {
        if (this.zzA != null) {
            zzcec.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzA = zzckiVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcjb
    public final zzfgm zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzckv
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzckt
    public final zzavi zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized zzbad zzJ() {
        return this.zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized zzbja zzK() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized u zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized u zzM() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final /* synthetic */ zzcky zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcks
    public final synchronized zzcla zzO() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzckj
    public final zzfgp zzP() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final zzfhl zzQ() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized zzfod zzR() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final com.google.common.util.concurrent.f zzS() {
        zzbhj zzbhjVar = this.zze;
        return zzbhjVar == null ? zzgen.zzh(null) : zzbhjVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized String zzT() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzU(zzfgm zzfgmVar, zzfgp zzfgpVar) {
        this.zzk = zzfgmVar;
        this.zzl = zzfgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzV() {
        u1.a("Destroying WebView!");
        zzaW();
        j2.f8993l.post(new zzcke(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzW() {
        zzbb();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzX(int i10) {
        if (i10 == 0) {
            zzbgs zzbgsVar = this.zzL;
            zzbgm.zza(zzbgsVar.zza(), this.zzJ, "aebb2");
        }
        zzbb();
        this.zzL.zza();
        this.zzL.zza().zzd("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.zzf.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzY() {
        if (this.zzI == null) {
            zzbgs zzbgsVar = this.zzL;
            zzbgm.zza(zzbgsVar.zza(), this.zzJ, "aes2");
            this.zzL.zza();
            zzbgr zzf = zzbgu.zzf();
            this.zzI = zzf;
            this.zzL.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzZ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final boolean zzaA(final boolean z10, final int i10) {
        destroy();
        this.zzW.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzckc
            @Override // com.google.android.gms.internal.ads.zzbbo
            public final void zza(zzbde zzbdeVar) {
                int i11 = zzckf.zza;
                zzbfj zza2 = zzbfk.zza();
                boolean zzc = zza2.zzc();
                boolean z11 = z10;
                if (zzc != z11) {
                    zza2.zza(z11);
                }
                zza2.zzb(i10);
                zzbdeVar.zzj((zzbfk) zza2.zzal());
            }
        });
        this.zzW.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized boolean zzaC() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final boolean zzaD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized boolean zzaE() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzckq
    public final void zzaF(g9.j jVar, boolean z10) {
        this.zzo.zzu(jVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzckq
    public final void zzaG(String str, String str2, int i10) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzckq
    public final void zzaH(boolean z10, int i10, boolean z11) {
        this.zzo.zzw(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzckq
    public final void zzaI(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzo.zzy(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzckq
    public final void zzaJ(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzo.zzz(z10, i10, str, z11, z12);
    }

    public final zzcjs zzaL() {
        return this.zzo;
    }

    final synchronized Boolean zzaM() {
        return this.zzx;
    }

    protected final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            zzcec.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaQ(String str) {
        if (!p.d()) {
            zzaS("javascript:".concat(str));
            return;
        }
        if (zzaM() == null) {
            zzbe();
        }
        if (zzaM().booleanValue()) {
            zzaP(str, null);
        } else {
            zzaS("javascript:".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaR(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    protected final synchronized void zzaS(String str) {
        if (zzaB()) {
            zzcec.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaT(Boolean bool) {
        synchronized (this) {
            this.zzx = bool;
        }
        t.q().zzx(bool);
    }

    public final boolean zzaU() {
        int i10;
        int i11;
        if (this.zzo.zzL() || this.zzo.zzM()) {
            x.b();
            DisplayMetrics displayMetrics = this.zzi;
            int zzv = zzcdv.zzv(displayMetrics, displayMetrics.widthPixels);
            x.b();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzv2 = zzcdv.zzv(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i10 = zzv;
                i11 = zzv2;
            } else {
                t.r();
                int[] p10 = j2.p(zza2);
                x.b();
                int zzv3 = zzcdv.zzv(this.zzi, p10[0]);
                x.b();
                i11 = zzcdv.zzv(this.zzi, p10[1]);
                i10 = zzv3;
            }
            int i12 = this.zzR;
            if (i12 != zzv || this.zzQ != zzv2 || this.zzS != i10 || this.zzT != i11) {
                boolean z10 = (i12 == zzv && this.zzQ == zzv2) ? false : true;
                this.zzR = zzv;
                this.zzQ = zzv2;
                this.zzS = i10;
                this.zzT = i11;
                new zzbvw(this, "").zzj(zzv, zzv2, i10, i11, this.zzi.density, this.zzV.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzaa(boolean z10) {
        this.zzo.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzab() {
        this.zzP.b();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzac(String str, String str2, String str3) {
        String str4;
        if (zzaB()) {
            zzcec.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) a0.c().zza(zzbgc.zzP);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e10) {
            zzcec.zzk("Unable to build MRAID_ENV", e10);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzckr.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzad() {
        if (this.zzK == null) {
            this.zzL.zza();
            zzbgr zzf = zzbgu.zzf();
            this.zzK = zzf;
            this.zzL.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzae(String str, zzbng zzbngVar) {
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null) {
            zzcjsVar.zzA(str, zzbngVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzaf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzag(u uVar) {
        this.zzp = uVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzah(zzcla zzclaVar) {
        this.zzr = zzclaVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzai(zzbad zzbadVar) {
        this.zzF = zzbadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzaj(boolean z10) {
        this.zzy = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzak() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzal(Context context) {
        this.zzb.setBaseContext(context);
        this.zzP.e(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzam(boolean z10) {
        u uVar = this.zzp;
        if (uVar != null) {
            uVar.m2(this.zzo.zzL(), z10);
        } else {
            this.zzt = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzan(zzbiy zzbiyVar) {
        this.zzE = zzbiyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzao(boolean z10) {
        boolean z11 = this.zzv;
        this.zzv = z10;
        zzaV();
        if (z10 != z11) {
            if (!((Boolean) a0.c().zza(zzbgc.zzQ)).booleanValue() || !this.zzr.zzi()) {
                new zzbvw(this, "").zzl(true != z10 ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzap(zzbja zzbjaVar) {
        this.zzD = zzbjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzaq(zzfod zzfodVar) {
        this.zzq = zzfodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzar(int i10) {
        u uVar = this.zzp;
        if (uVar != null) {
            uVar.f2(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzas(boolean z10) {
        this.zzX = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzat(u uVar) {
        this.zzN = uVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzau(boolean z10) {
        u uVar;
        int i10 = this.zzG + (true != z10 ? -1 : 1);
        this.zzG = i10;
        if (i10 > 0 || (uVar = this.zzp) == null) {
            return;
        }
        uVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized void zzav(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        u uVar = this.zzp;
        if (uVar != null) {
            uVar.zzB(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzaw(String str, zzbng zzbngVar) {
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null) {
            zzcjsVar.zzI(str, zzbngVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final void zzax(String str, q qVar) {
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null) {
            zzcjsVar.zzJ(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized boolean zzay() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk
    public final synchronized boolean zzaz() {
        return this.zzG > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str, String str2) {
        zzaQ(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null) {
            zzcjsVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.ads.internal.l
    public final synchronized void zzbp() {
        l lVar = this.zzg;
        if (lVar != null) {
            lVar.zzbp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.ads.internal.l
    public final synchronized void zzbq() {
        l lVar = this.zzg;
        if (lVar != null) {
            lVar.zzbq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final synchronized String zzbr() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzby(zzayp zzaypVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzaypVar.zzj;
            this.zzB = z10;
        }
        zzaY(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void zzd(String str, Map map) {
        try {
            zze(str, x.b().zzi(map));
        } catch (JSONException unused) {
            zzcec.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        zzcec.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        zzaQ(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final synchronized int zzf() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzckn, com.google.android.gms.internal.ads.zzcgl
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcgl
    public final com.google.android.gms.ads.internal.a zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final zzbgr zzk() {
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcgl
    public final zzbgs zzm() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcgl
    public final zzcei zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final zzcga zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final synchronized zzchw zzp(String str) {
        Map map = this.zzU;
        if (map == null) {
            return null;
        }
        return (zzchw) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcgl
    public final synchronized zzcki zzq() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final synchronized String zzr() {
        zzfgp zzfgpVar = this.zzl;
        if (zzfgpVar == null) {
            return null;
        }
        return zzfgpVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        zzcjs zzcjsVar = this.zzo;
        if (zzcjsVar != null) {
            zzcjsVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjk, com.google.android.gms.internal.ads.zzcgl
    public final synchronized void zzt(String str, zzchw zzchwVar) {
        if (this.zzU == null) {
            this.zzU = new HashMap();
        }
        this.zzU.put(str, zzchwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zzu() {
        u zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zzv(boolean z10, long j10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z10 ? "0" : "1");
        hashMap.put("duration", Long.toString(j10));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final synchronized void zzw() {
        zzbiy zzbiyVar = this.zzE;
        if (zzbiyVar != null) {
            final zzdra zzdraVar = (zzdra) zzbiyVar;
            j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqy
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdra.this.zzd();
                    } catch (RemoteException e10) {
                        zzcec.zzl("#007 Could not call remote method.", e10);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zzy(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zzz(boolean z10) {
        this.zzo.zzD(false);
    }
}
