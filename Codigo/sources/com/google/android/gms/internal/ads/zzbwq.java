package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.f;

/* loaded from: classes2.dex */
public final class zzbwq extends com.google.android.gms.dynamic.f {
    public zzbwq() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbww ? (zzbww) queryLocalInterface : new zzbwu(iBinder);
    }

    public final zzbwt zza(Activity activity) {
        try {
            IBinder zze = ((zzbww) getRemoteCreatorInstance(activity)).zze(com.google.android.gms.dynamic.d.h2(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbwt ? (zzbwt) queryLocalInterface : new zzbwr(zze);
        } catch (RemoteException e10) {
            zzcec.zzk("Could not create remote AdOverlay.", e10);
            return null;
        } catch (f.a e11) {
            zzcec.zzk("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
