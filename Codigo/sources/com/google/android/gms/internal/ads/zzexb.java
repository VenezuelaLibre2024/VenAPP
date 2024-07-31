package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzexb implements zzexq {
    private final zzcch zza;
    private final zzgey zzb;
    private final Context zzc;

    public zzexb(zzcch zzcchVar, zzgey zzgeyVar, Context context) {
        this.zza = zzcchVar;
        this.zzb = zzgeyVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexb.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzexc zzc() {
        if (!this.zza.zzp(this.zzc)) {
            return new zzexc(null, null, null, null, null);
        }
        String zzd = this.zza.zzd(this.zzc);
        String str = zzd == null ? "" : zzd;
        String zzb = this.zza.zzb(this.zzc);
        String str2 = zzb == null ? "" : zzb;
        String zza = this.zza.zza(this.zzc);
        String str3 = zza == null ? "" : zza;
        String str4 = true != this.zza.zzp(this.zzc) ? null : "fa";
        return new zzexc(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) a0.c().zza(zzbgc.zzaf) : null);
    }
}
