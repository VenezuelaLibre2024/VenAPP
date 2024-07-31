package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: oc.l */
/* loaded from: classes.dex */
public final class C9866l implements Parcelable.Creator<C9860j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9860j createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        ArrayList arrayList = null;
        C9875o c9875o = null;
        String str = null;
        C6059d2 c6059d2 = null;
        C9842d c9842d = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    arrayList = C7139b.m21188u(parcel, m21155E, C6124t0.CREATOR);
                    break;
                case 2:
                    c9875o = (C9875o) C7139b.m21183p(parcel, m21155E, C9875o.CREATOR);
                    break;
                case 3:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    c6059d2 = (C6059d2) C7139b.m21183p(parcel, m21155E, C6059d2.CREATOR);
                    break;
                case 5:
                    c9842d = (C9842d) C7139b.m21183p(parcel, m21155E, C9842d.CREATOR);
                    break;
                case 6:
                    arrayList2 = C7139b.m21188u(parcel, m21155E, C6143y0.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9860j(arrayList, c9875o, str, c6059d2, c9842d, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9860j[] newArray(int i10) {
        return new C9860j[i10];
    }
}
