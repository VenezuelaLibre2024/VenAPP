package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcsd implements zzgej {
    final /* synthetic */ zzfny zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcse zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsd(zzcse zzcseVar, zzfny zzfnyVar, String str) {
        this.zza = zzfnyVar;
        this.zzb = str;
        this.zzc = zzcseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(final Throwable th2) {
        zzgey zzgeyVar;
        zzgeyVar = this.zzc.zzg;
        final zzfny zzfnyVar = this.zza;
        final String str = this.zzb;
        zzgeyVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsb
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                zzbxy zzbxyVar;
                Context context2;
                boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzjT)).booleanValue();
                zzcsd zzcsdVar = zzcsd.this;
                Throwable th3 = th2;
                if (booleanValue) {
                    zzcse zzcseVar = zzcsdVar.zzc;
                    context2 = zzcseVar.zzc;
                    zzcseVar.zzb = zzbxw.zzc(context2);
                    zzbxyVar = zzcsdVar.zzc.zzb;
                } else {
                    zzcse zzcseVar2 = zzcsdVar.zzc;
                    context = zzcseVar2.zzc;
                    zzcseVar2.zza = zzbxw.zza(context);
                    zzbxyVar = zzcsdVar.zzc.zza;
                }
                zzbxyVar.zzg(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                zzfnyVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgey zzgeyVar;
        zzcse zzcseVar = this.zzc;
        final zzfny zzfnyVar = this.zza;
        final String str = (String) obj;
        zzgeyVar = zzcseVar.zzg;
        zzgeyVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsc
            @Override // java.lang.Runnable
            public final void run() {
                zzfny.this.zzc(str, null);
            }
        });
    }
}
