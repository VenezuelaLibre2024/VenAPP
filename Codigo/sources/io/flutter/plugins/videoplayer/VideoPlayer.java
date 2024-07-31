package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import io.flutter.plugin.common.EventChannel;
import io.flutter.view.TextureRegistry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s8.j;
import s8.r;
import s8.s;
import t6.c2;
import t6.d4;
import t6.f3;
import t6.h2;
import t6.i3;
import t6.i4;
import t6.j3;
import t6.u1;
import t6.v;
import t6.y;
import t8.r0;
import v6.e;
import v7.a0;
import v7.q0;

/* loaded from: classes3.dex */
final class VideoPlayer {
    private static final String FORMAT_DASH = "dash";
    private static final String FORMAT_HLS = "hls";
    private static final String FORMAT_OTHER = "other";
    private static final String FORMAT_SS = "ss";
    private static final String USER_AGENT = "User-Agent";
    private final EventChannel eventChannel;
    private QueuingEventSink eventSink;
    private y exoPlayer;
    private s.b httpDataSourceFactory;
    boolean isInitialized;
    private final VideoPlayerOptions options;
    private Surface surface;
    private final TextureRegistry.SurfaceTextureEntry textureEntry;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoPlayer(Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, String str, String str2, Map<String, String> map, VideoPlayerOptions videoPlayerOptions) {
        this.isInitialized = false;
        this.httpDataSourceFactory = new s.b();
        this.eventChannel = eventChannel;
        this.textureEntry = surfaceTextureEntry;
        this.options = videoPlayerOptions;
        y e10 = new y.b(context).e();
        Uri parse = Uri.parse(str);
        buildHttpDataSourceFactory(map);
        e10.I(buildMediaSource(parse, new r.a(context, this.httpDataSourceFactory), str2));
        e10.a();
        setUpVideoPlayer(e10, new QueuingEventSink());
    }

