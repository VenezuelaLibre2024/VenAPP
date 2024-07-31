package p418wa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: wa.c */
/* loaded from: classes2.dex */
public final class C12097c extends AbstractC7138a {
    public static final Parcelable.Creator<C12097c> CREATOR = new C12095b();

    /* renamed from: a */
    public final Bundle f32202a;

    public C12097c(Bundle bundle) {
        this.f32202a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21218j(parcel, 1, this.f32202a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
