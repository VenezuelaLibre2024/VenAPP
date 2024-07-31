.class public final synthetic Lrf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lrf/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/d;

    invoke-direct {v0}, Lrf/d;-><init>()V

    sput-object v0, Lrf/d;->a:Lrf/d;

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

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/d;

    const-class v1, Lcom/google/mlkit/common/sdkinternal/j;

    invoke-interface {p1, v1}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/mlkit/common/sdkinternal/d;-><init>(Lee/b;)V

    return-object v0
.end method
