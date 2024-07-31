package p399v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.c */
/* loaded from: classes.dex */
public final class C11760c extends AbstractC7138a {
    public static final Parcelable.Creator<C11760c> CREATOR = new C11772o();

    /* renamed from: a */
    private final PendingIntent f31135a;

    public C11760c(PendingIntent pendingIntent) {
        this.f31135a = (PendingIntent) C5276s.m13324j(pendingIntent);
    }

    /* renamed from: u1 */
    public PendingIntent m37212u1() {
        return this.f31135a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m37212u1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
