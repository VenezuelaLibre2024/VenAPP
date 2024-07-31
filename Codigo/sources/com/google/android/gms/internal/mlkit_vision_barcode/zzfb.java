package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes2.dex */
final class zzfb implements zzfg {
    private final int zza;
    private final zzff zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfb(int i10, zzff zzffVar) {
        this.zza = i10;
        this.zzb = zzffVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzfg.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        return this.zza == zzfgVar.zza() && this.zzb.equals(zzfgVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final zzff zzb() {
        return this.zzb;
    }
}
