package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfzy extends zzfya {
    private final zzgaa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzy(zzgaa zzgaaVar, int i10) {
        super(zzgaaVar.size(), i10);
        this.zza = zzgaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
