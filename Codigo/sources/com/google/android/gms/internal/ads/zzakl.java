package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzakl {
    public static void zza(zzakm zzakmVar, zzakq zzakqVar, zzep zzepVar) {
        for (int i10 = 0; i10 < zzakmVar.zza(); i10++) {
            long zzb = zzakmVar.zzb(i10);
            List zzc = zzakmVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i10 == zzakmVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                zzepVar.zza(new zzakj(zzc, zzb, zzakmVar.zzb(i10 + 1) - zzakmVar.zzb(i10)));
            }
        }
    }
}
