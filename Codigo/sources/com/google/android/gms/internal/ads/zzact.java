package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;

/* loaded from: classes2.dex */
public final class zzact implements zzaea {
    private final byte[] zza = new byte[RecognitionOptions.AZTEC];

    @Override // com.google.android.gms.internal.ads.zzaea
    public final /* synthetic */ int zzf(zzu zzuVar, int i10, boolean z10) {
        return zzady.zza(this, zzuVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final int zzg(zzu zzuVar, int i10, boolean z10, int i11) {
        int zza = zzuVar.zza(this.zza, 0, Math.min(RecognitionOptions.AZTEC, i10));
        if (zza != -1) {
            return zza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzl(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final /* synthetic */ void zzr(zzfp zzfpVar, int i10) {
        zzady.zzb(this, zzfpVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzs(zzfp zzfpVar, int i10, int i11) {
        zzfpVar.zzL(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzt(long j10, int i10, int i11, int i12, zzadz zzadzVar) {
    }
}
