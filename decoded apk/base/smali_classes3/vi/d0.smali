.class public final Lvi/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/d0$a;,
        Lvi/d0$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lvi/d0$b;

.field public final c:J

.field public final d:Lvi/n0;

.field public final e:Lvi/n0;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lvi/d0$b;JLvi/n0;Lvi/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvi/d0;->a:Ljava/lang/String;

    const-string p1, "severity"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/d0$b;

    iput-object p1, p0, Lvi/d0;->b:Lvi/d0$b;

    iput-wide p3, p0, Lvi/d0;->c:J

    iput-object p5, p0, Lvi/d0;->d:Lvi/n0;

    iput-object p6, p0, Lvi/d0;->e:Lvi/n0;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lvi/d0$b;JLvi/n0;Lvi/n0;Lvi/c0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lvi/d0;-><init>(Ljava/lang/String;Lvi/d0$b;JLvi/n0;Lvi/n0;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lvi/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lvi/d0;

    iget-object v0, p0, Lvi/d0;->a:Ljava/lang/String;

    iget-object v2, p1, Lvi/d0;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvi/d0;->b:Lvi/d0$b;

    iget-object v2, p1, Lvi/d0;->b:Lvi/d0$b;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lvi/d0;->c:J

    iget-wide v4, p1, Lvi/d0;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lvi/d0;->d:Lvi/n0;

    iget-object v2, p1, Lvi/d0;->d:Lvi/n0;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvi/d0;->e:Lvi/n0;

    iget-object p1, p1, Lvi/d0;->e:Lvi/n0;

    invoke-static {v0, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lvi/d0;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lvi/d0;->b:Lvi/d0$b;

    aput-object v2, v0, v1

    iget-wide v1, p0, Lvi/d0;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    iget-object v2, p0, Lvi/d0;->d:Lvi/n0;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lvi/d0;->e:Lvi/n0;

    aput-object v2, v0, v1

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "description"

    iget-object v2, p0, Lvi/d0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "severity"

    iget-object v2, p0, Lvi/d0;->b:Lvi/d0$b;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "timestampNanos"

    iget-wide v2, p0, Lvi/d0;->c:J

    invoke-virtual {v0, v1, v2, v3}, Leb/i$b;->c(Ljava/lang/String;J)Leb/i$b;

    move-result-object v0

    const-string v1, "channelRef"

    iget-object v2, p0, Lvi/d0;->d:Lvi/n0;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "subchannelRef"

    iget-object v2, p0, Lvi/d0;->e:Lvi/n0;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
