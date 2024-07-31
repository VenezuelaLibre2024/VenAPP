package io.flutter.plugins.camera.media;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaRecorder;
import io.flutter.plugins.camera.SdkCapabilityChecker;
import java.util.List;

/* loaded from: classes3.dex */
public class MediaRecorderBuilder {
    private final CamcorderProfile camcorderProfile;
    private boolean enableAudio;
    private final EncoderProfiles encoderProfiles;
    private int mediaOrientation;
    private final String outputFilePath;
    private final MediaRecorderFactory recorderFactory;

    /* loaded from: classes3.dex */
    static class MediaRecorderFactory {
        MediaRecorderFactory() {
        }

        MediaRecorder makeMediaRecorder() {
            return new MediaRecorder();
        }
    }

    public MediaRecorderBuilder(CamcorderProfile camcorderProfile, String str) {
        this(camcorderProfile, str, new MediaRecorderFactory());
    }

    MediaRecorderBuilder(CamcorderProfile camcorderProfile, String str, MediaRecorderFactory mediaRecorderFactory) {
        this.outputFilePath = str;
        this.camcorderProfile = camcorderProfile;
        this.encoderProfiles = null;
        this.recorderFactory = mediaRecorderFactory;
    }

    public MediaRecorderBuilder(EncoderProfiles encoderProfiles, String str) {
        this(encoderProfiles, str, new MediaRecorderFactory());
    }

    MediaRecorderBuilder(EncoderProfiles encoderProfiles, String str, MediaRecorderFactory mediaRecorderFactory) {
        this.outputFilePath = str;
        this.encoderProfiles = encoderProfiles;
        this.camcorderProfile = null;
        this.recorderFactory = mediaRecorderFactory;
    }

    public MediaRecorder build() {
        int i10;
        int i11;
        EncoderProfiles encoderProfiles;
        List videoProfiles;
        List audioProfiles;
        int recommendedFileFormat;
        int codec;
        int bitrate;
        int frameRate;
        int codec2;
        int bitrate2;
        int sampleRate;
        MediaRecorder makeMediaRecorder = this.recorderFactory.makeMediaRecorder();
        if (this.enableAudio) {
            makeMediaRecorder.setAudioSource(1);
        }
        makeMediaRecorder.setVideoSource(2);
        if (!SdkCapabilityChecker.supportsEncoderProfiles() || (encoderProfiles = this.encoderProfiles) == null) {
            CamcorderProfile camcorderProfile = this.camcorderProfile;
            if (camcorderProfile != null) {
                makeMediaRecorder.setOutputFormat(camcorderProfile.fileFormat);
                if (this.enableAudio) {
                    makeMediaRecorder.setAudioEncoder(this.camcorderProfile.audioCodec);
                    makeMediaRecorder.setAudioEncodingBitRate(this.camcorderProfile.audioBitRate);
                    makeMediaRecorder.setAudioSamplingRate(this.camcorderProfile.audioSampleRate);
                }
                makeMediaRecorder.setVideoEncoder(this.camcorderProfile.videoCodec);
                makeMediaRecorder.setVideoEncodingBitRate(this.camcorderProfile.videoBitRate);
                makeMediaRecorder.setVideoFrameRate(this.camcorderProfile.videoFrameRate);
                CamcorderProfile camcorderProfile2 = this.camcorderProfile;
                i10 = camcorderProfile2.videoFrameWidth;
                i11 = camcorderProfile2.videoFrameHeight;
            }
            makeMediaRecorder.setOutputFile(this.outputFilePath);
            makeMediaRecorder.setOrientationHint(this.mediaOrientation);
            makeMediaRecorder.prepare();
            return makeMediaRecorder;
        }
        videoProfiles = encoderProfiles.getVideoProfiles();
        EncoderProfiles.VideoProfile videoProfile = (EncoderProfiles.VideoProfile) videoProfiles.get(0);
        audioProfiles = this.encoderProfiles.getAudioProfiles();
        EncoderProfiles.AudioProfile audioProfile = (EncoderProfiles.AudioProfile) audioProfiles.get(0);
        recommendedFileFormat = this.encoderProfiles.getRecommendedFileFormat();
        makeMediaRecorder.setOutputFormat(recommendedFileFormat);
        if (this.enableAudio) {
            codec2 = audioProfile.getCodec();
            makeMediaRecorder.setAudioEncoder(codec2);
            bitrate2 = audioProfile.getBitrate();
            makeMediaRecorder.setAudioEncodingBitRate(bitrate2);
            sampleRate = audioProfile.getSampleRate();
            makeMediaRecorder.setAudioSamplingRate(sampleRate);
        }
        codec = videoProfile.getCodec();
        makeMediaRecorder.setVideoEncoder(codec);
        bitrate = videoProfile.getBitrate();
        makeMediaRecorder.setVideoEncodingBitRate(bitrate);
        frameRate = videoProfile.getFrameRate();
        makeMediaRecorder.setVideoFrameRate(frameRate);
        i10 = videoProfile.getWidth();
        i11 = videoProfile.getHeight();
        makeMediaRecorder.setVideoSize(i10, i11);
        makeMediaRecorder.setOutputFile(this.outputFilePath);
        makeMediaRecorder.setOrientationHint(this.mediaOrientation);
        makeMediaRecorder.prepare();
        return makeMediaRecorder;
    }

    public MediaRecorderBuilder setEnableAudio(boolean z10) {
        this.enableAudio = z10;
        return this;
    }

    public MediaRecorderBuilder setMediaOrientation(int i10) {
        this.mediaOrientation = i10;
        return this;
    }
}
