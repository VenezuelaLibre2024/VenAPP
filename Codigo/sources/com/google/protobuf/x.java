package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.a;
import com.google.protobuf.r0;
import com.google.protobuf.t;
import com.google.protobuf.t1;
import com.google.protobuf.x;
import com.google.protobuf.x.a;
import com.google.protobuf.z;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.c();

    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0188a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f13383a;

        /* renamed from: b */
        protected MessageType f13384b;

        public a(MessageType messagetype) {
            this.f13383a = messagetype;
            if (messagetype.N()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f13384b = H();
        }

        private static <MessageType> void G(MessageType messagetype, MessageType messagetype2) {
            c1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType H() {
            return (MessageType) this.f13383a.U();
        }

        public final void A() {
            if (this.f13384b.N()) {
                return;
            }
            B();
        }

        protected void B() {
            MessageType H = H();
            G(H, this.f13384b);
            this.f13384b = H;
        }

        @Override // com.google.protobuf.s0
        /* renamed from: C */
        public MessageType e() {
            return this.f13383a;
        }

        @Override // com.google.protobuf.a.AbstractC0188a
        /* renamed from: D */
        public BuilderType t(MessageType messagetype) {
            return F(messagetype);
        }

        @Override // com.google.protobuf.r0.a
        /* renamed from: E */
        public BuilderType c0(h hVar, o oVar) {
            A();
            try {
                c1.a().d(this.f13384b).i(this.f13384b, i.Q(hVar), oVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType F(MessageType messagetype) {
            if (e().equals(messagetype)) {
                return this;
            }
            A();
            G(this.f13384b, messagetype);
            return this;
        }

        @Override // com.google.protobuf.s0
        public final boolean isInitialized() {
            return x.M(this.f13384b, false);
        }

        @Override // com.google.protobuf.r0.a
        /* renamed from: w */
        public final MessageType build() {
            MessageType f10 = f();
            if (f10.isInitialized()) {
                return f10;
            }
            throw a.AbstractC0188a.v(f10);
        }

        @Override // com.google.protobuf.r0.a
        /* renamed from: x */
        public MessageType f() {
            if (!this.f13384b.N()) {
                return this.f13384b;
            }
            this.f13384b.O();
            return this.f13384b;
        }

        /* renamed from: z */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.f13384b = f();
            return buildertype;
        }
    }

    /* loaded from: classes2.dex */
    protected static class b<T extends x<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: b */
        private final T f13385b;

        public b(T t10) {
            this.f13385b = t10;
        }

        @Override // com.google.protobuf.z0
        /* renamed from: m */
        public T d(h hVar, o oVar) {
            return (T) x.V(this.f13385b, hVar, oVar);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements s0 {
        protected t<d> extensions = t.h();

        public t<d> Z() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.x, com.google.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a a() {
            return super.a();
        }

        @Override // com.google.protobuf.x, com.google.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a d() {
            return super.d();
        }

        @Override // com.google.protobuf.x, com.google.protobuf.s0
        public /* bridge */ /* synthetic */ r0 e() {
            return super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements t.b<d> {

        /* renamed from: a */
        final z.d<?> f13386a;

        /* renamed from: b */
        final int f13387b;

        /* renamed from: c */
        final t1.b f13388c;

        /* renamed from: d */
        final boolean f13389d;

        /* renamed from: e */
        final boolean f13390e;

        @Override // com.google.protobuf.t.b
        public int a() {
            return this.f13387b;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            return this.f13387b - dVar.f13387b;
        }

        @Override // com.google.protobuf.t.b
        public boolean c() {
            return this.f13389d;
        }

        @Override // com.google.protobuf.t.b
        public t1.b d() {
            return this.f13388c;
        }

        @Override // com.google.protobuf.t.b
        public t1.c e() {
            return this.f13388c.h();
        }

        @Override // com.google.protobuf.t.b
        public boolean f() {
            return this.f13390e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.t.b
        public r0.a g(r0.a aVar, r0 r0Var) {
            return ((a) aVar).F((x) r0Var);
        }

        public z.d<?> h() {
            return this.f13386a;
        }
    }

    /* loaded from: classes2.dex */
    public static class e<ContainingType extends r0, Type> extends m<ContainingType, Type> {

        /* renamed from: a */
        final r0 f13391a;

        /* renamed from: b */
        final d f13392b;

        public t1.b a() {
            return this.f13392b.d();
        }

        public r0 b() {
            return this.f13391a;
        }

        public int c() {
            return this.f13392b.a();
        }

        public boolean d() {
            return this.f13392b.f13389d;
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

    public static z.g F() {
        return y.k();
    }

    public static <E> z.i<E> G() {
        return d1.f();
    }

    public static <T extends x<?, ?>> T H(Class<T> cls) {
        x<?, ?> xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (xVar == null) {
            xVar = (T) ((x) r1.k(cls)).e();
            if (xVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, xVar);
        }
        return (T) xVar;
    }

    public static Object L(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends x<T, ?>> boolean M(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.C(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = c1.a().d(t10).c(t10);
        if (z10) {
            t10.D(f.SET_MEMOIZED_IS_INITIALIZED, c10 ? t10 : null);
        }
        return c10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.z$g] */
    public static z.g Q(z.g gVar) {
        int size = gVar.size();
        return gVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <E> z.i<E> R(z.i<E> iVar) {
        int size = iVar.size();
        return iVar.a2(size == 0 ? 10 : size * 2);
    }

    public static Object T(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    static <T extends x<T, ?>> T V(T t10, h hVar, o oVar) {
        T t11 = (T) t10.U();
        try {
            g1 d10 = c1.a().d(t11);
            d10.i(t11, i.Q(hVar), oVar);
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

    public static <T extends x<?, ?>> void W(Class<T> cls, T t10) {
        t10.P();
        defaultInstanceMap.put(cls, t10);
    }

    private int z(g1<?> g1Var) {
        return g1Var == null ? c1.a().d(this).d(this) : g1Var.d(this);
    }

    public final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType A() {
        return (BuilderType) C(f.NEW_BUILDER);
    }

    public final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType B(MessageType messagetype) {
        return (BuilderType) A().F(messagetype);
    }

    protected Object C(f fVar) {
        return E(fVar, null, null);
    }

    protected Object D(f fVar, Object obj) {
        return E(fVar, obj, null);
    }

    protected abstract Object E(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.s0
    /* renamed from: I */
    public final MessageType e() {
        return (MessageType) C(f.GET_DEFAULT_INSTANCE);
    }

    int J() {
        return this.memoizedHashCode;
    }

    boolean K() {
        return J() == 0;
    }

    public boolean N() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void O() {
        c1.a().d(this).b(this);
        P();
    }

    public void P() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.r0
    /* renamed from: S */
    public final BuilderType d() {
        return (BuilderType) C(f.NEW_BUILDER);
    }

    public MessageType U() {
        return (MessageType) C(f.NEW_MUTABLE_INSTANCE);
    }

    void X(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.r0
    /* renamed from: Y */
    public final BuilderType a() {
        return (BuilderType) ((a) C(f.NEW_BUILDER)).F(this);
    }

    @Override // com.google.protobuf.r0
    public int c() {
        return r(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return c1.a().d(this).g(this, (x) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.r0
    public final z0<MessageType> g() {
        return (z0) C(f.GET_PARSER);
    }

    public int hashCode() {
        if (N()) {
            return y();
        }
        if (K()) {
            X(y());
        }
        return J();
    }

    @Override // com.google.protobuf.s0
    public final boolean isInitialized() {
        return M(this, true);
    }

    @Override // com.google.protobuf.r0
    public void l(j jVar) {
        c1.a().d(this).h(this, k.P(jVar));
    }

    @Override // com.google.protobuf.a
    int o() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.a
    public int r(g1 g1Var) {
        if (!N()) {
            if (o() != Integer.MAX_VALUE) {
                return o();
            }
            int z10 = z(g1Var);
            u(z10);
            return z10;
        }
        int z11 = z(g1Var);
        if (z11 >= 0) {
            return z11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + z11);
    }

    public String toString() {
        return t0.f(this, super.toString());
    }

    @Override // com.google.protobuf.a
    void u(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public Object v() {
        return C(f.BUILD_MESSAGE_INFO);
    }

    public void w() {
        this.memoizedHashCode = 0;
    }

    public void x() {
        u(a.e.API_PRIORITY_OTHER);
    }

    int y() {
        return c1.a().d(this).f(this);
    }
}
