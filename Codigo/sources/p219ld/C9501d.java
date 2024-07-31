package p219ld;

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
import p181jd.C9038b;
import p181jd.InterfaceC9037a;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p181jd.InterfaceC9042f;
import p181jd.InterfaceC9043g;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: ld.d */
/* loaded from: classes.dex */
public final class C9501d implements InterfaceC9255b<C9501d> {

    /* renamed from: e */
    private static final InterfaceC9040d<Object> f23050e = new InterfaceC9040d() { // from class: ld.a
        @Override // p181jd.InterfaceC9040d
        public final void encode(Object obj, Object obj2) {
            C9501d.m28240k(obj, (InterfaceC9041e) obj2);
        }
    };

    /* renamed from: f */
    private static final InterfaceC9042f<String> f23051f = new InterfaceC9042f() { // from class: ld.b
        @Override // p181jd.InterfaceC9042f
        public final void encode(Object obj, Object obj2) {
            ((InterfaceC9043g) obj2).add((String) obj);
        }
    };

    /* renamed from: g */
    private static final InterfaceC9042f<Boolean> f23052g = new InterfaceC9042f() { // from class: ld.c
        @Override // p181jd.InterfaceC9042f
        public final void encode(Object obj, Object obj2) {
            C9501d.m28242m((Boolean) obj, (InterfaceC9043g) obj2);
        }
    };

    /* renamed from: h */
    private static final b f23053h = new b(null);

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC9040d<?>> f23054a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC9042f<?>> f23055b = new HashMap();

    /* renamed from: c */
    private InterfaceC9040d<Object> f23056c = f23050e;

    /* renamed from: d */
    private boolean f23057d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ld.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC9037a {
        a() {
        }

        @Override // p181jd.InterfaceC9037a
        /* renamed from: a */
        public void mo26545a(Object obj, Writer writer) {
            C9502e c9502e = new C9502e(writer, C9501d.this.f23054a, C9501d.this.f23055b, C9501d.this.f23056c, C9501d.this.f23057d);
            c9502e.m28256d(obj, false);
            c9502e.m28265n();
        }

        @Override // p181jd.InterfaceC9037a
        /* renamed from: b */
        public String mo26546b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo26545a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: ld.d$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC9042f<Date> {

        /* renamed from: a */
        private static final DateFormat f23059a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f23059a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p181jd.InterfaceC9042f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(Date date, InterfaceC9043g interfaceC9043g) {
            interfaceC9043g.add(f23059a.format(date));
        }
    }

    public C9501d() {
        m28247o(String.class, f23051f);
        m28247o(Boolean.class, f23052g);
        m28247o(Date.class, f23053h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m28240k(Object obj, InterfaceC9041e interfaceC9041e) {
        throw new C9038b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m28242m(Boolean bool, InterfaceC9043g interfaceC9043g) {
        interfaceC9043g.add(bool.booleanValue());
    }

    /* renamed from: h */
    public InterfaceC9037a m28243h() {
        return new a();
    }

    /* renamed from: i */
    public C9501d m28244i(InterfaceC9254a interfaceC9254a) {
        interfaceC9254a.configure(this);
        return this;
    }

    /* renamed from: j */
    public C9501d m28245j(boolean z10) {
        this.f23057d = z10;
        return this;
    }

    @Override // p203kd.InterfaceC9255b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public <T> C9501d registerEncoder(Class<T> cls, InterfaceC9040d<? super T> interfaceC9040d) {
        this.f23054a.put(cls, interfaceC9040d);
        this.f23055b.remove(cls);
        return this;
    }

    /* renamed from: o */
    public <T> C9501d m28247o(Class<T> cls, InterfaceC9042f<? super T> interfaceC9042f) {
        this.f23055b.put(cls, interfaceC9042f);
        this.f23054a.remove(cls);
        return this;
    }
}
