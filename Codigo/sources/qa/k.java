package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;
import qa.d0;

/* loaded from: classes.dex */
public class k extends ea.a {
    public static final Parcelable.Creator<k> CREATOR = new v1();

    /* renamed from: a, reason: collision with root package name */
    private final b f23841a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f23842b;

    /* renamed from: c, reason: collision with root package name */
    private final h1 f23843c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f23844d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, Boolean bool, String str2, String str3) {
        b b10;
        d0 d0Var = null;
        if (str == null) {
            b10 = null;
        } else {
            try {
                b10 = b.b(str);
            } catch (b.a | d0.a | g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f23841a = b10;
        this.f23842b = bool;
        this.f23843c = str2 == null ? null : h1.b(str2);
        if (str3 != null) {
            d0Var = d0.b(str3);
        }
        this.f23844d = d0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.q.b(this.f23841a, kVar.f23841a) && com.google.android.gms.common.internal.q.b(this.f23842b, kVar.f23842b) && com.google.android.gms.common.internal.q.b(this.f23843c, kVar.f23843c) && com.google.android.gms.common.internal.q.b(this.f23844d, kVar.f23844d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23841a, this.f23842b, this.f23843c, this.f23844d);
    }

    public String u1() {
        b bVar = this.f23841a;
        if (bVar == null) {
            return null;
        }
        return bVar.toString();
    }

    public Boolean v1() {
        return this.f23842b;
    }

    public String w1() {
        d0 d0Var = this.f23844d;
        if (d0Var == null) {
            return null;
        }
        return d0Var.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, u1(), false);
        ea.c.i(parcel, 3, v1(), false);
        h1 h1Var = this.f23843c;
        ea.c.G(parcel, 4, h1Var == null ? null : h1Var.toString(), false);
        ea.c.G(parcel, 5, w1(), false);
        ea.c.b(parcel, a10);
    }
}
