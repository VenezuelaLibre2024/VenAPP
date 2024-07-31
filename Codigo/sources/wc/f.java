package wc;

import io.flutter.plugins.firebase.analytics.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f29844b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final ad.f f29845a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29846a;

        a(String str) {
            this.f29846a = str;
            put(Constants.USER_ID, str);
        }
    }

    public f(ad.f fVar) {
        this.f29845a = fVar;
    }

    private static Map<String, String> e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, o(jSONObject, next));
        }
        return hashMap;
    }

    private static List<i> f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e10) {
                sc.g.f().l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return o(new JSONObject(str), Constants.USER_ID);
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<i> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(i.f29872a.b(list.get(i10))));
            } catch (JSONException e10) {
                sc.g.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            sc.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String n(String str) {
        return new a(str).toString();
    }

    private static String o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f29845a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.f29845a.o(str, "keys");
    }

    public File c(String str) {
        return this.f29845a.o(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f29845a.o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> i(String str, boolean z10) {
        FileInputStream fileInputStream;
        Exception e10;
        File a10 = z10 ? a(str) : b(str);
        if (!a10.exists() || a10.length() == 0) {
            m(a10);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a10);
        } catch (Exception e11) {
            fileInputStream = null;
            e10 = e11;
        } catch (Throwable th2) {
            th = th2;
            vc.i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                Map<String, String> e12 = e(vc.i.A(fileInputStream));
                vc.i.f(fileInputStream, "Failed to close user metadata file.");
                return e12;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                vc.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e13) {
            e10 = e13;
            sc.g.f().l("Error deserializing user metadata.", e10);
            m(a10);
            vc.i.f(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    public List<i> j(String str) {
        File c10 = c(str);
        if (!c10.exists() || c10.length() == 0) {
            m(c10);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(c10);
                try {
                    List<i> f10 = f(vc.i.A(fileInputStream2));
                    sc.g.f().b("Loaded rollouts state:\n" + f10 + "\nfor session " + str);
                    vc.i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return f10;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    sc.g.f().l("Error deserializing rollouts state.", e);
                    m(c10);
                    vc.i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    vc.i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d10 = d(str);
        FileInputStream fileInputStream2 = null;
        if (!d10.exists() || d10.length() == 0) {
            sc.g.f().b("No userId set for session " + str);
            m(d10);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(d10);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            vc.i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String g10 = g(vc.i.A(fileInputStream));
                sc.g.f().b("Loaded userId " + g10 + " for session " + str);
                vc.i.f(fileInputStream, "Failed to close user metadata file.");
                return g10;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                vc.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            sc.g.f().l("Error deserializing user metadata.", e);
            m(d10);
            vc.i.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void p(String str, Map<String, String> map) {
        q(str, map, false);
    }

    public void q(String str, Map<String, String> map, boolean z10) {
        File a10 = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String h10 = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a10), f29844b));
                try {
                    bufferedWriter2.write(h10);
                    bufferedWriter2.flush();
                    vc.i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    sc.g.f().l("Error serializing key/value metadata.", e);
                    m(a10);
                    vc.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    vc.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void r(String str, List<i> list) {
        File c10 = c(str);
        if (list.isEmpty()) {
            m(c10);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String l10 = l(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c10), f29844b));
                try {
                    bufferedWriter2.write(l10);
                    bufferedWriter2.flush();
                    vc.i.f(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    sc.g.f().l("Error serializing rollouts state.", e);
                    m(c10);
                    vc.i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    vc.i.f(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void s(String str, String str2) {
        File d10 = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String n10 = n(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d10), f29844b));
                try {
                    bufferedWriter2.write(n10);
                    bufferedWriter2.flush();
                    vc.i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    sc.g.f().l("Error serializing user metadata.", e);
                    vc.i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    vc.i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
