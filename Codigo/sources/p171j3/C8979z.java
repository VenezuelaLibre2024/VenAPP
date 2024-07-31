package p171j3;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC2133d;
import com.bumptech.glide.load.data.InterfaceC2134e;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p036c4.C1866g;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7620d;
import p129h3.InterfaceC7622f;
import p171j3.InterfaceC8959f;
import p212l3.InterfaceC9375a;
import p246n3.InterfaceC9649o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j3.z */
/* loaded from: classes.dex */
public class C8979z implements InterfaceC8959f, InterfaceC8959f.a {

    /* renamed from: a */
    private final C8960g<?> f21509a;

    /* renamed from: b */
    private final InterfaceC8959f.a f21510b;

    /* renamed from: c */
    private volatile int f21511c;

    /* renamed from: d */
    private volatile C8956c f21512d;

    /* renamed from: e */
    private volatile Object f21513e;

    /* renamed from: f */
    private volatile InterfaceC9649o.a<?> f21514f;

    /* renamed from: r */
    private volatile C8957d f21515r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.z$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2133d.a<Object> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9649o.a f21516a;

        a(InterfaceC9649o.a aVar) {
            this.f21516a = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
        /* renamed from: c */
        public void mo10773c(Exception exc) {
            if (C8979z.this.m26341e(this.f21516a)) {
                C8979z.this.m26343g(this.f21516a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
        /* renamed from: f */
        public void mo10774f(Object obj) {
            if (C8979z.this.m26341e(this.f21516a)) {
                C8979z.this.m26342f(this.f21516a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8979z(C8960g<?> c8960g, InterfaceC8959f.a aVar) {
        this.f21509a = c8960g;
        this.f21510b = aVar;
    }

    /* renamed from: c */
    private boolean m26338c(Object obj) {
        long m9934b = C1866g.m9934b();
        boolean z10 = false;
        try {
            InterfaceC2134e<T> m26207o = this.f21509a.m26207o(obj);
            Object mo10754a = m26207o.mo10754a();
            InterfaceC7620d<X> m26209q = this.f21509a.m26209q(mo10754a);
            C8958e c8958e = new C8958e(m26209q, mo10754a, this.f21509a.m26203k());
            C8957d c8957d = new C8957d(this.f21514f.f23681a, this.f21509a.m26208p());
            InterfaceC9375a m26196d = this.f21509a.m26196d();
            m26196d.mo27892a(c8957d, c8958e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c8957d + ", data: " + obj + ", encoder: " + m26209q + ", duration: " + C1866g.m9933a(m9934b));
            }
            if (m26196d.mo27893b(c8957d) != null) {
                this.f21515r = c8957d;
                this.f21512d = new C8956c(Collections.singletonList(this.f21514f.f23681a), this.f21509a, this);
                this.f21514f.f23683c.mo10765b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f21515r + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f21510b.mo26190b(this.f21514f.f23681a, m26207o.mo10754a(), this.f21514f.f23683c, this.f21514f.f23683c.mo10767d(), this.f21514f.f23681a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f21514f.f23683c.mo10765b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: d */
    private boolean m26339d() {
        return this.f21511c < this.f21509a.m26199g().size();
    }

    /* renamed from: h */
    private void m26340h(InterfaceC9649o.a<?> aVar) {
        this.f21514f.f23683c.mo10768e(this.f21509a.m26204l(), new a(aVar));
    }

    @Override // p171j3.InterfaceC8959f
    /* renamed from: a */
    public boolean mo26188a() {
        if (this.f21513e != null) {
            Object obj = this.f21513e;
            this.f21513e = null;
            try {
                if (!m26338c(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f21512d != null && this.f21512d.mo26188a()) {
            return true;
        }
        this.f21512d = null;
        this.f21514f = null;
        boolean z10 = false;
        while (!z10 && m26339d()) {
            List<InterfaceC9649o.a<?>> m26199g = this.f21509a.m26199g();
            int i10 = this.f21511c;
            this.f21511c = i10 + 1;
            this.f21514f = m26199g.get(i10);
            if (this.f21514f != null && (this.f21509a.m26197e().mo26263c(this.f21514f.f23683c.mo10767d()) || this.f21509a.m26213u(this.f21514f.f23683c.mo10760a()))) {
                m26340h(this.f21514f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p171j3.InterfaceC8959f.a
    /* renamed from: b */
    public void mo26190b(InterfaceC7622f interfaceC7622f, Object obj, InterfaceC2133d<?> interfaceC2133d, EnumC7617a enumC7617a, InterfaceC7622f interfaceC7622f2) {
        this.f21510b.mo26190b(interfaceC7622f, obj, interfaceC2133d, this.f21514f.f23683c.mo10767d(), interfaceC7622f);
    }

    @Override // p171j3.InterfaceC8959f
    public void cancel() {
        InterfaceC9649o.a<?> aVar = this.f21514f;
        if (aVar != null) {
            aVar.f23683c.cancel();
        }
    }

    /* renamed from: e */
    boolean m26341e(InterfaceC9649o.a<?> aVar) {
        InterfaceC9649o.a<?> aVar2 = this.f21514f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: f */
    void m26342f(InterfaceC9649o.a<?> aVar, Object obj) {
        AbstractC8963j m26197e = this.f21509a.m26197e();
        if (obj != null && m26197e.mo26263c(aVar.f23683c.mo10767d())) {
            this.f21513e = obj;
            this.f21510b.mo26192l();
        } else {
            InterfaceC8959f.a aVar2 = this.f21510b;
            InterfaceC7622f interfaceC7622f = aVar.f23681a;
            InterfaceC2133d<?> interfaceC2133d = aVar.f23683c;
            aVar2.mo26190b(interfaceC7622f, obj, interfaceC2133d, interfaceC2133d.mo10767d(), this.f21515r);
        }
    }

    /* renamed from: g */
    void m26343g(InterfaceC9649o.a<?> aVar, Exception exc) {
        InterfaceC8959f.a aVar2 = this.f21510b;
        C8957d c8957d = this.f21515r;
        InterfaceC2133d<?> interfaceC2133d = aVar.f23683c;
        aVar2.mo26191i(c8957d, exc, interfaceC2133d, interfaceC2133d.mo10767d());
    }

    @Override // p171j3.InterfaceC8959f.a
    /* renamed from: i */
    public void mo26191i(InterfaceC7622f interfaceC7622f, Exception exc, InterfaceC2133d<?> interfaceC2133d, EnumC7617a enumC7617a) {
        this.f21510b.mo26191i(interfaceC7622f, exc, interfaceC2133d, this.f21514f.f23683c.mo10767d());
    }

    @Override // p171j3.InterfaceC8959f.a
    /* renamed from: l */
    public void mo26192l() {
        throw new UnsupportedOperationException();
    }
}
