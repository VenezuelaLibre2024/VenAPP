.class public abstract Lz7/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz7/k$d;,
        Lz7/k$c;,
        Lz7/k$b;,
        Lz7/k$a;,
        Lz7/k$e;
    }
.end annotation


# instance fields
.field final a:Lz7/i;

.field final b:J

.field final c:J


# direct methods
.method public constructor <init>(Lz7/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/k;->a:Lz7/i;

    iput-wide p2, p0, Lz7/k;->b:J

    iput-wide p4, p0, Lz7/k;->c:J

    return-void
.end method


# virtual methods
.method public a(Lz7/j;)Lz7/i;
    .locals 0

    iget-object p1, p0, Lz7/k;->a:Lz7/i;

    return-object p1
.end method

.method public b()J
    .locals 6

    iget-wide v0, p0, Lz7/k;->c:J

    const-wide/32 v2, 0xf4240

    iget-wide v4, p0, Lz7/k;->b:J

    invoke-static/range {v0 .. v5}, Lt8/r0;->O0(JJJ)J

    move-result-wide v0

    return-wide v0
.end method
