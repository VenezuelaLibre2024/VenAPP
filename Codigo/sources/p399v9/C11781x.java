package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: v9.x */
/* loaded from: classes.dex */
public final class C11781x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        C11767j c11767j = null;
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                c11767j = (C11767j) C7139b.m21183p(parcel, m21155E, C11767j.CREATOR);
            } else if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11764g(c11767j, str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11764g[i10];
    }
}
