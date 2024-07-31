package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C5276s;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

@Deprecated
/* renamed from: ra.e */
/* loaded from: classes.dex */
public class C10661e extends AbstractC7138a {
    public static final Parcelable.Creator<C10661e> CREATOR = new C10667k();

    /* renamed from: a */
    private final C10658b f26964a;

    /* renamed from: b */
    private final String f26965b;

    /* renamed from: c */
    String f26966c;

    public C10661e(C10658b c10658b, String str, String str2) {
        this.f26964a = (C10658b) C5276s.m13324j(c10658b);
        this.f26966c = str;
        this.f26965b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10661e)) {
            return false;
        }
        C10661e c10661e = (C10661e) obj;
        String str = this.f26966c;
        if (str == null) {
            if (c10661e.f26966c != null) {
                return false;
            }
        } else if (!str.equals(c10661e.f26966c)) {
            return false;
        }
        if (!this.f26964a.equals(c10661e.f26964a)) {
            return false;
        }
        String str2 = this.f26965b;
        String str3 = c10661e.f26965b;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26966c;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f26964a.hashCode();
        String str2 = this.f26965b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f26964a.m32447u1(), 11));
            if (this.f26964a.m32448v1() != EnumC10659c.UNKNOWN) {
                jSONObject.put("version", this.f26964a.m32448v1().toString());
            }
            if (this.f26964a.m32449w1() != null) {
                jSONObject.put("transports", this.f26964a.m32449w1().toString());
            }
            String str = this.f26966c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f26965b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: u1 */
    public String m32455u1() {
        return this.f26965b;
    }

    /* renamed from: v1 */
    public String m32456v1() {
        return this.f26966c;
    }

    /* renamed from: w1 */
    public C10658b m32457w1() {
        return this.f26964a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m32457w1(), i10, false);
        C7140c.m21200G(parcel, 3, m32456v1(), false);
        C7140c.m21200G(parcel, 4, m32455u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
