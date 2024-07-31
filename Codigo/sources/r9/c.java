package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import java.util.List;

/* loaded from: classes.dex */
public class c extends ea.a {
    public static final Parcelable.Creator<c> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    final int f24809a;

    /* renamed from: b, reason: collision with root package name */
    final List f24810b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i10, List list) {
        this.f24809a = i10;
        this.f24810b = (List) s.j(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f24809a);
        ea.c.K(parcel, 2, this.f24810b, false);
        ea.c.b(parcel, a10);
    }
}
