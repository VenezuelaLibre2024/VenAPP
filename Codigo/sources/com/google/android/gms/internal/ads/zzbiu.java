package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbiu {
    private final Context zza;

    public zzbiu(Context context) {
        this.zza = context;
    }

    public final void zza(zzbyd zzbydVar) {
        String valueOf;
        String str;
        try {
            ((zzbiv) zzceg.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcee() { // from class: com.google.android.gms.internal.ads.zzbit
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zzbiv ? (zzbiv) queryLocalInterface : new zzbiv(obj);
                }
            })).zze(zzbydVar);
        } catch (RemoteException e10) {
            valueOf = String.valueOf(e10.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            zzcec.zzj(str.concat(valueOf));
        } catch (zzcef e11) {
            valueOf = String.valueOf(e11.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            zzcec.zzj(str.concat(valueOf));
        }
    }
}
