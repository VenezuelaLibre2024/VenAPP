package gh;

import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @kf.c("to")
    private final List<String> f16262a;

    /* renamed from: b, reason: collision with root package name */
    @kf.c("cc")
    private final List<String> f16263b;

    /* renamed from: c, reason: collision with root package name */
    @kf.c("bcc")
    private final List<String> f16264c;

    /* renamed from: d, reason: collision with root package name */
    @kf.c("subject")
    private final String f16265d;

    /* renamed from: e, reason: collision with root package name */
    @kf.c("body")
    private final String f16266e;

    public final List<String> a() {
        return this.f16264c;
    }

    public final String b() {
        return this.f16266e;
    }

    public final List<String> c() {
        return this.f16263b;
    }

    public final String d() {
        return this.f16265d;
    }

    public final List<String> e() {
        return this.f16262a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f16262a, bVar.f16262a) && n.a(this.f16263b, bVar.f16263b) && n.a(this.f16264c, bVar.f16264c) && n.a(this.f16265d, bVar.f16265d) && n.a(this.f16266e, bVar.f16266e);
    }

    public int hashCode() {
        return (((((((this.f16262a.hashCode() * 31) + this.f16263b.hashCode()) * 31) + this.f16264c.hashCode()) * 31) + this.f16265d.hashCode()) * 31) + this.f16266e.hashCode();
    }

    public String toString() {
        return "EmailContent(to=" + this.f16262a + ", cc=" + this.f16263b + ", bcc=" + this.f16264c + ", subject=" + this.f16265d + ", body=" + this.f16266e + ')';
    }
}
