package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p498firebaseauthapi.zzafn;
import com.google.android.gms.internal.p498firebaseauthapi.zzafq;
import com.google.firebase.auth.C6059d2;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: oc.g */
/* loaded from: classes.dex */
public final class C9851g implements Parcelable.Creator<C9842d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9842d createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        zzafn zzafnVar = null;
        C9907y1 c9907y1 = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C9848f c9848f = null;
        C6059d2 c6059d2 = null;
        C9867l0 c9867l0 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    zzafnVar = (zzafn) C7139b.m21183p(parcel, m21155E, zzafn.CREATOR);
                    break;
                case 2:
                    c9907y1 = (C9907y1) C7139b.m21183p(parcel, m21155E, C9907y1.CREATOR);
                    break;
                case 3:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    arrayList = C7139b.m21188u(parcel, m21155E, C9907y1.CREATOR);
                    break;
                case 6:
                    arrayList2 = C7139b.m21186s(parcel, m21155E);
                    break;
                case 7:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    bool = C7139b.m21192y(parcel, m21155E);
                    break;
                case 9:
                    c9848f = (C9848f) C7139b.m21183p(parcel, m21155E, C9848f.CREATOR);
                    break;
                case 10:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 11:
                    c6059d2 = (C6059d2) C7139b.m21183p(parcel, m21155E, C6059d2.CREATOR);
                    break;
                case 12:
                    c9867l0 = (C9867l0) C7139b.m21183p(parcel, m21155E, C9867l0.CREATOR);
                    break;
                case 13:
                    arrayList3 = C7139b.m21188u(parcel, m21155E, zzafq.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9842d(zzafnVar, c9907y1, str, str2, arrayList, arrayList2, str3, bool, c9848f, z10, c6059d2, c9867l0, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9842d[] newArray(int i10) {
        return new C9842d[i10];
    }
}
