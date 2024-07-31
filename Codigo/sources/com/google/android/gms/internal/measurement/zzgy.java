package com.google.android.gms.internal.measurement;

import eb.o;

/* loaded from: classes2.dex */
public final class zzgy {
    private final boolean zza;

    public zzgy(zzhb zzhbVar) {
        o.p(zzhbVar, "BuildInfo must be non-null");
        this.zza = !zzhbVar.zza();
    }

    public final boolean zza(String str) {
        o.p(str, "flagName must not be null");
        if (this.zza) {
            return zzha.zza.get().d(str);
        }
        return true;
    }
}
