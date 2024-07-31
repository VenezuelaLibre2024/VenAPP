package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcfp extends zzcfr implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcgl zzd;
    private final zzcgm zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcgj zzn;
    private final boolean zzo;
    private int zzp;
    private zzcfq zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcfp(Context context, zzcgl zzcglVar, boolean z10, boolean z11, zzcgk zzcgkVar, zzcgm zzcgmVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzcglVar;
        this.zze = zzcgmVar;
        this.zzo = z10;
        this.zzf = z11;
        zzcgmVar.zza(this);
    }

    private final void zzD() {
        u1.a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            t.m();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzo) {
                zzcgj zzcgjVar = new zzcgj(getContext());
                this.zzn = zzcgjVar;
                zzcgjVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzn.start();
                SurfaceTexture zzb = this.zzn.zzb();
                if (zzb != null) {
                    surfaceTexture = zzb;
                } else {
                    this.zzn.zze();
                    this.zzn = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            t.n();
            this.zzi.setSurface(new Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzF(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e10) {
            zzcec.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e10);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzE(boolean z10) {
        u1.a("AdMediaPlayerView release");
        zzcgj zzcgjVar = this.zzn;
        if (zzcgjVar != null) {
            zzcgjVar.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z10) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i10) {
        if (i10 == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i10;
    }

    private final void zzG(float f10) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            zzcec.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean zzH() {
        int i10;
        return (this.zzi == null || (i10 = this.zzg) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzl(zzcfp zzcfpVar, MediaPlayer mediaPlayer) {
        String string;
        String str;
        MediaFormat format;
        if (!((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() || zzcfpVar.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcfpVar.zzs = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    string = format2.getString("codecs-string");
                                    str = "videoCodec";
                                    hashMap.put(str, string);
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                string = format.getString("codecs-string");
                                str = "audioCodec";
                                hashMap.put(str, string);
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                zzcfpVar.zzd.zzd("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e10) {
            t.q().zzw(e10, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.zzm = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        u1.a("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        j2.f8993l.post(new zzcfi(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        zzcec.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzh = -1;
        j2.f8993l.post(new zzcfj(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        u1.a("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i10))) + ":" + ((String) map.get(Integer.valueOf(i11))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzk
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L7a
            int r2 = r5.zzl
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.zzcgj r2 = r5.zzn
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L42
            if (r1 != r2) goto L41
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
            goto L52
        L41:
            r0 = r2
        L42:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L51
            if (r0 <= r7) goto L51
            goto L60
        L51:
            r1 = r0
        L52:
            r0 = r6
            goto L7a
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L52
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcgj r6 = r5.zzn
            if (r6 == 0) goto L84
            r6.zzc(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfp.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        u1.a("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        j2.f8993l.post(new zzcfh(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i10 = this.zzp;
        if (i10 != 0) {
            zzq(i10);
        }
        if (this.zzf && zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            u1.a("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long a10 = t.b().a();
            while (zzH() && this.zzi.getCurrentPosition() == currentPosition && t.b().a() - a10 <= 250) {
            }
            this.zzi.pause();
            zzn();
        }
        zzcec.zzi("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        u1.a("AdMediaPlayerView surface created");
        zzD();
        j2.f8993l.post(new zzcfk(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u1.a("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzcgj zzcgjVar = this.zzn;
        if (zzcgjVar != null) {
            zzcgjVar.zze();
        }
        j2.f8993l.post(new zzcfm(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        u1.a("AdMediaPlayerView surface changed");
        int i12 = this.zzh;
        boolean z10 = false;
        if (this.zzk == i10 && this.zzl == i11) {
            z10 = true;
        }
        if (this.zzi != null && i12 == 3 && z10) {
            int i13 = this.zzp;
            if (i13 != 0) {
                zzq(i13);
            }
            zzp();
        }
        zzcgj zzcgjVar = this.zzn;
        if (zzcgjVar != null) {
            zzcgjVar.zzc(i10, i11);
        }
        j2.f8993l.post(new zzcfl(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        u1.a("AdMediaPlayerView size changed: " + i10 + " x " + i11);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        u1.a("AdMediaPlayerView window visibility changed to " + i10);
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
            @Override // java.lang.Runnable
            public final void run() {
                zzcfp.this.zzm(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.View
    public final String toString() {
        return zzcfp.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zzb() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        metrics = this.zzi.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * this.zzm) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final long zzh() {
        if (this.zzs != null) {
            return zzc() * this.zzs.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(int i10) {
        zzcfq zzcfqVar = this.zzq;
        if (zzcfqVar != null) {
            zzcfqVar.onWindowVisibilityChanged(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr, com.google.android.gms.internal.ads.zzcgo
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzo() {
        u1.a("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            j2.f8993l.post(new zzcfo(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzp() {
        u1.a("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            j2.f8993l.post(new zzcfn(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzq(int i10) {
        u1.a("AdMediaPlayerView seek " + i10);
        if (!zzH()) {
            this.zzp = i10;
        } else {
            this.zzi.seekTo(i10);
            this.zzp = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzr(zzcfq zzcfqVar) {
        this.zzq = zzcfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzbbb zza = zzbbb.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzj = parse;
            this.zzp = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzt() {
        u1.a("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzu(float f10, float f11) {
        zzcgj zzcgjVar = this.zzn;
        if (zzcgjVar != null) {
            zzcgjVar.zzf(f10, f11);
        }
    }
}