package ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                arrayList = ea.b.u(parcel, E, ca.d.CREATOR);
            } else if (w10 == 2) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 == 3) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                str = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a(arrayList, z10, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
