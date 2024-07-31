package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfux extends zzfvp {
    private final int zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfux(int i10, String str, zzfuw zzfuwVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvp) {
            zzfvp zzfvpVar = (zzfvp) obj;
            if (this.zza == zzfvpVar.zza()) {
                String str = this.zzb;
                String zzb = zzfvpVar.zzb();
                if (str != null ? str.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final String zzb() {
        return this.zzb;
    }
}
