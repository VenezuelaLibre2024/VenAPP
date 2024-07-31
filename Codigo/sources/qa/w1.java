package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        u uVar = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                uVar = (u) ea.b.p(parcel, E, u.CREATOR);
            } else if (w10 == 3) {
                uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                bArr = ea.b.g(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new l(uVar, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
