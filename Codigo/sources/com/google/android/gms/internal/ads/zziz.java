package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zziz extends zzce {

    @Deprecated
    public static final zzn zzd = zziy.zza;
    private static final String zzl = Integer.toString(AdError.NO_FILL_ERROR_CODE, 36);
    private static final String zzm = Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
    private static final String zzn = Integer.toString(1003, 36);
    private static final String zzo = Integer.toString(1004, 36);
    private static final String zzp = Integer.toString(1005, 36);
    private static final String zzq = Integer.toString(1006, 36);
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzam zzh;
    public final int zzi;
    public final zzur zzj;
    final boolean zzk;

    private zziz(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zziz(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzam r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L5f
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L65
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzfy.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L65
        L5f:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L65:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L72
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L72:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziz.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzam, int, boolean):void");
    }

    private zziz(String str, Throwable th2, int i10, int i11, String str2, int i12, zzam zzamVar, int i13, zzur zzurVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        boolean z11;
        int i14 = i11;
        if (!z10) {
            z11 = true;
        } else if (i14 == 1) {
            i14 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        zzek.zzd(z11);
        zzek.zzd(th2 != null);
        this.zze = i14;
        this.zzf = str2;
        this.zzg = i12;
        this.zzh = zzamVar;
        this.zzi = i13;
        this.zzj = zzurVar;
        this.zzk = z10;
    }

    public static zziz zzb(Throwable th2, String str, int i10, zzam zzamVar, int i11, boolean z10, int i12) {
        return new zziz(1, th2, null, i12, str, i10, zzamVar, zzamVar == null ? 4 : i11, z10);
    }

    public static zziz zzc(IOException iOException, int i10) {
        return new zziz(0, iOException, i10);
    }

    public static zziz zzd(RuntimeException runtimeException, int i10) {
        return new zziz(2, runtimeException, i10);
    }

    public final zziz zza(zzur zzurVar) {
        String message = getMessage();
        int i10 = zzfy.zza;
        return new zziz(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzurVar, this.zzc, this.zzk);
    }
}
