package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzlh implements zzbr {
    private static final byte[] zza = new byte[0];
    private final zzuv zzb;
    private final zzlj zzc;
    private final zzlg zzd;
    private final zzld zze;

    private zzlh(zzuv zzuvVar, zzlj zzljVar, zzlg zzlgVar, zzld zzldVar) {
        this.zzb = zzuvVar;
        this.zzc = zzljVar;
        this.zzd = zzlgVar;
        this.zze = zzldVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlh zza(zzuv zzuvVar) {
        if (zzuvVar.zzf().zze()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzur zzb = zzuvVar.zzb();
        return new zzlh(zzuvVar, zzlk.zzc(zzb), zzlk.zzb(zzb), zzlk.zza(zzb));
    }
}
