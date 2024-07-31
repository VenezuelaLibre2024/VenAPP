package ca;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ca.d0 */
/* loaded from: classes.dex */
public final class C1899d0 extends AbstractC7138a {
    public static final Parcelable.Creator<C1899d0> CREATOR = new C1901e0();

    /* renamed from: a */
    private final String f7909a;

    /* renamed from: b */
    private final boolean f7910b;

    /* renamed from: c */
    private final boolean f7911c;

    /* renamed from: d */
    private final Context f7912d;

    /* renamed from: e */
    private final boolean f7913e;

    /* renamed from: f */
    private final boolean f7914f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1899d0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f7909a = str;
        this.f7910b = z10;
        this.f7911c = z11;
        this.f7912d = (Context) BinderC5314d.m13411g2(InterfaceC5312b.a.m13410f2(iBinder));
        this.f7913e = z12;
        this.f7914f = z13;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.dynamic.b, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f7909a, false);
        C7140c.m21215g(parcel, 2, this.f7910b);
        C7140c.m21215g(parcel, 3, this.f7911c);
        C7140c.m21228t(parcel, 4, BinderC5314d.m13412h2(this.f7912d), false);
        C7140c.m21215g(parcel, 5, this.f7913e);
        C7140c.m21215g(parcel, 6, this.f7914f);
        C7140c.m21210b(parcel, m21209a);
    }
}
