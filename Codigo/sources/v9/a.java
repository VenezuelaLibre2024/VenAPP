package v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new m();

    /* renamed from: a */
    private final String f28655a;

    /* renamed from: b */
    private final String f28656b;

    /* renamed from: c */
    private final String f28657c;

    /* renamed from: d */
    private final List f28658d;

    /* renamed from: e */
    private final GoogleSignInAccount f28659e;

    /* renamed from: f */
    private final PendingIntent f28660f;

    public a(String str, String str2, String str3, List<String> list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f28655a = str;
        this.f28656b = str2;
        this.f28657c = str3;
        this.f28658d = (List) com.google.android.gms.common.internal.s.j(list);
        this.f28660f = pendingIntent;
        this.f28659e = googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.q.b(this.f28655a, aVar.f28655a) && com.google.android.gms.common.internal.q.b(this.f28656b, aVar.f28656b) && com.google.android.gms.common.internal.q.b(this.f28657c, aVar.f28657c) && com.google.android.gms.common.internal.q.b(this.f28658d, aVar.f28658d) && com.google.android.gms.common.internal.q.b(this.f28660f, aVar.f28660f) && com.google.android.gms.common.internal.q.b(this.f28659e, aVar.f28659e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28655a, this.f28656b, this.f28657c, this.f28658d, this.f28660f, this.f28659e);
    }

    public String u1() {
        return this.f28656b;
    }

    public List<String> v1() {
        return this.f28658d;
    }

    public PendingIntent w1() {
        return this.f28660f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, x1(), false);
        ea.c.G(parcel, 2, u1(), false);
        ea.c.G(parcel, 3, this.f28657c, false);
        ea.c.I(parcel, 4, v1(), false);
        ea.c.E(parcel, 5, y1(), i10, false);
        ea.c.E(parcel, 6, w1(), i10, false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f28655a;
    }

    public GoogleSignInAccount y1() {
        return this.f28659e;
    }
}
