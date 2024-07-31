package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
final class zzla implements zzlg {
    private final String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzla(String str) {
        this.zza = str;
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza = zzwt.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        } else {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        }
        return zza.doFinal(bArr);
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i10) {
        Mac zza = zzwt.zzb.zza(this.zza);
        if (i10 > zza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i10];
        zza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArr4 = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            zza.update(bArr4);
            zza.update(bArr2);
            zza.update((byte) i11);
            bArr4 = zza.doFinal();
            if (bArr4.length + i12 >= i10) {
                System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
            i12 += bArr4.length;
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzlt.zza(str, bArr2, bArr3), bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) {
        return zza(bArr, zzlt.zza(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) {
        return zza(zza(zzlt.zza(str, bArr2, bArr4), null), zzlt.zza(str2, bArr3, bArr4, i10), i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final byte[] zzb() {
        String str = this.zza;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c10 = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c10 = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return zzlt.zzf;
            case 1:
                return zzlt.zzg;
            case 2:
                return zzlt.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
