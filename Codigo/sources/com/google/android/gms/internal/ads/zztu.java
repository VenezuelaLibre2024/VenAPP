package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zztu implements zzvi {
    private final zzadb zza;
    private zzacu zzb;
    private zzacv zzc;

    public zztu(zzadb zzadbVar) {
        this.zza = zzadbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final int zza(zzadr zzadrVar) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacv zzacvVar = this.zzc;
        zzacvVar.getClass();
        return zzacuVar.zzb(zzacvVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final long zzb() {
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            return zzacvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzc() {
        zzacu zzacuVar = this.zzb;
        if (zzacuVar != null && (zzacuVar instanceof zzaig)) {
            ((zzaig) zzacuVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if (r6.zzf() != r11) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0061, code lost:
    
        if (r6.zzf() != r11) goto L91;
     */
    @Override // com.google.android.gms.internal.ads.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzu r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzacx r15) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzack r6 = new com.google.android.gms.internal.ads.zzack
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzacu r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzadb r8 = r7.zza
            com.google.android.gms.internal.ads.zzacu[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.zzb = r8
            goto Lb5
        L21:
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.zze(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.zzb = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.google.android.gms.internal.ads.zzek.zzf(r14)
            r6.zzj()
            goto L70
        L35:
            com.google.android.gms.internal.ads.zzacu r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzacu r9 = r7.zzb
            if (r9 != 0) goto L4f
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            com.google.android.gms.internal.ads.zzek.zzf(r13)
            r6.zzj()
            throw r8
        L57:
            com.google.android.gms.internal.ads.zzacu r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            com.google.android.gms.internal.ads.zzek.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L22
        L70:
            com.google.android.gms.internal.ads.zzacu r10 = r7.zzb
            if (r10 != 0) goto Lb5
            com.google.android.gms.internal.ads.zzwt r10 = new com.google.android.gms.internal.ads.zzwt
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L7b:
            int r12 = r8.length
            if (r13 >= r12) goto L97
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r11.append(r14)
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L94
            java.lang.String r12 = ", "
            r11.append(r12)
        L94:
            int r13 = r13 + 1
            goto L7b
        L97:
            java.lang.String r8 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        Lb5:
            com.google.android.gms.internal.ads.zzacu r8 = r7.zzb
            r8.zzc(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztu.zzd(com.google.android.gms.internal.ads.zzu, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzacx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzf(long j10, long j11) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzd(j10, j11);
    }
}
