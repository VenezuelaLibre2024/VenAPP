package ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u0;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        ca.b bVar = null;
        u0 u0Var = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                bVar = (ca.b) ea.b.p(parcel, E, ca.b.CREATOR);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                u0Var = (u0) ea.b.p(parcel, E, u0.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new l(i10, bVar, u0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}