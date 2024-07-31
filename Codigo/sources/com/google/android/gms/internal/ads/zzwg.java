package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzwg implements zzaea {
    private boolean zzB;
    private zzrz zzC;
    private final zzwa zza;
    private final zzry zzd;
    private final zzrs zze;
    private zzwf zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzwc zzb = new zzwc();
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private long[] zzi = new long[AdError.NETWORK_ERROR_CODE];
    private long[] zzj = new long[AdError.NETWORK_ERROR_CODE];
    private long[] zzm = new long[AdError.NETWORK_ERROR_CODE];
    private int[] zzl = new int[AdError.NETWORK_ERROR_CODE];
    private int[] zzk = new int[AdError.NETWORK_ERROR_CODE];
    private zzadz[] zzn = new zzadz[AdError.NETWORK_ERROR_CODE];
    private final zzwn zzc = new zzwn(new zzep() { // from class: com.google.android.gms.internal.ads.zzwb
        @Override // com.google.android.gms.internal.ads.zzep
        public final void zza(Object obj) {
            throw null;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzwg(zzyx zzyxVar, zzry zzryVar, zzrs zzrsVar) {
        this.zzd = zzryVar;
        this.zze = zzrsVar;
        this.zza = new zzwa(zzyxVar);
    }

    private final int zzB(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzm[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzC(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int zzD(zzlb zzlbVar, zzih zzihVar, boolean z10, boolean z11, zzwc zzwcVar) {
        zzihVar.zzd = false;
        if (!zzL()) {
            if (!z11 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z10 && zzamVar == this.zzg)) {
                    return -3;
                }
                zzI(zzamVar, zzlbVar);
                return -5;
            }
            zzihVar.zzc(4);
            zzihVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzam zzamVar2 = ((zzwe) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z10 && zzamVar2 == this.zzg) {
            int zzC = zzC(this.zzr);
            if (!zzM(zzC)) {
                zzihVar.zzd = true;
                return -3;
            }
            zzihVar.zzc(this.zzl[zzC]);
            if (this.zzr == this.zzo - 1 && (z11 || this.zzv)) {
                zzihVar.zza(536870912);
            }
            long j10 = this.zzm[zzC];
            zzihVar.zze = j10;
            if (j10 < this.zzs) {
                zzihVar.zza(Integer.MIN_VALUE);
            }
            zzwcVar.zza = this.zzk[zzC];
            zzwcVar.zzb = this.zzj[zzC];
            zzwcVar.zzc = this.zzn[zzC];
            return -4;
        }
        zzI(zzamVar2, zzlbVar);
        return -5;
    }

    private final synchronized long zzE(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzo;
        if (i11 != 0) {
            long[] jArr = this.zzm;
            int i12 = this.zzq;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzr) != i11) {
                    i11 = i10 + 1;
                }
                int zzB = zzB(i12, i11, j10, false);
                if (zzB != -1) {
                    return zzG(zzB);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzF() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzG(i10);
    }

    private final long zzG(int i10) {
        long j10 = this.zzt;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzC = zzC(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                j11 = Math.max(j11, this.zzm[zzC]);
                if ((this.zzl[zzC] & 1) != 0) {
                    break;
                }
                zzC--;
                if (zzC == -1) {
                    zzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, j11);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i16 = this.zzq;
        if (i16 == 0) {
            i16 = this.zzh;
        }
        return this.zzj[i16 - 1] + this.zzk[r12];
    }

    private final synchronized void zzH(long j10, int i10, long j11, int i11, zzadz zzadzVar) {
        int i12 = this.zzo;
        if (i12 > 0) {
            int zzC = zzC(i12 - 1);
            zzek.zzd(this.zzj[zzC] + ((long) this.zzk[zzC]) <= j11);
        }
        this.zzv = (536870912 & i10) != 0;
        this.zzu = Math.max(this.zzu, j10);
        int zzC2 = zzC(this.zzo);
        this.zzm[zzC2] = j10;
        this.zzj[zzC2] = j11;
        this.zzk[zzC2] = i11;
        this.zzl[zzC2] = i10;
        this.zzn[zzC2] = zzadzVar;
        this.zzi[zzC2] = 0;
        if (this.zzc.zzf() || !((zzwe) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzam zzamVar = this.zzz;
            zzamVar.getClass();
            this.zzc.zzc(this.zzp + this.zzo, new zzwe(zzamVar, zzrx.zzb, null));
        }
        int i13 = this.zzo + 1;
        this.zzo = i13;
        int i14 = this.zzh;
        if (i13 == i14) {
            int i15 = i14 + AdError.NETWORK_ERROR_CODE;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzadz[] zzadzVarArr = new zzadz[i15];
            int i16 = this.zzq;
            int i17 = i14 - i16;
            System.arraycopy(this.zzj, i16, jArr2, 0, i17);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i17);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i17);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzq, zzadzVarArr, 0, i17);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i17);
            int i18 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i17, i18);
            System.arraycopy(this.zzm, 0, jArr3, i17, i18);
            System.arraycopy(this.zzl, 0, iArr, i17, i18);
            System.arraycopy(this.zzk, 0, iArr2, i17, i18);
            System.arraycopy(this.zzn, 0, zzadzVarArr, i17, i18);
            System.arraycopy(this.zzi, 0, jArr, i17, i18);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzadzVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i15;
        }
    }

    private final void zzI(zzam zzamVar, zzlb zzlbVar) {
        zzam zzamVar2 = this.zzg;
        zzae zzaeVar = zzamVar2 == null ? null : zzamVar2.zzp;
        this.zzg = zzamVar;
        zzae zzaeVar2 = zzamVar.zzp;
        zzlbVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzlbVar.zzb = this.zzC;
        if (zzamVar2 == null || !zzfy.zzF(zzaeVar, zzaeVar2)) {
            zzrz zzrzVar = zzamVar.zzp != null ? new zzrz(new zzrq(new zzsb(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzC = zzrzVar;
            zzlbVar.zzb = zzrzVar;
        }
    }

    private final void zzJ() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i10) {
        if (this.zzC != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(zzam zzamVar) {
        this.zzx = false;
        if (zzfy.zzF(zzamVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzwe) this.zzc.zzb()).zza.equals(zzamVar)) {
            zzamVar = ((zzwe) this.zzc.zzb()).zza;
        }
        this.zzz = zzamVar;
        boolean z10 = this.zzA;
        zzam zzamVar2 = this.zzz;
        this.zzA = z10 & zzcb.zzf(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzwe zzweVar) {
        zzrx zzrxVar = zzweVar.zzb;
        int i10 = zzrw.zza;
    }

    public final synchronized boolean zzA(long j10, boolean z10) {
        int zzB;
        zzK();
        int i10 = this.zzr;
        int zzC = zzC(i10);
        if (zzL() && j10 >= this.zzm[zzC]) {
            if (j10 > this.zzu) {
                if (z10) {
                    z10 = true;
                }
            }
            if (this.zzA) {
                zzB = this.zzo - i10;
                int i11 = 0;
                while (true) {
                    if (i11 < zzB) {
                        if (this.zzm[zzC] >= j10) {
                            zzB = i11;
                            break;
                        }
                        zzC++;
                        if (zzC == this.zzh) {
                            zzC = 0;
                        }
                        i11++;
                    } else if (!z10) {
                        zzB = -1;
                    }
                }
            } else {
                zzB = zzB(zzC, this.zzo - i10, j10, true);
            }
            if (zzB != -1) {
                this.zzs = j10;
                this.zzr += zzB;
                return true;
            }
        }
        return false;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j10, boolean z10) {
        int i10 = this.zzr;
        int zzC = zzC(i10);
        if (zzL() && j10 >= this.zzm[zzC]) {
            if (j10 > this.zzu && z10) {
                return this.zzo - i10;
            }
            int zzB = zzB(zzC, this.zzo - i10, j10, true);
            if (zzB == -1) {
                return 0;
            }
            return zzB;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(com.google.android.gms.internal.ads.zzlb r9, com.google.android.gms.internal.ads.zzih r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzwc r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzD(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzwa r9 = r8.zza
            com.google.android.gms.internal.ads.zzwc r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzwa r9 = r8.zza
            com.google.android.gms.internal.ads.zzwc r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwg.zze(com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzih, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final /* synthetic */ int zzf(zzu zzuVar, int i10, boolean z10) {
        return zzady.zza(this, zzuVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final int zzg(zzu zzuVar, int i10, boolean z10, int i11) {
        return this.zza.zza(zzuVar, i10, z10);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzam zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzE(j10, false, z11));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzl(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zzN = zzN(zzamVar);
        zzwf zzwfVar = this.zzf;
        if (zzwfVar == null || !zzN) {
            return;
        }
        zzwfVar.zzM(zzamVar);
    }

    public final void zzn() {
        zzrz zzrzVar = this.zzC;
        if (zzrzVar != null) {
            throw zzrzVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final /* synthetic */ void zzr(zzfp zzfpVar, int i10) {
        zzady.zzb(this, zzfpVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzs(zzfp zzfpVar, int i10, int i11) {
        this.zza.zzh(zzfpVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzt(long j10, int i10, int i11, int i12, zzadz zzadzVar) {
        if (this.zzw) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j10 < this.zzs) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzB) {
                    zzff.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        zzH(j10, i10, (this.zza.zzb() - i11) - i12, i11, zzadzVar);
    }

    public final void zzu(long j10) {
        this.zzs = j10;
    }

    public final void zzv(zzwf zzwfVar) {
        this.zzf = zzwfVar;
    }

    public final synchronized void zzw(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzek.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z10) {
        boolean z11 = true;
        if (zzL()) {
            if (((zzwe) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z10 && !this.zzv) {
            zzam zzamVar = this.zzz;
            if (zzamVar == null) {
                z11 = false;
            } else if (zzamVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean zzz(int i10) {
        zzK();
        int i11 = this.zzp;
        if (i10 >= i11 && i10 <= this.zzo + i11) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i10 - i11;
            return true;
        }
        return false;
    }
}
