package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzajm<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzajn> zza;

    private zzajm(Map.Entry<K, zzajn> entry) {
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzajn.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzakn) {
            return this.zza.getValue().zza((zzakn) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzajn zza() {
        return this.zza.getValue();
    }
}
