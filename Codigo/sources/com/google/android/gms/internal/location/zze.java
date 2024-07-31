package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import ca.d;
import ea.b;
import java.util.List;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        List zzk = zzds.zzk();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    i10 = b.G(parcel, E);
                    break;
                case 2:
                    i11 = b.G(parcel, E);
                    break;
                case 3:
                    str = b.q(parcel, E);
                    break;
                case 4:
                    str2 = b.q(parcel, E);
                    break;
                case 5:
                    i12 = b.G(parcel, E);
                    break;
                case 6:
                    str3 = b.q(parcel, E);
                    break;
                case 7:
                    zzdVar = (zzd) b.p(parcel, E, zzd.CREATOR);
                    break;
                case 8:
                    zzk = b.u(parcel, E, d.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzd(i10, i11, str, str2, str3, i12, zzk, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
