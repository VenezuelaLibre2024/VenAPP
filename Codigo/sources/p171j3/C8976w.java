package p171j3;

import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.File;
import java.util.List;
import p055d4.C6843b;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7622f;
import p171j3.InterfaceC8959f;
import p246n3.InterfaceC9649o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j3.w */
/* loaded from: classes.dex */
public class C8976w implements InterfaceC8959f, InterfaceC2133d.a<Object> {

    /* renamed from: a */
    private final InterfaceC8959f.a f21488a;

    /* renamed from: b */
    private final C8960g<?> f21489b;

    /* renamed from: c */
    private int f21490c;

    /* renamed from: d */
    private int f21491d = -1;

    /* renamed from: e */
    private InterfaceC7622f f21492e;

    /* renamed from: f */
    private List<InterfaceC9649o<File, ?>> f21493f;

    /* renamed from: r */
    private int f21494r;

    /* renamed from: s */
    private volatile InterfaceC9649o.a<?> f21495s;

    /* renamed from: t */
    private File f21496t;

    /* renamed from: u */
    private C8977x f21497u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8976w(C8960g<?> c8960g, InterfaceC8959f.a aVar) {
        this.f21489b = c8960g;
        this.f21488a = aVar;
    }

    /* renamed from: b */
    private boolean m26335b() {
        return this.f21494r < this.f21493f.size();
    }

    @Override // p171j3.InterfaceC8959f
    /* renamed from: a */
    public boolean mo26188a() {
        C6843b.m19774a("ResourceCacheGenerator.startNext");
        try {
            List<InterfaceC7622f> m26195c = this.f21489b.m26195c();
            boolean z10 = false;
            if (m26195c.isEmpty()) {
                return false;
            }
            List<Class<?>> m26205m = this.f21489b.m26205m();
            if (m26205m.isEmpty()) {
                if (File.class.equals(this.f21489b.m26210r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f21489b.m26201i() + " to " + this.f21489b.m26210r());
            }
            while (true) {
                if (this.f21493f != null && m26335b()) {
                    this.f21495s = null;
                    while (!z10 && m26335b()) {
                        List<InterfaceC9649o<File, ?>> list = this.f21493f;
                        int i10 = this.f21494r;
                        this.f21494r = i10 + 1;
                        this.f21495s = list.get(i10).mo28848b(this.f21496t, this.f21489b.m26212t(), this.f21489b.m26198f(), this.f21489b.m26203k());
                        if (this.f21495s != null && this.f21489b.m26213u(this.f21495s.f23683c.mo10760a())) {
                            this.f21495s.f23683c.mo10768e(this.f21489b.m26204l(), this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
                int i11 = this.f21491d + 1;
                this.f21491d = i11;
                if (i11 >= m26205m.size()) {
                    int i12 = this.f21490c + 1;
                    this.f21490c = i12;
                    if (i12 >= m26195c.size()) {
                        return false;
                    }
                    this.f21491d = 0;
                }
                InterfaceC7622f interfaceC7622f = m26195c.get(this.f21490c);
                Class<?> cls = m26205m.get(this.f21491d);
                this.f21497u = new C8977x(this.f21489b.m26194b(), interfaceC7622f, this.f21489b.m26208p(), this.f21489b.m26212t(), this.f21489b.m26198f(), this.f21489b.m26211s(cls), cls, this.f21489b.m26203k());
                File mo27893b = this.f21489b.m26196d().mo27893b(this.f21497u);
                this.f21496t = mo27893b;
                if (mo27893b != null) {
                    this.f21492e = interfaceC7622f;
                    this.f21493f = this.f21489b.m26202j(mo27893b);
                    this.f21494r = 0;
                }
            }
        } finally {
            C6843b.m19778e();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
    /* renamed from: c */
    public void mo10773c(Exception exc) {
        this.f21488a.mo26191i(this.f21497u, exc, this.f21495s.f23683c, EnumC7617a.RESOURCE_DISK_CACHE);
    }

    @Override // p171j3.InterfaceC8959f
    public void cancel() {
        InterfaceC9649o.a<?> aVar = this.f21495s;
        if (aVar != null) {
            aVar.f23683c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
    /* renamed from: f */
    public void mo10774f(Object obj) {
        this.f21488a.mo26190b(this.f21492e, obj, this.f21495s.f23683c, EnumC7617a.RESOURCE_DISK_CACHE, this.f21497u);
    }
}
