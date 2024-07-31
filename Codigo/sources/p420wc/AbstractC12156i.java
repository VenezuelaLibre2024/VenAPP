package p420wc;

import com.google.android.libraries.barhopper.RecognitionOptions;
import org.json.JSONObject;
import p181jd.InterfaceC9037a;
import p219ld.C9501d;
import p442xc.AbstractC12426f0;

/* renamed from: wc.i */
/* loaded from: classes.dex */
public abstract class AbstractC12156i {

    /* renamed from: a */
    public static final InterfaceC9037a f32337a = new C9501d().m28244i(C12148a.f32291a).m28243h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC12156i m38986a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return m38987b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    /* renamed from: b */
    public static AbstractC12156i m38987b(String str, String str2, String str3, String str4, long j10) {
        return new C12149b(str, str2, m38988i(str3), str4, j10);
    }

    /* renamed from: i */
    private static String m38988i(String str) {
        return str.length() > 256 ? str.substring(0, RecognitionOptions.QR_CODE) : str;
    }

    /* renamed from: c */
    public abstract String mo38915c();

    /* renamed from: d */
    public abstract String mo38916d();

    /* renamed from: e */
    public abstract String mo38917e();

    /* renamed from: f */
    public abstract long mo38918f();

    /* renamed from: g */
    public abstract String mo38919g();

    /* renamed from: h */
    public AbstractC12426f0.e.d.AbstractC13287e m38989h() {
        return AbstractC12426f0.e.d.AbstractC13287e.m40392a().mo40400d(AbstractC12426f0.e.d.AbstractC13287e.b.m40402a().mo40407c(mo38919g()).mo40406b(mo38917e()).mo40405a()).mo40398b(mo38915c()).mo40399c(mo38916d()).mo40401e(mo38918f()).mo40397a();
    }
}
