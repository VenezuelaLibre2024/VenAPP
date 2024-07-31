package cd;

import ad.C0103f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import sc.C10889g;
import vc.C11839i;

/* renamed from: cd.a */
/* loaded from: classes.dex */
public class C1944a {

    /* renamed from: a */
    private final File f7994a;

    public C1944a(C0103f c0103f) {
        this.f7994a = c0103f.m452e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m10160a() {
        return this.f7994a;
    }

    /* renamed from: b */
    public JSONObject m10161b() {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C10889g.m33216f().m33217b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m10160a = m10160a();
                if (m10160a.exists()) {
                    fileInputStream = new FileInputStream(m10160a);
                    try {
                        jSONObject = new JSONObject(C11839i.m37719A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        C10889g.m33216f().m33220e("Failed to fetch cached settings", e);
                        C11839i.m37725f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C10889g.m33216f().m33223i("Settings file does not exist.");
                    jSONObject = null;
                }
                C11839i.m37725f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                C11839i.m37725f(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            C11839i.m37725f(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    /* renamed from: c */
    public void m10162c(long j10, JSONObject jSONObject) {
        C10889g.m33216f().m33223i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(m10160a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C11839i.m37725f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    C10889g.m33216f().m33220e("Failed to cache settings", e);
                    C11839i.m37725f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C11839i.m37725f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
