package p271ob;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: ob.b */
/* loaded from: classes2.dex */
public final class C9830b {

    /* renamed from: a */
    private static final Logger f24271a = Logger.getLogger(C9830b.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f24272b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ob.b$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ALGORITHM_NOT_FIPS;
        public static final b ALGORITHM_REQUIRES_BORINGCRYPTO;

        /* renamed from: ob.b$b$a */
        /* loaded from: classes2.dex */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // p271ob.C9830b.b
            /* renamed from: b */
            public boolean mo29502b() {
                return !C9830b.m29501c();
            }
        }

        /* renamed from: ob.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C13228b extends b {
            C13228b(String str, int i10) {
                super(str, i10);
            }

            @Override // p271ob.C9830b.b
            /* renamed from: b */
            public boolean mo29502b() {
                return !C9830b.m29501c() || C9830b.m29500b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            ALGORITHM_NOT_FIPS = aVar;
            C13228b c13228b = new C13228b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            ALGORITHM_REQUIRES_BORINGCRYPTO = c13228b;
            $VALUES = new b[]{aVar, c13228b};
        }

        private b(String str, int i10) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        /* renamed from: b */
        public abstract boolean mo29502b();
    }

    private C9830b() {
    }

    /* renamed from: a */
    static Boolean m29499a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f24271a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m29500b() {
        return m29499a().booleanValue();
    }

    /* renamed from: c */
    public static boolean m29501c() {
        return C9829a.m29498a() || f24272b.get();
    }
}
