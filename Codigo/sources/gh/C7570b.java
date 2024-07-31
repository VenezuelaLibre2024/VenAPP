package gh;

import java.util.List;
import kotlin.jvm.internal.C9322n;
import p204kf.InterfaceC9260c;

/* renamed from: gh.b */
/* loaded from: classes2.dex */
public final class C7570b {

    /* renamed from: a */
    @InterfaceC9260c("to")
    private final List<String> f17899a;

    /* renamed from: b */
    @InterfaceC9260c("cc")
    private final List<String> f17900b;

    /* renamed from: c */
    @InterfaceC9260c("bcc")
    private final List<String> f17901c;

    /* renamed from: d */
    @InterfaceC9260c("subject")
    private final String f17902d;

    /* renamed from: e */
    @InterfaceC9260c("body")
    private final String f17903e;

    /* renamed from: a */
    public final List<String> m22995a() {
        return this.f17901c;
    }

    /* renamed from: b */
    public final String m22996b() {
        return this.f17903e;
    }

    /* renamed from: c */
    public final List<String> m22997c() {
        return this.f17900b;
    }

    /* renamed from: d */
    public final String m22998d() {
        return this.f17902d;
    }

    /* renamed from: e */
    public final List<String> m22999e() {
        return this.f17899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7570b)) {
            return false;
        }
        C7570b c7570b = (C7570b) obj;
        return C9322n.m27777a(this.f17899a, c7570b.f17899a) && C9322n.m27777a(this.f17900b, c7570b.f17900b) && C9322n.m27777a(this.f17901c, c7570b.f17901c) && C9322n.m27777a(this.f17902d, c7570b.f17902d) && C9322n.m27777a(this.f17903e, c7570b.f17903e);
    }

    public int hashCode() {
        return (((((((this.f17899a.hashCode() * 31) + this.f17900b.hashCode()) * 31) + this.f17901c.hashCode()) * 31) + this.f17902d.hashCode()) * 31) + this.f17903e.hashCode();
    }

    public String toString() {
        return "EmailContent(to=" + this.f17899a + ", cc=" + this.f17900b + ", bcc=" + this.f17901c + ", subject=" + this.f17902d + ", body=" + this.f17903e + ')';
    }
}
