package p121g9;

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
import com.google.android.gms.ads.internal.C4954j;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C5005j2;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
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

/* renamed from: g9.u */
/* loaded from: classes.dex */
public class BinderC7527u extends zzbws implements InterfaceC7510f {

    /* renamed from: H */
    static final int f17773H = Color.argb(0, 0, 0, 0);

    /* renamed from: A */
    private boolean f17774A;

    /* renamed from: B */
    private boolean f17775B;

    /* renamed from: F */
    private Toolbar f17779F;

    /* renamed from: a */
    protected final Activity f17781a;

    /* renamed from: b */
    AdOverlayInfoParcel f17782b;

    /* renamed from: c */
    zzcjk f17783c;

    /* renamed from: d */
    C7522p f17784d;

    /* renamed from: e */
    ViewOnClickListenerC7532z f17785e;

    /* renamed from: r */
    FrameLayout f17787r;

    /* renamed from: s */
    WebChromeClient.CustomViewCallback f17788s;

    /* renamed from: v */
    C7521o f17791v;

    /* renamed from: z */
    private Runnable f17795z;

    /* renamed from: f */
    boolean f17786f = false;

    /* renamed from: t */
    boolean f17789t = false;

    /* renamed from: u */
    boolean f17790u = false;

    /* renamed from: w */
    boolean f17792w = false;

    /* renamed from: G */
    int f17780G = 1;

    /* renamed from: x */
    private final Object f17793x = new Object();

    /* renamed from: y */
    private final View.OnClickListener f17794y = new ViewOnClickListenerC7519m(this);

    /* renamed from: C */
    private boolean f17776C = false;

    /* renamed from: D */
    private boolean f17777D = false;

    /* renamed from: E */
    private boolean f17778E = true;

