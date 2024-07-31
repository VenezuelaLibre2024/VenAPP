package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsx extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzsv zzc;
    public final String zzd;
    public final zzsx zze;

    public zzsx(zzam zzamVar, Throwable th2, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + zzamVar.toString(), th2, zzamVar.zzm, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzsx(com.google.android.gms.internal.ads.zzam r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzsv r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzm
            int r11 = com.google.android.gms.internal.ads.zzfy.zza
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L2f
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            goto L30
        L2f:
            r11 = 0
        L30:
            r8 = r11
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsx.<init>(com.google.android.gms.internal.ads.zzam, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzsv):void");
    }

    private zzsx(String str, Throwable th2, String str2, boolean z10, zzsv zzsvVar, String str3, zzsx zzsxVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsvVar;
        this.zzd = str3;
        this.zze = zzsxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzsx zza(zzsx zzsxVar, zzsx zzsxVar2) {
        return new zzsx(zzsxVar.getMessage(), zzsxVar.getCause(), zzsxVar.zza, false, zzsxVar.zzc, zzsxVar.zzd, zzsxVar2);
    }
}
