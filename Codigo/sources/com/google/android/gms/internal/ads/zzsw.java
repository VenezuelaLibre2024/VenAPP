package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
final class zzsw {
    public static void zza(zzsp zzspVar, zzpb zzpbVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzpbVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = zzspVar.zzb;
        stringId = zza.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
