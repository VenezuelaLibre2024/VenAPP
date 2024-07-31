package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfsk extends ea.a {
    public static final Parcelable.Creator<zzfsk> CREATOR = new zzfsl();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsk(int i10, byte[] bArr, int i11) {
        this.zza = i10;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i11;
    }

    public zzfsk(byte[] bArr, int i10) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.l(parcel, 2, this.zzb, false);
        ea.c.u(parcel, 3, this.zzc);
        ea.c.b(parcel, a10);
    }
}
