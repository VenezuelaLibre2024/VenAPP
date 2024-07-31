package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.s;
import java.io.UnsupportedEncodingException;
import ld.d;

/* loaded from: classes2.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i10) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzc = this.zza.zzf().zzc();
        return (zzc == null || zzg.zzb(zzc.zzk())) ? "NA" : (String) s.j(zzc.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            if (i10 == 0) {
                return new d().i(zzhe.zza).j(true).h().b(this.zza.zzf()).getBytes("utf-8");
            }
            zziy zzf = this.zza.zzf();
            zzam zzamVar = new zzam();
            zzhe.zza.configure(zzamVar);
            return zzamVar.zza().zza(zzf);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
