package oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.d2;

/* loaded from: classes.dex */
public final class z1 implements Parcelable.Creator<w1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w1 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        d dVar = null;
        u1 u1Var = null;
        d2 d2Var = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                dVar = (d) ea.b.p(parcel, E, d.CREATOR);
            } else if (w10 == 2) {
                u1Var = (u1) ea.b.p(parcel, E, u1.CREATOR);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                d2Var = (d2) ea.b.p(parcel, E, d2.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new w1(dVar, u1Var, d2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w1[] newArray(int i10) {
        return new w1[i10];
    }
}
