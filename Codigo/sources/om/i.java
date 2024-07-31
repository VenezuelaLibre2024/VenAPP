package om;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
public final class i implements j {

    /* renamed from: a */
    private final o f22709a;

    /* renamed from: b */
    private final MediaPlayer f22710b;

    public i(o wrappedPlayer) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "wrappedPlayer");
        this.f22709a = wrappedPlayer;
        this.f22710b = o(wrappedPlayer);
    }

    private final MediaPlayer o(o oVar) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: om.d
            public /* synthetic */ d() {
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                i.p(o.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: om.e
            public /* synthetic */ e() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                i.q(o.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: om.f
            public /* synthetic */ f() {
            }

            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                i.r(o.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: om.g
            public /* synthetic */ g() {
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean s10;
                s10 = i.s(o.this, mediaPlayer2, i10, i11);
                return s10;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: om.h
            public /* synthetic */ h() {
            }

            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i10) {
                i.t(o.this, mediaPlayer2, i10);
            }
        });
        oVar.h().h(mediaPlayer);
        return mediaPlayer;
    }

    public static final void p(o wrappedPlayer, MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.z();
    }

    public static final void q(o wrappedPlayer, MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.x();
    }

    public static final void r(o wrappedPlayer, MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.A();
    }

    public static final boolean s(o wrappedPlayer, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "$wrappedPlayer");
        return wrappedPlayer.y(i10, i11);
    }

    public static final void t(o wrappedPlayer, MediaPlayer mediaPlayer, int i10) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.w(i10);
    }

    @Override // om.j
    public void a() {
        this.f22710b.prepareAsync();
    }

    @Override // om.j
    public Integer e() {
        return Integer.valueOf(this.f22710b.getCurrentPosition());
    }

    @Override // om.j
    public void f(nm.a context) {
        kotlin.jvm.internal.n.e(context, "context");
        context.h(this.f22710b);
        if (context.f()) {
            this.f22710b.setWakeMode(this.f22709a.f(), 1);
        }
    }

    @Override // om.j
    public void g(pm.b source) {
        kotlin.jvm.internal.n.e(source, "source");
        reset();
        source.a(this.f22710b);
    }

    @Override // om.j
    public Integer getDuration() {
        Integer valueOf = Integer.valueOf(this.f22710b.getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // om.j
    public void h(boolean z10) {
        this.f22710b.setLooping(z10);
    }

    @Override // om.j
    public boolean i() {
        return this.f22710b.isPlaying();
    }

    @Override // om.j
    public void j(float f10, float f11) {
        this.f22710b.setVolume(f10, f11);
    }

    @Override // om.j
    public boolean k() {
        Integer duration = getDuration();
        return duration == null || duration.intValue() == 0;
    }

    @Override // om.j
    public void l(float f10) {
        MediaPlayer mediaPlayer = this.f22710b;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
    }

    @Override // om.j
    public void pause() {
        this.f22710b.pause();
    }

    @Override // om.j
    public void release() {
        this.f22710b.reset();
        this.f22710b.release();
    }

    @Override // om.j
    public void reset() {
        this.f22710b.reset();
    }

    @Override // om.j
    public void seekTo(int i10) {
        this.f22710b.seekTo(i10);
    }

    @Override // om.j
    public void start() {
        l(this.f22709a.o());
    }

    @Override // om.j
    public void stop() {
        this.f22710b.stop();
    }
}
