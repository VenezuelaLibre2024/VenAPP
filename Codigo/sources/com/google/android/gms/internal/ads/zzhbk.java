package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbk {
    private static final zzhbj zza;
    private static final zzhbj zzb;

    static {
        zzhbj zzhbjVar;
        try {
            zzhbjVar = (zzhbj) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhbjVar = null;
        }
        zza = zzhbjVar;
        zzb = new zzhbj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhbj zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhbj zzb() {
        return zzb;
    }
}
