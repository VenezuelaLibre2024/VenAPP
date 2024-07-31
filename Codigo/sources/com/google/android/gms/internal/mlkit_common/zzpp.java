package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.l;

/* loaded from: classes2.dex */
final class zzpp extends zzqb {
    private final zzlm zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final l zze;
    private final zzls zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpp(zzlm zzlmVar, String str, boolean z10, boolean z11, l lVar, zzls zzlsVar, int i10, zzpo zzpoVar) {
        this.zza = zzlmVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = lVar;
        this.zzf = zzlsVar;
        this.zzg = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzqb) {
            zzqb zzqbVar = (zzqb) obj;
            if (this.zza.equals(zzqbVar.zzc()) && this.zzb.equals(zzqbVar.zze()) && this.zzc == zzqbVar.zzg() && this.zzd == zzqbVar.zzf() && this.zze.equals(zzqbVar.zzb()) && this.zzf.equals(zzqbVar.zzd()) && this.zzg == zzqbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        return (((((((((hashCode * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true == this.zzd ? 1231 : 1237)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        return "RemoteModelLoggingOptions{errorCode=" + this.zza.toString() + ", tfliteSchemaVersion=" + this.zzb + ", shouldLogRoughDownloadTime=" + this.zzc + ", shouldLogExactDownloadTime=" + this.zzd + ", modelType=" + this.zze.toString() + ", downloadStatus=" + this.zzf.toString() + ", failureStatusCode=" + this.zzg + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final l zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final zzlm zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final zzls zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqb
    public final boolean zzg() {
        return this.zzc;
    }
}
