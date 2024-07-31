package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(int i10, String str, int i11) {
        this.zza = 1;
        this.zzb = (String) s.j(str);
        this.zzc = i11;
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.G(parcel, 2, this.zzb, false);
        c.u(parcel, 3, this.zzc);
        c.b(parcel, a10);
    }
}
