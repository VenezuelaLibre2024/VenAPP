package r9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 3:
                    str = ea.b.q(parcel, E);
                    break;
                case 4:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 5:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 6:
                    str2 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new a(i10, j10, str, i11, i12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
