package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class zzadm {
    private final zzfp zza = new zzfp(10);

    public final zzby zza(zzacv zzacvVar, zzago zzagoVar) {
        zzby zzbyVar = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzack) zzacvVar).zzm(this.zza.zzM(), 0, 10, false);
                this.zza.zzK(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzL(3);
                int zzl = this.zza.zzl();
                int i11 = zzl + 10;
                if (zzbyVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzM(), 0, bArr, 0, 10);
                    ((zzack) zzacvVar).zzm(bArr, 10, zzl, false);
                    zzbyVar = zzagq.zza(bArr, i11, zzagoVar, new zzafr());
                } else {
                    ((zzack) zzacvVar).zzl(zzl, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzacvVar.zzj();
        ((zzack) zzacvVar).zzl(i10, false);
        return zzbyVar;
    }
}
