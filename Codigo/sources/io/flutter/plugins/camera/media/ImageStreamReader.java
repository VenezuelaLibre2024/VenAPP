package io.flutter.plugins.camera.media;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.camera.types.CameraCaptureProperties;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ImageStreamReader {
    private final int dartImageFormat;
    private final ImageReader imageReader;
    private final ImageStreamReaderUtils imageStreamReaderUtils;

    public ImageStreamReader(int i10, int i11, int i12, int i13) {
        this.dartImageFormat = i12;
        this.imageReader = ImageReader.newInstance(i10, i11, computeStreamImageFormat(i12), i13);
        this.imageStreamReaderUtils = new ImageStreamReaderUtils();
    }

    public ImageStreamReader(ImageReader imageReader, int i10, ImageStreamReaderUtils imageStreamReaderUtils) {
        this.imageReader = imageReader;
        this.dartImageFormat = i10;
        this.imageStreamReaderUtils = imageStreamReaderUtils;
    }

    public static int computeStreamImageFormat(int i10) {
        if (i10 == 17) {
            return 35;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onImageAvailable$1(EventChannel.EventSink eventSink, IllegalStateException illegalStateException) {
        eventSink.error("IllegalStateException", "Caught IllegalStateException: " + illegalStateException.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeListener$2(CameraCaptureProperties cameraCaptureProperties, EventChannel.EventSink eventSink, ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            return;
        }
        onImageAvailable(acquireNextImage, cameraCaptureProperties, eventSink);
    }

    public void close() {
        this.imageReader.close();
    }

    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    public void onImageAvailable(Image image, CameraCaptureProperties cameraCaptureProperties, final EventChannel.EventSink eventSink) {
        try {
            final HashMap hashMap = new HashMap();
            hashMap.put("planes", this.dartImageFormat == 17 ? parsePlanesForNv21(image) : parsePlanesForYuvOrJpeg(image));
            hashMap.put("width", Integer.valueOf(image.getWidth()));
            hashMap.put("height", Integer.valueOf(image.getHeight()));
            hashMap.put("format", Integer.valueOf(this.dartImageFormat));
            hashMap.put("lensAperture", cameraCaptureProperties.getLastLensAperture());
            hashMap.put("sensorExposureTime", cameraCaptureProperties.getLastSensorExposureTime());
            hashMap.put("sensorSensitivity", cameraCaptureProperties.getLastSensorSensitivity() == null ? null : Double.valueOf(r6.intValue()));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.camera.media.b
                @Override // java.lang.Runnable
                public final void run() {
                    EventChannel.EventSink.this.success(hashMap);
                }
            });
            image.close();
        } catch (IllegalStateException e10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.camera.media.c
                @Override // java.lang.Runnable
                public final void run() {
                    ImageStreamReader.lambda$onImageAvailable$1(EventChannel.EventSink.this, e10);
                }
            });
            image.close();
        }
    }

    public List<Map<String, Object>> parsePlanesForNv21(Image image) {
        ArrayList arrayList = new ArrayList();
        ByteBuffer yuv420ThreePlanesToNV21 = this.imageStreamReaderUtils.yuv420ThreePlanesToNV21(image.getPlanes(), image.getWidth(), image.getHeight());
        HashMap hashMap = new HashMap();
        hashMap.put("bytesPerRow", Integer.valueOf(image.getWidth()));
        hashMap.put("bytesPerPixel", 1);
        hashMap.put("bytes", yuv420ThreePlanesToNV21.array());
        arrayList.add(hashMap);
        return arrayList;
    }

    public List<Map<String, Object>> parsePlanesForYuvOrJpeg(Image image) {
        ArrayList arrayList = new ArrayList();
        for (Image.Plane plane : image.getPlanes()) {
            ByteBuffer buffer = plane.getBuffer();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr, 0, remaining);
            HashMap hashMap = new HashMap();
            hashMap.put("bytesPerRow", Integer.valueOf(plane.getRowStride()));
            hashMap.put("bytesPerPixel", Integer.valueOf(plane.getPixelStride()));
            hashMap.put("bytes", bArr);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public void removeListener(Handler handler) {
        this.imageReader.setOnImageAvailableListener(null, handler);
    }

    public void subscribeListener(final CameraCaptureProperties cameraCaptureProperties, final EventChannel.EventSink eventSink, Handler handler) {
        this.imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.plugins.camera.media.a
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                ImageStreamReader.this.lambda$subscribeListener$2(cameraCaptureProperties, eventSink, imageReader);
            }
        }, handler);
    }
}
