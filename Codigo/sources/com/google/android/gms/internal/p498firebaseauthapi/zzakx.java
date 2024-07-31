package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
final class zzakx {
    private static final zzakv zza = zzc();
    private static final zzakv zzb = new zzaku();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzakv zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzakv zzb() {
        return zzb;
    }

    private static zzakv zzc() {
        try {
            return (zzakv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
