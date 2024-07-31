package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzza implements zzyw, zzhy {
    public static final zzgaa zza = zzgaa.zzp(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zzgaa zzb = zzgaa.zzp(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zzgaa zzc = zzgaa.zzp(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final zzgaa zzd = zzgaa.zzp(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final zzgaa zze = zzgaa.zzp(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final zzgaa zzf = zzgaa.zzp(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static zzza zzg;
    private final zzgad zzh;
    private final zzel zzj;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private final zzyu zzi = new zzyu();
    private final zzzp zzk = new zzzp(AdError.SERVER_ERROR_CODE);

    /* synthetic */ zzza(Context context, Map map, int i10, zzel zzelVar, boolean z10, zzyz zzyzVar) {
        this.zzh = zzgad.zzc(map);
        this.zzj = zzelVar;
        if (context == null) {
            this.zzs = 0;
            this.zzq = zzi(0);
            return;
        }
        zzfn zzb2 = zzfn.zzb(context);
        int zza2 = zzb2.zza();
        this.zzs = zza2;
        this.zzq = zzi(zza2);
        zzb2.zzd(new zzyy(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.google.android.gms.internal.ads.zzza zzg(android.content.Context r10) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzza> r0 = com.google.android.gms.internal.ads.zzza.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzza r1 = com.google.android.gms.internal.ads.zzza.zzg     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto Lde
            if (r10 != 0) goto Lc
            r1 = 0
        La:
            r3 = r1
            goto L11
        Lc:
            android.content.Context r1 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Le2
            goto La
        L11:
            int r1 = com.google.android.gms.internal.ads.zzfy.zza     // Catch: java.lang.Throwable -> Le2
            if (r10 == 0) goto L2e
            java.lang.String r1 = "phone"
            java.lang.Object r10 = r10.getSystemService(r1)     // Catch: java.lang.Throwable -> Le2
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> Le2
            if (r10 == 0) goto L2e
            java.lang.String r10 = r10.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Le2
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto L2e
        L29:
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfwk.zzb(r10)     // Catch: java.lang.Throwable -> Le2
            goto L37
        L2e:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = r10.getCountry()     // Catch: java.lang.Throwable -> Le2
            goto L29
        L37:
            int[] r10 = zzm(r10)     // Catch: java.lang.Throwable -> Le2
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le2
            r1 = 8
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Le2
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le2
            r5 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Le2
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> Le2
            r2 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzgaa r6 = com.google.android.gms.internal.ads.zzza.zza     // Catch: java.lang.Throwable -> Le2
            r7 = r10[r1]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r7 = r6.get(r7)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Le2
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> Le2
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzgaa r8 = com.google.android.gms.internal.ads.zzza.zzb     // Catch: java.lang.Throwable -> Le2
            r9 = 1
            r9 = r10[r9]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> Le2
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le2
            r7 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzgaa r9 = com.google.android.gms.internal.ads.zzza.zzc     // Catch: java.lang.Throwable -> Le2
            r2 = r10[r2]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Le2
            r4.put(r8, r2)     // Catch: java.lang.Throwable -> Le2
            r2 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzgaa r9 = com.google.android.gms.internal.ads.zzza.zzd     // Catch: java.lang.Throwable -> Le2
            r5 = r10[r5]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> Le2
            r4.put(r8, r5)     // Catch: java.lang.Throwable -> Le2
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzgaa r8 = com.google.android.gms.internal.ads.zzza.zze     // Catch: java.lang.Throwable -> Le2
            r7 = r10[r7]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Le2
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> Le2
            r5 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzgaa r7 = com.google.android.gms.internal.ads.zzza.zzf     // Catch: java.lang.Throwable -> Le2
            r2 = r10[r2]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Le2
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> Le2
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Le2
            r10 = r10[r1]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r10 = r6.get(r10)     // Catch: java.lang.Throwable -> Le2
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> Le2
            r4.put(r2, r10)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzel r6 = com.google.android.gms.internal.ads.zzel.zza     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzza r10 = new com.google.android.gms.internal.ads.zzza     // Catch: java.lang.Throwable -> Le2
            r5 = 2000(0x7d0, float:2.803E-42)
            r7 = 1
            r8 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzza.zzg = r10     // Catch: java.lang.Throwable -> Le2
        Lde:
            com.google.android.gms.internal.ads.zzza r10 = com.google.android.gms.internal.ads.zzza.zzg     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r0)
            return r10
        Le2:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzza.zzg(android.content.Context):com.google.android.gms.internal.ads.zzza");
    }

    private final long zzi(int i10) {
        Long l10 = (Long) this.zzh.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = (Long) this.zzh.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    private final void zzj(int i10, long j10, long j11) {
        int i11;
        long j12;
        if (i10 == 0) {
            if (j10 != 0) {
                j12 = j10;
            } else if (j11 == this.zzr) {
                return;
            } else {
                j12 = 0;
            }
            i11 = 0;
        } else {
            i11 = i10;
            j12 = j10;
        }
        this.zzr = j11;
        this.zzi.zzb(i11, j12, j11);
    }

    public final synchronized void zzk(int i10) {
        if (this.zzs != i10) {
            this.zzs = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.zzq = zzi(i10);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzj(this.zzl > 0 ? (int) (elapsedRealtime - this.zzm) : 0, this.zzn, this.zzq);
                this.zzm = elapsedRealtime;
                this.zzn = 0L;
                this.zzp = 0L;
                this.zzo = 0L;
                this.zzk.zzc();
            }
        }
    }

    private static boolean zzl(zzhb zzhbVar, boolean z10) {
        return z10 && !zzhbVar.zza(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L1299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L1307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L1449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L1798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L1653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L1713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L1775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L1565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L1771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L1744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L1181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L1744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L1641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L1406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L1810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L1697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L1299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L1307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L1709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L1413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L1720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L1641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L1569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L1406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L1657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L1413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L1526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L1449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L1798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L1573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L1573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L1526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L1565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L1569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L1573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L1641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L1653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L1657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L1697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L1709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L1713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L1786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L1720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L1744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L1771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L1775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L1786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L1798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L1810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L1181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0034. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] zzm(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzza.zzm(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final synchronized void zza(zzgw zzgwVar, zzhb zzhbVar, boolean z10, int i10) {
        if (zzl(zzhbVar, z10)) {
            this.zzn += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final synchronized void zzb(zzgw zzgwVar, zzhb zzhbVar, boolean z10) {
        if (zzl(zzhbVar, z10)) {
            zzek.zzf(this.zzl > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i10 = (int) (elapsedRealtime - this.zzm);
            this.zzo += i10;
            long j10 = this.zzp;
            long j11 = this.zzn;
            this.zzp = j10 + j11;
            if (i10 > 0) {
                this.zzk.zzb((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.zzo >= 2000 || this.zzp >= 524288) {
                    this.zzq = this.zzk.zza(0.5f);
                }
                zzj(i10, this.zzn, this.zzq);
                this.zzm = elapsedRealtime;
                this.zzn = 0L;
            }
            this.zzl--;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzgw zzgwVar, zzhb zzhbVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final synchronized void zzd(zzgw zzgwVar, zzhb zzhbVar, boolean z10) {
        if (zzl(zzhbVar, z10)) {
            if (this.zzl == 0) {
                this.zzm = SystemClock.elapsedRealtime();
            }
            this.zzl++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zze(Handler handler, zzyv zzyvVar) {
        zzyvVar.getClass();
        this.zzi.zza(handler, zzyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzf(zzyv zzyvVar) {
        this.zzi.zzc(zzyvVar);
    }
}
