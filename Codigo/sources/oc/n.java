package oc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        d dVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                arrayList = ea.b.u(parcel, E, com.google.firebase.auth.t0.CREATOR);
            } else if (w10 == 4) {
                arrayList2 = ea.b.u(parcel, E, com.google.firebase.auth.y0.CREATOR);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                dVar = (d) ea.b.p(parcel, E, d.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new o(str, str2, arrayList, arrayList2, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i10) {
        return new o[i10];
    }
}
