package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.f;
import f.d;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.imagepicker.ImagePickerDelegate;
import io.flutter.plugins.imagepicker.Messages;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class ImagePickerDelegate implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {
    static final int REQUEST_CAMERA_IMAGE_PERMISSION = 2345;
    static final int REQUEST_CAMERA_VIDEO_PERMISSION = 2355;
    static final int REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY = 2342;
    static final int REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY = 2347;
    static final int REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY = 2346;
    static final int REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY = 2352;
    static final int REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA = 2343;
    static final int REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA = 2353;
    private final Activity activity;
    private final ImagePickerCache cache;
    private CameraDevice cameraDevice;
    private final ExecutorService executor;
    final String fileProviderName;
    private final FileUriResolver fileUriResolver;
    private final FileUtils fileUtils;
    private final ImageResizer imageResizer;
    private PendingCallState pendingCallState;
    private final Object pendingCallStateLock;
    private Uri pendingCameraMediaUri;
    private final PermissionManager permissionManager;

    /* renamed from: io.flutter.plugins.imagepicker.ImagePickerDelegate$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements FileUriResolver {
        final /* synthetic */ Activity val$activity;

        AnonymousClass2(Activity activity) {
            this.val$activity = activity;
        }

        @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.FileUriResolver
        public void getFullImagePath(Uri uri, final OnPathReadyListener onPathReadyListener) {
            Activity activity = this.val$activity;
            String[] strArr = new String[1];
            strArr[0] = uri != null ? uri.getPath() : "";
            MediaScannerConnection.scanFile(activity, strArr, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.i
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    ImagePickerDelegate.OnPathReadyListener.this.onPathReady(str);
                }
            });
        }

        @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.FileUriResolver
        public Uri resolveFileProviderUriForFile(String str, File file) {
            return androidx.core.content.e.getUriForFile(this.val$activity, str, file);
        }
    }

    /* loaded from: classes3.dex */
    public enum CameraDevice {
        REAR,
        FRONT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface FileUriResolver {
        void getFullImagePath(Uri uri, OnPathReadyListener onPathReadyListener);

        Uri resolveFileProviderUriForFile(String str, File file);
    }

    /* loaded from: classes3.dex */
    public class MediaPath {
        final String mimeType;
        final String path;

        public MediaPath(String str, String str2) {
            this.path = str;
            this.mimeType = str2;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public String getPath() {
            return this.path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface OnPathReadyListener {
        void onPathReady(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PendingCallState {
        public final Messages.ImageSelectionOptions imageOptions;
        public final Messages.Result<List<String>> result;
        public final Messages.VideoSelectionOptions videoOptions;

        PendingCallState(Messages.ImageSelectionOptions imageSelectionOptions, Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result) {
            this.imageOptions = imageSelectionOptions;
            this.videoOptions = videoSelectionOptions;
            this.result = result;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface PermissionManager {
        void askForPermission(String str, int i10);

        boolean isPermissionGranted(String str);

        boolean needRequestCameraPermission();
    }

    public ImagePickerDelegate(final Activity activity, ImageResizer imageResizer, ImagePickerCache imagePickerCache) {
        this(activity, imageResizer, null, null, null, imagePickerCache, new PermissionManager() { // from class: io.flutter.plugins.imagepicker.ImagePickerDelegate.1
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public void askForPermission(String str, int i10) {
                androidx.core.app.b.g(activity, new String[]{str}, i10);
            }

            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public boolean isPermissionGranted(String str) {
                return androidx.core.content.a.checkSelfPermission(activity, str) == 0;
            }

            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public boolean needRequestCameraPermission() {
                return ImagePickerUtils.needRequestCameraPermission(activity);
            }
        }, new AnonymousClass2(activity), new FileUtils(), Executors.newSingleThreadExecutor());
    }

    ImagePickerDelegate(Activity activity, ImageResizer imageResizer, Messages.ImageSelectionOptions imageSelectionOptions, Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result, ImagePickerCache imagePickerCache, PermissionManager permissionManager, FileUriResolver fileUriResolver, FileUtils fileUtils, ExecutorService executorService) {
        this.pendingCallStateLock = new Object();
        this.activity = activity;
        this.imageResizer = imageResizer;
        this.fileProviderName = activity.getPackageName() + ".flutter.image_provider";
        if (result != null) {
            this.pendingCallState = new PendingCallState(imageSelectionOptions, videoSelectionOptions, result);
        }
        this.permissionManager = permissionManager;
        this.fileUriResolver = fileUriResolver;
        this.fileUtils = fileUtils;
        this.cache = imagePickerCache;
        this.executor = executorService;
    }

    private File createTemporaryWritableFile(String str) {
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(uuid, str, cacheDir);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File createTemporaryWritableImageFile() {
        return createTemporaryWritableFile(".jpg");
    }

    private File createTemporaryWritableVideoFile() {
        return createTemporaryWritableFile(".mp4");
    }

    private void finishWithAlreadyActiveError(Messages.Result<List<String>> result) {
        result.error(new Messages.FlutterError("already_active", "Image picker is already active", null));
    }

    private void finishWithError(String str, String str2) {
        Messages.Result<List<String>> result;
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            result = pendingCallState != null ? pendingCallState.result : null;
            this.pendingCallState = null;
        }
        if (result == null) {
            this.cache.saveResult(null, str, str2);
        } else {
            result.error(new Messages.FlutterError(str, str2, null));
        }
    }

    private void finishWithListSuccess(ArrayList<String> arrayList) {
        Messages.Result<List<String>> result;
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            result = pendingCallState != null ? pendingCallState.result : null;
            this.pendingCallState = null;
        }
        if (result == null) {
            this.cache.saveResult(arrayList, null, null);
        } else {
            result.success(arrayList);
        }
    }

    private void finishWithSuccess(String str) {
        Messages.Result<List<String>> result;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            result = pendingCallState != null ? pendingCallState.result : null;
            this.pendingCallState = null;
        }
        if (result != null) {
            result.success(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.cache.saveResult(arrayList, null, null);
        }
    }

    private String getResizedImagePath(String str, Messages.ImageSelectionOptions imageSelectionOptions) {
        return this.imageResizer.resizeImageIfNeeded(str, imageSelectionOptions.getMaxWidth(), imageSelectionOptions.getMaxHeight(), imageSelectionOptions.getQuality().intValue());
    }

    private void grantUriPermissions(Intent intent, Uri uri) {
        Iterator<ResolveInfo> it = this.activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            this.activity.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCaptureImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$2(int i10) {
        if (i10 != -1) {
            finishWithSuccess(null);
            return;
        }
        Uri uri = this.pendingCameraMediaUri;
        FileUriResolver fileUriResolver = this.fileUriResolver;
        if (uri == null) {
            uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
        }
        fileUriResolver.getFullImagePath(uri, new OnPathReadyListener() { // from class: io.flutter.plugins.imagepicker.g
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.OnPathReadyListener
            public final void onPathReady(String str) {
                ImagePickerDelegate.this.lambda$handleCaptureImageResult$6(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCaptureVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$5(int i10) {
        if (i10 != -1) {
            finishWithSuccess(null);
            return;
        }
        Uri uri = this.pendingCameraMediaUri;
        FileUriResolver fileUriResolver = this.fileUriResolver;
        if (uri == null) {
            uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
        }
        fileUriResolver.getFullImagePath(uri, new OnPathReadyListener() { // from class: io.flutter.plugins.imagepicker.h
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.OnPathReadyListener
            public final void onPathReady(String str) {
                ImagePickerDelegate.this.handleVideoResult(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleChooseImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$0(int i10, Intent intent) {
        ClipData clipData;
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        Uri data = intent.getData();
        if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() == 1) {
            data = clipData.getItemAt(0).getUri();
        }
        if (data == null) {
            finishWithError("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            handleImageResult(this.fileUtils.getPathFromUri(this.activity, data), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleChooseMediaResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$3(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> arrayList = new ArrayList<>();
        if (intent.getClipData() != null) {
            for (int i11 = 0; i11 < intent.getClipData().getItemCount(); i11++) {
                Uri uri = intent.getClipData().getItemAt(i11).getUri();
                arrayList.add(new MediaPath(this.fileUtils.getPathFromUri(this.activity, uri), this.activity.getContentResolver().getType(uri)));
            }
        } else {
            arrayList.add(new MediaPath(this.fileUtils.getPathFromUri(this.activity, intent.getData()), null));
        }
        handleMediaResult(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleChooseMultiImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$1(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> arrayList = new ArrayList<>();
        if (intent.getClipData() != null) {
            for (int i11 = 0; i11 < intent.getClipData().getItemCount(); i11++) {
                arrayList.add(new MediaPath(this.fileUtils.getPathFromUri(this.activity, intent.getClipData().getItemAt(i11).getUri()), null));
            }
        } else {
            arrayList.add(new MediaPath(this.fileUtils.getPathFromUri(this.activity, intent.getData()), null));
        }
        handleMediaResult(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleChooseVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$4(int i10, Intent intent) {
        ClipData clipData;
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        Uri data = intent.getData();
        if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() == 1) {
            data = clipData.getItemAt(0).getUri();
        }
        if (data == null) {
            finishWithError("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            handleVideoResult(this.fileUtils.getPathFromUri(this.activity, data));
        }
    }

    private void handleMediaResult(ArrayList<MediaPath> arrayList) {
        Messages.ImageSelectionOptions imageSelectionOptions;
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            imageSelectionOptions = pendingCallState != null ? pendingCallState.imageOptions : null;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i10 = 0;
        if (imageSelectionOptions != null) {
            while (i10 < arrayList.size()) {
                MediaPath mediaPath = arrayList.get(i10);
                String str = mediaPath.path;
                String str2 = mediaPath.mimeType;
                if (str2 == null || !str2.startsWith("video/")) {
                    str = getResizedImagePath(mediaPath.path, imageSelectionOptions);
                }
                arrayList2.add(str);
                i10++;
            }
        } else {
            while (i10 < arrayList.size()) {
                arrayList2.add(arrayList.get(i10).path);
                i10++;
            }
        }
        finishWithListSuccess(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleVideoResult(String str) {
        finishWithSuccess(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleCaptureImageResult$6(String str) {
        handleImageResult(str, true);
    }

    private void launchMultiPickImageFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new f.c().a(this.activity, new f.a().b(d.c.f14838a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY);
    }

    private void launchPickImageFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new f.d().a(this.activity, new f.a().b(d.c.f14838a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY);
    }

    private void launchPickMediaFromGalleryIntent(Messages.GeneralOptions generalOptions) {
        Intent intent;
        if (generalOptions.getUsePhotoPicker().booleanValue()) {
            intent = generalOptions.getAllowMultiple().booleanValue() ? new f.c().a(this.activity, new f.a().b(d.b.f14837a).a()) : new f.d().a(this.activity, new f.a().b(d.b.f14837a).a());
        } else {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("*/*");
            intent2.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", generalOptions.getAllowMultiple());
            intent = intent2;
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY);
    }

    private void launchPickVideoFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new f.d().a(this.activity, new f.a().b(d.e.f14840a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY);
    }

    private void launchTakeImageWithCameraIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.cameraDevice == CameraDevice.FRONT) {
            useFrontCamera(intent);
        }
        File createTemporaryWritableImageFile = createTemporaryWritableImageFile();
        this.pendingCameraMediaUri = Uri.parse("file:" + createTemporaryWritableImageFile.getAbsolutePath());
        Uri resolveFileProviderUriForFile = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, createTemporaryWritableImageFile);
        intent.putExtra("output", resolveFileProviderUriForFile);
        grantUriPermissions(intent, resolveFileProviderUriForFile);
        try {
            try {
                this.activity.startActivityForResult(intent, REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA);
            } catch (SecurityException e10) {
                e10.printStackTrace();
                finishWithError("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (ActivityNotFoundException unused) {
            createTemporaryWritableImageFile.delete();
            finishWithError("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void launchTakeVideoWithCameraIntent() {
        Messages.VideoSelectionOptions videoSelectionOptions;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            videoSelectionOptions = pendingCallState != null ? pendingCallState.videoOptions : null;
        }
        if (videoSelectionOptions != null && videoSelectionOptions.getMaxDurationSeconds() != null) {
            intent.putExtra("android.intent.extra.durationLimit", videoSelectionOptions.getMaxDurationSeconds().intValue());
        }
        if (this.cameraDevice == CameraDevice.FRONT) {
            useFrontCamera(intent);
        }
        File createTemporaryWritableVideoFile = createTemporaryWritableVideoFile();
        this.pendingCameraMediaUri = Uri.parse("file:" + createTemporaryWritableVideoFile.getAbsolutePath());
        Uri resolveFileProviderUriForFile = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, createTemporaryWritableVideoFile);
        intent.putExtra("output", resolveFileProviderUriForFile);
        grantUriPermissions(intent, resolveFileProviderUriForFile);
        try {
            try {
                this.activity.startActivityForResult(intent, REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA);
            } catch (SecurityException e10) {
                e10.printStackTrace();
                finishWithError("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (ActivityNotFoundException unused) {
            createTemporaryWritableVideoFile.delete();
            finishWithError("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean needRequestCameraPermission() {
        PermissionManager permissionManager = this.permissionManager;
        if (permissionManager == null) {
            return false;
        }
        return permissionManager.needRequestCameraPermission();
    }

    private boolean setPendingOptionsAndResult(Messages.ImageSelectionOptions imageSelectionOptions, Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result) {
        synchronized (this.pendingCallStateLock) {
            if (this.pendingCallState != null) {
                return false;
            }
            this.pendingCallState = new PendingCallState(imageSelectionOptions, videoSelectionOptions, result);
            this.cache.clear();
            return true;
        }
    }

    private void useFrontCamera(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i10 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    public void chooseImageFromGallery(Messages.ImageSelectionOptions imageSelectionOptions, boolean z10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            launchPickImageFromGalleryIntent(Boolean.valueOf(z10));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMediaFromGallery(Messages.MediaSelectionOptions mediaSelectionOptions, Messages.GeneralOptions generalOptions, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(mediaSelectionOptions.getImageSelectionOptions(), null, result)) {
            launchPickMediaFromGalleryIntent(generalOptions);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMultiImageFromGallery(Messages.ImageSelectionOptions imageSelectionOptions, boolean z10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            launchMultiPickImageFromGalleryIntent(Boolean.valueOf(z10));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseVideoFromGallery(Messages.VideoSelectionOptions videoSelectionOptions, boolean z10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            launchPickVideoFromGalleryIntent(Boolean.valueOf(z10));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    void handleImageResult(String str, boolean z10) {
        Messages.ImageSelectionOptions imageSelectionOptions;
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            imageSelectionOptions = pendingCallState != null ? pendingCallState.imageOptions : null;
        }
        if (imageSelectionOptions == null) {
            finishWithSuccess(str);
            return;
        }
        String resizedImagePath = getResizedImagePath(str, imageSelectionOptions);
        if (resizedImagePath != null && !resizedImagePath.equals(str) && z10) {
            new File(str).delete();
        }
        finishWithSuccess(resizedImagePath);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, final int i11, final Intent intent) {
        Runnable runnable;
        if (i10 == REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.a
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePickerDelegate.this.lambda$onActivityResult$0(i11, intent);
                }
            };
        } else if (i10 == REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePickerDelegate.this.lambda$onActivityResult$2(i11);
                }
            };
        } else if (i10 == REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.b
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePickerDelegate.this.lambda$onActivityResult$1(i11, intent);
                }
            };
        } else if (i10 == REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.d
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePickerDelegate.this.lambda$onActivityResult$3(i11, intent);
                }
            };
        } else if (i10 == REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.e
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePickerDelegate.this.lambda$onActivityResult$4(i11, intent);
                }
            };
        } else {
            if (i10 != REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA) {
                return false;
            }
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.f
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePickerDelegate.this.lambda$onActivityResult$5(i11);
                }
            };
        }
        this.executor.execute(runnable);
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != REQUEST_CAMERA_IMAGE_PERMISSION) {
            if (i10 != REQUEST_CAMERA_VIDEO_PERMISSION) {
                return false;
            }
            if (z10) {
                launchTakeVideoWithCameraIntent();
            }
        } else if (z10) {
            launchTakeImageWithCameraIntent();
        }
        if (!z10 && (i10 == REQUEST_CAMERA_IMAGE_PERMISSION || i10 == REQUEST_CAMERA_VIDEO_PERMISSION)) {
            finishWithError("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Messages.CacheRetrievalResult retrieveLostImage() {
        Map<String, Object> cacheMap = this.cache.getCacheMap();
        if (cacheMap.isEmpty()) {
            return null;
        }
        Messages.CacheRetrievalResult.Builder builder = new Messages.CacheRetrievalResult.Builder();
        Messages.CacheRetrievalType cacheRetrievalType = (Messages.CacheRetrievalType) cacheMap.get("type");
        if (cacheRetrievalType != null) {
            builder.setType(cacheRetrievalType);
        }
        builder.setError((Messages.CacheRetrievalError) cacheMap.get("error"));
        ArrayList arrayList = (ArrayList) cacheMap.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Double d10 = (Double) cacheMap.get("maxWidth");
                Double d11 = (Double) cacheMap.get("maxHeight");
                Integer num = (Integer) cacheMap.get("imageQuality");
                arrayList2.add(this.imageResizer.resizeImageIfNeeded(str, d10, d11, num == null ? 100 : num.intValue()));
            }
            builder.setPaths(arrayList2);
        }
        this.cache.clear();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveStateBeforeResult() {
        synchronized (this.pendingCallStateLock) {
            PendingCallState pendingCallState = this.pendingCallState;
            if (pendingCallState == null) {
                return;
            }
            Messages.ImageSelectionOptions imageSelectionOptions = pendingCallState.imageOptions;
            this.cache.saveType(imageSelectionOptions != null ? ImagePickerCache.CacheType.IMAGE : ImagePickerCache.CacheType.VIDEO);
            if (imageSelectionOptions != null) {
                this.cache.saveDimensionWithOutputOptions(imageSelectionOptions);
            }
            Uri uri = this.pendingCameraMediaUri;
            if (uri != null) {
                this.cache.savePendingCameraMediaUriPath(uri);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCameraDevice(CameraDevice cameraDevice) {
        this.cameraDevice = cameraDevice;
    }

    public void takeImageWithCamera(Messages.ImageSelectionOptions imageSelectionOptions, Messages.Result<List<String>> result) {
        if (!setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeImageWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_IMAGE_PERMISSION);
        }
    }

    public void takeVideoWithCamera(Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result) {
        if (!setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeVideoWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_VIDEO_PERMISSION);
        }
    }
}
