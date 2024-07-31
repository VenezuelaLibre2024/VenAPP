package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class zzdo extends zzds implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzdo(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(zzdl.zza("maxSize (%s) must >= 0", Integer.valueOf(i10)));
        }
        this.zzb = new ArrayDeque(i10);
        this.zza = i10;
    }

    public static zzdo zza(int i10) {
        return new zzdo(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzdq, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzdq, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i10 = size - this.zza;
            zzdi.zzb(i10 >= 0, "number to skip cannot be negative");
            it = new zzdu(collection, i10).iterator();
        } else {
            it = collection.iterator();
        }
        return zzdv.zza(this, it);
    }

    @Override // com.google.android.recaptcha.internal.zzds, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzdr
    protected final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzds, com.google.android.recaptcha.internal.zzdq
    protected final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzds
    protected final Queue zzd() {
        return this.zzb;
    }
}
