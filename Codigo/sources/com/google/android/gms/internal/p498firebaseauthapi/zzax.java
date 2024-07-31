package com.google.android.gms.internal.p498firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax<E> extends zzap<E> {
    static final zzap<Object> zza = new zzax(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final E get(int i10) {
        zzy.zza(i10, this.zzc);
        E e10 = (E) this.zzb[i10];
        e10.getClass();
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzak
    final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzap, com.google.android.gms.internal.p498firebaseauthapi.zzak
    final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
        return i10 + this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzak
    public final int zzb() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzak
    public final boolean zze() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzb;
    }
}
