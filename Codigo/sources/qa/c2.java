package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 1) {
                ea.b.N(parcel, E);
            } else {
                arrayList = ea.b.u(parcel, E, z1.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new b2(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b2[i10];
    }
}
