package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.f;

/* loaded from: classes2.dex */
public final class zzbll extends com.google.android.gms.dynamic.f {
    public zzbll() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbjt ? (zzbjt) queryLocalInterface : new zzbjr(iBinder);
    }

    public final zzbjq zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbjt) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.d.h2(context), com.google.android.gms.dynamic.d.h2(frameLayout), com.google.android.gms.dynamic.d.h2(frameLayout2), 240304000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbjq ? (zzbjq) queryLocalInterface : new zzbjo(zze);
        } catch (RemoteException | f.a e10) {
            zzcec.zzk("Could not create remote NativeAdViewDelegate.", e10);
            return null;
        }
    }
}
