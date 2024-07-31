package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        x xVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        float f10 = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                f10 = ea.b.C(parcel, E);
            } else if (w10 == 3) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 4) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 5) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                xVar = (x) ea.b.p(parcel, E, x.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new y(f10, i10, i11, z10, xVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new y[i10];
    }
}
