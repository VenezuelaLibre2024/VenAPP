package p082eb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: eb.q */
/* loaded from: classes2.dex */
public final class C7161q {

    /* renamed from: eb.q$b */
    /* loaded from: classes2.dex */
    private static class b<T> implements InterfaceC7160p<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends InterfaceC7160p<? super T>> f16034a;

        private b(List<? extends InterfaceC7160p<? super T>> list) {
            this.f16034a = list;
        }

        @Override // p082eb.InterfaceC7160p
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f16034a.size(); i10++) {
                if (!this.f16034a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f16034a.equals(((b) obj).f16034a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16034a.hashCode() + 306654252;
        }

        public String toString() {
            return C7161q.m21326d("and", this.f16034a);
        }
    }

    /* renamed from: b */
    public static <T> InterfaceC7160p<T> m21324b(InterfaceC7160p<? super T> interfaceC7160p, InterfaceC7160p<? super T> interfaceC7160p2) {
        return new b(m21325c((InterfaceC7160p) C7159o.m21312o(interfaceC7160p), (InterfaceC7160p) C7159o.m21312o(interfaceC7160p2)));
    }

    /* renamed from: c */
    private static <T> List<InterfaceC7160p<? super T>> m21325c(InterfaceC7160p<? super T> interfaceC7160p, InterfaceC7160p<? super T> interfaceC7160p2) {
        return Arrays.asList(interfaceC7160p, interfaceC7160p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m21326d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
