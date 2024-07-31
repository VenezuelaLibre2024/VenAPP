package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzex extends zzeu {
    final /* synthetic */ zzey zza;
    private final zzup zzb;

    public zzex(zzey zzeyVar, zzup zzupVar) {
        this.zza = zzeyVar;
        this.zzb = zzupVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    final /* bridge */ /* synthetic */ Object zza() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    final void zzc(Throwable th2) {
        this.zza.zzl(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    final /* synthetic */ void zzd(Object obj) {
        this.zza.zzm(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    final boolean zzf() {
        return this.zza.isDone();
    }
}
