package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ua.n0 */
/* loaded from: classes2.dex */
public final class C11503n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        IBinder iBinder = null;
        int i10 = 0;
        Float f10 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                iBinder = C7139b.m21156F(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                f10 = C7139b.m21154D(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11484e(i10, iBinder, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11484e[i10];
    }
}
