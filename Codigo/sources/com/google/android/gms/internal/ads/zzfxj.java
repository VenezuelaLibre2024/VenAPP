package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxj extends zzfwz {
    private final Object zza;

    public zzfxj(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxj) {
            return this.zza.equals(((zzfxj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final zzfwz zza(zzfws zzfwsVar) {
        Object apply = zzfwsVar.apply(this.zza);
        zzfxe.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfxj(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
