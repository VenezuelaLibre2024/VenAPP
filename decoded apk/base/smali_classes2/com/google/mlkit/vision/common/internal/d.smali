.class public final synthetic Lcom/google/mlkit/vision/common/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lcom/google/mlkit/vision/common/internal/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/d;

    invoke-direct {v0}, Lcom/google/mlkit/vision/common/internal/d;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/common/internal/d;->a:Lcom/google/mlkit/vision/common/internal/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 1

    const-class v0, Lcom/google/mlkit/vision/common/internal/a$a;

    invoke-interface {p1, v0}, Lpc/d;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/a;

    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/common/internal/a;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
