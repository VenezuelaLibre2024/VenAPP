package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzbs extends zzbq implements ListIterator {
    final /* synthetic */ zzbt zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbs(zzbt zzbtVar) {
        super(zzbtVar);
        this.zzd = zzbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbs(zzbt zzbtVar, int i10) {
        super(zzbtVar, ((List) zzbtVar.zzb).listIterator(i10));
        this.zzd = zzbtVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzbu zzbuVar = this.zzd.zzf;
        i10 = zzbuVar.zzb;
        zzbuVar.zzb = i10 + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }
}
