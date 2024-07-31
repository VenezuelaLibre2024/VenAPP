package hf;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j extends f {

    /* renamed from: m, reason: collision with root package name */
    private final JSONObject f16756m;

    /* renamed from: n, reason: collision with root package name */
    private final String f16757n;

    public j(gf.h hVar, zb.g gVar, JSONObject jSONObject, String str) {
        super(hVar, gVar);
        this.f16756m = jSONObject;
        this.f16757n = str;
        if (TextUtils.isEmpty(str)) {
            this.f16738a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "start");
        super.G("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // hf.e
    protected String e() {
        return "POST";
    }

    @Override // hf.e
    protected JSONObject g() {
        return this.f16756m;
    }

    @Override // hf.e
    protected Map<String, String> l() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", j());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // hf.e
    public Uri u() {
        String authority = s().a().getAuthority();
        Uri.Builder buildUpon = s().b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
