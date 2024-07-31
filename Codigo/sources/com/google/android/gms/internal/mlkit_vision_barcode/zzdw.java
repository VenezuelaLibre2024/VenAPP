package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class zzdw implements Iterator {
    final Iterator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdw(Iterator it) {
        it.getClass();
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    abstract Object zza(Object obj);
}
