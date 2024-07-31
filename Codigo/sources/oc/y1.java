package oc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzafc;
import com.google.android.gms.internal.p002firebaseauthapi.zzafs;
import com.google.android.gms.internal.p002firebaseauthapi.zzxw;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y1 extends ea.a implements com.google.firebase.auth.c1 {
    public static final Parcelable.Creator<y1> CREATOR = new b2();

    /* renamed from: a, reason: collision with root package name */
    private String f22487a;

    /* renamed from: b, reason: collision with root package name */
    private String f22488b;

    /* renamed from: c, reason: collision with root package name */
    private String f22489c;

    /* renamed from: d, reason: collision with root package name */
    private String f22490d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f22491e;

    /* renamed from: f, reason: collision with root package name */
    private String f22492f;

    /* renamed from: r, reason: collision with root package name */
    private String f22493r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22494s;

    /* renamed from: t, reason: collision with root package name */
    private String f22495t;

    public y1(zzafc zzafcVar, String str) {
        com.google.android.gms.common.internal.s.j(zzafcVar);
        com.google.android.gms.common.internal.s.f(str);
        this.f22487a = com.google.android.gms.common.internal.s.f(zzafcVar.zzi());
        this.f22488b = str;
        this.f22492f = zzafcVar.zzh();
        this.f22489c = zzafcVar.zzg();
        Uri zzc = zzafcVar.zzc();
        if (zzc != null) {
            this.f22490d = zzc.toString();
            this.f22491e = zzc;
        }
        this.f22494s = zzafcVar.zzm();
        this.f22495t = null;
        this.f22493r = zzafcVar.zzj();
    }

    public y1(zzafs zzafsVar) {
        com.google.android.gms.common.internal.s.j(zzafsVar);
        this.f22487a = zzafsVar.zzd();
        this.f22488b = com.google.android.gms.common.internal.s.f(zzafsVar.zzf());
        this.f22489c = zzafsVar.zzb();
        Uri zza = zzafsVar.zza();
        if (zza != null) {
            this.f22490d = zza.toString();
            this.f22491e = zza;
        }
        this.f22492f = zzafsVar.zzc();
        this.f22493r = zzafsVar.zze();
        this.f22494s = false;
        this.f22495t = zzafsVar.zzg();
    }

    public y1(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f22487a = str;
        this.f22488b = str2;
        this.f22492f = str3;
        this.f22493r = str4;
        this.f22489c = str5;
        this.f22490d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f22491e = Uri.parse(this.f22490d);
        }
        this.f22494s = z10;
        this.f22495t = str7;
    }

    public static y1 u1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new y1(jSONObject.optString(Constants.USER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxw(e10);
        }
    }

    @Override // com.google.firebase.auth.c1
    public final boolean B0() {
        return this.f22494s;
    }

    @Override // com.google.firebase.auth.c1
    public final String E() {
        return this.f22493r;
    }

    @Override // com.google.firebase.auth.c1
    public final String R() {
        return this.f22489c;
    }

    @Override // com.google.firebase.auth.c1
    public final String l() {
        return this.f22487a;
    }

    @Override // com.google.firebase.auth.c1
    public final String q() {
        return this.f22488b;
    }

    @Override // com.google.firebase.auth.c1
    public final String r() {
        return this.f22492f;
    }

    @Override // com.google.firebase.auth.c1
    public final Uri v0() {
        if (!TextUtils.isEmpty(this.f22490d) && this.f22491e == null) {
            this.f22491e = Uri.parse(this.f22490d);
        }
        return this.f22491e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, l(), false);
        ea.c.G(parcel, 2, q(), false);
        ea.c.G(parcel, 3, R(), false);
        ea.c.G(parcel, 4, this.f22490d, false);
        ea.c.G(parcel, 5, r(), false);
        ea.c.G(parcel, 6, E(), false);
        ea.c.g(parcel, 7, B0());
        ea.c.G(parcel, 8, this.f22495t, false);
        ea.c.b(parcel, a10);
    }

    public final String zza() {
        return this.f22495t;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Constants.USER_ID, this.f22487a);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID, this.f22488b);
            jSONObject.putOpt("displayName", this.f22489c);
            jSONObject.putOpt("photoUrl", this.f22490d);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.EMAIL, this.f22492f);
            jSONObject.putOpt("phoneNumber", this.f22493r);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f22494s));
            jSONObject.putOpt("rawUserInfo", this.f22495t);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }
}
