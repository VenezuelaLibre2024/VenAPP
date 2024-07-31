package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzqs {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdq zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzqs(zzam zzamVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzdq zzdqVar, boolean z10, boolean z11, boolean z12) {
        this.zza = zzamVar;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzdqVar;
    }

    public final AudioTrack zza(zzk zzkVar, int i10) {
        AudioTrack audioTrack;
        AudioTrack.Builder offloadedPlayback;
        try {
            if (zzfy.zza >= 29) {
                offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(zzkVar.zza().zza).setAudioFormat(zzfy.zzv(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i10).setOffloadedPlayback(this.zzc == 1);
                audioTrack = offloadedPlayback.build();
            } else {
                audioTrack = new AudioTrack(zzkVar.zza().zza, zzfy.zzv(this.zze, this.zzf, this.zzg), this.zzh, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpx(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzpx(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e10);
        }
    }

    public final zzpv zzb() {
        boolean z10 = this.zzc == 1;
        return new zzpv(this.zzg, this.zze, this.zzf, false, z10, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
