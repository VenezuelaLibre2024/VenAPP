package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzpd extends RuntimeException {
    public zzpd(String str) {
        super(str);
    }

    public zzpd(String str, Throwable th2) {
        super(str, th2);
    }

    private zzpd(Throwable th2) {
        super(th2);
    }

    public static <T> T zza(zzpg<T> zzpgVar) {
        try {
            return zzpgVar.zza();
        } catch (Exception e10) {
            throw new zzpd(e10);
        }
    }
}
