package p232m4;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public final class C9540a {

    /* renamed from: j */
    public static final b f23214j = new b(null);

    /* renamed from: a */
    private final String f23215a;

    /* renamed from: b */
    private final c f23216b;

    /* renamed from: c */
    private final a f23217c;

    /* renamed from: d */
    private final String f23218d;

    /* renamed from: e */
    private final List<C9542c> f23219e;

    /* renamed from: f */
    private final List<C9541b> f23220f;

    /* renamed from: g */
    private final String f23221g;

    /* renamed from: h */
    private final String f23222h;

    /* renamed from: i */
    private final String f23223i;

    /* renamed from: m4.a$a */
    /* loaded from: classes.dex */
    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: m4.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C9540a m28386a(JSONObject mapping) {
            int length;
            C9322n.m27781e(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString(Constants.METHOD);
            C9322n.m27780d(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            C9322n.m27780d(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            C9322n.m27780d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            C9322n.m27780d(string2, "mapping.getString(\"event_type\")");
            C9322n.m27780d(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            C9322n.m27780d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            a valueOf2 = a.valueOf(upperCase2);
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
                    C9322n.m27780d(jsonPath, "jsonPath");
                    arrayList.add(new C9542c(jsonPath));
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
                    C9322n.m27780d(jsonParameter, "jsonParameter");
                    arrayList2.add(new C9541b(jsonParameter));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            C9322n.m27780d(eventName, "eventName");
            C9322n.m27780d(appVersion, "appVersion");
            C9322n.m27780d(componentId, "componentId");
            C9322n.m27780d(pathType, "pathType");
            C9322n.m27780d(activityName, "activityName");
            return new C9540a(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        /* renamed from: b */
        public final List<C9540a> m28387b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            C9322n.m27780d(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(m28386a(jSONObject));
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

    /* renamed from: m4.a$c */
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

    public C9540a(String eventName, c method, a type, String appVersion, List<C9542c> path, List<C9541b> parameters, String componentId, String pathType, String activityName) {
        C9322n.m27781e(eventName, "eventName");
        C9322n.m27781e(method, "method");
        C9322n.m27781e(type, "type");
        C9322n.m27781e(appVersion, "appVersion");
        C9322n.m27781e(path, "path");
        C9322n.m27781e(parameters, "parameters");
        C9322n.m27781e(componentId, "componentId");
        C9322n.m27781e(pathType, "pathType");
        C9322n.m27781e(activityName, "activityName");
        this.f23215a = eventName;
        this.f23216b = method;
        this.f23217c = type;
        this.f23218d = appVersion;
        this.f23219e = path;
        this.f23220f = parameters;
        this.f23221g = componentId;
        this.f23222h = pathType;
        this.f23223i = activityName;
    }

    /* renamed from: a */
    public final String m28381a() {
        return this.f23223i;
    }

    /* renamed from: b */
    public final String m28382b() {
        return this.f23215a;
    }

    /* renamed from: c */
    public final List<C9541b> m28383c() {
        List<C9541b> unmodifiableList = Collections.unmodifiableList(this.f23220f);
        C9322n.m27780d(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    /* renamed from: d */
    public final List<C9542c> m28384d() {
        List<C9542c> unmodifiableList = Collections.unmodifiableList(this.f23219e);
        C9322n.m27780d(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
