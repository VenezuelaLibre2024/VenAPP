package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.InterfaceC5312b;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.x */
/* loaded from: classes2.dex */
public class C11522x extends AbstractC7138a {
    public static final Parcelable.Creator<C11522x> CREATOR = new C11527z0();

    /* renamed from: a */
    protected final C11478b f29895a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11522x(IBinder iBinder) {
        this.f29895a = new C11478b(InterfaceC5312b.a.m13410f2(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C11478b c11478b = this.f29895a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21228t(parcel, 2, c11478b.m35908a().asBinder(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
