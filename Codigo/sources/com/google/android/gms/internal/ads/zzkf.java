package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkf {
    public static zzpb zza(Context context, zzko zzkoVar, boolean z10) {
        LogSessionId logSessionId;
        zzox zzb = zzox.zzb(context);
        if (zzb == null) {
            zzff.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzpb(logSessionId);
        }
        if (z10) {
            zzkoVar.zzz(zzb);
        }
        return new zzpb(zzb.zza());
    }
}
