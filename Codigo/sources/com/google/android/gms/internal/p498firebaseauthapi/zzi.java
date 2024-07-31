package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzi<T> implements Iterator<T> {
    private int zza = zzh.zzb;
    private T zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        int i11 = zzh.zzd;
        if (!(i10 != i11)) {
            throw new IllegalStateException();
        }
        int i12 = i10 - 1;
        if (i12 == 0) {
            return true;
        }
        if (i12 != 2) {
            this.zza = i11;
            this.zzb = zza();
            if (this.zza != zzh.zzc) {
                this.zza = zzh.zza;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = zzh.zzb;
        T t10 = this.zzb;
        this.zzb = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract T zza();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T zzb() {
        this.zza = zzh.zzc;
        return null;
    }
}
