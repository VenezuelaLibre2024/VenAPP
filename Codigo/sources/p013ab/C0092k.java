package p013ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5277s0;
import p081ea.C7139b;

/* renamed from: ab.k */
/* loaded from: classes2.dex */
public final class C0092k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        C5277s0 c5277s0 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c5277s0 = (C5277s0) C7139b.m21183p(parcel, m21155E, C5277s0.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C0091j(i10, c5277s0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0091j[i10];
    }
}