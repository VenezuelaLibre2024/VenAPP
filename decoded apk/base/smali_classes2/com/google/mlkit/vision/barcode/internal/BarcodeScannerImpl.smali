.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements Lvf/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/vision/common/internal/MobileVisionBase<",
        "Ljava/util/List<",
        "Lxf/a;",
        ">;>;",
        "Lvf/a;"
    }
.end annotation


# static fields
.field private static final x:Lvf/b;

.field public static final synthetic y:I


# instance fields
.field private final s:Z

.field private final t:Lvf/b;

.field final u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

.field private v:I

.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvf/b$a;

    invoke-direct {v0}, Lvf/b$a;-><init>()V

    invoke-virtual {v0}, Lvf/b$a;->a()Lvf/b;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->x:Lvf/b;

    return-void
.end method

.method constructor <init>(Lvf/b;Lcom/google/mlkit/vision/barcode/internal/i;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;Lcom/google/mlkit/common/sdkinternal/i;)V
    .locals 0

    invoke-virtual {p1}, Lvf/b;->b()Lvf/d;

    invoke-direct {p0, p2, p3}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(Lcom/google/mlkit/common/sdkinternal/f;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->t:Lvf/b;

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/b;->f()Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->s:Z

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpx;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpx;-><init>()V

    invoke-static {p1}, Lcom/google/mlkit/vision/barcode/internal/b;->c(Lvf/b;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpx;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpx;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpx;->zzj()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;

    move-result-object p1

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;-><init>()V

    if-eqz p2, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    :goto_0
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    const/4 p1, 0x1

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    invoke-virtual {p4, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

    return-void
.end method

.method static bridge synthetic i()Lvf/b;
    .locals 1

    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->x:Lvf/b;

    return-object v0
.end method

.method private final j(Lcom/google/android/gms/tasks/Task;II)Lcom/google/android/gms/tasks/Task;
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/d;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/mlkit/vision/barcode/internal/d;-><init>(Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;II)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final W(Lag/a;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lag/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lxf/a;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->b(Lag/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-virtual {p1}, Lag/a;->k()I

    move-result v1

    invoke-virtual {p1}, Lag/a;->g()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->j(Lcom/google/android/gms/tasks/Task;II)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final a()[Lca/d;
    .locals 3

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->s:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/m;->a:[Lca/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lca/d;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/mlkit/common/sdkinternal/m;->b:Lca/d;

    aput-object v2, v0, v1

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->w:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzn(Z)V

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzj()V

    :cond_0
    invoke-super {p0}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final synthetic g(IILjava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

    if-nez v1, :cond_0

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    return-object v1

    :cond_0
    iget v1, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->v:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->v:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxf/a;

    invoke-virtual {v5}, Lxf/a;->h()I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_1

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_6

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxf/a;

    invoke-virtual {v7}, Lxf/a;->d()[Landroid/graphics/Point;

    move-result-object v7

    if-eqz v7, :cond_4

    iget-object v8, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->u:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;

    iget v9, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->v:I

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move/from16 v10, p1

    move/from16 v11, p2

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/graphics/Point;

    iget v15, v14, Landroid/graphics/Point;->x:I

    invoke-static {v10, v15}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget v15, v14, Landroid/graphics/Point;->y:I

    invoke-static {v11, v15}, Ljava/lang/Math;->min(II)I

    move-result v11

    iget v15, v14, Landroid/graphics/Point;->x:I

    invoke-static {v12, v15}, Ljava/lang/Math;->max(II)I

    move-result v12

    iget v14, v14, Landroid/graphics/Point;->y:I

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v13

    goto :goto_2

    :cond_3
    int-to-float v7, v10

    const/4 v10, 0x0

    add-float/2addr v7, v10

    move/from16 v14, p1

    int-to-float v15, v14

    int-to-float v11, v11

    add-float/2addr v11, v10

    move/from16 v5, p2

    int-to-float v2, v5

    int-to-float v12, v12

    int-to-float v13, v13

    div-float/2addr v7, v15

    div-float/2addr v11, v2

    add-float/2addr v12, v10

    div-float/2addr v12, v15

    add-float/2addr v13, v10

    div-float/2addr v13, v2

    invoke-static {v7, v11, v12, v13, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;->zzg(FFFFF)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;

    move-result-object v2

    invoke-virtual {v8, v9, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzus;->zzi(ILcom/google/android/gms/internal/mlkit_vision_barcode/zzuv;)V

    goto :goto_3

    :cond_4
    move/from16 v14, p1

    move/from16 v5, p2

    :goto_3
    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    iput-boolean v2, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->w:Z

    :cond_6
    iget-object v3, v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->t:Lvf/b;

    invoke-virtual {v3}, Lvf/b;->d()Z

    move-result v3

    if-eq v2, v3, :cond_7

    goto :goto_4

    :cond_7
    move-object/from16 v1, p3

    :goto_4
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    return-object v1
.end method
