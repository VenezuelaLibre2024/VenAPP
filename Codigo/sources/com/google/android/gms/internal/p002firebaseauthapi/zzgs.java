package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgs extends zzdb {
    private final String zza;
    private final zzb zzb;
    private final zzdb zzc;

    /* loaded from: classes2.dex */
    public static class zza {
        private String zza;
        private zzb zzb;
        private zzdb zzc;

        private zza() {
        }

        public final zza zza(zzdb zzdbVar) {
            this.zzc = zzdbVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zza zza(String str) {
            this.zza = str;
            return this;
        }

        public final zzgs zza() {
            if (this.zza == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            zzdb zzdbVar = this.zzc;
            if (zzdbVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (zzdbVar.zza()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
            }
            zzb zzbVar = this.zzb;
            zzdb zzdbVar2 = this.zzc;
            boolean z10 = true;
            if ((!zzbVar.equals(zzb.zza) || !(zzdbVar2 instanceof zzes)) && ((!zzbVar.equals(zzb.zzc) || !(zzdbVar2 instanceof zzfv)) && ((!zzbVar.equals(zzb.zzb) || !(zzdbVar2 instanceof zzhm)) && ((!zzbVar.equals(zzb.zzd) || !(zzdbVar2 instanceof zzdl)) && ((!zzbVar.equals(zzb.zze) || !(zzdbVar2 instanceof zzed)) && (!zzbVar.equals(zzb.zzf) || !(zzdbVar2 instanceof zzfj))))))) {
                z10 = false;
            }
            if (z10) {
                return new zzgs(this.zza, this.zzb, this.zzc);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzb.toString() + " when new keys are picked according to " + String.valueOf(this.zzc) + ".");
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("ASSUME_AES_GCM");
        public static final zzb zzb = new zzb("ASSUME_XCHACHA20POLY1305");
        public static final zzb zzc = new zzb("ASSUME_CHACHA20POLY1305");
        public static final zzb zzd = new zzb("ASSUME_AES_CTR_HMAC");
        public static final zzb zze = new zzb("ASSUME_AES_EAX");
        public static final zzb zzf = new zzb("ASSUME_AES_GCM_SIV");
        private final String zzg;

        private zzb(String str) {
            this.zzg = str;
        }

        public final String toString() {
            return this.zzg;
        }
    }

    private zzgs(String str, zzb zzbVar, zzdb zzdbVar) {
        this.zza = str;
        this.zzb = zzbVar;
        this.zzc = zzdbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgs)) {
            return false;
        }
        zzgs zzgsVar = (zzgs) obj;
        return zzgsVar.zzb.equals(this.zzb) && zzgsVar.zzc.equals(this.zzc) && zzgsVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgs.class, this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zza + ", dekParsingStrategy: " + String.valueOf(this.zzb) + ", dekParametersForNewKeys: " + String.valueOf(this.zzc) + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return false;
    }

    public final zzdb zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
