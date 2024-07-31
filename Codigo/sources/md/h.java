package md;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import md.h;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final Map<Class<?>, jd.d<?>> f21435a;

    /* renamed from: b */
    private final Map<Class<?>, jd.f<?>> f21436b;

    /* renamed from: c */
    private final jd.d<Object> f21437c;

    /* loaded from: classes.dex */
    public static final class a implements kd.b<a> {

        /* renamed from: d */
        private static final jd.d<Object> f21438d = new jd.d() { // from class: md.g
            @Override // jd.d
            public final void encode(Object obj, Object obj2) {
                h.a.d(obj, (jd.e) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, jd.d<?>> f21439a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, jd.f<?>> f21440b = new HashMap();

        /* renamed from: c */
        private jd.d<Object> f21441c = f21438d;

        public static /* synthetic */ void d(Object obj, jd.e eVar) {
            throw new jd.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f21439a), new HashMap(this.f21440b), this.f21441c);
        }

        public a c(kd.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // kd.b
        /* renamed from: e */
        public <U> a registerEncoder(Class<U> cls, jd.d<? super U> dVar) {
            this.f21439a.put(cls, dVar);
            this.f21440b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, jd.d<?>> map, Map<Class<?>, jd.f<?>> map2, jd.d<Object> dVar) {
        this.f21435a = map;
        this.f21436b = map2;
        this.f21437c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f21435a, this.f21436b, this.f21437c).o(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
