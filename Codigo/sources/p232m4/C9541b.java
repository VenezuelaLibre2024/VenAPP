package p232m4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m4.b */
/* loaded from: classes.dex */
public final class C9541b {

    /* renamed from: e */
    public static final a f23224e = new a(null);

    /* renamed from: a */
    private final String f23225a;

    /* renamed from: b */
    private final String f23226b;

    /* renamed from: c */
    private final List<C9542c> f23227c;

    /* renamed from: d */
    private final String f23228d;

    /* renamed from: m4.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C9541b(JSONObject component) {
        int length;
        C9322n.m27781e(component, "component");
        String string = component.getString("name");
        C9322n.m27780d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f23225a = string;
        String optString = component.optString("value");
        C9322n.m27780d(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f23226b = optString;
        String optString2 = component.optString("path_type", "absolute");
        C9322n.m27780d(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f23228d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                C9322n.m27780d(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new C9542c(jSONObject));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f23227c = arrayList;
    }

    /* renamed from: a */
    public final String m28389a() {
        return this.f23225a;
    }

    /* renamed from: b */
    public final List<C9542c> m28390b() {
        return this.f23227c;
    }

    /* renamed from: c */
    public final String m28391c() {
        return this.f23228d;
    }

    /* renamed from: d */
    public final String m28392d() {
        return this.f23226b;
    }
}
