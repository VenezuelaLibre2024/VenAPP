package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 == 2) {
                bArr = ea.b.g(parcel, E);
            } else if (w10 == 3) {
                bArr2 = ea.b.g(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                bArr3 = ea.b.g(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new z1(j10, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z1[i10];
    }
}
