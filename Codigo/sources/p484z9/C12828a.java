package p484z9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: z9.a */
/* loaded from: classes.dex */
public class C12828a extends AbstractC7138a {
    public static final Parcelable.Creator<C12828a> CREATOR = new C12831d();

    /* renamed from: a */
    final int f35016a;

    /* renamed from: b */
    private int f35017b;

    /* renamed from: c */
    private Bundle f35018c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12828a(int i10, int i11, Bundle bundle) {
        this.f35016a = i10;
        this.f35017b = i11;
        this.f35018c = bundle;
    }

    /* renamed from: u1 */
    public int m42563u1() {
        return this.f35017b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f35016a);
        C7140c.m21229u(parcel, 2, m42563u1());
        C7140c.m21218j(parcel, 3, this.f35018c, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
