package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: xa.l */
/* loaded from: classes2.dex */
public final class C12405l extends AbstractC7138a {
    public static final Parcelable.Creator<C12405l> CREATOR = new C12406m();

    /* renamed from: a */
    private final String f33290a;

    public C12405l(String str) {
        this.f33290a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.f33290a, false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final String zza() {
        return this.f33290a;
    }
}
