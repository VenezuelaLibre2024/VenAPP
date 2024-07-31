package m4;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    public static final b f21361j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f21362a;

    /* renamed from: b, reason: collision with root package name */
    private final c f21363b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0341a f21364c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21365d;

    /* renamed from: e, reason: collision with root package name */
    private final List<m4.c> f21366e;

    /* renamed from: f, reason: collision with root package name */
    private final List<m4.b> f21367f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21368g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21369h;

    /* renamed from: i, reason: collision with root package name */
    private final String f21370i;

    /* renamed from: m4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0341a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0341a[] valuesCustom() {
            EnumC0341a[] valuesCustom = values();
            return (EnumC0341a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(JSONObject mapping) {
            int length;
            n.e(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString(Constants.METHOD);
            n.d(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            n.d(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            n.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            n.d(string2, "mapping.getString(\"event_type\")");
            n.d(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            n.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0341a valueOf2 = EnumC0341a.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i11);
                    n.d(jsonPath, "jsonPath");
                    arrayList.add(new m4.c(jsonPath));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray optJSONArray = mapping.optJSONArray(io.flutter.plugins.firebase.analytics.Constants.PARAMETERS);
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i10);
                    n.d(jsonParameter, "jsonParameter");
                    arrayList2.add(new m4.b(jsonParameter));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            n.d(eventName, "eventName");
            n.d(appVersion, "appVersion");
            n.d(componentId, "componentId");
            n.d(pathType, "pathType");
            n.d(activityName, "activityName");
            return new a(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List<a> b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            n.d(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public a(String eventName, c method, EnumC0341a type, String appVersion, List<m4.c> path, List<m4.b> parameters, String componentId, String pathType, String activityName) {
        n.e(eventName, "eventName");
        n.e(method, "method");
        n.e(type, "type");
        n.e(appVersion, "appVersion");
        n.e(path, "path");
        n.e(parameters, "parameters");
        n.e(componentId, "componentId");
        n.e(pathType, "pathType");
        n.e(activityName, "activityName");
        this.f21362a = eventName;
        this.f21363b = method;
        this.f21364c = type;
        this.f21365d = appVersion;
        this.f21366e = path;
        this.f21367f = parameters;
        this.f21368g = componentId;
        this.f21369h = pathType;
        this.f21370i = activityName;
    }

    public final String a() {
        return this.f21370i;
    }

    public final String b() {
        return this.f21362a;
    }

    public final List<m4.b> c() {
        List<m4.b> unmodifiableList = Collections.unmodifiableList(this.f21367f);
        n.d(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List<m4.c> d() {
        List<m4.c> unmodifiableList = Collections.unmodifiableList(this.f21366e);
        n.d(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
