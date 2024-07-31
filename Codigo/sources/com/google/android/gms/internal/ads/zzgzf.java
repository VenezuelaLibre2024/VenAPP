package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgzf {
    static final zzgzf zza = new zzgzf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgzf zzd;
    private final Map zze;

    zzgzf() {
        this.zze = new HashMap();
    }

    zzgzf(boolean z10) {
        this.zze = Collections.emptyMap();
    }

    public static zzgzf zza() {
        return zza;
    }

    public static zzgzf zzb() {
        zzgzf zzgzfVar = zzd;
        if (zzgzfVar != null) {
            return zzgzfVar;
        }
        synchronized (zzgzf.class) {
            zzgzf zzgzfVar2 = zzd;
            if (zzgzfVar2 != null) {
                return zzgzfVar2;
            }
            zzgzf zzb2 = zzgzn.zzb(zzgzf.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgzs zzc(zzhbe zzhbeVar, int i10) {
        return (zzgzs) this.zze.get(new zzgze(zzhbeVar, i10));
    }
}
