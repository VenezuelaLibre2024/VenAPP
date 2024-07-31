package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfqx extends zzfqt {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfqx(String str, boolean z10, boolean z11, zzfqw zzfqwVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqt) {
            zzfqt zzfqtVar = (zzfqt) obj;
            if (this.zza.equals(zzfqtVar.zzb()) && this.zzb == zzfqtVar.zzd() && this.zzc == zzfqtVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true == this.zzc ? 1231 : 1237);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final boolean zzd() {
        return this.zzb;
    }
}
