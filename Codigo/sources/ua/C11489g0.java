package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ua.g0 */
/* loaded from: classes2.dex */
public final class C11489g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C11522x c11522x = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        float f10 = 0.0f;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                f10 = C7139b.m21153C(parcel, m21155E);
            } else if (m21190w == 3) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 4) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 5) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w != 6) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c11522x = (C11522x) C7139b.m21183p(parcel, m21155E, C11522x.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11524y(f10, i10, i11, z10, c11522x);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11524y[i10];
    }
}
