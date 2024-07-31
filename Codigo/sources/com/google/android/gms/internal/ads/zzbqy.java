package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqy implements zzcey {
    final /* synthetic */ zzbri zza;
    final /* synthetic */ zzfmo zzb;
    final /* synthetic */ zzbrj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqy(zzbrj zzbrjVar, zzbri zzbriVar, zzfmo zzfmoVar) {
        this.zza = zzbriVar;
        this.zzb = zzfmoVar;
        this.zzc = zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbri zzbriVar;
        zzfnc zzfncVar;
        zzfnc zzfncVar2;
        zzbri zzbriVar2;
        zzbri zzbriVar3;
        u1.a("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            u1.a("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbrj zzbrjVar = this.zzc;
            zzbriVar = zzbrjVar.zzh;
            if (zzbriVar != null) {
                zzbri zzbriVar4 = this.zza;
                zzbriVar2 = zzbrjVar.zzh;
                if (zzbriVar4 != zzbriVar2) {
                    u1.a("New JS engine is loaded, marking previous one as destroyable.");
                    zzbriVar3 = this.zzc.zzh;
                    zzbriVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbht.zzd.zze()).booleanValue()) {
                zzbrj zzbrjVar2 = this.zzc;
                zzfncVar = zzbrjVar2.zze;
                if (zzfncVar != null) {
                    zzfncVar2 = zzbrjVar2.zze;
                    zzfmo zzfmoVar = this.zzb;
                    zzfmoVar.zzf(true);
                    zzfncVar2.zzb(zzfmoVar.zzl());
                }
            }
        }
        u1.a("loadNewJavascriptEngine (success): Lock released");
    }
}
