package z9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        Bundle bundle = null;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                bundle = ea.b.f(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a(i10, i11, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}