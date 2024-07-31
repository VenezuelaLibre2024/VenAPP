package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
final class zzlz implements zzll {
    private final zzxt zza;
    private final zzxt zzb;

    private zzlz(byte[] bArr, byte[] bArr2) {
        this.zza = zzxt.zza(bArr);
        this.zzb = zzxt.zza(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlz zza(byte[] bArr) {
        return new zzlz(bArr, zzxr.zza(bArr));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzll
    public final zzxt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzll
    public final zzxt zzb() {
        return this.zzb;
    }
}
