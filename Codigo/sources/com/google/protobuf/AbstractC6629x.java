package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.AbstractC6562a;
import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.AbstractC6629x.a;
import com.google.protobuf.C6619t;
import com.google.protobuf.C6621t1;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6614r0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.x */
/* loaded from: classes2.dex */
public abstract class AbstractC6629x<MessageType extends AbstractC6629x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC6562a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC6629x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C6606o1 unknownFields = C6606o1.m18979c();

    /* renamed from: com.google.protobuf.x$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends AbstractC6629x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC6562a.a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f14657a;

        /* renamed from: b */
        protected MessageType f14658b;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f14657a = messagetype;
            if (messagetype.m19301N()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f14658b = m19313H();
        }

        /* renamed from: G */
        private static <MessageType> void m19312G(MessageType messagetype, MessageType messagetype2) {
            C6570c1.m18416a().m18419d(messagetype).mo18540a(messagetype, messagetype2);
        }

        /* renamed from: H */
        private MessageType m19313H() {
            return (MessageType) this.f14657a.m19305U();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: A */
        public final void m19314A() {
            if (this.f14658b.m19301N()) {
                return;
            }
            m19315B();
        }

        /* renamed from: B */
        protected void m19315B() {
            MessageType m19313H = m19313H();
            m19312G(m19313H, this.f14658b);
            this.f14658b = m19313H;
        }

        @Override // com.google.protobuf.InterfaceC6617s0
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public MessageType mo19105e() {
            return this.f14657a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC6562a.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public BuilderType mo18384t(MessageType messagetype) {
            return m19319F(messagetype);
        }

        @Override // com.google.protobuf.InterfaceC6614r0.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public BuilderType mo19037c0(AbstractC6583h abstractC6583h, C6604o c6604o) {
            m19314A();
            try {
                C6570c1.m18416a().m18419d(this.f14658b).mo18548i(this.f14658b, C6586i.m18625Q(abstractC6583h), c6604o);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        /* renamed from: F */
        public BuilderType m19319F(MessageType messagetype) {
            if (mo19105e().equals(messagetype)) {
                return this;
            }
            m19314A();
            m19312G(this.f14658b, messagetype);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC6617s0
        public final boolean isInitialized() {
            return AbstractC6629x.m19286M(this.f14658b, false);
        }

        @Override // com.google.protobuf.InterfaceC6614r0.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType mo19038f = mo19038f();
            if (mo19038f.isInitialized()) {
                return mo19038f;
            }
            throw AbstractC6562a.a.m18382v(mo19038f);
        }

        @Override // com.google.protobuf.InterfaceC6614r0.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public MessageType mo19038f() {
            if (!this.f14658b.m19301N()) {
                return this.f14658b;
            }
            this.f14658b.m19302O();
            return this.f14658b;
        }

        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo19105e().mo19034d();
            buildertype.f14658b = mo19038f();
            return buildertype;
        }
    }

    /* renamed from: com.google.protobuf.x$b */
    /* loaded from: classes2.dex */
    protected static class b<T extends AbstractC6629x<T, ?>> extends AbstractC6565b<T> {

        /* renamed from: b */
        private final T f14659b;

        public b(T t10) {
            this.f14659b = t10;
        }

        @Override // com.google.protobuf.InterfaceC6634z0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public T mo19323d(AbstractC6583h abstractC6583h, C6604o c6604o) {
            return (T) AbstractC6629x.m19290V(this.f14659b, abstractC6583h, c6604o);
        }
    }

    /* renamed from: com.google.protobuf.x$c */
    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC6629x<MessageType, BuilderType> implements InterfaceC6617s0 {
        protected C6619t<d> extensions = C6619t.m19154h();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z */
        public C6619t<d> m19325Z() {
            if (this.extensions.m19170o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.AbstractC6629x, com.google.protobuf.InterfaceC6614r0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC6614r0.a mo19032a() {
            return super.mo19032a();
        }

        @Override // com.google.protobuf.AbstractC6629x, com.google.protobuf.InterfaceC6614r0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC6614r0.a mo19034d() {
            return super.mo19034d();
        }

        @Override // com.google.protobuf.AbstractC6629x, com.google.protobuf.InterfaceC6617s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC6614r0 mo19105e() {
            return super.mo19105e();
        }
    }

    /* renamed from: com.google.protobuf.x$d */
    /* loaded from: classes2.dex */
    static final class d implements C6619t.b<d> {

        /* renamed from: a */
        final C6633z.d<?> f14660a;

        /* renamed from: b */
        final int f14661b;

        /* renamed from: c */
        final C6621t1.b f14662c;

        /* renamed from: d */
        final boolean f14663d;

        /* renamed from: e */
        final boolean f14664e;

        @Override // com.google.protobuf.C6619t.b
        /* renamed from: a */
        public int mo19176a() {
            return this.f14661b;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f14661b - dVar.f14661b;
        }

        @Override // com.google.protobuf.C6619t.b
        /* renamed from: c */
        public boolean mo19177c() {
            return this.f14663d;
        }

        @Override // com.google.protobuf.C6619t.b
        /* renamed from: d */
        public C6621t1.b mo19178d() {
            return this.f14662c;
        }

        @Override // com.google.protobuf.C6619t.b
        /* renamed from: e */
        public C6621t1.c mo19179e() {
            return this.f14662c.m19192h();
        }

        @Override // com.google.protobuf.C6619t.b
        /* renamed from: f */
        public boolean mo19180f() {
            return this.f14664e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C6619t.b
        /* renamed from: g */
        public InterfaceC6614r0.a mo19181g(InterfaceC6614r0.a aVar, InterfaceC6614r0 interfaceC6614r0) {
            return ((a) aVar).m19319F((AbstractC6629x) interfaceC6614r0);
        }

        /* renamed from: h */
        public C6633z.d<?> m19327h() {
            return this.f14660a;
        }
    }

    /* renamed from: com.google.protobuf.x$e */
    /* loaded from: classes2.dex */
    public static class e<ContainingType extends InterfaceC6614r0, Type> extends AbstractC6598m<ContainingType, Type> {

        /* renamed from: a */
        final InterfaceC6614r0 f14665a;

        /* renamed from: b */
        final d f14666b;

        /* renamed from: a */
        public C6621t1.b m19328a() {
            return this.f14666b.mo19178d();
        }

        /* renamed from: b */
        public InterfaceC6614r0 m19329b() {
            return this.f14665a;
        }

        /* renamed from: c */
        public int m19330c() {
            return this.f14666b.mo19176a();
        }

        /* renamed from: d */
        public boolean m19331d() {
            return this.f14666b.f14663d;
        }
    }

    /* renamed from: com.google.protobuf.x$f */
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public static C6633z.g m19282F() {
        return C6631y.m19334k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public static <E> C6633z.i<E> m19283G() {
        return C6573d1.m18427f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static <T extends AbstractC6629x<?, ?>> T m19284H(Class<T> cls) {
        AbstractC6629x<?, ?> abstractC6629x = defaultInstanceMap.get(cls);
        if (abstractC6629x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6629x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC6629x == null) {
            abstractC6629x = (T) ((AbstractC6629x) C6615r1.m19069k(cls)).mo19105e();
            if (abstractC6629x == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC6629x);
        }
        return (T) abstractC6629x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static Object m19285L(Method method, Object obj, Object... objArr) {
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

    /* renamed from: M */
    protected static final <T extends AbstractC6629x<T, ?>> boolean m19286M(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.m19295C(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo18542c = C6570c1.m18416a().m18419d(t10).mo18542c(t10);
        if (z10) {
            t10.m19296D(f.SET_MEMOIZED_IS_INITIALIZED, mo18542c ? t10 : null);
        }
        return mo18542c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.z$g] */
    /* renamed from: Q */
    public static C6633z.g m19287Q(C6633z.g gVar) {
        int size = gVar.size();
        return gVar.mo18430a(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public static <E> C6633z.i<E> m19288R(C6633z.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo18430a(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public static Object m19289T(InterfaceC6614r0 interfaceC6614r0, String str, Object[] objArr) {
        return new C6576e1(interfaceC6614r0, str, objArr);
    }

    /* renamed from: V */
    static <T extends AbstractC6629x<T, ?>> T m19290V(T t10, AbstractC6583h abstractC6583h, C6604o c6604o) {
        T t11 = (T) t10.m19305U();
        try {
            InterfaceC6582g1 m18419d = C6570c1.m18416a().m18419d(t11);
            m18419d.mo18548i(t11, C6586i.m18625Q(abstractC6583h), c6604o);
            m18419d.mo18541b(t11);
            return t11;
        } catch (C6566b0 e10) {
            e = e10;
            if (e.m18407a()) {
                e = new C6566b0(e);
            }
            throw e.m18409k(t11);
        } catch (C6600m1 e11) {
            throw e11.m18947a().m18409k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C6566b0) {
                throw ((C6566b0) e12.getCause());
            }
            throw new C6566b0(e12).m18409k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C6566b0) {
                throw ((C6566b0) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public static <T extends AbstractC6629x<?, ?>> void m19291W(Class<T> cls, T t10) {
        t10.m19303P();
        defaultInstanceMap.put(cls, t10);
    }

    /* renamed from: z */
    private int m19292z(InterfaceC6582g1<?> interfaceC6582g1) {
        return interfaceC6582g1 == null ? C6570c1.m18416a().m18419d(this).mo18543d(this) : interfaceC6582g1.mo18543d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final <MessageType extends AbstractC6629x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m19293A() {
        return (BuilderType) m19295C(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final <MessageType extends AbstractC6629x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m19294B(MessageType messagetype) {
        return (BuilderType) m19293A().m19319F(messagetype);
    }

    /* renamed from: C */
    protected Object m19295C(f fVar) {
        return mo19297E(fVar, null, null);
    }

    /* renamed from: D */
    protected Object m19296D(f fVar, Object obj) {
        return mo19297E(fVar, obj, null);
    }

    /* renamed from: E */
    protected abstract Object mo19297E(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.InterfaceC6617s0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final MessageType mo19105e() {
        return (MessageType) m19295C(f.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: J */
    int m19299J() {
        return this.memoizedHashCode;
    }

    /* renamed from: K */
    boolean m19300K() {
        return m19299J() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean m19301N() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public void m19302O() {
        C6570c1.m18416a().m18419d(this).mo18541b(this);
        m19303P();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m19303P() {
        this.memoizedSerializedSize &= C5101a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo19034d() {
        return (BuilderType) m19295C(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public MessageType m19305U() {
        return (MessageType) m19295C(f.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: X */
    void m19306X(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo19032a() {
        return (BuilderType) ((a) m19295C(f.NEW_BUILDER)).m19319F(this);
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: c */
    public int mo19033c() {
        return mo18377r(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C6570c1.m18416a().m18419d(this).mo18546g(this, (AbstractC6629x) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: g */
    public final InterfaceC6634z0<MessageType> mo19035g() {
        return (InterfaceC6634z0) m19295C(f.GET_PARSER);
    }

    public int hashCode() {
        if (m19301N()) {
            return m19311y();
        }
        if (m19300K()) {
            m19306X(m19311y());
        }
        return m19299J();
    }

    @Override // com.google.protobuf.InterfaceC6617s0
    public final boolean isInitialized() {
        return m19286M(this, true);
    }

    @Override // com.google.protobuf.InterfaceC6614r0
    /* renamed from: l */
    public void mo19036l(AbstractC6589j abstractC6589j) {
        C6570c1.m18416a().m18419d(this).mo18547h(this, C6592k.m18857P(abstractC6589j));
    }

    @Override // com.google.protobuf.AbstractC6562a
    /* renamed from: o */
    int mo18376o() {
        return this.memoizedSerializedSize & C5101a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.AbstractC6562a
    /* renamed from: r */
    int mo18377r(InterfaceC6582g1 interfaceC6582g1) {
        if (!m19301N()) {
            if (mo18376o() != Integer.MAX_VALUE) {
                return mo18376o();
            }
            int m19292z = m19292z(interfaceC6582g1);
            mo18379u(m19292z);
            return m19292z;
        }
        int m19292z2 = m19292z(interfaceC6582g1);
        if (m19292z2 >= 0) {
            return m19292z2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m19292z2);
    }

    public String toString() {
        return C6620t0.m19187f(this, super.toString());
    }

    @Override // com.google.protobuf.AbstractC6562a
    /* renamed from: u */
    void mo18379u(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & C5101a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public Object m19308v() {
        return m19295C(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m19309w() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m19310x() {
        mo18379u(C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: y */
    int m19311y() {
        return C6570c1.m18416a().m18419d(this).mo18545f(this);
    }
}
