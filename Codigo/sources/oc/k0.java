package oc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator<l0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                arrayList = ea.b.u(parcel, E, com.google.firebase.auth.t0.CREATOR);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                arrayList2 = ea.b.u(parcel, E, com.google.firebase.auth.y0.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new l0(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l0[] newArray(int i10) {
        return new l0[i10];
    }
}
