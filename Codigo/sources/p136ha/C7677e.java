package p136ha;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ha.e */
/* loaded from: classes.dex */
public class C7677e extends AbstractC7138a {
    public static final Parcelable.Creator<C7677e> CREATOR = new C7682j();

    /* renamed from: a */
    private final PendingIntent f18278a;

    public C7677e(PendingIntent pendingIntent) {
        this.f18278a = pendingIntent;
    }

    /* renamed from: u1 */
    public PendingIntent m23391u1() {
        return this.f18278a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m23391u1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
