package p136ha;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ha.g */
/* loaded from: classes.dex */
public class C7679g extends AbstractC7138a {
    public static final Parcelable.Creator<C7679g> CREATOR = new C7684l();

    /* renamed from: a */
    private final int f18287a;

    /* renamed from: b */
    private final boolean f18288b;

    public C7679g(int i10) {
        this(i10, false);
    }

    public C7679g(int i10, boolean z10) {
        this.f18287a = i10;
        this.f18288b = z10;
    }

    /* renamed from: u1 */
    public int m23399u1() {
        return this.f18287a;
    }

    /* renamed from: v1 */
    public final boolean m23400v1() {
        return this.f18288b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m23399u1());
        C7140c.m21215g(parcel, 2, this.f18288b);
        C7140c.m21210b(parcel, m21209a);
    }
}
