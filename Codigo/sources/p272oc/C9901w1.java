package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.InterfaceC6068g;
import com.google.firebase.auth.InterfaceC6076i;
import java.util.List;
import p081ea.C7140c;

/* renamed from: oc.w1 */
/* loaded from: classes.dex */
public final class C9901w1 implements InterfaceC6076i {
    public static final Parcelable.Creator<C9901w1> CREATOR = new C9910z1();

    /* renamed from: a */
    private C9842d f24406a;

    /* renamed from: b */
    private C9895u1 f24407b;

    /* renamed from: c */
    private C6059d2 f24408c;

    public C9901w1(C9842d c9842d) {
        C9842d c9842d2 = (C9842d) C5276s.m13324j(c9842d);
        this.f24406a = c9842d2;
        List<C9907y1> m29514c2 = c9842d2.m29514c2();
        this.f24407b = null;
        for (int i10 = 0; i10 < m29514c2.size(); i10++) {
            if (!TextUtils.isEmpty(m29514c2.get(i10).zza())) {
                this.f24407b = new C9895u1(m29514c2.get(i10).mo16479q(), m29514c2.get(i10).zza(), c9842d.m29515d2());
            }
        }
        if (this.f24407b == null) {
            this.f24407b = new C9895u1(c9842d.m29515d2());
        }
        this.f24408c = c9842d.m29513b2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9901w1(C9842d c9842d, C9895u1 c9895u1, C6059d2 c6059d2) {
        this.f24406a = c9842d;
        this.f24407b = c9895u1;
        this.f24408c = c6059d2;
    }

    @Override // com.google.firebase.auth.InterfaceC6076i
    /* renamed from: W0 */
    public final InterfaceC6068g mo16535W0() {
        return this.f24407b;
    }

    @Override // com.google.firebase.auth.InterfaceC6076i
    /* renamed from: a1 */
    public final AbstractC6072h mo16536a1() {
        return this.f24408c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.InterfaceC6076i
    /* renamed from: j0 */
    public final AbstractC6045a0 mo16537j0() {
        return this.f24406a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, mo16537j0(), i10, false);
        C7140c.m21198E(parcel, 2, mo16535W0(), i10, false);
        C7140c.m21198E(parcel, 3, this.f24408c, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
