package sc;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import vc.C11839i;

/* renamed from: sc.f */
/* loaded from: classes.dex */
public class C10888f {

    /* renamed from: a */
    private final Context f27586a;

    /* renamed from: b */
    private b f27587b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sc.f$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private final String f27588a;

        /* renamed from: b */
        private final String f27589b;

        private b() {
            int m37735p = C11839i.m37735p(C10888f.this.f27586a, "com.google.firebase.crashlytics.unity_version", "string");
            if (m37735p == 0) {
                if (!C10888f.this.m33209c("flutter_assets/NOTICES.Z")) {
                    this.f27588a = null;
                    this.f27589b = null;
                    return;
                } else {
                    this.f27588a = "Flutter";
                    this.f27589b = null;
                    C10889g.m33216f().m33223i("Development platform is: Flutter");
                    return;
                }
            }
            this.f27588a = "Unity";
            String string = C10888f.this.f27586a.getResources().getString(m37735p);
            this.f27589b = string;
            C10889g.m33216f().m33223i("Unity Editor version is: " + string);
        }
    }

    public C10888f(Context context) {
        this.f27586a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m33209c(String str) {
        if (this.f27586a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f27586a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private b m33210f() {
        if (this.f27587b == null) {
            this.f27587b = new b();
        }
        return this.f27587b;
    }

    /* renamed from: d */
    public String m33211d() {
        return m33210f().f27588a;
    }

    /* renamed from: e */
    public String m33212e() {
        return m33210f().f27589b;
    }
}
