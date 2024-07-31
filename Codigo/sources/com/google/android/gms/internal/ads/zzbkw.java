package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbkw extends zzayh implements zzbkx {
    public zzbkw() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbkx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbkx ? (zzbkx) queryLocalInterface : new zzbkv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        u0 zzac = t0.zzac(parcel.readStrongBinder());
        com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
        zzayi.zzc(parcel);
        zze(zzac, f22);
        parcel2.writeNoException();
        return true;
    }
}
