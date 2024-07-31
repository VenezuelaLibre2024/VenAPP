package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzcx implements Map, Serializable {
    private transient zzcy zza;
    private transient zzcy zzb;
    private transient zzcq zzc;

    public static zzcx zzc(Object obj, Object obj2) {
        zzcb.zzb("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzds.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzdv.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcy zzcyVar = this.zzb;
        if (zzcyVar != null) {
            return zzcyVar;
        }
        zzcy zze = zze();
        this.zzb = zze;
        return zze;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzcb.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    abstract zzcq zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzcq values() {
        zzcq zzcqVar = this.zzc;
        if (zzcqVar != null) {
            return zzcqVar;
        }
        zzcq zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzcy zzd();

    abstract zzcy zze();

    @Override // java.util.Map
    /* renamed from: zzf */
    public final zzcy entrySet() {
        zzcy zzcyVar = this.zza;
        if (zzcyVar != null) {
            return zzcyVar;
        }
        zzcy zzd = zzd();
        this.zza = zzd;
        return zzd;
    }
}
