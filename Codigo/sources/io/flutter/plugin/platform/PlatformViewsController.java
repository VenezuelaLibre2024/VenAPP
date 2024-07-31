package io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PlatformViewsController implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController";
    private static Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = {SurfaceView.class};
    private AndroidTouchProcessor androidTouchProcessor;
    private Context context;
    private FlutterView flutterView;
    private PlatformViewsChannel platformViewsChannel;
    private TextInputPlugin textInputPlugin;
    private TextureRegistry textureRegistry;
    private int nextOverlayLayerId = 0;
    private boolean flutterViewConvertedToImageView = false;
    private boolean synchronizeToNativeViewHierarchy = true;
    private boolean usesSoftwareRendering = false;
    private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new AnonymousClass1();
    private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
    final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap<>();
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    final HashMap<Context, View> contextToEmbeddedView = new HashMap<>();
    private final SparseArray<PlatformOverlayView> overlayLayerViews = new SparseArray<>();
    private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
    private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
    private final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.PlatformViewsController$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements PlatformViewsChannel.PlatformViewsHandler {
        AnonymousClass1() {
        }

        private void configureForHybridComposition(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            Log.i(PlatformViewsController.TAG, "Using hybrid composition for platform view: " + platformViewCreationRequest.viewId);
        }

        private long configureForTextureLayerComposition(PlatformView platformView, final PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewWrapper platformViewWrapper;
            long j10;
            ensureValidAndroidVersion(23);
            Log.i(PlatformViewsController.TAG, "Hosting view in view hierarchy for platform view: " + platformViewCreationRequest.viewId);
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalWidth);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalHeight);
            if (PlatformViewsController.this.usesSoftwareRendering) {
                platformViewWrapper = new PlatformViewWrapper(PlatformViewsController.this.context);
                j10 = -1;
            } else {
                TextureRegistry.SurfaceTextureEntry createSurfaceTexture = PlatformViewsController.this.textureRegistry.createSurfaceTexture();
                PlatformViewWrapper platformViewWrapper2 = new PlatformViewWrapper(PlatformViewsController.this.context, createSurfaceTexture);
                long id2 = createSurfaceTexture.id();
                platformViewWrapper = platformViewWrapper2;
                j10 = id2;
            }
            platformViewWrapper.setTouchProcessor(PlatformViewsController.this.androidTouchProcessor);
            platformViewWrapper.setBufferSize(physicalPixels, physicalPixels2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
            int physicalPixels3 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalTop);
            int physicalPixels4 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalLeft);
            layoutParams.topMargin = physicalPixels3;
            layoutParams.leftMargin = physicalPixels4;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = platformView.getView();
            view.setLayoutParams(new FrameLayout.LayoutParams(physicalPixels, physicalPixels2));
            view.setImportantForAccessibility(4);
            platformViewWrapper.addView(view);
            platformViewWrapper.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.h
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z10) {
                    PlatformViewsController.AnonymousClass1.this.lambda$configureForTextureLayerComposition$2(platformViewCreationRequest, view2, z10);
                }
            });
            PlatformViewsController.this.flutterView.addView(platformViewWrapper);
            PlatformViewsController.this.viewWrappers.append(platformViewCreationRequest.viewId, platformViewWrapper);
            return j10;
        }

        private long configureForVirtualDisplay(PlatformView platformView, final PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            ensureValidAndroidVersion(20);
            Log.i(PlatformViewsController.TAG, "Hosting view in a virtual display for platform view: " + platformViewCreationRequest.viewId);
            TextureRegistry.SurfaceTextureEntry createSurfaceTexture = PlatformViewsController.this.textureRegistry.createSurfaceTexture();
            VirtualDisplayController create = VirtualDisplayController.create(PlatformViewsController.this.context, PlatformViewsController.this.accessibilityEventsDelegate, platformView, createSurfaceTexture, PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalWidth), PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalHeight), platformViewCreationRequest.viewId, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.j
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    PlatformViewsController.AnonymousClass1.this.lambda$configureForVirtualDisplay$1(platformViewCreationRequest, view, z10);
                }
            });
            if (create != null) {
                if (PlatformViewsController.this.flutterView != null) {
                    create.onFlutterViewAttached(PlatformViewsController.this.flutterView);
                }
                PlatformViewsController.this.vdControllers.put(Integer.valueOf(platformViewCreationRequest.viewId), create);
                View view = platformView.getView();
                PlatformViewsController.this.contextToEmbeddedView.put(view.getContext(), view);
                return createSurfaceTexture.id();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
        }

        private PlatformView createPlatformView(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, boolean z10) {
            PlatformViewFactory factory = PlatformViewsController.this.registry.getFactory(platformViewCreationRequest.viewType);
            if (factory == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
            }
            PlatformView create = factory.create(z10 ? new MutableContextWrapper(PlatformViewsController.this.context) : PlatformViewsController.this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
            View view = create.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            view.setLayoutDirection(platformViewCreationRequest.direction);
            PlatformViewsController.this.platformViews.put(platformViewCreationRequest.viewId, create);
            return create;
        }

        private void ensureValidAndroidVersion(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= i10) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
        }

        private void ensureValidRequest(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            if (PlatformViewsController.validateDirection(platformViewCreationRequest.direction)) {
                return;
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + platformViewCreationRequest.viewId + ")");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$configureForTextureLayerComposition$2(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z10) {
            PlatformViewsController platformViewsController = PlatformViewsController.this;
            if (z10) {
                platformViewsController.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            } else if (platformViewsController.textInputPlugin != null) {
                PlatformViewsController.this.textInputPlugin.clearPlatformViewClient(platformViewCreationRequest.viewId);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$configureForVirtualDisplay$1(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z10) {
            if (z10) {
                PlatformViewsController.this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resize$0(VirtualDisplayController virtualDisplayController, float f10, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            PlatformViewsController.this.unlockInputConnection(virtualDisplayController);
            if (PlatformViewsController.this.context != null) {
                f10 = PlatformViewsController.this.getDisplayDensity();
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getBufferWidth(), f10), PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getBufferHeight(), f10)));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void clearFocus(int i10) {
            View view;
            StringBuilder sb2;
            String str;
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).getView();
            } else {
                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
                if (platformView == null) {
                    sb2 = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb2.append(str);
                    sb2.append(i10);
                    Log.e(PlatformViewsController.TAG, sb2.toString());
                }
                view = platformView.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            sb2 = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb2.append(str);
            sb2.append(i10);
            Log.e(PlatformViewsController.TAG, sb2.toString());
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            ensureValidAndroidVersion(19);
            ensureValidRequest(platformViewCreationRequest);
            configureForHybridComposition(createPlatformView(platformViewCreationRequest, false), platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            ensureValidRequest(platformViewCreationRequest);
            int i10 = platformViewCreationRequest.viewId;
            if (PlatformViewsController.this.viewWrappers.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            }
            if (PlatformViewsController.this.textureRegistry == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            }
            if (PlatformViewsController.this.flutterView == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            }
            PlatformView createPlatformView = createPlatformView(platformViewCreationRequest, true);
            View view = createPlatformView.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (!(ViewUtils.hasChildViewOfType(view, PlatformViewsController.VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY) ? false : true)) {
                if (platformViewCreationRequest.displayMode == PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                    configureForHybridComposition(createPlatformView, platformViewCreationRequest);
                    return -2L;
                }
                if (!PlatformViewsController.this.usesSoftwareRendering) {
                    return configureForVirtualDisplay(createPlatformView, platformViewCreationRequest);
                }
            }
            return configureForTextureLayerComposition(createPlatformView, platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void dispose(int i10) {
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController.TAG, "Disposing unknown platform view with id: " + i10);
                return;
            }
            PlatformViewsController.this.platformViews.remove(i10);
            try {
                platformView.dispose();
            } catch (RuntimeException e10) {
                Log.e(PlatformViewsController.TAG, "Disposing platform view threw an exception", e10);
            }
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                View view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).getView();
                if (view != null) {
                    PlatformViewsController.this.contextToEmbeddedView.remove(view.getContext());
                }
                PlatformViewsController.this.vdControllers.remove(Integer.valueOf(i10));
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i10);
            if (platformViewWrapper != null) {
                platformViewWrapper.removeAllViews();
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup = (ViewGroup) platformViewWrapper.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(platformViewWrapper);
                }
                PlatformViewsController.this.viewWrappers.remove(i10);
                return;
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController.this.platformViewParent.get(i10);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController.this.platformViewParent.remove(i10);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void offset(int i10, double d10, double d11) {
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i10);
            if (platformViewWrapper == null) {
                Log.e(PlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i10);
                return;
            }
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(d10);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(d11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
            layoutParams.topMargin = physicalPixels;
            layoutParams.leftMargin = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            int i10 = platformViewTouch.viewId;
            float f10 = PlatformViewsController.this.context.getResources().getDisplayMetrics().density;
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f10, platformViewTouch, true));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f10, platformViewTouch, false));
                return;
            }
            Log.e(PlatformViewsController.TAG, "Sending touch to a null view with id: " + i10);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, final PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
            int i10 = platformViewResizeRequest.viewId;
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                final float displayDensity = PlatformViewsController.this.getDisplayDensity();
                final VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10));
                PlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(physicalPixels, physicalPixels2, new Runnable() { // from class: io.flutter.plugin.platform.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlatformViewsController.AnonymousClass1.this.lambda$resize$0(virtualDisplayController, displayDensity, platformViewBufferResized);
                    }
                });
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i10);
            if (platformView == null || platformViewWrapper == null) {
                Log.e(PlatformViewsController.TAG, "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (physicalPixels > platformViewWrapper.getBufferWidth() || physicalPixels2 > platformViewWrapper.getBufferHeight()) {
                platformViewWrapper.setBufferSize(physicalPixels, physicalPixels2);
            }
            ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = physicalPixels;
            layoutParams.height = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = platformView.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = physicalPixels;
                layoutParams2.height = physicalPixels2;
                view.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getBufferWidth()), PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getBufferHeight())));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void setDirection(int i10, int i11) {
            View view;
            StringBuilder sb2;
            String str;
            if (!PlatformViewsController.validateDirection(i11)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i11 + "(view id: " + i10 + ")");
            }
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).getView();
            } else {
                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
                if (platformView == null) {
                    sb2 = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb2.append(str);
                    sb2.append(i10);
                    Log.e(PlatformViewsController.TAG, sb2.toString());
                }
                view = platformView.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i11);
                return;
            }
            sb2 = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb2.append(str);
            sb2.append(i10);
            Log.e(PlatformViewsController.TAG, sb2.toString());
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void synchronizeToNativeViewHierarchy(boolean z10) {
            PlatformViewsController.this.synchronizeToNativeViewHierarchy = z10;
        }
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private void finishFrame(boolean z10) {
        for (int i10 = 0; i10 < this.overlayLayerViews.size(); i10++) {
            int keyAt = this.overlayLayerViews.keyAt(i10);
            PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i10);
            if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(keyAt))) {
                this.flutterView.attachOverlaySurfaceToRender(valueAt);
                z10 &= valueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
                this.flutterView.removeView(valueAt);
            }
        }
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            int keyAt2 = this.platformViewParent.keyAt(i11);
            FlutterMutatorView flutterMutatorView = this.platformViewParent.get(keyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(keyAt2)) || (!z10 && this.synchronizeToNativeViewHierarchy)) {
                flutterMutatorView.setVisibility(8);
            } else {
                flutterMutatorView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void initializeRootImageViewIfNeeded() {
        if (!this.synchronizeToNativeViewHierarchy || this.flutterViewConvertedToImageView) {
            return;
        }
        this.flutterView.convertToImageView();
        this.flutterViewConvertedToImageView = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializePlatformViewIfNeeded$0(int i10, View view, boolean z10) {
        if (z10) {
            this.platformViewsChannel.invokeViewFocused(i10);
            return;
        }
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEndFrame$1() {
        finishFrame(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f10;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f10;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f10;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f10;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f10;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f10;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            Log.e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.overlayLayerViews.size(); i10++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i10));
        }
        this.overlayLayerViews.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d10) {
        return toLogicalPixels(d10, getDisplayDensity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d10, float f10) {
        return (int) Math.round(d10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toPhysicalPixels(double d10) {
        return (int) Math.round(d10 * getDisplayDensity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateDirection(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void attach(Context context, TextureRegistry textureRegistry, DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        this.textureRegistry = textureRegistry;
        PlatformViewsChannel platformViewsChannel = new PlatformViewsChannel(dartExecutor);
        this.platformViewsChannel = platformViewsChannel;
        platformViewsChannel.setPlatformViewsHandler(this.channelHandler);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i10 = 0; i10 < this.viewWrappers.size(); i10++) {
            this.flutterView.addView(this.viewWrappers.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.platformViews.size(); i12++) {
            this.platformViews.valueAt(i12).onFlutterViewAttached(this.flutterView);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.contextToEmbeddedView.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new PlatformOverlayView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), this.accessibilityEventsDelegate));
    }

    public FlutterOverlaySurface createOverlaySurface(PlatformOverlayView platformOverlayView) {
        int i10 = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i10 + 1;
        this.overlayLayerViews.put(i10, platformOverlayView);
        return new FlutterOverlaySurface(i10, platformOverlayView.getSurface());
    }

    public void destroyOverlaySurfaces() {
        for (int i10 = 0; i10 < this.overlayLayerViews.size(); i10++) {
            PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i10);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    public void detach() {
        PlatformViewsChannel platformViewsChannel = this.platformViewsChannel;
        if (platformViewsChannel != null) {
            platformViewsChannel.setPlatformViewsHandler(null);
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        for (int i10 = 0; i10 < this.viewWrappers.size(); i10++) {
            this.flutterView.removeView(this.viewWrappers.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i11));
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
        for (int i12 = 0; i12 < this.platformViews.size(); i12++) {
            this.platformViews.valueAt(i12).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public SparseArray<PlatformOverlayView> getOverlayLayerViews() {
        return this.overlayLayerViews;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public View getPlatformViewById(int i10) {
        if (usesVirtualDisplay(i10)) {
            return this.vdControllers.get(Integer.valueOf(i10)).getView();
        }
        PlatformView platformView = this.platformViews.get(i10);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    void initializePlatformViewIfNeeded(final int i10) {
        PlatformView platformView = this.platformViews.get(i10);
        if (platformView == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.platformViewParent.get(i10) != null) {
            return;
        }
        View view = platformView.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.context;
        FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        flutterMutatorView.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                PlatformViewsController.this.lambda$initializePlatformViewIfNeeded$0(i10, view2, z10);
            }
        });
        this.platformViewParent.put(i10, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
    }

    public void onAttachedToJNI() {
    }

    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayOverlaySurface(int i10, int i11, int i12, int i13, int i14) {
        if (this.overlayLayerViews.get(i10) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
        }
        initializeRootImageViewIfNeeded();
        PlatformOverlayView platformOverlayView = this.overlayLayerViews.get(i10);
        if (platformOverlayView.getParent() == null) {
            this.flutterView.addView(platformOverlayView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        platformOverlayView.setLayoutParams(layoutParams);
        platformOverlayView.setVisibility(0);
        platformOverlayView.bringToFront();
        this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i10));
    }

    public void onDisplayPlatformView(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
        initializePlatformViewIfNeeded(i10);
        FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i10);
        flutterMutatorView.readyToDisplay(flutterMutatorsStack, i11, i12, i13, i14);
        flutterMutatorView.setVisibility(0);
        flutterMutatorView.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View view = this.platformViews.get(i10).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i10));
    }

    public void onEndFrame() {
        boolean z10 = false;
        if (this.flutterViewConvertedToImageView && this.currentFrameUsedPlatformViewIds.isEmpty()) {
            this.flutterViewConvertedToImageView = false;
            this.flutterView.revertImageView(new Runnable() { // from class: io.flutter.plugin.platform.g
                @Override // java.lang.Runnable
                public final void run() {
                    PlatformViewsController.this.lambda$onEndFrame$1();
                }
            });
        } else {
            if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
                z10 = true;
            }
            finishFrame(z10);
        }
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void setSoftwareRendering(boolean z10) {
        this.usesSoftwareRendering = z10;
    }

    public MotionEvent toMotionEvent(float f10, PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z10) {
        MotionEvent pop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f10).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        return (z10 || pop == null) ? MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, pointerPropertiesArr, pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags) : MotionEvent.obtain(pop.getDownTime(), pop.getEventTime(), platformViewTouch.action, platformViewTouch.pointerCount, pointerPropertiesArr, pointerCoordsArr, pop.getMetaState(), pop.getButtonState(), pop.getXPrecision(), pop.getYPrecision(), pop.getDeviceId(), pop.getEdgeFlags(), pop.getSource(), pop.getFlags());
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i10) {
        return this.vdControllers.containsKey(Integer.valueOf(i10));
    }
}
