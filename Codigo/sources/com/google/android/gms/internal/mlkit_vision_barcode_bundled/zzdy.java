package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public class zzdy extends zzdx implements zzfp {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzdy(zzdz zzdzVar) {
        super(zzdzVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdz zzk() {
        zzed zzk;
        if (((zzdz) this.zza).zzX()) {
            ((zzdz) this.zza).zza.zzg();
            zzk = super.zzk();
        } else {
            zzk = this.zza;
        }
        return (zzdz) zzk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx
    public final void zzn() {
        super.zzn();
        if (((zzdz) this.zza).zza != zzdt.zzd()) {
            zzdz zzdzVar = (zzdz) this.zza;
            zzdzVar.zza = zzdzVar.zza.clone();
        }
    }
}
