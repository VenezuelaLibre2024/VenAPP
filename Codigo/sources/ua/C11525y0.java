package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: ua.y0 */
/* loaded from: classes2.dex */
public final class C11525y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        ArrayList arrayList = null;
        C11484e c11484e = null;
        C11484e c11484e2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    arrayList = C7139b.m21188u(parcel, m21155E, LatLng.CREATOR);
                    break;
                case 3:
                    f10 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 4:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    f11 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 6:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 7:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 8:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 9:
                    c11484e = (C11484e) C7139b.m21183p(parcel, m21155E, C11484e.CREATOR);
                    break;
                case 10:
                    c11484e2 = (C11484e) C7139b.m21183p(parcel, m21155E, C11484e.CREATOR);
                    break;
                case 11:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 12:
                    arrayList2 = C7139b.m21188u(parcel, m21155E, C11504o.CREATOR);
                    break;
                case 13:
                    arrayList3 = C7139b.m21188u(parcel, m21155E, C11526z.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11514t(arrayList, f10, i10, f11, z10, z11, z12, c11484e, c11484e2, i11, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11514t[i10];
    }
}
