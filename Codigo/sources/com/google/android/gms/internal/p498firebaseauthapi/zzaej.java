package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
final class zzaej extends zzafy {
    private String zza;
    private String zzb;
    private String zzc;
    private zzaey zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzafy
    public final zzafy zza(zzaey zzaeyVar) {
        if (zzaeyVar == null) {
            throw new NullPointerException("Null tokenType");
        }
        this.zzd = zzaeyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzafy
    public final zzafy zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzafy
    public final zzafz zza() {
        String str;
        zzaey zzaeyVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzaeyVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzaeg(str3, this.zzb, str, zzaeyVar, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" providerId");
        }
        if (this.zzc == null) {
            sb2.append(" token");
        }
        if (this.zzd == null) {
            sb2.append(" tokenType");
        }
        if (this.zze == null) {
            sb2.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb2));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzafy
    public final zzafy zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzafy
    public final zzafy zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzafy
    public final zzafy zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }
}
