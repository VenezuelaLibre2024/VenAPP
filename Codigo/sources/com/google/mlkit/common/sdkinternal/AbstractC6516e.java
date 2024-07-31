package com.google.mlkit.common.sdkinternal;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.mlkit.common.sdkinternal.e */
/* loaded from: classes2.dex */
public abstract class AbstractC6516e<K, V> {
    private final Map zza = new HashMap();

    protected abstract V create(K k10);

    public V get(K k10) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k10)) {
                return (V) this.zza.get(k10);
            }
            V create = create(k10);
            this.zza.put(k10, create);
            return create;
        }
    }
}
