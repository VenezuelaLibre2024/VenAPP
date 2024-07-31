package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        g0 g0Var = null;
        o1 o1Var = null;
        f fVar = null;
        q1 q1Var = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                g0Var = (g0) ea.b.p(parcel, E, g0.CREATOR);
            } else if (w10 == 2) {
                o1Var = (o1) ea.b.p(parcel, E, o1.CREATOR);
            } else if (w10 == 3) {
                fVar = (f) ea.b.p(parcel, E, f.CREATOR);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                q1Var = (q1) ea.b.p(parcel, E, q1.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new e(g0Var, o1Var, fVar, q1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
