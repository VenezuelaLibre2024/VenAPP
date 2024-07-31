package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.h0 */
/* loaded from: classes.dex */
public class C10358h0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10358h0> CREATOR = new C10369k1();

    /* renamed from: a */
    private final int f25876a;

    /* renamed from: b */
    private final short f25877b;

    /* renamed from: c */
    private final short f25878c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10358h0(int i10, short s10, short s11) {
        this.f25876a = i10;
        this.f25877b = s10;
        this.f25878c = s11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10358h0)) {
            return false;
        }
        C10358h0 c10358h0 = (C10358h0) obj;
        return this.f25876a == c10358h0.f25876a && this.f25877b == c10358h0.f25877b && this.f25878c == c10358h0.f25878c;
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f25876a), Short.valueOf(this.f25877b), Short.valueOf(this.f25878c));
    }

    /* renamed from: u1 */
    public short m31141u1() {
        return this.f25877b;
    }

    /* renamed from: v1 */
    public short m31142v1() {
        return this.f25878c;
    }

    /* renamed from: w1 */
    public int m31143w1() {
        return this.f25876a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m31143w1());
        C7140c.m21199F(parcel, 2, m31141u1());
        C7140c.m21199F(parcel, 3, m31142v1());
        C7140c.m21210b(parcel, m21209a);
    }
}
