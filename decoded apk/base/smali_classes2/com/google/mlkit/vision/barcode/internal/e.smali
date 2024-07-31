.class public final Lcom/google/mlkit/vision/barcode/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/mlkit/vision/barcode/internal/f;

.field private final b:Lcom/google/mlkit/common/sdkinternal/d;

.field private final c:Lcom/google/mlkit/common/sdkinternal/i;


# direct methods
.method constructor <init>(Lcom/google/mlkit/vision/barcode/internal/f;Lcom/google/mlkit/common/sdkinternal/d;Lcom/google/mlkit/common/sdkinternal/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/e;->a:Lcom/google/mlkit/vision/barcode/internal/f;

    iput-object p2, p0, Lcom/google/mlkit/vision/barcode/internal/e;->b:Lcom/google/mlkit/common/sdkinternal/d;

    iput-object p3, p0, Lcom/google/mlkit/vision/barcode/internal/e;->c:Lcom/google/mlkit/common/sdkinternal/i;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
    .locals 1

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->i()Lvf/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/mlkit/vision/barcode/internal/e;->b(Lvf/b;)Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lvf/b;)Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
    .locals 7

    new-instance v6, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/e;->a:Lcom/google/mlkit/vision/barcode/internal/f;

    invoke-virtual {v0, p1}, Lcom/google/mlkit/common/sdkinternal/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/mlkit/vision/barcode/internal/i;

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/e;->b:Lcom/google/mlkit/common/sdkinternal/d;

    invoke-virtual {p1}, Lvf/b;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzui;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    move-result-object v4

    iget-object v5, p0, Lcom/google/mlkit/vision/barcode/internal/e;->c:Lcom/google/mlkit/common/sdkinternal/i;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;-><init>(Lvf/b;Lcom/google/mlkit/vision/barcode/internal/i;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;Lcom/google/mlkit/common/sdkinternal/i;)V

    return-object v6
.end method
