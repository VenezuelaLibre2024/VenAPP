package p330r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: r9.c */
/* loaded from: classes.dex */
public class C10644c extends AbstractC7138a {
    public static final Parcelable.Creator<C10644c> CREATOR = new C10650i();

    /* renamed from: a */
    final int f26923a;

    /* renamed from: b */
    final List f26924b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10644c(int i10, List list) {
        this.f26923a = i10;
        this.f26924b = (List) C5276s.m13324j(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f26923a);
        C7140c.m21204K(parcel, 2, this.f26924b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
