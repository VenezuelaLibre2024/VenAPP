package v9;

import android.os.Parcel;
import android.os.Parcelable;
import v9.b;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                str = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new b.c(z10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.c[i10];
    }
}
