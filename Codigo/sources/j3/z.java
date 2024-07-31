package j3;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import j3.f;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import n3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z implements f, f.a {

    /* renamed from: a, reason: collision with root package name */
    private final g<?> f19730a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f19731b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f19732c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f19733d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f19734e;

    /* renamed from: f, reason: collision with root package name */
    private volatile o.a<?> f19735f;

    /* renamed from: r, reason: collision with root package name */
    private volatile d f19736r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.a f19737a;

        a(o.a aVar) {
            this.f19737a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.e(this.f19737a)) {
                z.this.g(this.f19737a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.e(this.f19737a)) {
                z.this.f(this.f19737a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(g<?> gVar, f.a aVar) {
        this.f19730a = gVar;
        this.f19731b = aVar;
    }

    private boolean c(Object obj) {
        long b10 = c4.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e<T> o10 = this.f19730a.o(obj);
            Object a10 = o10.a();
            h3.d<X> q10 = this.f19730a.q(a10);
            e eVar = new e(q10, a10, this.f19730a.k());
            d dVar = new d(this.f19735f.f21748a, this.f19730a.p());
            l3.a d10 = this.f19730a.d();
            d10.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + q10 + ", duration: " + c4.g.a(b10));
            }
            if (d10.b(dVar) != null) {
                this.f19736r = dVar;
                this.f19733d = new c(Collections.singletonList(this.f19735f.f21748a), this.f19730a, this);
                this.f19735f.f21750c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f19736r + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f19731b.b(this.f19735f.f21748a, o10.a(), this.f19735f.f21750c, this.f19735f.f21750c.d(), this.f19735f.f21748a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f19735f.f21750c.b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean d() {
        return this.f19732c < this.f19730a.g().size();
    }

    private void h(o.a<?> aVar) {
        this.f19735f.f21750c.e(this.f19730a.l(), new a(aVar));
    }

    @Override // j3.f
    public boolean a() {
        if (this.f19734e != null) {
            Object obj = this.f19734e;
            this.f19734e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f19733d != null && this.f19733d.a()) {
            return true;
        }
        this.f19733d = null;
        this.f19735f = null;
        boolean z10 = false;
        while (!z10 && d()) {
            List<o.a<?>> g10 = this.f19730a.g();
            int i10 = this.f19732c;
            this.f19732c = i10 + 1;
            this.f19735f = g10.get(i10);
            if (this.f19735f != null && (this.f19730a.e().c(this.f19735f.f21750c.d()) || this.f19730a.u(this.f19735f.f21750c.a()))) {
                h(this.f19735f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // j3.f.a
    public void b(h3.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, h3.a aVar, h3.f fVar2) {
        this.f19731b.b(fVar, obj, dVar, this.f19735f.f21750c.d(), fVar);
    }

    @Override // j3.f
    public void cancel() {
        o.a<?> aVar = this.f19735f;
        if (aVar != null) {
            aVar.f21750c.cancel();
        }
    }

    boolean e(o.a<?> aVar) {
        o.a<?> aVar2 = this.f19735f;
        return aVar2 != null && aVar2 == aVar;
    }

    void f(o.a<?> aVar, Object obj) {
        j e10 = this.f19730a.e();
        if (obj != null && e10.c(aVar.f21750c.d())) {
            this.f19734e = obj;
            this.f19731b.l();
        } else {
            f.a aVar2 = this.f19731b;
            h3.f fVar = aVar.f21748a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f21750c;
            aVar2.b(fVar, obj, dVar, dVar.d(), this.f19736r);
        }
    }

    void g(o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f19731b;
        d dVar = this.f19736r;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f21750c;
        aVar2.i(dVar, exc, dVar2, dVar2.d());
    }

    @Override // j3.f.a
    public void i(h3.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, h3.a aVar) {
        this.f19731b.i(fVar, exc, dVar, this.f19735f.f21750c.d());
    }

    @Override // j3.f.a
    public void l() {
        throw new UnsupportedOperationException();
    }
}
