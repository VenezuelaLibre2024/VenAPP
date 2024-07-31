.class public final Lyl/f$j;
.super Lul/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl/f;-><init>(Lyl/f$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lyl/f;

.field final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lyl/f;J)V
    .locals 0

    iput-object p1, p0, Lyl/f$j;->e:Ljava/lang/String;

    iput-object p2, p0, Lyl/f$j;->f:Lyl/f;

    iput-wide p3, p0, Lyl/f$j;->g:J

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p0, p1, p4, p2, p3}, Lul/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/g;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 8

    iget-object v0, p0, Lyl/f$j;->f:Lyl/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lyl/f$j;->f:Lyl/f;

    invoke-static {v1}, Lyl/f;->j(Lyl/f;)J

    move-result-wide v1

    iget-object v3, p0, Lyl/f$j;->f:Lyl/f;

    invoke-static {v3}, Lyl/f;->i(Lyl/f;)J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lyl/f$j;->f:Lyl/f;

    invoke-static {v1}, Lyl/f;->i(Lyl/f;)J

    move-result-wide v4

    iget-object v1, p0, Lyl/f$j;->f:Lyl/f;

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-static {v1, v4, v5}, Lyl/f;->E(Lyl/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v3

    :goto_0
    monitor-exit v0

    iget-object v0, p0, Lyl/f$j;->f:Lyl/f;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lyl/f;->a(Lyl/f;Ljava/io/IOException;)V

    const-wide/16 v0, -0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v3, v2, v3}, Lyl/f;->A1(ZII)V

    iget-wide v0, p0, Lyl/f$j;->g:J

    :goto_1
    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
