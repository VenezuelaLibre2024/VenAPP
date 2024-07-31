.class final Lvi/a1$b;
.super Lvi/y0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lvi/a1;


# direct methods
.method private constructor <init>(Lvi/a1;)V
    .locals 0

    iput-object p1, p0, Lvi/a1$b;->a:Lvi/a1;

    invoke-direct {p0}, Lvi/y0$d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lvi/a1;Lvi/a1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lvi/a1$b;-><init>(Lvi/a1;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lvi/a1$b;->a:Lvi/a1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lvi/a1$b;->a:Lvi/a1;

    invoke-static {v1}, Lvi/a1;->a(Lvi/a1;)Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Ljava/net/URI;Lvi/y0$b;)Lvi/y0;
    .locals 2

    iget-object v0, p0, Lvi/a1$b;->a:Lvi/a1;

    invoke-virtual {v0}, Lvi/a1;->f()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/z0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Lvi/y0$d;->b(Ljava/net/URI;Lvi/y0$b;)Lvi/y0;

    move-result-object p1

    :goto_0
    return-object p1
.end method
