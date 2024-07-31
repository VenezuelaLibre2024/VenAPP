package ld;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import jd.g;

/* loaded from: classes.dex */
public final class d implements kd.b<d> {

    /* renamed from: e */
    private static final jd.d<Object> f21197e = new jd.d() { // from class: ld.a
        @Override // jd.d
        public final void encode(Object obj, Object obj2) {
            d.k(obj, (jd.e) obj2);
        }
    };

    /* renamed from: f */
    private static final jd.f<String> f21198f = new jd.f() { // from class: ld.b
        @Override // jd.f
        public final void encode(Object obj, Object obj2) {
            ((g) obj2).add((String) obj);
        }
    };

    /* renamed from: g */
    private static final jd.f<Boolean> f21199g = new jd.f() { // from class: ld.c
        @Override // jd.f
        public final void encode(Object obj, Object obj2) {
            d.m((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h */
    private static final b f21200h = new b(null);

    /* renamed from: a */
    private final Map<Class<?>, jd.d<?>> f21201a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, jd.f<?>> f21202b = new HashMap();

    /* renamed from: c */
    private jd.d<Object> f21203c = f21197e;

    /* renamed from: d */
    private boolean f21204d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements jd.a {
        a() {
        }

        @Override // jd.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f21201a, d.this.f21202b, d.this.f21203c, d.this.f21204d);
            eVar.d(obj, false);
            eVar.n();
        }

        @Override // jd.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements jd.f<Date> {

        /* renamed from: a */
        private static final DateFormat f21206a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f21206a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // jd.f
        /* renamed from: a */
        public void encode(Date date, g gVar) {
            gVar.add(f21206a.format(date));
        }
    }

    public d() {
        o(String.class, f21198f);
        o(Boolean.class, f21199g);
        o(Date.class, f21200h);
    }

    public static /* synthetic */ void k(Object obj, jd.e eVar) {
        throw new jd.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void m(Boolean bool, g gVar) {
        gVar.add(bool.booleanValue());
    }

    public jd.a h() {
        return new a();
    }

    public d i(kd.a aVar) {
        aVar.configure(this);
        return this;
    }

    public d j(boolean z10) {
        this.f21204d = z10;
        return this;
    }

    @Override // kd.b
    /* renamed from: n */
    public <T> d registerEncoder(Class<T> cls, jd.d<? super T> dVar) {
        this.f21201a.put(cls, dVar);
        this.f21202b.remove(cls);
        return this;
    }

    public <T> d o(Class<T> cls, jd.f<? super T> fVar) {
        this.f21202b.put(cls, fVar);
        this.f21201a.remove(cls);
        return this;
    }
}
