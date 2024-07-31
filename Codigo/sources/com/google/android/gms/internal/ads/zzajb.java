package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
final class zzajb {
    public final zzaea zza;
    public zzajp zzd;
    public zzaix zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzajo zzb = new zzajo();
    public final zzfp zzc = new zzfp();
    private final zzfp zzj = new zzfp(1);
    private final zzfp zzk = new zzfp();

    public zzajb(zzaea zzaeaVar, zzajp zzajpVar, zzaix zzaixVar) {
        this.zza = zzaeaVar;
        this.zzd = zzajpVar;
        this.zze = zzaixVar;
        zzh(zzajpVar, zzaixVar);
    }

    public final int zza() {
        int i10 = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i10 | 1073741824 : i10;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzfp zzfpVar;
        zzajn zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i12 = zzf.zzd;
        if (i12 != 0) {
            zzfpVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i13 = zzfy.zza;
            zzfp zzfpVar2 = this.zzk;
            int length = bArr.length;
            zzfpVar2.zzI(bArr, length);
            zzfpVar = this.zzk;
            i12 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z10 = zzb || i11 != 0;
        zzfp zzfpVar3 = this.zzj;
        zzfpVar3.zzM()[0] = (byte) ((true != z10 ? 0 : RecognitionOptions.ITF) | i12);
        zzfpVar3.zzK(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzfpVar, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        if (!zzb) {
            this.zzc.zzH(8);
            zzfp zzfpVar4 = this.zzc;
            byte[] zzM = zzfpVar4.zzM();
            zzM[0] = 0;
            zzM[1] = 1;
            zzM[2] = 0;
            zzM[3] = (byte) i11;
            zzM[4] = (byte) ((i10 >> 24) & 255);
            zzM[5] = (byte) ((i10 >> 16) & 255);
            zzM[6] = (byte) ((i10 >> 8) & 255);
            zzM[7] = (byte) (i10 & 255);
            this.zza.zzs(zzfpVar4, 8, 1);
            return i12 + 9;
        }
        int i14 = i12 + 1;
        zzfp zzfpVar5 = this.zzb.zzn;
        int zzq = zzfpVar5.zzq();
        zzfpVar5.zzL(-2);
        int i15 = (zzq * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzH(i15);
            byte[] zzM2 = this.zzc.zzM();
            zzfpVar5.zzG(zzM2, 0, i15);
            int i16 = (((zzM2[2] & 255) << 8) | (zzM2[3] & 255)) + i11;
            zzM2[2] = (byte) ((i16 >> 8) & 255);
            zzM2[3] = (byte) (i16 & 255);
            zzfpVar5 = this.zzc;
        }
        this.zza.zzs(zzfpVar5, i15, 1);
        return i14 + i15;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzajo zzajoVar = this.zzb;
        return zzajoVar.zzi[this.zzf];
    }

    public final zzajn zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajo zzajoVar = this.zzb;
        zzaix zzaixVar = zzajoVar.zza;
        int i10 = zzfy.zza;
        int i11 = zzaixVar.zza;
        zzajn zzajnVar = zzajoVar.zzm;
        if (zzajnVar == null) {
            zzajnVar = this.zzd.zza.zza(i11);
        }
        if (zzajnVar == null || !zzajnVar.zza) {
            return null;
        }
        return zzajnVar;
    }

    public final void zzh(zzajp zzajpVar, zzaix zzaixVar) {
        this.zzd = zzajpVar;
        this.zze = zzaixVar;
        this.zza.zzl(zzajpVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzajo zzajoVar = this.zzb;
        zzajoVar.zzd = 0;
        zzajoVar.zzp = 0L;
        zzajoVar.zzq = false;
        zzajoVar.zzk = false;
        zzajoVar.zzo = false;
        zzajoVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}
