package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: xa.j */
/* loaded from: classes2.dex */
public final class C12403j extends AbstractC7138a {
    public static final Parcelable.Creator<C12403j> CREATOR = new C12404k();

    /* renamed from: a */
    public final long f33286a;

    /* renamed from: b */
    public final C12394a[] f33287b;

    /* renamed from: c */
    public final int f33288c;

    /* renamed from: d */
    public final boolean f33289d;

    public C12403j(long j10, C12394a[] c12394aArr, int i10, boolean z10) {
        this.f33286a = j10;
        this.f33287b = c12394aArr;
        this.f33289d = z10;
        if (z10) {
            this.f33288c = i10;
        } else {
            this.f33288c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 2, this.f33286a);
        C7140c.m21203J(parcel, 3, this.f33287b, i10, false);
        C7140c.m21229u(parcel, 4, this.f33288c);
        C7140c.m21215g(parcel, 5, this.f33289d);
        C7140c.m21210b(parcel, m21209a);
    }
}
