package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes2.dex */
final class zzafb extends zzafg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafb(zzaea zzaeaVar) {
        super(zzaeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzfp zzfpVar) {
        zzam zzac;
        if (this.zzc) {
            zzfpVar.zzL(1);
        } else {
            int zzm = zzfpVar.zzm();
            int i10 = zzm >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzm >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzW("audio/mpeg");
                zzakVar.zzy(1);
                zzakVar.zzX(i11);
                zzac = zzakVar.zzac();
            } else if (i10 == 7 || i10 == 8) {
                zzak zzakVar2 = new zzak();
                zzakVar2.zzW(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzakVar2.zzy(1);
                zzakVar2.zzX(8000);
                zzac = zzakVar2.zzac();
            } else {
                if (i10 != 10) {
                    throw new zzaff("Audio format not supported: " + i10);
                }
                this.zzc = true;
            }
            this.zza.zzl(zzac);
            this.zzd = true;
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzfp zzfpVar, long j10) {
        if (this.zze == 2) {
            int zzb2 = zzfpVar.zzb();
            this.zza.zzr(zzfpVar, zzb2);
            this.zza.zzt(j10, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzfpVar.zzm();
        if (zzm != 0 || this.zzd) {
            if (this.zze == 10 && zzm != 1) {
                return false;
            }
            int zzb3 = zzfpVar.zzb();
            this.zza.zzr(zzfpVar, zzb3);
            this.zza.zzt(j10, 1, zzb3, 0, null);
            return true;
        }
        int zzb4 = zzfpVar.zzb();
        byte[] bArr = new byte[zzb4];
        zzfpVar.zzG(bArr, 0, zzb4);
        zzabr zza = zzabs.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/mp4a-latm");
        zzakVar.zzz(zza.zzc);
        zzakVar.zzy(zza.zzb);
        zzakVar.zzX(zza.zza);
        zzakVar.zzL(Collections.singletonList(bArr));
        this.zza.zzl(zzakVar.zzac());
        this.zzd = true;
        return false;
    }
}
