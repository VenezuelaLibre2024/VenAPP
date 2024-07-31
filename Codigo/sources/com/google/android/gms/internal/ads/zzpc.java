package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpc {
    public static int zza(int i10, int i11, zzk zzkVar) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            int zzg = zzfy.zzg(i12);
            if (zzg != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzg).build(), zzkVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
        }
        return 0;
    }

    public static zzgaa<Integer> zzb(zzk zzkVar) {
        zzgad zzgadVar;
        boolean isDirectPlaybackSupported;
        zzfzx zzfzxVar = new zzfzx();
        zzgadVar = zzpd.zzc;
        zzgce it = zzgadVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzfy.zza >= zzfy.zzf(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzkVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    zzfzxVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzfzxVar.zzf((Object) 2);
        return zzfzxVar.zzi();
    }
}
