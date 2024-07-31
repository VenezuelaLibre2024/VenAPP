package com.google.android.gms.internal.p498firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzar<E> extends zzaj<E> {
    private final zzap<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(zzap<E> zzapVar, int i10) {
        super(zzapVar.size(), i10);
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaj
    protected final E zza(int i10) {
        return this.zza.get(i10);
    }
}
