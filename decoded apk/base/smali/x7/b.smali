.class public abstract Lx7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/o;


# instance fields
.field private final b:J

.field private final c:J

.field private d:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lx7/b;->b:J

    iput-wide p3, p0, Lx7/b;->c:J

    invoke-virtual {p0}, Lx7/b;->f()V

    return-void
.end method


# virtual methods
.method protected final c()V
    .locals 4

    iget-wide v0, p0, Lx7/b;->d:J

    iget-wide v2, p0, Lx7/b;->b:J

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    iget-wide v2, p0, Lx7/b;->c:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method protected final d()J
    .locals 2

    iget-wide v0, p0, Lx7/b;->d:J

    return-wide v0
.end method

.method public e()Z
    .locals 4

    iget-wide v0, p0, Lx7/b;->d:J

    iget-wide v2, p0, Lx7/b;->c:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()V
    .locals 4

    iget-wide v0, p0, Lx7/b;->b:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lx7/b;->d:J

    return-void
.end method

.method public next()Z
    .locals 4

    iget-wide v0, p0, Lx7/b;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lx7/b;->d:J

    invoke-virtual {p0}, Lx7/b;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
