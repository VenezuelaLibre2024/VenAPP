package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaju extends zzake {
    private zzadh zza;
    private zzajt zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final long zza(zzfp zzfpVar) {
        if (!zzd(zzfpVar.zzM())) {
            return -1L;
        }
        int i10 = (zzfpVar.zzM()[2] & 255) >> 4;
        if (i10 != 6) {
            if (i10 == 7) {
                i10 = 7;
            }
            int zza = zzadd.zza(zzfpVar, i10);
            zzfpVar.zzK(0);
            return zza;
        }
        zzfpVar.zzL(4);
        zzfpVar.zzw();
        int zza2 = zzadd.zza(zzfpVar, i10);
        zzfpVar.zzK(0);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final boolean zzc(zzfp zzfpVar, long j10, zzakb zzakbVar) {
        byte[] zzM = zzfpVar.zzM();
        zzadh zzadhVar = this.zza;
        if (zzadhVar == null) {
            zzadh zzadhVar2 = new zzadh(zzM, 17);
            this.zza = zzadhVar2;
            zzakbVar.zza = zzadhVar2.zzc(Arrays.copyOfRange(zzM, 9, zzfpVar.zze()), null);
            return true;
        }
        if ((zzM[0] & Byte.MAX_VALUE) == 3) {
            zzadg zzb = zzade.zzb(zzfpVar);
            zzadh zzf = zzadhVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzajt(zzf, zzb);
            return true;
        }
        if (!zzd(zzM)) {
            return true;
        }
        zzajt zzajtVar = this.zzb;
        if (zzajtVar != null) {
            zzajtVar.zza(j10);
            zzakbVar.zzb = this.zzb;
        }
        zzakbVar.zza.getClass();
        return false;
    }
}
