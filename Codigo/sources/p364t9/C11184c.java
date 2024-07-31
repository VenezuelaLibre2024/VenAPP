package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import p081ea.C7139b;

/* renamed from: t9.c */
/* loaded from: classes.dex */
public final class C11184c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        C11186e c11186e = null;
        int i11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            int i12 = 1;
            if (m21190w != 1) {
                i12 = 2;
                if (m21190w != 2) {
                    i12 = 3;
                    if (m21190w != 3) {
                        i12 = 4;
                        if (m21190w != 4) {
                            C7139b.m21164N(parcel, m21155E);
                        } else {
                            c11186e = (C11186e) C7139b.m21183p(parcel, m21155E, C11186e.CREATOR);
                        }
                    } else {
                        i10 = C7139b.m21157G(parcel, m21155E);
                    }
                } else {
                    arrayList = C7139b.m21188u(parcel, m21155E, C11188g.CREATOR);
                }
            } else {
                i11 = C7139b.m21157G(parcel, m21155E);
            }
            hashSet.add(Integer.valueOf(i12));
        }
        if (parcel.dataPosition() == m21165O) {
            return new C11183b(hashSet, i11, arrayList, i10, c11186e);
        }
        throw new C7139b.a("Overread allowed size end=" + m21165O, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11183b[i10];
    }
}
