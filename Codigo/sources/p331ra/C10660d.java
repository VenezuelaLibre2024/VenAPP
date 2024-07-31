package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p331ra.EnumC10659c;

@Deprecated
/* renamed from: ra.d */
/* loaded from: classes.dex */
public class C10660d extends AbstractC7138a {
    public static final Parcelable.Creator<C10660d> CREATOR = new C10666j();

    /* renamed from: a */
    private final int f26960a;

    /* renamed from: b */
    private final EnumC10659c f26961b;

    /* renamed from: c */
    private final byte[] f26962c;

    /* renamed from: d */
    private final String f26963d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10660d(int i10, String str, byte[] bArr, String str2) {
        this.f26960a = i10;
        try {
            this.f26961b = EnumC10659c.m32451b(str);
            this.f26962c = bArr;
            this.f26963d = str2;
        } catch (EnumC10659c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10660d)) {
            return false;
        }
        C10660d c10660d = (C10660d) obj;
        if (!Arrays.equals(this.f26962c, c10660d.f26962c) || this.f26961b != c10660d.f26961b) {
            return false;
        }
        String str = this.f26963d;
        String str2 = c10660d.f26963d;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f26962c) + 31) * 31) + this.f26961b.hashCode();
        String str = this.f26963d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: u1 */
    public String m32452u1() {
        return this.f26963d;
    }

    /* renamed from: v1 */
    public byte[] m32453v1() {
        return this.f26962c;
    }

    /* renamed from: w1 */
    public int m32454w1() {
        return this.f26960a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m32454w1());
        C7140c.m21200G(parcel, 2, this.f26961b.toString(), false);
        C7140c.m21220l(parcel, 3, m32453v1(), false);
        C7140c.m21200G(parcel, 4, m32452u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
