package re;

import android.util.Log;

/* renamed from: re.c */
/* loaded from: classes.dex */
class C10698c {

    /* renamed from: a */
    private static C10698c f27059a;

    private C10698c() {
    }

    /* renamed from: c */
    public static synchronized C10698c m32580c() {
        C10698c c10698c;
        synchronized (C10698c.class) {
            if (f27059a == null) {
                f27059a = new C10698c();
            }
            c10698c = f27059a;
        }
        return c10698c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m32581a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m32582b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m32583d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m32584e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
