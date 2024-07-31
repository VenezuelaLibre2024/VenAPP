package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p081ea.C7139b;

/* renamed from: t9.h */
/* loaded from: classes.dex */
public final class C11189h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        HashSet hashSet = new HashSet();
        C11190i c11190i = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            int i11 = 1;
            if (m21190w != 1) {
                i11 = 2;
                if (m21190w != 2) {
                    i11 = 3;
                    if (m21190w != 3) {
                        i11 = 4;
                        if (m21190w != 4) {
                            i11 = 5;
                            if (m21190w != 5) {
                                C7139b.m21164N(parcel, m21155E);
                            } else {
                                str3 = C7139b.m21184q(parcel, m21155E);
                            }
                        } else {
                            str2 = C7139b.m21184q(parcel, m21155E);
                        }
                    } else {
                        str = C7139b.m21184q(parcel, m21155E);
                    }
                } else {
                    c11190i = (C11190i) C7139b.m21183p(parcel, m21155E, C11190i.CREATOR);
                }
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
            hashSet.add(Integer.valueOf(i11));
        }
        if (parcel.dataPosition() == m21165O) {
            return new C11188g(hashSet, i10, c11190i, str, str2, str3);
        }
        throw new C7139b.a("Overread allowed size end=" + m21165O, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11188g[i10];
    }
}
