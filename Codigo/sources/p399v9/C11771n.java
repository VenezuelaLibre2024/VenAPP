package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;
import p399v9.C11758b;

/* renamed from: v9.n */
/* loaded from: classes.dex */
public final class C11771n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C11758b.e eVar = null;
        C11758b.b bVar = null;
        String str = null;
        C11758b.d dVar = null;
        C11758b.c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    eVar = (C11758b.e) C7139b.m21183p(parcel, m21155E, C11758b.e.CREATOR);
                    break;
                case 2:
                    bVar = (C11758b.b) C7139b.m21183p(parcel, m21155E, C11758b.b.CREATOR);
                    break;
                case 3:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 5:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 6:
                    dVar = (C11758b.d) C7139b.m21183p(parcel, m21155E, C11758b.d.CREATOR);
                    break;
                case 7:
                    cVar = (C11758b.c) C7139b.m21183p(parcel, m21155E, C11758b.c.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11758b(eVar, bVar, str, z10, i10, dVar, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11758b[i10];
    }
}
