package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzas<K, V> {
    zzav zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public zzas() {
        this(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(int i10) {
        this.zzb = new Object[i10 * 2];
        this.zzc = 0;
        this.zzd = false;
    }

    private final void zza(int i10) {
        int i11 = i10 << 1;
        Object[] objArr = this.zzb;
        if (i11 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzam.zza(objArr.length, i11));
            this.zzd = false;
        }
    }

    public final zzas<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzai.zza(key, value);
            Object[] objArr = this.zzb;
            int i10 = this.zzc;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.zzc = i10 + 1;
        }
        return this;
    }

    public final zzat<K, V> zza() {
        zzav zzavVar = this.zza;
        if (zzavVar != null) {
            throw zzavVar.zza();
        }
        int i10 = this.zzc;
        Object[] objArr = this.zzb;
        this.zzd = true;
        zzaw zza = zzaw.zza(i10, objArr, this);
        zzav zzavVar2 = this.zza;
        if (zzavVar2 == null) {
            return zza;
        }
        throw zzavVar2.zza();
    }
}
