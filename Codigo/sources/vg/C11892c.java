package vg;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vg.c */
/* loaded from: classes2.dex */
final class C11892c {

    /* renamed from: a */
    private final List<C11891b> f31444a;

    /* renamed from: b */
    private final int f31445b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11892c(List<C11891b> list, int i10) {
        this.f31444a = new ArrayList(list);
        this.f31445b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C11891b> m38025a() {
        return this.f31444a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m38026b() {
        return this.f31445b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m38027c(List<C11891b> list) {
        return this.f31444a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11892c) {
            return this.f31444a.equals(((C11892c) obj).f31444a);
        }
        return false;
    }

    public int hashCode() {
        return this.f31444a.hashCode();
    }

    public String toString() {
        return "{ " + this.f31444a + " }";
    }
}
