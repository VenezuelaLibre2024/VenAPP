package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes2.dex */
public final class zzms {
    private static zzmr zza;

    public static synchronized zzmj zza(zzme zzmeVar) {
        zzmj zzmjVar;
        synchronized (zzms.class) {
            if (zza == null) {
                zza = new zzmr(null);
            }
            zzmjVar = (zzmj) zza.get(zzmeVar);
        }
        return zzmjVar;
    }

    public static synchronized zzmj zzb(String str) {
        zzmj zza2;
        synchronized (zzms.class) {
            zza2 = zza(zzme.zzd("vision-common").zzd());
        }
        return zza2;
    }
}
