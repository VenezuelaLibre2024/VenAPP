package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgpz extends zzgra {
    private final int zza;
    private final int zzb;
    private final zzgpx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgpz(int i10, int i11, zzgpx zzgpxVar, zzgpy zzgpyVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgpxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpz)) {
            return false;
        }
        zzgpz zzgpzVar = (zzgpz) obj;
        return zzgpzVar.zza == this.zza && zzgpzVar.zzd() == zzd() && zzgpzVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgpz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggq
    public final boolean zza() {
        return this.zzc != zzgpx.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgpx zzgpxVar = this.zzc;
        if (zzgpxVar == zzgpx.zzd) {
            return this.zzb;
        }
        if (zzgpxVar == zzgpx.zza || zzgpxVar == zzgpx.zzb || zzgpxVar == zzgpx.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpx zze() {
        return this.zzc;
    }
}
