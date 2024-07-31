package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = 0;
        a[] aVarArr = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 == 3) {
                aVarArr = (a[]) ea.b.t(parcel, E, a.CREATOR);
            } else if (w10 == 4) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                z10 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new j(j10, aVarArr, i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
