package j3;

import com.bumptech.glide.load.data.d;
import j3.f;
import java.io.File;
import java.util.List;
import n3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final List<h3.f> f19557a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f19558b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f19559c;

    /* renamed from: d, reason: collision with root package name */
    private int f19560d;

    /* renamed from: e, reason: collision with root package name */
    private h3.f f19561e;

    /* renamed from: f, reason: collision with root package name */
    private List<n3.o<File, ?>> f19562f;

    /* renamed from: r, reason: collision with root package name */
    private int f19563r;

    /* renamed from: s, reason: collision with root package name */
    private volatile o.a<?> f19564s;

    /* renamed from: t, reason: collision with root package name */
    private File f19565t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<h3.f> list, g<?> gVar, f.a aVar) {
        this.f19560d = -1;
        this.f19557a = list;
        this.f19558b = gVar;
        this.f19559c = aVar;
    }

    private boolean b() {
        return this.f19563r < this.f19562f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (b() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f19562f;
        r3 = r7.f19563r;
        r7.f19563r = r3 + 1;
        r7.f19564s = r0.get(r3).b(r7.f19565t, r7.f19558b.t(), r7.f19558b.f(), r7.f19558b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f19564s == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f19558b.u(r7.f19564s.f21750c.a()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f19564s.f21750c.e(r7.f19558b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f19564s = null;
     */
    @Override // j3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            d4.b.a(r0)
        L5:
            java.util.List<n3.o<java.io.File, ?>> r0 = r7.f19562f     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L12
            goto L6c
        L12:
            r0 = 0
            r7.f19564s = r0     // Catch: java.lang.Throwable -> Lae
        L15:
            if (r1 != 0) goto L68
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L68
            java.util.List<n3.o<java.io.File, ?>> r0 = r7.f19562f     // Catch: java.lang.Throwable -> Lae
            int r3 = r7.f19563r     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 + 1
            r7.f19563r = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            n3.o r0 = (n3.o) r0     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = r7.f19565t     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r4 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.t()     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r5 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.f()     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r6 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            h3.h r6 = r6.k()     // Catch: java.lang.Throwable -> Lae
            n3.o$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            r7.f19564s = r0     // Catch: java.lang.Throwable -> Lae
            n3.o$a<?> r0 = r7.f19564s     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            j3.g<?> r0 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            n3.o$a<?> r3 = r7.f19564s     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d<Data> r3 = r3.f21750c     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            n3.o$a<?> r0 = r7.f19564s     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21750c     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r1 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.g r1 = r1.l()     // Catch: java.lang.Throwable -> Lae
            r0.e(r1, r7)     // Catch: java.lang.Throwable -> Lae
            r1 = r2
            goto L15
        L68:
            d4.b.e()
            return r1
        L6c:
            int r0 = r7.f19560d     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 + r2
            r7.f19560d = r0     // Catch: java.lang.Throwable -> Lae
            java.util.List<h3.f> r2 = r7.f19557a     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            if (r0 < r2) goto L7d
            d4.b.e()
            return r1
        L7d:
            java.util.List<h3.f> r0 = r7.f19557a     // Catch: java.lang.Throwable -> Lae
            int r2 = r7.f19560d     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            h3.f r0 = (h3.f) r0     // Catch: java.lang.Throwable -> Lae
            j3.d r2 = new j3.d     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r3 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            h3.f r3 = r3.p()     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r3 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            l3.a r3 = r3.d()     // Catch: java.lang.Throwable -> Lae
            java.io.File r2 = r3.b(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f19565t = r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L5
            r7.f19561e = r0     // Catch: java.lang.Throwable -> Lae
            j3.g<?> r0 = r7.f19558b     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.j(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f19562f = r0     // Catch: java.lang.Throwable -> Lae
            r7.f19563r = r1     // Catch: java.lang.Throwable -> Lae
            goto L5
        Lae:
            r0 = move-exception
            d4.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.a():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f19559c.i(this.f19561e, exc, this.f19564s.f21750c, h3.a.DATA_DISK_CACHE);
    }

    @Override // j3.f
    public void cancel() {
        o.a<?> aVar = this.f19564s;
        if (aVar != null) {
            aVar.f21750c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f19559c.b(this.f19561e, obj, this.f19564s.f21750c, h3.a.DATA_DISK_CACHE, this.f19561e);
    }
}