    VideoPlayer(y yVar, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, VideoPlayerOptions videoPlayerOptions, QueuingEventSink queuingEventSink, s.b bVar) {
        this.isInitialized = false;
        new s.b();
        this.eventChannel = eventChannel;
        this.textureEntry = surfaceTextureEntry;
        this.options = videoPlayerOptions;
        this.httpDataSourceFactory = bVar;
        setUpVideoPlayer(yVar, queuingEventSink);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private a0 buildMediaSource(Uri uri, j.a aVar, String str) {
        char c10;
        int i10;
        if (str != null) {
            switch (str.hashCode()) {
                case 3680:
                    if (str.equals(FORMAT_SS)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 103407:
                    if (str.equals(FORMAT_HLS)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3075986:
                    if (str.equals(FORMAT_DASH)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106069776:
                    if (str.equals(FORMAT_OTHER)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 1;
                    break;
                case 1:
                    i10 = 2;
                    break;
                case 2:
                    i10 = 0;
                    break;
                case 3:
                    i10 = 4;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = r0.n0(uri);
        }
        if (i10 == 0) {
            return new DashMediaSource.Factory(new c.a(aVar), aVar).a(c2.e(uri));
        }
        if (i10 == 1) {
            return new SsMediaSource.Factory(new a.C0143a(aVar), aVar).a(c2.e(uri));
        }
        if (i10 == 2) {
            return new HlsMediaSource.Factory(aVar).a(c2.e(uri));
        }
        if (i10 == 4) {
            return new q0.b(aVar).a(c2.e(uri));
        }
        throw new IllegalStateException("Unsupported type: " + i10);
    }

    private static void setAudioAttributes(y yVar, boolean z10) {
        yVar.L(new e.C0459e().c(3).a(), !z10);
    }

    private void setUpVideoPlayer(final y yVar, final QueuingEventSink queuingEventSink) {
        this.exoPlayer = yVar;
        this.eventSink = queuingEventSink;
        this.eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: io.flutter.plugins.videoplayer.VideoPlayer.1
            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object obj) {
                queuingEventSink.setDelegate(null);
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object obj, EventChannel.EventSink eventSink) {
                queuingEventSink.setDelegate(eventSink);
            }
        });
        Surface surface = new Surface(this.textureEntry.surfaceTexture());
        this.surface = surface;
        yVar.f(surface);
        setAudioAttributes(yVar, this.options.mixWithOthers);
        yVar.s(new j3.d() { // from class: io.flutter.plugins.videoplayer.VideoPlayer.2
            private boolean isBuffering = false;

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(v6.e eVar) {
                super.onAudioAttributesChanged(eVar);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
                super.onAudioSessionIdChanged(i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(j3.b bVar) {
                super.onAvailableCommandsChanged(bVar);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onCues(g8.f fVar) {
                super.onCues(fVar);
            }

            @Override // t6.j3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
                super.onCues((List<g8.b>) list);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(v vVar) {
                super.onDeviceInfoChanged(vVar);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
                super.onDeviceVolumeChanged(i10, z10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onEvents(j3 j3Var, j3.c cVar) {
                super.onEvents(j3Var, cVar);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
                super.onIsLoadingChanged(z10);
            }

            @Override // t6.j3.d
            public void onIsPlayingChanged(boolean z10) {
                if (queuingEventSink != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "isPlayingStateUpdate");
                    hashMap.put("isPlaying", Boolean.valueOf(z10));
                    queuingEventSink.success(hashMap);
                }
            }

            @Override // t6.j3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
                super.onLoadingChanged(z10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
                super.onMaxSeekToPreviousPositionChanged(j10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onMediaItemTransition(c2 c2Var, int i10) {
                super.onMediaItemTransition(c2Var, i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(h2 h2Var) {
                super.onMediaMetadataChanged(h2Var);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onMetadata(l7.a aVar) {
                super.onMetadata(aVar);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
                super.onPlayWhenReadyChanged(z10, i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(i3 i3Var) {
                super.onPlaybackParametersChanged(i3Var);
            }

            @Override // t6.j3.d
            public void onPlaybackStateChanged(int i10) {
                if (i10 == 2) {
                    setBuffering(true);
                    VideoPlayer.this.sendBufferingUpdate();
                } else if (i10 == 3) {
                    VideoPlayer videoPlayer = VideoPlayer.this;
                    if (!videoPlayer.isInitialized) {
                        videoPlayer.isInitialized = true;
                        videoPlayer.sendInitialized();
                    }
                } else if (i10 == 4) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "completed");
                    queuingEventSink.success(hashMap);
                }
                if (i10 != 2) {
                    setBuffering(false);
                }
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
                super.onPlaybackSuppressionReasonChanged(i10);
            }

            @Override // t6.j3.d
            public void onPlayerError(f3 f3Var) {
                setBuffering(false);
                if (f3Var.f26090a == 1002) {
                    yVar.i();
                    yVar.a();
                    return;
                }
                QueuingEventSink queuingEventSink2 = queuingEventSink;
                if (queuingEventSink2 != null) {
                    queuingEventSink2.error("VideoError", "Video player had error " + f3Var, null);
                }
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(f3 f3Var) {
                super.onPlayerErrorChanged(f3Var);
            }

            @Override // t6.j3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
                super.onPlayerStateChanged(z10, i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h2 h2Var) {
                super.onPlaylistMetadataChanged(h2Var);
            }

            @Override // t6.j3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
                super.onPositionDiscontinuity(i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(j3.e eVar, j3.e eVar2, int i10) {
                super.onPositionDiscontinuity(eVar, eVar2, i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
                super.onRepeatModeChanged(i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
                super.onSeekBackIncrementChanged(j10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
                super.onSeekForwardIncrementChanged(j10);
            }

            @Override // t6.j3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                super.onSeekProcessed();
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
                super.onShuffleModeEnabledChanged(z10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
                super.onSkipSilenceEnabledChanged(z10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
                super.onSurfaceSizeChanged(i10, i11);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onTimelineChanged(d4 d4Var, int i10) {
                super.onTimelineChanged(d4Var, i10);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(q8.y yVar2) {
                super.onTrackSelectionParametersChanged(yVar2);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onTracksChanged(i4 i4Var) {
                super.onTracksChanged(i4Var);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(u8.a0 a0Var) {
                super.onVideoSizeChanged(a0Var);
            }

            @Override // t6.j3.d
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
                super.onVolumeChanged(f10);
            }

            public void setBuffering(boolean z10) {
                if (this.isBuffering != z10) {
                    this.isBuffering = z10;
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", this.isBuffering ? "bufferingStart" : "bufferingEnd");
                    queuingEventSink.success(hashMap);
                }
            }
        });
    }

    public void buildHttpDataSourceFactory(Map<String, String> map) {
        boolean z10 = !map.isEmpty();
        this.httpDataSourceFactory.e((z10 && map.containsKey(USER_AGENT)) ? map.get(USER_AGENT) : "ExoPlayer").c(true);
        if (z10) {
            this.httpDataSourceFactory.d(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispose() {
        if (this.isInitialized) {
            this.exoPlayer.stop();
        }
        this.textureEntry.release();
        this.eventChannel.setStreamHandler(null);
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        y yVar = this.exoPlayer;
        if (yVar != null) {
            yVar.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getPosition() {
        return this.exoPlayer.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pause() {
        this.exoPlayer.k(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void play() {
        this.exoPlayer.k(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void seekTo(int i10) {
        this.exoPlayer.z(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendBufferingUpdate() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(this.exoPlayer.D()))));
        this.eventSink.success(hashMap);
    }

    void sendInitialized() {
        if (this.isInitialized) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.exoPlayer.getDuration()));
            if (this.exoPlayer.l() != null) {
                u1 l10 = this.exoPlayer.l();
                int i10 = l10.B;
                int i11 = l10.C;
                int i12 = l10.E;
                if (i12 == 90 || i12 == 270) {
                    i10 = this.exoPlayer.l().C;
                    i11 = this.exoPlayer.l().B;
                }
                hashMap.put("width", Integer.valueOf(i10));
                hashMap.put("height", Integer.valueOf(i11));
                if (i12 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i12));
                }
            }
            this.eventSink.success(hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLooping(boolean z10) {
        this.exoPlayer.H(z10 ? 2 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlaybackSpeed(double d10) {
        this.exoPlayer.b(new i3((float) d10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVolume(double d10) {
        this.exoPlayer.setVolume((float) Math.max(0.0d, Math.min(1.0d, d10)));
    }
}
