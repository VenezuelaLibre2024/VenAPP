.class public Lcom/google/mlkit/vision/common/internal/VisionCommonRegistrar;
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
    .locals 2

    const-class v0, Lcom/google/mlkit/vision/common/internal/a;

    invoke-static {v0}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v0

    const-class v1, Lcom/google/mlkit/vision/common/internal/a$a;

    invoke-static {v1}, Lpc/q;->n(Ljava/lang/Class;)Lpc/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    sget-object v1, Lcom/google/mlkit/vision/common/internal/d;->a:Lcom/google/mlkit/vision/common/internal/d;

    invoke-virtual {v0, v1}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzp;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_common/zzp;

    move-result-object v0

    return-object v0
.end method
