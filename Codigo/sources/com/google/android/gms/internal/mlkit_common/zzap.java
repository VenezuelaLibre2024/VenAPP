package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzap extends zzah {
    private final zzar zza;

    public zzap(zzar zzarVar, int i10) {
        super(zzarVar.size(), i10);
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzah
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
