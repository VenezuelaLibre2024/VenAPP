package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                bArr = ea.b.g(parcel, E);
            } else if (w10 == 3) {
                bArr2 = ea.b.g(parcel, E);
            } else if (w10 == 4) {
                bArr3 = ea.b.g(parcel, E);
            } else if (w10 == 5) {
                bArr4 = ea.b.g(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                bArr5 = ea.b.g(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new g(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
