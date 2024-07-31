package oc;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x1 implements Parcelable.Creator<u1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u1 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                z10 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new u1(str, str2, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u1[] newArray(int i10) {
        return new u1[i10];
    }
}
