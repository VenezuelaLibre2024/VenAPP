package p141hf;

import android.net.Uri;
import android.text.TextUtils;
import gf.C7566h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p485zb.C12867g;

/* renamed from: hf.j */
/* loaded from: classes2.dex */
public class C7727j extends AbstractC7723f {

    /* renamed from: m */
    private final JSONObject f18406m;

    /* renamed from: n */
    private final String f18407n;

    public C7727j(C7566h c7566h, C12867g c12867g, JSONObject jSONObject, String str) {
        super(c7566h, c12867g);
        this.f18406m = jSONObject;
        this.f18407n = str;
        if (TextUtils.isEmpty(str)) {
            this.f18388a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.m23553G("X-Goog-Upload-Protocol", "resumable");
        super.m23553G("X-Goog-Upload-Command", "start");
        super.m23553G("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "POST";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: g */
    protected JSONObject mo23556g() {
        return this.f18406m;
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: l */
    protected Map<String, String> mo23539l() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", m23559j());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: u */
    public Uri mo23540u() {
        String authority = m23566s().m22966a().getAuthority();
        Uri.Builder buildUpon = m23566s().m22967b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
