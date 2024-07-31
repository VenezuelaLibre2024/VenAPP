package p399v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: v9.m */
/* loaded from: classes.dex */
public final class C11770m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 2:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    arrayList = C7139b.m21186s(parcel, m21155E);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) C7139b.m21183p(parcel, m21155E, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) C7139b.m21183p(parcel, m21155E, PendingIntent.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11756a(str, str2, str3, arrayList, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11756a[i10];
    }
}
