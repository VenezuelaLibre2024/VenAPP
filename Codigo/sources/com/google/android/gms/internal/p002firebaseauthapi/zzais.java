package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzais {
    private static final zzaiq<?> zza = new zzait();
    private static final zzaiq<?> zzb = zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaiq<?> zza() {
        zzaiq<?> zzaiqVar = zzb;
        if (zzaiqVar != null) {
            return zzaiqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaiq<?> zzb() {
        return zza;
    }

    private static zzaiq<?> zzc() {
        try {
            return (zzaiq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
