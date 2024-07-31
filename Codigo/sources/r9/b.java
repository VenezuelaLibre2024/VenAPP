package r9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    final int f24805a;

    /* renamed from: b, reason: collision with root package name */
    int f24806b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    String f24807c;

    /* renamed from: d, reason: collision with root package name */
    Account f24808d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, String str, Account account) {
        this.f24805a = i10;
        this.f24806b = i11;
        this.f24807c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f24808d = account;
        } else {
            this.f24808d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f24805a);
        ea.c.u(parcel, 2, this.f24806b);
        ea.c.G(parcel, 3, this.f24807c, false);
        ea.c.E(parcel, 4, this.f24808d, i10, false);
        ea.c.b(parcel, a10);
    }
}
