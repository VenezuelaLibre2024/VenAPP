package p399v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.a */
/* loaded from: classes.dex */
public final class C11756a extends AbstractC7138a {
    public static final Parcelable.Creator<C11756a> CREATOR = new C11770m();

    /* renamed from: a */
    private final String f31089a;

    /* renamed from: b */
    private final String f31090b;

    /* renamed from: c */
    private final String f31091c;

    /* renamed from: d */
    private final List f31092d;

    /* renamed from: e */
    private final GoogleSignInAccount f31093e;

    /* renamed from: f */
    private final PendingIntent f31094f;

    public C11756a(String str, String str2, String str3, List<String> list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f31089a = str;
        this.f31090b = str2;
        this.f31091c = str3;
        this.f31092d = (List) C5276s.m13324j(list);
        this.f31094f = pendingIntent;
        this.f31093e = googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11756a)) {
            return false;
        }
        C11756a c11756a = (C11756a) obj;
        return C5270q.m13304b(this.f31089a, c11756a.f31089a) && C5270q.m13304b(this.f31090b, c11756a.f31090b) && C5270q.m13304b(this.f31091c, c11756a.f31091c) && C5270q.m13304b(this.f31092d, c11756a.f31092d) && C5270q.m13304b(this.f31094f, c11756a.f31094f) && C5270q.m13304b(this.f31093e, c11756a.f31093e);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31089a, this.f31090b, this.f31091c, this.f31092d, this.f31094f, this.f31093e);
    }

    /* renamed from: u1 */
    public String m37167u1() {
        return this.f31090b;
    }

    /* renamed from: v1 */
    public List<String> m37168v1() {
        return this.f31092d;
    }

    /* renamed from: w1 */
    public PendingIntent m37169w1() {
        return this.f31094f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m37170x1(), false);
        C7140c.m21200G(parcel, 2, m37167u1(), false);
        C7140c.m21200G(parcel, 3, this.f31091c, false);
        C7140c.m21202I(parcel, 4, m37168v1(), false);
        C7140c.m21198E(parcel, 5, m37171y1(), i10, false);
        C7140c.m21198E(parcel, 6, m37169w1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String m37170x1() {
        return this.f31089a;
    }

    /* renamed from: y1 */
    public GoogleSignInAccount m37171y1() {
        return this.f31093e;
    }
}
