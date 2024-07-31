.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 4

    const-class v0, Lcom/google/mlkit/vision/barcode/internal/f;

    invoke-static {v0}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v3, Lzf/a;->a:Lzf/a;

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const-class v3, Lcom/google/mlkit/vision/barcode/internal/e;

    invoke-static {v3}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v3

    invoke-static {v0}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v0

    invoke-virtual {v3, v0}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    const-class v3, Lcom/google/mlkit/common/sdkinternal/d;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/mlkit/vision/barcode/internal/c;->a:Lcom/google/mlkit/vision/barcode/internal/c;

    invoke-virtual {v0, v2}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v0

    return-object v0
.end method
