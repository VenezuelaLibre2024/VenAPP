package sh;

import android.app.Activity;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.AdError;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    private String[] f25622a = {"android.permission.RECORD_AUDIO"};

    /* renamed from: b, reason: collision with root package name */
    private boolean f25623b;

    /* renamed from: c, reason: collision with root package name */
    private g f25624c;

    private final String c(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            return extractMetadata != null ? extractMetadata : "-1";
        } catch (Exception unused) {
            Log.e("AudioWaveforms", "Failed to get recording duration");
            return "-1";
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private final int d(int i10) {
        switch (i10) {
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                if (Build.VERSION.SDK_INT >= 29) {
                    return 7;
                }
                Log.e("AudioWaveforms", "Minimum android Q is required, Setting Acc encoder.");
                return 3;
            case 7:
                return 6;
            default:
                return 3;
        }
    }

    private final int e(int i10) {
        switch (i10) {
            case 2:
                return 1;
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return 11;
                }
                Log.e("AudioWaveforms", "Minimum android Q is required, Setting Acc encoder.");
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 9;
            case 7:
                if (Build.VERSION.SDK_INT >= 26) {
                    return 8;
                }
                Log.e("AudioWaveforms", "Minimum android Q is required, Setting MPEG_4 output format.");
                return 2;
            case 8:
                return 6;
            default:
                return 2;
        }
    }

    private final boolean g(Activity activity) {
        n.b(activity);
        return androidx.core.content.a.checkSelfPermission(activity, this.f25622a[0]) == 0;
    }

    public final void a(MethodChannel.Result result, Activity activity, g successCallback) {
        n.e(result, "result");
        n.e(successCallback, "successCallback");
        this.f25624c = successCallback;
        if (g(activity)) {
            result.success(Boolean.TRUE);
        } else if (activity != null) {
            androidx.core.app.b.g(activity, this.f25622a, AdError.NO_FILL_ERROR_CODE);
        }
    }

    public final void b(MethodChannel.Result result, MediaRecorder mediaRecorder) {
        Double valueOf;
        n.e(result, "result");
        if (this.f25623b) {
            double log10 = 20 * Math.log10(mediaRecorder != null ? mediaRecorder.getMaxAmplitude() : 0.0d);
            if (log10 == Double.NEGATIVE_INFINITY) {
                Log.d("AudioWaveforms", "Microphone might be turned off");
                return;
            }
            valueOf = Double.valueOf(log10);
        } else {
            valueOf = Double.valueOf(mediaRecorder != null ? mediaRecorder.getMaxAmplitude() : 0.0d);
        }
        result.success(valueOf);
    }

    public final void f(String path, MethodChannel.Result result, MediaRecorder mediaRecorder, int i10, int i11, int i12, Integer num) {
        n.e(path, "path");
        n.e(result, "result");
        if (mediaRecorder != null) {
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(e(i11));
            mediaRecorder.setAudioEncoder(d(i10));
            mediaRecorder.setAudioSamplingRate(i12);
            if (num != null) {
                mediaRecorder.setAudioEncodingBitRate(num.intValue());
            }
            mediaRecorder.setOutputFile(path);
            try {
                mediaRecorder.prepare();
                result.success(Boolean.TRUE);
            } catch (IOException unused) {
                Log.e("AudioWaveforms", "Failed to stop initialize recorder");
            }
        }
    }

    public final void h(MethodChannel.Result result, MediaRecorder mediaRecorder) {
        n.e(result, "result");
        if (mediaRecorder != null) {
            try {
                mediaRecorder.pause();
            } catch (IllegalStateException unused) {
                Log.e("AudioWaveforms", "Failed to pause recording");
                return;
            }
        }
        result.success(Boolean.FALSE);
    }

    public final void i(MethodChannel.Result result, MediaRecorder mediaRecorder) {
        n.e(result, "result");
        if (mediaRecorder != null) {
            try {
                mediaRecorder.resume();
            } catch (IllegalStateException unused) {
                Log.e("AudioWaveforms", "Failed to resume recording");
                return;
            }
        }
        result.success(Boolean.TRUE);
    }

    public final void j(MethodChannel.Result result, MediaRecorder mediaRecorder, boolean z10) {
        n.e(result, "result");
        try {
            this.f25623b = z10;
            if (mediaRecorder != null) {
                mediaRecorder.start();
            }
            result.success(Boolean.TRUE);
        } catch (IllegalStateException unused) {
            Log.e("AudioWaveforms", "Failed to start recording");
        }
    }

    public final void k(MethodChannel.Result result, MediaRecorder mediaRecorder, String path) {
        n.e(result, "result");
        n.e(path, "path");
        try {
            ArrayList arrayList = new ArrayList();
            if (mediaRecorder != null) {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException unused) {
                    arrayList.add(null);
                    arrayList.add("-1");
                }
            }
            String c10 = c(path);
            arrayList.add(path);
            arrayList.add(c10);
            if (mediaRecorder != null) {
                mediaRecorder.reset();
                mediaRecorder.release();
            }
            result.success(arrayList);
        } catch (IllegalStateException unused2) {
            Log.e("AudioWaveforms", "Failed to stop recording");
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        n.e(permissions, "permissions");
        n.e(grantResults, "grantResults");
        if (i10 != 1001) {
            return false;
        }
        g gVar = this.f25624c;
        if (gVar != null) {
            gVar.a(Boolean.valueOf(((grantResults.length == 0) ^ true) && grantResults[0] == 0));
        }
        return ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
    }
}
