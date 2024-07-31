package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C6059d2;
import p081ea.C7139b;

/* renamed from: oc.z1 */
/* loaded from: classes.dex */
public final class C9910z1 implements Parcelable.Creator<C9901w1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9901w1 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C9842d c9842d = null;
        C9895u1 c9895u1 = null;
        C6059d2 c6059d2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                c9842d = (C9842d) C7139b.m21183p(parcel, m21155E, C9842d.CREATOR);
            } else if (m21190w == 2) {
                c9895u1 = (C9895u1) C7139b.m21183p(parcel, m21155E, C9895u1.CREATOR);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c6059d2 = (C6059d2) C7139b.m21183p(parcel, m21155E, C6059d2.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9901w1(c9842d, c9895u1, c6059d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9901w1[] newArray(int i10) {
        return new C9901w1[i10];
    }
}
