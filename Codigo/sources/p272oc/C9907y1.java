package p272oc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzafc;
import com.google.android.gms.internal.p498firebaseauthapi.zzafs;
import com.google.android.gms.internal.p498firebaseauthapi.zzxw;
import com.google.firebase.auth.InterfaceC6054c1;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: oc.y1 */
/* loaded from: classes.dex */
public final class C9907y1 extends AbstractC7138a implements InterfaceC6054c1 {
    public static final Parcelable.Creator<C9907y1> CREATOR = new C9838b2();

    /* renamed from: a */
    private String f24420a;

    /* renamed from: b */
    private String f24421b;

    /* renamed from: c */
    private String f24422c;

    /* renamed from: d */
    private String f24423d;

    /* renamed from: e */
    private Uri f24424e;

    /* renamed from: f */
    private String f24425f;

    /* renamed from: r */
    private String f24426r;

    /* renamed from: s */
    private boolean f24427s;

    /* renamed from: t */
    private String f24428t;

    public C9907y1(zzafc zzafcVar, String str) {
        C5276s.m13324j(zzafcVar);
        C5276s.m13320f(str);
        this.f24420a = C5276s.m13320f(zzafcVar.zzi());
        this.f24421b = str;
        this.f24425f = zzafcVar.zzh();
        this.f24422c = zzafcVar.zzg();
        Uri zzc = zzafcVar.zzc();
        if (zzc != null) {
            this.f24423d = zzc.toString();
            this.f24424e = zzc;
        }
        this.f24427s = zzafcVar.zzm();
        this.f24428t = null;
        this.f24426r = zzafcVar.zzj();
    }

    public C9907y1(zzafs zzafsVar) {
        C5276s.m13324j(zzafsVar);
        this.f24420a = zzafsVar.zzd();
        this.f24421b = C5276s.m13320f(zzafsVar.zzf());
        this.f24422c = zzafsVar.zzb();
        Uri zza = zzafsVar.zza();
        if (zza != null) {
            this.f24423d = zza.toString();
            this.f24424e = zza;
        }
        this.f24425f = zzafsVar.zzc();
        this.f24426r = zzafsVar.zze();
        this.f24427s = false;
        this.f24428t = zzafsVar.zzg();
    }

    public C9907y1(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f24420a = str;
        this.f24421b = str2;
        this.f24425f = str3;
        this.f24426r = str4;
        this.f24422c = str5;
        this.f24423d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f24424e = Uri.parse(this.f24423d);
        }
        this.f24427s = z10;
        this.f24428t = str7;
    }

    /* renamed from: u1 */
    public static C9907y1 m29623u1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C9907y1(jSONObject.optString(Constants.USER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxw(e10);
        }
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: B0 */
    public final boolean mo16478B0() {
        return this.f24427s;
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: E */
    public final String mo16434E() {
        return this.f24426r;
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: R */
    public final String mo16448R() {
        return this.f24422c;
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: l */
    public final String mo16454l() {
        return this.f24420a;
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: q */
    public final String mo16479q() {
        return this.f24421b;
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: r */
    public final String mo16455r() {
        return this.f24425f;
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: v0 */
    public final Uri mo16457v0() {
        if (!TextUtils.isEmpty(this.f24423d) && this.f24424e == null) {
            this.f24424e = Uri.parse(this.f24423d);
        }
        return this.f24424e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, mo16454l(), false);
        C7140c.m21200G(parcel, 2, mo16479q(), false);
        C7140c.m21200G(parcel, 3, mo16448R(), false);
        C7140c.m21200G(parcel, 4, this.f24423d, false);
        C7140c.m21200G(parcel, 5, mo16455r(), false);
        C7140c.m21200G(parcel, 6, mo16434E(), false);
        C7140c.m21215g(parcel, 7, mo16478B0());
        C7140c.m21200G(parcel, 8, this.f24428t, false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final String zza() {
        return this.f24428t;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Constants.USER_ID, this.f24420a);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID, this.f24421b);
            jSONObject.putOpt("displayName", this.f24422c);
            jSONObject.putOpt("photoUrl", this.f24423d);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.EMAIL, this.f24425f);
            jSONObject.putOpt("phoneNumber", this.f24426r);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f24427s));
            jSONObject.putOpt("rawUserInfo", this.f24428t);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }
}
