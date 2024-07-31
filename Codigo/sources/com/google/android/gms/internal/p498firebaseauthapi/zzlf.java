package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzlf implements zzbo {
    private static final byte[] zza = new byte[0];
    private final zzll zzb;
    private final zzlj zzc;
    private final zzlg zzd;
    private final zzld zze;
    private final int zzf;

    private zzlf(zzll zzllVar, zzlj zzljVar, zzlg zzlgVar, zzld zzldVar, int i10) {
        this.zzb = zzllVar;
        this.zzc = zzljVar;
        this.zzd = zzlgVar;
        this.zze = zzldVar;
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlf zza(zzuu zzuuVar) {
        int i10;
        zzll zza2;
        if (!zzuuVar.zzf()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzuuVar.zzd().zzg()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzuuVar.zze().zze()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzur zzb = zzuuVar.zzd().zzb();
        zzlj zzc = zzlk.zzc(zzb);
        zzlg zzb2 = zzlk.zzb(zzb);
        zzld zza3 = zzlk.zza(zzb);
        zzuo zzc2 = zzb.zzc();
        int i11 = zzle.zza[zzc2.ordinal()];
        if (i11 == 1) {
            i10 = 32;
        } else if (i11 == 2) {
            i10 = 65;
        } else if (i11 == 3) {
            i10 = 97;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for " + zzc2.name());
            }
            i10 = 133;
        }
        int i12 = zzli.zza[zzuuVar.zzd().zzb().zzc().ordinal()];
        if (i12 == 1) {
            zza2 = zzlz.zza(zzuuVar.zze().zzg());
        } else {
            if (i12 != 2 && i12 != 3 && i12 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            zza2 = zzlx.zza(zzuuVar.zze().zzg(), zzuuVar.zzd().zzf().zzg(), zzlt.zzc(zzuuVar.zzd().zzb().zzc()));
        }
        return new zzlf(zza2, zzc, zzb2, zza3, i10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.zzf;
        if (length < i10) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        return zzlc.zza(copyOf, this.zzb, this.zzc, this.zzd, this.zze, bArr3).zza(Arrays.copyOfRange(bArr, this.zzf, bArr.length), zza);
    }
}
