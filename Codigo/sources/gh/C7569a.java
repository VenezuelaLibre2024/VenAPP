package gh;

import kotlin.jvm.internal.C9322n;
import p204kf.InterfaceC9260c;

/* renamed from: gh.a */
/* loaded from: classes2.dex */
public final class C7569a {

    /* renamed from: a */
    @InterfaceC9260c("name")
    private final String f17898a;

    public C7569a(String name) {
        C9322n.m27781e(name, "name");
        this.f17898a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7569a) && C9322n.m27777a(this.f17898a, ((C7569a) obj).f17898a);
    }

    public int hashCode() {
        return this.f17898a.hashCode();
    }

    public String toString() {
        return "App(name=" + this.f17898a + ')';
    }
}
