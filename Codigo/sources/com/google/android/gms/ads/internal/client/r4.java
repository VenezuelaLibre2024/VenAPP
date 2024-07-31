package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class r4 extends com.google.android.gms.dynamic.f {
    public r4() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final q0 a(Context context, String str, zzbsv zzbsvVar) {
        try {
            IBinder zze = ((r0) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.d.h2(context), str, zzbsvVar, 240304000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(zze);
        } catch (RemoteException | f.a e10) {
            zzcec.zzk("Could not create remote builder for AdLoader.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new r0(iBinder);
    }
}
