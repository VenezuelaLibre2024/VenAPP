package t6;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import t6.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f26221a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26222b;

    /* renamed from: c, reason: collision with root package name */
    private b f26223c;

    /* renamed from: d, reason: collision with root package name */
    private v6.e f26224d;

    /* renamed from: f, reason: collision with root package name */
    private int f26226f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f26228h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26229i;

    /* renamed from: g, reason: collision with root package name */
    private float f26227g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f26225e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26230a;

        public a(Handler handler) {
            this.f26230a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            j.this.h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f26230a.post(new Runnable() { // from class: t6.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.this.b(i10);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void B(float f10);

        void C(int i10);
    }

    public j(Context context, Handler handler, b bVar) {
        this.f26221a = (AudioManager) t8.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f26223c = bVar;
        this.f26222b = new a(handler);
    }

    private void a() {
        this.f26221a.abandonAudioFocus(this.f26222b);
    }

    private void b() {
        if (this.f26225e == 0) {
            return;
        }
        if (t8.r0.f26744a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f26228h;
        if (audioFocusRequest != null) {
            this.f26221a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(v6.e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f27973c) {
            case 0:
                t8.s.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (eVar.f27971a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                t8.s.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f27973c);
                return 0;
            case 16:
                return t8.r0.f26744a >= 19 ? 4 : 2;
        }
    }

    private void f(int i10) {
        b bVar = this.f26223c;
        if (bVar != null) {
            bVar.C(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            n(i11);
            return;
        }
        if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 == 1) {
            n(1);
            f(1);
        } else {
            t8.s.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f26225e == 1) {
            return 1;
        }
        if ((t8.r0.f26744a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f26221a.requestAudioFocus(this.f26222b, t8.r0.g0(((v6.e) t8.a.e(this.f26224d)).f27973c), this.f26226f);
    }

    private int l() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f26228h;
        if (audioFocusRequest == null || this.f26229i) {
            AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f26226f) : new AudioFocusRequest.Builder(this.f26228h);
            boolean q10 = q();
            audioAttributes = builder.setAudioAttributes(((v6.e) t8.a.e(this.f26224d)).c().f27977a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(q10);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f26222b);
            build = onAudioFocusChangeListener.build();
            this.f26228h = build;
            this.f26229i = false;
        }
        requestAudioFocus = this.f26221a.requestAudioFocus(this.f26228h);
        return requestAudioFocus;
    }

    private void n(int i10) {
        if (this.f26225e == i10) {
            return;
        }
        this.f26225e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f26227g == f10) {
            return;
        }
        this.f26227g = f10;
        b bVar = this.f26223c;
        if (bVar != null) {
            bVar.B(f10);
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f26226f != 1;
    }

    private boolean q() {
        v6.e eVar = this.f26224d;
        return eVar != null && eVar.f27971a == 1;
    }

    public float g() {
        return this.f26227g;
    }

    public void i() {
        this.f26223c = null;
        b();
    }

    public void m(v6.e eVar) {
        if (t8.r0.c(this.f26224d, eVar)) {
            return;
        }
        this.f26224d = eVar;
        int e10 = e(eVar);
        this.f26226f = e10;
        boolean z10 = true;
        if (e10 != 1 && e10 != 0) {
            z10 = false;
        }
        t8.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return j();
        }
        return -1;
    }
}
