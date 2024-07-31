package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class zzaka extends zzake {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfp zzfpVar) {
        return zzk(zzfpVar, zza);
    }

    private static boolean zzk(zzfp zzfpVar, byte[] bArr) {
        if (zzfpVar.zzb() < 8) {
            return false;
        }
        int zzd = zzfpVar.zzd();
        byte[] bArr2 = new byte[8];
        zzfpVar.zzG(bArr2, 0, 8);
        zzfpVar.zzK(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final long zza(zzfp zzfpVar) {
        return zzg(zzadq.zzd(zzfpVar.zzM()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final boolean zzc(zzfp zzfpVar, long j10, zzakb zzakbVar) {
        zzam zzac;
        if (zzk(zzfpVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfpVar.zzM(), zzfpVar.zze());
            int i10 = copyOf[9] & 255;
            List zze = zzadq.zze(copyOf);
            if (zzakbVar.zza == null) {
                zzak zzakVar = new zzak();
                zzakVar.zzW("audio/opus");
                zzakVar.zzy(i10);
                zzakVar.zzX(48000);
                zzakVar.zzL(zze);
                zzac = zzakVar.zzac();
                zzakbVar.zza = zzac;
                return true;
            }
            return true;
        }
        if (!zzk(zzfpVar, zzb)) {
            zzek.zzb(zzakbVar.zza);
            return false;
        }
        zzek.zzb(zzakbVar.zza);
        if (!this.zzc) {
            this.zzc = true;
            zzfpVar.zzL(8);
            zzby zzb2 = zzaeg.zzb(zzgaa.zzk(zzaeg.zzc(zzfpVar, false, false).zzb));
            if (zzb2 != null) {
                zzak zzb3 = zzakbVar.zza.zzb();
                zzb3.zzP(zzb2.zzd(zzakbVar.zza.zzk));
                zzac = zzb3.zzac();
                zzakbVar.zza = zzac;
                return true;
            }
        }
        return true;
    }
}
