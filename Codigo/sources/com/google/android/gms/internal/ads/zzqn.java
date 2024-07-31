package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes2.dex */
final class zzqn {
    public static void zza(AudioTrack audioTrack, zzqp zzqpVar) {
        audioTrack.setPreferredDevice(zzqpVar == null ? null : zzqpVar.zza);
    }
}
