package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: ua.x0 */
/* loaded from: classes2.dex */
public final class C11523x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        ArrayList arrayList2 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        float f11 = 0.0f;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    arrayList3 = C7139b.m21188u(parcel, m21155E, LatLng.CREATOR);
                    break;
                case 3:
                    C7139b.m21159I(parcel, m21155E, arrayList, C11523x0.class.getClassLoader());
                    break;
                case 4:
                    f10 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 5:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 6:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 7:
                    f11 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 8:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 9:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 10:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 11:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 12:
                    arrayList2 = C7139b.m21188u(parcel, m21155E, C11504o.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11510r(arrayList3, arrayList, f10, i10, i11, f11, z10, z11, z12, i12, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11510r[i10];
    }
}
