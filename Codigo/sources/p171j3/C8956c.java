package p171j3;

import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.File;
import java.util.List;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7622f;
import p171j3.InterfaceC8959f;
import p246n3.InterfaceC9649o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j3.c */
/* loaded from: classes.dex */
public class C8956c implements InterfaceC8959f, InterfaceC2133d.a<Object> {

    /* renamed from: a */
    private final List<InterfaceC7622f> f21308a;

    /* renamed from: b */
    private final C8960g<?> f21309b;

    /* renamed from: c */
    private final InterfaceC8959f.a f21310c;

    /* renamed from: d */
    private int f21311d;

    /* renamed from: e */
    private InterfaceC7622f f21312e;

    /* renamed from: f */
    private List<InterfaceC9649o<File, ?>> f21313f;

    /* renamed from: r */
    private int f21314r;

    /* renamed from: s */
    private volatile InterfaceC9649o.a<?> f21315s;

    /* renamed from: t */
    private File f21316t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8956c(C8960g<?> c8960g, InterfaceC8959f.a aVar) {
        this(c8960g.m26195c(), c8960g, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8956c(List<InterfaceC7622f> list, C8960g<?> c8960g, InterfaceC8959f.a aVar) {
        this.f21311d = -1;
        this.f21308a = list;
        this.f21309b = c8960g;
        this.f21310c = aVar;
    }

    /* renamed from: b */
    private boolean m26187b() {
        return this.f21314r < this.f21313f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (m26187b() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f21313f;
        r3 = r7.f21314r;
        r7.f21314r = r3 + 1;
        r7.f21315s = r0.get(r3).mo28848b(r7.f21316t, r7.f21309b.m26212t(), r7.f21309b.m26198f(), r7.f21309b.m26203k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f21315s == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f21309b.m26213u(r7.f21315s.f23683c.mo10760a()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f21315s.f23683c.mo10768e(r7.f21309b.m26204l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f21315s = null;
     */
    @Override // p171j3.InterfaceC8959f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo26188a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p055d4.C6843b.m19774a(r0)
        L5:
            java.util.List<n3.o<java.io.File, ?>> r0 = r7.f21313f     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r7.m26187b()     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L12
            goto L6c
        L12:
            r0 = 0
            r7.f21315s = r0     // Catch: java.lang.Throwable -> Lae
        L15:
            if (r1 != 0) goto L68
            boolean r0 = r7.m26187b()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L68
            java.util.List<n3.o<java.io.File, ?>> r0 = r7.f21313f     // Catch: java.lang.Throwable -> Lae
            int r3 = r7.f21314r     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 + 1
            r7.f21314r = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            n3.o r0 = (p246n3.InterfaceC9649o) r0     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = r7.f21316t     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r4 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.m26212t()     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r5 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.m26198f()     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r6 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            h3.h r6 = r6.m26203k()     // Catch: java.lang.Throwable -> Lae
            n3.o$a r0 = r0.mo28848b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            r7.f21315s = r0     // Catch: java.lang.Throwable -> Lae
            n3.o$a<?> r0 = r7.f21315s     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            j3.g<?> r0 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            n3.o$a<?> r3 = r7.f21315s     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d<Data> r3 = r3.f23683c     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r3 = r3.mo10760a()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.m26213u(r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            n3.o$a<?> r0 = r7.f21315s     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d<Data> r0 = r0.f23683c     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r1 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.g r1 = r1.m26204l()     // Catch: java.lang.Throwable -> Lae
            r0.mo10768e(r1, r7)     // Catch: java.lang.Throwable -> Lae
            r1 = r2
            goto L15
        L68:
            p055d4.C6843b.m19778e()
            return r1
        L6c:
            int r0 = r7.f21311d     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 + r2
            r7.f21311d = r0     // Catch: java.lang.Throwable -> Lae
            java.util.List<h3.f> r2 = r7.f21308a     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            if (r0 < r2) goto L7d
            p055d4.C6843b.m19778e()
            return r1
        L7d:
            java.util.List<h3.f> r0 = r7.f21308a     // Catch: java.lang.Throwable -> Lae
            int r2 = r7.f21311d     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            h3.f r0 = (p129h3.InterfaceC7622f) r0     // Catch: java.lang.Throwable -> Lae
            j3.d r2 = new j3.d     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r3 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            h3.f r3 = r3.m26208p()     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r3 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            l3.a r3 = r3.m26196d()     // Catch: java.lang.Throwable -> Lae
            java.io.File r2 = r3.mo27893b(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f21316t = r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L5
            r7.f21312e = r0     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r0 = r7.f21309b     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.m26202j(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f21313f = r0     // Catch: java.lang.Throwable -> Lae
            r7.f21314r = r1     // Catch: java.lang.Throwable -> Lae
            goto L5
        Lae:
            r0 = move-exception
            p055d4.C6843b.m19778e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p171j3.C8956c.mo26188a():boolean");
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
    /* renamed from: c */
    public void mo10773c(Exception exc) {
        this.f21310c.mo26191i(this.f21312e, exc, this.f21315s.f23683c, EnumC7617a.DATA_DISK_CACHE);
    }

    @Override // p171j3.InterfaceC8959f
    public void cancel() {
        InterfaceC9649o.a<?> aVar = this.f21315s;
        if (aVar != null) {
            aVar.f23683c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
    /* renamed from: f */
    public void mo10774f(Object obj) {
        this.f21310c.mo26190b(this.f21312e, obj, this.f21315s.f23683c, EnumC7617a.DATA_DISK_CACHE, this.f21312e);
    }
}
