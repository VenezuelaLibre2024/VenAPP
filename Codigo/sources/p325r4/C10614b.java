package p325r4;

import ck.C2033r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7018k0;
import dk.C7030q0;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p325r4.C10618f;

/* renamed from: r4.b */
/* loaded from: classes.dex */
public final class C10614b {

    /* renamed from: m */
    public static final a f26817m = new a(null);

    /* renamed from: n */
    private static final Map<String, String> f26818n;

    /* renamed from: a */
    private final C10613a f26819a;

    /* renamed from: b */
    private final C10613a f26820b;

    /* renamed from: c */
    private final C10613a f26821c;

    /* renamed from: d */
    private final C10613a f26822d;

    /* renamed from: e */
    private final C10613a f26823e;

    /* renamed from: f */
    private final C10613a f26824f;

    /* renamed from: g */
    private final C10613a f26825g;

    /* renamed from: h */
    private final C10613a f26826h;

    /* renamed from: i */
    private final C10613a f26827i;

    /* renamed from: j */
    private final C10613a f26828j;

    /* renamed from: k */
    private final C10613a f26829k;

    /* renamed from: l */
    private final Map<String, C10613a> f26830l;

    /* renamed from: r4.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: b */
        private final Map<String, C10613a> m32319b(File file) {
            Map<String, C10613a> m32375c = C10622j.m32375c(file);
            if (m32375c == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map m32317a = C10614b.m32317a();
            for (Map.Entry<String, C10613a> entry : m32375c.entrySet()) {
                String key = entry.getKey();
                if (m32317a.containsKey(entry.getKey()) && (key = (String) m32317a.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(key, entry.getValue());
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C10614b m32320a(File file) {
            C9322n.m27781e(file, "file");
            Map<String, C10613a> m32319b = m32319b(file);
            C9315g c9315g = null;
            if (m32319b == null) {
                return null;
            }
            try {
                return new C10614b(m32319b, c9315g);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        HashMap m20423j;
        m20423j = C7018k0.m20423j(C2033r.m10353a("embedding.weight", "embed.weight"), C2033r.m10353a("dense1.weight", "fc1.weight"), C2033r.m10353a("dense2.weight", "fc2.weight"), C2033r.m10353a("dense3.weight", "fc3.weight"), C2033r.m10353a("dense1.bias", "fc1.bias"), C2033r.m10353a("dense2.bias", "fc2.bias"), C2033r.m10353a("dense3.bias", "fc3.bias"));
        f26818n = m20423j;
    }

    private C10614b(Map<String, C10613a> map) {
        Set<String> m20577i;
        C10613a c10613a = map.get("embed.weight");
        if (c10613a == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26819a = c10613a;
        C10621i c10621i = C10621i.f26849a;
        C10613a c10613a2 = map.get("convs.0.weight");
        if (c10613a2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26820b = C10621i.m32373l(c10613a2);
        C10613a c10613a3 = map.get("convs.1.weight");
        if (c10613a3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26821c = C10621i.m32373l(c10613a3);
        C10613a c10613a4 = map.get("convs.2.weight");
        if (c10613a4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26822d = C10621i.m32373l(c10613a4);
        C10613a c10613a5 = map.get("convs.0.bias");
        if (c10613a5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26823e = c10613a5;
        C10613a c10613a6 = map.get("convs.1.bias");
        if (c10613a6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26824f = c10613a6;
        C10613a c10613a7 = map.get("convs.2.bias");
        if (c10613a7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26825g = c10613a7;
        C10613a c10613a8 = map.get("fc1.weight");
        if (c10613a8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26826h = C10621i.m32372k(c10613a8);
        C10613a c10613a9 = map.get("fc2.weight");
        if (c10613a9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26827i = C10621i.m32372k(c10613a9);
        C10613a c10613a10 = map.get("fc1.bias");
        if (c10613a10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26828j = c10613a10;
        C10613a c10613a11 = map.get("fc2.bias");
        if (c10613a11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f26829k = c10613a11;
        this.f26830l = new HashMap();
        m20577i = C7030q0.m20577i(C10618f.a.MTML_INTEGRITY_DETECT.m32341h(), C10618f.a.MTML_APP_EVENT_PREDICTION.m32341h());
        for (String str : m20577i) {
            String m27787k = C9322n.m27787k(str, ".weight");
            String m27787k2 = C9322n.m27787k(str, ".bias");
            C10613a c10613a12 = map.get(m27787k);
            C10613a c10613a13 = map.get(m27787k2);
            if (c10613a12 != null) {
                this.f26830l.put(m27787k, C10621i.m32372k(c10613a12));
            }
            if (c10613a13 != null) {
                this.f26830l.put(m27787k2, c10613a13);
            }
        }
    }

    public /* synthetic */ C10614b(Map map, C9315g c9315g) {
        this(map);
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m32317a() {
        if (C0033a.m107d(C10614b.class)) {
            return null;
        }
        try {
            return f26818n;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10614b.class);
            return null;
        }
    }

    /* renamed from: b */
    public final C10613a m32318b(C10613a dense, String[] texts, String task) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            C9322n.m27781e(dense, "dense");
            C9322n.m27781e(texts, "texts");
            C9322n.m27781e(task, "task");
            C10621i c10621i = C10621i.f26849a;
            C10613a m32364c = C10621i.m32364c(C10621i.m32366e(texts, RecognitionOptions.ITF, this.f26819a), this.f26820b);
            C10621i.m32362a(m32364c, this.f26823e);
            C10621i.m32370i(m32364c);
            C10613a m32364c2 = C10621i.m32364c(m32364c, this.f26821c);
            C10621i.m32362a(m32364c2, this.f26824f);
            C10621i.m32370i(m32364c2);
            C10613a m32368g = C10621i.m32368g(m32364c2, 2);
            C10613a m32364c3 = C10621i.m32364c(m32368g, this.f26822d);
            C10621i.m32362a(m32364c3, this.f26825g);
            C10621i.m32370i(m32364c3);
            C10613a m32368g2 = C10621i.m32368g(m32364c, m32364c.m32312b(1));
            C10613a m32368g3 = C10621i.m32368g(m32368g, m32368g.m32312b(1));
            C10613a m32368g4 = C10621i.m32368g(m32364c3, m32364c3.m32312b(1));
            C10621i.m32367f(m32368g2, 1);
            C10621i.m32367f(m32368g3, 1);
            C10621i.m32367f(m32368g4, 1);
            C10613a m32365d = C10621i.m32365d(C10621i.m32363b(new C10613a[]{m32368g2, m32368g3, m32368g4, dense}), this.f26826h, this.f26828j);
            C10621i.m32370i(m32365d);
            C10613a m32365d2 = C10621i.m32365d(m32365d, this.f26827i, this.f26829k);
            C10621i.m32370i(m32365d2);
            C10613a c10613a = this.f26830l.get(C9322n.m27787k(task, ".weight"));
            C10613a c10613a2 = this.f26830l.get(C9322n.m27787k(task, ".bias"));
            if (c10613a != null && c10613a2 != null) {
                C10613a m32365d3 = C10621i.m32365d(m32365d2, c10613a, c10613a2);
                C10621i.m32371j(m32365d3);
                return m32365d3;
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
