package r4;

import ck.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.k0;
import dk.q0;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import r4.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final a f24703m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Map<String, String> f24704n;

    /* renamed from: a, reason: collision with root package name */
    private final r4.a f24705a;

    /* renamed from: b, reason: collision with root package name */
    private final r4.a f24706b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.a f24707c;

    /* renamed from: d, reason: collision with root package name */
    private final r4.a f24708d;

    /* renamed from: e, reason: collision with root package name */
    private final r4.a f24709e;

    /* renamed from: f, reason: collision with root package name */
    private final r4.a f24710f;

    /* renamed from: g, reason: collision with root package name */
    private final r4.a f24711g;

    /* renamed from: h, reason: collision with root package name */
    private final r4.a f24712h;

    /* renamed from: i, reason: collision with root package name */
    private final r4.a f24713i;

    /* renamed from: j, reason: collision with root package name */
    private final r4.a f24714j;

    /* renamed from: k, reason: collision with root package name */
    private final r4.a f24715k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, r4.a> f24716l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final Map<String, r4.a> b(File file) {
            Map<String, r4.a> c10 = j.c(file);
            if (c10 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a10 = b.a();
            for (Map.Entry<String, r4.a> entry : c10.entrySet()) {
                String key = entry.getKey();
                if (a10.containsKey(entry.getKey()) && (key = (String) a10.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(key, entry.getValue());
            }
            return hashMap;
        }

        public final b a(File file) {
            n.e(file, "file");
            Map<String, r4.a> b10 = b(file);
            kotlin.jvm.internal.g gVar = null;
            if (b10 == null) {
                return null;
            }
            try {
                return new b(b10, gVar);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        HashMap j10;
        j10 = k0.j(r.a("embedding.weight", "embed.weight"), r.a("dense1.weight", "fc1.weight"), r.a("dense2.weight", "fc2.weight"), r.a("dense3.weight", "fc3.weight"), r.a("dense1.bias", "fc1.bias"), r.a("dense2.bias", "fc2.bias"), r.a("dense3.bias", "fc3.bias"));
        f24704n = j10;
    }

    private b(Map<String, r4.a> map) {
        Set<String> i10;
        r4.a aVar = map.get("embed.weight");
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24705a = aVar;
        i iVar = i.f24735a;
        r4.a aVar2 = map.get("convs.0.weight");
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24706b = i.l(aVar2);
        r4.a aVar3 = map.get("convs.1.weight");
        if (aVar3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24707c = i.l(aVar3);
        r4.a aVar4 = map.get("convs.2.weight");
        if (aVar4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24708d = i.l(aVar4);
        r4.a aVar5 = map.get("convs.0.bias");
        if (aVar5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24709e = aVar5;
        r4.a aVar6 = map.get("convs.1.bias");
        if (aVar6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24710f = aVar6;
        r4.a aVar7 = map.get("convs.2.bias");
        if (aVar7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24711g = aVar7;
        r4.a aVar8 = map.get("fc1.weight");
        if (aVar8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24712h = i.k(aVar8);
        r4.a aVar9 = map.get("fc2.weight");
        if (aVar9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24713i = i.k(aVar9);
        r4.a aVar10 = map.get("fc1.bias");
        if (aVar10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24714j = aVar10;
        r4.a aVar11 = map.get("fc2.bias");
        if (aVar11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f24715k = aVar11;
        this.f24716l = new HashMap();
        i10 = q0.i(f.a.MTML_INTEGRITY_DETECT.h(), f.a.MTML_APP_EVENT_PREDICTION.h());
        for (String str : i10) {
            String k10 = n.k(str, ".weight");
            String k11 = n.k(str, ".bias");
            r4.a aVar12 = map.get(k10);
            r4.a aVar13 = map.get(k11);
            if (aVar12 != null) {
                this.f24716l.put(k10, i.k(aVar12));
            }
            if (aVar13 != null) {
                this.f24716l.put(k11, aVar13);
            }
        }
    }

    public /* synthetic */ b(Map map, kotlin.jvm.internal.g gVar) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (a5.a.d(b.class)) {
            return null;
        }
        try {
            return f24704n;
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
            return null;
        }
    }

    public final r4.a b(r4.a dense, String[] texts, String task) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            n.e(dense, "dense");
            n.e(texts, "texts");
            n.e(task, "task");
            i iVar = i.f24735a;
            r4.a c10 = i.c(i.e(texts, RecognitionOptions.ITF, this.f24705a), this.f24706b);
            i.a(c10, this.f24709e);
            i.i(c10);
            r4.a c11 = i.c(c10, this.f24707c);
            i.a(c11, this.f24710f);
            i.i(c11);
            r4.a g10 = i.g(c11, 2);
            r4.a c12 = i.c(g10, this.f24708d);
            i.a(c12, this.f24711g);
            i.i(c12);
            r4.a g11 = i.g(c10, c10.b(1));
            r4.a g12 = i.g(g10, g10.b(1));
            r4.a g13 = i.g(c12, c12.b(1));
            i.f(g11, 1);
            i.f(g12, 1);
            i.f(g13, 1);
            r4.a d10 = i.d(i.b(new r4.a[]{g11, g12, g13, dense}), this.f24712h, this.f24714j);
            i.i(d10);
            r4.a d11 = i.d(d10, this.f24713i, this.f24715k);
            i.i(d11);
            r4.a aVar = this.f24716l.get(n.k(task, ".weight"));
            r4.a aVar2 = this.f24716l.get(n.k(task, ".bias"));
            if (aVar != null && aVar2 != null) {
                r4.a d12 = i.d(d11, aVar, aVar2);
                i.j(d12);
                return d12;
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }
}
