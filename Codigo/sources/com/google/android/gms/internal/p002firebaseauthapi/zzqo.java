package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzqo {
    private static final String zza = new zzqg().zze();

    @Deprecated
    private static final zzvt zzb;

    @Deprecated
    private static final zzvt zzc;

    @Deprecated
    private static final zzvt zzd;

    static {
        zzvt zzb2 = zzvt.zzb();
        zzb = zzb2;
        zzc = zzb2;
        zzd = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzqt.zzc();
        zzpy.zzc();
        zzqg.zza(true);
        if (zzif.zzb()) {
            return;
        }
        zzpl.zza(true);
    }
}
