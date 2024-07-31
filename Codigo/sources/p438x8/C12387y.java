package p438x8;

import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: x8.y */
/* loaded from: classes.dex */
public class C12387y {

    /* renamed from: f */
    public static final List f33234f = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a */
    private final int f33235a;

    /* renamed from: b */
    private final int f33236b;

    /* renamed from: c */
    private final String f33237c;

    /* renamed from: d */
    private final List f33238d;

    /* renamed from: e */
    private final b f33239e;

    /* renamed from: x8.y$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f33240a = -1;

        /* renamed from: b */
        private int f33241b = -1;

        /* renamed from: c */
        private String f33242c = null;

        /* renamed from: d */
        private final List f33243d = new ArrayList();

        /* renamed from: e */
        private b f33244e = b.DEFAULT;

        /* renamed from: a */
        public C12387y m40040a() {
            return new C12387y(this.f33240a, this.f33241b, this.f33242c, this.f33243d, this.f33244e, null);
        }

        /* renamed from: b */
        public a m40041b(String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                zzcec.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                return this;
            }
            this.f33242c = str;
            return this;
        }

        /* renamed from: c */
        public a m40042c(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f33240a = i10;
            } else {
                zzcec.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
            }
            return this;
        }

        /* renamed from: d */
        public a m40043d(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f33241b = i10;
            } else {
                zzcec.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
            }
            return this;
        }

        /* renamed from: e */
        public a m40044e(List<String> list) {
            this.f33243d.clear();
            if (list != null) {
                this.f33243d.addAll(list);
            }
            return this;
        }
    }

    /* renamed from: x8.y$b */
    /* loaded from: classes.dex */
    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zzb;

        b(int i10) {
            this.zzb = i10;
        }

        /* renamed from: b */
        public int m40045b() {
            return this.zzb;
        }
    }

    /* synthetic */ C12387y(int i10, int i11, String str, List list, b bVar, C12372k0 c12372k0) {
        this.f33235a = i10;
        this.f33236b = i11;
        this.f33237c = str;
        this.f33238d = list;
        this.f33239e = bVar;
    }

    /* renamed from: a */
    public String m40034a() {
        String str = this.f33237c;
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public b m40035b() {
        return this.f33239e;
    }

    /* renamed from: c */
    public int m40036c() {
        return this.f33235a;
    }

    /* renamed from: d */
    public int m40037d() {
        return this.f33236b;
    }

    /* renamed from: e */
    public List<String> m40038e() {
        return new ArrayList(this.f33238d);
    }

    /* renamed from: f */
    public a m40039f() {
        a aVar = new a();
        aVar.m40042c(this.f33235a);
        aVar.m40043d(this.f33236b);
        aVar.m40041b(this.f33237c);
        aVar.m40044e(this.f33238d);
        return aVar;
    }
}
