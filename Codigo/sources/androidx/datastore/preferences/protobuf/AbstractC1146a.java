package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1146a;
import androidx.datastore.preferences.protobuf.AbstractC1146a.a;
import androidx.datastore.preferences.protobuf.AbstractC1167h;
import androidx.datastore.preferences.protobuf.InterfaceC1198r0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a */
/* loaded from: classes.dex */
public abstract class AbstractC1146a<MessageType extends AbstractC1146a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC1198r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends AbstractC1146a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC1198r0.a {
        /* renamed from: i */
        protected static <T> void m5637i(Iterable<T> iterable, List<? super T> list) {
            C1147a0.m5643a(iterable);
            if (!(iterable instanceof InterfaceC1165g0)) {
                if (iterable instanceof InterfaceC1148a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m5638j(iterable, list);
                    return;
                }
            }
            List<?> mo5784e = ((InterfaceC1165g0) iterable).mo5784e();
            InterfaceC1165g0 interfaceC1165g0 = (InterfaceC1165g0) list;
            int size = list.size();
            for (Object obj : mo5784e) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1165g0.size() - size) + " is null.";
                    for (int size2 = interfaceC1165g0.size() - 1; size2 >= size; size2--) {
                        interfaceC1165g0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1167h) {
                    interfaceC1165g0.mo5782J0((AbstractC1167h) obj);
                } else {
                    interfaceC1165g0.add((String) obj);
                }
            }
        }

        /* renamed from: j */
        private static <T> void m5638j(Iterable<T> iterable, List<? super T> list) {
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
        /* renamed from: m */
        public static C1184m1 m5639m(InterfaceC1198r0 interfaceC1198r0) {
            return new C1184m1(interfaceC1198r0);
        }

        /* renamed from: k */
        protected abstract BuilderType mo5640k(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType mo5642y(InterfaceC1198r0 interfaceC1198r0) {
            if (mo6378e().getClass().isInstance(interfaceC1198r0)) {
                return (BuilderType) mo5640k((AbstractC1146a) interfaceC1198r0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public static <T> void m5629i(Iterable<T> iterable, List<? super T> list) {
        a.m5637i(iterable, list);
    }

    /* renamed from: l */
    private String m5630l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0
    /* renamed from: b */
    public AbstractC1167h mo5631b() {
        try {
            AbstractC1167h.h m5809r = AbstractC1167h.m5809r(mo6309c());
            mo6312h(m5809r.m5831b());
            return m5809r.m5830a();
        } catch (IOException e10) {
            throw new RuntimeException(m5630l("ByteString"), e10);
        }
    }

    /* renamed from: j */
    int mo5632j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m5633k(InterfaceC1166g1 interfaceC1166g1) {
        int mo5632j = mo5632j();
        if (mo5632j != -1) {
            return mo5632j;
        }
        int mo5795d = interfaceC1166g1.mo5795d(this);
        mo5635n(mo5795d);
        return mo5795d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C1184m1 m5634m() {
        return new C1184m1(this);
    }

    /* renamed from: n */
    void mo5635n(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: o */
    public void m5636o(OutputStream outputStream) {
        AbstractC1176k m6050f0 = AbstractC1176k.m6050f0(outputStream, AbstractC1176k.m6026I(mo6309c()));
        mo6312h(m6050f0);
        m6050f0.mo6101c0();
    }
}
