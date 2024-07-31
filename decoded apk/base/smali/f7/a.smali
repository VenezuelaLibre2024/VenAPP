.class final Lf7/a;
.super Ly6/d;
.source "SourceFile"

# interfaces
.implements Lf7/g;


# direct methods
.method public constructor <init>(JJLv6/s0$a;Z)V
    .locals 8

    iget v5, p5, Lv6/s0$a;->f:I

    iget v6, p5, Lv6/s0$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p6

    invoke-direct/range {v0 .. v7}, Ly6/d;-><init>(JJIIZ)V

    return-void
.end method


# virtual methods
.method public c(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly6/d;->b(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public g()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method
