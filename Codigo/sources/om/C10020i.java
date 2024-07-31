package om;

import android.media.MediaPlayer;
import kotlin.jvm.internal.C9322n;
import p258nm.C9731a;
import pm.InterfaceC10212b;

/* renamed from: om.i */
/* loaded from: classes3.dex */
public final class C10020i implements InterfaceC10021j {

    /* renamed from: a */
    private final C10026o f24642a;

    /* renamed from: b */
    private final MediaPlayer f24643b;

    public C10020i(C10026o wrappedPlayer) {
        C9322n.m27781e(wrappedPlayer, "wrappedPlayer");
        this.f24642a = wrappedPlayer;
        this.f24643b = m29861o(wrappedPlayer);
    }

    /* renamed from: o */
    private final MediaPlayer m29861o(final C10026o c10026o) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: om.d
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                C10020i.m29862p(C10026o.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: om.e
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C10020i.m29863q(C10026o.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: om.f
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                C10020i.m29864r(C10026o.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: om.g
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean m29865s;
                m29865s = C10020i.m29865s(C10026o.this, mediaPlayer2, i10, i11);
                return m29865s;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: om.h
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i10) {
                C10020i.m29866t(C10026o.this, mediaPlayer2, i10);
            }
        });
        c10026o.m29920h().m29172h(mediaPlayer);
        return mediaPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m29862p(C10026o wrappedPlayer, MediaPlayer mediaPlayer) {
        C9322n.m27781e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.m29935z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m29863q(C10026o wrappedPlayer, MediaPlayer mediaPlayer) {
        C9322n.m27781e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.m29933x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m29864r(C10026o wrappedPlayer, MediaPlayer mediaPlayer) {
        C9322n.m27781e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.m29903A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final boolean m29865s(C10026o wrappedPlayer, MediaPlayer mediaPlayer, int i10, int i11) {
        C9322n.m27781e(wrappedPlayer, "$wrappedPlayer");
        return wrappedPlayer.m29934y(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m29866t(C10026o wrappedPlayer, MediaPlayer mediaPlayer, int i10) {
        C9322n.m27781e(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.m29932w(i10);
    }

    @Override // om.InterfaceC10021j
    /* renamed from: a */
    public void mo29867a() {
        this.f24643b.prepareAsync();
    }

    @Override // om.InterfaceC10021j
    /* renamed from: e */
    public Integer mo29868e() {
        return Integer.valueOf(this.f24643b.getCurrentPosition());
    }

    @Override // om.InterfaceC10021j
    /* renamed from: f */
    public void mo29869f(C9731a context) {
        C9322n.m27781e(context, "context");
        context.m29172h(this.f24643b);
        if (context.m29170f()) {
            this.f24643b.setWakeMode(this.f24642a.m29918f(), 1);
        }
    }

    @Override // om.InterfaceC10021j
    /* renamed from: g */
    public void mo29870g(InterfaceC10212b source) {
        C9322n.m27781e(source, "source");
        reset();
        source.mo30554a(this.f24643b);
    }

    @Override // om.InterfaceC10021j
    public Integer getDuration() {
        Integer valueOf = Integer.valueOf(this.f24643b.getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // om.InterfaceC10021j
    /* renamed from: h */
    public void mo29871h(boolean z10) {
        this.f24643b.setLooping(z10);
    }

    @Override // om.InterfaceC10021j
    /* renamed from: i */
    public boolean mo29872i() {
        return this.f24643b.isPlaying();
    }

    @Override // om.InterfaceC10021j
    /* renamed from: j */
    public void mo29873j(float f10, float f11) {
        this.f24643b.setVolume(f10, f11);
    }

    @Override // om.InterfaceC10021j
    /* renamed from: k */
    public boolean mo29874k() {
        Integer duration = getDuration();
        return duration == null || duration.intValue() == 0;
    }

    @Override // om.InterfaceC10021j
    /* renamed from: l */
    public void mo29875l(float f10) {
        MediaPlayer mediaPlayer = this.f24643b;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
    }

    @Override // om.InterfaceC10021j
    public void pause() {
        this.f24643b.pause();
    }

    @Override // om.InterfaceC10021j
    public void release() {
        this.f24643b.reset();
        this.f24643b.release();
    }

    @Override // om.InterfaceC10021j
    public void reset() {
        this.f24643b.reset();
    }

    @Override // om.InterfaceC10021j
    public void seekTo(int i10) {
        this.f24643b.seekTo(i10);
    }

    @Override // om.InterfaceC10021j
    public void start() {
        mo29875l(this.f24642a.m29926o());
    }

    @Override // om.InterfaceC10021j
    public void stop() {
        this.f24643b.stop();
    }
}
