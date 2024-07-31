package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzlx implements zzll {
    private final zzxt zza;
    private final zzxt zzb;

    private zzlx(byte[] bArr, byte[] bArr2) {
        this.zza = zzxt.zza(bArr);
        this.zzb = zzxt.zza(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlx zza(byte[] bArr, byte[] bArr2, zzwo zzwoVar) {
        zzwp.zza(zzwp.zza(zzwoVar, zzwr.UNCOMPRESSED, bArr2), zzwp.zza(zzwoVar, bArr));
        return new zzlx(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final zzxt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final zzxt zzb() {
        return this.zzb;
    }
}
