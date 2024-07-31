package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgob {
    private static final zzgob zza = new zzgob();
    private final AtomicReference zzb = new AtomicReference(new zzgow(new zzgos(null), null));

    zzgob() {
    }

    public static zzgob zza() {
        return zza;
    }

    public final Class zzb(Class cls) {
        return ((zzgow) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzggc zzggcVar, Class cls) {
        return ((zzgow) this.zzb.get()).zzb(zzggcVar, cls);
    }

    public final Object zzd(zzggx zzggxVar, Class cls) {
        return ((zzgow) this.zzb.get()).zzc(zzggxVar, cls);
    }

    public final synchronized void zze(zzgoq zzgoqVar) {
        zzgos zzgosVar = new zzgos((zzgow) this.zzb.get(), null);
        zzgosVar.zza(zzgoqVar);
        this.zzb.set(new zzgow(zzgosVar, null));
    }

    public final synchronized void zzf(zzggy zzggyVar) {
        zzgos zzgosVar = new zzgos((zzgow) this.zzb.get(), null);
        zzgosVar.zzb(zzggyVar);
        this.zzb.set(new zzgow(zzgosVar, null));
    }
}
