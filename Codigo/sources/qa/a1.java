package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                bArr = ea.b.g(parcel, E);
            } else if (w10 == 3) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 4) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                str3 = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a0(bArr, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
