package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgpl extends RuntimeException {
    public zzgpl(String str) {
        super(str);
    }

    public zzgpl(String str, Throwable th2) {
        super(str, th2);
    }

    public zzgpl(Throwable th2) {
        super(th2);
    }

    public static Object zza(zzgpk zzgpkVar) {
        try {
            return zzgpkVar.zza();
        } catch (Exception e10) {
            throw new zzgpl(e10);
        }
    }
}
