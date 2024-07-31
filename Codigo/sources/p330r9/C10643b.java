package p330r9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: r9.b */
/* loaded from: classes.dex */
public class C10643b extends AbstractC7138a {
    public static final Parcelable.Creator<C10643b> CREATOR = new C10649h();

    /* renamed from: a */
    final int f26919a;

    /* renamed from: b */
    int f26920b;

    /* renamed from: c */
    @Deprecated
    String f26921c;

    /* renamed from: d */
    Account f26922d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10643b(int i10, int i11, String str, Account account) {
        this.f26919a = i10;
        this.f26920b = i11;
        this.f26921c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f26922d = account;
        } else {
            this.f26922d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f26919a);
        C7140c.m21229u(parcel, 2, this.f26920b);
        C7140c.m21200G(parcel, 3, this.f26921c, false);
        C7140c.m21198E(parcel, 4, this.f26922d, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
