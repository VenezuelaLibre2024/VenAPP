package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes2.dex */
final class zzqi {
    public static zzpg zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzpg.zza;
        }
        zzpe zzpeVar = new zzpe();
        boolean z11 = false;
        if (zzfy.zza > 32 && playbackOffloadSupport == 2) {
            z11 = true;
        }
        zzpeVar.zza(true);
        zzpeVar.zzb(z11);
        zzpeVar.zzc(z10);
        return zzpeVar.zzd();
    }
}
