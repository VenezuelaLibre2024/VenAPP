package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        r rVar = null;
        b2 b2Var = null;
        f0 f0Var = null;
        h2 h2Var = null;
        k0 k0Var = null;
        m0 m0Var = null;
        d2 d2Var = null;
        p0 p0Var = null;
        s sVar = null;
        r0 r0Var = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    rVar = (r) ea.b.p(parcel, E, r.CREATOR);
                    break;
                case 3:
                    b2Var = (b2) ea.b.p(parcel, E, b2.CREATOR);
                    break;
                case 4:
                    f0Var = (f0) ea.b.p(parcel, E, f0.CREATOR);
                    break;
                case 5:
                    h2Var = (h2) ea.b.p(parcel, E, h2.CREATOR);
                    break;
                case 6:
                    k0Var = (k0) ea.b.p(parcel, E, k0.CREATOR);
                    break;
                case 7:
                    m0Var = (m0) ea.b.p(parcel, E, m0.CREATOR);
                    break;
                case 8:
                    d2Var = (d2) ea.b.p(parcel, E, d2.CREATOR);
                    break;
                case 9:
                    p0Var = (p0) ea.b.p(parcel, E, p0.CREATOR);
                    break;
                case 10:
                    sVar = (s) ea.b.p(parcel, E, s.CREATOR);
                    break;
                case 11:
                    r0Var = (r0) ea.b.p(parcel, E, r0.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new d(rVar, b2Var, f0Var, h2Var, k0Var, m0Var, d2Var, p0Var, sVar, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
