package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import ea.b;

/* loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        Status status = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            if (b.w(E) != 1) {
                b.N(parcel, E);
            } else {
                status = (Status) b.p(parcel, E, Status.CREATOR);
            }
        }
        b.v(parcel, O);
        return new zzg(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
