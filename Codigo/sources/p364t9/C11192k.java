package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: t9.k */
/* loaded from: classes.dex */
public final class C11192k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w == 3) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z11 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11182a(i10, z10, j10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11182a[i10];
    }
}
