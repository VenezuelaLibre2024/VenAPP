package p141hf;

import android.net.Uri;
import android.text.TextUtils;
import gf.C7566h;
import java.util.HashMap;
import java.util.Map;
import p485zb.C12867g;

/* renamed from: hf.d */
/* loaded from: classes2.dex */
public class C7721d extends AbstractC7722e {

    /* renamed from: m */
    private final Integer f18384m;

    /* renamed from: n */
    private final String f18385n;

    public C7721d(C7566h c7566h, C12867g c12867g, Integer num, String str) {
        super(c7566h, c12867g);
        this.f18384m = num;
        this.f18385n = str;
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "GET";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: l */
    protected Map<String, String> mo23539l() {
        HashMap hashMap = new HashMap();
        String m23559j = m23559j();
        if (!m23559j.isEmpty()) {
            hashMap.put("prefix", m23559j + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f18384m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f18385n)) {
            hashMap.put("pageToken", this.f18385n);
        }
        return hashMap;
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: u */
    public Uri mo23540u() {
        return Uri.parse(m23566s().m22967b() + "/b/" + m23566s().m22966a().getAuthority() + "/o");
    }
}
