package ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends ea.a implements n {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f295a;

    /* renamed from: b, reason: collision with root package name */
    private final String f296b;

    public h(List list, String str) {
        this.f295a = list;
        this.f296b = str;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.f296b != null ? Status.f9292r : Status.f9296v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.I(parcel, 1, this.f295a, false);
        ea.c.G(parcel, 2, this.f296b, false);
        ea.c.b(parcel, a10);
    }
}
