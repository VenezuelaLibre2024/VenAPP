package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzge implements Iterator {
    private final ArrayDeque zza;
    private zzcx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzge(zzdb zzdbVar, zzgd zzgdVar) {
        zzcx zzcxVar;
        zzdb zzdbVar2;
        if (zzdbVar instanceof zzgg) {
            zzgg zzggVar = (zzgg) zzdbVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzggVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzggVar);
            zzdbVar2 = zzggVar.zzd;
            zzcxVar = zzb(zzdbVar2);
        } else {
            this.zza = null;
            zzcxVar = (zzcx) zzdbVar;
        }
        this.zzb = zzcxVar;
    }

    private final zzcx zzb(zzdb zzdbVar) {
        while (zzdbVar instanceof zzgg) {
            zzgg zzggVar = (zzgg) zzdbVar;
            this.zza.push(zzggVar);
            zzdbVar = zzggVar.zzd;
        }
        return (zzcx) zzdbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcx next() {
        zzcx zzcxVar;
        zzdb zzdbVar;
        zzcx zzcxVar2 = this.zzb;
        if (zzcxVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzcxVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzdbVar = ((zzgg) this.zza.pop()).zze;
            zzcxVar = zzb(zzdbVar);
        } while (zzcxVar.zzd() == 0);
        this.zzb = zzcxVar;
        return zzcxVar2;
    }
}
