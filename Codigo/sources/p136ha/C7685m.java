package p136ha;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ha.m */
/* loaded from: classes.dex */
public final class C7685m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Long l10 = null;
        Long l11 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                l10 = C7139b.m21161K(parcel, m21155E);
            } else if (m21190w == 4) {
                l11 = C7139b.m21161K(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i12 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7680h(i10, i11, l10, l11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7680h[i10];
    }
}
