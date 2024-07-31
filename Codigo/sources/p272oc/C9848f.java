package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.InterfaceC6049b0;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.C7140c;

/* renamed from: oc.f */
/* loaded from: classes.dex */
public final class C9848f implements InterfaceC6049b0 {
    public static final Parcelable.Creator<C9848f> CREATOR = new C9857i();

    /* renamed from: a */
    private long f24313a;

    /* renamed from: b */
    private long f24314b;

    public C9848f(long j10, long j11) {
        this.f24313a = j10;
        this.f24314b = j11;
    }

    /* renamed from: a */
    public static C9848f m29534a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C9848f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.auth.InterfaceC6049b0
    /* renamed from: I */
    public final long mo16467I() {
        return this.f24314b;
    }

    @Override // com.google.firebase.auth.InterfaceC6049b0
    /* renamed from: S */
    public final long mo16468S() {
        return this.f24313a;
    }

    /* renamed from: b */
    public final JSONObject m29535b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f24313a);
            jSONObject.put("creationTimestamp", this.f24314b);
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
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 1, mo16468S());
        C7140c.m21234z(parcel, 2, mo16467I());
        C7140c.m21210b(parcel, m21209a);
    }
}
