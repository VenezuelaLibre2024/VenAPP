package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC5316f;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: com.google.android.gms.ads.internal.client.r4 */
/* loaded from: classes.dex */
public final class C4899r4 extends AbstractC5316f {
    public C4899r4() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final InterfaceC4889q0 m12436a(Context context, String str, zzbsv zzbsvVar) {
        try {
            IBinder zze = ((C4895r0) getRemoteCreatorInstance(context)).zze(BinderC5314d.m13412h2(context), str, zzbsvVar, 240304000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof InterfaceC4889q0 ? (InterfaceC4889q0) queryLocalInterface : new C4877o0(zze);
        } catch (RemoteException | AbstractC5316f.a e10) {
            zzcec.zzk("Could not create remote builder for AdLoader.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC5316f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C4895r0 ? (C4895r0) queryLocalInterface : new C4895r0(iBinder);
    }
}
