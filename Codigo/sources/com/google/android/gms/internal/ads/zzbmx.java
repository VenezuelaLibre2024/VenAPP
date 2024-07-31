package com.google.android.gms.internal.ads;

import g9.u;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbmx implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        if (zzcjkVar.zzJ() != null) {
            zzcjkVar.zzJ().zza();
        }
        u zzL = zzcjkVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        u zzM = zzcjkVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzcec.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
