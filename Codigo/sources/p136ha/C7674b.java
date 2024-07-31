package p136ha;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ha.b */
/* loaded from: classes.dex */
public class C7674b extends AbstractC7138a {
    public static final Parcelable.Creator<C7674b> CREATOR = new C7681i();

    /* renamed from: a */
    private final boolean f18276a;

    /* renamed from: b */
    private final int f18277b;

    public C7674b(boolean z10, int i10) {
        this.f18276a = z10;
        this.f18277b = i10;
    }

    /* renamed from: u1 */
    public boolean m23386u1() {
        return this.f18276a;
    }

    /* renamed from: v1 */
    public int m23387v1() {
        return this.f18277b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m23386u1());
        C7140c.m21229u(parcel, 2, m23387v1());
        C7140c.m21210b(parcel, m21209a);
    }
}
