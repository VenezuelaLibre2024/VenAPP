package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzau<E> extends zzak<E> implements Set<E> {
    private transient zzap<E> zza;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzbd.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbd.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public zzap<E> zzc() {
        zzap<E> zzapVar = this.zza;
        if (zzapVar != null) {
            return zzapVar;
        }
        zzap<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    zzap<E> zzg() {
        return zzap.zza(toArray());
    }
}
