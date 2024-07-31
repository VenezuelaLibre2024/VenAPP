package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.InterfaceC6068g;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;
import p081ea.C7140c;

/* renamed from: oc.u1 */
/* loaded from: classes.dex */
public final class C9895u1 implements InterfaceC6068g {
    public static final Parcelable.Creator<C9895u1> CREATOR = new C9904x1();

    /* renamed from: a */
    private final String f24392a;

    /* renamed from: b */
    private final String f24393b;

    /* renamed from: c */
    private Map<String, Object> f24394c;

    /* renamed from: d */
    private boolean f24395d;

    public C9895u1(String str, String str2, boolean z10) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        this.f24392a = str;
        this.f24393b = str2;
        this.f24394c = C9861j0.m29548d(str2);
        this.f24395d = z10;
    }

    public C9895u1(boolean z10) {
        this.f24395d = z10;
        this.f24393b = null;
        this.f24392a = null;
        this.f24394c = null;
    }

    @Override // com.google.firebase.auth.InterfaceC6068g
    /* renamed from: L0 */
    public final String mo16526L0() {
        Map<String, Object> map;
        String str;
        if (Constants.SIGN_IN_METHOD_GITHUB.equals(this.f24392a)) {
            map = this.f24394c;
            str = "login";
        } else {
            if (!Constants.SIGN_IN_METHOD_TWITTER.equals(this.f24392a)) {
                return null;
            }
            map = this.f24394c;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // com.google.firebase.auth.InterfaceC6068g
    /* renamed from: b1 */
    public final Map<String, Object> mo16527b1() {
        return this.f24394c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.InterfaceC6068g
    /* renamed from: m0 */
    public final boolean mo16528m0() {
        return this.f24395d;
    }

    @Override // com.google.firebase.auth.InterfaceC6068g
    /* renamed from: q */
    public final String mo16529q() {
        return this.f24392a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, mo16529q(), false);
        C7140c.m21200G(parcel, 2, this.f24393b, false);
        C7140c.m21215g(parcel, 3, mo16528m0());
        C7140c.m21210b(parcel, m21209a);
    }
}
