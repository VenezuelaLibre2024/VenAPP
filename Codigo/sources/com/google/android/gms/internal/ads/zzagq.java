package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzagq {
    public static final zzago zza = new zzago() { // from class: com.google.android.gms.internal.ads.zzagn
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzby zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzago r13, com.google.android.gms.internal.ads.zzafr r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagq.zza(byte[], int, com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzafr):com.google.android.gms.internal.ads.zzby");
    }

    private static int zzb(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i10, int i11) {
        int zzd = zzd(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i12 = zzd + 1;
            if ((zzd - i10) % 2 == 0 && bArr[i12] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i12);
        }
    }

    private static int zzd(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int zze(zzfp zzfpVar, int i10) {
        byte[] zzM = zzfpVar.zzM();
        int zzd = zzfpVar.zzd();
        int i11 = zzd;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= zzd + i10) {
                return i10;
            }
            if ((zzM[i11] & 255) == 255 && zzM[i12] == 0) {
                System.arraycopy(zzM, i11 + 2, zzM, i12, (i10 - (i11 - zzd)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.zzagr zzf(int r35, com.google.android.gms.internal.ads.zzfp r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzago r39) {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagq.zzf(int, com.google.android.gms.internal.ads.zzfp, boolean, int, com.google.android.gms.internal.ads.zzago):com.google.android.gms.internal.ads.zzagr");
    }

    private static zzgaa zzg(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return zzgaa.zzm("");
        }
        zzfzx zzfzxVar = new zzfzx();
        while (true) {
            int zzc = zzc(bArr, i11, i10);
            if (i11 >= zzc) {
                break;
            }
            zzfzxVar.zzf(new String(bArr, i11, zzc - i11, zzj(i10)));
            i11 = zzb(i10) + zzc;
        }
        zzgaa zzi = zzfzxVar.zzi();
        return zzi.isEmpty() ? zzgaa.zzm("") : zzi;
    }

    private static String zzh(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static String zzi(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static Charset zzj(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? zzfwq.zzb : zzfwq.zzc : zzfwq.zzd : zzfwq.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzk(com.google.android.gms.internal.ads.zzfp r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L8:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La8
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La4
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r21.zzg()     // Catch: java.lang.Throwable -> La8
            long r8 = r21.zzu()     // Catch: java.lang.Throwable -> La8
            int r10 = r21.zzq()     // Catch: java.lang.Throwable -> La8
            goto L2c
        L22:
            int r7 = r21.zzo()     // Catch: java.lang.Throwable -> La8
            int r8 = r21.zzo()     // Catch: java.lang.Throwable -> La8
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            goto La4
        L38:
            r7 = 4
            if (r0 != r7) goto L68
            if (r24 != 0) goto L68
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L48
        L45:
            r4 = r6
            goto La4
        L48:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L68:
            if (r0 != r7) goto L78
            r3 = r10 & 64
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r4 = r6
        L70:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8a
        L78:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L80
            r3 = r4
            goto L81
        L80:
            r3 = r6
        L81:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L8a
        L86:
            r4 = r6
            goto L8a
        L88:
            r3 = r6
            r4 = r3
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La8
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L94
            goto L45
        L94:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La8
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9e
            goto L45
        L9e:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La8
            r1.zzL(r3)     // Catch: java.lang.Throwable -> La8
            goto L8
        La4:
            r1.zzK(r2)
            return r4
        La8:
            r0 = move-exception
            r1.zzK(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagq.zzk(com.google.android.gms.internal.ads.zzfp, int, int, boolean):boolean");
    }

    private static byte[] zzl(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? zzfy.zzf : Arrays.copyOfRange(bArr, i10, i11);
    }
}
