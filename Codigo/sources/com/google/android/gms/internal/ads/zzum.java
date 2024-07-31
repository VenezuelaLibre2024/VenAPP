package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzum extends zzwu {
    private final boolean zzb;
    private final zzcw zzc;
    private final zzcu zzd;
    private zzuk zze;
    private zzuj zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzum(zzut zzutVar, boolean z10) {
        super(zzutVar);
        boolean z11;
        if (z10) {
            zzutVar.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        zzutVar.zzM();
        this.zze = zzuk.zzq(zzutVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzuk.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    private final void zzL(long j10) {
        zzuj zzujVar = this.zzf;
        int zza = this.zze.zza(zzujVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzuk zzukVar = this.zze;
        zzcu zzcuVar = this.zzd;
        zzukVar.zzd(zza, zzcuVar, false);
        long j11 = zzcuVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zzujVar.zzs(j10);
    }

    public final zzcx zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    protected final zzur zzD(zzur zzurVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zzf;
        Object obj3 = zzurVar.zza;
        if (obj != null) {
            obj2 = this.zze.zzf;
            if (obj2.equals(obj3)) {
                obj3 = zzuk.zzd;
            }
        }
        return zzurVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzcx r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzuk r0 = r14.zze
            com.google.android.gms.internal.ads.zzuk r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuj r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzuk r0 = r14.zze
            com.google.android.gms.internal.ads.zzuk r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcw.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzuk.zzd
            com.google.android.gms.internal.ads.zzuk r15 = com.google.android.gms.internal.ads.zzuk.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzcw r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcw r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzuj r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzuk r8 = r14.zze
            com.google.android.gms.internal.ads.zzcu r9 = r14.zzd
            com.google.android.gms.internal.ads.zzur r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzuk r5 = r14.zze
            com.google.android.gms.internal.ads.zzcw r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcw r9 = r14.zzc
            com.google.android.gms.internal.ads.zzcu r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzuk r0 = r14.zze
            com.google.android.gms.internal.ads.zzuk r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzuk r15 = com.google.android.gms.internal.ads.zzuk.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuj r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzL(r4)
            com.google.android.gms.internal.ads.zzur r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzur r1 = r15.zza(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzuk r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zzuj r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzum.zzE(com.google.android.gms.internal.ads.zzcx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwu) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwu, com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzuj) zzupVar).zzt();
        if (zzupVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu, com.google.android.gms.internal.ads.zzut
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzuj zzI(zzur zzurVar, zzyx zzyxVar, long j10) {
        zzuj zzujVar = new zzuj(zzurVar, zzyxVar, j10);
        zzujVar.zzu(((zzwu) this).zza);
        if (this.zzh) {
            zzujVar.zzr(zzurVar.zza(zzK(zzurVar.zza)));
        } else {
            this.zzf = zzujVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwu) this).zza);
            }
        }
        return zzujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzts
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzts, com.google.android.gms.internal.ads.zzut
    public final void zzt(zzbp zzbpVar) {
        this.zze = this.zzi ? this.zze.zzp(new zzwq(this.zze.zzc, zzbpVar)) : zzuk.zzq(zzbpVar);
        ((zzwu) this).zza.zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}
