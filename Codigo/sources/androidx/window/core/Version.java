package androidx.window.core;

import ck.h;
import ck.j;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xk.p;

/* loaded from: classes.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final h bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            boolean t10;
            if (str != null) {
                t10 = p.t(str);
                if (!t10) {
                    Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
                    if (valueOf == null) {
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
                    if (valueOf2 == null) {
                        return null;
                    }
                    int intValue2 = valueOf2.intValue();
                    String group3 = matcher.group(3);
                    Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
                    if (valueOf3 == null) {
                        return null;
                    }
                    int intValue3 = valueOf3.intValue();
                    String description = matcher.group(4) != null ? matcher.group(4) : "";
                    n.d(description, "description");
                    return new Version(intValue, intValue2, intValue3, description, null);
                }
            }
            return null;
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    private Version(int i10, int i11, int i12, String str) {
        h a10;
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        a10 = j.a(new Version$bigInteger$2(this));
        this.bigInteger$delegate = a10;
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, g gVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        n.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        n.e(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        boolean t10;
        t10 = p.t(this.description);
        return this.major + '.' + this.minor + '.' + this.patch + (t10 ^ true ? n.k("-", this.description) : "");
    }
}
