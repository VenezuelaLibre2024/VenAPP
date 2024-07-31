package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class zzgu extends zzgq {
    private zzhb zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgu() {
        super(false);
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
        byte[] bArr2 = this.zzb;
        int i13 = zzfy.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        zzi(zzhbVar);
        this.zza = zzhbVar;
        Uri normalizeScheme = zzhbVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzek.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = zzfy.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw zzcc.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw zzcc.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
            }
        } else {
            this.zzb = URLDecoder.decode(str, zzfwq.zza.name()).getBytes(zzfwq.zzc);
        }
        long j10 = zzhbVar.zzf;
        int length = this.zzb.length;
        if (j10 > length) {
            this.zzb = null;
            throw new zzgx(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i11 = (int) j10;
        this.zzc = i11;
        int i12 = length - i11;
        this.zzd = i12;
        long j11 = zzhbVar.zzg;
        if (j11 != -1) {
            this.zzd = (int) Math.min(i12, j11);
        }
        zzj(zzhbVar);
        long j12 = zzhbVar.zzg;
        return j12 != -1 ? j12 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        zzhb zzhbVar = this.zza;
        if (zzhbVar != null) {
            return zzhbVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
