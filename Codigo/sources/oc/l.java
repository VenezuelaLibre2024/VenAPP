package oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.d2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        ArrayList arrayList = null;
        o oVar = null;
        String str = null;
        d2 d2Var = null;
        d dVar = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    arrayList = ea.b.u(parcel, E, com.google.firebase.auth.t0.CREATOR);
                    break;
                case 2:
                    oVar = (o) ea.b.p(parcel, E, o.CREATOR);
                    break;
                case 3:
                    str = ea.b.q(parcel, E);
                    break;
                case 4:
                    d2Var = (d2) ea.b.p(parcel, E, d2.CREATOR);
                    break;
                case 5:
                    dVar = (d) ea.b.p(parcel, E, d.CREATOR);
                    break;
                case 6:
                    arrayList2 = ea.b.u(parcel, E, com.google.firebase.auth.y0.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new j(arrayList, oVar, str, d2Var, dVar, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
