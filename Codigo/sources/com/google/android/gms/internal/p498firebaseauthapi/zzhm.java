package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhm extends zzdb {
    private final zza zza;

    /* loaded from: classes2.dex */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzhm(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzhm zza(zza zzaVar) {
        return new zzhm(zzaVar);
    }

    public static zzhm zzc() {
        return new zzhm(zza.zzc);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhm) && ((zzhm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzhm.class, this.zza});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + String.valueOf(this.zza) + ")";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza != zza.zzc;
    }

    public final zza zzb() {
        return this.zza;
    }
}
