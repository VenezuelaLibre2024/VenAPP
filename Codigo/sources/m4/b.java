package m4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f21371e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f21372a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21373b;

    /* renamed from: c, reason: collision with root package name */
    private final List<c> f21374c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21375d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(JSONObject component) {
        int length;
        n.e(component, "component");
        String string = component.getString("name");
        n.d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f21372a = string;
        String optString = component.optString("value");
        n.d(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f21373b = optString;
        String optString2 = component.optString("path_type", "absolute");
        n.d(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f21375d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                n.d(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new c(jSONObject));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f21374c = arrayList;
    }

    public final String a() {
        return this.f21372a;
    }

    public final List<c> b() {
        return this.f21374c;
    }

    public final String c() {
        return this.f21375d;
    }

    public final String d() {
        return this.f21373b;
    }
}
