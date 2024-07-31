package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfmn {
    public static zzfmo zza(Context context, int i10) {
        zzbhm zzbhmVar;
        if (zzfnc.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zzbhmVar = zzbht.zzc;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zzbhmVar = zzbht.zzd;
                        break;
                    case 5:
                        zzbhmVar = zzbht.zzb;
                        break;
                }
            } else {
                zzbhmVar = zzbht.zze;
            }
            if (((Boolean) zzbhmVar.zze()).booleanValue()) {
                return new zzfmq(context, i10);
            }
        }
        return new zzfnl();
    }

    public static zzfmo zzb(Context context, int i10, int i11, u4 u4Var) {
        zzfmo zza = zza(context, i10);
        if (zza instanceof zzfmq) {
            zza.zzh();
            zza.zzm(i11);
            if (zzfmy.zze(u4Var.A)) {
                zza.zze(u4Var.A);
            }
        }
        return zza;
    }
}
