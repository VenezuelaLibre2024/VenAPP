package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzajc implements zzacu {

    @Deprecated
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaiy
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzajc()};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzacx zzE;
    private zzaea[] zzF;
    private zzaea[] zzG;
    private boolean zzH;
    private final zzakp zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzfp zzg;
    private final zzfp zzh;
    private final zzfp zzi;
    private final byte[] zzj;
    private final zzfp zzk;
    private final zzafu zzl;
    private final zzfp zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private int zzp;
    private int zzq;
    private long zzr;
    private int zzs;
    private zzfp zzt;
    private long zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private zzajb zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzW("application/x-emsg");
        zzc = zzakVar.zzac();
    }

    @Deprecated
    public zzajc() {
        this(zzakp.zza, 32, null, null, zzgaa.zzl(), null);
    }

    public zzajc(zzakp zzakpVar, int i10, zzfw zzfwVar, zzajm zzajmVar, List list, zzaea zzaeaVar) {
        this.zzd = zzakpVar;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafu();
        this.zzm = new zzfp(16);
        this.zzg = new zzfp(zzgm.zza);
        this.zzh = new zzfp(5);
        this.zzi = new zzfp();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzfp(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzx = -9223372036854775807L;
        this.zzw = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzE = zzacx.zza;
        this.zzF = new zzaea[0];
        this.zzG = new zzaea[0];
    }

    private static int zza(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw zzcc.zza("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzae zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzain r5 = (com.google.android.gms.internal.ads.zzain) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzfp r5 = r5.zza
            byte[] r5 = r5.zzM()
            com.google.android.gms.internal.ads.zzfp r6 = new com.google.android.gms.internal.ads.zzfp
            r6.<init>(r5)
            int r8 = r6.zze()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L99
        L33:
            r6.zzK(r1)
            int r8 = r6.zzg()
            int r9 = r6.zzb()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.zzg()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.zzg()
            int r7 = com.google.android.gms.internal.ads.zzaio.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzff.zzf(r7, r6)
            goto L31
        L6c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzt()
            long r12 = r6.zzt()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L84
            int r8 = r6.zzp()
            int r8 = r8 * 16
            r6.zzL(r8)
        L84:
            int r8 = r6.zzp()
            int r10 = r6.zzb()
            if (r8 == r10) goto L8f
            goto L31
        L8f:
            byte[] r10 = new byte[r8]
            r6.zzG(r10, r1, r8)
            com.google.android.gms.internal.ads.zzaji r6 = new com.google.android.gms.internal.ads.zzaji
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zzaji.zza(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzff.zzf(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzae r14 = new com.google.android.gms.internal.ads.zzae
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajc.zzf(java.util.List):com.google.android.gms.internal.ads.zzae");
    }

    private final void zzg() {
        this.zzp = 0;
        this.zzs = 0;
    }

    private static void zzh(zzfp zzfpVar, int i10, zzajo zzajoVar) {
        zzfpVar.zzK(i10 + 8);
        int zzg = zzfpVar.zzg() & 16777215;
        if ((zzg & 1) != 0) {
            throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (zzg & 2) != 0;
        int zzp = zzfpVar.zzp();
        if (zzp == 0) {
            Arrays.fill(zzajoVar.zzl, 0, zzajoVar.zze, false);
            return;
        }
        int i11 = zzajoVar.zze;
        if (zzp != i11) {
            throw zzcc.zza("Senc sample count " + zzp + " is different from fragment sample count" + i11, null);
        }
        Arrays.fill(zzajoVar.zzl, 0, zzp, z10);
        zzajoVar.zza(zzfpVar.zzb());
        zzfp zzfpVar2 = zzajoVar.zzn;
        zzfpVar.zzG(zzfpVar2.zzM(), 0, zzfpVar2.zze());
        zzajoVar.zzn.zzK(0);
        zzajoVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0317, code lost:
    
        if (com.google.android.gms.internal.ads.zzfy.zzs(r35, 1000000, r5.zzd, java.math.RoundingMode.FLOOR) < r5.zze) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzi(long r47) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajc.zzi(long):void");
    }

    private static final zzaix zzj(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaix) sparseArray.valueAt(0);
        }
        zzaix zzaixVar = (zzaix) sparseArray.get(i10);
        zzaixVar.getClass();
        return zzaixVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x009c, code lost:
    
        if (r33.zzp != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzack) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00b3, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x00bc, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x00be, code lost:
    
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x00cb, code lost:
    
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x00d9, code lost:
    
        r33.zzz = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x00db, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0291, code lost:
    
        r33.zzp = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0294, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x00e4, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x00e6, code lost:
    
        r33.zzA = r3 - 8;
        ((com.google.android.gms.internal.ads.zzack) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0100, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0102, code lost:
    
        r33.zzB = r2.zzc(r33.zzA, 7);
        com.google.android.gms.internal.ads.zzaby.zzb(r33.zzA, r33.zzk);
        r2.zza.zzr(r33.zzk, 7);
        r3 = r33.zzB + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0123, code lost:
    
        r33.zzB = r3;
        r33.zzA += r3;
        r33.zzp = 4;
        r33.zzC = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x011d, code lost:
    
        r3 = r2.zzc(r33.zzA, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x012f, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x013b, code lost:
    
        if (r6 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x013d, code lost:
    
        r3 = r33.zzB;
        r4 = r33.zzA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0141, code lost:
    
        if (r3 >= r4) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0143, code lost:
    
        r33.zzB += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0232, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x023a, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x023c, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0243, code lost:
    
        r5.zzt(r10, r20, r33.zzA, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0256, code lost:
    
        if (r33.zzo.isEmpty() != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0258, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaja) r33.zzo.removeFirst();
        r33.zzv -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x026b, code lost:
    
        if (r1.zzb == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x026d, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x026e, code lost:
    
        r5 = r33.zzF;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0272, code lost:
    
        if (r8 >= r6) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0274, code lost:
    
        r5[r8].zzt(r3, 1, r1.zzc, r33.zzv, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x028c, code lost:
    
        if (r2.zzk() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x028e, code lost:
    
        r33.zzz = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0290, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0241, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x014e, code lost:
    
        r13 = r33.zzh.zzM();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0164, code lost:
    
        if (r33.zzB >= r33.zzA) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0166, code lost:
    
        r12 = r33.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x016a, code lost:
    
        if (r12 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x016c, code lost:
    
        ((com.google.android.gms.internal.ads.zzack) r34).zzn(r13, r6, r14, r9);
        r33.zzh.zzK(r9);
        r12 = r33.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x017d, code lost:
    
        if (r12 <= 0) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x017f, code lost:
    
        r33.zzC = r12 - 1;
        r33.zzg.zzK(r9);
        r5.zzr(r33.zzg, 4);
        r5.zzr(r33.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0196, code lost:
    
        if (r33.zzG.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0198, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzgm.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x01a6, code lost:
    
        if ("video/avc".equals(r12) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x01aa, code lost:
    
        if ((r17 & 31) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x01ad, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x01be, code lost:
    
        r33.zzD = r9;
        r33.zzB += 5;
        r33.zzA += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x022e, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x01b3, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x01ba, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x01bd, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01d2, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01d5, code lost:
    
        if (r33.zzD == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01d7, code lost:
    
        r33.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzack) r34).zzn(r33.zzi.zzM(), 0, r33.zzC, false);
        r5.zzr(r33.zzi, r33.zzC);
        r4 = r33.zzC;
        r8 = r33.zzi;
        r8 = com.google.android.gms.internal.ads.zzgm.zzb(r8.zzM(), r8.zze());
        r33.zzi.zzK("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzi.zzJ(r8);
        com.google.android.gms.internal.ads.zzach.zza(r10, r33.zzi, r33.zzG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0222, code lost:
    
        r33.zzB += r4;
        r33.zzC -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x021c, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x05c6  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacv r34, com.google.android.gms.internal.ads.zzadr r35) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajc.zzb(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzadr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzE = zzacxVar;
        zzg();
        zzaea[] zzaeaVarArr = new zzaea[2];
        this.zzF = zzaeaVarArr;
        int i10 = 0;
        zzaea[] zzaeaVarArr2 = (zzaea[]) zzfy.zzL(zzaeaVarArr, 0);
        this.zzF = zzaeaVarArr2;
        for (zzaea zzaeaVar : zzaeaVarArr2) {
            zzaeaVar.zzl(zzc);
        }
        this.zzG = new zzaea[this.zze.size()];
        int i11 = 100;
        while (i10 < this.zzG.length) {
            int i12 = i11 + 1;
            zzaea zzw = this.zzE.zzw(i11, 3);
            zzw.zzl((zzam) this.zze.get(i10));
            this.zzG[i10] = zzw;
            i10++;
            i11 = i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        int size = this.zzf.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzajb) this.zzf.valueAt(i10)).zzi();
        }
        this.zzo.clear();
        this.zzv = 0;
        this.zzw = j11;
        this.zzn.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        return zzajl.zza(zzacvVar);
    }
}
