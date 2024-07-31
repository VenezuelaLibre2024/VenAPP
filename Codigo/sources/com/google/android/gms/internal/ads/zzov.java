package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzov implements zzoz {
    public static final zzfxu zza = zzot.zza;
    private static final Random zzb = new Random();
    private final zzcw zzc;
    private final zzcu zzd;
    private final HashMap zze;
    private final zzfxu zzf;
    private zzoy zzg;
    private zzcx zzh;
    private String zzi;
    private long zzj;

    public zzov() {
        throw null;
    }

    public zzov(zzfxu zzfxuVar) {
        this.zzf = zzfxuVar;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        this.zze = new HashMap();
        this.zzh = zzcx.zza;
        this.zzj = -1L;
    }

    public final long zzl() {
        long j10;
        long j11;
        zzou zzouVar = (zzou) this.zze.get(this.zzi);
        if (zzouVar != null) {
            j10 = zzouVar.zzd;
            if (j10 != -1) {
                j11 = zzouVar.zzd;
                return j11;
            }
        }
        return this.zzj + 1;
    }

    private final zzou zzm(int i10, zzur zzurVar) {
        long j10;
        zzur zzurVar2;
        zzur zzurVar3;
        long j11 = Long.MAX_VALUE;
        zzou zzouVar = null;
        for (zzou zzouVar2 : this.zze.values()) {
            zzouVar2.zzg(i10, zzurVar);
            if (zzouVar2.zzj(i10, zzurVar)) {
                j10 = zzouVar2.zzd;
                if (j10 == -1 || j10 < j11) {
                    zzouVar = zzouVar2;
                    j11 = j10;
                } else if (j10 == j11) {
                    int i11 = zzfy.zza;
                    zzurVar2 = zzouVar.zze;
                    if (zzurVar2 != null) {
                        zzurVar3 = zzouVar2.zze;
                        if (zzurVar3 != null) {
                            zzouVar = zzouVar2;
                        }
                    }
                }
            }
        }
        if (zzouVar != null) {
            return zzouVar;
        }
        String zzn = zzn();
        zzou zzouVar3 = new zzou(this, zzn, i10, zzurVar);
        this.zze.put(zzn, zzouVar3);
        return zzouVar3;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzou zzouVar) {
        long j10;
        long j11;
        j10 = zzouVar.zzd;
        if (j10 != -1) {
            j11 = zzouVar.zzd;
            this.zzj = j11;
        }
        this.zzi = null;
    }

    private final void zzp(zzmq zzmqVar) {
        String str;
        long j10;
        zzur zzurVar;
        zzur zzurVar2;
        zzur zzurVar3;
        String unused;
        String unused2;
        if (zzmqVar.zzb.zzo()) {
            String str2 = this.zzi;
            if (str2 != null) {
                zzou zzouVar = (zzou) this.zze.get(str2);
                zzouVar.getClass();
                zzo(zzouVar);
                return;
            }
            return;
        }
        zzou zzouVar2 = (zzou) this.zze.get(this.zzi);
        zzou zzm = zzm(zzmqVar.zzc, zzmqVar.zzd);
        str = zzm.zzb;
        this.zzi = str;
        zzi(zzmqVar);
        zzur zzurVar4 = zzmqVar.zzd;
        if (zzurVar4 == null || !zzurVar4.zzb()) {
            return;
        }
        if (zzouVar2 != null) {
            long j11 = zzurVar4.zzd;
            j10 = zzouVar2.zzd;
            if (j10 == j11) {
                zzurVar = zzouVar2.zze;
                if (zzurVar != null) {
                    zzurVar2 = zzouVar2.zze;
                    if (zzurVar2.zzb == zzmqVar.zzd.zzb) {
                        zzurVar3 = zzouVar2.zze;
                        if (zzurVar3.zzc == zzmqVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zzur zzurVar5 = zzmqVar.zzd;
        unused = zzm(zzmqVar.zzc, new zzur(zzurVar5.zza, zzurVar5.zzd)).zzb;
        unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized String zzf(zzcx zzcxVar, zzur zzurVar) {
        String str;
        str = zzm(zzcxVar.zzn(zzurVar.zza, this.zzd).zzd, zzurVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzg(zzmq zzmqVar) {
        boolean z10;
        zzoy zzoyVar;
        String str;
        String str2 = this.zzi;
        if (str2 != null) {
            zzou zzouVar = (zzou) this.zze.get(str2);
            zzouVar.getClass();
            zzo(zzouVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar2 = (zzou) it.next();
            it.remove();
            z10 = zzouVar2.zzf;
            if (z10 && (zzoyVar = this.zzg) != null) {
                str = zzouVar2.zzb;
                zzoyVar.zzd(zzmqVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzh(zzoy zzoyVar) {
        this.zzg = zzoyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r0 == r10.zzc) goto L63;
     */
    @Override // com.google.android.gms.internal.ads.zzoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzmq r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzoy r0 = r9.zzg     // Catch: java.lang.Throwable -> Lc6
            r0.getClass()
            com.google.android.gms.internal.ads.zzcx r0 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L10
            goto Lc4
        L10:
            com.google.android.gms.internal.ads.zzur r0 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = r9.zzl()     // Catch: java.lang.Throwable -> Lc6
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc4
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzou r0 = (com.google.android.gms.internal.ads.zzou) r0     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = com.google.android.gms.internal.ads.zzou.zzb(r0)     // Catch: java.lang.Throwable -> Lc6
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r0 = com.google.android.gms.internal.ads.zzou.zza(r0)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            if (r0 != r1) goto Lc4
        L3c:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzou r0 = r9.zzm(r0, r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.google.android.gms.internal.ads.zzou.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r9.zzi = r1     // Catch: java.lang.Throwable -> Lc6
        L4e:
            com.google.android.gms.internal.ads.zzur r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            r2 = 1
            if (r1 == 0) goto L98
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L98
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> Lc6
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lc6
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r6 = new com.google.android.gms.internal.ads.zzur     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzou r1 = r9.zzm(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zzou.zzi(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L98
            com.google.android.gms.internal.ads.zzou.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzcx r3 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzcu r5 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lc6
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzcu r3 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lc6
            r3.zzi(r4)     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzfy.zzt(r3)     // Catch: java.lang.Throwable -> Lc6
            long r7 = com.google.android.gms.internal.ads.zzfy.zzt(r3)     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzou.zzd(r1)     // Catch: java.lang.Throwable -> Lc6
        L98:
            boolean r1 = com.google.android.gms.internal.ads.zzou.zzi(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto La4
            com.google.android.gms.internal.ads.zzou.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzou.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
        La4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzou.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = r9.zzi     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc4
            boolean r1 = com.google.android.gms.internal.ads.zzou.zzh(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto Lc4
            com.google.android.gms.internal.ads.zzou.zze(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoy r1 = r9.zzg     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = com.google.android.gms.internal.ads.zzou.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r9)
            return
        Lc4:
            monitor-exit(r9)
            return
        Lc6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzov.zzi(com.google.android.gms.internal.ads.zzmq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzj(zzmq zzmqVar, int i10) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        this.zzg.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar = (zzou) it.next();
            if (zzouVar.zzk(zzmqVar)) {
                it.remove();
                z10 = zzouVar.zzf;
                if (z10) {
                    str = zzouVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z12 = false;
                    if (i10 == 0 && equals) {
                        z11 = zzouVar.zzg;
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (equals) {
                        zzo(zzouVar);
                    }
                    zzoy zzoyVar = this.zzg;
                    str2 = zzouVar.zzb;
                    zzoyVar.zzd(zzmqVar, str2, z12);
                }
            }
        }
        zzp(zzmqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzk(zzmq zzmqVar) {
        boolean z10;
        String str;
        String str2;
        this.zzg.getClass();
        zzcx zzcxVar = this.zzh;
        this.zzh = zzmqVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar = (zzou) it.next();
            if (!zzouVar.zzl(zzcxVar, this.zzh) || zzouVar.zzk(zzmqVar)) {
                it.remove();
                z10 = zzouVar.zzf;
                if (z10) {
                    str = zzouVar.zzb;
                    if (str.equals(this.zzi)) {
                        zzo(zzouVar);
                    }
                    zzoy zzoyVar = this.zzg;
                    str2 = zzouVar.zzb;
                    zzoyVar.zzd(zzmqVar, str2, false);
                }
            }
        }
        zzp(zzmqVar);
    }
}
