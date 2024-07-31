package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaio {
    static final zzaio zza = new zzaio(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private final Map<zzair, zzajc.zzd<?, ?>> zzd;

    zzaio() {
        this.zzd = new HashMap();
    }

    private zzaio(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public static zzaio zza() {
        return zza;
    }

    public final <ContainingType extends zzakn> zzajc.zzd<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzajc.zzd) this.zzd.get(new zzair(containingtype, i10));
    }
}
