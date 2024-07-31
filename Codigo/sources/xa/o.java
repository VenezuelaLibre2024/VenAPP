package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                z10 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new n(i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n[] newArray(int i10) {
        return new n[i10];
    }
}
