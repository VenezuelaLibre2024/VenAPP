package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqx implements Runnable {
    final /* synthetic */ zzbri zza;
    final /* synthetic */ zzbqe zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbrj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqx(zzbrj zzbrjVar, zzbri zzbriVar, zzbqe zzbqeVar, ArrayList arrayList, long j10) {
        this.zza = zzbriVar;
        this.zzb = zzbqeVar;
        this.zzc = arrayList;
        this.zzd = j10;
        this.zze = zzbrjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i10;
        String str;
        u1.a("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.zze.zza;
        synchronized (obj) {
            u1.a("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzgey zzgeyVar = zzcep.zze;
                final zzbqe zzbqeVar = this.zzb;
                Objects.requireNonNull(zzbqeVar);
                zzgeyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbqe.this.zzc();
                    }
                });
                String valueOf = String.valueOf(a0.c().zza(zzbgc.zzd));
                int zze = this.zza.zze();
                i10 = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.zzc.get(0));
                }
                u1.a("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (t.b().a() - this.zzd) + " ms at timeout. Rejecting.");
                u1.a("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            u1.a("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
