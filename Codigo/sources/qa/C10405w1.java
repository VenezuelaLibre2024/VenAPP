package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.w1 */
/* loaded from: classes.dex */
public final class C10405w1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C10397u c10397u = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                c10397u = (C10397u) C7139b.m21183p(parcel, m21155E, C10397u.CREATOR);
            } else if (m21190w == 3) {
                uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bArr = C7139b.m21174g(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10370l(c10397u, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10370l[i10];
    }
}
