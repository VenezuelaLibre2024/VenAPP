package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzly {
    private final zzbg zza;
    private final zzbp zzb;

    public zzly(zzbg zzbgVar) {
        this.zza = zzbgVar;
        this.zzb = null;
    }

    public zzly(zzbp zzbpVar) {
        this.zza = null;
        this.zzb = zzbpVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzbg zzbgVar = this.zza;
        return zzbgVar != null ? zzbgVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
