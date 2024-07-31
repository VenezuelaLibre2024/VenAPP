package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzfyv extends AbstractCollection {
    final /* synthetic */ zzfyw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyv(zzfyw zzfywVar) {
        this.zza = zzfywVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.zza.zzs().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zze();
    }
}
