package p141hf;

import gf.C7566h;
import java.util.Collections;
import java.util.Map;
import p485zb.C12867g;

/* renamed from: hf.c */
/* loaded from: classes2.dex */
public class C7720c extends AbstractC7722e {
    public C7720c(C7566h c7566h, C12867g c12867g, long j10) {
        super(c7566h, c12867g);
        if (j10 != 0) {
            super.m23553G("Range", "bytes=" + j10 + "-");
        }
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "GET";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: l */
    protected Map<String, String> mo23539l() {
        return Collections.singletonMap("alt", "media");
    }
}
