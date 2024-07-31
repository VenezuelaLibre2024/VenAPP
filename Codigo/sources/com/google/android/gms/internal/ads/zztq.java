package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztq implements zzss {
    private final MediaCodec zza;

    public zztq(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzd(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zze(int i10, int i11, zzie zzieVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzieVar.zza(), j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzh() {
    }
}
