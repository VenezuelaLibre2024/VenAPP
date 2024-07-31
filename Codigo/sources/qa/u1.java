package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 3) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                i11 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new i(i10, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
