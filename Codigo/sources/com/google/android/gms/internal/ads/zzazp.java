package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import la.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzazp extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzazg zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzazp() {
        zzazg zzazgVar = new zzazg();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazgVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbhs.zzd.zze()).intValue();
        this.zzg = ((Long) zzbhs.zza.zze()).intValue();
        this.zzh = ((Long) zzbhs.zze.zze()).intValue();
        this.zzi = ((Long) zzbhs.zzc.zze()).intValue();
        this.zzj = ((Integer) a0.c().zza(zzbgc.zzS)).intValue();
        this.zzk = ((Integer) a0.c().zza(zzbgc.zzT)).intValue();
        this.zzl = ((Integer) a0.c().zza(zzbgc.zzU)).intValue();
        this.zze = ((Long) zzbhs.zzf.zze()).intValue();
        this.zzm = (String) a0.c().zza(zzbgc.zzW);
        this.zzn = ((Boolean) a0.c().zza(zzbgc.zzX)).booleanValue();
        this.zzo = ((Boolean) a0.c().zza(zzbgc.zzY)).booleanValue();
        this.zzp = ((Boolean) a0.c().zza(zzbgc.zzZ)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.t.q().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
    
        if (r3.importance != 100) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0052, code lost:
    
        if (r0 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.t.d().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0062, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zze("ContentFetchThread: no activity. Sleeping.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008f, code lost:
    
        com.google.android.gms.ads.internal.t.q().zzw(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzcec.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:10:0x00da->B:17:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.zzazk r0 = com.google.android.gms.ads.internal.t.d()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzazk r0 = com.google.android.gms.ads.internal.t.d()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            android.app.Activity r0 = r0.zza()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzcec.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L69:
            r6.zzf()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcdl r2 = com.google.android.gms.ads.internal.t.q()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zzw(r0, r3)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzcec.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L9d:
            if (r1 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzazl r0 = new com.google.android.gms.internal.ads.zzazl     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r1.post(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcdl r1 = com.google.android.gms.ads.internal.t.q()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.zzw(r0, r2)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzcec.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto L69
        Lb8:
            int r0 = r6.zze     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Ld7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzcec.zzh(r1, r0)
            java.lang.String r1 = "ContentFetchTask.run"
            com.google.android.gms.internal.ads.zzcdl r2 = com.google.android.gms.ads.internal.t.q()
            r2.zzw(r0, r1)
            goto Ld7
        Ld1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzcec.zzh(r1, r0)
        Ld7:
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
        Lda:
            boolean r1 = r6.zzb     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le9
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzcec.zze(r1)     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            java.lang.Object r1 = r6.zzc     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            r1.wait()     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            goto Lda
        Le9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            goto L0
        Lec:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazp.run():void");
    }

    public final zzazf zza() {
        return this.zzd.zza(this.zzp);
    }

    final zzazo zzb(View view, zzazf zzazfVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazfVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazo(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcjk)) {
                WebView webView = (WebView) view;
                if (p.d()) {
                    zzazfVar.zzh();
                    webView.post(new zzazn(this, zzazfVar, webView, globalVisibleRect));
                    return new zzazo(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    zzazo zzb = zzb(viewGroup.getChildAt(i12), zzazfVar);
                    i10 += zzb.zza;
                    i11 += zzb.zzb;
                }
                return new zzazo(this, i10, i11);
            }
        }
        return new zzazo(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r11 == 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzazf r9 = new com.google.android.gms.internal.ads.zzazf     // Catch: java.lang.Exception -> L7e
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L7e
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L7e
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L7e
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L7e
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L7e
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L7e
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L7e
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L7e
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzazk r0 = com.google.android.gms.ads.internal.t.d()     // Catch: java.lang.Exception -> L7e
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L7e
            if (r1 != 0) goto L52
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zzV     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L7e
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L77
        L52:
            com.google.android.gms.internal.ads.zzazo r11 = r10.zzb(r11, r9)     // Catch: java.lang.Exception -> L7e
            r9.zzm()     // Catch: java.lang.Exception -> L7e
            int r0 = r11.zza     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L61
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L77
        L61:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L6c
            int r11 = r9.zzc()     // Catch: java.lang.Exception -> L7e
            if (r11 == 0) goto L77
            goto L6e
        L6c:
            if (r11 != 0) goto L78
        L6e:
            com.google.android.gms.internal.ads.zzazg r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            boolean r11 = r11.zzd(r9)     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L77
            goto L78
        L77:
            return
        L78:
            com.google.android.gms.internal.ads.zzazg r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            r11.zzb(r9)     // Catch: java.lang.Exception -> L7e
            return
        L7e:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r11)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzcdl r1 = com.google.android.gms.ads.internal.t.q()
            r1.zzw(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazp.zzc(android.view.View):void");
    }

    public final void zzd(zzazf zzazfVar, WebView webView, String str, boolean z10) {
        zzazfVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazfVar.zzl(optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzazfVar.zzl(webView.getTitle() + "\n" + optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzazfVar.zzo()) {
                this.zzd.zzc(zzazfVar);
            }
        } catch (JSONException unused) {
            zzcec.zze("Json string may be malformed.");
        } catch (Throwable th2) {
            zzcec.zzf("Failed to get webview content.", th2);
            t.q().zzw(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzcec.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzcec.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzcec.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
