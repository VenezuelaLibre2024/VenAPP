package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Float f10 = null;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                f10 = ea.b.D(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new o(i10, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
