package hf;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends e {

    /* renamed from: m, reason: collision with root package name */
    private final Integer f16734m;

    /* renamed from: n, reason: collision with root package name */
    private final String f16735n;

    public d(gf.h hVar, zb.g gVar, Integer num, String str) {
        super(hVar, gVar);
        this.f16734m = num;
        this.f16735n = str;
    }

    @Override // hf.e
    protected String e() {
        return "GET";
    }

    @Override // hf.e
    protected Map<String, String> l() {
        HashMap hashMap = new HashMap();
        String j10 = j();
        if (!j10.isEmpty()) {
            hashMap.put("prefix", j10 + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f16734m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f16735n)) {
            hashMap.put("pageToken", this.f16735n);
        }
        return hashMap;
    }

    @Override // hf.e
    public Uri u() {
        return Uri.parse(s().b() + "/b/" + s().a().getAuthority() + "/o");
    }
}
