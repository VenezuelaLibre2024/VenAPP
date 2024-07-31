package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.location.LocationRequest;
import ea.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 1) {
                locationRequest = (LocationRequest) b.p(parcel, E, LocationRequest.CREATOR);
            } else if (w10 != 5) {
                switch (w10) {
                    case 8:
                        z10 = b.x(parcel, E);
                        break;
                    case 9:
                        z11 = b.x(parcel, E);
                        break;
                    case 10:
                        str = b.q(parcel, E);
                        break;
                    case 11:
                        z12 = b.x(parcel, E);
                        break;
                    case 12:
                        z13 = b.x(parcel, E);
                        break;
                    case 13:
                        str2 = b.q(parcel, E);
                        break;
                    case 14:
                        j10 = b.J(parcel, E);
                        break;
                    default:
                        b.N(parcel, E);
                        break;
                }
            } else {
                arrayList = b.u(parcel, E, d.CREATOR);
            }
        }
        b.v(parcel, O);
        return new zzdd(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
