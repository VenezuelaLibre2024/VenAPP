package ac;

import android.text.TextUtils;
import cc.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f302g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    static final DateFormat f303h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f304a;

    /* renamed from: b, reason: collision with root package name */
    private final String f305b;

    /* renamed from: c, reason: collision with root package name */
    private final String f306c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f307d;

    /* renamed from: e, reason: collision with root package name */
    private final long f308e;

    /* renamed from: f, reason: collision with root package name */
    private final long f309f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f304a = str;
        this.f305b = str2;
        this.f306c = str3;
        this.f307d = date;
        this.f308e = j10;
        this.f309f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(a.c cVar) {
        String str = cVar.f7023d;
        if (str == null) {
            str = "";
        }
        return new b(cVar.f7021b, String.valueOf(cVar.f7022c), str, new Date(cVar.f7032m), cVar.f7024e, cVar.f7029j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b(Map<String, String> map) {
        i(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f303h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(b bVar) {
        i(bVar.g());
    }

    private static void i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f302g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f304a;
    }

    long d() {
        return this.f307d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f305b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c f(String str) {
        a.c cVar = new a.c();
        cVar.f7020a = str;
        cVar.f7032m = d();
        cVar.f7021b = this.f304a;
        cVar.f7022c = this.f305b;
        cVar.f7023d = TextUtils.isEmpty(this.f306c) ? null : this.f306c;
        cVar.f7024e = this.f308e;
        cVar.f7029j = this.f309f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> g() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f304a);
        hashMap.put("variantId", this.f305b);
        hashMap.put("triggerEvent", this.f306c);
        hashMap.put("experimentStartTime", f303h.format(this.f307d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.f308e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f309f));
        return hashMap;
    }
}