    public BinderC7527u(Activity activity) {
        this.f17781a = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.C4784a0.m12365c().zza(com.google.android.gms.internal.ads.zzbgc.zzaF)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.C4784a0.m12365c().zza(com.google.android.gms.internal.ads.zzbgc.zzaE)).booleanValue() != false) goto L20;
     */
    /* renamed from: j2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m22856j2(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f17782b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.j r0 = r0.f9991z
            if (r0 == 0) goto L10
            boolean r0 = r0.f9956b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f17781a
            com.google.android.gms.ads.internal.util.c r4 = com.google.android.gms.ads.internal.C4965t.m12582s()
            boolean r6 = r4.mo12608d(r3, r6)
            boolean r3 = r5.f17790u
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzaF
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbfu r6 = com.google.android.gms.internal.ads.zzbgc.zzaE
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = r2
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f17782b
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.j r6 = r6.f9991z
            if (r6 == 0) goto L57
            boolean r6 = r6.f9961r
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f17781a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzbe
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()
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
        throw new UnsupportedOperationException("Method not decompiled: p121g9.BinderC7527u.m22856j2(android.content.res.Configuration):void");
    }

    /* renamed from: k2 */
    private static final void m22857k2(zzfod zzfodVar, View view) {
        if (zzfodVar == null || view == null) {
            return;
        }
        C4965t.m12564a().zzh(zzfodVar, view);
    }

    /* renamed from: f2 */
    public final void m22858f2(int i10) {
        if (this.f17781a.getApplicationInfo().targetSdkVersion >= ((Integer) C4784a0.m12365c().zza(zzbgc.zzfY)).intValue()) {
            if (this.f17781a.getApplicationInfo().targetSdkVersion <= ((Integer) C4784a0.m12365c().zza(zzbgc.zzfZ)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) C4784a0.m12365c().zza(zzbgc.zzga)).intValue()) {
                    if (i11 <= ((Integer) C4784a0.m12365c().zza(zzbgc.zzgb)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f17781a.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            C4965t.m12580q().zzv(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    /* renamed from: g2 */
    public final void m22859g2(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f17781a);
        this.f17787r = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f17787r.addView(view, -1, -1);
        this.f17781a.setContentView(this.f17787r);
        this.f17775B = true;
        this.f17788s = customViewCallback;
        this.f17786f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0048, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x005c, code lost:
    
        if (r26.f17781a.getResources().getConfiguration().orientation == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r26.f17781a.getResources().getConfiguration().orientation == 1) goto L23;
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
    /* renamed from: h2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m22860h2(boolean r27) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p121g9.BinderC7527u.m22860h2(boolean):void");
    }

    /* renamed from: i2 */
    public final void m22861i2(String str) {
        Toolbar toolbar = this.f17779F;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    /* renamed from: l2 */
    public final void m22862l2(zzehu zzehuVar) {
        zzbwm zzbwmVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel == null || (zzbwmVar = adOverlayInfoParcel.f9975G) == null) {
            throw new C7520n("noioou");
        }
        zzbwmVar.zzg(BinderC5314d.m13412h2(zzehuVar));
    }

    /* renamed from: m2 */
    public final void m22863m2(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C4954j c4954j;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C4954j c4954j2;
        boolean z12 = true;
        boolean z13 = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzaY)).booleanValue() && (adOverlayInfoParcel2 = this.f17782b) != null && (c4954j2 = adOverlayInfoParcel2.f9991z) != null && c4954j2.f9962s;
        boolean z14 = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzaZ)).booleanValue() && (adOverlayInfoParcel = this.f17782b) != null && (c4954j = adOverlayInfoParcel.f9991z) != null && c4954j.f9963t;
        if (z10 && z11 && z13 && !z14) {
            new zzbvw(this.f17783c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        ViewOnClickListenerC7532z viewOnClickListenerC7532z = this.f17785e;
        if (viewOnClickListenerC7532z != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            viewOnClickListenerC7532z.m22868b(z12);
        }
    }

    public final void zzB(boolean z10) {
        C7521o c7521o;
        int i10;
        if (z10) {
            c7521o = this.f17791v;
            i10 = 0;
        } else {
            c7521o = this.f17791v;
            i10 = -16777216;
        }
        c7521o.setBackgroundColor(i10);
    }

    public final void zzE() {
        synchronized (this.f17793x) {
            this.f17774A = true;
            Runnable runnable = this.f17795z;
            if (runnable != null) {
                zzftt zzfttVar = C5005j2.f10092l;
                zzfttVar.removeCallbacks(runnable);
                zzfttVar.post(this.f17795z);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        InterfaceC7529w interfaceC7529w;
        if (!this.f17781a.isFinishing() || this.f17776C) {
            return;
        }
        this.f17776C = true;
        zzcjk zzcjkVar = this.f17783c;
        if (zzcjkVar != null) {
            zzcjkVar.zzX(this.f17780G - 1);
            synchronized (this.f17793x) {
                if (!this.f17774A && this.f17783c.zzaz()) {
                    if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzeI)).booleanValue() && !this.f17777D && (adOverlayInfoParcel = this.f17782b) != null && (interfaceC7529w = adOverlayInfoParcel.f9979c) != null) {
                        interfaceC7529w.zzbz();
                    }
                    Runnable runnable = new Runnable() { // from class: g9.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            BinderC7527u.this.zzc();
                        }
                    };
                    this.f17795z = runnable;
                    C5005j2.f10092l.postDelayed(runnable, ((Long) C4784a0.m12365c().zza(zzbgc.zzaX)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzH() {
        this.f17780G = 1;
        if (this.f17783c == null) {
            return true;
        }
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zziN)).booleanValue() && this.f17783c.canGoBack()) {
            this.f17783c.goBack();
            return false;
        }
        boolean zzaE = this.f17783c.zzaE();
        if (!zzaE) {
            this.f17783c.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaE;
    }

    public final void zzb() {
        this.f17780G = 3;
        this.f17781a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f9987v != 5) {
            return;
        }
        this.f17781a.overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        zzcjk zzcjkVar;
        InterfaceC7529w interfaceC7529w;
        if (this.f17777D) {
            return;
        }
        this.f17777D = true;
        zzcjk zzcjkVar2 = this.f17783c;
        if (zzcjkVar2 != null) {
            this.f17791v.removeView(zzcjkVar2.zzF());
            C7522p c7522p = this.f17784d;
            if (c7522p != null) {
                this.f17783c.zzal(c7522p.f17769d);
                this.f17783c.zzao(false);
                ViewGroup viewGroup = this.f17784d.f17768c;
                View zzF = this.f17783c.zzF();
                C7522p c7522p2 = this.f17784d;
                viewGroup.addView(zzF, c7522p2.f17766a, c7522p2.f17767b);
                this.f17784d = null;
            } else if (this.f17781a.getApplicationContext() != null) {
                this.f17783c.zzal(this.f17781a.getApplicationContext());
            }
            this.f17783c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel != null && (interfaceC7529w = adOverlayInfoParcel.f9979c) != null) {
            interfaceC7529w.zzbD(this.f17780G);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f17782b;
        if (adOverlayInfoParcel2 == null || (zzcjkVar = adOverlayInfoParcel2.f9980d) == null) {
            return;
        }
        m22857k2(zzcjkVar.zzR(), this.f17782b.f9980d.zzF());
    }

    public final void zzd() {
        this.f17791v.f17765b = true;
    }

    protected final void zze() {
        this.f17783c.zzY();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel != null && this.f17786f) {
            m22858f2(adOverlayInfoParcel.f9986u);
        }
        if (this.f17787r != null) {
            this.f17781a.setContentView(this.f17791v);
            this.f17775B = true;
            this.f17787r.removeAllViews();
            this.f17787r = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f17788s;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f17788s = null;
        }
        this.f17786f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi() {
        this.f17780G = 1;
    }

    @Override // p121g9.InterfaceC7510f
    public final void zzj() {
        this.f17780G = 2;
        this.f17781a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(InterfaceC5312b interfaceC5312b) {
        m22856j2((Configuration) BinderC5314d.m13411g2(interfaceC5312b));
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
        throw new UnsupportedOperationException("Method not decompiled: p121g9.BinderC7527u.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm() {
        zzcjk zzcjkVar = this.f17783c;
        if (zzcjkVar != null) {
            try {
                this.f17791v.removeView(zzcjkVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f17792w) {
            this.f17792w = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo() {
        InterfaceC7529w interfaceC7529w;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel != null && (interfaceC7529w = adOverlayInfoParcel.f9979c) != null) {
            interfaceC7529w.zzbt();
        }
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzeK)).booleanValue() && this.f17783c != null && (!this.f17781a.isFinishing() || this.f17784d == null)) {
            this.f17783c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f17781a;
            zzeht zze = zzehu.zze();
            zze.zza(activity);
            zze.zzb(this.f17782b.f9987v == 5 ? this : null);
            try {
                this.f17782b.f9975G.zzf(strArr, iArr, BinderC5314d.m13412h2(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzr() {
        InterfaceC7529w interfaceC7529w;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel != null && (interfaceC7529w = adOverlayInfoParcel.f9979c) != null) {
            interfaceC7529w.zzbP();
        }
        m22856j2(this.f17781a.getResources().getConfiguration());
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzeK)).booleanValue()) {
            return;
        }
        zzcjk zzcjkVar = this.f17783c;
        if (zzcjkVar == null || zzcjkVar.zzaB()) {
            zzcec.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.f17783c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f17789t);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzt() {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzeK)).booleanValue()) {
            zzcjk zzcjkVar = this.f17783c;
            if (zzcjkVar == null || zzcjkVar.zzaB()) {
                zzcec.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f17783c.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzu() {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzeK)).booleanValue() && this.f17783c != null && (!this.f17781a.isFinishing() || this.f17784d == null)) {
            this.f17783c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzv() {
        InterfaceC7529w interfaceC7529w;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17782b;
        if (adOverlayInfoParcel == null || (interfaceC7529w = adOverlayInfoParcel.f9979c) == null) {
            return;
        }
        interfaceC7529w.zzbC();
    }

    public final void zzw(boolean z10) {
        if (this.f17782b.f9976H) {
            return;
        }
        int intValue = ((Integer) C4784a0.m12365c().zza(zzbgc.zzeN)).intValue();
        boolean z11 = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzba)).booleanValue() || z10;
        C7531y c7531y = new C7531y();
        c7531y.f17800d = 50;
        c7531y.f17797a = true != z11 ? 0 : intValue;
        c7531y.f17798b = true != z11 ? intValue : 0;
        c7531y.f17799c = intValue;
        this.f17785e = new ViewOnClickListenerC7532z(this.f17781a, c7531y, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        m22863m2(z10, this.f17782b.f9983r);
        this.f17791v.addView(this.f17785e, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzx() {
        this.f17775B = true;
    }

    public final void zzz() {
        this.f17791v.removeView(this.f17785e);
        zzw(true);
    }
}
