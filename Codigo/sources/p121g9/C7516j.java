package p121g9;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: g9.j */
/* loaded from: classes.dex */
public final class C7516j extends AbstractC7138a {
    public static final Parcelable.Creator<C7516j> CREATOR = new C7515i();

    /* renamed from: a */
    public final String f17751a;

    /* renamed from: b */
    public final String f17752b;

    /* renamed from: c */
    public final String f17753c;

    /* renamed from: d */
    public final String f17754d;

    /* renamed from: e */
    public final String f17755e;

    /* renamed from: f */
    public final String f17756f;

    /* renamed from: r */
    public final String f17757r;

    /* renamed from: s */
    public final Intent f17758s;

    /* renamed from: t */
    public final InterfaceC7511f0 f17759t;

    /* renamed from: u */
    public final boolean f17760u;

    public C7516j(Intent intent, InterfaceC7511f0 interfaceC7511f0) {
        this(null, null, null, null, null, null, null, intent, BinderC5314d.m13412h2(interfaceC7511f0).asBinder(), false);
    }

    public C7516j(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f17751a = str;
        this.f17752b = str2;
        this.f17753c = str3;
        this.f17754d = str4;
        this.f17755e = str5;
        this.f17756f = str6;
        this.f17757r = str7;
        this.f17758s = intent;
        this.f17759t = (InterfaceC7511f0) BinderC5314d.m13411g2(InterfaceC5312b.a.m13410f2(iBinder));
        this.f17760u = z10;
    }

    public C7516j(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC7511f0 interfaceC7511f0) {
        this(str, str2, str3, str4, str5, str6, str7, null, BinderC5314d.m13412h2(interfaceC7511f0).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f17751a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, str, false);
        C7140c.m21200G(parcel, 3, this.f17752b, false);
        C7140c.m21200G(parcel, 4, this.f17753c, false);
        C7140c.m21200G(parcel, 5, this.f17754d, false);
        C7140c.m21200G(parcel, 6, this.f17755e, false);
        C7140c.m21200G(parcel, 7, this.f17756f, false);
        C7140c.m21200G(parcel, 8, this.f17757r, false);
        C7140c.m21198E(parcel, 9, this.f17758s, i10, false);
        C7140c.m21228t(parcel, 10, BinderC5314d.m13412h2(this.f17759t).asBinder(), false);
        C7140c.m21215g(parcel, 11, this.f17760u);
        C7140c.m21210b(parcel, m21209a);
    }
}
