.class public Lio/flutter/plugins/camera/VideoRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static TAG:Ljava/lang/String; = "VideoRenderer"

.field private static final fragmentShaderCode:Ljava/lang/String; = " #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n\n            varying vec2 varUvs;\n            uniform samplerExternalOES texSampler;\n\n            void main()\n            {\n                vec4 c = texture2D(texSampler, varUvs);\n                gl_FragColor = vec4(c.r, c.g, c.b, c.a);\n            }"

.field private static final vertexShaderCode:Ljava/lang/String; = "  precision highp float;\n            attribute vec3 vertexPosition;\n            attribute vec2 uvs;\n            varying vec2 varUvs;\n            uniform mat4 texMatrix;\n            uniform mat4 mvp;\n\n            void main()\n            {\n                varUvs = (texMatrix * vec4(uvs.x, uvs.y, 0, 1.0)).xy;\n                gl_Position = mvp * vec4(vertexPosition, 1.0);\n            }"


# instance fields
.field private final bufferHandles:[I

.field context:Landroid/opengl/EGLContext;

.field display:Landroid/opengl/EGLDisplay;

.field private final indices:[I

.field private inputSurface:Landroid/view/Surface;

.field inputSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field private final lock:Ljava/lang/Object;

.field private mvpHandle:I

.field private final outputSurface:Landroid/view/Surface;

.field private program:I

.field final recordingHeight:I

.field final recordingWidth:I

.field private rotation:I

.field surface:Landroid/opengl/EGLSurface;

.field final surfaceTextureAvailableFrameLock:Ljava/lang/Object;

.field surfaceTextureFrameAvailable:Ljava/lang/Boolean;

.field private surfaceTextureFrameAvailableHandler:Landroid/os/HandlerThread;

.field private texMatrixHandle:I

.field private final textureHandles:[I

.field private thread:Ljava/lang/Thread;

.field private final uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private uvsHandle:I

.field private vertexHandle:I

.field private final vertices:[F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;IILjava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->textureHandles:[I

    const/16 v0, 0x14

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->vertices:[F

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->indices:[I

    const/4 v0, 0x0

    iput v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->vertexHandle:I

    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    iput v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->uvsHandle:I

    iput v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->texMatrixHandle:I

    iput v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->mvpHandle:I

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureAvailableFrameLock:Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureFrameAvailable:Ljava/lang/Boolean;

    iput v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->rotation:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->lock:Ljava/lang/Object;

    iput-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->outputSurface:Landroid/view/Surface;

    iput p3, p0, Lio/flutter/plugins/camera/VideoRenderer;->recordingHeight:I

    iput p2, p0, Lio/flutter/plugins/camera/VideoRenderer;->recordingWidth:I

    iput-object p4, p0, Lio/flutter/plugins/camera/VideoRenderer;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-direct {p0}, Lio/flutter/plugins/camera/VideoRenderer;->startOpenGL()V

    sget-object p1, Lio/flutter/plugins/camera/VideoRenderer;->TAG:Ljava/lang/String;

    const-string p2, "VideoRenderer setup complete"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x2
        0x1
        0x0
        0x0
        0x3
        0x2
    .end array-data
.end method

.method private cleanupOpenGL()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glDeleteBuffers(I[II)V

    const/4 v0, 0x1

    iget-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->textureHandles:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->context:Landroid/opengl/EGLContext;

    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->surface:Landroid/opengl/EGLSurface;

    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    iget v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    return-void
.end method

.method private deleteShader(I)V
    .locals 0

    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    return-void
.end method

.method private loadShader(ILjava/lang/String;)I
    .locals 0

    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    return p1
.end method

.method private startOpenGL()V
    .locals 2

    sget-object v0, Lio/flutter/plugins/camera/VideoRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Starting OpenGL Thread"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lio/flutter/plugins/camera/VideoRenderer$2;

    invoke-direct {v0, p0}, Lio/flutter/plugins/camera/VideoRenderer$2;-><init>(Lio/flutter/plugins/camera/VideoRenderer;)V

    iput-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->thread:Ljava/lang/Thread;

    iget-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureFrameAvailableHandler:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    invoke-direct {p0}, Lio/flutter/plugins/camera/VideoRenderer;->cleanupOpenGL()V

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->inputSurfaceTexture:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method configureOpenGL()V
    .locals 19

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/flutter/plugins/camera/VideoRenderer;->lock:Ljava/lang/Object;

    monitor-enter v2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v3

    iput-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v3, v4, :cond_8

    const/4 v4, 0x2

    new-array v5, v4, [I

    const/4 v6, 0x1

    invoke-static {v3, v5, v0, v5, v6}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    const/16 v5, 0x3055

    invoke-static {v3, v5}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "EGL_ANDROID_presentation_time"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsEglRecordableAndroid()Z

    move-result v3

    const/16 v7, 0x9

    const/16 v8, 0x3040

    const/4 v9, 0x7

    const/16 v10, 0x3021

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/16 v13, 0x3022

    const/16 v14, 0x3023

    const/16 v15, 0x3024

    const/4 v5, 0x3

    const/16 v16, 0x3038

    const/16 v17, 0x4

    const/16 v18, 0x8

    if-eqz v3, :cond_0

    const/16 v3, 0xd

    new-array v3, v3, [I

    aput v15, v3, v0

    aput v18, v3, v6

    aput v14, v3, v4

    aput v18, v3, v5

    aput v13, v3, v17

    aput v18, v3, v12

    aput v10, v3, v11

    aput v18, v3, v9

    aput v8, v3, v18

    aput v17, v3, v7

    const/16 v7, 0x3142

    const/16 v8, 0xa

    aput v7, v3, v8

    const/16 v7, 0xb

    aput v6, v3, v7

    const/16 v7, 0xc

    aput v16, v3, v7

    goto :goto_0

    :cond_0
    const/16 v3, 0xb

    new-array v3, v3, [I

    aput v15, v3, v0

    aput v18, v3, v6

    aput v14, v3, v4

    aput v18, v3, v5

    aput v13, v3, v17

    aput v18, v3, v12

    aput v10, v3, v11

    aput v18, v3, v9

    aput v8, v3, v18

    aput v17, v3, v7

    const/16 v7, 0xa

    aput v16, v3, v7

    :goto_0
    move-object v9, v3

    new-array v3, v6, [Landroid/opengl/EGLConfig;

    new-array v14, v6, [I

    iget-object v8, v1, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/4 v13, 0x1

    move-object v11, v3

    invoke-static/range {v8 .. v15}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v7

    const/16 v8, 0x3000

    if-ne v7, v8, :cond_4

    new-array v5, v5, [I

    const/16 v7, 0x3098

    aput v7, v5, v0

    aput v4, v5, v6

    aput v16, v5, v4

    iget-object v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    aget-object v9, v3, v0

    sget-object v10, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v7, v9, v10, v5, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v5

    iput-object v5, v1, Lio/flutter/plugins/camera/VideoRenderer;->context:Landroid/opengl/EGLContext;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v5

    if-ne v5, v8, :cond_3

    new-array v5, v6, [I

    aput v16, v5, v0

    iget-object v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    aget-object v3, v3, v0

    iget-object v9, v1, Lio/flutter/plugins/camera/VideoRenderer;->outputSurface:Landroid/view/Surface;

    invoke-static {v7, v3, v9, v5, v0}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object v3

    iput-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->surface:Landroid/opengl/EGLSurface;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v3

    if-ne v3, v8, :cond_2

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    iget-object v5, v1, Lio/flutter/plugins/camera/VideoRenderer;->surface:Landroid/opengl/EGLSurface;

    iget-object v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->context:Landroid/opengl/EGLContext;

    invoke-static {v3, v5, v5, v7}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->vertices:[F

    array-length v3, v3

    mul-int/lit8 v3, v3, 0x4

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v5

    iget-object v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->vertices:[F

    invoke-virtual {v5, v7}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v5, v1, Lio/flutter/plugins/camera/VideoRenderer;->indices:[I

    array-length v5, v5

    mul-int/lit8 v5, v5, 0x4

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v7

    iget-object v8, v1, Lio/flutter/plugins/camera/VideoRenderer;->indices:[I

    invoke-virtual {v7, v8}, Ljava/nio/IntBuffer;->put([I)Ljava/nio/IntBuffer;

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const-string v7, "  precision highp float;\n            attribute vec3 vertexPosition;\n            attribute vec2 uvs;\n            varying vec2 varUvs;\n            uniform mat4 texMatrix;\n            uniform mat4 mvp;\n\n            void main()\n            {\n                varUvs = (texMatrix * vec4(uvs.x, uvs.y, 0, 1.0)).xy;\n                gl_Position = mvp * vec4(vertexPosition, 1.0);\n            }"

    const v8, 0x8b31

    invoke-direct {v1, v8, v7}, Lio/flutter/plugins/camera/VideoRenderer;->loadShader(ILjava/lang/String;)I

    move-result v7

    const-string v8, " #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n\n            varying vec2 varUvs;\n            uniform samplerExternalOES texSampler;\n\n            void main()\n            {\n                vec4 c = texture2D(texSampler, varUvs);\n                gl_FragColor = vec4(c.r, c.g, c.b, c.a);\n            }"

    const v9, 0x8b30

    invoke-direct {v1, v9, v8}, Lio/flutter/plugins/camera/VideoRenderer;->loadShader(ILjava/lang/String;)I

    move-result v8

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v9

    iput v9, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    invoke-static {v9, v7}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v9, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    invoke-static {v9, v8}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v9, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    invoke-static {v9}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    invoke-direct {v1, v7}, Lio/flutter/plugins/camera/VideoRenderer;->deleteShader(I)V

    invoke-direct {v1, v8}, Lio/flutter/plugins/camera/VideoRenderer;->deleteShader(I)V

    iget v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    const-string v8, "vertexPosition"

    invoke-static {v7, v8}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v7

    iput v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->vertexHandle:I

    iget v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    const-string v8, "uvs"

    invoke-static {v7, v8}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v7

    iput v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->uvsHandle:I

    iget v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    const-string v8, "texMatrix"

    invoke-static {v7, v8}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v7

    iput v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->texMatrixHandle:I

    iget v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    const-string v8, "mvp"

    invoke-static {v7, v8}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v7

    iput v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->mvpHandle:I

    iget-object v7, v1, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    invoke-static {v4, v7, v0}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    iget-object v4, v1, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    aget v4, v4, v0

    const v7, 0x8892

    invoke-static {v7, v4}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    iget-object v4, v1, Lio/flutter/plugins/camera/VideoRenderer;->vertices:[F

    array-length v4, v4

    mul-int/lit8 v4, v4, 0x4

    const v8, 0x88e8

    invoke-static {v7, v4, v3, v8}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    aget v3, v3, v6

    const v4, 0x8893

    invoke-static {v4, v3}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->indices:[I

    array-length v3, v3

    mul-int/lit8 v3, v3, 0x4

    invoke-static {v4, v3, v5, v8}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->textureHandles:[I

    invoke-static {v6, v3, v0}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->textureHandles:[I

    aget v0, v3, v0

    const v3, 0x8d65

    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    new-instance v0, Landroid/graphics/SurfaceTexture;

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/camera/VideoRenderer;->getTexId()I

    move-result v3

    invoke-direct {v0, v3}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, v1, Lio/flutter/plugins/camera/VideoRenderer;->inputSurfaceTexture:Landroid/graphics/SurfaceTexture;

    iget v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->recordingWidth:I

    iget v4, v1, Lio/flutter/plugins/camera/VideoRenderer;->recordingHeight:I

    invoke-virtual {v0, v3, v4}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v0, Landroid/os/HandlerThread;

    const-string v3, "FrameHandlerThread"

    invoke-direct {v0, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, v1, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureFrameAvailableHandler:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/view/Surface;

    iget-object v3, v1, Lio/flutter/plugins/camera/VideoRenderer;->inputSurfaceTexture:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v3}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, v1, Lio/flutter/plugins/camera/VideoRenderer;->inputSurface:Landroid/view/Surface;

    iget-object v0, v1, Lio/flutter/plugins/camera/VideoRenderer;->inputSurfaceTexture:Landroid/graphics/SurfaceTexture;

    new-instance v3, Lio/flutter/plugins/camera/VideoRenderer$1;

    invoke-direct {v3, v1}, Lio/flutter/plugins/camera/VideoRenderer$1;-><init>(Lio/flutter/plugins/camera/VideoRenderer;)V

    new-instance v4, Landroid/os/Handler;

    iget-object v5, v1, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureFrameAvailableHandler:Landroid/os/HandlerThread;

    invoke-virtual {v5}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v3, v4}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    iget-object v0, v1, Lio/flutter/plugins/camera/VideoRenderer;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v2

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "eglMakeCurrent(): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v4

    invoke-static {v4}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {v3}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {v5}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {v7}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v3

    invoke-static {v3}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "cannot configure OpenGL. missing EGL_ANDROID_presentation_time"

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "eglInitialize(): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v4

    invoke-static {v4}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "eglDisplay == EGL14.EGL_NO_DISPLAY: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v4

    invoke-static {v4}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public draw(II[F)V
    .locals 7

    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/4 v0, 0x0

    invoke-static {v0, v0, p1, p2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    iget p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->program:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->texMatrixHandle:I

    const/4 p2, 0x1

    invoke-static {p1, p2, v0, p3, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    iget p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->mvpHandle:I

    invoke-virtual {p0}, Lio/flutter/plugins/camera/VideoRenderer;->moveMatrix()[F

    move-result-object p3

    invoke-static {p1, p2, v0, p3, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    iget-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    aget p1, p1, v0

    const p3, 0x8892

    invoke-static {p3, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    iget-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->bufferHandles:[I

    aget p1, p1, p2

    const p2, 0x8893

    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    iget p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->vertexHandle:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->vertexHandle:I

    const/4 v2, 0x3

    const/16 v3, 0x1406

    const/4 v4, 0x0

    const/16 v5, 0x14

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    iget p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->uvsHandle:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->uvsHandle:I

    const/4 v2, 0x2

    const/16 v6, 0xc

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    const/4 p1, 0x6

    const/16 p2, 0x1405

    const/4 p3, 0x4

    invoke-static {p3, p1, p2, v0}, Landroid/opengl/GLES20;->glDrawElements(IIII)V

    iget-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    iget-object p2, p0, Lio/flutter/plugins/camera/VideoRenderer;->surface:Landroid/opengl/EGLSurface;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    invoke-static {p1, p2, v0, v1}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    iget-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->display:Landroid/opengl/EGLDisplay;

    iget-object p2, p0, Lio/flutter/plugins/camera/VideoRenderer;->surface:Landroid/opengl/EGLSurface;

    invoke-static {p1, p2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lio/flutter/plugins/camera/VideoRenderer;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "eglSwapBuffers() "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result p3

    invoke-static {p3}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public getInputSurface()Landroid/view/Surface;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->inputSurface:Landroid/view/Surface;

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->lock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getTexId()I
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer;->textureHandles:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public moveMatrix()[F
    .locals 7

    const/16 v0, 0x10

    new-array v0, v0, [F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const/4 v2, 0x0

    iget v1, p0, Lio/flutter/plugins/camera/VideoRenderer;->rotation:I

    int-to-float v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, v0

    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    return-object v0
.end method

.method public setRotation(I)V
    .locals 0

    iput p1, p0, Lio/flutter/plugins/camera/VideoRenderer;->rotation:I

    return-void
.end method
