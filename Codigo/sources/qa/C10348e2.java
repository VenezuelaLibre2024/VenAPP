package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.e2 */
/* loaded from: classes.dex */
public final class C10348e2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 1) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z10 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10344d2(z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10344d2[i10];
    }
}
