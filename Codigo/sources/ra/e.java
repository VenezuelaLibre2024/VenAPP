package ra;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    private final b f24848a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24849b;

    /* renamed from: c, reason: collision with root package name */
    String f24850c;

    public e(b bVar, String str, String str2) {
        this.f24848a = (b) s.j(bVar);
        this.f24850c = str;
        this.f24849b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f24850c;
        if (str == null) {
            if (eVar.f24850c != null) {
                return false;
            }
        } else if (!str.equals(eVar.f24850c)) {
            return false;
        }
        if (!this.f24848a.equals(eVar.f24848a)) {
            return false;
        }
        String str2 = this.f24849b;
        String str3 = eVar.f24849b;
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
        String str = this.f24850c;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f24848a.hashCode();
        String str2 = this.f24849b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f24848a.u1(), 11));
            if (this.f24848a.v1() != c.UNKNOWN) {
                jSONObject.put("version", this.f24848a.v1().toString());
            }
            if (this.f24848a.w1() != null) {
                jSONObject.put("transports", this.f24848a.w1().toString());
            }
            String str = this.f24850c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f24849b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String u1() {
        return this.f24849b;
    }

    public String v1() {
        return this.f24850c;
    }

    public b w1() {
        return this.f24848a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, w1(), i10, false);
        ea.c.G(parcel, 3, v1(), false);
        ea.c.G(parcel, 4, u1(), false);
        ea.c.b(parcel, a10);
    }
}
