.class final Luj/c$c;
.super Luj/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private c:J


# direct methods
.method constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 2

    invoke-direct {p0, p1}, Luj/e;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Luj/c$c;->c:J

    return-void
.end method


# virtual methods
.method public g()J
    .locals 2

    iget-wide v0, p0, Luj/c$c;->c:J

    return-wide v0
.end method

.method public i(J)V
    .locals 0

    iput-wide p1, p0, Luj/c$c;->c:J

    return-void
.end method
