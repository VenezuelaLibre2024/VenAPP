package com.google.protobuf;

import com.google.protobuf.AbstractC6562a;
import com.google.protobuf.AbstractC6562a.a;
import com.google.protobuf.AbstractC6580g;
import com.google.protobuf.InterfaceC6614r0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6562a<MessageType extends AbstractC6562a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC6614r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends AbstractC6562a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC6614r0.a {
        /* renamed from: r */
        protected static <T> void m18380r(Iterable<T> iterable, List<? super T> list) {
            C6633z.m19347a(iterable);
            if (!(iterable instanceof InterfaceC6581g0)) {
                if (iterable instanceof InterfaceC6564a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m18381s(iterable, list);
                    return;
                }
            }
            List<?> mo18458e = ((InterfaceC6581g0) iterable).mo18458e();
            InterfaceC6581g0 interfaceC6581g0 = (InterfaceC6581g0) list;
            int size = list.size();
            for (Object obj : mo18458e) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC6581g0.size() - size) + " is null.";
                    for (int size2 = interfaceC6581g0.size() - 1; size2 >= size; size2--) {
                        interfaceC6581g0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC6580g) {
                    interfaceC6581g0.mo18456B((AbstractC6580g) obj);
                } else {
                    interfaceC6581g0.add((String) obj);
                }
            }
        }

        /* renamed from: s */
        private static <T> void m18381s(Iterable<T> iterable, List<? super T> list) {
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
        /* renamed from: v */
        public static C6600m1 m18382v(InterfaceC6614r0 interfaceC6614r0) {
            return new C6600m1(interfaceC6614r0);
        }

        /* renamed from: t */
        protected abstract BuilderType mo18384t(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.InterfaceC6614r0.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType mo18383a0(InterfaceC6614r0 interfaceC6614r0) {
            if (mo19105e().getClass().isInstance(interfaceC6614r0)) {
                return (BuilderType) mo18384t((AbstractC6562a) interfaceC6614r0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static <T> void m18372n(Iterable<T> iterable, List<? super T> list) {
        a.m18380r(iterable, list);
    }

    /* renamed from: s */
    private String m18373s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: b */
    public AbstractC6580g mo18374b() {
        try {
            AbstractC6580g.h m18516r = AbstractC6580g.m18516r(mo19033c());
            mo19036l(m18516r.m18538b());
            return m18516r.m18537a();
        } catch (IOException e10) {
            throw new RuntimeException(m18373s("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: h */
    public byte[] mo18375h() {
        try {
            byte[] bArr = new byte[mo19033c()];
            AbstractC6589j m18737f0 = AbstractC6589j.m18737f0(bArr);
            mo19036l(m18737f0);
            m18737f0.m18786c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(m18373s("byte array"), e10);
        }
    }

    /* renamed from: o */
    int mo18376o() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo18377r(InterfaceC6582g1 interfaceC6582g1) {
        int mo18376o = mo18376o();
        if (mo18376o != -1) {
            return mo18376o;
        }
        int mo18543d = interfaceC6582g1.mo18543d(this);
        mo18379u(mo18543d);
        return mo18543d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C6600m1 m18378t() {
        return new C6600m1(this);
    }

    /* renamed from: u */
    void mo18379u(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    public void writeTo(OutputStream outputStream) {
        AbstractC6589j m18735e0 = AbstractC6589j.m18735e0(outputStream, AbstractC6589j.m18713I(mo19033c()));
        mo19036l(m18735e0);
        m18735e0.mo18785b0();
    }
}
