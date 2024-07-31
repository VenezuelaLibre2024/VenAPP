.class public final Lcom/facebook/appevents/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/appevents/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/appevents/d0;

    invoke-direct {v0}, Lcom/facebook/appevents/d0;-><init>()V

    sput-object v0, Lcom/facebook/appevents/d0;->a:Lcom/facebook/appevents/d0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()V
    .locals 2

    const-class v0, Lcom/facebook/appevents/d0;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lcom/facebook/internal/v;->a:Lcom/facebook/internal/v;

    new-instance v1, Lcom/facebook/appevents/d0$a;

    invoke-direct {v1}, Lcom/facebook/appevents/d0$a;-><init>()V

    invoke-static {v1}, Lcom/facebook/internal/v;->d(Lcom/facebook/internal/v$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
