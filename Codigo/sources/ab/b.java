package ab;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

/* loaded from: classes2.dex */
public final class b extends ea.a implements n {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f292a;

    /* renamed from: b, reason: collision with root package name */
    private int f293b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f294c;

    public b() {
        this(2, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, Intent intent) {
        this.f292a = i10;
        this.f293b = i11;
        this.f294c = intent;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.f293b == 0 ? Status.f9292r : Status.f9296v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f292a);
        ea.c.u(parcel, 2, this.f293b);
        ea.c.E(parcel, 3, this.f294c, i10, false);
        ea.c.b(parcel, a10);
    }
}
