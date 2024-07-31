package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ra.g */
/* loaded from: classes.dex */
public final class C10663g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str2 = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10657a(i10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10657a[i10];
    }
}
