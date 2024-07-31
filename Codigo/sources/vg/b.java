package vg;

import java.util.Objects;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ug.b f29007a;

    /* renamed from: b, reason: collision with root package name */
    private final ug.b f29008b;

    /* renamed from: c, reason: collision with root package name */
    private final ug.c f29009c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ug.b bVar, ug.b bVar2, ug.c cVar) {
        this.f29007a = bVar;
        this.f29008b = bVar2;
        this.f29009c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ug.c a() {
        return this.f29009c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ug.b b() {
        return this.f29007a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ug.b c() {
        return this.f29008b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f29008b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f29007a, bVar.f29007a) && Objects.equals(this.f29008b, bVar.f29008b) && Objects.equals(this.f29009c, bVar.f29009c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f29007a) ^ Objects.hashCode(this.f29008b)) ^ Objects.hashCode(this.f29009c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        sb2.append(this.f29007a);
        sb2.append(" , ");
        sb2.append(this.f29008b);
        sb2.append(" : ");
        ug.c cVar = this.f29009c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
