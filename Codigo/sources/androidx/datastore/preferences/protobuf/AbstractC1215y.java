package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1146a;
import androidx.datastore.preferences.protobuf.AbstractC1215y;
import androidx.datastore.preferences.protobuf.AbstractC1215y.a;
import androidx.datastore.preferences.protobuf.C1147a0;
import androidx.datastore.preferences.protobuf.C1205t1;
import androidx.datastore.preferences.protobuf.C1206u;
import androidx.datastore.preferences.protobuf.InterfaceC1198r0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.y */
/* loaded from: classes.dex */
public abstract class AbstractC1215y<MessageType extends AbstractC1215y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1146a<MessageType, BuilderType> {
    private static Map<Object, AbstractC1215y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C1190o1 unknownFields = C1190o1.m6258e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends AbstractC1215y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1146a.a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f5029a;

        /* renamed from: b */
        protected MessageType f5030b;

        /* renamed from: c */
        protected boolean f5031c = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f5029a = messagetype;
            this.f5030b = (MessageType) messagetype.m6557s(f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: w */
        private void m6561w(MessageType messagetype, MessageType messagetype2) {
            C1154c1.m5677a().m5681e(messagetype).mo5792a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType mo6313f = mo6313f();
            if (mo6313f.isInitialized()) {
                return mo6313f;
            }
            throw AbstractC1146a.a.m5639m(mo6313f);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType mo6313f() {
            if (this.f5031c) {
                return this.f5030b;
            }
            this.f5030b.m6552B();
            this.f5031c = true;
            return this.f5030b;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo6378e().mo6310d();
            buildertype.m6568v(mo6313f());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: s */
        public void m6565s() {
            if (this.f5031c) {
                MessageType messagetype = (MessageType) this.f5030b.m6557s(f.NEW_MUTABLE_INSTANCE);
                m6561w(messagetype, this.f5030b);
                this.f5030b = messagetype;
                this.f5031c = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1201s0
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType mo6378e() {
            return this.f5029a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC1146a.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType mo5640k(MessageType messagetype) {
            return m6568v(messagetype);
        }

        /* renamed from: v */
        public BuilderType m6568v(MessageType messagetype) {
            m6565s();
            m6561w(this.f5030b, messagetype);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    /* loaded from: classes.dex */
    protected static class b<T extends AbstractC1215y<T, ?>> extends AbstractC1149b<T> {

        /* renamed from: b */
        private final T f5032b;

        public b(T t10) {
            this.f5032b = t10;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1218z0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo6569b(AbstractC1170i abstractC1170i, C1191p c1191p) {
            return (T) AbstractC1215y.m6546G(this.f5032b, abstractC1170i, c1191p);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$c */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC1215y<MessageType, BuilderType> implements InterfaceC1201s0 {
        protected C1206u<d> extensions = C1206u.m6436h();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J */
        public C1206u<d> m6571J() {
            if (this.extensions.m6452o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1215y, androidx.datastore.preferences.protobuf.InterfaceC1198r0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC1198r0.a mo6308a() {
            return super.mo6308a();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1215y, androidx.datastore.preferences.protobuf.InterfaceC1198r0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC1198r0.a mo6310d() {
            return super.mo6310d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1215y, androidx.datastore.preferences.protobuf.InterfaceC1201s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC1198r0 mo6378e() {
            return super.mo6378e();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$d */
    /* loaded from: classes.dex */
    static final class d implements C1206u.b<d> {

        /* renamed from: a */
        final int f5033a;

        /* renamed from: b */
        final C1205t1.b f5034b;

        /* renamed from: c */
        final boolean f5035c;

        /* renamed from: d */
        final boolean f5036d;

        @Override // androidx.datastore.preferences.protobuf.C1206u.b
        /* renamed from: a */
        public int mo6458a() {
            return this.f5033a;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f5033a - dVar.f5033a;
        }

        @Override // androidx.datastore.preferences.protobuf.C1206u.b
        /* renamed from: c */
        public boolean mo6459c() {
            return this.f5035c;
        }

        @Override // androidx.datastore.preferences.protobuf.C1206u.b
        /* renamed from: d */
        public C1205t1.b mo6460d() {
            return this.f5034b;
        }

        @Override // androidx.datastore.preferences.protobuf.C1206u.b
        /* renamed from: e */
        public C1205t1.c mo6461e() {
            return this.f5034b.m6429b();
        }

        @Override // androidx.datastore.preferences.protobuf.C1206u.b
        /* renamed from: f */
        public boolean mo6462f() {
            return this.f5036d;
        }

        /* renamed from: h */
        public C1147a0.d<?> m6573h() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C1206u.b
        /* renamed from: k */
        public InterfaceC1198r0.a mo6463k(InterfaceC1198r0.a aVar, InterfaceC1198r0 interfaceC1198r0) {
            return ((a) aVar).m6568v((AbstractC1215y) interfaceC1198r0);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$e */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends InterfaceC1198r0, Type> extends AbstractC1185n<ContainingType, Type> {

        /* renamed from: a */
        final InterfaceC1198r0 f5037a;

        /* renamed from: b */
        final d f5038b;

        /* renamed from: a */
        public C1205t1.b m6574a() {
            return this.f5038b.mo6460d();
        }

        /* renamed from: b */
        public InterfaceC1198r0 m6575b() {
            return this.f5037a;
        }

        /* renamed from: c */
        public int m6576c() {
            return this.f5038b.mo6458a();
        }

        /* renamed from: d */
        public boolean m6577d() {
            return this.f5038b.f5035c;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$f */
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

    /* renamed from: A */
    protected static final <T extends AbstractC1215y<T, ?>> boolean m6542A(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.m6557s(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo5794c = C1154c1.m5677a().m5681e(t10).mo5794c(t10);
        if (z10) {
            t10.m6558t(f.SET_MEMOIZED_IS_INITIALIZED, mo5794c ? t10 : null);
        }
        return mo5794c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public static <E> C1147a0.i<E> m6543C(C1147a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo5656a(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public static Object m6544E(InterfaceC1198r0 interfaceC1198r0, String str, Object[] objArr) {
        return new C1160e1(interfaceC1198r0, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public static <T extends AbstractC1215y<T, ?>> T m6545F(T t10, InputStream inputStream) {
        return (T) m6548q(m6546G(t10, AbstractC1170i.m5844f(inputStream), C1191p.m6272b()));
    }

    /* renamed from: G */
    static <T extends AbstractC1215y<T, ?>> T m6546G(T t10, AbstractC1170i abstractC1170i, C1191p c1191p) {
        T t11 = (T) t10.m6557s(f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC1166g1 m5681e = C1154c1.m5677a().m5681e(t11);
            m5681e.mo5799h(t11, C1173j.m5974Q(abstractC1170i), c1191p);
            m5681e.mo5793b(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C1150b0) {
                throw ((C1150b0) e10.getCause());
            }
            throw new C1150b0(e10.getMessage()).m5674i(t11);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C1150b0) {
                throw ((C1150b0) e11.getCause());
            }
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public static <T extends AbstractC1215y<?, ?>> void m6547H(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    /* renamed from: q */
    private static <T extends AbstractC1215y<T, ?>> T m6548q(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.m5634m().m6226a().m5674i(t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static <E> C1147a0.i<E> m6549v() {
        return C1157d1.m5689f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static <T extends AbstractC1215y<?, ?>> T m6550w(Class<T> cls) {
        AbstractC1215y<?, ?> abstractC1215y = defaultInstanceMap.get(cls);
        if (abstractC1215y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1215y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1215y == null) {
            abstractC1215y = (T) ((AbstractC1215y) C1199r1.m6339i(cls)).mo6378e();
            if (abstractC1215y == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC1215y);
        }
        return (T) abstractC1215y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static Object m6551z(Method method, Object obj, Object... objArr) {
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

    /* renamed from: B */
    protected void m6552B() {
        C1154c1.m5677a().m5681e(this).mo5793b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo6310d() {
        return (BuilderType) m6557s(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo6308a() {
        BuilderType buildertype = (BuilderType) m6557s(f.NEW_BUILDER);
        buildertype.m6568v(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0
    /* renamed from: c */
    public int mo6309c() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C1154c1.m5677a().m5681e(this).mo5795d(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (mo6378e().getClass().isInstance(obj)) {
            return C1154c1.m5677a().m5681e(this).mo5798g(this, (AbstractC1215y) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0
    /* renamed from: g */
    public final InterfaceC1218z0<MessageType> mo6311g() {
        return (InterfaceC1218z0) m6557s(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1198r0
    /* renamed from: h */
    public void mo6312h(AbstractC1176k abstractC1176k) {
        C1154c1.m5677a().m5681e(this).mo5800i(this, C1179l.m6143P(abstractC1176k));
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int mo5797f = C1154c1.m5677a().m5681e(this).mo5797f(this);
        this.memoizedHashCode = mo5797f;
        return mo5797f;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1201s0
    public final boolean isInitialized() {
        return m6542A(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146a
    /* renamed from: j */
    int mo5632j() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146a
    /* renamed from: n */
    void mo5635n(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public Object m6555p() {
        return m6557s(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final <MessageType extends AbstractC1215y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m6556r() {
        return (BuilderType) m6557s(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public Object m6557s(f fVar) {
        return mo6559u(fVar, null, null);
    }

    /* renamed from: t */
    protected Object m6558t(f fVar, Object obj) {
        return mo6559u(fVar, obj, null);
    }

    public String toString() {
        return C1204t0.m6425e(this, super.toString());
    }

    /* renamed from: u */
    protected abstract Object mo6559u(f fVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1201s0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final MessageType mo6378e() {
        return (MessageType) m6557s(f.GET_DEFAULT_INSTANCE);
    }
}
