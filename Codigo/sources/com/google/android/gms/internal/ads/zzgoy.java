package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgoy implements zzgpc {
    private final zzgxq zza;
    private final zzguy zzb;

    private zzgoy(zzguy zzguyVar, zzgxq zzgxqVar) {
        this.zzb = zzguyVar;
        this.zza = zzgxqVar;
    }

    public static zzgoy zza(zzguy zzguyVar) {
        String zzh = zzguyVar.zzh();
        Charset charset = zzgpm.zza;
        byte[] bArr = new byte[zzh.length()];
        for (int i10 = 0; i10 < zzh.length(); i10++) {
            char charAt = zzh.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return new zzgoy(zzguyVar, zzgxq.zzb(bArr));
    }

    public static zzgoy zzb(zzguy zzguyVar) {
        return new zzgoy(zzguyVar, zzgpm.zza(zzguyVar.zzh()));
    }

    public final zzguy zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpc
    public final zzgxq zzd() {
        return this.zza;
    }
}
