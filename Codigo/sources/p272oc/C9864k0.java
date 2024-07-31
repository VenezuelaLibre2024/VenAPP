package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: oc.k0 */
/* loaded from: classes.dex */
public final class C9864k0 implements Parcelable.Creator<C9867l0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9867l0 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                arrayList = C7139b.m21188u(parcel, m21155E, C6124t0.CREATOR);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                arrayList2 = C7139b.m21188u(parcel, m21155E, C6143y0.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9867l0(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9867l0[] newArray(int i10) {
        return new C9867l0[i10];
    }
}
