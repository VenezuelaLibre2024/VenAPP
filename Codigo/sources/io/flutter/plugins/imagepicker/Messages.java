package io.flutter.plugins.imagepicker;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.imagepicker.Messages;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Messages {

    /* loaded from: classes3.dex */
    public static final class CacheRetrievalError {
        private String code;
        private String message;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private String code;
            private String message;

            public CacheRetrievalError build() {
                CacheRetrievalError cacheRetrievalError = new CacheRetrievalError();
                cacheRetrievalError.setCode(this.code);
                cacheRetrievalError.setMessage(this.message);
                return cacheRetrievalError;
            }

            public Builder setCode(String str) {
                this.code = str;
                return this;
            }

            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }
        }

        CacheRetrievalError() {
        }

        static CacheRetrievalError fromList(ArrayList<Object> arrayList) {
            CacheRetrievalError cacheRetrievalError = new CacheRetrievalError();
            cacheRetrievalError.setCode((String) arrayList.get(0));
            cacheRetrievalError.setMessage((String) arrayList.get(1));
            return cacheRetrievalError;
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setCode(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            this.code = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.code);
            arrayList.add(this.message);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CacheRetrievalResult {
        private CacheRetrievalError error;
        private List<String> paths;
        private CacheRetrievalType type;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private CacheRetrievalError error;
            private List<String> paths;
            private CacheRetrievalType type;

            public CacheRetrievalResult build() {
                CacheRetrievalResult cacheRetrievalResult = new CacheRetrievalResult();
                cacheRetrievalResult.setType(this.type);
                cacheRetrievalResult.setError(this.error);
                cacheRetrievalResult.setPaths(this.paths);
                return cacheRetrievalResult;
            }

            public Builder setError(CacheRetrievalError cacheRetrievalError) {
                this.error = cacheRetrievalError;
                return this;
            }

            public Builder setPaths(List<String> list) {
                this.paths = list;
                return this;
            }

            public Builder setType(CacheRetrievalType cacheRetrievalType) {
                this.type = cacheRetrievalType;
                return this;
            }
        }

        CacheRetrievalResult() {
        }

        static CacheRetrievalResult fromList(ArrayList<Object> arrayList) {
            CacheRetrievalResult cacheRetrievalResult = new CacheRetrievalResult();
            Object obj = arrayList.get(0);
            cacheRetrievalResult.setType(obj == null ? null : CacheRetrievalType.values()[((Integer) obj).intValue()]);
            Object obj2 = arrayList.get(1);
            cacheRetrievalResult.setError(obj2 != null ? CacheRetrievalError.fromList((ArrayList) obj2) : null);
            cacheRetrievalResult.setPaths((List) arrayList.get(2));
            return cacheRetrievalResult;
        }

        public CacheRetrievalError getError() {
            return this.error;
        }

        public List<String> getPaths() {
            return this.paths;
        }

        public CacheRetrievalType getType() {
            return this.type;
        }

        public void setError(CacheRetrievalError cacheRetrievalError) {
            this.error = cacheRetrievalError;
        }

        public void setPaths(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.paths = list;
        }

        public void setType(CacheRetrievalType cacheRetrievalType) {
            if (cacheRetrievalType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = cacheRetrievalType;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            CacheRetrievalType cacheRetrievalType = this.type;
            arrayList.add(cacheRetrievalType == null ? null : Integer.valueOf(cacheRetrievalType.index));
            CacheRetrievalError cacheRetrievalError = this.error;
            arrayList.add(cacheRetrievalError != null ? cacheRetrievalError.toList() : null);
            arrayList.add(this.paths);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public enum CacheRetrievalType {
        IMAGE(0),
        VIDEO(1);

        final int index;

        CacheRetrievalType(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class GeneralOptions {
        private Boolean allowMultiple;
        private Boolean usePhotoPicker;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private Boolean allowMultiple;
            private Boolean usePhotoPicker;

            public GeneralOptions build() {
                GeneralOptions generalOptions = new GeneralOptions();
                generalOptions.setAllowMultiple(this.allowMultiple);
                generalOptions.setUsePhotoPicker(this.usePhotoPicker);
                return generalOptions;
            }

            public Builder setAllowMultiple(Boolean bool) {
                this.allowMultiple = bool;
                return this;
            }

            public Builder setUsePhotoPicker(Boolean bool) {
                this.usePhotoPicker = bool;
                return this;
            }
        }

        GeneralOptions() {
        }

        static GeneralOptions fromList(ArrayList<Object> arrayList) {
            GeneralOptions generalOptions = new GeneralOptions();
            generalOptions.setAllowMultiple((Boolean) arrayList.get(0));
            generalOptions.setUsePhotoPicker((Boolean) arrayList.get(1));
            return generalOptions;
        }

        public Boolean getAllowMultiple() {
            return this.allowMultiple;
        }

        public Boolean getUsePhotoPicker() {
            return this.usePhotoPicker;
        }

        public void setAllowMultiple(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            }
            this.allowMultiple = bool;
        }

        public void setUsePhotoPicker(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
            }
            this.usePhotoPicker = bool;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.allowMultiple);
            arrayList.add(this.usePhotoPicker);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public interface ImagePickerApi {
        static MessageCodec<Object> getCodec() {
            return ImagePickerApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(ImagePickerApi imagePickerApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            imagePickerApi.pickImages((SourceSpecification) arrayList2.get(0), (ImageSelectionOptions) arrayList2.get(1), (GeneralOptions) arrayList2.get(2), new Result<List<String>>() { // from class: io.flutter.plugins.imagepicker.Messages.ImagePickerApi.1
                @Override // io.flutter.plugins.imagepicker.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.imagepicker.Messages.Result
                public void success(List<String> list) {
                    arrayList.add(0, list);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(ImagePickerApi imagePickerApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            imagePickerApi.pickVideos((SourceSpecification) arrayList2.get(0), (VideoSelectionOptions) arrayList2.get(1), (GeneralOptions) arrayList2.get(2), new Result<List<String>>() { // from class: io.flutter.plugins.imagepicker.Messages.ImagePickerApi.2
                @Override // io.flutter.plugins.imagepicker.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.imagepicker.Messages.Result
                public void success(List<String> list) {
                    arrayList.add(0, list);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(ImagePickerApi imagePickerApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            imagePickerApi.pickMedia((MediaSelectionOptions) arrayList2.get(0), (GeneralOptions) arrayList2.get(1), new Result<List<String>>() { // from class: io.flutter.plugins.imagepicker.Messages.ImagePickerApi.3
                @Override // io.flutter.plugins.imagepicker.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.imagepicker.Messages.Result
                public void success(List<String> list) {
                    arrayList.add(0, list);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(ImagePickerApi imagePickerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, imagePickerApi.retrieveLostResults());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final ImagePickerApi imagePickerApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.ImagePickerApi.pickImages", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (imagePickerApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.ImagePickerApi.lambda$setup$0(Messages.ImagePickerApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.ImagePickerApi.pickVideos", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (imagePickerApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.ImagePickerApi.lambda$setup$1(Messages.ImagePickerApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.ImagePickerApi.pickMedia", getCodec());
            if (imagePickerApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.ImagePickerApi.lambda$setup$2(Messages.ImagePickerApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.ImagePickerApi.retrieveLostResults", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (imagePickerApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.ImagePickerApi.lambda$setup$3(Messages.ImagePickerApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
        }

        void pickImages(SourceSpecification sourceSpecification, ImageSelectionOptions imageSelectionOptions, GeneralOptions generalOptions, Result<List<String>> result);

        void pickMedia(MediaSelectionOptions mediaSelectionOptions, GeneralOptions generalOptions, Result<List<String>> result);

        void pickVideos(SourceSpecification sourceSpecification, VideoSelectionOptions videoSelectionOptions, GeneralOptions generalOptions, Result<List<String>> result);

        CacheRetrievalResult retrieveLostResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ImagePickerApiCodec extends StandardMessageCodec {
        public static final ImagePickerApiCodec INSTANCE = new ImagePickerApiCodec();

        private ImagePickerApiCodec() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return CacheRetrievalError.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return CacheRetrievalResult.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return GeneralOptions.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return ImageSelectionOptions.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return MediaSelectionOptions.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return SourceSpecification.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return VideoSelectionOptions.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof CacheRetrievalError) {
                byteArrayOutputStream.write(RecognitionOptions.ITF);
                list = ((CacheRetrievalError) obj).toList();
            } else if (obj instanceof CacheRetrievalResult) {
                byteArrayOutputStream.write(129);
                list = ((CacheRetrievalResult) obj).toList();
            } else if (obj instanceof GeneralOptions) {
                byteArrayOutputStream.write(130);
                list = ((GeneralOptions) obj).toList();
            } else if (obj instanceof ImageSelectionOptions) {
                byteArrayOutputStream.write(131);
                list = ((ImageSelectionOptions) obj).toList();
            } else if (obj instanceof MediaSelectionOptions) {
                byteArrayOutputStream.write(132);
                list = ((MediaSelectionOptions) obj).toList();
            } else if (obj instanceof SourceSpecification) {
                byteArrayOutputStream.write(133);
                list = ((SourceSpecification) obj).toList();
            } else if (!(obj instanceof VideoSelectionOptions)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(134);
                list = ((VideoSelectionOptions) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ImageSelectionOptions {
        private Double maxHeight;
        private Double maxWidth;
        private Long quality;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private Double maxHeight;
            private Double maxWidth;
            private Long quality;

            public ImageSelectionOptions build() {
                ImageSelectionOptions imageSelectionOptions = new ImageSelectionOptions();
                imageSelectionOptions.setMaxWidth(this.maxWidth);
                imageSelectionOptions.setMaxHeight(this.maxHeight);
                imageSelectionOptions.setQuality(this.quality);
                return imageSelectionOptions;
            }

            public Builder setMaxHeight(Double d10) {
                this.maxHeight = d10;
                return this;
            }

            public Builder setMaxWidth(Double d10) {
                this.maxWidth = d10;
                return this;
            }

            public Builder setQuality(Long l10) {
                this.quality = l10;
                return this;
            }
        }

        ImageSelectionOptions() {
        }

        static ImageSelectionOptions fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            ImageSelectionOptions imageSelectionOptions = new ImageSelectionOptions();
            imageSelectionOptions.setMaxWidth((Double) arrayList.get(0));
            imageSelectionOptions.setMaxHeight((Double) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            imageSelectionOptions.setQuality(valueOf);
            return imageSelectionOptions;
        }

        public Double getMaxHeight() {
            return this.maxHeight;
        }

        public Double getMaxWidth() {
            return this.maxWidth;
        }

        public Long getQuality() {
            return this.quality;
        }

        public void setMaxHeight(Double d10) {
            this.maxHeight = d10;
        }

        public void setMaxWidth(Double d10) {
            this.maxWidth = d10;
        }

        public void setQuality(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.quality = l10;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.maxWidth);
            arrayList.add(this.maxHeight);
            arrayList.add(this.quality);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class MediaSelectionOptions {
        private ImageSelectionOptions imageSelectionOptions;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private ImageSelectionOptions imageSelectionOptions;

            public MediaSelectionOptions build() {
                MediaSelectionOptions mediaSelectionOptions = new MediaSelectionOptions();
                mediaSelectionOptions.setImageSelectionOptions(this.imageSelectionOptions);
                return mediaSelectionOptions;
            }

            public Builder setImageSelectionOptions(ImageSelectionOptions imageSelectionOptions) {
                this.imageSelectionOptions = imageSelectionOptions;
                return this;
            }
        }

        MediaSelectionOptions() {
        }

        static MediaSelectionOptions fromList(ArrayList<Object> arrayList) {
            MediaSelectionOptions mediaSelectionOptions = new MediaSelectionOptions();
            Object obj = arrayList.get(0);
            mediaSelectionOptions.setImageSelectionOptions(obj == null ? null : ImageSelectionOptions.fromList((ArrayList) obj));
            return mediaSelectionOptions;
        }

        public ImageSelectionOptions getImageSelectionOptions() {
            return this.imageSelectionOptions;
        }

        public void setImageSelectionOptions(ImageSelectionOptions imageSelectionOptions) {
            if (imageSelectionOptions == null) {
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            }
            this.imageSelectionOptions = imageSelectionOptions;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            ImageSelectionOptions imageSelectionOptions = this.imageSelectionOptions;
            arrayList.add(imageSelectionOptions == null ? null : imageSelectionOptions.toList());
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public interface Result<T> {
        void error(Throwable th2);

        void success(T t10);
    }

    /* loaded from: classes3.dex */
    public enum SourceCamera {
        REAR(0),
        FRONT(1);

        final int index;

        SourceCamera(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SourceSpecification {
        private SourceCamera camera;
        private SourceType type;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private SourceCamera camera;
            private SourceType type;

            public SourceSpecification build() {
                SourceSpecification sourceSpecification = new SourceSpecification();
                sourceSpecification.setType(this.type);
                sourceSpecification.setCamera(this.camera);
                return sourceSpecification;
            }

            public Builder setCamera(SourceCamera sourceCamera) {
                this.camera = sourceCamera;
                return this;
            }

            public Builder setType(SourceType sourceType) {
                this.type = sourceType;
                return this;
            }
        }

        SourceSpecification() {
        }

        static SourceSpecification fromList(ArrayList<Object> arrayList) {
            SourceSpecification sourceSpecification = new SourceSpecification();
            Object obj = arrayList.get(0);
            sourceSpecification.setType(obj == null ? null : SourceType.values()[((Integer) obj).intValue()]);
            Object obj2 = arrayList.get(1);
            sourceSpecification.setCamera(obj2 != null ? SourceCamera.values()[((Integer) obj2).intValue()] : null);
            return sourceSpecification;
        }

        public SourceCamera getCamera() {
            return this.camera;
        }

        public SourceType getType() {
            return this.type;
        }

        public void setCamera(SourceCamera sourceCamera) {
            this.camera = sourceCamera;
        }

        public void setType(SourceType sourceType) {
            if (sourceType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = sourceType;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            SourceType sourceType = this.type;
            arrayList.add(sourceType == null ? null : Integer.valueOf(sourceType.index));
            SourceCamera sourceCamera = this.camera;
            arrayList.add(sourceCamera != null ? Integer.valueOf(sourceCamera.index) : null);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public enum SourceType {
        CAMERA(0),
        GALLERY(1);

        final int index;

        SourceType(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class VideoSelectionOptions {
        private Long maxDurationSeconds;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private Long maxDurationSeconds;

            public VideoSelectionOptions build() {
                VideoSelectionOptions videoSelectionOptions = new VideoSelectionOptions();
                videoSelectionOptions.setMaxDurationSeconds(this.maxDurationSeconds);
                return videoSelectionOptions;
            }

            public Builder setMaxDurationSeconds(Long l10) {
                this.maxDurationSeconds = l10;
                return this;
            }
        }

        static VideoSelectionOptions fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            VideoSelectionOptions videoSelectionOptions = new VideoSelectionOptions();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            videoSelectionOptions.setMaxDurationSeconds(valueOf);
            return videoSelectionOptions;
        }

        public Long getMaxDurationSeconds() {
            return this.maxDurationSeconds;
        }

        public void setMaxDurationSeconds(Long l10) {
            this.maxDurationSeconds = l10;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.maxDurationSeconds);
            return arrayList;
        }
    }

    protected static ArrayList<Object> wrapError(Throwable th2) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            obj = flutterError.details;
        } else {
            arrayList.add(th2.toString());
            arrayList.add(th2.getClass().getSimpleName());
            obj = "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
