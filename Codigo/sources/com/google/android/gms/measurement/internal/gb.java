package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class gb implements Parcelable.Creator<hb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hb createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 4:
                    l10 = ea.b.K(parcel, E);
                    break;
                case 5:
                    f10 = ea.b.D(parcel, E);
                    break;
                case 6:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 8:
                    d10 = ea.b.B(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new hb(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hb[] newArray(int i10) {
        return new hb[i10];
    }
}
