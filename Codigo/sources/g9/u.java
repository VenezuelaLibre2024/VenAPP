package g9;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzeht;
import com.google.android.gms.internal.ads.zzehu;
import com.google.android.gms.internal.ads.zzfod;
import com.google.android.gms.internal.ads.zzftt;
import java.util.Collections;

/* loaded from: classes.dex */
public class u extends zzbws implements f {
    static final int H = Color.argb(0, 0, 0, 0);
    private boolean A;
    private boolean B;
    private Toolbar F;

    /* renamed from: a */
    protected final Activity f16144a;

    /* renamed from: b */
    AdOverlayInfoParcel f16145b;

    /* renamed from: c */
    zzcjk f16146c;

    /* renamed from: d */
    p f16147d;

    /* renamed from: e */
    z f16148e;

    /* renamed from: r */
    FrameLayout f16150r;

    /* renamed from: s */
    WebChromeClient.CustomViewCallback f16151s;

    /* renamed from: v */
    o f16154v;

    /* renamed from: z */
    private Runnable f16158z;

    /* renamed from: f */
    boolean f16149f = false;

    /* renamed from: t */
    boolean f16152t = false;

    /* renamed from: u */
    boolean f16153u = false;

    /* renamed from: w */
    boolean f16155w = false;
    int G = 1;

    /* renamed from: x */
    private final Object f16156x = new Object();

    /* renamed from: y */
    private final View.OnClickListener f16157y = new m(this);
    private boolean C = false;
    private boolean D = false;
    private boolean E = true;

