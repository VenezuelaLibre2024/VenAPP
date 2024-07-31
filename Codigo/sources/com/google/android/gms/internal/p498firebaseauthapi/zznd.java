package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
public final class zznd extends zzbt {
    private final zzos zza;

    public zznd(zzos zzosVar, zzcs zzcsVar) {
        zza(zzosVar, zzcsVar);
        this.zza = zzosVar;
    }

    private static void zza(zzos zzosVar, zzcs zzcsVar) {
        int i10 = zzng.zza[zzosVar.zza().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zzcs.zza(zzcsVar);
        }
    }

    public final zzos zza(zzcs zzcsVar) {
        zza(this.zza, zzcsVar);
        return this.zza;
    }

    public final Integer zza() {
        return this.zza.zze();
    }
}
