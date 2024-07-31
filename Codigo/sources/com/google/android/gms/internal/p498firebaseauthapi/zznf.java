package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zznf extends zzch {
    private final zzor zza;

    public zznf(zzor zzorVar) {
        this.zza = zzorVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznf)) {
            return false;
        }
        zzor zzorVar = ((zznf) obj).zza;
        return this.zza.zza().zzd().equals(zzorVar.zza().zzd()) && this.zza.zza().zzf().equals(zzorVar.zza().zzf()) && this.zza.zza().zze().equals(zzorVar.zza().zze());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza.zza(), this.zza.zzb()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zzni.zza[this.zza.zza().zzd().ordinal()];
        objArr[1] = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza.zza().zzd() != zzvs.RAW;
    }

    public final zzor zzb() {
        return this.zza;
    }
}
