package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class zzalf implements zzakr {
    private final zzfp zza = new zzfp();
    private final zzfp zzb = new zzfp();
    private final zzale zzc = new zzale();
    private Inflater zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzep zzepVar) {
        this.zza.zzI(bArr, i11 + i10);
        this.zza.zzK(i10);
        zzfp zzfpVar = this.zza;
        if (zzfpVar.zzb() > 0 && zzfpVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzfy.zzG(zzfpVar, this.zzb, this.zzd)) {
                zzfp zzfpVar2 = this.zzb;
                zzfpVar.zzI(zzfpVar2.zzM(), zzfpVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfp zzfpVar3 = this.zza;
            if (zzfpVar3.zzb() < 3) {
                zzepVar.zza(new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzale zzaleVar = this.zzc;
            int zze = zzfpVar3.zze();
            int zzm = zzfpVar3.zzm();
            int zzq = zzfpVar3.zzq();
            int zzd = zzfpVar3.zzd() + zzq;
            zzec zzecVar = null;
            if (zzd > zze) {
                zzfpVar3.zzK(zze);
            } else {
                if (zzm != 128) {
                    switch (zzm) {
                        case 20:
                            zzale.zzd(zzaleVar, zzfpVar3, zzq);
                            break;
                        case 21:
                            zzale.zzb(zzaleVar, zzfpVar3, zzq);
                            break;
                        case 22:
                            zzale.zzc(zzaleVar, zzfpVar3, zzq);
                            break;
                    }
                } else {
                    zzec zza = zzaleVar.zza();
                    zzaleVar.zze();
                    zzecVar = zza;
                }
                zzfpVar3.zzK(zzd);
            }
            if (zzecVar != null) {
                arrayList.add(zzecVar);
            }
        }
    }
}
