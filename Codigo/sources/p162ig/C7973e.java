package p162ig;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* renamed from: ig.e */
/* loaded from: classes2.dex */
public final class C7973e {

    /* renamed from: d */
    private static final String f19365d = "e";

    /* renamed from: a */
    private final Context f19366a;

    /* renamed from: b */
    private boolean f19367b = true;

    /* renamed from: c */
    private boolean f19368c = false;

    public C7973e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f19366a = activity.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m24509c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ boolean m24510d(MediaPlayer mediaPlayer, int i10, int i11) {
        Log.w(f19365d, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: e */
    public MediaPlayer m24511e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ig.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C7973e.m24509c(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ig.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean m24510d;
                m24510d = C7973e.m24510d(mediaPlayer2, i10, i11);
                return m24510d;
            }
        });
        try {
            AssetFileDescriptor openRawResourceFd = this.f19366a.getResources().openRawResourceFd(C7981m.f19407a);
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
            Log.w(f19365d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    /* renamed from: f */
    public synchronized void m24512f() {
        Vibrator vibrator;
        if (this.f19367b) {
            m24511e();
        }
        if (this.f19368c && (vibrator = (Vibrator) this.f19366a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
    }

    /* renamed from: g */
    public void m24513g(boolean z10) {
        this.f19367b = z10;
    }
}
