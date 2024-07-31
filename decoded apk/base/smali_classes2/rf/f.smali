.class public final synthetic Lrf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lrf/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/f;

    invoke-direct {v0}, Lrf/f;-><init>()V

    sput-object v0, Lrf/f;->a:Lrf/f;

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

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/b;

    const-class v1, Lcom/google/mlkit/common/sdkinternal/a;

    invoke-interface {p1, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/a;

    invoke-direct {v0, p1}, Lcom/google/mlkit/common/sdkinternal/b;-><init>(Lcom/google/mlkit/common/sdkinternal/a;)V

    return-object v0
.end method
