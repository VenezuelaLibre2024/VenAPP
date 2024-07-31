package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzyg extends zzyl implements zzmg {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgbj zzc = zzgbj.zzb(zzxc.zza);
    private static final zzgbj zzd = zzgbj.zzb(zzxe.zza);
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzxu zzg;
    private zzxz zzh;
    private zzk zzi;
    private final zzwy zzj;

    public zzyg(Context context) {
        zzwy zzwyVar = new zzwy();
        zzxu zzd2 = zzxu.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzwyVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z10 = false;
        if (context != null && zzfy.zzJ(context)) {
            z10 = true;
        }
        this.zzf = z10;
        if (!z10 && context != null && zzfy.zza >= 32) {
            this.zzh = zzxz.zza(context);
        }
        if (this.zzg.zzS && context == null) {
            zzff.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zza(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : a.e.API_PRIORITY_OTHER;
    }

    public static int zzb(zzam zzamVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzamVar.zzd);
        if (zzh2 == null || zzh == null) {
            return (z10 && zzh2 == null) ? 1 : 0;
        }
        if (zzh2.startsWith(zzh) || zzh.startsWith(zzh2)) {
            return 3;
        }
        int i10 = zzfy.zza;
        return zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0]) ? 2 : 0;
    }

    public static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzyg zzygVar) {
        zzygVar.zzv();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r1 != 3) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzyg r8, com.google.android.gms.internal.ads.zzam r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxu r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzS     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r5
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzfy.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzxz r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzfy.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzxz r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxz r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxz r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r5
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyg.zzm(com.google.android.gms.internal.ads.zzyg, com.google.android.gms.internal.ads.zzam):boolean");
    }

    public static boolean zzo(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    private static void zzu(zzws zzwsVar, zzdg zzdgVar, Map map) {
        for (int i10 = 0; i10 < zzwsVar.zzc; i10++) {
            if (((zzdb) zzdgVar.zzD.get(zzwsVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    public final void zzv() {
        boolean z10;
        zzxz zzxzVar;
        synchronized (this.zze) {
            z10 = false;
            if (this.zzg.zzS && !this.zzf && zzfy.zza >= 32 && (zzxzVar = this.zzh) != null && zzxzVar.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzt();
        }
    }

    private static final Pair zzw(int i10, zzyk zzykVar, int[][][] iArr, zzyb zzybVar, Comparator comparator) {
        int i11;
        List arrayList;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < 2; i13++) {
            if (i10 == zzykVar.zzc(i13)) {
                zzws zzd2 = zzykVar.zzd(i13);
                for (int i14 = 0; i14 < zzd2.zzc; i14++) {
                    zzcz zzb2 = zzd2.zzb(i14);
                    List zza = zzybVar.zza(i13, zzb2, iArr[i13][i14]);
                    int i15 = zzb2.zzb;
                    int i16 = 1;
                    boolean[] zArr = new boolean[1];
                    int i17 = 0;
                    while (i17 <= 0) {
                        int i18 = i17 + 1;
                        zzyc zzycVar = (zzyc) zza.get(i17);
                        int zzb3 = zzycVar.zzb();
                        if (zArr[i17] || zzb3 == 0) {
                            i11 = i16;
                        } else {
                            if (zzb3 == i16) {
                                arrayList = zzgaa.zzm(zzycVar);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(zzycVar);
                                int i19 = i18;
                                while (i19 <= 0) {
                                    zzyc zzycVar2 = (zzyc) zza.get(i19);
                                    if (zzycVar2.zzb() == 2 && zzycVar.zzc(zzycVar2)) {
                                        arrayList.add(zzycVar2);
                                        i12 = 1;
                                        zArr[i19] = true;
                                    } else {
                                        i12 = 1;
                                    }
                                    i19++;
                                    i16 = i12;
                                }
                            }
                            i11 = i16;
                            arrayList2.add(arrayList);
                        }
                        i16 = i11;
                        i17 = i18;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i20 = 0; i20 < list.size(); i20++) {
            iArr2[i20] = ((zzyc) list.get(i20)).zzc;
        }
        zzyc zzycVar3 = (zzyc) list.get(0);
        return Pair.create(new zzyh(zzycVar3.zzb, iArr2, 0), Integer.valueOf(zzycVar3.zza));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzyl
    protected final Pair zzc(zzyk zzykVar, int[][][] iArr, int[] iArr2, zzur zzurVar, zzcx zzcxVar) {
        zzxu zzxuVar;
        int i10;
        boolean z10;
        String str;
        int[] iArr3;
        int length;
        zzxz zzxzVar;
        synchronized (this.zze) {
            zzxuVar = this.zzg;
            if (zzxuVar.zzS && zzfy.zza >= 32 && (zzxzVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzek.zzb(myLooper);
                zzxzVar.zzb(this, myLooper);
            }
        }
        int i11 = 2;
        zzyh[] zzyhVarArr = new zzyh[2];
        Pair zzw = zzw(2, zzykVar, iArr, new zzyb() { // from class: com.google.android.gms.internal.ads.zzxk
            public final /* synthetic */ int[] zzb;

            public /* synthetic */ zzxk(int[] iArr22) {
                r2 = iArr22;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
            @Override // com.google.android.gms.internal.ads.zzyb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r19, com.google.android.gms.internal.ads.zzcz r20, int[] r21) {
                /*
                    Method dump skipped, instructions count: 196
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxk.zza(int, com.google.android.gms.internal.ads.zzcz, int[]):java.util.List");
            }
        }, zzxl.zza);
        int i12 = 4;
        Pair zzw2 = zzw == null ? zzw(4, zzykVar, iArr, new zzyb() { // from class: com.google.android.gms.internal.ads.zzxf
            public /* synthetic */ zzxf() {
            }

            @Override // com.google.android.gms.internal.ads.zzyb
            public final List zza(int i13, zzcz zzczVar, int[] iArr4) {
                int i14 = zzyg.zzb;
                zzfzx zzfzxVar = new zzfzx();
                int i15 = 0;
                while (true) {
                    int i16 = zzczVar.zzb;
                    if (i15 > 0) {
                        return zzfzxVar.zzi();
                    }
                    zzfzxVar.zzf(new zzxo(i13, zzczVar, i15, zzxu.this, iArr4[i15]));
                    i15++;
                }
            }
        }, zzxg.zza) : null;
        if (zzw2 != null) {
            zzyhVarArr[((Integer) zzw2.second).intValue()] = (zzyh) zzw2.first;
        } else if (zzw != null) {
            zzyhVarArr[((Integer) zzw.second).intValue()] = (zzyh) zzw.first;
        }
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (zzykVar.zzc(i13) == 2 && zzykVar.zzd(i13).zzc > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair zzw3 = zzw(1, zzykVar, iArr, new zzyb() { // from class: com.google.android.gms.internal.ads.zzxi
            public final /* synthetic */ zzxu zzb;
            public final /* synthetic */ boolean zzc;
            public final /* synthetic */ int[] zzd;

            public /* synthetic */ zzxi(zzxu zzxuVar2, boolean z102, int[] iArr22) {
                r2 = zzxuVar2;
                r3 = z102;
                r4 = iArr22;
            }

            @Override // com.google.android.gms.internal.ads.zzyb
            public final List zza(int i14, zzcz zzczVar, int[] iArr4) {
                zzxh zzxhVar = new zzfxf() { // from class: com.google.android.gms.internal.ads.zzxh
                    public /* synthetic */ zzxh() {
                    }

                    @Override // com.google.android.gms.internal.ads.zzfxf
                    public final boolean zza(Object obj) {
                        return zzyg.zzm(zzyg.this, (zzam) obj);
                    }
                };
                int i15 = r4[i14];
                zzfzx zzfzxVar = new zzfzx();
                int i16 = 0;
                while (true) {
                    int i17 = zzczVar.zzb;
                    if (i16 > 0) {
                        return zzfzxVar.zzi();
                    }
                    zzfzxVar.zzf(new zzxn(i14, zzczVar, i16, r2, iArr4[i16], r3, zzxhVar, i15));
                    i16++;
                }
            }
        }, zzxj.zza);
        if (zzw3 != null) {
            zzyhVarArr[((Integer) zzw3.second).intValue()] = (zzyh) zzw3.first;
        }
        if (zzw3 == null) {
            str = null;
        } else {
            Object obj = zzw3.first;
            str = ((zzyh) obj).zza.zzb(((zzyh) obj).zzb[0]).zzd;
        }
        int i14 = 3;
        Pair zzw4 = zzw(3, zzykVar, iArr, new zzyb() { // from class: com.google.android.gms.internal.ads.zzxm
            public final /* synthetic */ String zzb;

            public /* synthetic */ zzxm(String str2) {
                r2 = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzyb
            public final List zza(int i15, zzcz zzczVar, int[] iArr4) {
                int i16 = zzyg.zzb;
                zzfzx zzfzxVar = new zzfzx();
                int i17 = 0;
                while (true) {
                    int i18 = zzczVar.zzb;
                    if (i17 > 0) {
                        return zzfzxVar.zzi();
                    }
                    int i19 = i17;
                    zzfzxVar.zzf(new zzya(i15, zzczVar, i19, zzxu.this, iArr4[i17], r2));
                    i17++;
                }
            }
        }, zzxd.zza);
        if (zzw4 != null) {
            zzyhVarArr[((Integer) zzw4.second).intValue()] = (zzyh) zzw4.first;
        }
        int i15 = 0;
        while (i15 < i11) {
            int zzc2 = zzykVar.zzc(i15);
            if (zzc2 != i11 && zzc2 != i10 && zzc2 != i14 && zzc2 != i12) {
                zzws zzd2 = zzykVar.zzd(i15);
                int[][] iArr4 = iArr[i15];
                int i16 = 0;
                zzcz zzczVar = null;
                zzxp zzxpVar = null;
                while (i16 < zzd2.zzc) {
                    zzcz zzb2 = zzd2.zzb(i16);
                    int[] iArr5 = iArr4[i16];
                    zzxp zzxpVar2 = zzxpVar;
                    char c10 = 0;
                    while (true) {
                        int i17 = zzb2.zzb;
                        if (c10 <= 0) {
                            if (zzo(iArr5[0], zzxuVar2.zzT)) {
                                zzxp zzxpVar3 = new zzxp(zzb2.zzb(0), iArr5[0]);
                                if (zzxpVar2 == null || zzxpVar3.compareTo(zzxpVar2) > 0) {
                                    zzczVar = zzb2;
                                    zzxpVar2 = zzxpVar3;
                                }
                            }
                            c10 = 1;
                        }
                    }
                    i16++;
                    zzxpVar = zzxpVar2;
                }
                zzyhVarArr[i15] = zzczVar == null ? null : new zzyh(zzczVar, new int[]{0}, 0);
            }
            i15++;
            i11 = 2;
            i12 = 4;
            i10 = 1;
            i14 = 3;
        }
        HashMap hashMap = new HashMap();
        int i18 = 2;
        for (int i19 = 0; i19 < 2; i19++) {
            zzu(zzykVar.zzd(i19), zzxuVar2, hashMap);
        }
        zzu(zzykVar.zze(), zzxuVar2, hashMap);
        for (int i20 = 0; i20 < 2; i20++) {
            if (((zzdb) hashMap.get(Integer.valueOf(zzykVar.zzc(i20)))) != null) {
                throw null;
            }
        }
        int i21 = 0;
        while (i21 < i18) {
            zzws zzd3 = zzykVar.zzd(i21);
            if (zzxuVar2.zzg(i21, zzd3)) {
                if (zzxuVar2.zze(i21, zzd3) != null) {
                    throw null;
                }
                zzyhVarArr[i21] = null;
            }
            i21++;
            i18 = 2;
        }
        int i22 = 0;
        for (int i23 = i18; i22 < i23; i23 = 2) {
            int zzc3 = zzykVar.zzc(i22);
            if (zzxuVar2.zzf(i22) || zzxuVar2.zzE.contains(Integer.valueOf(zzc3))) {
                zzyhVarArr[i22] = null;
            }
            i22++;
        }
        zzwy zzwyVar = this.zzj;
        zzyw zzr = zzr();
        zzgaa zzf = zzwz.zzf(zzyhVarArr);
        int i24 = 2;
        zzyi[] zzyiVarArr = new zzyi[2];
        int i25 = 0;
        while (i25 < i24) {
            zzyh zzyhVar = zzyhVarArr[i25];
            if (zzyhVar != null && (length = (iArr3 = zzyhVar.zzb).length) != 0) {
                zzcz zzczVar2 = zzyhVar.zza;
                zzyiVarArr[i25] = length == 1 ? new zzyj(zzczVar2, iArr3[0], 0, 0, null) : zzwyVar.zza(zzczVar2, iArr3, 0, zzr, (zzgaa) zzf.get(i25));
            }
            i25++;
            i24 = 2;
        }
        zzmi[] zzmiVarArr = new zzmi[i24];
        for (int i26 = 0; i26 < i24; i26++) {
            zzmiVarArr[i26] = (zzxuVar2.zzf(i26) || zzxuVar2.zzE.contains(Integer.valueOf(zzykVar.zzc(i26))) || (zzykVar.zzc(i26) != -2 && zzyiVarArr[i26] == null)) ? null : zzmi.zza;
        }
        return Pair.create(zzmiVarArr, zzyiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final zzmg zzd() {
        return this;
    }

    public final zzxu zze() {
        zzxu zzxuVar;
        synchronized (this.zze) {
            zzxuVar = this.zzg;
        }
        return zzxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final void zzj() {
        zzxz zzxzVar;
        synchronized (this.zze) {
            if (zzfy.zza >= 32 && (zzxzVar = this.zzh) != null) {
                zzxzVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final void zzk(zzk zzkVar) {
        boolean z10;
        synchronized (this.zze) {
            z10 = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z10) {
            zzv();
        }
    }

    public final void zzl(zzxs zzxsVar) {
        boolean z10;
        zzxu zzxuVar = new zzxu(zzxsVar);
        synchronized (this.zze) {
            z10 = !this.zzg.equals(zzxuVar);
            this.zzg = zzxuVar;
        }
        if (z10) {
            if (zzxuVar.zzS && this.zza == null) {
                zzff.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final boolean zzn() {
        return true;
    }
}
