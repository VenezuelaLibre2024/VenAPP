package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class t3 extends com.google.android.gms.dynamic.f {
    public t3() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final p1 a(Context context) {
        try {
            IBinder f22 = ((q1) getRemoteCreatorInstance(context)).f2(com.google.android.gms.dynamic.d.h2(context), 240304000);
            if (f22 == null) {
                return null;
            }
            IInterface queryLocalInterface = f22.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof p1 ? (p1) queryLocalInterface : new n1(f22);
        } catch (RemoteException | f.a e10) {
            zzcec.zzk("Could not get remote MobileAdsSettingManager.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof q1 ? (q1) queryLocalInterface : new q1(iBinder);
    }
}