    public u(Activity activity) {
        this.f16144a = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzaF)).booleanValue() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzaE)).booleanValue() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j2(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f16145b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.j r0 = r0.f8896z
            if (r0 == 0) goto L10
            boolean r0 = r0.f8869b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f16144a
            com.google.android.gms.ads.internal.util.c r4 = com.google.android.gms.ads.internal.t.s()
            boolean r6 = r4.d(r3, r6)
            boolean r3 = r5.f16153u
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzaF
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbfu r6 = com.google.android.gms.internal.ads.zzbgc.zzaE
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = r2
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f16145b
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.j r6 = r6.f8896z
            if (r6 == 0) goto L57
            boolean r6 = r6.f8874r
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f16144a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzbe
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.u.j2(android.content.res.Configuration):void");
    }

    private static final void k2(zzfod zzfodVar, View view) {
        if (zzfodVar == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.t.a().zzh(zzfodVar, view);
    }

    public final void f2(int i10) {
        if (this.f16144a.getApplicationInfo().targetSdkVersion >= ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzfY)).intValue()) {
            if (this.f16144a.getApplicationInfo().targetSdkVersion <= ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzfZ)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzga)).intValue()) {
                    if (i11 <= ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzgb)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f16144a.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.t.q().zzv(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void g2(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f16144a);
        this.f16150r = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f16150r.addView(view, -1, -1);
        this.f16144a.setContentView(this.f16150r);
        this.B = true;
        this.f16151s = customViewCallback;
        this.f16149f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0048, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x005c, code lost:
    
        if (r26.f16144a.getResources().getConfiguration().orientation == 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r26.f16144a.getResources().getConfiguration().orientation == 1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void h2(boolean r27) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.u.h2(boolean):void");
    }

    public final void i2(String str) {
        Toolbar toolbar = this.F;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void l2(zzehu zzehuVar) {
        zzbwm zzbwmVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel == null || (zzbwmVar = adOverlayInfoParcel.G) == null) {
            throw new n("noioou");
        }
        zzbwmVar.zzg(com.google.android.gms.dynamic.d.h2(zzehuVar));
    }

    public final void m2(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.j jVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzaY)).booleanValue() && (adOverlayInfoParcel2 = this.f16145b) != null && (jVar2 = adOverlayInfoParcel2.f8896z) != null && jVar2.f8875s;
        boolean z14 = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzaZ)).booleanValue() && (adOverlayInfoParcel = this.f16145b) != null && (jVar = adOverlayInfoParcel.f8896z) != null && jVar.f8876t;
        if (z10 && z11 && z13 && !z14) {
            new zzbvw(this.f16146c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        z zVar = this.f16148e;
        if (zVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zVar.b(z12);
        }
    }

    public final void zzB(boolean z10) {
        o oVar;
        int i10;
        if (z10) {
            oVar = this.f16154v;
            i10 = 0;
        } else {
            oVar = this.f16154v;
            i10 = -16777216;
        }
        oVar.setBackgroundColor(i10);
    }

    public final void zzE() {
        synchronized (this.f16156x) {
            this.A = true;
            Runnable runnable = this.f16158z;
            if (runnable != null) {
                zzftt zzfttVar = j2.f8993l;
                zzfttVar.removeCallbacks(runnable);
                zzfttVar.post(this.f16158z);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        w wVar;
        if (!this.f16144a.isFinishing() || this.C) {
            return;
        }
        this.C = true;
        zzcjk zzcjkVar = this.f16146c;
        if (zzcjkVar != null) {
            zzcjkVar.zzX(this.G - 1);
            synchronized (this.f16156x) {
                if (!this.A && this.f16146c.zzaz()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeI)).booleanValue() && !this.D && (adOverlayInfoParcel = this.f16145b) != null && (wVar = adOverlayInfoParcel.f8884c) != null) {
                        wVar.zzbz();
                    }
                    k kVar = new Runnable() { // from class: g9.k
                        public /* synthetic */ k() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            u.this.zzc();
                        }
                    };
                    this.f16158z = kVar;
                    j2.f8993l.postDelayed(kVar, ((Long) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzaX)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzH() {
        this.G = 1;
        if (this.f16146c == null) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zziN)).booleanValue() && this.f16146c.canGoBack()) {
            this.f16146c.goBack();
            return false;
        }
        boolean zzaE = this.f16146c.zzaE();
        if (!zzaE) {
            this.f16146c.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaE;
    }

    public final void zzb() {
        this.G = 3;
        this.f16144a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f8892v != 5) {
            return;
        }
        this.f16144a.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        zzcjk zzcjkVar;
        w wVar;
        if (this.D) {
            return;
        }
        this.D = true;
        zzcjk zzcjkVar2 = this.f16146c;
        if (zzcjkVar2 != null) {
            this.f16154v.removeView(zzcjkVar2.zzF());
            p pVar = this.f16147d;
            if (pVar != null) {
                this.f16146c.zzal(pVar.f16140d);
                this.f16146c.zzao(false);
                ViewGroup viewGroup = this.f16147d.f16139c;
                View zzF = this.f16146c.zzF();
                p pVar2 = this.f16147d;
                viewGroup.addView(zzF, pVar2.f16137a, pVar2.f16138b);
                this.f16147d = null;
            } else if (this.f16144a.getApplicationContext() != null) {
                this.f16146c.zzal(this.f16144a.getApplicationContext());
            }
            this.f16146c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel != null && (wVar = adOverlayInfoParcel.f8884c) != null) {
            wVar.zzbD(this.G);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f16145b;
        if (adOverlayInfoParcel2 == null || (zzcjkVar = adOverlayInfoParcel2.f8885d) == null) {
            return;
        }
        k2(zzcjkVar.zzR(), this.f16145b.f8885d.zzF());
    }

    public final void zzd() {
        this.f16154v.f16136b = true;
    }

    protected final void zze() {
        this.f16146c.zzY();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel != null && this.f16149f) {
            f2(adOverlayInfoParcel.f8891u);
        }
        if (this.f16150r != null) {
            this.f16144a.setContentView(this.f16154v);
            this.B = true;
            this.f16150r.removeAllViews();
            this.f16150r = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f16151s;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f16151s = null;
        }
        this.f16149f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi() {
        this.G = 1;
    }

    @Override // g9.f
    public final void zzj() {
        this.G = 2;
        this.f16144a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(com.google.android.gms.dynamic.b bVar) {
        j2((Configuration) com.google.android.gms.dynamic.d.g2(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: n -> 0x0116, TryCatch #0 {n -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[Catch: n -> 0x0116, TryCatch #0 {n -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.u.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm() {
        zzcjk zzcjkVar = this.f16146c;
        if (zzcjkVar != null) {
            try {
                this.f16154v.removeView(zzcjkVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f16155w) {
            this.f16155w = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo() {
        w wVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel != null && (wVar = adOverlayInfoParcel.f8884c) != null) {
            wVar.zzbt();
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeK)).booleanValue() && this.f16146c != null && (!this.f16144a.isFinishing() || this.f16147d == null)) {
            this.f16146c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f16144a;
            zzeht zze = zzehu.zze();
            zze.zza(activity);
            zze.zzb(this.f16145b.f8892v == 5 ? this : null);
            try {
                this.f16145b.G.zzf(strArr, iArr, com.google.android.gms.dynamic.d.h2(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzr() {
        w wVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel != null && (wVar = adOverlayInfoParcel.f8884c) != null) {
            wVar.zzbP();
        }
        j2(this.f16144a.getResources().getConfiguration());
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeK)).booleanValue()) {
            return;
        }
        zzcjk zzcjkVar = this.f16146c;
        if (zzcjkVar == null || zzcjkVar.zzaB()) {
            zzcec.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.f16146c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f16152t);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzt() {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeK)).booleanValue()) {
            zzcjk zzcjkVar = this.f16146c;
            if (zzcjkVar == null || zzcjkVar.zzaB()) {
                zzcec.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f16146c.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeK)).booleanValue() && this.f16146c != null && (!this.f16144a.isFinishing() || this.f16147d == null)) {
            this.f16146c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzv() {
        w wVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16145b;
        if (adOverlayInfoParcel == null || (wVar = adOverlayInfoParcel.f8884c) == null) {
            return;
        }
        wVar.zzbC();
    }

    public final void zzw(boolean z10) {
        if (this.f16145b.H) {
            return;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeN)).intValue();
        boolean z11 = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzba)).booleanValue() || z10;
        y yVar = new y();
        yVar.f16163d = 50;
        yVar.f16160a = true != z11 ? 0 : intValue;
        yVar.f16161b = true != z11 ? intValue : 0;
        yVar.f16162c = intValue;
        this.f16148e = new z(this.f16144a, yVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        m2(z10, this.f16145b.f8888r);
        this.f16154v.addView(this.f16148e, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzx() {
        this.B = true;
    }

    public final void zzz() {
        this.f16154v.removeView(this.f16148e);
        zzw(true);
    }
}
