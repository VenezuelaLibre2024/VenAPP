package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbms implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        try {
            zzfue.zzj(zzcjkVar.getContext()).zzk();
            zzfuf.zzi(zzcjkVar.getContext()).zzj();
        } catch (IOException e10) {
            t.q().zzw(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
