package p140he;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p485zb.C12867g;

/* renamed from: he.c */
/* loaded from: classes.dex */
public class C7716c {

    /* renamed from: a */
    private File f18381a;

    /* renamed from: b */
    private final C12867g f18382b;

    /* renamed from: he.c$a */
    /* loaded from: classes.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C7716c(C12867g c12867g) {
        this.f18382b = c12867g;
    }

    /* renamed from: a */
    private File m23522a() {
        if (this.f18381a == null) {
            synchronized (this) {
                if (this.f18381a == null) {
                    this.f18381a = new File(this.f18382b.m42630m().getFilesDir(), "PersistedInstallation." + this.f18382b.m42633s() + ".json");
                }
            }
        }
        return this.f18381a;
    }

    /* renamed from: c */
    private JSONObject m23523c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m23522a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC7717d m23524b(AbstractC7717d abstractC7717d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC7717d.mo23499d());
            jSONObject.put("Status", abstractC7717d.mo23502g().ordinal());
            jSONObject.put("AuthToken", abstractC7717d.mo23497b());
            jSONObject.put("RefreshToken", abstractC7717d.mo23501f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC7717d.mo23503h());
            jSONObject.put("ExpiresInSecs", abstractC7717d.mo23498c());
            jSONObject.put("FisError", abstractC7717d.mo23500e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f18382b.m42630m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m23522a())) {
            return abstractC7717d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: d */
    public AbstractC7717d m23525d() {
        JSONObject m23523c = m23523c();
        String optString = m23523c.optString("Fid", null);
        int optInt = m23523c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m23523c.optString("AuthToken", null);
        String optString3 = m23523c.optString("RefreshToken", null);
        long optLong = m23523c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m23523c.optLong("ExpiresInSecs", 0L);
        return AbstractC7717d.m23526a().mo23508d(optString).mo23511g(a.values()[optInt]).mo23506b(optString2).mo23510f(optString3).mo23512h(optLong).mo23507c(optLong2).mo23509e(m23523c.optString("FisError", null)).mo23505a();
    }
}
