package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzk implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzk(zzbzm zzbzmVar, Context context) {
        this.zza = context;
        this.zzb = zzbzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        WeakHashMap weakHashMap;
        zzbzj zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbzl zzbzlVar = (zzbzl) weakHashMap.get(this.zza);
        if (zzbzlVar != null) {
            if (zzbzlVar.zza + ((Long) zzbhq.zza.zze()).longValue() >= t.b().a()) {
                zza = new zzbzi(this.zza, zzbzlVar.zzb).zza();
                zzbzm zzbzmVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbzmVar.zza;
                weakHashMap2.put(context, new zzbzl(zzbzmVar, zza));
                return zza;
            }
        }
        zza = new zzbzi(this.zza).zza();
        zzbzm zzbzmVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbzmVar2.zza;
        weakHashMap2.put(context2, new zzbzl(zzbzmVar2, zza));
        return zza;
    }
}
