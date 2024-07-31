package vg;

import java.util.Objects;
import ug.C11555b;
import ug.C11556c;

/* renamed from: vg.b */
/* loaded from: classes2.dex */
final class C11891b {

    /* renamed from: a */
    private final C11555b f31441a;

    /* renamed from: b */
    private final C11555b f31442b;

    /* renamed from: c */
    private final C11556c f31443c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11891b(C11555b c11555b, C11555b c11555b2, C11556c c11556c) {
        this.f31441a = c11555b;
        this.f31442b = c11555b2;
        this.f31443c = c11556c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C11556c m38021a() {
        return this.f31443c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11555b m38022b() {
        return this.f31441a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C11555b m38023c() {
        return this.f31442b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m38024d() {
        return this.f31442b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11891b)) {
            return false;
        }
        C11891b c11891b = (C11891b) obj;
        return Objects.equals(this.f31441a, c11891b.f31441a) && Objects.equals(this.f31442b, c11891b.f31442b) && Objects.equals(this.f31443c, c11891b.f31443c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f31441a) ^ Objects.hashCode(this.f31442b)) ^ Objects.hashCode(this.f31443c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        sb2.append(this.f31441a);
        sb2.append(" , ");
        sb2.append(this.f31442b);
        sb2.append(" : ");
        C11556c c11556c = this.f31443c;
        sb2.append(c11556c == null ? "null" : Integer.valueOf(c11556c.m36221c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
