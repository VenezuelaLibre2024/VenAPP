package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzfzf implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfzj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfzf(zzfzj zzfzjVar, zzfze zzfzeVar) {
        int i10;
        this.zze = zzfzjVar;
        i10 = zzfzjVar.zzf;
        this.zzb = i10;
        this.zzc = zzfzjVar.zze();
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
        zzfxe.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzfzj zzfzjVar = this.zze;
        zzfzjVar.remove(zzfzj.zzg(zzfzjVar, i10));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i10);
}
