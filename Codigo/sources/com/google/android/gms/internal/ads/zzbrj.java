package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.f0;
import com.google.android.gms.ads.internal.util.f1;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzbrj {
    private final Context zzb;
    private final String zzc;
    private final zzcei zzd;
    private final zzfnc zze;
    private final f0 zzf;
    private final f0 zzg;
    private zzbri zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbrj(Context context, zzcei zzceiVar, String str, f0 f0Var, f0 f0Var2, zzfnc zzfncVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzceiVar;
        this.zze = zzfncVar;
        this.zzf = f0Var;
        this.zzg = f0Var2;
    }

    public final zzbrd zzb(zzavi zzaviVar) {
        u1.a("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("getEngine: Lock acquired");
            u1.a("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                u1.a("refreshIfDestroyed: Lock acquired");
                zzbri zzbriVar = this.zzh;
                if (zzbriVar != null && this.zzi == 0) {
                    zzbriVar.zzi(new zzcey() { // from class: com.google.android.gms.internal.ads.zzbqp
                        public /* synthetic */ zzbqp() {
                        }

                        @Override // com.google.android.gms.internal.ads.zzcey
                        public final void zza(Object obj) {
                            zzbrj.this.zzk((zzbqe) obj);
                        }
                    }, zzbqq.zza);
                }
            }
            u1.a("refreshIfDestroyed: Lock released");
            zzbri zzbriVar2 = this.zzh;
            if (zzbriVar2 != null && zzbriVar2.zze() != -1) {
                int i10 = this.zzi;
                if (i10 == 0) {
                    u1.a("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                if (i10 != 1) {
                    u1.a("getEngine (UPDATING): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                zzd(null);
                u1.a("getEngine (PENDING_UPDATE): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            u1.a("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    public final zzbri zzd(zzavi zzaviVar) {
        zzfmo zza = zzfmn.zza(this.zzb, 6);
        zza.zzh();
        zzbri zzbriVar = new zzbri(this.zzg);
        u1.a("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzcep.zze.execute(new Runnable(null, zzbriVar) { // from class: com.google.android.gms.internal.ads.zzbqt
            public final /* synthetic */ zzbri zzb;

            public /* synthetic */ zzbqt(zzavi zzaviVar2, zzbri zzbriVar2) {
                this.zzb = zzbriVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbrj.this.zzj(null, this.zzb);
            }
        });
        u1.a("loadNewJavascriptEngine: Promise created");
        zzbriVar2.zzi(new zzbqy(this, zzbriVar2, zza), new zzbqz(this, zzbriVar2, zza));
        return zzbriVar2;
    }

    public final /* synthetic */ void zzi(zzbri zzbriVar, zzbqe zzbqeVar, ArrayList arrayList, long j10) {
        u1.a("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbriVar.zze() != -1 && zzbriVar.zze() != 1) {
                zzbriVar.zzg();
                zzgey zzgeyVar = zzcep.zze;
                Objects.requireNonNull(zzbqeVar);
                zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqr
                    public /* synthetic */ zzbqr() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbqe.this.zzc();
                    }
                });
                u1.a("Could not receive /jsLoaded in " + String.valueOf(a0.c().zza(zzbgc.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbriVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (t.b().a() - j10) + " ms. Rejecting.");
                u1.a("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            u1.a("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    public final /* synthetic */ void zzj(zzavi zzaviVar, zzbri zzbriVar) {
        String str;
        long a10 = t.b().a();
        ArrayList arrayList = new ArrayList();
        try {
            u1.a("loadJavascriptEngine > Before createJavascriptEngine");
            zzbqm zzbqmVar = new zzbqm(this.zzb, this.zzd, null, null);
            u1.a("loadJavascriptEngine > After createJavascriptEngine");
            u1.a("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbqmVar.zzk(new zzbqs(this, arrayList, a10, zzbriVar, zzbqmVar));
            u1.a("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbqmVar.zzq("/jsLoaded", new zzbqu(this, a10, zzbriVar, zzbqmVar));
            f1 f1Var = new f1();
            zzbqv zzbqvVar = new zzbqv(this, null, zzbqmVar, f1Var);
            f1Var.b(zzbqvVar);
            u1.a("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbqmVar.zzq("/requestReload", zzbqvVar);
            u1.a("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                u1.a("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbqmVar.zzh(this.zzc);
                str = "loadJavascriptEngine > After newEngine.loadJavascript";
            } else if (this.zzc.startsWith("<html>")) {
                u1.a("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbqmVar.zzf(this.zzc);
                str = "loadJavascriptEngine > After newEngine.loadHtml";
            } else {
                u1.a("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbqmVar.zzg(this.zzc);
                str = "loadJavascriptEngine > After newEngine.loadHtmlWrapper";
            }
            u1.a(str);
            u1.a("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            j2.f8993l.postDelayed(new zzbqx(this, zzbriVar, zzbqmVar, arrayList, a10), ((Integer) a0.c().zza(zzbgc.zzd)).intValue());
        } catch (Throwable th2) {
            zzcec.zzh("Error creating webview.", th2);
            t.q().zzw(th2, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbriVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzbqe zzbqeVar) {
        if (zzbqeVar.zzi()) {
            this.zzi = 1;
        }
    }
}
