package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzaki {
    private static final zzakg zza = zzc();
    private static final zzakg zzb = new zzakj();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzakg zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzakg zzb() {
        return zzb;
    }

    private static zzakg zzc() {
        try {
            return (zzakg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
