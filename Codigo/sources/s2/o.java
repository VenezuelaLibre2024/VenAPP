package s2;

import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25115a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25116b;

    /* renamed from: c, reason: collision with root package name */
    private final e f25117c;

    /* renamed from: d, reason: collision with root package name */
    private final MethodChannel.Result f25118d;

    public o(String str, String str2, e eVar, MethodChannel.Result result) {
        this.f25115a = str;
        this.f25116b = str2;
        this.f25117c = eVar;
        this.f25118d = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = "cat " + this.f25115a + " > " + this.f25116b;
            Log.d("ffmpeg-kit-flutter", String.format("Starting copy %s to pipe %s operation.", this.f25115a, this.f25116b));
            long currentTimeMillis = System.currentTimeMillis();
            int waitFor = Runtime.getRuntime().exec(new String[]{"sh", "-c", str}).waitFor();
            Log.d("ffmpeg-kit-flutter", String.format("Copying %s to pipe %s operation completed with rc %d in %d seconds.", this.f25115a, this.f25116b, Integer.valueOf(waitFor), Long.valueOf((System.currentTimeMillis() - currentTimeMillis) / 1000)));
            this.f25117c.m(this.f25118d, Integer.valueOf(waitFor));
        } catch (IOException | InterruptedException e10) {
            Log.e("ffmpeg-kit-flutter", String.format("Copy %s to pipe %s failed with error.", this.f25115a, this.f25116b), e10);
            this.f25117c.e(this.f25118d, "WRITE_TO_PIPE_FAILED", e10.getMessage());
        }
    }
}
