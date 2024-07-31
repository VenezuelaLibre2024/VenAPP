package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class g0 extends ea.a {
    public static final Parcelable.Creator<g0> CREATOR = new i1();

    /* renamed from: a, reason: collision with root package name */
    private final List f23829a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(List list) {
        this.f23829a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        List list2 = this.f23829a;
        return (list2 == null && g0Var.f23829a == null) || (list2 != null && (list = g0Var.f23829a) != null && list2.containsAll(list) && g0Var.f23829a.containsAll(this.f23829a));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(new HashSet(this.f23829a));
    }

    public List<h0> u1() {
        return this.f23829a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, u1(), false);
        ea.c.b(parcel, a10);
    }
}
