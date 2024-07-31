package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: xa.g */
/* loaded from: classes2.dex */
public final class C12400g extends AbstractC7138a {
    public static final Parcelable.Creator<C12400g> CREATOR = new C12401h();

    /* renamed from: a */
    private final String f33285a;

    public C12400g(String str) {
        this.f33285a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.f33285a, false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final String zza() {
        return this.f33285a;
    }
}
