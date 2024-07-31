.class public final Lu8/j;
.super Landroid/view/Surface;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu8/j$b;
    }
.end annotation


# static fields
.field private static d:I

.field private static e:Z


# instance fields
.field public final a:Z

.field private final b:Lu8/j$b;

.field private c:Z


# direct methods
.method private constructor <init>(Lu8/j$b;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lu8/j;->b:Lu8/j$b;

    iput-boolean p3, p0, Lu8/j;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Lu8/j$b;Landroid/graphics/SurfaceTexture;ZLu8/j$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu8/j;-><init>(Lu8/j$b;Landroid/graphics/SurfaceTexture;Z)V

    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lt8/n;->h(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lt8/n;->i()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Z
    .locals 3

    const-class v0, Lu8/j;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lu8/j;->e:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-static {p0}, Lu8/j;->a(Landroid/content/Context;)I

    move-result p0

    sput p0, Lu8/j;->d:I

    sput-boolean v2, Lu8/j;->e:Z

    :cond_0
    sget p0, Lu8/j;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static c(Landroid/content/Context;Z)Lu8/j;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p0}, Lu8/j;->b(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Lt8/a;->g(Z)V

    new-instance p0, Lu8/j$b;

    invoke-direct {p0}, Lu8/j$b;-><init>()V

    if-eqz p1, :cond_2

    sget v0, Lu8/j;->d:I

    :cond_2
    invoke-virtual {p0, v0}, Lu8/j$b;->a(I)Lu8/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public release()V
    .locals 2

    invoke-super {p0}, Landroid/view/Surface;->release()V

    iget-object v0, p0, Lu8/j;->b:Lu8/j$b;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lu8/j;->c:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lu8/j;->b:Lu8/j$b;

    invoke-virtual {v1}, Lu8/j$b;->c()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lu8/j;->c:Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
