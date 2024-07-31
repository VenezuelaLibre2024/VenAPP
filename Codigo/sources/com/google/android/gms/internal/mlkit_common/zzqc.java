package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.s;
import java.io.UnsupportedEncodingException;
import ld.d;

/* loaded from: classes2.dex */
public final class zzqc implements zzpq {
    private final zzlo zza;
    private zzol zzb = new zzol();

    private zzqc(zzlo zzloVar, int i10) {
        this.zza = zzloVar;
        zzqn.zza();
    }

    public static zzpq zzf(zzlo zzloVar) {
        return new zzqc(zzloVar, 0);
    }

    public static zzpq zzg() {
        return new zzqc(new zzlo(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpq
    public final zzpq zza(zzln zzlnVar) {
        this.zza.zzf(zzlnVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpq
    public final zzpq zzb(zzlu zzluVar) {
        this.zza.zzi(zzluVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpq
    public final zzpq zzc(zzol zzolVar) {
        this.zzb = zzolVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpq
    public final String zzd() {
        zzon zzf = this.zza.zzk().zzf();
        return (zzf == null || zzag.zzc(zzf.zzk())) ? "NA" : (String) s.j(zzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpq
    public final byte[] zze(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzqn.zza();
            if (i10 == 0) {
                return new d().i(zzjn.zza).j(true).h().b(this.zza.zzk()).getBytes("utf-8");
            }
            zzlq zzk = this.zza.zzk();
            zzbs zzbsVar = new zzbs();
            zzjn.zza.configure(zzbsVar);
            return zzbsVar.zza().zza(zzk);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
