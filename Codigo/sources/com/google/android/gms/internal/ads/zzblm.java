package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.f;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzblm extends com.google.android.gms.dynamic.f {
    public zzblm() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbjz ? (zzbjz) queryLocalInterface : new zzbjx(iBinder);
    }

    public final zzbjw zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzbjz) getRemoteCreatorInstance(view.getContext())).zze(com.google.android.gms.dynamic.d.h2(view), com.google.android.gms.dynamic.d.h2(hashMap), com.google.android.gms.dynamic.d.h2(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbjw ? (zzbjw) queryLocalInterface : new zzbju(zze);
        } catch (RemoteException | f.a e10) {
            zzcec.zzk("Could not create remote NativeAdViewHolderDelegate.", e10);
            return null;
        }
    }
}
