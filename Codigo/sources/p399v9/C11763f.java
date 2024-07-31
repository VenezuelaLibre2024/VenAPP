package p399v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.f */
/* loaded from: classes.dex */
public class C11763f extends AbstractC7138a {
    public static final Parcelable.Creator<C11763f> CREATOR = new C11780w();

    /* renamed from: a */
    private final PendingIntent f31149a;

    public C11763f(PendingIntent pendingIntent) {
        this.f31149a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11763f) {
            return C5270q.m13304b(this.f31149a, ((C11763f) obj).f31149a);
        }
        return false;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31149a);
    }

    /* renamed from: u1 */
    public PendingIntent m37226u1() {
        return this.f31149a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m37226u1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
