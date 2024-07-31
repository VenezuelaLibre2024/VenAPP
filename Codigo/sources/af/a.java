package af;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.o;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ze.h;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    o f414a;

    a(o oVar) {
        this.f414a = oVar;
    }

    public static a a(o oVar) {
        return new a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cf.e b(g gVar) {
        JSONArray j10 = gVar.j();
        long k10 = gVar.k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < j10.length(); i10++) {
            try {
                JSONObject jSONObject = j10.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(cf.d.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(this.f414a.g(optString)).e(k10).a());
            } catch (JSONException e10) {
                throw new h("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return cf.e.a(hashSet);
    }
}
