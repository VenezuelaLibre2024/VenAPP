package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzch implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzcl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzch(zzcl zzclVar, zzcg zzcgVar) {
        int i10;
        this.zze = zzclVar;
        i10 = zzclVar.zzf;
        this.zzb = i10;
        this.zzc = zzclVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i10;
        i10 = this.zze.zzf;
        if (i10 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object zza = zza(i10);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzbc.zze(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzcl zzclVar = this.zze;
        int i10 = this.zzd;
        Object[] objArr = zzclVar.zzb;
        objArr.getClass();
        zzclVar.remove(objArr[i10]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i10);
}
