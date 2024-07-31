package sc;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25467a;

    /* renamed from: b, reason: collision with root package name */
    private b f25468b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f25469a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25470b;

        private b() {
            int p10 = vc.i.p(f.this.f25467a, "com.google.firebase.crashlytics.unity_version", "string");
            if (p10 == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f25469a = null;
                    this.f25470b = null;
                    return;
                } else {
                    this.f25469a = "Flutter";
                    this.f25470b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f25469a = "Unity";
            String string = f.this.f25467a.getResources().getString(p10);
            this.f25470b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f25467a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f25467a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f25467a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f25468b == null) {
            this.f25468b = new b();
        }
        return this.f25468b;
    }

    public String d() {
        return f().f25469a;
    }

    public String e() {
        return f().f25470b;
    }
}
