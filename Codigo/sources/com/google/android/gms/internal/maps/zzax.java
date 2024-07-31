package com.google.android.gms.internal.maps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax extends zzau {
    private final zzaz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzaz zzazVar, int i10) {
        super(zzazVar.size(), i10);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
