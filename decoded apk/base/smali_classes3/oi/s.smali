.class public final Loi/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Lio/flutter/view/TextureRegistry;

.field private final c:Lok/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/r<",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;[B",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/String;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroidx/camera/lifecycle/e;

.field private f:Lw/i;

.field private g:Landroidx/camera/core/s;

.field private h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field private i:Lvf/a;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Z

.field private l:Landroid/hardware/display/DisplayManager$DisplayListener;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lpi/b;

.field private o:J

.field private p:Z

.field private final q:Landroidx/camera/core/f$a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lok/r;Lok/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lio/flutter/view/TextureRegistry;",
            "Lok/r<",
            "-",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;-[B-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;",
            "Lok/l<",
            "-",
            "Ljava/lang/String;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textureRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileScannerCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileScannerErrorCallback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/s;->a:Landroid/app/Activity;

    iput-object p2, p0, Loi/s;->b:Lio/flutter/view/TextureRegistry;

    iput-object p3, p0, Loi/s;->c:Lok/r;

    iput-object p4, p0, Loi/s;->d:Lok/l;

    invoke-static {}, Lvf/c;->a()Lvf/a;

    move-result-object p1

    const-string p2, "getClient(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Loi/s;->i:Lvf/a;

    sget-object p1, Lpi/b;->NO_DUPLICATES:Lpi/b;

    iput-object p1, p0, Loi/s;->n:Lpi/b;

    const-wide/16 p1, 0xfa

    iput-wide p1, p0, Loi/s;->o:J

    new-instance p1, Loi/m;

    invoke-direct {p1, p0}, Loi/m;-><init>(Loi/s;)V

    iput-object p1, p0, Loi/s;->q:Landroidx/camera/core/f$a;

    return-void
.end method

.method private static final A(Lok/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final B(Loi/s;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Loi/s;->d:Lok/l;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-interface {p0, v0}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final C(Landroidx/camera/core/o;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "$imageProxy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/camera/core/o;->close()V

    return-void
.end method

.method private static final D(Loi/s;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Loi/s;->k:Z

    return-void
.end method

.method private final E(Landroid/util/Size;)Landroid/util/Size;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Loi/s;->a:Landroid/app/Activity;

    invoke-static {v0}, Loi/f;->a(Landroid/app/Activity;)Landroid/view/Display;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Loi/s;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    if-eqz v0, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    new-instance v0, Landroid/util/Size;

    invoke-direct {v0, p1, v1}, Landroid/util/Size;-><init>(II)V

    goto :goto_1

    :cond_1
    new-instance v0, Landroid/util/Size;

    invoke-direct {v0, v1, p1}, Landroid/util/Size;-><init>(II)V

    :goto_1
    return-object v0
.end method

.method private final G(Ljava/util/List;Lxf/a;Landroidx/camera/core/o;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Lxf/a;",
            "Landroidx/camera/core/o;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p2}, Lxf/a;->a()Landroid/graphics/Rect;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-interface {p3}, Landroidx/camera/core/o;->getHeight()I

    move-result v1

    invoke-interface {p3}, Landroidx/camera/core/o;->getWidth()I

    move-result p3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lqk/a;->a(F)I

    move-result v0

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    int-to-float p3, p3

    mul-float/2addr v2, p3

    invoke-static {v2}, Lqk/a;->a(F)I

    move-result v2

    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-static {v3}, Lqk/a;->a(F)I

    move-result v1

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    mul-float/2addr p1, p3

    invoke-static {p1}, Lqk/a;->a(F)I

    move-result p1

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3, v0, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p3, p2}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method private final H()Z
    .locals 1

    iget-object v0, p0, Loi/s;->f:Lw/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Loi/s;->g:Landroidx/camera/core/s;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final J(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 7

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final N(Loi/s;Lcom/google/common/util/concurrent/f;Lok/l;Landroid/util/Size;ZLw/p;Lok/l;Ljava/util/concurrent/Executor;ZLok/l;Lok/l;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    const-string v9, "this$0"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "$cameraProviderFuture"

    move-object/from16 v10, p1

    invoke-static {v10, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "$mobileScannerErrorCallback"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "$cameraPosition"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "$mobileScannerStartedCallback"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "$torchStateCallback"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "$zoomScaleStateCallback"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/camera/lifecycle/e;

    iput-object v9, v0, Loi/s;->e:Landroidx/camera/lifecycle/e;

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    invoke-virtual {v9}, Landroidx/camera/lifecycle/e;->f()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_0

    :cond_0
    move-object v9, v10

    :goto_0
    iget-object v11, v0, Loi/s;->e:Landroidx/camera/lifecycle/e;

    if-nez v11, :cond_1

    new-instance v0, Loi/e;

    invoke-direct {v0}, Loi/e;-><init>()V

    invoke-interface {v1, v0}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    if-eqz v11, :cond_2

    invoke-virtual {v11}, Landroidx/camera/lifecycle/e;->p()V

    :cond_2
    iget-object v11, v0, Loi/s;->b:Lio/flutter/view/TextureRegistry;

    invoke-interface {v11}, Lio/flutter/view/TextureRegistry;->createSurfaceTexture()Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    move-result-object v11

    iput-object v11, v0, Loi/s;->h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    new-instance v11, Loi/n;

    invoke-direct {v11, v0, v6}, Loi/n;-><init>(Loi/s;Ljava/util/concurrent/Executor;)V

    new-instance v12, Landroidx/camera/core/s$a;

    invoke-direct {v12}, Landroidx/camera/core/s$a;-><init>()V

    invoke-virtual {v12}, Landroidx/camera/core/s$a;->c()Landroidx/camera/core/s;

    move-result-object v12

    invoke-virtual {v12, v11}, Landroidx/camera/core/s;->j0(Landroidx/camera/core/s$c;)V

    iput-object v12, v0, Loi/s;->g:Landroidx/camera/core/s;

    new-instance v11, Landroidx/camera/core/f$c;

    invoke-direct {v11}, Landroidx/camera/core/f$c;-><init>()V

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Landroidx/camera/core/f$c;->f(I)Landroidx/camera/core/f$c;

    move-result-object v11

    const-string v13, "setBackpressureStrategy(...)"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v0, Loi/s;->a:Landroid/app/Activity;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    const-string v14, "display"

    invoke-virtual {v13, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "null cannot be cast to non-null type android.hardware.display.DisplayManager"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Landroid/hardware/display/DisplayManager;

    const/4 v14, 0x1

    if-eqz v2, :cond_4

    if-eqz v3, :cond_3

    new-instance v15, Lh0/c$a;

    invoke-direct {v15}, Lh0/c$a;-><init>()V

    new-instance v12, Lh0/d;

    invoke-direct {v12, v2, v14}, Lh0/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {v15, v12}, Lh0/c$a;->e(Lh0/d;)Lh0/c$a;

    invoke-virtual {v15}, Lh0/c$a;->a()Lh0/c;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroidx/camera/core/f$c;->j(Lh0/c;)Landroidx/camera/core/f$c;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/camera/core/f$c;->c()Landroidx/camera/core/f;

    goto :goto_1

    :cond_3
    invoke-direct {v0, v2}, Loi/s;->E(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroidx/camera/core/f$c;->o(Landroid/util/Size;)Landroidx/camera/core/f$c;

    :goto_1
    iget-object v12, v0, Loi/s;->l:Landroid/hardware/display/DisplayManager$DisplayListener;

    if-nez v12, :cond_4

    new-instance v12, Loi/s$c;

    invoke-direct {v12, v3, v2, v11, v0}, Loi/s$c;-><init>(ZLandroid/util/Size;Landroidx/camera/core/f$c;Loi/s;)V

    iput-object v12, v0, Loi/s;->l:Landroid/hardware/display/DisplayManager$DisplayListener;

    invoke-virtual {v13, v12, v10}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    :cond_4
    invoke-virtual {v11}, Landroidx/camera/core/f$c;->c()Landroidx/camera/core/f;

    move-result-object v2

    iget-object v3, v0, Loi/s;->q:Landroidx/camera/core/f$a;

    invoke-virtual {v2, v6, v3}, Landroidx/camera/core/f;->k0(Ljava/util/concurrent/Executor;Landroidx/camera/core/f$a;)V

    const-string v3, "apply(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v3, v0, Loi/s;->e:Landroidx/camera/lifecycle/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"

    if-eqz v3, :cond_5

    :try_start_1
    iget-object v10, v0, Loi/s;->a:Landroid/app/Activity;

    invoke-static {v10, v6}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/lifecycle/k;

    const/4 v11, 0x2

    new-array v11, v11, [Landroidx/camera/core/w;

    iget-object v12, v0, Loi/s;->g:Landroidx/camera/core/s;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    aput-object v2, v11, v14

    invoke-virtual {v3, v10, v4, v11}, Landroidx/camera/lifecycle/e;->e(Landroidx/lifecycle/k;Lw/p;[Landroidx/camera/core/w;)Lw/i;

    move-result-object v10

    goto :goto_2

    :cond_5
    const/4 v13, 0x0

    :goto_2
    iput-object v10, v0, Loi/s;->f:Lw/i;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v10, :cond_6

    invoke-interface {v10}, Lw/i;->b()Lw/o;

    move-result-object v1

    invoke-interface {v1}, Lw/o;->g()Landroidx/lifecycle/LiveData;

    move-result-object v1

    iget-object v3, v0, Loi/s;->a:Landroid/app/Activity;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/lifecycle/k;

    new-instance v4, Loi/s$d;

    invoke-direct {v4, v7}, Loi/s$d;-><init>(Lok/l;)V

    new-instance v6, Loi/o;

    invoke-direct {v6, v4}, Loi/o;-><init>(Lok/l;)V

    invoke-virtual {v1, v3, v6}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/k;Landroidx/lifecycle/s;)V

    invoke-interface {v10}, Lw/i;->b()Lw/o;

    move-result-object v1

    invoke-interface {v1}, Lw/o;->j()Landroidx/lifecycle/LiveData;

    move-result-object v1

    iget-object v3, v0, Loi/s;->a:Landroid/app/Activity;

    check-cast v3, Landroidx/lifecycle/k;

    new-instance v4, Loi/s$e;

    invoke-direct {v4, v8}, Loi/s$e;-><init>(Lok/l;)V

    new-instance v6, Loi/p;

    invoke-direct {v6, v4}, Loi/p;-><init>(Lok/l;)V

    invoke-virtual {v1, v3, v6}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/k;Landroidx/lifecycle/s;)V

    invoke-interface {v10}, Lw/i;->b()Lw/o;

    move-result-object v1

    invoke-interface {v1}, Lw/o;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v10}, Lw/i;->a()Lw/j;

    move-result-object v1

    move/from16 v3, p8

    invoke-interface {v1, v3}, Lw/j;->g(Z)Lcom/google/common/util/concurrent/f;

    :cond_6
    invoke-virtual {v2}, Landroidx/camera/core/f;->e0()Lw/u0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lw/u0;->a()Landroid/util/Size;

    move-result-object v1

    const-string v2, "getResolution(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-double v2, v2

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-double v6, v1

    iget-object v1, v0, Loi/s;->f:Lw/i;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lw/i;->b()Lw/o;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lw/o;->a()I

    move-result v1

    goto :goto_3

    :cond_7
    move v1, v13

    :goto_3
    rem-int/lit16 v1, v1, 0xb4

    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    move v14, v13

    :goto_4
    new-instance v1, Lpi/c;

    if-eqz v14, :cond_9

    move-wide/from16 v16, v2

    goto :goto_5

    :cond_9
    move-wide/from16 v16, v6

    :goto_5
    if-eqz v14, :cond_a

    move-wide/from16 v18, v6

    goto :goto_6

    :cond_a
    move-wide/from16 v18, v2

    :goto_6
    iget-object v2, v0, Loi/s;->f:Lw/i;

    if-eqz v2, :cond_b

    invoke-interface {v2}, Lw/i;->b()Lw/o;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-interface {v2}, Lw/o;->d()Z

    move-result v2

    move/from16 v20, v2

    goto :goto_7

    :cond_b
    move/from16 v20, v13

    :goto_7
    iget-object v0, v0, Loi/s;->h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->id()J

    move-result-wide v21

    if-eqz v9, :cond_c

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move/from16 v23, v12

    goto :goto_8

    :cond_c
    move/from16 v23, v13

    :goto_8
    move-object v15, v1

    invoke-direct/range {v15 .. v23}, Lpi/c;-><init>(DDZJI)V

    invoke-interface {v5, v1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :catch_0
    new-instance v0, Loi/b0;

    invoke-direct {v0}, Loi/b0;-><init>()V

    invoke-interface {v1, v0}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final O(Lok/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final P(Lok/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final Q(Loi/s;Ljava/util/concurrent/Executor;Lw/i1;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Loi/s;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, Loi/s;->h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p0

    const-string v0, "surfaceTexture(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lw/i1;->k()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Lw/i1;->k()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    new-instance p0, Loi/q;

    invoke-direct {p0}, Loi/q;-><init>()V

    invoke-virtual {p2, v0, p1, p0}, Lw/i1;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    return-void
.end method

.method private static final R(Lw/i1$g;)V
    .locals 0

    return-void
.end method

.method public static synthetic a(Loi/s;Ljava/util/concurrent/Executor;Lw/i1;)V
    .locals 0

    invoke-static {p0, p1, p2}, Loi/s;->Q(Loi/s;Ljava/util/concurrent/Executor;Lw/i1;)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/o;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->C(Landroidx/camera/core/o;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic c(Lok/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->x(Lok/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lw/i1$g;)V
    .locals 0

    invoke-static {p0}, Loi/s;->R(Lw/i1$g;)V

    return-void
.end method

.method public static synthetic e(Loi/s;)V
    .locals 0

    invoke-static {p0}, Loi/s;->D(Loi/s;)V

    return-void
.end method

.method public static synthetic f(Lok/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->O(Lok/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Loi/s;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->B(Loi/s;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic h(Lok/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->A(Lok/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Loi/s;Lcom/google/common/util/concurrent/f;Lok/l;Landroid/util/Size;ZLw/p;Lok/l;Ljava/util/concurrent/Executor;ZLok/l;Lok/l;)V
    .locals 0

    invoke-static/range {p0 .. p10}, Loi/s;->N(Loi/s;Lcom/google/common/util/concurrent/f;Lok/l;Landroid/util/Size;ZLw/p;Lok/l;Ljava/util/concurrent/Executor;ZLok/l;Lok/l;)V

    return-void
.end method

.method public static synthetic j(Lok/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->P(Lok/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Loi/s;Landroidx/camera/core/o;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->z(Loi/s;Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic l(Loi/s;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Loi/s;->y(Loi/s;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final synthetic m(Loi/s;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Loi/s;->a:Landroid/app/Activity;

    return-object p0
.end method

.method public static final synthetic n(Loi/s;)Lw/i;
    .locals 0

    iget-object p0, p0, Loi/s;->f:Lw/i;

    return-object p0
.end method

.method public static final synthetic o(Loi/s;)Lpi/b;
    .locals 0

    iget-object p0, p0, Loi/s;->n:Lpi/b;

    return-object p0
.end method

.method public static final synthetic p(Loi/s;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Loi/s;->j:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic q(Loi/s;)Lok/r;
    .locals 0

    iget-object p0, p0, Loi/s;->c:Lok/r;

    return-object p0
.end method

.method public static final synthetic r(Loi/s;Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-direct {p0, p1}, Loi/s;->E(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Loi/s;)Z
    .locals 0

    iget-boolean p0, p0, Loi/s;->p:Z

    return p0
.end method

.method public static final synthetic t(Loi/s;Ljava/util/List;Lxf/a;Landroidx/camera/core/o;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Loi/s;->G(Ljava/util/List;Lxf/a;Landroidx/camera/core/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic u(Loi/s;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 0

    invoke-direct {p0, p1, p2}, Loi/s;->J(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(Loi/s;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Loi/s;->j:Ljava/util/List;

    return-void
.end method

.method private static final x(Lok/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final y(Loi/s;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Loi/s;->d:Lok/l;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-interface {p0, v0}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final z(Loi/s;Landroidx/camera/core/o;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/o;->k1()Landroid/media/Image;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v1

    invoke-interface {v1}, Lw/h0;->d()I

    move-result v1

    invoke-static {v0, v1}, Lag/a;->b(Landroid/media/Image;I)Lag/a;

    move-result-object v1

    const-string v2, "fromMediaImage(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Loi/s;->n:Lpi/b;

    sget-object v3, Lpi/b;->NORMAL:Lpi/b;

    if-ne v2, v3, :cond_1

    iget-boolean v4, p0, Loi/s;->k:Z

    if-eqz v4, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/o;->close()V

    return-void

    :cond_1
    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, p0, Loi/s;->k:Z

    :cond_2
    iget-object v2, p0, Loi/s;->i:Lvf/a;

    invoke-interface {v2, v1}, Lvf/a;->W(Lag/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Loi/s$b;

    invoke-direct {v2, p0, p1, v0}, Loi/s$b;-><init>(Loi/s;Landroidx/camera/core/o;Landroid/media/Image;)V

    new-instance v0, Loi/r;

    invoke-direct {v0, v2}, Loi/r;-><init>(Lok/l;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Loi/g;

    invoke-direct {v1, p0}, Loi/g;-><init>(Loi/s;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Loi/h;

    invoke-direct {v1, p1}, Loi/h;-><init>(Landroidx/camera/core/o;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Loi/s;->n:Lpi/b;

    if-ne p1, v3, :cond_3

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Loi/i;

    invoke-direct {v0, p0}, Loi/i;-><init>(Loi/s;)V

    iget-wide v1, p0, Loi/s;->o:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public final F()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loi/s;->m:Ljava/util/List;

    return-object v0
.end method

.method public final I()V
    .locals 2

    iget-object v0, p0, Loi/s;->f:Lw/i;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lw/i;->a()Lw/j;

    move-result-object v0

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lw/j;->d(F)Lcom/google/common/util/concurrent/f;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Loi/d0;

    invoke-direct {v0}, Loi/d0;-><init>()V

    throw v0
.end method

.method public final K(D)V
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p1, v0

    if-gtz v0, :cond_2

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-ltz v0, :cond_2

    iget-object v0, p0, Loi/s;->f:Lw/i;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lw/i;->a()Lw/j;

    move-result-object v0

    if-eqz v0, :cond_0

    double-to-float p1, p1

    invoke-interface {v0, p1}, Lw/j;->b(F)Lcom/google/common/util/concurrent/f;

    :cond_0
    return-void

    :cond_1
    new-instance p1, Loi/d0;

    invoke-direct {p1}, Loi/d0;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Loi/c0;

    invoke-direct {p1}, Loi/c0;-><init>()V

    throw p1
.end method

.method public final L(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loi/s;->m:Ljava/util/List;

    return-void
.end method

.method public final M(Lvf/b;ZLw/p;ZLpi/b;Lok/l;Lok/l;Lok/l;Lok/l;JLandroid/util/Size;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvf/b;",
            "Z",
            "Lw/p;",
            "Z",
            "Lpi/b;",
            "Lok/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;",
            "Lok/l<",
            "-",
            "Ljava/lang/Double;",
            "Lck/v;",
            ">;",
            "Lok/l<",
            "-",
            "Lpi/c;",
            "Lck/v;",
            ">;",
            "Lok/l<",
            "-",
            "Ljava/lang/Exception;",
            "Lck/v;",
            ">;J",
            "Landroid/util/Size;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v0, p5

    move-object/from16 v3, p9

    const-string v1, "cameraPosition"

    move-object/from16 v6, p3

    invoke-static {v6, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "detectionSpeed"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "torchStateCallback"

    move-object/from16 v10, p6

    invoke-static {v10, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "zoomScaleStateCallback"

    move-object/from16 v11, p7

    invoke-static {v11, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mobileScannerStartedCallback"

    move-object/from16 v7, p8

    invoke-static {v7, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mobileScannerErrorCallback"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v12, Loi/s;->n:Lpi/b;

    move-wide/from16 v0, p10

    iput-wide v0, v12, Loi/s;->o:J

    move/from16 v0, p2

    iput-boolean v0, v12, Loi/s;->p:Z

    iget-object v0, v12, Loi/s;->f:Lw/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lw/i;->b()Lw/o;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v12, Loi/s;->g:Landroidx/camera/core/s;

    if-eqz v0, :cond_1

    iget-object v0, v12, Loi/s;->h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    if-eqz v0, :cond_1

    new-instance v0, Loi/a;

    invoke-direct {v0}, Loi/a;-><init>()V

    invoke-interface {v3, v0}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iput-object v1, v12, Loi/s;->j:Ljava/util/List;

    if-eqz p1, :cond_2

    invoke-static/range {p1 .. p1}, Lvf/c;->b(Lvf/b;)Lvf/a;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {}, Lvf/c;->a()Lvf/a;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iput-object v0, v12, Loi/s;->i:Lvf/a;

    iget-object v0, v12, Loi/s;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroidx/camera/lifecycle/e;->h(Landroid/content/Context;)Lcom/google/common/util/concurrent/f;

    move-result-object v13

    const-string v0, "getInstance(...)"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v12, Loi/s;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroidx/core/content/a;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v14

    new-instance v15, Loi/j;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object v2, v13

    move-object/from16 v3, p9

    move-object/from16 v4, p12

    move/from16 v5, p13

    move-object/from16 v6, p3

    move-object/from16 v7, p8

    move-object v8, v14

    move/from16 v9, p4

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    invoke-direct/range {v0 .. v11}, Loi/j;-><init>(Loi/s;Lcom/google/common/util/concurrent/f;Lok/l;Landroid/util/Size;ZLw/p;Lok/l;Ljava/util/concurrent/Executor;ZLok/l;Lok/l;)V

    invoke-interface {v13, v15, v14}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final S()V
    .locals 3

    invoke-direct {p0}, Loi/s;->H()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Loi/s;->l:Landroid/hardware/display/DisplayManager$DisplayListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Loi/s;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "display"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.hardware.display.DisplayManager"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/hardware/display/DisplayManager;

    iget-object v2, p0, Loi/s;->l:Landroid/hardware/display/DisplayManager$DisplayListener;

    invoke-virtual {v0, v2}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    iput-object v1, p0, Loi/s;->l:Landroid/hardware/display/DisplayManager$DisplayListener;

    :cond_0
    iget-object v0, p0, Loi/s;->a:Landroid/app/Activity;

    const-string v2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/lifecycle/k;

    iget-object v2, p0, Loi/s;->f:Lw/i;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lw/i;->b()Lw/o;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lw/o;->g()Landroidx/lifecycle/LiveData;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Landroidx/lifecycle/LiveData;->removeObservers(Landroidx/lifecycle/k;)V

    :cond_1
    iget-object v0, p0, Loi/s;->e:Landroidx/camera/lifecycle/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/camera/lifecycle/e;->p()V

    :cond_2
    iget-object v0, p0, Loi/s;->h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->release()V

    :cond_3
    iput-object v1, p0, Loi/s;->f:Lw/i;

    iput-object v1, p0, Loi/s;->g:Landroidx/camera/core/s;

    iput-object v1, p0, Loi/s;->h:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    iput-object v1, p0, Loi/s;->e:Landroidx/camera/lifecycle/e;

    return-void

    :cond_4
    new-instance v0, Loi/b;

    invoke-direct {v0}, Loi/b;-><init>()V

    throw v0
.end method

.method public final T(Z)V
    .locals 3

    iget-object v0, p0, Loi/s;->f:Lw/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lw/i;->b()Lw/o;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lw/o;->d()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v1, v2

    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Loi/s;->f:Lw/i;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lw/i;->a()Lw/j;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lw/j;->g(Z)Lcom/google/common/util/concurrent/f;

    :cond_2
    return-void
.end method

.method public final w(Landroid/net/Uri;Lok/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lok/l<",
            "-",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyzerCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Loi/s;->a:Landroid/app/Activity;

    invoke-static {v0, p1}, Lag/a;->a(Landroid/content/Context;Landroid/net/Uri;)Lag/a;

    move-result-object p1

    const-string v0, "fromFilePath(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Loi/s;->i:Lvf/a;

    invoke-interface {v0, p1}, Lvf/a;->W(Lag/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Loi/s$a;

    invoke-direct {v0, p2}, Loi/s$a;-><init>(Lok/l;)V

    new-instance p2, Loi/k;

    invoke-direct {p2, v0}, Loi/k;-><init>(Lok/l;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Loi/l;

    invoke-direct {p2, p0}, Loi/l;-><init>(Loi/s;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
