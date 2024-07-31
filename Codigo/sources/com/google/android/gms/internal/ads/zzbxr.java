package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.b;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbxr extends ea.a {
    public static final Parcelable.Creator<zzbxr> CREATOR = new zzbxs();
    public final View zza;
    public final Map zzb;

    public zzbxr(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) com.google.android.gms.dynamic.d.g2(b.a.f2(iBinder));
        this.zzb = (Map) com.google.android.gms.dynamic.d.g2(b.a.f2(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.t(parcel, 1, com.google.android.gms.dynamic.d.h2(view).asBinder(), false);
        ea.c.t(parcel, 2, com.google.android.gms.dynamic.d.h2(this.zzb).asBinder(), false);
        ea.c.b(parcel, a10);
    }
}
