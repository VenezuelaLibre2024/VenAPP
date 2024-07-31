package om;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import ck.C2037v;
import kotlin.jvm.internal.C9322n;
import p258nm.C9731a;
import p280ok.InterfaceC9987a;

/* renamed from: om.c */
/* loaded from: classes3.dex */
public final class C10014c {

    /* renamed from: a */
    private final C10026o f24634a;

    /* renamed from: b */
    private AudioManager.OnAudioFocusChangeListener f24635b;

    /* renamed from: c */
    private AudioFocusRequest f24636c;

    public C10014c(C10026o player) {
        C9322n.m27781e(player, "player");
        this.f24634a = player;
    }

    /* renamed from: c */
    private final AudioManager m29847c() {
        return this.f24634a.m29919g();
    }

    /* renamed from: d */
    private final C9731a m29848d() {
        return this.f24634a.m29920h();
    }

    /* renamed from: e */
    private final void m29849e(int i10, InterfaceC9987a<C2037v> interfaceC9987a) {
        if (i10 == 1) {
            interfaceC9987a.invoke();
        }
    }

    /* renamed from: h */
    private final void m29850h(final InterfaceC9987a<C2037v> interfaceC9987a) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        audioAttributes = new AudioFocusRequest.Builder(m29848d().m29168d()).setAudioAttributes(m29848d().m29166a());
        onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: om.a
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                C10014c.m29851i(C10014c.this, interfaceC9987a, i10);
            }
        });
        build = onAudioFocusChangeListener.build();
        this.f24636c = build;
        requestAudioFocus = m29847c().requestAudioFocus(build);
        m29849e(requestAudioFocus, interfaceC9987a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m29851i(C10014c this$0, InterfaceC9987a andThen, int i10) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(andThen, "$andThen");
        this$0.m29849e(i10, andThen);
    }

    /* renamed from: j */
    private final void m29852j(final InterfaceC9987a<C2037v> interfaceC9987a) {
        int m29168d = m29848d().m29168d();
        this.f24635b = new AudioManager.OnAudioFocusChangeListener() { // from class: om.b
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                C10014c.m29853k(C10014c.this, interfaceC9987a, i10);
            }
        };
        m29849e(m29847c().requestAudioFocus(this.f24635b, 3, m29168d), interfaceC9987a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m29853k(C10014c this$0, InterfaceC9987a andThen, int i10) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(andThen, "$andThen");
        this$0.m29849e(i10, andThen);
    }

    /* renamed from: f */
    public final void m29854f() {
        if (m29848d().m29168d() != 0) {
            if (Build.VERSION.SDK_INT < 26) {
                m29847c().abandonAudioFocus(this.f24635b);
                return;
            }
            AudioFocusRequest audioFocusRequest = this.f24636c;
            if (audioFocusRequest != null) {
                m29847c().abandonAudioFocusRequest(audioFocusRequest);
            }
        }
    }

    /* renamed from: g */
    public final void m29855g(InterfaceC9987a<C2037v> andThen) {
        C9322n.m27781e(andThen, "andThen");
        if (m29848d().m29168d() == 0) {
            andThen.invoke();
        } else if (Build.VERSION.SDK_INT >= 26) {
            m29850h(andThen);
        } else {
            m29852j(andThen);
        }
    }
}
