package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import la.C9458c;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p331ra.EnumC10659c;

@Deprecated
/* renamed from: ra.b */
/* loaded from: classes.dex */
public class C10658b extends AbstractC7138a {
    public static final Parcelable.Creator<C10658b> CREATOR = new C10664h();

    /* renamed from: a */
    private final int f26954a;

    /* renamed from: b */
    private final byte[] f26955b;

    /* renamed from: c */
    private final EnumC10659c f26956c;

    /* renamed from: d */
    private final List f26957d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10658b(int i10, byte[] bArr, String str, List list) {
        this.f26954a = i10;
        this.f26955b = bArr;
        try {
            this.f26956c = EnumC10659c.m32451b(str);
            this.f26957d = list;
        } catch (EnumC10659c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10658b)) {
            return false;
        }
        C10658b c10658b = (C10658b) obj;
        if (!Arrays.equals(this.f26955b, c10658b.f26955b) || !this.f26956c.equals(c10658b.f26956c)) {
            return false;
        }
        List list2 = this.f26957d;
        if (list2 == null && c10658b.f26957d == null) {
            return true;
        }
        return list2 != null && (list = c10658b.f26957d) != null && list2.containsAll(list) && c10658b.f26957d.containsAll(this.f26957d);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(Arrays.hashCode(this.f26955b)), this.f26956c, this.f26957d);
    }

    public String toString() {
        List list = this.f26957d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", C9458c.m28126c(this.f26955b), this.f26956c, list == null ? "null" : list.toString());
    }

    /* renamed from: u1 */
    public byte[] m32447u1() {
        return this.f26955b;
    }

    /* renamed from: v1 */
    public EnumC10659c m32448v1() {
        return this.f26956c;
    }

    /* renamed from: w1 */
    public List<Transport> m32449w1() {
        return this.f26957d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m32450x1());
        C7140c.m21220l(parcel, 2, m32447u1(), false);
        C7140c.m21200G(parcel, 3, this.f26956c.toString(), false);
        C7140c.m21204K(parcel, 4, m32449w1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public int m32450x1() {
        return this.f26954a;
    }
}
