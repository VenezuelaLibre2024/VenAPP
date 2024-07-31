package p345s2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: s2.e */
/* loaded from: classes.dex */
public class C10772e {

    /* renamed from: a */
    private final Handler f27205a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m32755g(MethodChannel.Result result, String str, String str2, Object obj) {
        if (result != null) {
            result.error(str, str2, obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send failure response %s:%s on a null method call result.", str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m32756h(MethodChannel.Result result) {
        if (result != null) {
            result.notImplemented();
        } else {
            Log.w("ffmpeg-kit-flutter", "ResultHandler can not send not implemented response on a null method call result.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m32757i(MethodChannel.Result result, Object obj) {
        if (result != null) {
            result.success(obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send successful response %s on a null method call result.", obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m32758j(EventChannel.EventSink eventSink, Object obj) {
        if (eventSink != null) {
            eventSink.success(obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send event %s on a null event sink.", obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m32759e(MethodChannel.Result result, String str, String str2) {
        m32760f(result, str, str2, null);
    }

    /* renamed from: f */
    void m32760f(final MethodChannel.Result result, final String str, final String str2, final Object obj) {
        this.f27205a.post(new Runnable() { // from class: s2.a
            @Override // java.lang.Runnable
            public final void run() {
                C10772e.m32755g(MethodChannel.Result.this, str, str2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m32761k(final MethodChannel.Result result) {
        this.f27205a.post(new Runnable() { // from class: s2.b
            @Override // java.lang.Runnable
            public final void run() {
                C10772e.m32756h(MethodChannel.Result.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m32762l(final EventChannel.EventSink eventSink, final Object obj) {
        this.f27205a.post(new Runnable() { // from class: s2.d
            @Override // java.lang.Runnable
            public final void run() {
                C10772e.m32758j(EventChannel.EventSink.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m32763m(final MethodChannel.Result result, final Object obj) {
        this.f27205a.post(new Runnable() { // from class: s2.c
            @Override // java.lang.Runnable
            public final void run() {
                C10772e.m32757i(MethodChannel.Result.this, obj);
            }
        });
    }
}
