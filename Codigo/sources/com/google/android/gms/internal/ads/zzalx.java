package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzalx implements zzakr {
    private final zzfp zza = new zzfp();

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzep zzepVar) {
        zzec zzp;
        this.zza.zzI(bArr, i11 + i10);
        this.zza.zzK(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfp zzfpVar = this.zza;
            if (zzfpVar.zzb() <= 0) {
                zzepVar.zza(new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzek.zze(zzfpVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzfp zzfpVar2 = this.zza;
            int zzg = zzfpVar2.zzg() - 8;
            if (zzfpVar2.zzg() == 1987343459) {
                zzfp zzfpVar3 = this.zza;
                CharSequence charSequence = null;
                zzea zzeaVar = null;
                while (zzg > 0) {
                    zzek.zze(zzg >= 8, "Incomplete vtt cue box header found.");
                    int zzg2 = zzfpVar3.zzg();
                    int zzg3 = zzfpVar3.zzg();
                    int i12 = zzg - 8;
                    int i13 = zzg2 - 8;
                    String zzA = zzfy.zzA(zzfpVar3.zzM(), zzfpVar3.zzd(), i13);
                    zzfpVar3.zzL(i13);
                    if (zzg3 == 1937011815) {
                        zzeaVar = zzamh.zzb(zzA);
                    } else if (zzg3 == 1885436268) {
                        charSequence = zzamh.zza(null, zzA.trim(), Collections.emptyList());
                    }
                    zzg = i12 - i13;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzeaVar != null) {
                    zzeaVar.zzl(charSequence);
                    zzp = zzeaVar.zzp();
                } else {
                    zzamg zzamgVar = new zzamg();
                    zzamgVar.zzc = charSequence;
                    zzp = zzamgVar.zza().zzp();
                }
                arrayList.add(zzp);
            } else {
                this.zza.zzL(zzg);
            }
        }
    }
}
