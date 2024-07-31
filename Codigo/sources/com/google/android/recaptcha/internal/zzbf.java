package com.google.android.recaptcha.internal;

import dk.z;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbf implements zzbi {
    private final zzdo zza;

    public zzbf() {
        this(1);
    }

    public zzbf(int i10) {
        this.zza = zzdo.zza(i10);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        List f02;
        f02 = z.f0(this.zza);
        return f02;
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }
}
