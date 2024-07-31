package vg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<b> f29010a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29011b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<b> list, int i10) {
        this.f29010a = new ArrayList(list);
        this.f29011b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<b> a() {
        return this.f29010a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f29011b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(List<b> list) {
        return this.f29010a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f29010a.equals(((c) obj).f29010a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29010a.hashCode();
    }

    public String toString() {
        return "{ " + this.f29010a + " }";
    }
}
