.class final Lv7/z0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field public final a:J

.field public final b:Ls8/n;

.field private final c:Ls8/l0;

.field private d:[B


# direct methods
.method public constructor <init>(Ls8/n;Ls8/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lv7/u;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lv7/z0$c;->a:J

    iput-object p1, p0, Lv7/z0$c;->b:Ls8/n;

    new-instance p1, Ls8/l0;

    invoke-direct {p1, p2}, Ls8/l0;-><init>(Ls8/j;)V

    iput-object p1, p0, Lv7/z0$c;->c:Ls8/l0;

    return-void
.end method

.method static synthetic a(Lv7/z0$c;)Ls8/l0;
    .locals 0

    iget-object p0, p0, Lv7/z0$c;->c:Ls8/l0;

    return-object p0
.end method

.method static synthetic d(Lv7/z0$c;)[B
    .locals 0

    iget-object p0, p0, Lv7/z0$c;->d:[B

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 4

    iget-object v0, p0, Lv7/z0$c;->c:Ls8/l0;

    invoke-virtual {v0}, Ls8/l0;->t()V

    :try_start_0
    iget-object v0, p0, Lv7/z0$c;->c:Ls8/l0;

    iget-object v1, p0, Lv7/z0$c;->b:Ls8/n;

    invoke-virtual {v0, v1}, Ls8/l0;->o(Ls8/n;)J

    const/4 v0, 0x0

    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lv7/z0$c;->c:Ls8/l0;

    invoke-virtual {v0}, Ls8/l0;->h()J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, Lv7/z0$c;->d:[B

    if-nez v1, :cond_0

    const/16 v1, 0x400

    new-array v1, v1, [B

    iput-object v1, p0, Lv7/z0$c;->d:[B

    goto :goto_1

    :cond_0
    array-length v2, v1

    if-ne v0, v2, :cond_1

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iput-object v1, p0, Lv7/z0$c;->d:[B

    :cond_1
    :goto_1
    iget-object v1, p0, Lv7/z0$c;->c:Ls8/l0;

    iget-object v2, p0, Lv7/z0$c;->d:[B

    array-length v3, v2

    sub-int/2addr v3, v0

    invoke-virtual {v1, v2, v0, v3}, Ls8/l0;->read([BII)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lv7/z0$c;->c:Ls8/l0;

    invoke-static {v0}, Ls8/m;->a(Ls8/j;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lv7/z0$c;->c:Ls8/l0;

    invoke-static {v1}, Ls8/m;->a(Ls8/j;)V

    throw v0
.end method

.method public c()V
    .locals 0

    return-void
.end method
