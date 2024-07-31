package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.a0 */
/* loaded from: classes.dex */
public class C10330a0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10330a0> CREATOR = new C10331a1();

    /* renamed from: a */
    private final byte[] f25840a;

    /* renamed from: b */
    private final String f25841b;

    /* renamed from: c */
    private final String f25842c;

    /* renamed from: d */
    private final String f25843d;

    public C10330a0(byte[] bArr, String str, String str2, String str3) {
        this.f25840a = (byte[]) C5276s.m13324j(bArr);
        this.f25841b = (String) C5276s.m13324j(str);
        this.f25842c = str2;
        this.f25843d = (String) C5276s.m13324j(str3);
    }

    /* renamed from: R */
    public String m31115R() {
        return this.f25843d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10330a0)) {
            return false;
        }
        C10330a0 c10330a0 = (C10330a0) obj;
        return Arrays.equals(this.f25840a, c10330a0.f25840a) && C5270q.m13304b(this.f25841b, c10330a0.f25841b) && C5270q.m13304b(this.f25842c, c10330a0.f25842c) && C5270q.m13304b(this.f25843d, c10330a0.f25843d);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25840a, this.f25841b, this.f25842c, this.f25843d);
    }

    /* renamed from: u1 */
    public String m31116u1() {
        return this.f25842c;
    }

    /* renamed from: v1 */
    public byte[] m31117v1() {
        return this.f25840a;
    }

    /* renamed from: w1 */
    public String m31118w1() {
        return this.f25841b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21220l(parcel, 2, m31117v1(), false);
        C7140c.m21200G(parcel, 3, m31118w1(), false);
        C7140c.m21200G(parcel, 4, m31116u1(), false);
        C7140c.m21200G(parcel, 5, m31115R(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
