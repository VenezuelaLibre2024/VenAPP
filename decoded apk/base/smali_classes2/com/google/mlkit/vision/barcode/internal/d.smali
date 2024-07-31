.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/d;->a:Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    iput p2, p0, Lcom/google/mlkit/vision/barcode/internal/d;->b:I

    iput p3, p0, Lcom/google/mlkit/vision/barcode/internal/d;->c:I

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/d;->a:Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    iget v1, p0, Lcom/google/mlkit/vision/barcode/internal/d;->b:I

    iget v2, p0, Lcom/google/mlkit/vision/barcode/internal/d;->c:I

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->g(IILjava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
