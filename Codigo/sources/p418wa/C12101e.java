package p418wa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.C5461d0;
import com.google.android.gms.measurement.internal.C5742z;
import p081ea.C7139b;

/* renamed from: wa.e */
/* loaded from: classes2.dex */
public final class C12101e implements Parcelable.Creator<C5461d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5461d0 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        C5742z c5742z = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                c5742z = (C5742z) C7139b.m21183p(parcel, m21155E, C5742z.CREATOR);
            } else if (m21190w == 4) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                j10 = C7139b.m21160J(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5461d0(str, c5742z, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5461d0[] newArray(int i10) {
        return new C5461d0[i10];
    }
}
