package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                str2 = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new j(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
