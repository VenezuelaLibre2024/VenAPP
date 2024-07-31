package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzfzh extends zzfyu {
    final /* synthetic */ zzfzj zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzh(zzfzj zzfzjVar, int i10) {
        this.zza = zzfzjVar;
        this.zzb = zzfzj.zzg(zzfzjVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int zzw;
        int i10 = this.zzc;
        if (i10 == -1 || i10 >= this.zza.size() || !zzfwy.zza(this.zzb, zzfzj.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyu, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyu, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzfzj.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfzj zzfzjVar = this.zza;
        Object zzj = zzfzj.zzj(zzfzjVar, i10);
        zzfzj.zzn(zzfzjVar, this.zzc, obj);
        return zzj;
    }
}
