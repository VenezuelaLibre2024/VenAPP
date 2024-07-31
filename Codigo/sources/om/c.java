package om;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import ck.v;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private final o f22701a;

    /* renamed from: b */
    private AudioManager.OnAudioFocusChangeListener f22702b;

    /* renamed from: c */
    private AudioFocusRequest f22703c;

    public c(o player) {
        kotlin.jvm.internal.n.e(player, "player");
        this.f22701a = player;
    }

    private final AudioManager c() {
        return this.f22701a.g();
    }

    private final nm.a d() {
        return this.f22701a.h();
    }

    private final void e(int i10, ok.a<v> aVar) {
        if (i10 == 1) {
            aVar.invoke();
        }
    }

    private final void h(ok.a<v> aVar) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        audioAttributes = new AudioFocusRequest.Builder(d().d()).setAudioAttributes(d().a());
        onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: om.a

            /* renamed from: b */
            public final /* synthetic */ ok.a f22698b;

            public /* synthetic */ a(ok.a aVar2) {
                r2 = aVar2;
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                c.i(c.this, r2, i10);
            }
        });
        build = onAudioFocusChangeListener.build();
        this.f22703c = build;
        requestAudioFocus = c().requestAudioFocus(build);
        e(requestAudioFocus, aVar2);
    }

    public static final void i(c this$0, ok.a andThen, int i10) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(andThen, "$andThen");
        this$0.e(i10, andThen);
    }

    private final void j(ok.a<v> aVar) {
        int d10 = d().d();
        this.f22702b = new AudioManager.OnAudioFocusChangeListener() { // from class: om.b

            /* renamed from: b */
            public final /* synthetic */ ok.a f22700b;

            public /* synthetic */ b(ok.a aVar2) {
                r2 = aVar2;
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                c.k(c.this, r2, i10);
            }
        };
        e(c().requestAudioFocus(this.f22702b, 3, d10), aVar2);
    }

    public static final void k(c this$0, ok.a andThen, int i10) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(andThen, "$andThen");
        this$0.e(i10, andThen);
    }

    public final void f() {
        if (d().d() != 0) {
            if (Build.VERSION.SDK_INT < 26) {
                c().abandonAudioFocus(this.f22702b);
                return;
            }
            AudioFocusRequest audioFocusRequest = this.f22703c;
            if (audioFocusRequest != null) {
                c().abandonAudioFocusRequest(audioFocusRequest);
            }
        }
    }

    public final void g(ok.a<v> andThen) {
        kotlin.jvm.internal.n.e(andThen, "andThen");
        if (d().d() == 0) {
            andThen.invoke();
        } else if (Build.VERSION.SDK_INT >= 26) {
            h(andThen);
        } else {
            j(andThen);
        }
    }
}
