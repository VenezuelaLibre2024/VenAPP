package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ua.l0 */
/* loaded from: classes2.dex */
public final class C11499l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = true;
        boolean z11 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                iBinder = C7139b.m21156F(parcel, m21155E);
            } else if (m21190w == 3) {
                z11 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w == 4) {
                f10 = C7139b.m21153C(parcel, m21155E);
            } else if (m21190w == 5) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w != 6) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                f11 = C7139b.m21153C(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11481c0(iBinder, z11, f10, z10, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11481c0[i10];
    }
}
