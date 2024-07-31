package j3;

import com.bumptech.glide.load.data.d;
import j3.f;
import java.io.File;
import java.util.List;
import n3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final f.a f19709a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f19710b;

    /* renamed from: c, reason: collision with root package name */
    private int f19711c;

    /* renamed from: d, reason: collision with root package name */
    private int f19712d = -1;

    /* renamed from: e, reason: collision with root package name */
    private h3.f f19713e;

    /* renamed from: f, reason: collision with root package name */
    private List<n3.o<File, ?>> f19714f;

    /* renamed from: r, reason: collision with root package name */
    private int f19715r;

    /* renamed from: s, reason: collision with root package name */
    private volatile o.a<?> f19716s;

    /* renamed from: t, reason: collision with root package name */
    private File f19717t;

    /* renamed from: u, reason: collision with root package name */
    private x f19718u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(g<?> gVar, f.a aVar) {
        this.f19710b = gVar;
        this.f19709a = aVar;
    }

    private boolean b() {
        return this.f19715r < this.f19714f.size();
    }

    @Override // j3.f
    public boolean a() {
        d4.b.a("ResourceCacheGenerator.startNext");
        try {
            List<h3.f> c10 = this.f19710b.c();
            boolean z10 = false;
            if (c10.isEmpty()) {
                return false;
            }
            List<Class<?>> m10 = this.f19710b.m();
            if (m10.isEmpty()) {
                if (File.class.equals(this.f19710b.r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f19710b.i() + " to " + this.f19710b.r());
            }
            while (true) {
                if (this.f19714f != null && b()) {
                    this.f19716s = null;
                    while (!z10 && b()) {
                        List<n3.o<File, ?>> list = this.f19714f;
                        int i10 = this.f19715r;
                        this.f19715r = i10 + 1;
                        this.f19716s = list.get(i10).b(this.f19717t, this.f19710b.t(), this.f19710b.f(), this.f19710b.k());
                        if (this.f19716s != null && this.f19710b.u(this.f19716s.f21750c.a())) {
                            this.f19716s.f21750c.e(this.f19710b.l(), this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
                int i11 = this.f19712d + 1;
                this.f19712d = i11;
                if (i11 >= m10.size()) {
                    int i12 = this.f19711c + 1;
                    this.f19711c = i12;
                    if (i12 >= c10.size()) {
                        return false;
                    }
                    this.f19712d = 0;
                }
                h3.f fVar = c10.get(this.f19711c);
                Class<?> cls = m10.get(this.f19712d);
                this.f19718u = new x(this.f19710b.b(), fVar, this.f19710b.p(), this.f19710b.t(), this.f19710b.f(), this.f19710b.s(cls), cls, this.f19710b.k());
                File b10 = this.f19710b.d().b(this.f19718u);
                this.f19717t = b10;
                if (b10 != null) {
                    this.f19713e = fVar;
                    this.f19714f = this.f19710b.j(b10);
                    this.f19715r = 0;
                }
            }
        } finally {
            d4.b.e();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f19709a.i(this.f19718u, exc, this.f19716s.f21750c, h3.a.RESOURCE_DISK_CACHE);
    }

    @Override // j3.f
    public void cancel() {
        o.a<?> aVar = this.f19716s;
        if (aVar != null) {
            aVar.f21750c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f19709a.b(this.f19713e, obj, this.f19716s.f21750c, h3.a.RESOURCE_DISK_CACHE, this.f19718u);
    }
}
