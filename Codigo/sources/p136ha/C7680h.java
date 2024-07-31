package p136ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ha.h */
/* loaded from: classes.dex */
public class C7680h extends AbstractC7138a {
    public static final Parcelable.Creator<C7680h> CREATOR = new C7685m();

    /* renamed from: a */
    private final int f18289a;

    /* renamed from: b */
    private final int f18290b;

    /* renamed from: c */
    private final Long f18291c;

    /* renamed from: d */
    private final Long f18292d;

    /* renamed from: e */
    private final int f18293e;

    /* renamed from: f */
    private final a f18294f;

    /* renamed from: ha.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final long f18295a;

        /* renamed from: b */
        private final long f18296b;

        a(long j10, long j11) {
            C5276s.m13327m(j11);
            this.f18295a = j10;
            this.f18296b = j11;
        }
    }

    public C7680h(int i10, int i11, Long l10, Long l11, int i12) {
        this.f18289a = i10;
        this.f18290b = i11;
        this.f18291c = l10;
        this.f18292d = l11;
        this.f18293e = i12;
        this.f18294f = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    /* renamed from: u1 */
    public int m23401u1() {
        return this.f18293e;
    }

    /* renamed from: v1 */
    public int m23402v1() {
        return this.f18290b;
    }

    /* renamed from: w1 */
    public int m23403w1() {
        return this.f18289a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m23403w1());
        C7140c.m21229u(parcel, 2, m23402v1());
        C7140c.m21195B(parcel, 3, this.f18291c, false);
        C7140c.m21195B(parcel, 4, this.f18292d, false);
        C7140c.m21229u(parcel, 5, m23401u1());
        C7140c.m21210b(parcel, m21209a);
    }
}
