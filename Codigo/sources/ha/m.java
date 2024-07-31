package ha;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Long l10 = null;
        Long l11 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 3) {
                l10 = ea.b.K(parcel, E);
            } else if (w10 == 4) {
                l11 = ea.b.K(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                i12 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new h(i10, i11, l10, l11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
