package f9;

import android.os.Parcel;
import android.os.Parcelable;
import ea.c;

/* loaded from: classes.dex */
public final class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f15056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15058c;

    public a(String str, String str2, String str3) {
        this.f15056a = str;
        this.f15057b = str2;
        this.f15058c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f15056a;
        int a10 = c.a(parcel);
        c.G(parcel, 1, str, false);
        c.G(parcel, 2, this.f15057b, false);
        c.G(parcel, 3, this.f15058c, false);
        c.b(parcel, a10);
    }
}
