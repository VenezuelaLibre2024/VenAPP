package t6;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import t6.j3;
import t6.o;
import t8.l;

/* loaded from: classes.dex */
public interface j3 {

    /* loaded from: classes.dex */
    public static final class b implements o {

        /* renamed from: b */
        public static final b f26246b = new a().e();

        /* renamed from: c */
        private static final String f26247c = t8.r0.r0(0);

        /* renamed from: d */
        public static final o.a<b> f26248d = new o.a() { // from class: t6.k3
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                j3.b d10;
                d10 = j3.b.d(bundle);
                return d10;
            }
        };

        /* renamed from: a */
        private final t8.l f26249a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b */
            private static final int[] f26250b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a */
            private final l.b f26251a = new l.b();

            public a a(int i10) {
                this.f26251a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f26251a.b(bVar.f26249a);
                return this;
            }

            public a c(int... iArr) {
                this.f26251a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f26251a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f26251a.e());
            }
        }

        private b(t8.l lVar) {
            this.f26249a = lVar;
        }

        /* synthetic */ b(t8.l lVar, a aVar) {
            this(lVar);
        }

        public static b d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f26247c);
            if (integerArrayList == null) {
                return f26246b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f26249a.c(); i10++) {
                arrayList.add(Integer.valueOf(this.f26249a.b(i10)));
            }
            bundle.putIntegerArrayList(f26247c, arrayList);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f26249a.equals(((b) obj).f26249a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26249a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final t8.l f26252a;

        public c(t8.l lVar) {
            this.f26252a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f26252a.equals(((c) obj).f26252a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26252a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        default void onAudioAttributesChanged(v6.e eVar) {
        }

        default void onAudioSessionIdChanged(int i10) {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onCues(g8.f fVar) {
        }

        @Deprecated
        default void onCues(List<g8.b> list) {
        }

        default void onDeviceInfoChanged(v vVar) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onEvents(j3 j3Var, c cVar) {
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

        default void onMediaItemTransition(c2 c2Var, int i10) {
        }

        default void onMediaMetadataChanged(h2 h2Var) {
        }

        default void onMetadata(l7.a aVar) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlaybackParametersChanged(i3 i3Var) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerError(f3 f3Var) {
        }

        default void onPlayerErrorChanged(f3 f3Var) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onPlaylistMetadataChanged(h2 h2Var) {
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

        default void onTimelineChanged(d4 d4Var, int i10) {
        }

        default void onTrackSelectionParametersChanged(q8.y yVar) {
        }

        default void onTracksChanged(i4 i4Var) {
        }

        default void onVideoSizeChanged(u8.a0 a0Var) {
        }

        default void onVolumeChanged(float f10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements o {

        /* renamed from: a */
        public final Object f26258a;

        /* renamed from: b */
        @Deprecated
        public final int f26259b;

        /* renamed from: c */
        public final int f26260c;

        /* renamed from: d */
        public final c2 f26261d;

        /* renamed from: e */
        public final Object f26262e;

        /* renamed from: f */
        public final int f26263f;

        /* renamed from: r */
        public final long f26264r;

        /* renamed from: s */
        public final long f26265s;

        /* renamed from: t */
        public final int f26266t;

        /* renamed from: u */
        public final int f26267u;

        /* renamed from: v */
        private static final String f26253v = t8.r0.r0(0);

        /* renamed from: w */
        private static final String f26254w = t8.r0.r0(1);

        /* renamed from: x */
        private static final String f26255x = t8.r0.r0(2);

        /* renamed from: y */
        private static final String f26256y = t8.r0.r0(3);

        /* renamed from: z */
        private static final String f26257z = t8.r0.r0(4);
        private static final String A = t8.r0.r0(5);
        private static final String B = t8.r0.r0(6);
        public static final o.a<e> C = new o.a() { // from class: t6.l3
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                j3.e c10;
                c10 = j3.e.c(bundle);
                return c10;
            }
        };

        public e(Object obj, int i10, c2 c2Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f26258a = obj;
            this.f26259b = i10;
            this.f26260c = i10;
            this.f26261d = c2Var;
            this.f26262e = obj2;
            this.f26263f = i11;
            this.f26264r = j10;
            this.f26265s = j11;
            this.f26266t = i12;
            this.f26267u = i13;
        }

        public static e c(Bundle bundle) {
            int i10 = bundle.getInt(f26253v, 0);
            Bundle bundle2 = bundle.getBundle(f26254w);
            return new e(null, i10, bundle2 == null ? null : c2.f25878z.a(bundle2), null, bundle.getInt(f26255x, 0), bundle.getLong(f26256y, 0L), bundle.getLong(f26257z, 0L), bundle.getInt(A, -1), bundle.getInt(B, -1));
        }

        @Override // t6.o
        public Bundle a() {
            return d(true, true);
        }

        public Bundle d(boolean z10, boolean z11) {
            Bundle bundle = new Bundle();
            bundle.putInt(f26253v, z11 ? this.f26260c : 0);
            c2 c2Var = this.f26261d;
            if (c2Var != null && z10) {
                bundle.putBundle(f26254w, c2Var.a());
            }
            bundle.putInt(f26255x, z11 ? this.f26263f : 0);
            bundle.putLong(f26256y, z10 ? this.f26264r : 0L);
            bundle.putLong(f26257z, z10 ? this.f26265s : 0L);
            bundle.putInt(A, z10 ? this.f26266t : -1);
            bundle.putInt(B, z10 ? this.f26267u : -1);
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
            return this.f26260c == eVar.f26260c && this.f26263f == eVar.f26263f && this.f26264r == eVar.f26264r && this.f26265s == eVar.f26265s && this.f26266t == eVar.f26266t && this.f26267u == eVar.f26267u && eb.k.a(this.f26258a, eVar.f26258a) && eb.k.a(this.f26262e, eVar.f26262e) && eb.k.a(this.f26261d, eVar.f26261d);
        }

        public int hashCode() {
            return eb.k.b(this.f26258a, Integer.valueOf(this.f26260c), this.f26261d, this.f26262e, Integer.valueOf(this.f26263f), Long.valueOf(this.f26264r), Long.valueOf(this.f26265s), Integer.valueOf(this.f26266t), Integer.valueOf(this.f26267u));
        }
    }

    void A(float f10);

    long B();

    void C(int i10, List<c2> list);

    long D();

    boolean E();

    int F();

    int G();

    void H(int i10);

    int J();

    boolean K();

    boolean M();

    void a();

    void b(i3 i3Var);

    i3 c();

    void d();

    long e();

    void f(Surface surface);

    boolean g();

    long getDuration();

    long h();

    void i();

    f3 j();

    void k(boolean z10);

    i4 m();

    boolean n();

    int o();

    boolean p();

    void pause();

    int q();

    d4 r();

    void release();

    void s(d dVar);

    void setVolume(float f10);

    void stop();

    void t(d dVar);

    boolean u();

    void v(c2 c2Var);

    int w();

    boolean x();

    int y();

    void z(long j10);
}
