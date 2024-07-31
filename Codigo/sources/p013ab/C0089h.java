package p013ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ab.h */
/* loaded from: classes2.dex */
public final class C0089h extends AbstractC7138a implements InterfaceC5204n {
    public static final Parcelable.Creator<C0089h> CREATOR = new C0090i();

    /* renamed from: a */
    private final List f346a;

    /* renamed from: b */
    private final String f347b;

    public C0089h(List list, String str) {
        this.f346a = list;
        this.f347b = str;
    }

    @Override // com.google.android.gms.common.api.InterfaceC5204n
    public final Status getStatus() {
        return this.f347b != null ? Status.f10400r : Status.f10404v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21202I(parcel, 1, this.f346a, false);
        C7140c.m21200G(parcel, 2, this.f347b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
