package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.e */
/* loaded from: classes.dex */
public class C10345e extends AbstractC7138a {
    public static final Parcelable.Creator<C10345e> CREATOR = new C10372l1();

    /* renamed from: a */
    private final C10354g0 f25856a;

    /* renamed from: b */
    private final C10381o1 f25857b;

    /* renamed from: c */
    private final C10349f f25858c;

    /* renamed from: d */
    private final C10387q1 f25859d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10345e(C10354g0 c10354g0, C10381o1 c10381o1, C10349f c10349f, C10387q1 c10387q1) {
        this.f25856a = c10354g0;
        this.f25857b = c10381o1;
        this.f25858c = c10349f;
        this.f25859d = c10387q1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10345e)) {
            return false;
        }
        C10345e c10345e = (C10345e) obj;
        return C5270q.m13304b(this.f25856a, c10345e.f25856a) && C5270q.m13304b(this.f25857b, c10345e.f25857b) && C5270q.m13304b(this.f25858c, c10345e.f25858c) && C5270q.m13304b(this.f25859d, c10345e.f25859d);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25856a, this.f25857b, this.f25858c, this.f25859d);
    }

    /* renamed from: u1 */
    public C10349f m31124u1() {
        return this.f25858c;
    }

    /* renamed from: v1 */
    public C10354g0 m31125v1() {
        return this.f25856a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m31125v1(), i10, false);
        C7140c.m21198E(parcel, 2, this.f25857b, i10, false);
        C7140c.m21198E(parcel, 3, m31124u1(), i10, false);
        C7140c.m21198E(parcel, 4, this.f25859d, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
