package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzfhw {
    public zzfhw() {
        try {
            zzghg.zza();
        } catch (GeneralSecurityException e10) {
            u1.a("Failed to Configure Aead. ".concat(e10.toString()));
            t.q().zzw(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgyi zzt = zzgyl.zzt();
        try {
            zzgfv.zzb(zzggm.zzc(zzggf.zza(zzgoa.zzb().zza("AES128_GCM"))), zzgfu.zzb(zzt));
        } catch (IOException | GeneralSecurityException e10) {
            u1.a("Failed to generate key".concat(e10.toString()));
            t.q().zzw(e10, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdwa zzdwaVar) {
        zzggm zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgfs) zzc.zze(zzgpb.zza(), zzgfs.class)).zza(bArr, bArr2);
            zzdwaVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
            u1.a("Failed to decrypt ".concat(e10.toString()));
            t.q().zzw(e10, "CryptoUtils.decrypt");
            zzdwaVar.zza().put("dsf", e10.toString());
            return null;
        }
    }

    private static final zzggm zzc(String str) {
        try {
            return zzgfv.zza(zzgft.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            u1.a("Failed to get keysethandle".concat(e10.toString()));
            t.q().zzw(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
