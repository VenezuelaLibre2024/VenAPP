package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
final class zzang {
    private final zzaea zza;
    private final zzgn zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzanf zzi = new zzanf(null);
    private final zzanf zzj = new zzanf(null);

    public zzang(zzaea zzaeaVar, boolean z10, boolean z11) {
        this.zza = zzaeaVar;
        byte[] bArr = new byte[RecognitionOptions.ITF];
        this.zze = bArr;
        this.zzd = new zzgn(bArr, 0, 0);
        this.zzk = false;
    }

    private final void zzg(int i10) {
        long j10 = this.zzm;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.zzn;
        long j11 = this.zzg - this.zzl;
        this.zza.zzt(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void zza(long j10) {
        this.zzg = j10;
        zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzgk zzgkVar) {
        this.zzc.append(zzgkVar.zza, zzgkVar);
    }

    public final void zzc(zzgl zzglVar) {
        this.zzb.append(zzglVar.zzd, zzglVar);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long j10, int i10, long j11, boolean z10) {
        this.zzf = i10;
        this.zzh = j11;
        this.zzg = j10;
        this.zzo = z10;
    }

    public final boolean zzf(long j10, int i10, boolean z10) {
        boolean z11 = false;
        if (this.zzf == 9) {
            if (z10 && this.zzk) {
                zzg(i10 + ((int) (j10 - this.zzg)));
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z12 = this.zzo;
        boolean z13 = this.zzn;
        int i11 = this.zzf;
        if (i11 == 5 || (z12 && i11 == 1)) {
            z11 = true;
        }
        boolean z14 = z13 | z11;
        this.zzn = z14;
        return z14;
    }
}
