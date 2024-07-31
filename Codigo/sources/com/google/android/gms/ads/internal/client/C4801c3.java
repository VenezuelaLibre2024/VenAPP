package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p438x8.C12353b;
import p438x8.C12377o;
import p438x8.C12388z;

/* renamed from: com.google.android.gms.ads.internal.client.c3 */
/* loaded from: classes.dex */
public final class C4801c3 extends AbstractC7138a {
    public static final Parcelable.Creator<C4801c3> CREATOR = new C4809d4();

    /* renamed from: a */
    public final int f9703a;

    /* renamed from: b */
    public final String f9704b;

    /* renamed from: c */
    public final String f9705c;

    /* renamed from: d */
    public C4801c3 f9706d;

    /* renamed from: e */
    public IBinder f9707e;

    public C4801c3(int i10, String str, String str2, C4801c3 c4801c3, IBinder iBinder) {
        this.f9703a = i10;
        this.f9704b = str;
        this.f9705c = str2;
        this.f9706d = c4801c3;
        this.f9707e = iBinder;
    }

    /* renamed from: u1 */
    public final C12353b m12370u1() {
        C12353b c12353b;
        C4801c3 c4801c3 = this.f9706d;
        if (c4801c3 == null) {
            c12353b = null;
        } else {
            String str = c4801c3.f9705c;
            c12353b = new C12353b(c4801c3.f9703a, c4801c3.f9704b, str);
        }
        return new C12353b(this.f9703a, this.f9704b, this.f9705c, c12353b);
    }

    /* renamed from: v1 */
    public final C12377o m12371v1() {
        C12353b c12353b;
        C4801c3 c4801c3 = this.f9706d;
        InterfaceC4885p2 interfaceC4885p2 = null;
        if (c4801c3 == null) {
            c12353b = null;
        } else {
            c12353b = new C12353b(c4801c3.f9703a, c4801c3.f9704b, c4801c3.f9705c);
        }
        int i10 = this.f9703a;
        String str = this.f9704b;
        String str2 = this.f9705c;
        IBinder iBinder = this.f9707e;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            interfaceC4885p2 = queryLocalInterface instanceof InterfaceC4885p2 ? (InterfaceC4885p2) queryLocalInterface : new C4873n2(iBinder);
        }
        return new C12377o(i10, str, str2, c12353b, C12388z.m40046f(interfaceC4885p2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9703a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, i11);
        C7140c.m21200G(parcel, 2, this.f9704b, false);
        C7140c.m21200G(parcel, 3, this.f9705c, false);
        C7140c.m21198E(parcel, 4, this.f9706d, i10, false);
        C7140c.m21228t(parcel, 5, this.f9707e, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
