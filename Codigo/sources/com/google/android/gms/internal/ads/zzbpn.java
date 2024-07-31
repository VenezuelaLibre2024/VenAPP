package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbpn extends ea.a {
    public static final Parcelable.Creator<zzbpn> CREATOR = new zzbpo();
    public final String zza;
    public final Bundle zzb;

    public zzbpn(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.j(parcel, 2, this.zzb, false);
        ea.c.b(parcel, a10);
    }
}
