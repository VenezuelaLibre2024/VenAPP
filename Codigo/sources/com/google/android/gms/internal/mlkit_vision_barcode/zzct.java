package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzct extends zzbg {
    private final zzcv zza;

    public zzct(zzcv zzcvVar, int i10) {
        super(zzcvVar.size(), i10);
        this.zza = zzcvVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
