package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes2.dex */
final class zzqh {
    public static zzpg zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return zzpg.zza;
        }
        zzpe zzpeVar = new zzpe();
        zzpeVar.zza(true);
        zzpeVar.zzc(z10);
        return zzpeVar.zzd();
    }
}
