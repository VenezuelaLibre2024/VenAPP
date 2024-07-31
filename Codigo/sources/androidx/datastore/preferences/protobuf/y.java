package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected o1 unknownFields = o1.e();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0057a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f4318a;

        /* renamed from: b */
        protected MessageType f4319b;

        /* renamed from: c */
        protected boolean f4320c = false;

        public a(MessageType messagetype) {
            this.f4318a = messagetype;
            this.f4319b = (MessageType) messagetype.s(f.NEW_MUTABLE_INSTANCE);
        }

        private void w(MessageType messagetype, MessageType messagetype2) {
            c1.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* renamed from: p */
        public final MessageType build() {
            MessageType f10 = f();
            if (f10.isInitialized()) {
                return f10;
            }
            throw a.AbstractC0057a.m(f10);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* renamed from: q */
        public MessageType f() {
            if (this.f4320c) {
                return this.f4319b;
            }
            this.f4319b.B();
            this.f4320c = true;
            return this.f4319b;
        }

        /* renamed from: r */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.v(f());
            return buildertype;
        }

        public void s() {
            if (this.f4320c) {
                MessageType messagetype = (MessageType) this.f4319b.s(f.NEW_MUTABLE_INSTANCE);
                w(messagetype, this.f4319b);
                this.f4319b = messagetype;
                this.f4320c = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.s0
        /* renamed from: t */
        public MessageType e() {
            return this.f4318a;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0057a
        /* renamed from: u */
        public BuilderType k(MessageType messagetype) {
            return v(messagetype);
        }

        public BuilderType v(MessageType messagetype) {
            s();
            w(this.f4319b, messagetype);
            return this;
        }
    }

    /* loaded from: classes.dex */
    protected static class b<T extends y<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* renamed from: b */
        private final T f4321b;

        public b(T t10) {
            this.f4321b = t10;
        }

        @Override // androidx.datastore.preferences.protobuf.z0
        /* renamed from: g */
        public T b(i iVar, p pVar) {
            return (T) y.G(this.f4321b, iVar, pVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements s0 {
        protected u<d> extensions = u.h();

        public u<d> J() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a a() {
            return super.a();
        }

        @Override // androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a d() {
            return super.d();
        }

        @Override // androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.s0
        public /* bridge */ /* synthetic */ r0 e() {
            return super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements u.b<d> {

        /* renamed from: a */
        final int f4322a;

        /* renamed from: b */
        final t1.b f4323b;

        /* renamed from: c */
        final boolean f4324c;

        /* renamed from: d */
        final boolean f4325d;

        @Override // androidx.datastore.preferences.protobuf.u.b
        public int a() {
            return this.f4322a;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            return this.f4322a - dVar.f4322a;
        }

        @Override // androidx.datastore.preferences.protobuf.u.b
        public boolean c() {
            return this.f4324c;
        }

        @Override // androidx.datastore.preferences.protobuf.u.b
        public t1.b d() {
            return this.f4323b;
        }

        @Override // androidx.datastore.preferences.protobuf.u.b
        public t1.c e() {
            return this.f4323b.b();
        }

        @Override // androidx.datastore.preferences.protobuf.u.b
        public boolean f() {
            return this.f4325d;
        }

        public a0.d<?> h() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.u.b
        public r0.a k(r0.a aVar, r0 r0Var) {
            return ((a) aVar).v((y) r0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends r0, Type> extends n<ContainingType, Type> {

        /* renamed from: a */
        final r0 f4326a;

        /* renamed from: b */
        final d f4327b;

        public t1.b a() {
            return this.f4327b.d();
        }

        public r0 b() {
            return this.f4326a;
        }

        public int c() {
            return this.f4327b.a();
        }

        public boolean d() {
            return this.f4327b.f4324c;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final <T extends y<T, ?>> boolean A(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.s(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = c1.a().e(t10).c(t10);
        if (z10) {
            t10.t(f.SET_MEMOIZED_IS_INITIALIZED, c10 ? t10 : null);
        }
        return c10;
    }

    public static <E> a0.i<E> C(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object E(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    public static <T extends y<T, ?>> T F(T t10, InputStream inputStream) {
        return (T) q(G(t10, i.f(inputStream), p.b()));
    }

    static <T extends y<T, ?>> T G(T t10, i iVar, p pVar) {
        T t11 = (T) t10.s(f.NEW_MUTABLE_INSTANCE);
        try {
            g1 e10 = c1.a().e(t11);
            e10.h(t11, j.Q(iVar), pVar);
            e10.b(t11);
            return t11;
        } catch (IOException e11) {
            if (e11.getCause() instanceof b0) {
                throw ((b0) e11.getCause());
            }
            throw new b0(e11.getMessage()).i(t11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof b0) {
                throw ((b0) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends y<?, ?>> void H(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends y<T, ?>> T q(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.m().a().i(t10);
    }

    public static <E> a0.i<E> v() {
        return d1.f();
    }

    public static <T extends y<?, ?>> T w(Class<T> cls) {
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
            yVar = (T) ((y) r1.i(cls)).e();
            if (yVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, yVar);
        }
        return (T) yVar;
    }

    public static Object z(Method method, Object obj, Object... objArr) {
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

    protected void B() {
        c1.a().e(this).b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    /* renamed from: D */
    public final BuilderType d() {
        return (BuilderType) s(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    /* renamed from: I */
    public final BuilderType a() {
        BuilderType buildertype = (BuilderType) s(f.NEW_BUILDER);
        buildertype.v(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int c() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = c1.a().e(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (e().getClass().isInstance(obj)) {
            return c1.a().e(this).g(this, (y) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final z0<MessageType> g() {
        return (z0) s(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void h(k kVar) {
        c1.a().e(this).i(this, l.P(kVar));
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int f10 = c1.a().e(this).f(this);
        this.memoizedHashCode = f10;
        return f10;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final boolean isInitialized() {
        return A(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int j() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void n(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public Object p() {
        return s(f.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType r() {
        return (BuilderType) s(f.NEW_BUILDER);
    }

    public Object s(f fVar) {
        return u(fVar, null, null);
    }

    protected Object t(f fVar, Object obj) {
        return u(fVar, obj, null);
    }

    public String toString() {
        return t0.e(this, super.toString());
    }

    protected abstract Object u(f fVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.s0
    /* renamed from: x */
    public final MessageType e() {
        return (MessageType) s(f.GET_DEFAULT_INSTANCE);
    }
}
