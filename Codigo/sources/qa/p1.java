package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                bArr = ea.b.g(parcel, E);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                bArr2 = ea.b.g(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new o1(bArr, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o1[i10];
    }
}