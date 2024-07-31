package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) ea.b.p(parcel, E, ParcelFileDescriptor.CREATOR);
            } else if (w10 == 3) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 == 4) {
                z11 = ea.b.x(parcel, E);
            } else if (w10 == 5) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                z12 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new zzbay(parcelFileDescriptor, z10, z11, j10, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbay[i10];
    }
}
