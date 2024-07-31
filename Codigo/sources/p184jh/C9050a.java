package p184jh;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p184jh.C9050a;

/* renamed from: jh.a */
/* loaded from: classes3.dex */
public final class C9050a {

    /* renamed from: i */
    private static final String f21670i = "a";

    /* renamed from: j */
    private static final Collection<String> f21671j;

    /* renamed from: a */
    private boolean f21672a;

    /* renamed from: b */
    private boolean f21673b;

    /* renamed from: c */
    private final boolean f21674c;

    /* renamed from: d */
    private final Camera f21675d;

    /* renamed from: e */
    private Handler f21676e;

    /* renamed from: f */
    private int f21677f = 1;

    /* renamed from: g */
    private final Handler.Callback f21678g;

    /* renamed from: h */
    private final Camera.AutoFocusCallback f21679h;

    /* renamed from: jh.a$a */
    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != C9050a.this.f21677f) {
                return false;
            }
            C9050a.this.m26569h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jh.a$b */
    /* loaded from: classes3.dex */
    public class b implements Camera.AutoFocusCallback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m26573b() {
            C9050a.this.f21673b = false;
            C9050a.this.m26567f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            C9050a.this.f21676e.post(new Runnable() { // from class: jh.b
                @Override // java.lang.Runnable
                public final void run() {
                    C9050a.b.this.m26573b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f21671j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C9050a(Camera camera, C9058i c9058i) {
        a aVar = new a();
        this.f21678g = aVar;
        this.f21679h = new b();
        this.f21676e = new Handler(aVar);
        this.f21675d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z10 = c9058i.m26643c() && f21671j.contains(focusMode);
        this.f21674c = z10;
        Log.i(f21670i, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        m26570i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m26567f() {
        if (!this.f21672a && !this.f21676e.hasMessages(this.f21677f)) {
            Handler handler = this.f21676e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f21677f), 2000L);
        }
    }

    /* renamed from: g */
    private void m26568g() {
        this.f21676e.removeMessages(this.f21677f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m26569h() {
        if (!this.f21674c || this.f21672a || this.f21673b) {
            return;
        }
        try {
            this.f21675d.autoFocus(this.f21679h);
            this.f21673b = true;
        } catch (RuntimeException e10) {
            Log.w(f21670i, "Unexpected exception while focusing", e10);
            m26567f();
        }
    }

    /* renamed from: i */
    public void m26570i() {
        this.f21672a = false;
        m26569h();
    }

    /* renamed from: j */
    public void m26571j() {
        this.f21672a = true;
        this.f21673b = false;
        m26568g();
        if (this.f21674c) {
            try {
                this.f21675d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f21670i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}
