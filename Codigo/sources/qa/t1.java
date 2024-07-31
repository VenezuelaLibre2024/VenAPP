package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                bArr = ea.b.g(parcel, E);
            } else if (w10 == 3) {
                bArr2 = ea.b.g(parcel, E);
            } else if (w10 == 4) {
                bArr3 = ea.b.g(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                strArr = ea.b.r(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new h(bArr, bArr2, bArr3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
