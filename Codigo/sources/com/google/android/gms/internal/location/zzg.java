package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzg extends a implements n {
    private final Status zzb;
    public static final zzg zza = new zzg(Status.f9292r);
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    public zzg(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.E(parcel, 1, this.zzb, i10, false);
        c.b(parcel, a10);
    }
}
