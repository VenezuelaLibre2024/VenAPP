package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0057a;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.r0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0057a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0057a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0057a<MessageType, BuilderType>> implements r0.a {
        protected static <T> void i(Iterable<T> iterable, List<? super T> list) {
            a0.a(iterable);
            if (!(iterable instanceof g0)) {
                if (iterable instanceof a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    j(iterable, list);
                    return;
                }
            }
            List<?> e10 = ((g0) iterable).e();
            g0 g0Var = (g0) list;
            int size = list.size();
            for (Object obj : e10) {
                if (obj == null) {
                    String str = "Element at index " + (g0Var.size() - size) + " is null.";
                    for (int size2 = g0Var.size() - 1; size2 >= size; size2--) {
                        g0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof h) {
                    g0Var.J0((h) obj);
                } else {
                    g0Var.add((String) obj);
                }
            }
        }

        private static <T> void j(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static m1 m(r0 r0Var) {
            return new m1(r0Var);
        }

        protected abstract BuilderType k(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType y(r0 r0Var) {
            if (e().getClass().isInstance(r0Var)) {
                return (BuilderType) k((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void i(Iterable<T> iterable, List<? super T> list) {
        AbstractC0057a.i(iterable, list);
    }

    private String l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public h b() {
        try {
            h.C0058h r10 = h.r(c());
            h(r10.b());
            return r10.a();
        } catch (IOException e10) {
            throw new RuntimeException(l("ByteString"), e10);
        }
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k(g1 g1Var) {
        int j10 = j();
        if (j10 != -1) {
            return j10;
        }
        int d10 = g1Var.d(this);
        n(d10);
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1 m() {
        return new m1(this);
    }

    void n(int i10) {
        throw new UnsupportedOperationException();
    }

    public void o(OutputStream outputStream) {
        k f02 = k.f0(outputStream, k.I(c()));
        h(f02);
        f02.c0();
    }
}
