package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.List;

/* loaded from: classes2.dex */
final class zzdoy implements zzgej {
    final /* synthetic */ zzdoz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdoy(zzdoz zzdozVar) {
        this.zza = zzdozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        if (((Boolean) a0.c().zza(zzbgc.zzfb)).booleanValue()) {
            t.q().zzw(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcjk zzcjkVar = (zzcjk) list.get(0);
            if (zzcjkVar != null) {
                this.zza.zzb(zzcjkVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) a0.c().zza(zzbgc.zzfb)).booleanValue()) {
                t.q().zzw(e10, "omid native display exp");
            }
        }
    }
}
