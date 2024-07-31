package p171j3;

import com.bumptech.glide.C2118d;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2134e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129h3.C7624h;
import p129h3.InterfaceC7620d;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7627k;
import p129h3.InterfaceC7628l;
import p171j3.RunnableC8961h;
import p193k3.InterfaceC9139b;
import p212l3.InterfaceC9375a;
import p246n3.InterfaceC9649o;
import p286p3.C10053n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j3.g */
/* loaded from: classes.dex */
public final class C8960g<Transcode> {

    /* renamed from: a */
    private final List<InterfaceC9649o.a<?>> f21322a = new ArrayList();

    /* renamed from: b */
    private final List<InterfaceC7622f> f21323b = new ArrayList();

    /* renamed from: c */
    private C2118d f21324c;

    /* renamed from: d */
    private Object f21325d;

    /* renamed from: e */
    private int f21326e;

    /* renamed from: f */
    private int f21327f;

    /* renamed from: g */
    private Class<?> f21328g;

    /* renamed from: h */
    private RunnableC8961h.e f21329h;

    /* renamed from: i */
    private C7624h f21330i;

    /* renamed from: j */
    private Map<Class<?>, InterfaceC7628l<?>> f21331j;

    /* renamed from: k */
    private Class<Transcode> f21332k;

    /* renamed from: l */
    private boolean f21333l;

    /* renamed from: m */
    private boolean f21334m;

    /* renamed from: n */
    private InterfaceC7622f f21335n;

    /* renamed from: o */
    private EnumC2121g f21336o;

    /* renamed from: p */
    private AbstractC8963j f21337p;

    /* renamed from: q */
    private boolean f21338q;

    /* renamed from: r */
    private boolean f21339r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m26193a() {
        this.f21324c = null;
        this.f21325d = null;
        this.f21335n = null;
        this.f21328g = null;
        this.f21332k = null;
        this.f21330i = null;
        this.f21336o = null;
        this.f21331j = null;
        this.f21337p = null;
        this.f21322a.clear();
        this.f21333l = false;
        this.f21323b.clear();
        this.f21334m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC9139b m26194b() {
        return this.f21324c.m10663a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<InterfaceC7622f> m26195c() {
        if (!this.f21334m) {
            this.f21334m = true;
            this.f21323b.clear();
            List<InterfaceC9649o.a<?>> m26199g = m26199g();
            int size = m26199g.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9649o.a<?> aVar = m26199g.get(i10);
                if (!this.f21323b.contains(aVar.f23681a)) {
                    this.f21323b.add(aVar.f23681a);
                }
                for (int i11 = 0; i11 < aVar.f23682b.size(); i11++) {
                    if (!this.f21323b.contains(aVar.f23682b.get(i11))) {
                        this.f21323b.add(aVar.f23682b.get(i11));
                    }
                }
            }
        }
        return this.f21323b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC9375a m26196d() {
        return this.f21329h.mo26252a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC8963j m26197e() {
        return this.f21337p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m26198f() {
        return this.f21327f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<InterfaceC9649o.a<?>> m26199g() {
        if (!this.f21333l) {
            this.f21333l = true;
            this.f21322a.clear();
            List m10682i = this.f21324c.m10670h().m10682i(this.f21325d);
            int size = m10682i.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9649o.a<?> mo28848b = ((InterfaceC9649o) m10682i.get(i10)).mo28848b(this.f21325d, this.f21326e, this.f21327f, this.f21330i);
                if (mo28848b != null) {
                    this.f21322a.add(mo28848b);
                }
            }
        }
        return this.f21322a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C8973t<Data, ?, Transcode> m26200h(Class<Data> cls) {
        return this.f21324c.m10670h().m10681h(cls, this.f21328g, this.f21332k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> m26201i() {
        return this.f21325d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public List<InterfaceC9649o<File, ?>> m26202j(File file) {
        return this.f21324c.m10670h().m10682i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C7624h m26203k() {
        return this.f21330i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public EnumC2121g m26204l() {
        return this.f21336o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> m26205m() {
        return this.f21324c.m10670h().m10683j(this.f21325d.getClass(), this.f21328g, this.f21332k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> InterfaceC7627k<Z> m26206n(InterfaceC8975v<Z> interfaceC8975v) {
        return this.f21324c.m10670h().m10684k(interfaceC8975v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public <T> InterfaceC2134e<T> m26207o(T t10) {
        return this.f21324c.m10670h().m10685l(t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public InterfaceC7622f m26208p() {
        return this.f21335n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public <X> InterfaceC7620d<X> m26209q(X x10) {
        return this.f21324c.m10670h().m10686m(x10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Class<?> m26210r() {
        return this.f21332k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public <Z> InterfaceC7628l<Z> m26211s(Class<Z> cls) {
        InterfaceC7628l<Z> interfaceC7628l = (InterfaceC7628l) this.f21331j.get(cls);
        if (interfaceC7628l == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC7628l<?>>> it = this.f21331j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC7628l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC7628l = (InterfaceC7628l) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC7628l != null) {
            return interfaceC7628l;
        }
        if (!this.f21331j.isEmpty() || !this.f21338q) {
            return C10053n.m29972c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public int m26212t() {
        return this.f21326e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public boolean m26213u(Class<?> cls) {
        return m26200h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public <R> void m26214v(C2118d c2118d, Object obj, InterfaceC7622f interfaceC7622f, int i10, int i11, AbstractC8963j abstractC8963j, Class<?> cls, Class<R> cls2, EnumC2121g enumC2121g, C7624h c7624h, Map<Class<?>, InterfaceC7628l<?>> map, boolean z10, boolean z11, RunnableC8961h.e eVar) {
        this.f21324c = c2118d;
        this.f21325d = obj;
        this.f21335n = interfaceC7622f;
        this.f21326e = i10;
        this.f21327f = i11;
        this.f21337p = abstractC8963j;
        this.f21328g = cls;
        this.f21329h = eVar;
        this.f21332k = cls2;
        this.f21336o = enumC2121g;
        this.f21330i = c7624h;
        this.f21331j = map;
        this.f21338q = z10;
        this.f21339r = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m26215w(InterfaceC8975v<?> interfaceC8975v) {
        return this.f21324c.m10670h().m10687n(interfaceC8975v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m26216x() {
        return this.f21339r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m26217y(InterfaceC7622f interfaceC7622f) {
        List<InterfaceC9649o.a<?>> m26199g = m26199g();
        int size = m26199g.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (m26199g.get(i10).f23681a.equals(interfaceC7622f)) {
                return true;
            }
        }
        return false;
    }
}
