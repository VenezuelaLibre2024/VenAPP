package p232m4;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;

/* renamed from: m4.c */
/* loaded from: classes.dex */
public final class C9542c {

    /* renamed from: i */
    public static final a f23229i = new a(null);

    /* renamed from: a */
    private final String f23230a;

    /* renamed from: b */
    private final int f23231b;

    /* renamed from: c */
    private final int f23232c;

    /* renamed from: d */
    private final String f23233d;

    /* renamed from: e */
    private final String f23234e;

    /* renamed from: f */
    private final String f23235f;

    /* renamed from: g */
    private final String f23236g;

    /* renamed from: h */
    private final int f23237h;

    /* renamed from: m4.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: m4.c$b */
    /* loaded from: classes.dex */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        b(int i10) {
            this.value = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: h */
        public final int m28402h() {
            return this.value;
        }
    }

    public C9542c(JSONObject component) {
        C9322n.m27781e(component, "component");
        String string = component.getString("class_name");
        C9322n.m27780d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f23230a = string;
        this.f23231b = component.optInt("index", -1);
        this.f23232c = component.optInt(FacebookMediationAdapter.KEY_ID);
        String optString = component.optString("text");
        C9322n.m27780d(optString, "component.optString(PATH_TEXT_KEY)");
        this.f23233d = optString;
        String optString2 = component.optString("tag");
        C9322n.m27780d(optString2, "component.optString(PATH_TAG_KEY)");
        this.f23234e = optString2;
        String optString3 = component.optString("description");
        C9322n.m27780d(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f23235f = optString3;
        String optString4 = component.optString("hint");
        C9322n.m27780d(optString4, "component.optString(PATH_HINT_KEY)");
        this.f23236g = optString4;
        this.f23237h = component.optInt("match_bitmask");
    }

    /* renamed from: a */
    public final String m28393a() {
        return this.f23230a;
    }

    /* renamed from: b */
    public final String m28394b() {
        return this.f23235f;
    }

    /* renamed from: c */
    public final String m28395c() {
        return this.f23236g;
    }

    /* renamed from: d */
    public final int m28396d() {
        return this.f23232c;
    }

    /* renamed from: e */
    public final int m28397e() {
        return this.f23231b;
    }

    /* renamed from: f */
    public final int m28398f() {
        return this.f23237h;
    }

    /* renamed from: g */
    public final String m28399g() {
        return this.f23234e;
    }

    /* renamed from: h */
    public final String m28400h() {
        return this.f23233d;
    }
}
