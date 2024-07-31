package p399v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.h */
/* loaded from: classes.dex */
public class C11765h extends AbstractC7138a {
    public static final Parcelable.Creator<C11765h> CREATOR = new C11782y();

    /* renamed from: a */
    private final PendingIntent f31156a;

    public C11765h(PendingIntent pendingIntent) {
        this.f31156a = (PendingIntent) C5276s.m13324j(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11765h) {
            return C5270q.m13304b(this.f31156a, ((C11765h) obj).f31156a);
        }
        return false;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31156a);
    }

    /* renamed from: u1 */
    public PendingIntent m37234u1() {
        return this.f31156a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m37234u1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
