package p013ab;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ab.b */
/* loaded from: classes2.dex */
public final class C0083b extends AbstractC7138a implements InterfaceC5204n {
    public static final Parcelable.Creator<C0083b> CREATOR = new C0084c();

    /* renamed from: a */
    final int f343a;

    /* renamed from: b */
    private int f344b;

    /* renamed from: c */
    private Intent f345c;

    public C0083b() {
        this(2, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0083b(int i10, int i11, Intent intent) {
        this.f343a = i10;
        this.f344b = i11;
        this.f345c = intent;
    }

    @Override // com.google.android.gms.common.api.InterfaceC5204n
    public final Status getStatus() {
        return this.f344b == 0 ? Status.f10400r : Status.f10404v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f343a);
        C7140c.m21229u(parcel, 2, this.f344b);
        C7140c.m21198E(parcel, 3, this.f345c, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
