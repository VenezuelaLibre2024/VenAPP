.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lcom/google/mlkit/vision/barcode/internal/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/c;

    invoke-direct {v0}, Lcom/google/mlkit/vision/barcode/internal/c;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/c;->a:Lcom/google/mlkit/vision/barcode/internal/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/e;

    const-class v1, Lcom/google/mlkit/vision/barcode/internal/f;

    invoke-interface {p1, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/barcode/internal/f;

    const-class v2, Lcom/google/mlkit/common/sdkinternal/d;

    invoke-interface {p1, v2}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/mlkit/common/sdkinternal/d;

    const-class v3, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-interface {p1, v3}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/mlkit/vision/barcode/internal/e;-><init>(Lcom/google/mlkit/vision/barcode/internal/f;Lcom/google/mlkit/common/sdkinternal/d;Lcom/google/mlkit/common/sdkinternal/i;)V

    return-object v0
.end method
