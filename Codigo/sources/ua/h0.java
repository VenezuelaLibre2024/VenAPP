package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        double d10 = 0.0d;
        y yVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                yVar = (y) ea.b.p(parcel, E, y.CREATOR);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                d10 = ea.b.A(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new z(yVar, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
