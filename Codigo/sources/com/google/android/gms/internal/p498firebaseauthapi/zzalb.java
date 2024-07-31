package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzalb {
    private static final zzalb zza = new zzalb();
    private final ConcurrentMap<Class<?>, zzalf<?>> zzc = new ConcurrentHashMap();
    private final zzale zzb = new zzakb();

    private zzalb() {
    }

    public static zzalb zza() {
        return zza;
    }

    public final <T> zzalf<T> zza(Class<T> cls) {
        zzajf.zza(cls, "messageType");
        zzalf<T> zzalfVar = (zzalf) this.zzc.get(cls);
        if (zzalfVar != null) {
            return zzalfVar;
        }
        zzalf<T> zza2 = this.zzb.zza(cls);
        zzajf.zza(cls, "messageType");
        zzajf.zza(zza2, "schema");
        zzalf<T> zzalfVar2 = (zzalf) this.zzc.putIfAbsent(cls, zza2);
        return zzalfVar2 != null ? zzalfVar2 : zza2;
    }

    public final <T> zzalf<T> zza(T t10) {
        return zza((Class) t10.getClass());
    }
}
