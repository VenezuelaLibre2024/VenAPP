package sh;

import android.app.Activity;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import com.facebook.ads.AdError;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.C9322n;

/* renamed from: sh.b */
/* loaded from: classes3.dex */
public final class C10915b implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private String[] f27766a = {"android.permission.RECORD_AUDIO"};

    /* renamed from: b */
    private boolean f27767b;

    /* renamed from: c */
    private InterfaceC10920g f27768c;

    /* renamed from: c */
    private final String m33346c(String str) {
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

    /* renamed from: d */
    private final int m33347d(int i10) {
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

    /* renamed from: e */
    private final int m33348e(int i10) {
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

    /* renamed from: g */
    private final boolean m33349g(Activity activity) {
        C9322n.m27778b(activity);
        return C0854a.checkSelfPermission(activity, this.f27766a[0]) == 0;
    }

    /* renamed from: a */
    public final void m33350a(MethodChannel.Result result, Activity activity, InterfaceC10920g successCallback) {
        C9322n.m27781e(result, "result");
        C9322n.m27781e(successCallback, "successCallback");
        this.f27768c = successCallback;
        if (m33349g(activity)) {
            result.success(Boolean.TRUE);
        } else if (activity != null) {
            C0777b.m3916g(activity, this.f27766a, AdError.NO_FILL_ERROR_CODE);
        }
    }

    /* renamed from: b */
    public final void m33351b(MethodChannel.Result result, MediaRecorder mediaRecorder) {
        Double valueOf;
        C9322n.m27781e(result, "result");
        if (this.f27767b) {
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

    /* renamed from: f */
    public final void m33352f(String path, MethodChannel.Result result, MediaRecorder mediaRecorder, int i10, int i11, int i12, Integer num) {
        C9322n.m27781e(path, "path");
        C9322n.m27781e(result, "result");
        if (mediaRecorder != null) {
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(m33348e(i11));
            mediaRecorder.setAudioEncoder(m33347d(i10));
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

    /* renamed from: h */
    public final void m33353h(MethodChannel.Result result, MediaRecorder mediaRecorder) {
        C9322n.m27781e(result, "result");
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

    /* renamed from: i */
    public final void m33354i(MethodChannel.Result result, MediaRecorder mediaRecorder) {
        C9322n.m27781e(result, "result");
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

    /* renamed from: j */
    public final void m33355j(MethodChannel.Result result, MediaRecorder mediaRecorder, boolean z10) {
        C9322n.m27781e(result, "result");
        try {
            this.f27767b = z10;
            if (mediaRecorder != null) {
                mediaRecorder.start();
            }
            result.success(Boolean.TRUE);
        } catch (IllegalStateException unused) {
            Log.e("AudioWaveforms", "Failed to start recording");
        }
    }

    /* renamed from: k */
    public final void m33356k(MethodChannel.Result result, MediaRecorder mediaRecorder, String path) {
        C9322n.m27781e(result, "result");
        C9322n.m27781e(path, "path");
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
            String m33346c = m33346c(path);
            arrayList.add(path);
            arrayList.add(m33346c);
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
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(grantResults, "grantResults");
        if (i10 != 1001) {
            return false;
        }
        InterfaceC10920g interfaceC10920g = this.f27768c;
        if (interfaceC10920g != null) {
            interfaceC10920g.mo33363a(Boolean.valueOf(((grantResults.length == 0) ^ true) && grantResults[0] == 0));
        }
        return ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
    }
}
