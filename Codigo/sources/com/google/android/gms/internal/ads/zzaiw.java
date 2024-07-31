package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaiw {
    private static final byte[] zza;

    static {
        int i10 = zzfy.zza;
        zza = "OpusHead".getBytes(zzfwq.zzc);
    }

    public static zzby zza(zzaim zzaimVar) {
        zzgc zzgcVar;
        zzain zzb = zzaimVar.zzb(1751411826);
        zzain zzb2 = zzaimVar.zzb(1801812339);
        zzain zzb3 = zzaimVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzfp zzfpVar = zzb2.zza;
            zzfpVar.zzK(12);
            int zzg = zzfpVar.zzg();
            String[] strArr = new String[zzg];
            for (int i10 = 0; i10 < zzg; i10++) {
                int zzg2 = zzfpVar.zzg();
                zzfpVar.zzL(4);
                strArr[i10] = zzfpVar.zzA(zzg2 - 8, zzfwq.zzc);
            }
            zzfp zzfpVar2 = zzb3.zza;
            zzfpVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzfpVar2.zzb() > 8) {
                int zzd = zzfpVar2.zzd() + zzfpVar2.zzg();
                int zzg3 = zzfpVar2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzff.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    int i11 = zzajd.zzb;
                    while (true) {
                        int zzd2 = zzfpVar2.zzd();
                        if (zzd2 >= zzd) {
                            zzgcVar = null;
                            break;
                        }
                        int zzg4 = zzfpVar2.zzg();
                        if (zzfpVar2.zzg() == 1684108385) {
                            int zzg5 = zzfpVar2.zzg();
                            int zzg6 = zzfpVar2.zzg();
                            int i12 = zzg4 - 16;
                            byte[] bArr = new byte[i12];
                            zzfpVar2.zzG(bArr, 0, i12);
                            zzgcVar = new zzgc(str, bArr, zzg6, zzg5);
                            break;
                        }
                        zzfpVar2.zzK(zzd2 + zzg4);
                    }
                    if (zzgcVar != null) {
                        arrayList.add(zzgcVar);
                    }
                }
                zzfpVar2.zzK(zzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    public static zzby zzb(zzain zzainVar) {
        int zzn;
        zzfp zzfpVar = zzainVar.zza;
        zzfpVar.zzK(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (zzfpVar.zzb() >= 8) {
            int zzd = zzfpVar.zzd();
            int zzg = zzfpVar.zzg() + zzd;
            int zzg2 = zzfpVar.zzg();
            zzby zzbyVar2 = null;
            if (zzg2 == 1835365473) {
                zzfpVar.zzK(zzd);
                zzfpVar.zzL(8);
                zze(zzfpVar);
                while (true) {
                    if (zzfpVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzfpVar.zzd();
                    int zzg3 = zzfpVar.zzg() + zzd2;
                    if (zzfpVar.zzg() == 1768715124) {
                        zzfpVar.zzK(zzd2);
                        zzfpVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfpVar.zzd() < zzg3) {
                            zzbx zza2 = zzajd.zza(zzfpVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                        }
                    } else {
                        zzfpVar.zzK(zzg3);
                    }
                }
            } else if (zzg2 == 1936553057) {
                zzfpVar.zzK(zzd);
                zzfpVar.zzL(12);
                while (true) {
                    if (zzfpVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzfpVar.zzd();
                    int zzg4 = zzfpVar.zzg();
                    if (zzfpVar.zzg() != 1935766900) {
                        zzfpVar.zzK(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzfpVar.zzL(4);
                        int i10 = -1;
                        int i11 = 0;
                        for (int i12 = 0; i12 < 2; i12++) {
                            int zzm = zzfpVar.zzm();
                            int zzm2 = zzfpVar.zzm();
                            if (zzm == 0) {
                                i10 = zzm2;
                            } else if (zzm == 1) {
                                i11 = zzm2;
                            }
                        }
                        if (i10 == 12) {
                            zzn = 240;
                        } else if (i10 == 13) {
                            zzn = 120;
                        } else {
                            if (i10 == 21 && zzfpVar.zzb() >= 8 && zzfpVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzfpVar.zzg();
                                int zzg6 = zzfpVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzfpVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzbyVar2 = new zzby(-9223372036854775807L, new zzahm(zzn, i11));
                        }
                    }
                }
            } else {
                if (zzg2 == -1451722374) {
                    zzbyVar = zzbyVar.zzd(zzi(zzfpVar));
                }
                zzfpVar.zzK(zzg);
            }
            zzbyVar = zzbyVar.zzd(zzbyVar2);
            zzfpVar.zzK(zzg);
        }
        return zzbyVar;
    }

    public static zzgi zzc(zzfp zzfpVar) {
        long zzt;
        long zzt2;
        zzfpVar.zzK(8);
        if (zzaio.zze(zzfpVar.zzg()) == 0) {
            zzt = zzfpVar.zzu();
            zzt2 = zzfpVar.zzu();
        } else {
            zzt = zzfpVar.zzt();
            zzt2 = zzfpVar.zzt();
        }
        return new zzgi(zzt, zzt2, zzfpVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x0707, code lost:
    
        if (r15 == 1) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06e3, code lost:
    
        if (r8.zzd(1) > 0) goto L354;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b36 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzaim r56, com.google.android.gms.internal.ads.zzadk r57, long r58, com.google.android.gms.internal.ads.zzae r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfws r63) {
        /*
            Method dump skipped, instructions count: 2880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiw.zzd(com.google.android.gms.internal.ads.zzaim, com.google.android.gms.internal.ads.zzadk, long, com.google.android.gms.internal.ads.zzae, boolean, boolean, com.google.android.gms.internal.ads.zzfws):java.util.List");
    }

    public static void zze(zzfp zzfpVar) {
        int zzd = zzfpVar.zzd();
        zzfpVar.zzL(4);
        if (zzfpVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzfpVar.zzK(zzd);
    }

    private static int zzf(zzfp zzfpVar) {
        int zzm = zzfpVar.zzm();
        int i10 = zzm & 127;
        while ((zzm & RecognitionOptions.ITF) == 128) {
            zzm = zzfpVar.zzm();
            i10 = (i10 << 7) | (zzm & 127);
        }
        return i10;
    }

    private static int zzg(zzfp zzfpVar) {
        zzfpVar.zzK(16);
        return zzfpVar.zzg();
    }

    private static Pair zzh(zzfp zzfpVar, int i10, int i11) {
        Integer num;
        zzajn zzajnVar;
        Pair create;
        int i12;
        int i13;
        byte[] bArr;
        int zzd = zzfpVar.zzd();
        while (zzd - i10 < i11) {
            zzfpVar.zzK(zzd);
            int zzg = zzfpVar.zzg();
            zzacy.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzfpVar.zzg() == 1936289382) {
                int i14 = zzd + 8;
                int i15 = 0;
                int i16 = -1;
                String str = null;
                Integer num2 = null;
                while (i14 - zzd < zzg) {
                    zzfpVar.zzK(i14);
                    int zzg2 = zzfpVar.zzg();
                    int zzg3 = zzfpVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzfpVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzfpVar.zzL(4);
                        str = zzfpVar.zzA(4, zzfwq.zzc);
                    } else if (zzg3 == 1935894633) {
                        i16 = i14;
                        i15 = zzg2;
                    }
                    i14 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzacy.zzb(num2 != null, "frma atom is mandatory");
                    zzacy.zzb(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num2;
                            zzajnVar = null;
                            break;
                        }
                        zzfpVar.zzK(i17);
                        int zzg4 = zzfpVar.zzg();
                        if (zzfpVar.zzg() == 1952804451) {
                            int zze = zzaio.zze(zzfpVar.zzg());
                            zzfpVar.zzL(1);
                            if (zze == 0) {
                                zzfpVar.zzL(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int zzm = zzfpVar.zzm();
                                int i18 = (zzm & 240) >> 4;
                                i12 = zzm & 15;
                                i13 = i18;
                            }
                            boolean z10 = zzfpVar.zzm() == 1;
                            int zzm2 = zzfpVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzfpVar.zzG(bArr2, 0, 16);
                            if (z10 && zzm2 == 0) {
                                int zzm3 = zzfpVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzfpVar.zzG(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzajnVar = new zzajn(z10, str, zzm2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += zzg4;
                        }
                    }
                    zzacy.zzb(zzajnVar != null, "tenc atom is mandatory");
                    int i19 = zzfy.zza;
                    create = Pair.create(num, zzajnVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    private static zzby zzi(zzfp zzfpVar) {
        short zzD = zzfpVar.zzD();
        zzfpVar.zzL(2);
        String zzA = zzfpVar.zzA(zzD, zzfwq.zzc);
        int max = Math.max(zzA.lastIndexOf(43), zzA.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzgf(Float.parseFloat(zzA.substring(0, max)), Float.parseFloat(zzA.substring(max, zzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaiq zzj(zzfp zzfpVar, int i10) {
        zzfpVar.zzK(i10 + 12);
        zzfpVar.zzL(1);
        zzf(zzfpVar);
        zzfpVar.zzL(2);
        int zzm = zzfpVar.zzm();
        if ((zzm & RecognitionOptions.ITF) != 0) {
            zzfpVar.zzL(2);
        }
        if ((zzm & 64) != 0) {
            zzfpVar.zzL(zzfpVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzfpVar.zzL(2);
        }
        zzfpVar.zzL(1);
        zzf(zzfpVar);
        String zzd = zzcb.zzd(zzfpVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaiq(zzd, null, -1L, -1L);
        }
        zzfpVar.zzL(4);
        long zzu = zzfpVar.zzu();
        long zzu2 = zzfpVar.zzu();
        zzfpVar.zzL(1);
        int zzf = zzf(zzfpVar);
        byte[] bArr = new byte[zzf];
        zzfpVar.zzG(bArr, 0, zzf);
        return new zzaiq(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0271 A[ADDED_TO_REGION, LOOP:12: B:217:0x0271->B:220:0x027b, LOOP_START, PHI: r16
      0x0271: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:216:0x026f, B:220:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzajp zzk(com.google.android.gms.internal.ads.zzajm r40, com.google.android.gms.internal.ads.zzaim r41, com.google.android.gms.internal.ads.zzadk r42) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiw.zzk(com.google.android.gms.internal.ads.zzajm, com.google.android.gms.internal.ads.zzaim, com.google.android.gms.internal.ads.zzadk):com.google.android.gms.internal.ads.zzajp");
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzfp r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzae r33, com.google.android.gms.internal.ads.zzais r34, int r35) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiw.zzm(com.google.android.gms.internal.ads.zzfp, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzae, com.google.android.gms.internal.ads.zzais, int):void");
    }
}
