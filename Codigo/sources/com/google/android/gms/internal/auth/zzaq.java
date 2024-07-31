package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(int i10, String str) {
        this.zza = 1;
        this.zzb = (String) s.j(str);
    }

    public zzaq(String str) {
        this(1, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.G(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }
}
