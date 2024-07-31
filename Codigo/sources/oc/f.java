package oc;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f implements com.google.firebase.auth.b0 {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private long f22380a;

    /* renamed from: b, reason: collision with root package name */
    private long f22381b;

    public f(long j10, long j11) {
        this.f22380a = j10;
        this.f22381b = j11;
    }

    public static f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.auth.b0
    public final long I() {
        return this.f22381b;
    }

    @Override // com.google.firebase.auth.b0
    public final long S() {
        return this.f22380a;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f22380a);
            jSONObject.put("creationTimestamp", this.f22381b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 1, S());
        ea.c.z(parcel, 2, I());
        ea.c.b(parcel, a10);
    }
}
