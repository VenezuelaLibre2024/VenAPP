package jh;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import jh.a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f19891i = "a";

    /* renamed from: j, reason: collision with root package name */
    private static final Collection<String> f19892j;

    /* renamed from: a, reason: collision with root package name */
    private boolean f19893a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19894b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19895c;

    /* renamed from: d, reason: collision with root package name */
    private final Camera f19896d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f19897e;

    /* renamed from: f, reason: collision with root package name */
    private int f19898f = 1;

    /* renamed from: g, reason: collision with root package name */
    private final Handler.Callback f19899g;

    /* renamed from: h, reason: collision with root package name */
    private final Camera.AutoFocusCallback f19900h;

    /* renamed from: jh.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0312a implements Handler.Callback {
        C0312a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != a.this.f19898f) {
                return false;
            }
            a.this.h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Camera.AutoFocusCallback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            a.this.f19894b = false;
            a.this.f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            a.this.f19897e.post(new Runnable() { // from class: jh.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.b.this.b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f19892j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, i iVar) {
        C0312a c0312a = new C0312a();
        this.f19899g = c0312a;
        this.f19900h = new b();
        this.f19897e = new Handler(c0312a);
        this.f19896d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z10 = iVar.c() && f19892j.contains(focusMode);
        this.f19895c = z10;
        Log.i(f19891i, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f19893a && !this.f19897e.hasMessages(this.f19898f)) {
            Handler handler = this.f19897e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f19898f), 2000L);
        }
    }

    private void g() {
        this.f19897e.removeMessages(this.f19898f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!this.f19895c || this.f19893a || this.f19894b) {
            return;
        }
        try {
            this.f19896d.autoFocus(this.f19900h);
            this.f19894b = true;
        } catch (RuntimeException e10) {
            Log.w(f19891i, "Unexpected exception while focusing", e10);
            f();
        }
    }

    public void i() {
        this.f19893a = false;
        h();
    }

    public void j() {
        this.f19893a = true;
        this.f19894b = false;
        g();
        if (this.f19895c) {
            try {
                this.f19896d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f19891i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}
