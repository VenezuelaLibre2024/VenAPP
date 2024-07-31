package p361t6;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p361t6.C11049j;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p396v6.C11639e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t6.j */
/* loaded from: classes.dex */
public final class C11049j {

    /* renamed from: a */
    private final AudioManager f28445a;

    /* renamed from: b */
    private final a f28446b;

    /* renamed from: c */
    private b f28447c;

    /* renamed from: d */
    private C11639e f28448d;

    /* renamed from: f */
    private int f28450f;

    /* renamed from: h */
    private AudioFocusRequest f28452h;

    /* renamed from: i */
    private boolean f28453i;

    /* renamed from: g */
    private float f28451g = 1.0f;

    /* renamed from: e */
    private int f28449e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.j$a */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f28454a;

        public a(Handler handler) {
            this.f28454a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m34191b(int i10) {
            C11049j.this.m34179h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f28454a.post(new Runnable() { // from class: t6.i
                @Override // java.lang.Runnable
                public final void run() {
                    C11049j.a.this.m34191b(i10);
                }
            });
        }
    }

    /* renamed from: t6.j$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: B */
        void mo33965B(float f10);

        /* renamed from: C */
        void mo33966C(int i10);
    }

    public C11049j(Context context, Handler handler, b bVar) {
        this.f28445a = (AudioManager) C11137a.m34603e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f28447c = bVar;
        this.f28446b = new a(handler);
    }

    /* renamed from: a */
    private void m34173a() {
        this.f28445a.abandonAudioFocus(this.f28446b);
    }

    /* renamed from: b */
    private void m34174b() {
        if (this.f28449e == 0) {
            return;
        }
        if (C11172r0.f29040a >= 26) {
            m34175c();
        } else {
            m34173a();
        }
        m34183n(0);
    }

    /* renamed from: c */
    private void m34175c() {
        AudioFocusRequest audioFocusRequest = this.f28452h;
        if (audioFocusRequest != null) {
            this.f28445a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: e */
    private static int m34177e(C11639e c11639e) {
        if (c11639e == null) {
            return 0;
        }
        switch (c11639e.f30297c) {
            case 0:
                C11173s.m34970i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (c11639e.f30295a == 1) {
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
                C11173s.m34970i("AudioFocusManager", "Unidentified audio usage: " + c11639e.f30297c);
                return 0;
            case 16:
                return C11172r0.f29040a >= 19 ? 4 : 2;
        }
    }

    /* renamed from: f */
    private void m34178f(int i10) {
        b bVar = this.f28447c;
        if (bVar != null) {
            bVar.mo33966C(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m34179h(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || m34185q()) {
                m34178f(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            m34183n(i11);
            return;
        }
        if (i10 == -1) {
            m34178f(-1);
            m34174b();
        } else if (i10 == 1) {
            m34183n(1);
            m34178f(1);
        } else {
            C11173s.m34970i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    /* renamed from: j */
    private int m34180j() {
        if (this.f28449e == 1) {
            return 1;
        }
        if ((C11172r0.f29040a >= 26 ? m34182l() : m34181k()) == 1) {
            m34183n(1);
            return 1;
        }
        m34183n(0);
        return -1;
    }

    /* renamed from: k */
    private int m34181k() {
        return this.f28445a.requestAudioFocus(this.f28446b, C11172r0.m34923g0(((C11639e) C11137a.m34603e(this.f28448d)).f30297c), this.f28450f);
    }

    /* renamed from: l */
    private int m34182l() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f28452h;
        if (audioFocusRequest == null || this.f28453i) {
            AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f28450f) : new AudioFocusRequest.Builder(this.f28452h);
            boolean m34185q = m34185q();
            audioAttributes = builder.setAudioAttributes(((C11639e) C11137a.m34603e(this.f28448d)).m36490c().f30301a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(m34185q);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f28446b);
            build = onAudioFocusChangeListener.build();
            this.f28452h = build;
            this.f28453i = false;
        }
        requestAudioFocus = this.f28445a.requestAudioFocus(this.f28452h);
        return requestAudioFocus;
    }

    /* renamed from: n */
    private void m34183n(int i10) {
        if (this.f28449e == i10) {
            return;
        }
        this.f28449e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f28451g == f10) {
            return;
        }
        this.f28451g = f10;
        b bVar = this.f28447c;
        if (bVar != null) {
            bVar.mo33965B(f10);
        }
    }

    /* renamed from: o */
    private boolean m34184o(int i10) {
        return i10 == 1 || this.f28450f != 1;
    }

    /* renamed from: q */
    private boolean m34185q() {
        C11639e c11639e = this.f28448d;
        return c11639e != null && c11639e.f30295a == 1;
    }

    /* renamed from: g */
    public float m34186g() {
        return this.f28451g;
    }

    /* renamed from: i */
    public void m34187i() {
        this.f28447c = null;
        m34174b();
    }

    /* renamed from: m */
    public void m34188m(C11639e c11639e) {
        if (C11172r0.m34914c(this.f28448d, c11639e)) {
            return;
        }
        this.f28448d = c11639e;
        int m34177e = m34177e(c11639e);
        this.f28450f = m34177e;
        boolean z10 = true;
        if (m34177e != 1 && m34177e != 0) {
            z10 = false;
        }
        C11137a.m34600b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* renamed from: p */
    public int m34189p(boolean z10, int i10) {
        if (m34184o(i10)) {
            m34174b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return m34180j();
        }
        return -1;
    }
}
