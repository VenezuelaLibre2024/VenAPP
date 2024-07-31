package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: xa.n */
/* loaded from: classes2.dex */
public final class C12407n extends AbstractC7138a {
    public static final Parcelable.Creator<C12407n> CREATOR = new C12408o();

    /* renamed from: a */
    public final int f33291a;

    /* renamed from: b */
    public final boolean f33292b;

    public C12407n(int i10, boolean z10) {
        this.f33291a = i10;
        this.f33292b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, this.f33291a);
        C7140c.m21215g(parcel, 3, this.f33292b);
        C7140c.m21210b(parcel, m21209a);
    }
}
