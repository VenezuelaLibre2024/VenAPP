package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.z */
/* loaded from: classes2.dex */
public final class C11526z extends AbstractC7138a {
    public static final Parcelable.Creator<C11526z> CREATOR = new C11491h0();

    /* renamed from: a */
    private final C11524y f29906a;

    /* renamed from: b */
    private final double f29907b;

    public C11526z(C11524y c11524y, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f29906a = c11524y;
        this.f29907b = d10;
    }

    /* renamed from: u1 */
    public double m36086u1() {
        return this.f29907b;
    }

    /* renamed from: v1 */
    public C11524y m36087v1() {
        return this.f29906a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m36087v1(), i10, false);
        C7140c.m21222n(parcel, 3, m36086u1());
        C7140c.m21210b(parcel, m21209a);
    }
}
