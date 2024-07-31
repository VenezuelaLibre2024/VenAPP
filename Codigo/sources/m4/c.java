package m4;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final a f21376i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f21377a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21378b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21379c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21380d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21381e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21382f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21383g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21384h;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

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

        public final int h() {
            return this.value;
        }
    }

    public c(JSONObject component) {
        n.e(component, "component");
        String string = component.getString("class_name");
        n.d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f21377a = string;
        this.f21378b = component.optInt("index", -1);
        this.f21379c = component.optInt(FacebookMediationAdapter.KEY_ID);
        String optString = component.optString("text");
        n.d(optString, "component.optString(PATH_TEXT_KEY)");
        this.f21380d = optString;
        String optString2 = component.optString("tag");
        n.d(optString2, "component.optString(PATH_TAG_KEY)");
        this.f21381e = optString2;
        String optString3 = component.optString("description");
        n.d(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f21382f = optString3;
        String optString4 = component.optString("hint");
        n.d(optString4, "component.optString(PATH_HINT_KEY)");
        this.f21383g = optString4;
        this.f21384h = component.optInt("match_bitmask");
    }

    public final String a() {
        return this.f21377a;
    }

    public final String b() {
        return this.f21382f;
    }

    public final String c() {
        return this.f21383g;
    }

    public final int d() {
        return this.f21379c;
    }

    public final int e() {
        return this.f21378b;
    }

    public final int f() {
        return this.f21384h;
    }

    public final String g() {
        return this.f21381e;
    }

    public final String h() {
        return this.f21380d;
    }
}
