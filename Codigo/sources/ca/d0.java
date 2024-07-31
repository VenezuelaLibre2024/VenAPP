package ca;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;

/* loaded from: classes.dex */
public final class d0 extends ea.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    private final String f6960a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6961b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6962c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6963d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6964e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6965f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f6960a = str;
        this.f6961b = z10;
        this.f6962c = z11;
        this.f6963d = (Context) com.google.android.gms.dynamic.d.g2(b.a.f2(iBinder));
        this.f6964e = z12;
        this.f6965f = z13;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.dynamic.b, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f6960a, false);
        ea.c.g(parcel, 2, this.f6961b);
        ea.c.g(parcel, 3, this.f6962c);
        ea.c.t(parcel, 4, com.google.android.gms.dynamic.d.h2(this.f6963d), false);
        ea.c.g(parcel, 5, this.f6964e);
        ea.c.g(parcel, 6, this.f6965f);
        ea.c.b(parcel, a10);
    }
}
