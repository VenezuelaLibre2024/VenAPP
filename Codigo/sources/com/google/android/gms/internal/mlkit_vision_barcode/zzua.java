package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.s;
import java.io.UnsupportedEncodingException;
import ld.d;

/* loaded from: classes2.dex */
public final class zzua implements zztm {
    private final zzpl zza;
    private zzsj zzb = new zzsj();
    private final int zzc;

    private zzua(zzpl zzplVar, int i10) {
        this.zza = zzplVar;
        zzuj.zza();
        this.zzc = i10;
    }

    public static zztm zzf(zzpl zzplVar) {
        return new zzua(zzplVar, 0);
    }

    public static zztm zzg(zzpl zzplVar, int i10) {
        return new zzua(zzplVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final zztm zzb(zzpk zzpkVar) {
        this.zza.zzf(zzpkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final zztm zzc(zzsj zzsjVar) {
        this.zzb = zzsjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final String zzd() {
        zzsl zzg = this.zza.zzk().zzg();
        return (zzg == null || zzbd.zzc(zzg.zzk())) ? "NA" : (String) s.j(zzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final byte[] zze(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzuj.zza();
            if (i10 == 0) {
                return new d().i(zznj.zza).j(true).h().b(this.zza.zzk()).getBytes("utf-8");
            }
            zzpn zzk = this.zza.zzk();
            zzfk zzfkVar = new zzfk();
            zznj.zza.configure(zzfkVar);
            return zzfkVar.zza().zza(zzk);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
