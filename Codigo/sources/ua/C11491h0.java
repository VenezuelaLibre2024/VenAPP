package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ua.h0 */
/* loaded from: classes2.dex */
public final class C11491h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        double d10 = 0.0d;
        C11524y c11524y = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                c11524y = (C11524y) C7139b.m21183p(parcel, m21155E, C11524y.CREATOR);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                d10 = C7139b.m21151A(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11526z(c11524y, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11526z[i10];
    }
}
