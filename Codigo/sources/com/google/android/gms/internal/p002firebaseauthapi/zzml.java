package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzml<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    private zzml() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmi<E, O> zza() {
        return new zzmi<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }

    public final zzml<E, O> zza(E e10, O o10) {
        this.zza.put(e10, o10);
        this.zzb.put(o10, e10);
        return this;
    }
}
