package ig;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f17702d = "e";

    /* renamed from: a, reason: collision with root package name */
    private final Context f17703a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17704b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17705c = false;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f17703a = activity.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(MediaPlayer mediaPlayer, int i10, int i11) {
        Log.w(f17702d, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public MediaPlayer e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ig.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                e.c(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ig.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean d10;
                d10 = e.d(mediaPlayer2, i10, i11);
                return d10;
            }
        });
        try {
            AssetFileDescriptor openRawResourceFd = this.f17703a.getResources().openRawResourceFd(m.f17744a);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th2) {
                openRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e10) {
            Log.w(f17702d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    public synchronized void f() {
        Vibrator vibrator;
        if (this.f17704b) {
            e();
        }
        if (this.f17705c && (vibrator = (Vibrator) this.f17703a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
    }

    public void g(boolean z10) {
        this.f17704b = z10;
    }
}
