package ba;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ba.a */
/* loaded from: classes.dex */
public final class C1685a extends AbstractC7138a {
    public static final Parcelable.Creator<C1685a> CREATOR = new C1691d();

    /* renamed from: a */
    Intent f7238a;

    public C1685a(Intent intent) {
        this.f7238a = intent;
    }

    /* renamed from: u1 */
    public Intent m9280u1() {
        return this.f7238a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, this.f7238a, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
