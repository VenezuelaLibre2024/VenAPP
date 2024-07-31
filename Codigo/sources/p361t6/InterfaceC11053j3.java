package p361t6;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p082eb.C7155k;
import p120g8.C7484b;
import p120g8.C7488f;
import p216l7.C9400a;
import p307q8.C10319y;
import p361t6.InterfaceC11053j3;
import p361t6.InterfaceC11076o;
import p363t8.C11159l;
import p363t8.C11172r0;
import p378u8.C11448a0;
import p396v6.C11639e;

/* renamed from: t6.j3 */
/* loaded from: classes.dex */
public interface InterfaceC11053j3 {

    /* renamed from: t6.j3$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC11076o {

        /* renamed from: b */
        public static final b f28470b = new a().m34211e();

        /* renamed from: c */
        private static final String f28471c = C11172r0.m34945r0(0);

        /* renamed from: d */
        public static final InterfaceC11076o.a<b> f28472d = new InterfaceC11076o.a() { // from class: t6.k3
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                InterfaceC11053j3.b m34206d;
                m34206d = InterfaceC11053j3.b.m34206d(bundle);
                return m34206d;
            }
        };

        /* renamed from: a */
        private final C11159l f28473a;

        /* renamed from: t6.j3$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b */
            private static final int[] f28474b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a */
            private final C11159l.b f28475a = new C11159l.b();

            /* renamed from: a */
            public a m34207a(int i10) {
                this.f28475a.m34763a(i10);
                return this;
            }

            /* renamed from: b */
            public a m34208b(b bVar) {
                this.f28475a.m34764b(bVar.f28473a);
                return this;
            }

            /* renamed from: c */
            public a m34209c(int... iArr) {
                this.f28475a.m34765c(iArr);
                return this;
            }

            /* renamed from: d */
            public a m34210d(int i10, boolean z10) {
                this.f28475a.m34766d(i10, z10);
                return this;
            }

            /* renamed from: e */
            public b m34211e() {
                return new b(this.f28475a.m34767e());
            }
        }

        private b(C11159l c11159l) {
            this.f28473a = c11159l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static b m34206d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f28471c);
            if (integerArrayList == null) {
                return f28470b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.m34207a(integerArrayList.get(i10).intValue());
            }
            return aVar.m34211e();
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f28473a.m34762c(); i10++) {
                arrayList.add(Integer.valueOf(this.f28473a.m34761b(i10)));
            }
            bundle.putIntegerArrayList(f28471c, arrayList);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f28473a.equals(((b) obj).f28473a);
            }
            return false;
        }

        public int hashCode() {
            return this.f28473a.hashCode();
        }
    }

    /* renamed from: t6.j3$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final C11159l f28476a;

        public c(C11159l c11159l) {
            this.f28476a = c11159l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f28476a.equals(((c) obj).f28476a);
            }
            return false;
        }

        public int hashCode() {
            return this.f28476a.hashCode();
        }
    }

    /* renamed from: t6.j3$d */
    /* loaded from: classes.dex */
    public interface d {
        default void onAudioAttributesChanged(C11639e c11639e) {
        }

        default void onAudioSessionIdChanged(int i10) {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onCues(C7488f c7488f) {
        }

        @Deprecated
        default void onCues(List<C7484b> list) {
        }

        default void onDeviceInfoChanged(C11111v c11111v) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onEvents(InterfaceC11053j3 interfaceC11053j3, c cVar) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z10) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j10) {
        }

        default void onMediaItemTransition(C11010c2 c11010c2, int i10) {
        }

        default void onMediaMetadataChanged(C11040h2 c11040h2) {
        }

        default void onMetadata(C9400a c9400a) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlaybackParametersChanged(C11047i3 c11047i3) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerError(C11029f3 c11029f3) {
        }

        default void onPlayerErrorChanged(C11029f3 c11029f3) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onPlaylistMetadataChanged(C11040h2 c11040h2) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i10) {
        }

        default void onPositionDiscontinuity(e eVar, e eVar2, int i10) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekBackIncrementChanged(long j10) {
        }

        default void onSeekForwardIncrementChanged(long j10) {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void onTimelineChanged(AbstractC11018d4 abstractC11018d4, int i10) {
        }

        default void onTrackSelectionParametersChanged(C10319y c10319y) {
        }

        default void onTracksChanged(C11048i4 c11048i4) {
        }

        default void onVideoSizeChanged(C11448a0 c11448a0) {
        }

        default void onVolumeChanged(float f10) {
        }
    }

    /* renamed from: t6.j3$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC11076o {

        /* renamed from: a */
        public final Object f28485a;

        /* renamed from: b */
        @Deprecated
        public final int f28486b;

        /* renamed from: c */
        public final int f28487c;

        /* renamed from: d */
        public final C11010c2 f28488d;

        /* renamed from: e */
        public final Object f28489e;

        /* renamed from: f */
        public final int f28490f;

        /* renamed from: r */
        public final long f28491r;

        /* renamed from: s */
        public final long f28492s;

        /* renamed from: t */
        public final int f28493t;

        /* renamed from: u */
        public final int f28494u;

        /* renamed from: v */
        private static final String f28480v = C11172r0.m34945r0(0);

        /* renamed from: w */
        private static final String f28481w = C11172r0.m34945r0(1);

        /* renamed from: x */
        private static final String f28482x = C11172r0.m34945r0(2);

        /* renamed from: y */
        private static final String f28483y = C11172r0.m34945r0(3);

        /* renamed from: z */
        private static final String f28484z = C11172r0.m34945r0(4);

        /* renamed from: A */
        private static final String f28477A = C11172r0.m34945r0(5);

        /* renamed from: B */
        private static final String f28478B = C11172r0.m34945r0(6);

        /* renamed from: C */
        public static final InterfaceC11076o.a<e> f28479C = new InterfaceC11076o.a() { // from class: t6.l3
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                InterfaceC11053j3.e m34213c;
                m34213c = InterfaceC11053j3.e.m34213c(bundle);
                return m34213c;
            }
        };

        public e(Object obj, int i10, C11010c2 c11010c2, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f28485a = obj;
            this.f28486b = i10;
            this.f28487c = i10;
            this.f28488d = c11010c2;
            this.f28489e = obj2;
            this.f28490f = i11;
            this.f28491r = j10;
            this.f28492s = j11;
            this.f28493t = i12;
            this.f28494u = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static e m34213c(Bundle bundle) {
            int i10 = bundle.getInt(f28480v, 0);
            Bundle bundle2 = bundle.getBundle(f28481w);
            return new e(null, i10, bundle2 == null ? null : C11010c2.f28022z.mo22759a(bundle2), null, bundle.getInt(f28482x, 0), bundle.getLong(f28483y, 0L), bundle.getLong(f28484z, 0L), bundle.getInt(f28477A, -1), bundle.getInt(f28478B, -1));
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            return m34214d(true, true);
        }

        /* renamed from: d */
        public Bundle m34214d(boolean z10, boolean z11) {
            Bundle bundle = new Bundle();
            bundle.putInt(f28480v, z11 ? this.f28487c : 0);
            C11010c2 c11010c2 = this.f28488d;
            if (c11010c2 != null && z10) {
                bundle.putBundle(f28481w, c11010c2.mo22762a());
            }
            bundle.putInt(f28482x, z11 ? this.f28490f : 0);
            bundle.putLong(f28483y, z10 ? this.f28491r : 0L);
            bundle.putLong(f28484z, z10 ? this.f28492s : 0L);
            bundle.putInt(f28477A, z10 ? this.f28493t : -1);
            bundle.putInt(f28478B, z10 ? this.f28494u : -1);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f28487c == eVar.f28487c && this.f28490f == eVar.f28490f && this.f28491r == eVar.f28491r && this.f28492s == eVar.f28492s && this.f28493t == eVar.f28493t && this.f28494u == eVar.f28494u && C7155k.m21289a(this.f28485a, eVar.f28485a) && C7155k.m21289a(this.f28489e, eVar.f28489e) && C7155k.m21289a(this.f28488d, eVar.f28488d);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f28485a, Integer.valueOf(this.f28487c), this.f28488d, this.f28489e, Integer.valueOf(this.f28490f), Long.valueOf(this.f28491r), Long.valueOf(this.f28492s), Integer.valueOf(this.f28493t), Integer.valueOf(this.f28494u));
        }
    }

    /* renamed from: A */
    void mo34194A(float f10);

    /* renamed from: B */
    long mo33907B();

    /* renamed from: C */
    void mo33908C(int i10, List<C11010c2> list);

    /* renamed from: D */
    long mo33909D();

    /* renamed from: E */
    boolean mo34195E();

    /* renamed from: F */
    int mo33910F();

    /* renamed from: G */
    int mo33911G();

    /* renamed from: H */
    void mo33912H(int i10);

    /* renamed from: J */
    int mo33914J();

    /* renamed from: K */
    boolean mo33915K();

    /* renamed from: M */
    boolean mo34196M();

    /* renamed from: a */
    void mo33923a();

    /* renamed from: b */
    void mo33924b(C11047i3 c11047i3);

    /* renamed from: c */
    C11047i3 mo33925c();

    /* renamed from: d */
    void mo34197d();

    /* renamed from: e */
    long mo33927e();

    /* renamed from: f */
    void mo33929f(Surface surface);

    /* renamed from: g */
    boolean mo33931g();

    long getDuration();

    /* renamed from: h */
    long mo33933h();

    /* renamed from: i */
    void mo34198i();

    /* renamed from: j */
    C11029f3 mo33934j();

    /* renamed from: k */
    void mo33935k(boolean z10);

    /* renamed from: m */
    C11048i4 mo33938m();

    /* renamed from: n */
    boolean mo34199n();

    /* renamed from: o */
    int mo33939o();

    /* renamed from: p */
    boolean mo34200p();

    void pause();

    /* renamed from: q */
    int mo33940q();

    /* renamed from: r */
    AbstractC11018d4 mo33941r();

    void release();

    /* renamed from: s */
    void mo33942s(d dVar);

    void setVolume(float f10);

    void stop();

    /* renamed from: t */
    void mo33943t(d dVar);

    /* renamed from: u */
    boolean mo33944u();

    /* renamed from: v */
    void mo34201v(C11010c2 c11010c2);

    /* renamed from: w */
    int mo33945w();

    /* renamed from: x */
    boolean mo34202x();

    /* renamed from: y */
    int mo33946y();

    /* renamed from: z */
    void mo34203z(long j10);
}
