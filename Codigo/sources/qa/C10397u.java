package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Arrays;
import java.util.List;
import p081ea.C7140c;
import qa.EnumC10337c;

/* renamed from: qa.u */
/* loaded from: classes.dex */
public class C10397u extends AbstractC10338c0 {
    public static final Parcelable.Creator<C10397u> CREATOR = new C10395t0();

    /* renamed from: a */
    private final C10409y f25912a;

    /* renamed from: b */
    private final C10330a0 f25913b;

    /* renamed from: c */
    private final byte[] f25914c;

    /* renamed from: d */
    private final List f25915d;

    /* renamed from: e */
    private final Double f25916e;

    /* renamed from: f */
    private final List f25917f;

    /* renamed from: r */
    private final C10367k f25918r;

    /* renamed from: s */
    private final Integer f25919s;

    /* renamed from: t */
    private final C10346e0 f25920t;

    /* renamed from: u */
    private final EnumC10337c f25921u;

    /* renamed from: v */
    private final C10341d f25922v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10397u(C10409y c10409y, C10330a0 c10330a0, byte[] bArr, List list, Double d10, List list2, C10367k c10367k, Integer num, C10346e0 c10346e0, String str, C10341d c10341d) {
        this.f25912a = (C10409y) C5276s.m13324j(c10409y);
        this.f25913b = (C10330a0) C5276s.m13324j(c10330a0);
        this.f25914c = (byte[]) C5276s.m13324j(bArr);
        this.f25915d = (List) C5276s.m13324j(list);
        this.f25916e = d10;
        this.f25917f = list2;
        this.f25918r = c10367k;
        this.f25919s = num;
        this.f25920t = c10346e0;
        if (str != null) {
            try {
                this.f25921u = EnumC10337c.m31120b(str);
            } catch (EnumC10337c.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f25921u = null;
        }
        this.f25922v = c10341d;
    }

    /* renamed from: A1 */
    public Integer m31171A1() {
        return this.f25919s;
    }

    /* renamed from: B1 */
    public C10409y m31172B1() {
        return this.f25912a;
    }

    /* renamed from: C1 */
    public Double m31173C1() {
        return this.f25916e;
    }

    /* renamed from: D1 */
    public C10346e0 m31174D1() {
        return this.f25920t;
    }

    /* renamed from: E1 */
    public C10330a0 m31175E1() {
        return this.f25913b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C10397u)) {
            return false;
        }
        C10397u c10397u = (C10397u) obj;
        return C5270q.m13304b(this.f25912a, c10397u.f25912a) && C5270q.m13304b(this.f25913b, c10397u.f25913b) && Arrays.equals(this.f25914c, c10397u.f25914c) && C5270q.m13304b(this.f25916e, c10397u.f25916e) && this.f25915d.containsAll(c10397u.f25915d) && c10397u.f25915d.containsAll(this.f25915d) && (((list = this.f25917f) == null && c10397u.f25917f == null) || (list != null && (list2 = c10397u.f25917f) != null && list.containsAll(list2) && c10397u.f25917f.containsAll(this.f25917f))) && C5270q.m13304b(this.f25918r, c10397u.f25918r) && C5270q.m13304b(this.f25919s, c10397u.f25919s) && C5270q.m13304b(this.f25920t, c10397u.f25920t) && C5270q.m13304b(this.f25921u, c10397u.f25921u) && C5270q.m13304b(this.f25922v, c10397u.f25922v);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25912a, this.f25913b, Integer.valueOf(Arrays.hashCode(this.f25914c)), this.f25915d, this.f25916e, this.f25917f, this.f25918r, this.f25919s, this.f25920t, this.f25921u, this.f25922v);
    }

    /* renamed from: u1 */
    public String m31176u1() {
        EnumC10337c enumC10337c = this.f25921u;
        if (enumC10337c == null) {
            return null;
        }
        return enumC10337c.toString();
    }

    /* renamed from: v1 */
    public C10341d m31177v1() {
        return this.f25922v;
    }

    /* renamed from: w1 */
    public C10367k m31178w1() {
        return this.f25918r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m31172B1(), i10, false);
        C7140c.m21198E(parcel, 3, m31175E1(), i10, false);
        C7140c.m21220l(parcel, 4, m31179x1(), false);
        C7140c.m21204K(parcel, 5, m31181z1(), false);
        C7140c.m21224p(parcel, 6, m31173C1(), false);
        C7140c.m21204K(parcel, 7, m31180y1(), false);
        C7140c.m21198E(parcel, 8, m31178w1(), i10, false);
        C7140c.m21232x(parcel, 9, m31171A1(), false);
        C7140c.m21198E(parcel, 10, m31174D1(), i10, false);
        C7140c.m21200G(parcel, 11, m31176u1(), false);
        C7140c.m21198E(parcel, 12, m31177v1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public byte[] m31179x1() {
        return this.f25914c;
    }

    /* renamed from: y1 */
    public List<C10400v> m31180y1() {
        return this.f25917f;
    }

    /* renamed from: z1 */
    public List<C10403w> m31181z1() {
        return this.f25915d;
    }
}
