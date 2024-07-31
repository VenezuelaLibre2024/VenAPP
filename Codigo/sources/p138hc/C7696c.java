package p138hc;

import com.google.android.gms.common.internal.C5276s;
import ec.AbstractC7173c;
import ec.AbstractC7174d;
import p485zb.C12873m;

/* renamed from: hc.c */
/* loaded from: classes.dex */
public final class C7696c extends AbstractC7174d {

    /* renamed from: a */
    private final String f18306a;

    /* renamed from: b */
    private final C12873m f18307b;

    private C7696c(String str, C12873m c12873m) {
        C5276s.m13320f(str);
        this.f18306a = str;
        this.f18307b = c12873m;
    }

    /* renamed from: c */
    public static C7696c m23439c(AbstractC7173c abstractC7173c) {
        C5276s.m13324j(abstractC7173c);
        return new C7696c(abstractC7173c.mo21368b(), null);
    }

    /* renamed from: d */
    public static C7696c m23440d(C12873m c12873m) {
        return new C7696c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (C12873m) C5276s.m13324j(c12873m));
    }

    @Override // ec.AbstractC7174d
    /* renamed from: a */
    public Exception mo21369a() {
        return this.f18307b;
    }

    @Override // ec.AbstractC7174d
    /* renamed from: b */
    public String mo21370b() {
        return this.f18306a;
    }
}
