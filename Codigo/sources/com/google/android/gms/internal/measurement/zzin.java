package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzin {
    private static final zzim<?> zza = new zzio();
    private static final zzim<?> zzb = zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzim<?> zza() {
        zzim<?> zzimVar = zzb;
        if (zzimVar != null) {
            return zzimVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzim<?> zzb() {
        return zza;
    }

    private static zzim<?> zzc() {
        try {
            return (zzim) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}