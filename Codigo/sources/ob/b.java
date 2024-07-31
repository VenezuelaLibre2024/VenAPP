package ob;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f22338a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f22339b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ob.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class EnumC0370b {
        private static final /* synthetic */ EnumC0370b[] $VALUES;
        public static final EnumC0370b ALGORITHM_NOT_FIPS;
        public static final EnumC0370b ALGORITHM_REQUIRES_BORINGCRYPTO;

        /* renamed from: ob.b$b$a */
        /* loaded from: classes2.dex */
        enum a extends EnumC0370b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // ob.b.EnumC0370b
            public boolean b() {
                return !b.c();
            }
        }

        /* renamed from: ob.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C0371b extends EnumC0370b {
            C0371b(String str, int i10) {
                super(str, i10);
            }

            @Override // ob.b.EnumC0370b
            public boolean b() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            ALGORITHM_NOT_FIPS = aVar;
            C0371b c0371b = new C0371b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            ALGORITHM_REQUIRES_BORINGCRYPTO = c0371b;
            $VALUES = new EnumC0370b[]{aVar, c0371b};
        }

        private EnumC0370b(String str, int i10) {
        }

        public static EnumC0370b valueOf(String str) {
            return (EnumC0370b) Enum.valueOf(EnumC0370b.class, str);
        }

        public static EnumC0370b[] values() {
            return (EnumC0370b[]) $VALUES.clone();
        }

        public abstract boolean b();
    }

    private b() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f22338a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return ob.a.a() || f22339b.get();
    }
}
