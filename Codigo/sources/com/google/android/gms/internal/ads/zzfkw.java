package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfkw {
    public static final zzfld zza(Callable callable, Object obj, zzfle zzfleVar) {
        zzgey zzgeyVar;
        zzgeyVar = zzfleVar.zzb;
        return zzb(callable, zzgeyVar, obj, zzfleVar);
    }

    public static final zzfld zzb(Callable callable, zzgey zzgeyVar, Object obj, zzfle zzfleVar) {
        com.google.common.util.concurrent.f fVar;
        fVar = zzfle.zza;
        return new zzfld(zzfleVar, obj, fVar, Collections.emptyList(), zzgeyVar.zzb(callable));
    }

    public static final zzfld zzc(com.google.common.util.concurrent.f fVar, Object obj, zzfle zzfleVar) {
        com.google.common.util.concurrent.f fVar2;
        fVar2 = zzfle.zza;
        return new zzfld(zzfleVar, obj, fVar2, Collections.emptyList(), fVar);
    }

    public static final zzfld zzd(final zzfkq zzfkqVar, zzgey zzgeyVar, Object obj, zzfle zzfleVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfkv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfkq.this.zza();
                return null;
            }
        }, zzgeyVar, obj, zzfleVar);
    }
}
