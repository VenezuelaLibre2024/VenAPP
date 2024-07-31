package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5949a;
import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C5961e;
import com.google.crypto.tink.shaded.protobuf.C6008t1;
import com.google.crypto.tink.shaded.protobuf.C6009u;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y */
/* loaded from: classes2.dex */
public abstract class AbstractC6018y<MessageType extends AbstractC6018y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5949a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC6018y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C5993o1 unknownFields = C5993o1.m15915c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends AbstractC6018y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5949a.a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f12776a;

        /* renamed from: b */
        protected MessageType f12777b;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f12776a = messagetype;
            if (messagetype.m16237F()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f12777b = m16253z();
        }

        /* renamed from: x */
        private static <MessageType> void m16252x(MessageType messagetype, MessageType messagetype2) {
            C5957c1.m15338a().m15341d(messagetype).mo15470a(messagetype, messagetype2);
        }

        /* renamed from: z */
        private MessageType m16253z() {
            return (MessageType) this.f12776a.m16241L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
        public final boolean isInitialized() {
            return AbstractC6018y.m16220E(this.f12777b, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType mo15973f = mo15973f();
            if (mo15973f.isInitialized()) {
                return mo15973f;
            }
            throw AbstractC5949a.a.m15298l(mo15973f);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public MessageType mo15973f() {
            if (!this.f12777b.m16237F()) {
                return this.f12777b;
            }
            this.f12777b.m16238G();
            return this.f12777b;
        }

        @Override // 
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo16043e().mo15969d();
            buildertype.f12777b = mo15973f();
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public final void m16257r() {
            if (this.f12777b.m16237F()) {
                return;
            }
            m16258s();
        }

        /* renamed from: s */
        protected void m16258s() {
            MessageType m16253z = m16253z();
            m16252x(m16253z, this.f12777b);
            this.f12777b = m16253z;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType mo16043e() {
            return this.f12776a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5949a.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType mo15300j(MessageType messagetype) {
            return m16262w(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType mo15972H0(AbstractC5973i abstractC5973i, C5994p c5994p) {
            m16257r();
            try {
                C5957c1.m15338a().m15341d(this.f12777b).mo15478i(this.f12777b, C5976j.m15657Q(abstractC5973i), c5994p);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        /* renamed from: w */
        public BuilderType m16262w(MessageType messagetype) {
            if (mo16043e().equals(messagetype)) {
                return this;
            }
            m16257r();
            m16252x(this.f12777b, messagetype);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$b */
    /* loaded from: classes2.dex */
    protected static class b<T extends AbstractC6018y<T, ?>> extends AbstractC5952b<T> {

        /* renamed from: b */
        private final T f12778b;

        public b(T t10) {
            this.f12778b = t10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6021z0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo16263a(AbstractC5973i abstractC5973i, C5994p c5994p) {
            return (T) AbstractC6018y.m16227Q(this.f12778b, abstractC5973i, c5994p);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$c */
    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC6018y<MessageType, BuilderType> implements InterfaceC6004s0 {
        protected C6009u<d> extensions = C6009u.m16100h();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V */
        public C6009u<d> m16265V() {
            if (this.extensions.m16115n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
            return super.mo15967a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15969d() {
            return super.mo15969d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC6001r0 mo16043e() {
            return super.mo16043e();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$d */
    /* loaded from: classes2.dex */
    static final class d implements C6009u.b<d> {

        /* renamed from: a */
        final C5950a0.d<?> f12779a;

        /* renamed from: b */
        final int f12780b;

        /* renamed from: c */
        final C6008t1.b f12781c;

        /* renamed from: d */
        final boolean f12782d;

        /* renamed from: e */
        final boolean f12783e;

        @Override // com.google.crypto.tink.shaded.protobuf.C6009u.b
        /* renamed from: a */
        public int mo16121a() {
            return this.f12780b;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f12780b - dVar.f12780b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6009u.b
        /* renamed from: c */
        public boolean mo16122c() {
            return this.f12782d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6009u.b
        /* renamed from: d */
        public C6008t1.b mo16123d() {
            return this.f12781c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6009u.b
        /* renamed from: e */
        public C6008t1.c mo16124e() {
            return this.f12781c.m16095b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6009u.b
        /* renamed from: f */
        public boolean mo16125f() {
            return this.f12783e;
        }

        /* renamed from: h */
        public C5950a0.d<?> m16267h() {
            return this.f12779a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.C6009u.b
        /* renamed from: j */
        public InterfaceC6001r0.a mo16126j(InterfaceC6001r0.a aVar, InterfaceC6001r0 interfaceC6001r0) {
            return ((a) aVar).m16262w((AbstractC6018y) interfaceC6001r0);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$e */
    /* loaded from: classes2.dex */
    public static class e<ContainingType extends InterfaceC6001r0, Type> extends AbstractC5988n<ContainingType, Type> {

        /* renamed from: a */
        final InterfaceC6001r0 f12784a;

        /* renamed from: b */
        final d f12785b;

        /* renamed from: a */
        public C6008t1.b m16268a() {
            return this.f12785b.mo16123d();
        }

        /* renamed from: b */
        public InterfaceC6001r0 m16269b() {
            return this.f12784a;
        }

        /* renamed from: c */
        public int m16270c() {
            return this.f12785b.mo16121a();
        }

        /* renamed from: d */
        public boolean m16271d() {
            return this.f12785b.f12782d;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$f */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static Object m16219D(Method method, Object obj, Object... objArr) {
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

    /* renamed from: E */
    protected static final <T extends AbstractC6018y<T, ?>> boolean m16220E(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.m16249v(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo15472c = C5957c1.m15338a().m15341d(t10).mo15472c(t10);
        if (z10) {
            t10.m16250w(f.SET_MEMOIZED_IS_INITIALIZED, mo15472c ? t10 : null);
        }
        return mo15472c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public static <E> C5950a0.i<E> m16221I(C5950a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo15315a(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public static Object m16222K(InterfaceC6001r0 interfaceC6001r0, String str, Object[] objArr) {
        return new C5963e1(interfaceC6001r0, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public static <T extends AbstractC6018y<T, ?>> T m16223M(T t10, AbstractC5970h abstractC5970h, C5994p c5994p) {
        return (T) m16230p(m16226P(t10, abstractC5970h, c5994p));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public static <T extends AbstractC6018y<T, ?>> T m16224N(T t10, InputStream inputStream, C5994p c5994p) {
        return (T) m16230p(m16227Q(t10, AbstractC5973i.m15524f(inputStream), c5994p));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public static <T extends AbstractC6018y<T, ?>> T m16225O(T t10, byte[] bArr, C5994p c5994p) {
        return (T) m16230p(m16228R(t10, bArr, 0, bArr.length, c5994p));
    }

    /* renamed from: P */
    private static <T extends AbstractC6018y<T, ?>> T m16226P(T t10, AbstractC5970h abstractC5970h, C5994p c5994p) {
        AbstractC5973i mo15498s = abstractC5970h.mo15498s();
        T t11 = (T) m16227Q(t10, mo15498s, c5994p);
        try {
            mo15498s.mo15534a(0);
            return t11;
        } catch (C5953b0 e10) {
            throw e10.m15335k(t11);
        }
    }

    /* renamed from: Q */
    static <T extends AbstractC6018y<T, ?>> T m16227Q(T t10, AbstractC5973i abstractC5973i, C5994p c5994p) {
        T t11 = (T) t10.m16241L();
        try {
            InterfaceC5969g1 m15341d = C5957c1.m15338a().m15341d(t11);
            m15341d.mo15478i(t11, C5976j.m15657Q(abstractC5973i), c5994p);
            m15341d.mo15471b(t11);
            return t11;
        } catch (C5953b0 e10) {
            e = e10;
            if (e.m15333a()) {
                e = new C5953b0(e);
            }
            throw e.m15335k(t11);
        } catch (C5987m1 e11) {
            throw e11.m15885a().m15335k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C5953b0) {
                throw ((C5953b0) e12.getCause());
            }
            throw new C5953b0(e12).m15335k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C5953b0) {
                throw ((C5953b0) e13.getCause());
            }
            throw e13;
        }
    }

    /* renamed from: R */
    private static <T extends AbstractC6018y<T, ?>> T m16228R(T t10, byte[] bArr, int i10, int i11, C5994p c5994p) {
        T t11 = (T) t10.m16241L();
        try {
            InterfaceC5969g1 m15341d = C5957c1.m15338a().m15341d(t11);
            m15341d.mo15477h(t11, bArr, i10, i10 + i11, new C5961e.b(c5994p));
            m15341d.mo15471b(t11);
            return t11;
        } catch (C5953b0 e10) {
            e = e10;
            if (e.m15333a()) {
                e = new C5953b0(e);
            }
            throw e.m15335k(t11);
        } catch (C5987m1 e11) {
            throw e11.m15885a().m15335k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C5953b0) {
                throw ((C5953b0) e12.getCause());
            }
            throw new C5953b0(e12).m15335k(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw C5953b0.m15332m().m15335k(t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public static <T extends AbstractC6018y<?, ?>> void m16229S(Class<T> cls, T t10) {
        t10.m16239H();
        defaultInstanceMap.put(cls, t10);
    }

    /* renamed from: p */
    private static <T extends AbstractC6018y<T, ?>> T m16230p(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.m15296m().m15885a().m15335k(t10);
    }

    /* renamed from: t */
    private int m16231t(InterfaceC5969g1<?> interfaceC5969g1) {
        return interfaceC5969g1 == null ? C5957c1.m15338a().m15341d(this).mo15473d(this) : interfaceC5969g1.mo15473d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public static <E> C5950a0.i<E> m16232y() {
        return C5960d1.m15349f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static <T extends AbstractC6018y<?, ?>> T m16233z(Class<T> cls) {
        AbstractC6018y<?, ?> abstractC6018y = defaultInstanceMap.get(cls);
        if (abstractC6018y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6018y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC6018y == null) {
            abstractC6018y = (T) ((AbstractC6018y) C6002r1.m16004k(cls)).mo16043e();
            if (abstractC6018y == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC6018y);
        }
        return (T) abstractC6018y;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final MessageType mo16043e() {
        return (MessageType) m16249v(f.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: B */
    int m16235B() {
        return this.memoizedHashCode;
    }

    /* renamed from: C */
    boolean m16236C() {
        return m16235B() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m16237F() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public void m16238G() {
        C5957c1.m15338a().m15341d(this).mo15471b(this);
        m16239H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m16239H() {
        this.memoizedSerializedSize &= C5101a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo15969d() {
        return (BuilderType) m16249v(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public MessageType m16241L() {
        return (MessageType) m16249v(f.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: T */
    void m16242T(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo15967a() {
        return (BuilderType) ((a) m16249v(f.NEW_BUILDER)).m16262w(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: c */
    public int mo15968c() {
        return mo15295k(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5957c1.m15338a().m15341d(this).mo15476g(this, (AbstractC6018y) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: g */
    public final InterfaceC6021z0<MessageType> mo15970g() {
        return (InterfaceC6021z0) m16249v(f.GET_PARSER);
    }

    public int hashCode() {
        if (m16237F()) {
            return m16247s();
        }
        if (m16236C()) {
            m16242T(m16247s());
        }
        return m16235B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: i */
    public void mo15971i(AbstractC5979k abstractC5979k) {
        C5957c1.m15338a().m15341d(this).mo15479j(this, C5982l.m15806P(abstractC5979k));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
    public final boolean isInitialized() {
        return m16220E(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5949a
    /* renamed from: j */
    int mo15294j() {
        return this.memoizedSerializedSize & C5101a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5949a
    /* renamed from: k */
    int mo15295k(InterfaceC5969g1 interfaceC5969g1) {
        if (!m16237F()) {
            if (mo15294j() != Integer.MAX_VALUE) {
                return mo15294j();
            }
            int m16231t = m16231t(interfaceC5969g1);
            mo15297n(m16231t);
            return m16231t;
        }
        int m16231t2 = m16231t(interfaceC5969g1);
        if (m16231t2 >= 0) {
            return m16231t2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m16231t2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5949a
    /* renamed from: n */
    void mo15297n(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & C5101a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public Object m16244o() {
        return m16249v(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m16245q() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m16246r() {
        mo15297n(C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: s */
    int m16247s() {
        return C5957c1.m15338a().m15341d(this).mo15475f(this);
    }

    public String toString() {
        return C6007t0.m16091f(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final <MessageType extends AbstractC6018y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m16248u() {
        return (BuilderType) m16249v(f.NEW_BUILDER);
    }

    /* renamed from: v */
    protected Object m16249v(f fVar) {
        return mo16251x(fVar, null, null);
    }

    /* renamed from: w */
    protected Object m16250w(f fVar, Object obj) {
        return mo16251x(fVar, obj, null);
    }

    /* renamed from: x */
    protected abstract Object mo16251x(f fVar, Object obj, Object obj2);
}
