package p158ia;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1898d;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: ia.f */
/* loaded from: classes.dex */
public final class C7937f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                arrayList = C7139b.m21188u(parcel, m21155E, C1898d.CREATOR);
            } else if (m21190w == 2) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w == 3) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7932a(arrayList, z10, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7932a[i10];
    }
}
