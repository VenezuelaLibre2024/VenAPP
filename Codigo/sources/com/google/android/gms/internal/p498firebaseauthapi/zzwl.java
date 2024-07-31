package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes2.dex */
public final class zzwl implements zzbo {
    private static final byte[] zza = new byte[0];
    private final ECPrivateKey zzb;
    private final zzwn zzc;
    private final String zzd;
    private final byte[] zze;
    private final zzwr zzf;
    private final zzwi zzg;

    public zzwl(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzwr zzwrVar, zzwi zzwiVar) {
        this.zzb = eCPrivateKey;
        this.zzc = new zzwn(eCPrivateKey);
        this.zze = bArr;
        this.zzd = str;
        this.zzf = zzwrVar;
        this.zzg = zzwiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zza(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r0 = r9.zzb
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.google.android.gms.internal.firebase-auth-api.zzwr r1 = r9.zzf
            int r0 = com.google.android.gms.internal.p498firebaseauthapi.zzwp.zza(r0)
            int r1 = r1.ordinal()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1e
            int r0 = r0 * r2
            goto L28
        L1e:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "unknown EC point format"
            r10.<init>(r11)
            throw r10
        L26:
            int r0 = r0 * r2
        L27:
            int r0 = r0 + r3
        L28:
            int r1 = r10.length
            if (r1 < r0) goto L55
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r0)
            com.google.android.gms.internal.firebase-auth-api.zzwn r2 = r9.zzc
            java.lang.String r4 = r9.zzd
            byte[] r5 = r9.zze
            com.google.android.gms.internal.firebase-auth-api.zzwi r1 = r9.zzg
            int r7 = r1.zza()
            com.google.android.gms.internal.firebase-auth-api.zzwr r8 = r9.zzf
            r6 = r11
            byte[] r11 = r2.zza(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.zzwi r1 = r9.zzg
            com.google.android.gms.internal.firebase-auth-api.zzly r11 = r1.zza(r11)
            int r1 = r10.length
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r0, r1)
            byte[] r0 = com.google.android.gms.internal.p498firebaseauthapi.zzwl.zza
            byte[] r10 = r11.zza(r10, r0)
            return r10
        L55:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p498firebaseauthapi.zzwl.zza(byte[], byte[]):byte[]");
    }
}
