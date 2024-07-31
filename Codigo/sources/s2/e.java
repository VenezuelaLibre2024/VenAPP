package s2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f25086a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(MethodChannel.Result result, String str, String str2, Object obj) {
        if (result != null) {
            result.error(str, str2, obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send failure response %s:%s on a null method call result.", str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(MethodChannel.Result result) {
        if (result != null) {
            result.notImplemented();
        } else {
            Log.w("ffmpeg-kit-flutter", "ResultHandler can not send not implemented response on a null method call result.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(MethodChannel.Result result, Object obj) {
        if (result != null) {
            result.success(obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send successful response %s on a null method call result.", obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(EventChannel.EventSink eventSink, Object obj) {
        if (eventSink != null) {
            eventSink.success(obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send event %s on a null event sink.", obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(MethodChannel.Result result, String str, String str2) {
        f(result, str, str2, null);
    }

    void f(final MethodChannel.Result result, final String str, final String str2, final Object obj) {
        this.f25086a.post(new Runnable() { // from class: s2.a
            @Override // java.lang.Runnable
            public final void run() {
                e.g(MethodChannel.Result.this, str, str2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(final MethodChannel.Result result) {
        this.f25086a.post(new Runnable() { // from class: s2.b
            @Override // java.lang.Runnable
            public final void run() {
                e.h(MethodChannel.Result.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(final EventChannel.EventSink eventSink, final Object obj) {
        this.f25086a.post(new Runnable() { // from class: s2.d
            @Override // java.lang.Runnable
            public final void run() {
                e.j(EventChannel.EventSink.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(final MethodChannel.Result result, final Object obj) {
        this.f25086a.post(new Runnable() { // from class: s2.c
            @Override // java.lang.Runnable
            public final void run() {
                e.i(MethodChannel.Result.this, obj);
            }
        });
    }
}
