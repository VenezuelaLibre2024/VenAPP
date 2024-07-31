package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzfst {
    final zzfsw zza;
    final boolean zzb;

    private zzfst(zzfsw zzfswVar) {
        this.zza = zzfswVar;
        this.zzb = zzfswVar != null;
    }

    public static zzfst zzb(Context context, String str, String str2) {
        zzfsw zzfsuVar;
        try {
            try {
                try {
                    IBinder d10 = DynamiteModule.e(context, DynamiteModule.f9718b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d10 == null) {
                        zzfsuVar = null;
                    } else {
                        IInterface queryLocalInterface = d10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfsuVar = queryLocalInterface instanceof zzfsw ? (zzfsw) queryLocalInterface : new zzfsu(d10);
                    }
                    zzfsuVar.zze(com.google.android.gms.dynamic.d.h2(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfst(zzfsuVar);
                } catch (RemoteException | zzfrv | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new zzfst(new zzfsx());
                }
            } catch (Exception e10) {
                throw new zzfrv(e10);
            }
        } catch (Exception e11) {
            throw new zzfrv(e11);
        }
    }

    public static zzfst zzc() {
        zzfsx zzfsxVar = new zzfsx();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfst(zzfsxVar);
    }

    public final zzfss zza(byte[] bArr) {
        return new zzfss(this, bArr, null);
    }
}
