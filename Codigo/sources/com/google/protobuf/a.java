package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0188a;
import com.google.protobuf.g;
import com.google.protobuf.r0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0188a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0188a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0188a<MessageType, BuilderType>> implements r0.a {
        protected static <T> void r(Iterable<T> iterable, List<? super T> list) {
            z.a(iterable);
            if (!(iterable instanceof g0)) {
                if (iterable instanceof a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    s(iterable, list);
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
                if (obj instanceof g) {
                    g0Var.B((g) obj);
                } else {
                    g0Var.add((String) obj);
                }
            }
        }

        private static <T> void s(Iterable<T> iterable, List<? super T> list) {
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

        public static m1 v(r0 r0Var) {
            return new m1(r0Var);
        }

        protected abstract BuilderType t(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.r0.a
        /* renamed from: u */
        public BuilderType a0(r0 r0Var) {
            if (e().getClass().isInstance(r0Var)) {
                return (BuilderType) t((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static <T> void n(Iterable<T> iterable, List<? super T> list) {
        AbstractC0188a.r(iterable, list);
    }

    private String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.r0
    public g b() {
        try {
            g.h r10 = g.r(c());
            l(r10.b());
            return r10.a();
        } catch (IOException e10) {
            throw new RuntimeException(s("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.r0
    public byte[] h() {
        try {
            byte[] bArr = new byte[c()];
            j f02 = j.f0(bArr);
            l(f02);
            f02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(s("byte array"), e10);
        }
    }

    int o() {
        throw new UnsupportedOperationException();
    }

    public int r(g1 g1Var) {
        int o10 = o();
        if (o10 != -1) {
            return o10;
        }
        int d10 = g1Var.d(this);
        u(d10);
        return d10;
    }

    public m1 t() {
        return new m1(this);
    }

    void u(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.r0
    public void writeTo(OutputStream outputStream) {
        j e02 = j.e0(outputStream, j.I(c()));
        l(e02);
        e02.b0();
    }
}
