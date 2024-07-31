package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 1) {
                ea.b.N(parcel, E);
            } else {
                j10 = ea.b.J(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new k0(j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k0[i10];
    }
}
