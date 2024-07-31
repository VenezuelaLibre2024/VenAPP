package oc;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;

/* loaded from: classes.dex */
public final class u1 implements com.google.firebase.auth.g {
    public static final Parcelable.Creator<u1> CREATOR = new x1();

    /* renamed from: a, reason: collision with root package name */
    private final String f22459a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22460b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f22461c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22462d;

    public u1(String str, String str2, boolean z10) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        this.f22459a = str;
        this.f22460b = str2;
        this.f22461c = j0.d(str2);
        this.f22462d = z10;
    }

    public u1(boolean z10) {
        this.f22462d = z10;
        this.f22460b = null;
        this.f22459a = null;
        this.f22461c = null;
    }

    @Override // com.google.firebase.auth.g
    public final String L0() {
        Map<String, Object> map;
        String str;
        if (Constants.SIGN_IN_METHOD_GITHUB.equals(this.f22459a)) {
            map = this.f22461c;
            str = "login";
        } else {
            if (!Constants.SIGN_IN_METHOD_TWITTER.equals(this.f22459a)) {
                return null;
            }
            map = this.f22461c;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // com.google.firebase.auth.g
    public final Map<String, Object> b1() {
        return this.f22461c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.g
    public final boolean m0() {
        return this.f22462d;
    }

    @Override // com.google.firebase.auth.g
    public final String q() {
        return this.f22459a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, q(), false);
        ea.c.G(parcel, 2, this.f22460b, false);
        ea.c.g(parcel, 3, m0());
        ea.c.b(parcel, a10);
    }
}
