.class Lb8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lb8/c;


# direct methods
.method private constructor <init>(Lb8/c;)V
    .locals 0

    iput-object p1, p0, Lb8/c$b;->a:Lb8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb8/c;Lb8/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb8/c$b;-><init>(Lb8/c;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;Ls8/d0$c;Z)Z
    .locals 7

    iget-object p3, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {p3}, Lb8/c;->z(Lb8/c;)Lb8/g;

    move-result-object p3

    const/4 v0, 0x0

    if-nez p3, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-object p3, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {p3}, Lb8/c;->r(Lb8/c;)Lb8/h;

    move-result-object p3

    invoke-static {p3}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb8/h;

    iget-object p3, p3, Lb8/h;->e:Ljava/util/List;

    move v3, v0

    move v4, v3

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_1

    iget-object v5, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {v5}, Lb8/c;->A(Lb8/c;)Ljava/util/HashMap;

    move-result-object v5

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb8/h$b;

    iget-object v6, v6, Lb8/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb8/c$c;

    if-eqz v5, :cond_0

    invoke-static {v5}, Lb8/c$c;->d(Lb8/c$c;)J

    move-result-wide v5

    cmp-long v5, v1, v5

    if-gez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p3, Ls8/d0$a;

    iget-object v1, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {v1}, Lb8/c;->r(Lb8/c;)Lb8/h;

    move-result-object v1

    iget-object v1, v1, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p3, v2, v0, v1, v4}, Ls8/d0$a;-><init>(IIII)V

    iget-object v1, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {v1}, Lb8/c;->D(Lb8/c;)Ls8/d0;

    move-result-object v1

    invoke-interface {v1, p3, p2}, Ls8/d0;->b(Ls8/d0$a;Ls8/d0$c;)Ls8/d0$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget p3, p2, Ls8/d0$b;->a:I

    const/4 v1, 0x2

    if-ne p3, v1, :cond_2

    iget-object p3, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {p3}, Lb8/c;->A(Lb8/c;)Ljava/util/HashMap;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb8/c$c;

    if-eqz p1, :cond_2

    iget-wide p2, p2, Ls8/d0$b;->b:J

    invoke-static {p1, p2, p3}, Lb8/c$c;->b(Lb8/c$c;J)Z

    :cond_2
    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lb8/c$b;->a:Lb8/c;

    invoke-static {v0}, Lb8/c;->y(Lb8/c;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
