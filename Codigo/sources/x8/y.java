package x8;

import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class y {

    /* renamed from: f, reason: collision with root package name */
    public static final List f30714f = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f30715a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30716b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30717c;

    /* renamed from: d, reason: collision with root package name */
    private final List f30718d;

    /* renamed from: e, reason: collision with root package name */
    private final b f30719e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f30720a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f30721b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f30722c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f30723d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f30724e = b.DEFAULT;

        public y a() {
            return new y(this.f30720a, this.f30721b, this.f30722c, this.f30723d, this.f30724e, null);
        }

        public a b(String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                zzcec.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                return this;
            }
            this.f30722c = str;
            return this;
        }

        public a c(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f30720a = i10;
            } else {
                zzcec.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
            }
            return this;
        }

        public a d(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f30721b = i10;
            } else {
                zzcec.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
            }
            return this;
        }

        public a e(List<String> list) {
            this.f30723d.clear();
            if (list != null) {
                this.f30723d.addAll(list);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zzb;

        b(int i10) {
            this.zzb = i10;
        }

        public int b() {
            return this.zzb;
        }
    }

    /* synthetic */ y(int i10, int i11, String str, List list, b bVar, k0 k0Var) {
        this.f30715a = i10;
        this.f30716b = i11;
        this.f30717c = str;
        this.f30718d = list;
        this.f30719e = bVar;
    }

    public String a() {
        String str = this.f30717c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f30719e;
    }

    public int c() {
        return this.f30715a;
    }

    public int d() {
        return this.f30716b;
    }

    public List<String> e() {
        return new ArrayList(this.f30718d);
    }

    public a f() {
        a aVar = new a();
        aVar.c(this.f30715a);
        aVar.d(this.f30716b);
        aVar.b(this.f30717c);
        aVar.e(this.f30718d);
        return aVar;
    }
}
