.class public final Lcom/facebook/appevents/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/appevents/h0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Li4/a;)Lcom/facebook/appevents/h0;
    .locals 1

    const-string v0, "activityName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/appevents/h0;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/appevents/h0;-><init>(Ljava/lang/String;Ljava/lang/String;Li4/a;)V

    return-object v0
.end method

.method public final b()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0}, Lcom/facebook/appevents/r$a;->h()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/facebook/appevents/o$b;
    .locals 1

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0}, Lcom/facebook/appevents/r$a;->j()Lcom/facebook/appevents/o$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0}, Lcom/facebook/appevents/r$a;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ud"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/facebook/appevents/l0;->g(Ljava/util/Map;)V

    return-void
.end method
