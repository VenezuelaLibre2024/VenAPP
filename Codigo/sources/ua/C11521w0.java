package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;
import ua.C11506p;

/* renamed from: ua.w0 */
/* loaded from: classes2.dex */
public final class C11521w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C11506p.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                aVar = (C11506p.a) C7139b.m21183p(parcel, m21155E, C11506p.a.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11506p(i10, i11, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11506p[i10];
    }
}