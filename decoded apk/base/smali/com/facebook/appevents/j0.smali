.class public final Lcom/facebook/appevents/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/appevents/j0$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/facebook/appevents/j0$a;

.field private static final g:Ljava/lang/String;

.field private static final h:I


# instance fields
.field private final a:Lcom/facebook/internal/a;

.field private final b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/appevents/d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/appevents/d;",
            ">;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/appevents/j0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/appevents/j0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/appevents/j0;->f:Lcom/facebook/appevents/j0$a;

    const-class v0, Lcom/facebook/appevents/j0;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/j0;->g:Ljava/lang/String;

    const/16 v0, 0x3e8

    sput v0, Lcom/facebook/appevents/j0;->h:I

    return-void
.end method

.method public constructor <init>(Lcom/facebook/internal/a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "attributionIdentifiers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anonymousAppDeviceGUID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/j0;->a:Lcom/facebook/internal/a;

    iput-object p2, p0, Lcom/facebook/appevents/j0;->b:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/j0;->d:Ljava/util/List;

    return-void
.end method

.method private final f(Li4/i0;Landroid/content/Context;ILorg/json/JSONArray;Z)V
    .locals 3

    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lq4/h;->a:Lq4/h;

    sget-object v0, Lq4/h$a;->CUSTOM_APP_EVENTS:Lq4/h$a;

    iget-object v1, p0, Lcom/facebook/appevents/j0;->a:Lcom/facebook/internal/a;

    iget-object v2, p0, Lcom/facebook/appevents/j0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, p5, p2}, Lq4/h;->a(Lq4/h$a;Lcom/facebook/internal/a;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;

    move-result-object p2

    iget p5, p0, Lcom/facebook/appevents/j0;->e:I

    if-lez p5, :cond_1

    const-string p5, "num_skipped_events"

    invoke-virtual {p2, p5, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_1
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Li4/i0;->F(Lorg/json/JSONObject;)V

    invoke-virtual {p1}, Li4/i0;->u()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "events.toString()"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "custom_events"

    invoke-virtual {p2, p4, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Li4/i0;->I(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Li4/i0;->H(Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :goto_1
    invoke-static {p1, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/facebook/appevents/d;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/appevents/j0;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/facebook/appevents/j0;->h:I

    if-lt v0, v1, :cond_1

    iget p1, p0, Lcom/facebook/appevents/j0;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/facebook/appevents/j0;->e:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-static {p1, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    :try_start_1
    iget-object p1, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    iget-object v0, p0, Lcom/facebook/appevents/j0;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    iget-object p1, p0, Lcom/facebook/appevents/j0;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/facebook/appevents/j0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-static {p1, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c()I
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return v1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/appevents/d;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final e(Li4/i0;Landroid/content/Context;ZZ)I
    .locals 8

    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v5, p0, Lcom/facebook/appevents/j0;->e:I

    sget-object v0, Ln4/a;->a:Ln4/a;

    iget-object v0, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    invoke-static {v0}, Ln4/a;->d(Ljava/util/List;)V

    iget-object v0, p0, Lcom/facebook/appevents/j0;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/facebook/appevents/j0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iget-object v2, p0, Lcom/facebook/appevents/j0;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/appevents/d;

    invoke-virtual {v3}, Lcom/facebook/appevents/d;->g()Z

    move-result v4

    if-eqz v4, :cond_3

    if-nez p3, :cond_2

    invoke-virtual {v3}, Lcom/facebook/appevents/d;->h()Z

    move-result v4

    if-nez v4, :cond_1

    :cond_2
    invoke-virtual {v3}, Lcom/facebook/appevents/d;->e()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_3
    sget-object v4, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    sget-object v4, Lcom/facebook/appevents/j0;->g:Ljava/lang/String;

    const-string v6, "Event with invalid checksum: "

    invoke-static {v6, v3}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/facebook/internal/n0;->k0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p3, :cond_5

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return v1

    :cond_5
    :try_start_3
    sget-object p3, Lck/v;->a:Lck/v;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit p0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, v0

    move v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/facebook/appevents/j0;->f(Li4/i0;Landroid/content/Context;ILorg/json/JSONArray;Z)V

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p1, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return v1
.end method
