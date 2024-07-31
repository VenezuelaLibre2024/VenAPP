package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC5316f;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: com.google.android.gms.ads.internal.client.t3 */
/* loaded from: classes.dex */
public final class C4910t3 extends AbstractC5316f {
    public C4910t3() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: a */
    public final InterfaceC4884p1 m12440a(Context context) {
        try {
            IBinder m12435f2 = ((C4890q1) getRemoteCreatorInstance(context)).m12435f2(BinderC5314d.m13412h2(context), 240304000);
            if (m12435f2 == null) {
                return null;
            }
            IInterface queryLocalInterface = m12435f2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof InterfaceC4884p1 ? (InterfaceC4884p1) queryLocalInterface : new C4872n1(m12435f2);
        } catch (RemoteException | AbstractC5316f.a e10) {
            zzcec.zzk("Could not get remote MobileAdsSettingManager.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC5316f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C4890q1 ? (C4890q1) queryLocalInterface : new C4890q1(iBinder);
    }
}
