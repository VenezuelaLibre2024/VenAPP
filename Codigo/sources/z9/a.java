package z9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f32465a;

    /* renamed from: b, reason: collision with root package name */
    private int f32466b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f32467c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, int i11, Bundle bundle) {
        this.f32465a = i10;
        this.f32466b = i11;
        this.f32467c = bundle;
    }

    public int u1() {
        return this.f32466b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f32465a);
        ea.c.u(parcel, 2, u1());
        ea.c.j(parcel, 3, this.f32467c, false);
        ea.c.b(parcel, a10);
    }
}
