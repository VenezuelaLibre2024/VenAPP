package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn extends zzh {
    private final zzp zza;

    public zzn(zzp zzpVar, int i10) {
        super(zzpVar.size(), i10);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzh
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
