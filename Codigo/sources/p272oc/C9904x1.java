package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: oc.x1 */
/* loaded from: classes.dex */
public final class C9904x1 implements Parcelable.Creator<C9895u1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9895u1 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z10 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9895u1(str, str2, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9895u1[] newArray(int i10) {
        return new C9895u1[i10];
    }
}
