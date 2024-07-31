package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdmu implements zzgej {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdmv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmu(zzdmv zzdmvVar, View view) {
        this.zza = view;
        this.zzb = zzdmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        if (((Boolean) a0.c().zza(zzbgc.zzfb)).booleanValue()) {
            t.q().zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzac(this.zza, (zzfod) obj);
    }
}
