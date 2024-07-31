package eb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class q {

    /* loaded from: classes2.dex */
    private static class b<T> implements p<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends p<? super T>> f14611a;

        private b(List<? extends p<? super T>> list) {
            this.f14611a = list;
        }

        @Override // eb.p
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f14611a.size(); i10++) {
                if (!this.f14611a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f14611a.equals(((b) obj).f14611a);
            }
            return false;
        }

        public int hashCode() {
            return this.f14611a.hashCode() + 306654252;
        }

        public String toString() {
            return q.d("and", this.f14611a);
        }
    }

    public static <T> p<T> b(p<? super T> pVar, p<? super T> pVar2) {
        return new b(c((p) o.o(pVar), (p) o.o(pVar2)));
    }

    private static <T> List<p<? super T>> c(p<? super T> pVar, p<? super T> pVar2) {
        return Arrays.asList(pVar, pVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
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
