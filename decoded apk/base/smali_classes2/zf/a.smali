.class public final synthetic Lzf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lzf/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lzf/a;

    invoke-direct {v0}, Lzf/a;-><init>()V

    sput-object v0, Lzf/a;->a:Lzf/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/f;

    const-class v1, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-interface {p1, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/barcode/internal/f;-><init>(Lcom/google/mlkit/common/sdkinternal/i;)V

    return-object v0
.end method
