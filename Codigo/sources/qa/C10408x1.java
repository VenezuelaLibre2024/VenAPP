package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.x1 */
/* loaded from: classes.dex */
public final class C10408x1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C10406x c10406x = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                c10406x = (C10406x) C7139b.m21183p(parcel, m21155E, C10406x.CREATOR);
            } else if (m21190w == 3) {
                uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bArr = C7139b.m21174g(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10373m(c10406x, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10373m[i10];
    }
}
