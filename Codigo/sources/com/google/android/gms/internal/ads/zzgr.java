package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzgr extends zzgq {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzgr(byte[] bArr) {
        super(false);
        zzek.zzd(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.zza, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        this.zzb = zzhbVar.zza;
        zzi(zzhbVar);
        long j10 = zzhbVar.zzf;
        int length = this.zza.length;
        if (j10 > length) {
            throw new zzgx(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.zzc = i10;
        int i11 = length - i10;
        this.zzd = i11;
        long j11 = zzhbVar.zzg;
        if (j11 != -1) {
            this.zzd = (int) Math.min(i11, j11);
        }
        this.zze = true;
        zzj(zzhbVar);
        long j12 = zzhbVar.zzg;
        return j12 != -1 ? j12 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
