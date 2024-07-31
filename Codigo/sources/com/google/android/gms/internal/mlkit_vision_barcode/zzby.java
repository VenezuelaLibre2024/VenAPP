package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzby implements zzdj {
    private transient Collection zza;
    private transient Set zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdj) {
            return zzv().equals(((zzdj) obj).zzv());
        }
        return false;
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final String toString() {
        return zzv().toString();
    }

    abstract Collection zzi();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Iterator zzl();

    abstract Map zzo();

    abstract Set zzp();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public boolean zzt(Object obj, Object obj2) {
        throw null;
    }

    public final Collection zzu() {
        Collection collection = this.zza;
        if (collection != null) {
            return collection;
        }
        Collection zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final Map zzv() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzo = zzo();
        this.zzc = zzo;
        return zzo;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final Set zzw() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set zzp = zzp();
        this.zzb = zzp;
        return zzp;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzx(Object obj, Object obj2) {
        Collection collection = ((zzbl) zzv()).get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzy(Object obj, Object obj2) {
        Collection collection = ((zzbl) zzv()).get(obj);
        return collection != null && collection.remove(obj2);
    }
}
