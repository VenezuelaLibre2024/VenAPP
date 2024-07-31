package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: oc.n */
/* loaded from: classes.dex */
public final class C9872n implements Parcelable.Creator<C9875o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9875o createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C9842d c9842d = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                arrayList = C7139b.m21188u(parcel, m21155E, C6124t0.CREATOR);
            } else if (m21190w == 4) {
                arrayList2 = C7139b.m21188u(parcel, m21155E, C6143y0.CREATOR);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c9842d = (C9842d) C7139b.m21183p(parcel, m21155E, C9842d.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9875o(str, str2, arrayList, arrayList2, c9842d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9875o[] newArray(int i10) {
        return new C9875o[i10];
    }
}
