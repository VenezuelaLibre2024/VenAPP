.class Lj3/j$e;
.super Lj3/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj3/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(Lh3/a;)Z
    .locals 1

    sget-object v0, Lh3/a;->REMOTE:Lh3/a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(ZLh3/a;Lh3/c;)Z
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lh3/a;->DATA_DISK_CACHE:Lh3/a;

    if-eq p2, p1, :cond_1

    :cond_0
    sget-object p1, Lh3/a;->LOCAL:Lh3/a;

    if-ne p2, p1, :cond_2

    :cond_1
    sget-object p1, Lh3/c;->TRANSFORMED:Lh3/c;

    if-ne p3, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method