package p420wc;

import ad.C0103f;
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
import sc.C10889g;
import vc.C11839i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wc.f */
/* loaded from: classes.dex */
public class C12153f {

    /* renamed from: b */
    private static final Charset f32309b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C0103f f32310a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wc.f$a */
    /* loaded from: classes.dex */
    public class a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f32311a;

        a(String str) {
            this.f32311a = str;
            put(Constants.USER_ID, str);
        }
    }

    public C12153f(C0103f c0103f) {
        this.f32310a = c0103f;
    }

    /* renamed from: e */
    private static Map<String, String> m38937e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m38944o(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static List<AbstractC12156i> m38938f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(AbstractC12156i.m38986a(string));
            } catch (Exception e10) {
                C10889g.m33216f().m33226l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private String m38939g(String str) {
        return m38944o(new JSONObject(str), Constants.USER_ID);
    }

    /* renamed from: h */
    private static String m38940h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: l */
    private static String m38941l(List<AbstractC12156i> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(AbstractC12156i.f32337a.mo26546b(list.get(i10))));
            } catch (JSONException e10) {
                C10889g.m33216f().m33226l("Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: m */
    private static void m38942m(File file) {
        if (file.exists() && file.delete()) {
            C10889g.m33216f().m33221g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: n */
    private static String m38943n(String str) {
        return new a(str).toString();
    }

    /* renamed from: o */
    private static String m38944o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m38945a(String str) {
        return this.f32310a.m461o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m38946b(String str) {
        return this.f32310a.m461o(str, "keys");
    }

    /* renamed from: c */
    public File m38947c(String str) {
        return this.f32310a.m461o(str, "rollouts-state");
    }

    /* renamed from: d */
    public File m38948d(String str) {
        return this.f32310a.m461o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Map<String, String> m38949i(String str, boolean z10) {
        FileInputStream fileInputStream;
        Exception e10;
        File m38945a = z10 ? m38945a(str) : m38946b(str);
        if (!m38945a.exists() || m38945a.length() == 0) {
            m38942m(m38945a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(m38945a);
        } catch (Exception e11) {
            fileInputStream = null;
            e10 = e11;
        } catch (Throwable th2) {
            th = th2;
            C11839i.m37725f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                Map<String, String> m38937e = m38937e(C11839i.m37719A(fileInputStream));
                C11839i.m37725f(fileInputStream, "Failed to close user metadata file.");
                return m38937e;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                C11839i.m37725f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            C10889g.m33216f().m33226l("Error deserializing user metadata.", e10);
            m38942m(m38945a);
            C11839i.m37725f(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    /* renamed from: j */
    public List<AbstractC12156i> m38950j(String str) {
        File m38947c = m38947c(str);
        if (!m38947c.exists() || m38947c.length() == 0) {
            m38942m(m38947c);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(m38947c);
                try {
                    List<AbstractC12156i> m38938f = m38938f(C11839i.m37719A(fileInputStream2));
                    C10889g.m33216f().m33217b("Loaded rollouts state:\n" + m38938f + "\nfor session " + str);
                    C11839i.m37725f(fileInputStream2, "Failed to close rollouts state file.");
                    return m38938f;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    C10889g.m33216f().m33226l("Error deserializing rollouts state.", e);
                    m38942m(m38947c);
                    C11839i.m37725f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    C11839i.m37725f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: k */
    public String m38951k(String str) {
        FileInputStream fileInputStream;
        File m38948d = m38948d(str);
        FileInputStream fileInputStream2 = null;
        if (!m38948d.exists() || m38948d.length() == 0) {
            C10889g.m33216f().m33217b("No userId set for session " + str);
            m38942m(m38948d);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(m38948d);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C11839i.m37725f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String m38939g = m38939g(C11839i.m37719A(fileInputStream));
                C10889g.m33216f().m33217b("Loaded userId " + m38939g + " for session " + str);
                C11839i.m37725f(fileInputStream, "Failed to close user metadata file.");
                return m38939g;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                C11839i.m37725f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            C10889g.m33216f().m33226l("Error deserializing user metadata.", e);
            m38942m(m38948d);
            C11839i.m37725f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    /* renamed from: p */
    public void m38952p(String str, Map<String, String> map) {
        m38953q(str, map, false);
    }

    /* renamed from: q */
    public void m38953q(String str, Map<String, String> map, boolean z10) {
        File m38945a = z10 ? m38945a(str) : m38946b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m38940h = m38940h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m38945a), f32309b));
                try {
                    bufferedWriter2.write(m38940h);
                    bufferedWriter2.flush();
                    C11839i.m37725f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    C10889g.m33216f().m33226l("Error serializing key/value metadata.", e);
                    m38942m(m38945a);
                    C11839i.m37725f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    C11839i.m37725f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: r */
    public void m38954r(String str, List<AbstractC12156i> list) {
        File m38947c = m38947c(str);
        if (list.isEmpty()) {
            m38942m(m38947c);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m38941l = m38941l(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m38947c), f32309b));
                try {
                    bufferedWriter2.write(m38941l);
                    bufferedWriter2.flush();
                    C11839i.m37725f(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    C10889g.m33216f().m33226l("Error serializing rollouts state.", e);
                    m38942m(m38947c);
                    C11839i.m37725f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    C11839i.m37725f(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: s */
    public void m38955s(String str, String str2) {
        File m38948d = m38948d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m38943n = m38943n(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m38948d), f32309b));
                try {
                    bufferedWriter2.write(m38943n);
                    bufferedWriter2.flush();
                    C11839i.m37725f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    C10889g.m33216f().m33226l("Error serializing user metadata.", e);
                    C11839i.m37725f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    C11839i.m37725f(bufferedWriter, "Failed to close user metadata file.");
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
