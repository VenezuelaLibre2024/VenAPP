package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 3) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                bArr = ea.b.g(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a0(i10, i11, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
