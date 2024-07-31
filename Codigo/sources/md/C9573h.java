package md;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import md.C9573h;
import p181jd.C9038b;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p181jd.InterfaceC9042f;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: md.h */
/* loaded from: classes.dex */
public class C9573h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC9040d<?>> f23289a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC9042f<?>> f23290b;

    /* renamed from: c */
    private final InterfaceC9040d<Object> f23291c;

    /* renamed from: md.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9255b<a> {

        /* renamed from: d */
        private static final InterfaceC9040d<Object> f23292d = new InterfaceC9040d() { // from class: md.g
            @Override // p181jd.InterfaceC9040d
            public final void encode(Object obj, Object obj2) {
                C9573h.a.m28479d(obj, (InterfaceC9041e) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, InterfaceC9040d<?>> f23293a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC9042f<?>> f23294b = new HashMap();

        /* renamed from: c */
        private InterfaceC9040d<Object> f23295c = f23292d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m28479d(Object obj, InterfaceC9041e interfaceC9041e) {
            throw new C9038b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: b */
        public C9573h m28480b() {
            return new C9573h(new HashMap(this.f23293a), new HashMap(this.f23294b), this.f23295c);
        }

        /* renamed from: c */
        public a m28481c(InterfaceC9254a interfaceC9254a) {
            interfaceC9254a.configure(this);
            return this;
        }

        @Override // p203kd.InterfaceC9255b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(Class<U> cls, InterfaceC9040d<? super U> interfaceC9040d) {
            this.f23293a.put(cls, interfaceC9040d);
            this.f23294b.remove(cls);
            return this;
        }
    }

    C9573h(Map<Class<?>, InterfaceC9040d<?>> map, Map<Class<?>, InterfaceC9042f<?>> map2, InterfaceC9040d<Object> interfaceC9040d) {
        this.f23289a = map;
        this.f23290b = map2;
        this.f23291c = interfaceC9040d;
    }

    /* renamed from: a */
    public static a m28475a() {
        return new a();
    }

    /* renamed from: b */
    public void m28476b(Object obj, OutputStream outputStream) {
        new C9571f(outputStream, this.f23289a, this.f23290b, this.f23291c).m28474o(obj);
    }

    /* renamed from: c */
    public byte[] m28477c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m28476b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
