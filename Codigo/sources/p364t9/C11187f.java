package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: t9.f */
/* loaded from: classes.dex */
public final class C11187f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    arrayList = C7139b.m21186s(parcel, m21155E);
                    break;
                case 3:
                    arrayList2 = C7139b.m21186s(parcel, m21155E);
                    break;
                case 4:
                    arrayList3 = C7139b.m21186s(parcel, m21155E);
                    break;
                case 5:
                    arrayList4 = C7139b.m21186s(parcel, m21155E);
                    break;
                case 6:
                    arrayList5 = C7139b.m21186s(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11186e(i10, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11186e[i10];
    }
}
