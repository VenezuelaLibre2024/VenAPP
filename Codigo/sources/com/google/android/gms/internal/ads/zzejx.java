package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
final class zzejx extends zzbuf {
    final /* synthetic */ zzejy zza;
    private final zzeiq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzejx(zzejy zzejyVar, zzeiq zzeiqVar, zzejw zzejwVar) {
        this.zza = zzejyVar;
        this.zzb = zzeiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze(String str) {
        ((zzekj) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf(c3 c3Var) {
        ((zzekj) this.zzb.zzc).zzh(c3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(com.google.android.gms.dynamic.b bVar) {
        zzejy.zze(this.zza, (View) com.google.android.gms.dynamic.d.g2(bVar));
        ((zzekj) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh(zzbte zzbteVar) {
        zzejy.zzd(this.zza, zzbteVar);
        ((zzekj) this.zzb.zzc).zzo();
    }
}
