package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.d */
/* loaded from: classes.dex */
public class C10341d extends AbstractC7138a {
    public static final Parcelable.Creator<C10341d> CREATOR = new C10375m1();

    /* renamed from: a */
    private final C10388r f25845a;

    /* renamed from: b */
    private final C10336b2 f25846b;

    /* renamed from: c */
    private final C10350f0 f25847c;

    /* renamed from: d */
    private final C10360h2 f25848d;

    /* renamed from: e */
    private final C10368k0 f25849e;

    /* renamed from: f */
    private final C10374m0 f25850f;

    /* renamed from: r */
    private final C10344d2 f25851r;

    /* renamed from: s */
    private final C10383p0 f25852s;

    /* renamed from: t */
    private final C10391s f25853t;

    /* renamed from: u */
    private final C10389r0 f25854u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10341d(C10388r c10388r, C10336b2 c10336b2, C10350f0 c10350f0, C10360h2 c10360h2, C10368k0 c10368k0, C10374m0 c10374m0, C10344d2 c10344d2, C10383p0 c10383p0, C10391s c10391s, C10389r0 c10389r0) {
        this.f25845a = c10388r;
        this.f25847c = c10350f0;
        this.f25846b = c10336b2;
        this.f25848d = c10360h2;
        this.f25849e = c10368k0;
        this.f25850f = c10374m0;
        this.f25851r = c10344d2;
        this.f25852s = c10383p0;
        this.f25853t = c10391s;
        this.f25854u = c10389r0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10341d)) {
            return false;
        }
        C10341d c10341d = (C10341d) obj;
        return C5270q.m13304b(this.f25845a, c10341d.f25845a) && C5270q.m13304b(this.f25846b, c10341d.f25846b) && C5270q.m13304b(this.f25847c, c10341d.f25847c) && C5270q.m13304b(this.f25848d, c10341d.f25848d) && C5270q.m13304b(this.f25849e, c10341d.f25849e) && C5270q.m13304b(this.f25850f, c10341d.f25850f) && C5270q.m13304b(this.f25851r, c10341d.f25851r) && C5270q.m13304b(this.f25852s, c10341d.f25852s) && C5270q.m13304b(this.f25853t, c10341d.f25853t) && C5270q.m13304b(this.f25854u, c10341d.f25854u);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25845a, this.f25846b, this.f25847c, this.f25848d, this.f25849e, this.f25850f, this.f25851r, this.f25852s, this.f25853t, this.f25854u);
    }

    /* renamed from: u1 */
    public C10388r m31121u1() {
        return this.f25845a;
    }

    /* renamed from: v1 */
    public C10350f0 m31122v1() {
        return this.f25847c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m31121u1(), i10, false);
        C7140c.m21198E(parcel, 3, this.f25846b, i10, false);
        C7140c.m21198E(parcel, 4, m31122v1(), i10, false);
        C7140c.m21198E(parcel, 5, this.f25848d, i10, false);
        C7140c.m21198E(parcel, 6, this.f25849e, i10, false);
        C7140c.m21198E(parcel, 7, this.f25850f, i10, false);
        C7140c.m21198E(parcel, 8, this.f25851r, i10, false);
        C7140c.m21198E(parcel, 9, this.f25852s, i10, false);
        C7140c.m21198E(parcel, 10, this.f25853t, i10, false);
        C7140c.m21198E(parcel, 11, this.f25854u, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
