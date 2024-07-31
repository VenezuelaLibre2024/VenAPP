package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Arrays;
import java.util.List;
import p081ea.C7140c;

/* renamed from: qa.x */
/* loaded from: classes.dex */
public class C10406x extends AbstractC10338c0 {
    public static final Parcelable.Creator<C10406x> CREATOR = new C10407x0();

    /* renamed from: a */
    private final byte[] f25929a;

    /* renamed from: b */
    private final Double f25930b;

    /* renamed from: c */
    private final String f25931c;

    /* renamed from: d */
    private final List f25932d;

    /* renamed from: e */
    private final Integer f25933e;

    /* renamed from: f */
    private final C10346e0 f25934f;

    /* renamed from: r */
    private final EnumC10359h1 f25935r;

    /* renamed from: s */
    private final C10341d f25936s;

    /* renamed from: t */
    private final Long f25937t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10406x(byte[] bArr, Double d10, String str, List list, Integer num, C10346e0 c10346e0, String str2, C10341d c10341d, Long l10) {
        this.f25929a = (byte[]) C5276s.m13324j(bArr);
        this.f25930b = d10;
        this.f25931c = (String) C5276s.m13324j(str);
        this.f25932d = list;
        this.f25933e = num;
        this.f25934f = c10346e0;
        this.f25937t = l10;
        if (str2 != null) {
            try {
                this.f25935r = EnumC10359h1.m31144b(str2);
            } catch (C10355g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f25935r = null;
        }
        this.f25936s = c10341d;
    }

    /* renamed from: A1 */
    public C10346e0 m31187A1() {
        return this.f25934f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C10406x)) {
            return false;
        }
        C10406x c10406x = (C10406x) obj;
        return Arrays.equals(this.f25929a, c10406x.f25929a) && C5270q.m13304b(this.f25930b, c10406x.f25930b) && C5270q.m13304b(this.f25931c, c10406x.f25931c) && (((list = this.f25932d) == null && c10406x.f25932d == null) || (list != null && (list2 = c10406x.f25932d) != null && list.containsAll(list2) && c10406x.f25932d.containsAll(this.f25932d))) && C5270q.m13304b(this.f25933e, c10406x.f25933e) && C5270q.m13304b(this.f25934f, c10406x.f25934f) && C5270q.m13304b(this.f25935r, c10406x.f25935r) && C5270q.m13304b(this.f25936s, c10406x.f25936s) && C5270q.m13304b(this.f25937t, c10406x.f25937t);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(Arrays.hashCode(this.f25929a)), this.f25930b, this.f25931c, this.f25932d, this.f25933e, this.f25934f, this.f25935r, this.f25936s, this.f25937t);
    }

    /* renamed from: u1 */
    public List<C10400v> m31188u1() {
        return this.f25932d;
    }

    /* renamed from: v1 */
    public C10341d m31189v1() {
        return this.f25936s;
    }

    /* renamed from: w1 */
    public byte[] m31190w1() {
        return this.f25929a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21220l(parcel, 2, m31190w1(), false);
        C7140c.m21224p(parcel, 3, m31193z1(), false);
        C7140c.m21200G(parcel, 4, m31192y1(), false);
        C7140c.m21204K(parcel, 5, m31188u1(), false);
        C7140c.m21232x(parcel, 6, m31191x1(), false);
        C7140c.m21198E(parcel, 7, m31187A1(), i10, false);
        EnumC10359h1 enumC10359h1 = this.f25935r;
        C7140c.m21200G(parcel, 8, enumC10359h1 == null ? null : enumC10359h1.toString(), false);
        C7140c.m21198E(parcel, 9, m31189v1(), i10, false);
        C7140c.m21195B(parcel, 10, this.f25937t, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public Integer m31191x1() {
        return this.f25933e;
    }

    /* renamed from: y1 */
    public String m31192y1() {
        return this.f25931c;
    }

    /* renamed from: z1 */
    public Double m31193z1() {
        return this.f25930b;
    }
}
