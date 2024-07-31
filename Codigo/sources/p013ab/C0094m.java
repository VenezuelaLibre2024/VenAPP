package p013ab;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1894b;
import com.google.android.gms.common.internal.C5283u0;
import p081ea.C7139b;

/* renamed from: ab.m */
/* loaded from: classes2.dex */
public final class C0094m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        C1894b c1894b = null;
        C5283u0 c5283u0 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                c1894b = (C1894b) C7139b.m21183p(parcel, m21155E, C1894b.CREATOR);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c5283u0 = (C5283u0) C7139b.m21183p(parcel, m21155E, C5283u0.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C0093l(i10, c1894b, c5283u0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0093l[i10];
    }
}
