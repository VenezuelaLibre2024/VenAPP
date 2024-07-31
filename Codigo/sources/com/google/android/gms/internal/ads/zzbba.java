package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.c;
import x8.j0;

/* loaded from: classes2.dex */
public final class zzbba extends com.google.android.gms.ads.internal.c {
    public zzbba(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(zzbzs.zza(context), looper, 123, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbbd ? (zzbbd) queryLocalInterface : new zzbbd(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final ca.d[] getApiFeatures() {
        return j0.f30703b;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() && la.b.b(getAvailableFeatures(), j0.f30702a);
    }

    public final zzbbd zzq() {
        return (zzbbd) super.getService();
    }
}
