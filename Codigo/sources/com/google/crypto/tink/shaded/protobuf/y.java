package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.c();

    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0171a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f11561a;

        /* renamed from: b */
        protected MessageType f11562b;

        public a(MessageType messagetype) {
            this.f11561a = messagetype;
            if (messagetype.F()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f11562b = z();
        }

        private static <MessageType> void x(MessageType messagetype, MessageType messagetype2) {
            c1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType z() {
            return (MessageType) this.f11561a.L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0
        public final boolean isInitialized() {
            return y.E(this.f11562b, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* renamed from: m */
        public final MessageType build() {
            MessageType f10 = f();
            if (f10.isInitialized()) {
                return f10;
            }
            throw a.AbstractC0171a.l(f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* renamed from: p */
        public MessageType f() {
            if (!this.f11562b.F()) {
                return this.f11562b;
            }
            this.f11562b.G();
            return this.f11562b;
        }

        @Override // 
        /* renamed from: q */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.f11562b = f();
            return buildertype;
        }

        public final void r() {
            if (this.f11562b.F()) {
                return;
            }
            s();
        }

        protected void s() {
            MessageType z10 = z();
            x(z10, this.f11562b);
            this.f11562b = z10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0
        /* renamed from: t */
        public MessageType e() {
            return this.f11561a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0171a
        /* renamed from: u */
        public BuilderType j(MessageType messagetype) {
            return w(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* renamed from: v */
        public BuilderType H0(i iVar, p pVar) {
            r();
            try {
                c1.a().d(this.f11562b).i(this.f11562b, j.Q(iVar), pVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType w(MessageType messagetype) {
            if (e().equals(messagetype)) {
                return this;
            }
            r();
            x(this.f11562b, messagetype);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    protected static class b<T extends y<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {

        /* renamed from: b */
        private final T f11563b;

        public b(T t10) {
            this.f11563b = t10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.z0
        /* renamed from: g */
        public T a(i iVar, p pVar) {
            return (T) y.Q(this.f11563b, iVar, pVar);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements s0 {
        protected u<d> extensions = u.h();

        public u<d> V() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a a() {
            return super.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ r0 e() {
            return super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements u.b<d> {

        /* renamed from: a */
        final a0.d<?> f11564a;

        /* renamed from: b */
        final int f11565b;

        /* renamed from: c */
        final t1.b f11566c;

        /* renamed from: d */
        final boolean f11567d;

        /* renamed from: e */
        final boolean f11568e;

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public int a() {
            return this.f11565b;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            return this.f11565b - dVar.f11565b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean c() {
            return this.f11567d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public t1.b d() {
            return this.f11566c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public t1.c e() {
            return this.f11566c.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean f() {
            return this.f11568e;
        }

        public a0.d<?> h() {
            return this.f11564a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public r0.a j(r0.a aVar, r0 r0Var) {
            return ((a) aVar).w((y) r0Var);
        }
    }

    /* loaded from: classes2.dex */
    public static class e<ContainingType extends r0, Type> extends n<ContainingType, Type> {

        /* renamed from: a */
        final r0 f11569a;

        /* renamed from: b */
        final d f11570b;

        public t1.b a() {
            return this.f11570b.d();
        }

        public r0 b() {
            return this.f11569a;
        }

        public int c() {
            return this.f11570b.a();
        }

        public boolean d() {
            return this.f11570b.f11567d;
        }
    }

    /* loaded from: classes2.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static Object D(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends y<T, ?>> boolean E(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.v(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = c1.a().d(t10).c(t10);
        if (z10) {
            t10.w(f.SET_MEMOIZED_IS_INITIALIZED, c10 ? t10 : null);
        }
        return c10;
    }

    public static <E> a0.i<E> I(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object K(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    public static <T extends y<T, ?>> T M(T t10, h hVar, p pVar) {
        return (T) p(P(t10, hVar, pVar));
    }

    public static <T extends y<T, ?>> T N(T t10, InputStream inputStream, p pVar) {
        return (T) p(Q(t10, i.f(inputStream), pVar));
    }

    public static <T extends y<T, ?>> T O(T t10, byte[] bArr, p pVar) {
        return (T) p(R(t10, bArr, 0, bArr.length, pVar));
    }

    private static <T extends y<T, ?>> T P(T t10, h hVar, p pVar) {
        i s10 = hVar.s();
        T t11 = (T) Q(t10, s10, pVar);
        try {
            s10.a(0);
            return t11;
        } catch (b0 e10) {
            throw e10.k(t11);
        }
    }

    static <T extends y<T, ?>> T Q(T t10, i iVar, p pVar) {
        T t11 = (T) t10.L();
        try {
            g1 d10 = c1.a().d(t11);
            d10.i(t11, j.Q(iVar), pVar);
            d10.b(t11);
            return t11;
        } catch (b0 e10) {
            e = e10;
            if (e.a()) {
                e = new b0(e);
            }
            throw e.k(t11);
        } catch (m1 e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof b0) {
                throw ((b0) e12.getCause());
            }
            throw new b0(e12).k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof b0) {
                throw ((b0) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends y<T, ?>> T R(T t10, byte[] bArr, int i10, int i11, p pVar) {
        T t11 = (T) t10.L();
        try {
            g1 d10 = c1.a().d(t11);
            d10.h(t11, bArr, i10, i10 + i11, new e.b(pVar));
            d10.b(t11);
            return t11;
        } catch (b0 e10) {
            e = e10;
            if (e.a()) {
                e = new b0(e);
            }
            throw e.k(t11);
        } catch (m1 e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof b0) {
                throw ((b0) e12.getCause());
            }
            throw new b0(e12).k(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw b0.m().k(t11);
        }
    }

    public static <T extends y<?, ?>> void S(Class<T> cls, T t10) {
        t10.H();
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends y<T, ?>> T p(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.m().a().k(t10);
    }

    private int t(g1<?> g1Var) {
        return g1Var == null ? c1.a().d(this).d(this) : g1Var.d(this);
    }

    public static <E> a0.i<E> y() {
        return d1.f();
    }

    public static <T extends y<?, ?>> T z(Class<T> cls) {
        y<?, ?> yVar = defaultInstanceMap.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (yVar == null) {
            yVar = (T) ((y) r1.k(cls)).e();
            if (yVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, yVar);
        }
        return (T) yVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: A */
    public final MessageType e() {
        return (MessageType) v(f.GET_DEFAULT_INSTANCE);
    }

    int B() {
        return this.memoizedHashCode;
    }

    boolean C() {
        return B() == 0;
    }

    public boolean F() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void G() {
        c1.a().d(this).b(this);
        H();
    }

    public void H() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    /* renamed from: J */
    public final BuilderType d() {
        return (BuilderType) v(f.NEW_BUILDER);
    }

    public MessageType L() {
        return (MessageType) v(f.NEW_MUTABLE_INSTANCE);
    }

    void T(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    /* renamed from: U */
    public final BuilderType a() {
        return (BuilderType) ((a) v(f.NEW_BUILDER)).w(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public int c() {
        return k(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return c1.a().d(this).g(this, (y) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final z0<MessageType> g() {
        return (z0) v(f.GET_PARSER);
    }

    public int hashCode() {
        if (F()) {
            return s();
        }
        if (C()) {
            T(s());
        }
        return B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void i(k kVar) {
        c1.a().d(this).j(this, l.P(kVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final boolean isInitialized() {
        return E(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int j() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.a
    public int k(g1 g1Var) {
        if (!F()) {
            if (j() != Integer.MAX_VALUE) {
                return j();
            }
            int t10 = t(g1Var);
            n(t10);
            return t10;
        }
        int t11 = t(g1Var);
        if (t11 >= 0) {
            return t11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + t11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void n(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public Object o() {
        return v(f.BUILD_MESSAGE_INFO);
    }

    public void q() {
        this.memoizedHashCode = 0;
    }

    public void r() {
        n(a.e.API_PRIORITY_OTHER);
    }

    int s() {
        return c1.a().d(this).f(this);
    }

    public String toString() {
        return t0.f(this, super.toString());
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType u() {
        return (BuilderType) v(f.NEW_BUILDER);
    }

    protected Object v(f fVar) {
        return x(fVar, null, null);
    }

    protected Object w(f fVar, Object obj) {
        return x(fVar, obj, null);
    }

    protected abstract Object x(f fVar, Object obj, Object obj2);
}
