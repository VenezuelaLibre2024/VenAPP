package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzkt {
    private static final zzkr zza = zzc();
    private static final zzkr zzb = new zzku();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkr zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkr zzb() {
        return zzb;
    }

    private static zzkr zzc() {
        try {
            return (zzkr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
