package re;

import android.util.Log;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f24943a;

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (f24943a == null) {
                f24943a = new c();
            }
            cVar = f24943a;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
