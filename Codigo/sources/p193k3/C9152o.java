package p193k3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p036c4.C1871l;

/* renamed from: k3.o */
/* loaded from: classes.dex */
public class C9152o implements InterfaceC9149l {

    /* renamed from: d */
    private static final Bitmap.Config[] f22092d;

    /* renamed from: e */
    private static final Bitmap.Config[] f22093e;

    /* renamed from: f */
    private static final Bitmap.Config[] f22094f;

    /* renamed from: g */
    private static final Bitmap.Config[] f22095g;

    /* renamed from: h */
    private static final Bitmap.Config[] f22096h;

    /* renamed from: a */
    private final c f22097a = new c();

    /* renamed from: b */
    private final C9144g<b, Bitmap> f22098b = new C9144g<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f22099c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.o$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22100a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f22100a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22100a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22100a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22100a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.o$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC9150m {

        /* renamed from: a */
        private final c f22101a;

        /* renamed from: b */
        int f22102b;

        /* renamed from: c */
        private Bitmap.Config f22103c;

        public b(c cVar) {
            this.f22101a = cVar;
        }

        @Override // p193k3.InterfaceC9150m
        /* renamed from: a */
        public void mo26978a() {
            this.f22101a.m26947c(this);
        }

        /* renamed from: b */
        public void m27008b(int i10, Bitmap.Config config) {
            this.f22102b = i10;
            this.f22103c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22102b == bVar.f22102b && C1871l.m9955d(this.f22103c, bVar.f22103c);
        }

        public int hashCode() {
            int i10 = this.f22102b * 31;
            Bitmap.Config config = this.f22103c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C9152o.m27005h(this.f22102b, this.f22103c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.o$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC9140c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p193k3.AbstractC9140c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo26945a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m27010e(int i10, Bitmap.Config config) {
            b m26946b = m26946b();
            m26946b.m27008b(i10, config);
            return m26946b;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f22092d = configArr;
        f22093e = configArr;
        f22094f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f22095g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f22096h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: f */
    private void m27003f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m27007j = m27007j(bitmap.getConfig());
        Integer num2 = m27007j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m27007j.remove(num);
                return;
            } else {
                m27007j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo26997a(bitmap) + ", this: " + this);
    }

    /* renamed from: g */
    private b m27004g(int i10, Bitmap.Config config) {
        b m27010e = this.f22097a.m27010e(i10, config);
        for (Bitmap.Config config2 : m27006i(config)) {
            Integer ceilingKey = m27007j(config2).ceilingKey(Integer.valueOf(i10));
            if (ceilingKey != null && ceilingKey.intValue() <= i10 * 8) {
                if (ceilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return m27010e;
                        }
                    } else if (config2.equals(config)) {
                        return m27010e;
                    }
                }
                this.f22097a.m26947c(m27010e);
                return this.f22097a.m27010e(ceilingKey.intValue(), config2);
            }
        }
        return m27010e;
    }

    /* renamed from: h */
    static String m27005h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m27006i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f22093e;
            }
        }
        int i10 = a.f22100a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f22096h : f22095g : f22094f : f22092d;
    }

    /* renamed from: j */
    private NavigableMap<Integer, Integer> m27007j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f22099c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f22099c.put(config, treeMap);
        return treeMap;
    }

    @Override // p193k3.InterfaceC9149l
    /* renamed from: a */
    public String mo26997a(Bitmap bitmap) {
        return m27005h(C1871l.m9959h(bitmap), bitmap.getConfig());
    }

    @Override // p193k3.InterfaceC9149l
    /* renamed from: b */
    public String mo26998b(int i10, int i11, Bitmap.Config config) {
        return m27005h(C1871l.m9958g(i10, i11, config), config);
    }

    @Override // p193k3.InterfaceC9149l
    /* renamed from: c */
    public void mo26999c(Bitmap bitmap) {
        b m27010e = this.f22097a.m27010e(C1871l.m9959h(bitmap), bitmap.getConfig());
        this.f22098b.m26960d(m27010e, bitmap);
        NavigableMap<Integer, Integer> m27007j = m27007j(bitmap.getConfig());
        Integer num = m27007j.get(Integer.valueOf(m27010e.f22102b));
        m27007j.put(Integer.valueOf(m27010e.f22102b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p193k3.InterfaceC9149l
    /* renamed from: d */
    public Bitmap mo27000d(int i10, int i11, Bitmap.Config config) {
        b m27004g = m27004g(C1871l.m9958g(i10, i11, config), config);
        Bitmap m26959a = this.f22098b.m26959a(m27004g);
        if (m26959a != null) {
            m27003f(Integer.valueOf(m27004g.f22102b), m26959a);
            m26959a.reconfigure(i10, i11, config);
        }
        return m26959a;
    }

    @Override // p193k3.InterfaceC9149l
    /* renamed from: e */
    public int mo27001e(Bitmap bitmap) {
        return C1871l.m9959h(bitmap);
    }

    @Override // p193k3.InterfaceC9149l
    public Bitmap removeLast() {
        Bitmap m26961f = this.f22098b.m26961f();
        if (m26961f != null) {
            m27003f(Integer.valueOf(C1871l.m9959h(m26961f)), m26961f);
        }
        return m26961f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f22098b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f22099c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f22099c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
