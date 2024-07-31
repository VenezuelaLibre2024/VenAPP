package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqz implements zzcew {
    final /* synthetic */ zzbri zza;
    final /* synthetic */ zzfmo zzb;
    final /* synthetic */ zzbrj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqz(zzbrj zzbrjVar, zzbri zzbriVar, zzfmo zzfmoVar) {
        this.zza = zzbriVar;
        this.zzb = zzfmoVar;
        this.zzc = zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcew
    public final void zza() {
        Object obj;
        zzfnc zzfncVar;
        zzfnc zzfncVar2;
        u1.a("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            u1.a("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            u1.a("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbht.zzd.zze()).booleanValue()) {
                zzbrj zzbrjVar = this.zzc;
                zzfncVar = zzbrjVar.zze;
                if (zzfncVar != null) {
                    zzfncVar2 = zzbrjVar.zze;
                    zzfmo zzfmoVar = this.zzb;
                    zzfmoVar.zzc("Failed loading new engine");
                    zzfmoVar.zzf(false);
                    zzfncVar2.zzb(zzfmoVar.zzl());
                }
            }
        }
        u1.a("loadNewJavascriptEngine (failure): Lock released");
    }
}
