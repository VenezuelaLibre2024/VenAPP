package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(int i10, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) s.j(str);
        this.zzc = (byte[]) s.j(bArr);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.G(parcel, 2, this.zzb, false);
        c.l(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }
}
