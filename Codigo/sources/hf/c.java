package hf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends e {
    public c(gf.h hVar, zb.g gVar, long j10) {
        super(hVar, gVar);
        if (j10 != 0) {
            super.G("Range", "bytes=" + j10 + "-");
        }
    }

    @Override // hf.e
    protected String e() {
        return "GET";
    }

    @Override // hf.e
    protected Map<String, String> l() {
        return Collections.singletonMap("alt", "media");
    }
}
