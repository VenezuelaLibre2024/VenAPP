package af;

import android.util.Log;
import cf.AbstractC1961d;
import cf.AbstractC1962e;
import com.google.firebase.remoteconfig.internal.C6351g;
import com.google.firebase.remoteconfig.internal.C6359o;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p488ze.C13011h;

/* renamed from: af.a */
/* loaded from: classes2.dex */
public class C0108a {

    /* renamed from: a */
    C6359o f479a;

    C0108a(C6359o c6359o) {
        this.f479a = c6359o;
    }

    /* renamed from: a */
    public static C0108a m520a(C6359o c6359o) {
        return new C0108a(c6359o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC1962e m521b(C6351g c6351g) {
        JSONArray m17635j = c6351g.m17635j();
        long m17636k = c6351g.m17636k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < m17635j.length(); i10++) {
            try {
                JSONObject jSONObject = m17635j.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(AbstractC1961d.m10212a().mo10208d(string).mo10210f(jSONObject.getString("variantId")).mo10206b(optString).mo10207c(this.f479a.m17689g(optString)).mo10209e(m17636k).mo10205a());
            } catch (JSONException e10) {
                throw new C13011h("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return AbstractC1962e.m10213a(hashSet);
    }
}
