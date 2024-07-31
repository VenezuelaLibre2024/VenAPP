package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.t */
/* loaded from: classes.dex */
public class C10394t extends AbstractC7138a {
    public static final Parcelable.Creator<C10394t> CREATOR = new C10398u0();

    /* renamed from: a */
    private final String f25904a;

    /* renamed from: b */
    private final String f25905b;

    /* renamed from: c */
    private final byte[] f25906c;

    /* renamed from: d */
    private final C10357h f25907d;

    /* renamed from: e */
    private final C10353g f25908e;

    /* renamed from: f */
    private final C10361i f25909f;

    /* renamed from: r */
    private final C10345e f25910r;

    /* renamed from: s */
    private final String f25911s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10394t(String str, String str2, byte[] bArr, C10357h c10357h, C10353g c10353g, C10361i c10361i, C10345e c10345e, String str3) {
        boolean z10 = true;
        if ((c10357h == null || c10353g != null || c10361i != null) && ((c10357h != null || c10353g == null || c10361i != null) && (c10357h != null || c10353g != null || c10361i == null))) {
            z10 = false;
        }
        C5276s.m13315a(z10);
        this.f25904a = str;
        this.f25905b = str2;
        this.f25906c = bArr;
        this.f25907d = c10357h;
        this.f25908e = c10353g;
        this.f25909f = c10361i;
        this.f25910r = c10345e;
        this.f25911s = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10394t)) {
            return false;
        }
        C10394t c10394t = (C10394t) obj;
        return C5270q.m13304b(this.f25904a, c10394t.f25904a) && C5270q.m13304b(this.f25905b, c10394t.f25905b) && Arrays.equals(this.f25906c, c10394t.f25906c) && C5270q.m13304b(this.f25907d, c10394t.f25907d) && C5270q.m13304b(this.f25908e, c10394t.f25908e) && C5270q.m13304b(this.f25909f, c10394t.f25909f) && C5270q.m13304b(this.f25910r, c10394t.f25910r) && C5270q.m13304b(this.f25911s, c10394t.f25911s);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25904a, this.f25905b, this.f25906c, this.f25908e, this.f25907d, this.f25909f, this.f25910r, this.f25911s);
    }

    /* renamed from: u1 */
    public String m31166u1() {
        return this.f25911s;
    }

    /* renamed from: v1 */
    public C10345e m31167v1() {
        return this.f25910r;
    }

    /* renamed from: w1 */
    public String m31168w1() {
        return this.f25904a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m31168w1(), false);
        C7140c.m21200G(parcel, 2, m31170y1(), false);
        C7140c.m21220l(parcel, 3, m31169x1(), false);
        C7140c.m21198E(parcel, 4, this.f25907d, i10, false);
        C7140c.m21198E(parcel, 5, this.f25908e, i10, false);
        C7140c.m21198E(parcel, 6, this.f25909f, i10, false);
        C7140c.m21198E(parcel, 7, m31167v1(), i10, false);
        C7140c.m21200G(parcel, 8, m31166u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public byte[] m31169x1() {
        return this.f25906c;
    }

    /* renamed from: y1 */
    public String m31170y1() {
        return this.f25905b;
    }
}
